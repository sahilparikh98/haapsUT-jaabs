package com.jaabs.alanzeng.happsut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class createNewOrg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_org);
        setUpButtons();
    }

    private void setUpButtons() {
        Button submit = (Button) findViewById(R.id.submitNewOrg);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(createNewOrg.this, LoginPage.class));
            }
        });
    }
}
