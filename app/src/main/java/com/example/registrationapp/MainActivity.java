package com.example.registrationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView vhod,welcome,enter;
    EditText name,password;
    Button button;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vhod=findViewById(R.id.text_logo);
        welcome=findViewById(R.id.text_welcome);
        enter=findViewById(R.id.text_regis);

        name=findViewById(R.id.text_pochta);
        password=findViewById(R.id.text_password);

        container=findViewById(R.id.conteiner);
        button=findViewById(R.id.button_1);

        button();
        method();

    }
    private void method(){
        button.setOnClickListener(view ->  {
            if (name.getText().toString().equals("admin") || password.getText().toString().equals("admin")) {
                enter.setVisibility(View.INVISIBLE);
                name.setVisibility(View.INVISIBLE);
                button.setVisibility(View.INVISIBLE);
                container.setVisibility(View.INVISIBLE);
                password.setVisibility(View.INVISIBLE);
                Toast.makeText(MainActivity.this, "Вы успешно зарегестрировались!", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_SHORT).show();

            }
        });
    }
    private void button(){
        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(name.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(password.getText().toString().isEmpty()){
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.grey));
                }else {
                    button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.orange));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}