package com.luminuses.androlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.luminuses.toastlibrary.ToastMessage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastMessage.s(getApplicationContext(), "hiiii222");
    }
}