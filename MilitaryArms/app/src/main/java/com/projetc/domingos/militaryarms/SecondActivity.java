package com.projetc.domingos.militaryarms;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by jailton.domingos on 14/03/2018.
 */


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonVoltar:
                Intent intentVoltar = new Intent(this, MainActivity.class);
                startActivity(intentVoltar);
                break;
        }
    }

}