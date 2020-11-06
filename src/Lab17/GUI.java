package Lab17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI {
    private JFrame mainFrame = new JFrame("Сапёр");
    private JPanel[][] cellPanels;

    public GUI(int size, Cell[][] gameBoard, int bombs) {
        cellPanels = new JPanel[size][size];

        int bombsLeft = bombs;

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++){
                cellPanels[i][j] = new JPanel();
                cellPanels[i][j].add(new JLabel(Shaders.UNKNOWN.image));
                cellPanels[i][j].addMouseListener(new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        boolean check = false;

                        cellPanels[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].removeAll();

                        if(e.getButton()==MouseEvent.BUTTON3 && !gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].isMarked()) {
                            cellPanels[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].add(new JLabel(Shaders.FLAG.image));
                            gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].setMarked(true);
                        }

                        else if (e.getButton()==MouseEvent.BUTTON3 && gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].isMarked()) {
                            cellPanels[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].add(new JLabel(Shaders.UNKNOWN.image));
                            gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].setMarked(false);
                        }

                        else {
                            if (gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].getState() == 0)
                                cellPanels[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].add(new JLabel(Shaders.EMPTY.image));
                            else if (gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].getState() == -1) {
                                cellPanels[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].add(new JLabel(Shaders.BOMB.image));
                                check = true;
                            } else if (gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].getState() == 1)
                                cellPanels[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].add(new JLabel(Shaders.ONE.image));
                            else if (gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].getState() == 2)
                                cellPanels[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].add(new JLabel(Shaders.TWO.image));
                            else if (gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].getState() == 3)
                                cellPanels[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].add(new JLabel(Shaders.THREE.image));
                            else if (gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].getState() == 4)
                                cellPanels[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].add(new JLabel(Shaders.FOUR.image));
                            else if (gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].getState() == 5)
                                cellPanels[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].add(new JLabel(Shaders.FIVE.image));
                            else if (gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].getState() == 6)
                                cellPanels[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].add(new JLabel(Shaders.SIX.image));
                            else if (gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].getState() == 7)
                                cellPanels[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].add(new JLabel(Shaders.SEVEN.image));
                            else if (gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].getState() == 8)
                                cellPanels[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].add(new JLabel(Shaders.EIGHT.image));

                            gameBoard[e.getLocationOnScreen().x / 60][(e.getLocationOnScreen().y - 40) / 60].setHidden(false);
                        }

                        cellPanels[e.getLocationOnScreen().x/60][(e.getLocationOnScreen().y - 40)/60].repaint();
                        mainFrame.setState(JFrame.ICONIFIED);
                        mainFrame.setExtendedState(JFrame.NORMAL);

                        if (check){
                            showAll(size, gameBoard);
                            JOptionPane.showMessageDialog(null, "Вы проиграли");
                            mainFrame.setVisible(false);
                            mainFrame.dispose();
                        }

                        if (bombs == correctFlags(size, gameBoard)){
                            showAll(size, gameBoard);
                            JOptionPane.showMessageDialog(null, "Вы победили");
                            mainFrame.setVisible(false);
                            mainFrame.dispose();
                        }
                    }
                });
            }

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(size * 60 + 15, size * 60 + 44);
        mainFrame.setResizable(false);
        mainFrame.setLayout(null);

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                mainFrame.add(cellPanels[i][j]);
                cellPanels[i][j].setBounds(i * 60, j * 60, 60, 65);
            }

        mainFrame.setVisible(true);
    }

    private int correctFlags(int size, Cell[][] gameBoard){
        int counter = 0;
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (gameBoard[i][j].getState() == -1 && gameBoard[i][j].isMarked())
                    counter++;
        return counter;
    }

    private void showAll(int size, Cell[][] gameBoard){
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++){
                cellPanels[i][j].removeAll();

                if (gameBoard[i][j].getState() == 0)
                    cellPanels[i][j].add(new JLabel(Shaders.EMPTY.image));
                else if (gameBoard[i][j].getState() == -1)
                    cellPanels[i][j].add(new JLabel(Shaders.BOMB.image));
                else if (gameBoard[i][j].getState() == 1)
                    cellPanels[i][j].add(new JLabel(Shaders.ONE.image));
                else if (gameBoard[i][j].getState() == 2)
                    cellPanels[i][j].add(new JLabel(Shaders.TWO.image));
                else if (gameBoard[i][j].getState() == 3)
                    cellPanels[i][j].add(new JLabel(Shaders.THREE.image));
                else if (gameBoard[i][j].getState() == 4)
                    cellPanels[i][j].add(new JLabel(Shaders.FOUR.image));
                else if (gameBoard[i][j].getState() == 5)
                    cellPanels[i][j].add(new JLabel(Shaders.FIVE.image));
                else if (gameBoard[i][j].getState() == 6)
                    cellPanels[i][j].add(new JLabel(Shaders.SIX.image));
                else if (gameBoard[i][j].getState() == 7)
                    cellPanels[i][j].add(new JLabel(Shaders.SEVEN.image));
                else if (gameBoard[i][j].getState() == 8)
                    cellPanels[i][j].add(new JLabel(Shaders.EIGHT.image));

                cellPanels[i][j].repaint();
            }

        mainFrame.setState(JFrame.ICONIFIED);
        mainFrame.setExtendedState(JFrame.NORMAL);
    }
}