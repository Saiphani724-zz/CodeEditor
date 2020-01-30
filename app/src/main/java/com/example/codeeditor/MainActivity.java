package com.example.codeeditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView signUp_text = findViewById(R.id.signUp_text);
        signUp_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegistrationActivity.class));
                finish();
            }
        });
    }
    public void verify(View v ){
        EditText uname = findViewById(R.id.uname);
        EditText pword = findViewById(R.id.pword);
        if(uname.getText().toString().equals("admin") && pword.getText().toString().equals("1234"))
        {
                Intent i = new Intent(this, Navigationclass.class);
                startActivity(i);
        }
        else
        {
            Toast.makeText(MainActivity.this,"Enter a valid username and password",Toast.LENGTH_SHORT).show();
        }

    }
}


