package com.example.loginregisterfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        int id;
        final EditText phone;
        phone = findViewById(id: R.id.phone);
        final EditText password = findViewById(id: R.id.password);
        final Button loginBtn = findViewById(id: R.id.loginBtr);
        final TextView RegisterNowBtn = findViewById(id: R.id.registerNowBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String phoneTxt = phone.getText().toString();
                final String passwordTxt = password.getText().toString();

                if(phoneTxt.isEmpty() || passwordTxt.isEmpty()){
                    Toast.makeText(context: Login.this, text: "please enter your mobile or password", Toast. LENGTH_SHORT).show;
                }
                else{

                }

            }
        };

    }
}