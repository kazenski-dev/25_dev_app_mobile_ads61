package com.cesusc.calculadora_imc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtResultado;
    private EditText editPeso;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);

    }

    @SuppressLint("SetTextI18n")
    public void calcularIMC(View view) {
        double peso = Double.parseDouble(editPeso.getText().toString());
        Double altura = Double.parseDouble(editAltura.getText().toString());
        double resultado = peso / (altura * altura);

        if (resultado < 19) {
            txtResultado.setText("Abaixo do peso");

        } else if (resultado >= 19 && resultado < 25) {
            txtResultado.setText("Peso normal");

        } else if (resultado >= 25 && resultado < 30) {
            txtResultado.setText("Sobrepeso");

        } else if (resultado >= 30 && resultado < 40) {
            txtResultado.setText("Acima do peso 1");

        } else {
            txtResultado.setText("Obesidade morbida");

        }
    }
}