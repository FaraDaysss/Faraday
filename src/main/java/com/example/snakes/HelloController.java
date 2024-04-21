package com.example.snakes;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Objects;

public class HelloController {

    public int turn = 1;
    public int b1_e = 0;
    public int b2_e = 0;
    public int b3_e = 0;
    public int b4_e = 0;
    public int b5_e = 0;
    public int b6_e = 0;
    public int b7_e = 0;
    public int b8_e = 0;
    public int b9_e = 0;

    public String b1Text = "";
    public String b2Text = "";
    public String b3Text = "";
    public String b4Text = "";
    public String b5Text = "";
    public String b6Text = "";
    public String b7Text = "";
    public String b8Text = "";
    public String b9Text = "";

    @FXML
    private Label l1;

    @FXML
    private Button b1;
    public void onb1Click(){
        if (b1_e == 0) {
            if (turn == 1) {
                b1.setText("O");
                turn = 2;
                b1_e = 1;
                l1.setText("Сейчас ходят крестики");
                if (Objects.equals(b2Text, "O") & Objects.equals(b3Text, "O") | Objects.equals(b4Text, "O") & Objects.equals(b7Text, "O") | Objects.equals(b5Text, "O") & Objects.equals(b9Text, "O")) {
                    l1.setText("Нолики победили!");
                    turn = 0;
                }
            } else {
                if (turn == 2) {
                    b1.setText("X");
                    turn = 1;
                    b1_e = 1;
                    l1.setText("Сейчас ходят нолики");
                    if (Objects.equals(b2Text, "X") & Objects.equals(b3Text, "X") | Objects.equals(b4Text, "X") & Objects.equals(b7Text, "X") | Objects.equals(b5Text, "X") & Objects.equals(b9Text, "X")) {
                        l1.setText("Крестики победили!");
                        turn = 0;
                    }
                }
            }
            b1Text = b1.getText();
            if(turn != 0 & !Objects.equals(b1Text, "") & !Objects.equals(b2Text, "") & !Objects.equals(b3Text, "") & !Objects.equals(b4Text, "") & !Objects.equals(b5Text, "") & !Objects.equals(b6Text, "") & !Objects.equals(b7Text, "") & !Objects.equals(b8Text, "") & !Objects.equals(b9Text, "")){
                l1.setText("Ничья. Игра окончена.");
            }
        }
    }

    @FXML
    private Button b2;
    public void onb2Click(){
        if (b2_e == 0) {
            if (turn == 1) {
                b2.setText("O");
                turn = 2;
                b2_e = 1;
                l1.setText("Сейчас ходят крестики");
                if (Objects.equals(b5Text, "O") & Objects.equals(b8Text, "O") | Objects.equals(b3Text, "O") & Objects.equals(b1Text, "O")){
                    l1.setText("Нолики победили!");
                    turn = 0;
                }
            } else {
                if (turn == 2) {
                    b2.setText("X");
                    turn = 1;
                    b2_e = 1;
                    l1.setText("Сейчас ходят нолики");
                    if (Objects.equals(b5Text, "X") & Objects.equals(b8Text, "X") | Objects.equals(b3Text, "X") & Objects.equals(b1Text, "X")) {
                        l1.setText("Крестики победили!");
                        turn = 0;
                    }
                }
            }
            b2Text = b2.getText();
            if(turn != 0 & !Objects.equals(b2Text, "") & !Objects.equals(b3Text, "") & !Objects.equals(b4Text, "") & !Objects.equals(b5Text, "") & !Objects.equals(b6Text, "") & !Objects.equals(b7Text, "") & !Objects.equals(b8Text, "") & !Objects.equals(b9Text, "")){
                l1.setText("Ничья. Игра окончена.");
            }
        }
    }

    @FXML
    private Button b3;
    public void onb3Click(){
        if (b3_e == 0) {
            if (turn == 1) {
                b3.setText("O");
                turn = 2;
                b3_e = 1;
                l1.setText("Сейчас ходят крестики");
                if (Objects.equals(b5Text, "O") & Objects.equals(b7Text, "O") | Objects.equals(b2Text, "O") & Objects.equals(b1Text, "O") | Objects.equals(b6Text, "O") & Objects.equals(b9Text, "O")) {
                    l1.setText("Нолики победили!");
                    turn = 0;
                }
            } else {
                if (turn == 2) {
                    b3.setText("X");
                    turn = 1;
                    b3_e = 1;
                    l1.setText("Сейчас ходят нолики");
                    if (Objects.equals(b5Text, "X") & Objects.equals(b7Text, "X") | Objects.equals(b2Text, "X") & Objects.equals(b1Text, "X") | Objects.equals(b6Text, "X") & Objects.equals(b9Text, "X")) {
                        l1.setText("Крестики победили!");
                        turn = 0;
                    }
                }
            }
            b3Text = b3.getText();
            if(turn != 0 & !Objects.equals(b2Text, "") & !Objects.equals(b3Text, "") & !Objects.equals(b4Text, "") & !Objects.equals(b5Text, "") & !Objects.equals(b6Text, "") & !Objects.equals(b7Text, "") & !Objects.equals(b8Text, "") & !Objects.equals(b9Text, "")){
                l1.setText("Ничья. Игра окончена.");
            }
        }
    }

