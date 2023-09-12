package com.juandelgado2.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

     int cedula;
     String nombre, fechaNacimiento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent enviarDatos = new Intent(MainActivity.this, Resultados.class);
        // datos a enviar
        enviarDatos.putExtra("nombre", nombre);
        enviarDatos.putExtra("cedula", cedula);
        enviarDatos.putExtra("fechaNacimiento", fechaNacimiento);
        startActivity(enviarDatos);
    }
}