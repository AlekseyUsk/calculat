package com.example.myapplication.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    private CalculatorModel calculator;  // создал сылочную переменную на класс
    //поле для ввода :
    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button zero = findViewById(R.id.zero);
        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);

        Button sum = findViewById(R.id.sum);            //сложение
        Button division = findViewById(R.id.division);  //деление
        Button multiply = findViewById(R.id.multiply);  //умножение
        Button result = findViewById(R.id.result);      // результат
        Button cha = findViewById(R.id.cha);            //дробные " , "
        Button min = findViewById(R.id.min);            //вычитание
        Button del = findViewById(R.id.del);            //стереть

        int[] ButtonIds = new int[]{
                R.id.zero,
                R.id.one,
                R.id.two,
                R.id.three,
                R.id.four,
                R.id.five,
                R.id.six,
                R.id.seven,
                R.id.eight,
                R.id.nine
        };
        int[] actionIds = new int[]{
                R.id.sum,
                R.id.min,
                R.id.multiply,
                R.id.division,
                R.id.cha,
                R.id.del,
                R.id.result,
        };

        text = findViewById(R.id.text); // проинициализировал текстовое поле


        /**
         * ПЕРЕДАЧА СОБЫТИЙ ВНУТРЬ КАЛЬКУЛЯТОРА*/

        calculator = new CalculatorModel(); // непонял зачем создал опять calculator? сверху есть же
        // создаю обработчики событий для разных кнопок :
        // numberButtonClicklistener - для кнопок с номерами
        // actionButtonOnClickListener - для кнопок с арифметическими действиями

        View.OnClickListener numberButtonClicklistener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.onNumPressed(view.getId()); // при нажатии передаем id нажатой кнопки
                // в calculator
                text.setText(calculator.getText());  // отображение в текстовом поле
            }
        };
        View.OnClickListener actionButtonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator.onActionPressed(view.getId());
            }
        };
        // тут массиву кнопок циклом прогоняем и каждую кнопку я нахожу по id
        // и устанавливаю на нее обработчик который будет вызыватся при нажатии
        // будет вызываться эта функция calculator.onNumPressed(view.getId())
        // куда попадет этот Id

        for (int i = 0; i < ButtonIds.length; i++) {
            findViewById(ButtonIds[i]).setOnClickListener(numberButtonClicklistener);
        }
        for (int i = 0; i < actionIds.length; i++) {
            findViewById(actionIds[i]).setOnClickListener(actionButtonOnClickListener);
        }

    }
}
