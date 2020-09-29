package com.andrade.contenedores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     Button btnregistrar;
     Button btnverregistro;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnregistrar = findViewById(R.id.btnregistrar);
        btnverregistro = findViewById(R.id.btnverregistro);

        btnregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento= new Intent(MainActivity.this,SpinnerActivity.class);
                startActivity(intento);
            }
        });
        btnverregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento2 = new Intent(MainActivity.this,RecyclerActivity.class);
                startActivity(intento2);
            }
        });

    }
}