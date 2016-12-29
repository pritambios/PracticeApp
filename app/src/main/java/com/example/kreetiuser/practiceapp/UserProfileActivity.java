package com.example.kreetiuser.practiceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserProfileActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        setTitle("User Profile");
        result = (TextView) findViewById(R.id.result);
        String email = getIntent().getExtras().getString("email");

        result.setText(email);
    }
}
