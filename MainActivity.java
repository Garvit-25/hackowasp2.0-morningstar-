package com.example.financeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button loginAsUser;
    Button loginAsAuthorizer;
    //Button login;
   // TextView loginid;
    //TextView password;
    ConstraintLayout loginPage;
    public void login(View view){

        loginAsUser.setVisibility(View.INVISIBLE);
        loginAsAuthorizer.setVisibility(View.INVISIBLE);
        //login.setVisibility(View.VISIBLE);
        //loginid.setVisibility(View.VISIBLE);
      //  password.setVisibility(View.VISIBLE);
        loginPage.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginAsAuthorizer=findViewById(R.id.button4);
         loginAsUser = findViewById(R.id.button3);
        // login=findViewById(R.id.button5);
         //loginid=findViewById(R.id.loginEditText);
         //password=findViewById(R.id.passwordEditText);
        loginPage =findViewById(R.id.LoginPage);
         loginPage.setVisibility(View.INVISIBLE);
    }
}
