package com.projetc.domingos.militaryarms;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by jailton.domingos on 14/03/2018.
 */


public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Sempre fazer um novo Button para cada botão da tela
        //ao invés de instanciar uma classe button generica e chamar os metodos onClick() apontando o nome String do button.
        Button buttonVoltar = findViewById(R.id.buttonVoltar);
        buttonVoltar.setOnClickListener(this);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonVoltar:
                
                //Comentario: Este é um método para fazer o app retornar a última view chamado,
                //porem o metodo finish() acredito ser mais perfomatico e garantido.
                //Intent intentVoltar = new Intent(SecondActivity.this, MainActivity.class);
                //startActivity(intentVoltar);
                finish();
                break;
        }
    }

}
