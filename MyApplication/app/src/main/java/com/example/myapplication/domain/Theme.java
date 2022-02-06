package com.example.myapplication.domain;

import androidx.annotation.StyleRes;

import com.example.myapplication.R;

public enum Theme {

    @StyleRes
    private int style;

    private String key;

    Theme(int style, String key) {
        this.style = style;
        this.key = key;
    }
}
