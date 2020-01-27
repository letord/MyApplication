package com.appli.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AffichageLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affichage_login);

        TextView getLogin = findViewById(R.id.UserTxt);
        TextView getPasswd = findViewById(R.id.PasswordTxt);

        Intent intent = getIntent();
        if(intent!=null){
            getLogin.setText("User : "+intent.getStringExtra("login"));
            getPasswd.setText("Password : "+intent.getStringExtra("passwd"));
        }
    }
}
