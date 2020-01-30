
package com.example.codeeditor;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;

public class Navigationclass extends AppCompatActivity {

    TextView apname;

    Button btnCC,btnCF,btnHR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigationclass);

        apname=(TextView)findViewById(R.id.openAbout);
        btnCC=(Button)findViewById(R.id.btnCC);
        btnCF=(Button)findViewById(R.id.btnCF);
        btnHR=(Button)findViewById(R.id.btnHR);

        apname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Navigationclass.this,About.class);
                startActivity(i);
            }
        });


        btnCC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codechef.com/"));
                startActivity(l);
            }
        });

        btnHR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hackerrank.com/?utm_expid=.2u09ecQTSny1HV02SEVoCg.0&utm_referrer="));
                startActivity(m);
            }
        });

        btnCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(Intent.ACTION_VIEW, Uri.parse("https://codeforces.com/"));
                startActivity(n);
            }
        });


    }

    public void openEditor(View v)
    {
        startActivity(new Intent(Navigationclass.this,EditorActivity.class));
//        Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_LONG).show();
    }
}
