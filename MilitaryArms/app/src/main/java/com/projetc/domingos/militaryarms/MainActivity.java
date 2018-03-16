package com.projetc.domingos.militaryarms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    //public static usuario = "JAILTON";
    //public static senha = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonLogin    = findViewById(R.id.buttonLogin);
        final Button buttonCancel   = findViewById(R.id.buttonCancel);
        final EditText formLogin    = findViewById(R.id.editTextLogin);
        final EditText formSenha    = findViewById(R.id.editTextSenha);
        //final EditText formValida   = findViewById(R.id.editTextValida);

        final Intent intentLogin = new Intent(MainActivity.this, SecondActivity.class);
        final Intent intentErro;
        intentErro = new Intent(MainActivity.this, ThirdActivity.class);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (formLogin.getText().toString().equals("bacon") && formSenha.getText().toString().equals("123")) {
                    startActivity(intentLogin);

                } else {
                    startActivity(intentErro);

                }
            }
        });
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();

            }
        });


    }
}