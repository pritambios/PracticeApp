package com.example.kreetiuser.practiceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String emailId = "ppramanik@kreeti.com";
    String pwd = "pritam";
    EditText email;
    EditText password;
    Button button;
    TextView errors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email    = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        button   = (Button) findViewById(R.id.button);
        errors   = (TextView) findViewById(R.id.error_message);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(emailId.equals(email.getText().toString()) && pwd.equals(password.getText().toString())) {
                    Intent intent = new Intent(MainActivity.this, UserProfileActivity.class);
                    intent.putExtra("email", email.getText().toString());
                    MainActivity.this.startActivity(intent);
                } else {
                    String err = "Invalid email and Password";
                    errors.append(err);
                }
            }
        });
    }
}
