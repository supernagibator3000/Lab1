//package Lab8;
//
//import javax.swing.*;
//
//public class Main extends JFrame {
//    int width = 500, height = 500;
//    JPanel pnl = new JPanel();
//    public Main(){
//        setTitle("Создание фигур");
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(700, 500);
//
//        JMenuBar menuBar = new JMenuBar();
//        menuBar.add(createExerciseMenu());
//
//        setJMenuBar(menuBar);
//
//        setResizable(true);
//        setVisible(true);
//    }
//
//    public JMenu createExerciseMenu(){
//        JMenu menuExercises = new JMenu("Задания");
//
//        JRadioButtonMenuItem exercise_1 = new JRadioButtonMenuItem("Задача 1");
//        JRadioButtonMenuItem exercise_2 = new JRadioButtonMenuItem("Задача 2");
//        JRadioButtonMenuItem exercise_3 = new JRadioButtonMenuItem("Задача 3");
//
//        ButtonGroup exercises = new ButtonGroup();
//
//        exercises.add(exercise_1);
//        exercises.add(exercise_2);
//        exercises.add(exercise_3);
//
//        menuExercises.add(exercise_1);
//        menuExercises.add(exercise_2);
//        menuExercises.add(exercise_3);
//
//        exercise_1.addActionListener(e->);
//        exercise_2.addActionListener(e->);
//        exercise_3.addActionListener(e->);
//
//        return menuExercises;
//    }
//
//    public static void main(String[] args) {
//        new Main();
//    }
//}
