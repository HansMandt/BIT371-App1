package com.example.environmentsetup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class UserConfirmationActivity extends AppCompatActivity {

    private String storedUsername = "cleverUsername";
    private String storedPassword = "123456789";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_confirmation);

        TextView tv = findViewById(R.id.textView);
        String usernameInput = getIntent().getStringExtra("usernameCredential");
        String passwordInput = getIntent().getStringExtra("passwordCredential");

        if(usernameInput.equals(storedUsername) && passwordInput.equals(storedPassword))
        {
            tv.setText("Welcome, " + storedUsername + "!");
        }
        else
        {
            tv.setText("Username/Password combination is wrong");
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("INFO", "UserConformationActivity is destroyed");
    }
}