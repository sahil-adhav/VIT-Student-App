package com.sahiladhav.vitstudentapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;

public class Register extends AppCompatActivity {

    public class RegisterActivity extends AppCompatActivity {

        private EditText regName, regEmail, regPass;
        private Button register;
        private TextView login;

        private String name, email, pass;
        private FirebaseAuth auth;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_register);

            regName = findViewById(R.id.regName);
            regEmail = findViewById(R.id.regEmail);
            regPass = findViewById(R.id.regPass);
            register = findViewById(R.id.userRegister);
            login = findViewById(R.id.openLogin);
            auth = FirebaseAuth.getInstance();


            register.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    validateUser();
                }
            });

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(RegisterActivity.this, Login.class));
                    finish();
                }
            });

        }

        @Override
        protected void onStart() {
            super.onStart();
            if (auth.getCurrentUser() != null){
                startActivity(new Intent(this, MainActivity.class));
                finish();
            }
        }

        private void validateUser() {

            name = regName.getText().toString();
            email = regEmail.getText().toString();
            pass = regPass.getText().toString();

            if (name.isEmpty() || email.isEmpty() || pass.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                registerUser();
            }


        }

        private void registerUser() {

            auth.createUserWithEmailAndPassword(email, pass)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                          if(task.isSuccessful()){
                              Toast.makeText(RegisterActivity.this, "User created!!.", Toast.LENGTH_SHORT).show();
                              startActivity(new Intent(RegisterActivity.this, MainActivity.class));
                              finish();
                          }else {
                              Toast.makeText(RegisterActivity.this, "Error : "+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                          }
                        }
                    });

        }


    }
}