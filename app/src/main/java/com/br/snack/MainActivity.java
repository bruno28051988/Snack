package com.br.snack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnAbrirSnack, btnAbrirToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbrirSnack = findViewById(R.id.btnSnack);
        btnAbrirToast = findViewById(R.id.btnTost);

        btnAbrirSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snack.make é usado para fazer a snack
                //Trabalhamos com 3 parâmetros
                // - aonde ele vai aparecer
                // - qual é o texto que vai mostrar
                // - duração (LENGHT_SHORT, LENGHT_LONG OU LENGHT_INDEFINITE)
                Snackbar.make(
                        view,
                        "Sua mensagem aqui...",
                        Snackbar.LENGTH_INDEFINITE

                        //setAction serve para colocarmos um botão para fechar o Snack
                        //Trabalhamos com 2 parâmetros
                        // - Text - o texto que ela vai apresentar
                        // - setOnClickListener, pois se trata de um botão
                ).setAction("Fechar", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //posso apagar esse texto que não vai modificar nada, mas é bom ter pra saber
                        btnAbrirSnack.setText("Snack Fechada");
                    }
                }).show();
            }
        });


        btnAbrirToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                       getApplicationContext(),
                       "Tost Criado",
                        Toast.LENGTH_LONG
                ).show();
            }
        });

    }
}