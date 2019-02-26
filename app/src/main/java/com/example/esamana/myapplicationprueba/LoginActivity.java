package com.example.esamana.myapplicationprueba;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.esamana.myapplicationprueba.View.ContainerActivity;
import com.example.esamana.myapplicationprueba.View.CreateAccountActivity;


public class LoginActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

public void goCreateAccount(View v){

    Intent i = new Intent(this, CreateAccountActivity.class);
   startActivity(i);

}

public void actionLogin(View v){

    Intent i = new Intent(this, ContainerActivity.class);
    startActivity(i);

}

  }



