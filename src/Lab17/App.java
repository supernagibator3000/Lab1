package Lab17;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class App {
    private int gameBoardSize = 10;
    private int bombsNumber = 10;
    private Cell[][] gameBoard = new Cell[gameBoardSize][gameBoardSize];

    public  App(){
        gameBoardGeneration();
        new GUI(gameBoardSize, gameBoard, bombsNumber);
    }

    private void gameBoardGeneration(){
        double bomb = 0;
        int bombs = bombsNumber;

        for (int i = 0; i < gameBoardSize; i++)
            for (int j = 0; j < gameBoardSize; j++) {
                gameBoard[i][j] = new Cell(i, j, bomb);

                bomb = 0;
                if (bombs > 0)
                    bomb = Math.random();
                if (bomb >= 0.5)
                    bombs--;
            }

        int x, y;

        for (int i = 0; i < gameBoardSize; i++)
            for (int j = 0; j < gameBoardSize; j++) {
                bombs = 0;

                if (gameBoard[i][j].getState() == 0){

                    if (i == 0 && j == 0) {
                        for (x = i; x <= i + 1; x++)
                            for (y = j; y <= j + 1; y++)
                                if (gameBoard[x][y].getState() == -1)
                                    bombs++;
                    }

                    else if (i == 0 && j == gameBoardSize - 1) {
                        for (x = i; x <= i + 1; x++)
                            for (y = j - 1; y <= j; y++)
                                if (gameBoard[x][y].getState() == -1)
                                    bombs++;
                    }

                    else if (i == gameBoardSize - 1 && j == 0) {
                        for (x = i - 1; x <= i; x++)
                            for (y = j; y <= j + 1; y++)
                                if (gameBoard[x][y].getState() == -1)
                                    bombs++;
                    }

                    else if (i == gameBoardSize - 1 && j == gameBoardSize - 1) {
                        for (x = i - 1; x <= i; x++)
                            for (y = j - 1; y <= j; y++)
                                if (gameBoard[x][y].getState() == -1)
                                    bombs++;
                    }


                    else if (i == 0 && j != 0 && j != gameBoardSize - 1) {
                        for (x = i; x <= i + 1; x++)
                            for (y = j - 1; y <= j + 1; y++)
                                if (gameBoard[x][y].getState() == -1)
                                    bombs++;
                    }

                    else if (j == 0 && i != 0 && i != gameBoardSize - 1) {
                        for (x = i - 1; x <= i + 1; x++)
                            for (y = j; y <= j + 1; y++)
                                if (gameBoard[x][y].getState() == -1)
                                    bombs++;
                    }

                    else if (i == gameBoardSize - 1 && j != 0 && j != gameBoardSize - 1) {
                        for (x = i - 1; x <= i; x++)
                            for (y = j - 1; y <= j + 1; y++)
                                if (gameBoard[x][y].getState() == -1)
                                    bombs++;
                    }

                    else if (j == gameBoardSize - 1 && i != 0 && i != gameBoardSize - 1) {
                        for (x = i - 1; x <= i + 1; x++)
                            for (y = j - 1; y <= j; y++)
                                if (gameBoard[x][y].getState() == -1)
                                    bombs++;
                    }


                    else{
                        for (x = i - 1; x <= i + 1; x++)
                            for (y = j - 1; y <= j + 1; y++)
                                if (gameBoard[x][y].getState() == -1)
                                    bombs++;
                    }
                }
                gameBoard[i][j].setState(bombs);
            }
    }
}
