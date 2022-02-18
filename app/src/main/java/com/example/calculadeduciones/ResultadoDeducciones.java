package com.example.calculadeduciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.calculadeduciones.databinding.ActivityMainBinding;
import com.example.calculadeduciones.databinding.ActivityResultadoDeduccionesBinding;

public class ResultadoDeducciones extends AppCompatActivity {
    private ActivityResultadoDeduccionesBinding binding;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultadoDeduccionesBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        tv1 = binding.tv1;
        tv2 = binding.tv2;
        tv3 = binding.tv3;
        tv4 = binding.tv4;
        tv5 = binding.tv5;
        tv6 = binding.tv6;
        double precioHoras = 8.50;

        String dato = getIntent().getStringExtra("datoName");
        tv1.setText("Hola" + dato);
        String horasTrabajadas = getIntent().getStringExtra("horas");
        int horasint = Integer.parseInt(horasTrabajadas);
        double sueldo = horasint * precioHoras;
        tv6.setText("Sueldo: " + sueldo);
        double isss = sueldo * 0.02;
        tv2.setText("ISSS: " + isss);
        double AFP = sueldo * 0.03;
        tv3.setText("AFP: " + AFP);
        double renta = sueldo * 0.04;
        tv4.setText("Renta: " + renta);
        double totalDesc = (isss + AFP + renta);
        double sueldoneto = sueldo - totalDesc;
        tv5.setText("Sueldo Neto: " + sueldoneto);


    }

    public void Regresar(View view) {
        Intent j = new Intent(this, MainActivity.class);
        startActivity(j);
    }


}