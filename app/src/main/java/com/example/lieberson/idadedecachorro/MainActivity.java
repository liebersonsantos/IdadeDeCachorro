package com.example.lieberson.idadedecachorro;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = findViewById(R.id.caixaTextoId);
        botaoIdade = findViewById(R.id.botaoIdadeId);
        resultadoIdade = findViewById(R.id.resultadoIdadeId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Recuperando o que fi digitado
                String textoDigitado = caixaTexto.getText().toString();

                if (textoDigitado.isEmpty()){
                    //Se textoDigitado estiver vazio(mensagem)
                    resultadoIdade.setText("Nenhum número Digitado!!");
                }else {
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int valorResultadoFinal = valorDigitado * 7;

                    resultadoIdade.setText("A idade do cachorro em anos humanos são: " + valorResultadoFinal + "anos.");
                }

            }
        });

    }
}
