package com.example.myapplication.ui;

import com.example.myapplication.R;

public class CalculatorModel {

    int firstArg;
    int secondArg;

    StringBuilder inputStr = new StringBuilder();   // почему сделал это ?

    private int actionSelected; // переменная для хранения действия которое выбрал польз-ль

    private State state;

    private enum State {        // ENUM ЭТО ТИП ПЕРЕЧИСЛЕНИЙ ( В ДАННОМ ТУТ ДЕЙСТВИЯ)

        firstArgInput,
        secondArgInput,
        resultShow
    }

    public CalculatorModel() {    // создал конструктор инициализации полей
        state = State.firstArgInput;
    }

    public void onNumPressed(int buttonId) {   //реакция на нажатие кнопки с цифрой

        if (state == State.resultShow){
            state = State.firstArgInput;
        }


if (inputStr.length() < 10){
    switch (buttonId){
        case R.id.zero:
            if (inputStr.length() != 0) {
                inputStr.append("0");
            }break;
        case R.id.one:
            inputStr.append("1");
            break;
        case R.id.two:
            inputStr.append("2");
            break;
        case R.id.three:
            inputStr.append("3");
            break;
        case R.id.four:
            inputStr.append("4");
            break;
        case R.id.five:
            inputStr.append("5");
            break;
        case R.id.six:
            inputStr.append("6");
            break;
        case R.id.seven:
            inputStr.append("7");
            break;
        case R.id.eight:
            inputStr.append("8");
            break;
        case R.id.nine:
            inputStr.append("9");
            break;
    }
}
    }

    public void onActionPressed(int actionId) {   //реакция на нажатие кнопки с действием
        if (actionId == R.id.result && state == State.secondArgInput && inputStr.length() > 0) {
            secondArg = Integer.parseInt(inputStr.toString());
            state = State.resultShow;
            inputStr.setLength(0);

switch (actionId){
    case R.id.sum:
        inputStr.append(firstArg + secondArg);
        actionSelected = R.id.sum;
        break;
    case R.id.min:
        inputStr.append(firstArg + secondArg);
        actionSelected = R.id.min;
        break;
    case R.id.division:
        inputStr.append(firstArg + secondArg);
        actionSelected = R.id.division;
        break;
    case R.id.cha:
        inputStr.append(firstArg + secondArg);
        actionSelected = R.id.cha;
        break;
    case R.id.multiply:
        inputStr.append(firstArg + secondArg);
        actionSelected = R.id.multiply;
        break;
    case R.id.del:
        inputStr.append(firstArg + secondArg);
        actionSelected = R.id.del;
        break;
    case R.id.result:
        inputStr.append(firstArg + secondArg);
        actionSelected = R.id.result;
        break;
}
    } else if (inputStr.length() > 0 && state == State.firstArgInput && actionId != R.id.result) {
            firstArg = Integer.parseInt(inputStr.toString());
            state = State.secondArgInput;
            inputStr.setLength(0);
        }}

    /**
     * Метод который позволяет отобразить текст в текстовом поле
     */
    public String getText() {
        return inputStr.toString();   // получаем строку StringBuilder стрингбилдера и возвращаем ее
                                     // Для чего это ?

    }
}