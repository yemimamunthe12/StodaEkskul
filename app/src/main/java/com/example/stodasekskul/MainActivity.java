package com.example.stodasekskul;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnexit;
    Button btnChoir;
    Button btnCheers;
    Button btnAnsambel;
    Button btnCinema;
    Button btnModernDance;
    ImageView btnLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        btnexit = (Button) findViewById(R.id.button1);
        btnChoir= (Button) findViewById(R.id.Choir);
        btnCheers = (Button) findViewById(R.id.Cheers);
        btnAnsambel = (Button) findViewById(R.id.Ansambel);
        btnCinema = (Button) findViewById(R.id.Cinema);
        btnModernDance = (Button) findViewById(R.id.ModernDance);
        btnLogo = (ImageView) findViewById(R.id.Logo);

        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
            }
        });

        btnChoir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hal2 = new Intent(MainActivity.this, Padus.class);
                startActivity(hal2);
            }
        });

        btnCheers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hal2 = new Intent(MainActivity.this, Cheers.class);
                startActivity(hal2);
            }
        });

        btnAnsambel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hal2 = new Intent(MainActivity.this, Ansambel.class);
                startActivity(hal2);
            }
        });

        btnCinema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hal2 = new Intent(MainActivity.this, Cinematography.class);
                startActivity(hal2);
            }
        });

        btnModernDance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hal2 = new Intent(MainActivity.this, ModernDance.class);
                startActivity(hal2);
            }
        });

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent (Intent.ACTION_VIEW,
                        Uri.parse("https://www.smasantothomas2medan.sch.id/")));
            }
        });

    }
}