    @FXML
    private Button b4;
    public void onb4Click(){
        if (b4_e == 0) {
            if (turn == 1) {
                b4.setText("O");
                turn = 2;
                b4_e = 1;
                l1.setText("Сейчас ходят крестики");
                if (Objects.equals(b7Text, "O") & Objects.equals(b1Text, "O") | Objects.equals(b5Text, "O") & Objects.equals(b6Text, "O")) {
                    l1.setText("Нолики победили!");
                    turn = 0;
                }
            } else {
                if (turn == 2) {
                    b4.setText("X");
                    turn = 1;
                    b4_e = 1;
                    l1.setText("Сейчас ходят нолики");
                    if (Objects.equals(b7Text, "X") & Objects.equals(b1Text, "X") | Objects.equals(b5Text, "X") & Objects.equals(b6Text, "X")){
                        l1.setText("Крестики победили!");
                        turn = 0;
                    }
                }
            }
            b4Text = b4.getText();
            if(turn != 0 & !Objects.equals(b2Text, "") & !Objects.equals(b3Text, "") & !Objects.equals(b4Text, "") & !Objects.equals(b5Text, "") & !Objects.equals(b6Text, "") & !Objects.equals(b7Text, "") & !Objects.equals(b8Text, "") & !Objects.equals(b9Text, "")){
                l1.setText("Ничья. Игра окончена.");
            }
        }
    }

    @FXML
    private Button b5;
    public void onb5Click(){
        if (b5_e == 0) {
            if (turn == 1) {
                b5.setText("O");
                turn = 2;
                b5_e = 1;
                l1.setText("Сейчас ходят крестики");
                if (Objects.equals(b1Text, "O") & Objects.equals(b9Text, "O") | Objects.equals(b2Text, "O") & Objects.equals(b8Text, "O")| Objects.equals(b4Text, "O") & Objects.equals(b6Text, "O")| Objects.equals(b3Text, "O") & Objects.equals(b7Text, "O")){
                    l1.setText("Нолики победили!");
                    turn = 0;
                }
            } else {
                if (turn == 2) {
                    b5.setText("X");
                    turn = 1;
                    b5_e = 1;
                    l1.setText("Сейчас ходят нолики");
                    if (Objects.equals(b1Text, "X") & Objects.equals(b9Text, "X") | Objects.equals(b2Text, "X") & Objects.equals(b8Text, "X")| Objects.equals(b4Text, "X") & Objects.equals(b6Text, "X")| Objects.equals(b3Text, "X") & Objects.equals(b7Text, "X")) {
                        l1.setText("Крестики победили!");
                        turn = 0;
                    }
                }
            }
            b5Text = b5.getText();
            if(turn != 0 & !Objects.equals(b2Text, "") & !Objects.equals(b3Text, "") & !Objects.equals(b4Text, "") & !Objects.equals(b5Text, "") & !Objects.equals(b6Text, "") & !Objects.equals(b7Text, "") & !Objects.equals(b8Text, "") & !Objects.equals(b9Text, "")){
                l1.setText("Ничья. Игра окончена.");
            }
        }
    }

    @FXML
    private Button b6;
    public void onb6Click(){
        if (b6_e == 0) {
            if (turn == 1) {
                b6.setText("O");
                turn = 2;
                b6_e = 1;
                l1.setText("Сейчас ходят крестики");
                if (Objects.equals(b9Text, "O") & Objects.equals(b3Text, "O") | Objects.equals(b4Text, "O") & Objects.equals(b5Text, "O")) {
                    l1.setText("Нолики победили!");
                    turn = 0;
                }
            }
            else {
                if (turn == 2) {
                    b6.setText("X");
                    turn = 1;
                    b6_e = 1;
                    l1.setText("Сейчас ходят нолики");
                    if (Objects.equals(b9Text, "X") & Objects.equals(b3Text, "X") | Objects.equals(b4Text, "X") & Objects.equals(b5Text, "X")) {
                        l1.setText("Крестики победили!");
                        turn = 0;
                    }
                }
            }
            b6Text = b6.getText();
            if(turn != 0 & !Objects.equals(b2Text, "") & !Objects.equals(b3Text, "") & !Objects.equals(b4Text, "") & !Objects.equals(b5Text, "") & !Objects.equals(b6Text, "") & !Objects.equals(b7Text, "") & !Objects.equals(b8Text, "") & !Objects.equals(b9Text, "")){
                l1.setText("Ничья. Игра окончена.");
            }
        }
    }

