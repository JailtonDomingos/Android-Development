package com.projetc.domingos.militaryarms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonLogin:
                final EditText formLogin    = findViewById(R.id.editTextLogin);
                final EditText formSenha    = findViewById(R.id.editTextSenha);
                if (formLogin.getText().toString().equals("bacon") && formSenha.getText().toString().equals("123")) {
                    Intent intentLogin    = new Intent(this, SecondActivity.class);
                    startActivity(intentLogin);

                } else {
                    //String texto = R.string.wrong_password;
                    Toast.makeText(this, R.string.invalid_password, Toast.LENGTH_LONG);

                }
                break;
            case R.id.buttonCancel:
                 MainActivity.this.finish();
                break;

        }
    }
}