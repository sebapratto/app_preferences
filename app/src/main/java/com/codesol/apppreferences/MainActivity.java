package com.codesol.apppreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValue = findViewById(R.id.etPrefer);
        SharedPreferences preferencias = getSharedPreferences("data", Context.MODE_PRIVATE);
        etValue.setText(preferencias.getString("value",""));
    }



}