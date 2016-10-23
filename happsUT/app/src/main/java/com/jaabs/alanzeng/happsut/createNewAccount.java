package com.jaabs.alanzeng.happsut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class createNewAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_account);
        setUpButtons();
    }

    private void setUpButtons() {
        Button submit = (Button) findViewById(R.id.submitNewAccount);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(createNewAccount.this, LoginPage.class));
            }
        });
    }
}
