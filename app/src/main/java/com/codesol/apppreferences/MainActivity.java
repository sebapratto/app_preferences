package com.codesol.apppreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValue = findViewById(R.id.etPrefer);
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        etValue.setText(preferencias.getString("valor",""));
    }

    public void Guardar(View view){
        SharedPreferences prefe = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editando = prefe.edit();
        editando.putString("valor",etValue.getText().toString());
        editando.apply();
        Toast.makeText(this, "Guardado exitosamente...", Toast.LENGTH_SHORT).show();
    }

}