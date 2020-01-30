package com.example.codeeditor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        b=(Button)findViewById(R.id.ReportBug);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto", "prashanthshiv954@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "ReportBug");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, "ReportBug");
                startActivity(emailIntent);
            }
        });

    }
}

