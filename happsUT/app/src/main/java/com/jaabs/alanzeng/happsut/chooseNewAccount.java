package com.jaabs.alanzeng.happsut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooseNewAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_new_account);
        setUpButtons();
    }

    private void setUpButtons(){
        Button newUser = (Button) findViewById(R.id.newUser);
        newUser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(chooseNewAccount.this, createNewAccount.class));
            }
        });
    }
}
