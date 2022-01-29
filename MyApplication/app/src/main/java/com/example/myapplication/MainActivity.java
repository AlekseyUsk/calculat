package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CalculatorModel calculator;
    EditText edit_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text_result = findViewById(R.id.text_result); // результат на экране
        EditText edit_number = findViewById(R.id.edit_number); // ввод на экран

        Button one = findViewById(R.id.one);
        Button twoo = findViewById(R.id.twoo);
        Button three = findViewById(R.id.three);
        Button division = findViewById(R.id.division);  //деление
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button multiply = findViewById(R.id.multiply);  //умножение
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        Button sum = findViewById(R.id.sum);            //сложение
        Button zero = findViewById(R.id.zero);
        Button result = findViewById(R.id.result);      // результат
        Button cha = findViewById(R.id.cha);            //дробные " , "
        Button min = findViewById(R.id.min);            //вычитание
        Button del = findViewById(R.id.del);            //стереть

        int[] numberIds = new int[]{
                R.id.zero,
                R.id.one,
                R.id.twoo,
                R.id.three,
                R.id.four,
                R.id.five,
                R.id.six,
                R.id.seven,
                R.id.eight,
                R.id.nine
        };
        int[] actionsIds = new int[]{
                R.id.sum,
                R.id.min,
                R.id.multiply,
                R.id.division,
                R.id.cha,
                R.id.del
        };
    }
}
// думал как то привязать массив кнопок с id numberIds к обекту,который будет вызываться
//при нажатии пользователем на кнопку ,аналогично и для второго массива с действием