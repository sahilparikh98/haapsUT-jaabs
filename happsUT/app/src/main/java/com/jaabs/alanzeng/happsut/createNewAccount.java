package com.jaabs.alanzeng.happsut;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;
import com.parse.SignUpCallback;

import java.util.List;

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
                ParseQuery<ParseUser> query = ParseQuery.getQuery("User");
                query.whereEqualTo("email", ((EditText)findViewById(R.id.newUserEmail)).getText().toString());
                query.findInBackground(new FindCallback<ParseUser>() {
                    @Override
                    public void done(List<ParseUser> objects, ParseException e) {
                        if(objects.size() > 0) {
                            Toast.makeText(getApplicationContext(), "Email already exists", Toast.LENGTH_LONG).show();
                        }else{
                            ParseUser user = new ParseUser();
                            user.setUsername(((EditText)findViewById(R.id.newUserName)).getText().toString());
                            user.setPassword(((EditText)findViewById(R.id.newUserPassword)).getText().toString());
                            user.setEmail(((EditText)findViewById(R.id.newUserPassword)).getText().toString());
                            user.put("isOrg", false);
                            UserTags userTags = new UserTags();
                            userTags.setTag("Free Food"); // TODO: loop through all tags to add
                            userTags.setOfUser(((EditText)findViewById(R.id.newUserPassword)).getText().toString());

                            user.signUpInBackground(new SignUpCallback() {
                                public void done(ParseException e) {
                                    if (e == null) {
                                        startActivity(new Intent(createNewAccount.this, LoginPage.class));
                                    } else {
                                        // Sign up didn't succeed. Look at the ParseException
                                        // to figure out what went wrong
                                    }
                                }
                            });
                        }
                    }
                });


            }
        });
    }
}
