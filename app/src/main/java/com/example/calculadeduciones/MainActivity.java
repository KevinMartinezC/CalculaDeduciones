package com.example.calculadeduciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.calculadeduciones.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private EditText et1;
    private EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        et1 = binding.et1;
        et2 = binding.et2;


    }

    //Este método se ejecutará cuando se presione el botón
    public void calcular(View view) {
        Intent i = new Intent(this, ResultadoDeducciones.class);
        i.putExtra("datoName", et1.getText().toString());
        i.putExtra("horas", et2.getText().toString());
        startActivity(i);

    }
}