    @FXML
    private Button b7;
    public void onb7Click(){
        if (b7_e == 0) {
            if (turn == 1) {
                b7.setText("O");
                turn = 2;
                b7_e = 1;
                l1.setText("Сейчас ходят крестики");
                if (Objects.equals(b1Text, "O") & Objects.equals(b4Text, "O") | Objects.equals(b8Text, "O") & Objects.equals(b9Text, "O")| Objects.equals(b5Text, "O") & Objects.equals(b3Text, "O")) {
                    l1.setText("Нолики победили!");
                    turn = 0;
                }
            }
            else {
                if (turn == 2) {
                    b7.setText("X");
                    turn = 1;
                    b7_e = 1;
                    l1.setText("Сейчас ходят нолики");
                    if (Objects.equals(b1Text, "X") & Objects.equals(b4Text, "X") | Objects.equals(b8Text, "X") & Objects.equals(b9Text, "X")| Objects.equals(b5Text, "X") & Objects.equals(b3Text, "X")) {
                        l1.setText("Крестики победили!");
                        turn = 0;
                    }
                }
            }
            b7Text = b7.getText();
            if(turn != 0 & !Objects.equals(b2Text, "") & !Objects.equals(b3Text, "") & !Objects.equals(b4Text, "") & !Objects.equals(b5Text, "") & !Objects.equals(b6Text, "") & !Objects.equals(b7Text, "") & !Objects.equals(b8Text, "") & !Objects.equals(b9Text, "")){
                l1.setText("Ничья. Игра окончена.");
            }
        }

    }

    @FXML
    private Button b8;
    public void onb8Click(){
        if (b8_e == 0) {
            if (turn == 1) {
                b8.setText("O");
                turn = 2;
                b8_e = 1;
                l1.setText("Сейчас ходят крестики");
                if (Objects.equals(b2Text, "O") & Objects.equals(b5Text, "O") | Objects.equals(b7Text, "O") & Objects.equals(b9Text, "O")) {
                    l1.setText("Нолики победили!");
                    turn = 0;
                }
            } else {
                if (turn == 2) {
                    b8.setText("X");
                    turn = 1;
                    b8_e = 1;
                    l1.setText("Сейчас ходят нолики");
                    if (Objects.equals(b2Text, "X") & Objects.equals(b5Text, "X") | Objects.equals(b7Text, "X") & Objects.equals(b9Text, "X")) {
                        l1.setText("Крестики победили!");
                        turn = 0;
                    }
                }
            }
            b8Text = b8.getText();
            if(turn != 0 & !Objects.equals(b2Text, "") & !Objects.equals(b3Text, "") & !Objects.equals(b4Text, "") & !Objects.equals(b5Text, "") & !Objects.equals(b6Text, "") & !Objects.equals(b7Text, "") & !Objects.equals(b8Text, "") & !Objects.equals(b9Text, "")){
                l1.setText("Ничья. Игра окончена.");
            }
        }
    }

    @FXML
    private Button b9;
    public void onb9Click(){
        if (b9_e == 0) {
            if (turn == 1) {
                b9.setText("O");
                turn = 2;
                b9_e = 1;
                l1.setText("Сейчас ходят крестики");
                if (Objects.equals(b1Text, "O") & Objects.equals(b5Text, "O") | Objects.equals(b7Text, "O") & Objects.equals(b8Text, "O")| Objects.equals(b3Text, "O") & Objects.equals(b6Text, "O")) {
                    l1.setText("Нолики победили!");
                    turn = 0;
                }
            } else {
                if (turn == 2) {
                    b9.setText("X");
                    turn = 1;
                    b9_e = 1;
                    l1.setText("Сейчас ходят нолики");
                    if (Objects.equals(b1Text, "X") & Objects.equals(b5Text, "X") | Objects.equals(b7Text, "X") & Objects.equals(b8Text, "X")| Objects.equals(b3Text, "X") & Objects.equals(b6Text, "X")){
                        l1.setText("Крестики победили!");
                        turn = 0;
                    }
                }
            }
            b9Text = b9.getText();
            if(turn != 0 & !Objects.equals(b2Text, "") & !Objects.equals(b3Text, "") & !Objects.equals(b4Text, "") & !Objects.equals(b5Text, "") & !Objects.equals(b6Text, "") & !Objects.equals(b7Text, "") & !Objects.equals(b8Text, "") & !Objects.equals(b9Text, "")){
                l1.setText("Ничья. Игра окончена.");
            }
        }
    }
}

