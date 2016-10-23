package com.jaabs.alanzeng.happsut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.List;

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
                ParseQuery<ParseUser> query = ParseQuery.getQuery("User");
                query.whereEqualTo("email", ((EditText) findViewById(R.id.orgEmail)).getText().toString());
                query.findInBackground(new FindCallback<ParseUser>() {
                    @Override
                    public void done(List<ParseUser> objects, ParseException e) {
                        if (objects.size() > 0) {
                            Toast.makeText(getApplicationContext(), "Email already exists", Toast.LENGTH_LONG).show();
                        } else {
                            ParseUser user = new ParseUser();
                            user.setUsername(((EditText)findViewById(R.id.orgName)).getText().toString());
                            user.setPassword(((EditText)findViewById(R.id.orgPassword)).getText().toString());
                            user.setEmail(((EditText)findViewById(R.id.orgEmail)).getText().toString());
                            user.put("isOrg", true);
                            user.put("orgDescription", ((EditText)findViewById(R.id.orgDescription)).getText().toString());
                            startActivity(new Intent(createNewOrg.this, LoginPage.class));
                        }
                    }
                });
            }
        });
    }
}
