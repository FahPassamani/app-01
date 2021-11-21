package com.example.ex01_transportadora_abc;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextDistancia, editTextPrecoCombustivel;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Acessar componentes do layout
        editTextDistancia = findViewById(R.id.editTextDistancia);
        editTextPrecoCombustivel = findViewById(R.id.editTextPrecoCombustivel);
        txtResultado = findViewById(R.id.txtResultado);

    }

    public void calculoDeCreditos(View view) {
        if (editTextDistancia.getText().toString().equals("")) {
            txtResultado.setText("Campo vazio, informe a distancia!");
        }
        else if(Double.parseDouble(editTextDistancia.getText().toString()) <= 0) {
            txtResultado.setText("Informe um valor diferente de zero!");
        }
        else if (editTextPrecoCombustivel.getText().toString().equals("")){
            txtResultado.setText("Campo vazio, informe o preço do combustível!");
        }
        else{
            double distancia = Double.parseDouble(editTextDistancia.getText().toString());
            double precoCombustivel = Double.parseDouble(editTextPrecoCombustivel.getText().toString());

            calcularCusto(distancia, precoCombustivel);

            double custoViagem = calcularCusto(distancia, precoCombustivel);

            txtResultado.setText(String.format("Crédito necessário - R$:%.2f", custoViagem));

        }
    }

    public static Double calcularCusto(double distancia, double precoCombustivel) {
        double rendimento = (distancia * 2 / 10) * 1.1; // Viagem ida e volta / média de consumo Ducato Cargo + 10% de margem de segurança.
        double custoViagem = (precoCombustivel * rendimento);
        return custoViagem;
    }
}