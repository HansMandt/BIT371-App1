package com.example.environmentsetup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LogIn(View view) {

        Log.i("INFO", "Logging into your account...");
        EditText user = findViewById(R.id.userNameInput);
        EditText password = findViewById(R.id.passwordInput);

        String userNameInput = user.getText().toString();
        String passwordInput = password.getText().toString();

        Log.i("INFO", "The username you input is " + user.getText().toString());
        Log.i("INFO", "The password you input is " + password.getText().toString());

        Intent intent = new Intent(getApplicationContext(), UserConfirmationActivity.class);
        intent.putExtra("usernameCredential", userNameInput);
        intent.putExtra("passwordCredential", passwordInput);
        startActivity(intent);
    }


}