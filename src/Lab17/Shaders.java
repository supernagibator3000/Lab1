package Lab17;

import javax.swing.*;

public enum Shaders {
    FLAG("C:/Users/Владимир/Desktop/Универ/3 семестр/Разработка на жабе/Labs/src/Lab17/Pictures/MarkedCell.png"),
    EMPTY("C:/Users/Владимир/Desktop/Универ/3 семестр/Разработка на жабе/Labs/src/Lab17/Pictures/EmptyCell.png"),
    UNKNOWN("C:/Users/Владимир/Desktop/Универ/3 семестр/Разработка на жабе/Labs/src/Lab17/Pictures/UnknownCell.png"),
    BOMB("C:/Users/Владимир/Desktop/Универ/3 семестр/Разработка на жабе/Labs/src/Lab17/Pictures/Bomb.png"),
    ONE("C:/Users/Владимир/Desktop/Универ/3 семестр/Разработка на жабе/Labs/src/Lab17/Pictures/1BombCell.png"),
    TWO("C:/Users/Владимир/Desktop/Универ/3 семестр/Разработка на жабе/Labs/src/Lab17/Pictures/2BombCell.png"),
    THREE("C:/Users/Владимир/Desktop/Универ/3 семестр/Разработка на жабе/Labs/src/Lab17/Pictures/3BombCell.png"),
    FOUR("C:/Users/Владимир/Desktop/Универ/3 семестр/Разработка на жабе/Labs/src/Lab17/Pictures/4BombCell.png"),
    FIVE("C:/Users/Владимир/Desktop/Универ/3 семестр/Разработка на жабе/Labs/src/Lab17/Pictures/5BombCell.png"),
    SIX("C:/Users/Владимир/Desktop/Универ/3 семестр/Разработка на жабе/Labs/src/Lab17/Pictures/6BombCell.png"),
    SEVEN("C:/Users/Владимир/Desktop/Универ/3 семестр/Разработка на жабе/Labs/src/Lab17/Pictures/7BombCell.png"),
    EIGHT("C:/Users/Владимир/Desktop/Универ/3 семестр/Разработка на жабе/Labs/src/Lab17/Pictures/8BombCell.png");

    public ImageIcon image;

    Shaders(String path){
        image = new ImageIcon(path);
    }
}
