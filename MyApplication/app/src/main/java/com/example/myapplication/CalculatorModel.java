package com.example.myapplication;

public class CalculatorModel {

int FirstArg;
int secondArg;

StringBuilder inputStr = new StringBuilder();   // почему сделал это ?

    private State state;

    private enum State {                        // что значит - enum ?
        FirstArgInput,
        secondArgInput,
        resultShow
    }

    public CalculatorModel() {    // создал конструктор инициализации полей
        state = State.FirstArgInput;
    }
    public void onNumPressed(int buttonId){   //реакция на нажатие кнопки с цифрой

    }
    public void onActionPressed(int actionId){   //реакция на нажатие кнопки с действием

    }
}