package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        Button result = findViewById(R.id.result);
        Button cha = findViewById(R.id.cha);            //дробные " , "
        Button min = findViewById(R.id.min);            //вычитание
    }
}
