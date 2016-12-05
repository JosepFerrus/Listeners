package com.example.josep.activitat2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class PantallaEstrelles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_estrelles);

        final ToggleButton BotoFondo = (ToggleButton) findViewById(R.id.BotoFondo);
        final FrameLayout Fondo = (FrameLayout) findViewById(R.id.frameLayout);
        final ToggleButton Letras = (ToggleButton) findViewById(R.id.Letras);
        final CheckBox Mostrar = (CheckBox) findViewById(R.id.Mostrar);
        final TextView Text = (TextView) findViewById(R.id.Text);
        Text.setVisibility(TextView.INVISIBLE);
        final TextView Pulsar = (TextView) findViewById(R.id.Pulsar);
        final RatingBar Estrellas = (RatingBar) findViewById(R.id.Estrellas);
        final TextView Contador = (TextView) findViewById(R.id.Contador);

        BotoFondo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (BotoFondo.isChecked()) {
                    Fondo.setBackgroundColor(Color.RED);
                } else {
                    Fondo.setBackgroundColor(Color.WHITE);
                }


            }
        });

        Letras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (Letras.isChecked()) {
                    Letras.setTextColor(Color.RED);
                } else {
                    Letras.setTextColor(Color.BLACK);
                }
            }
        });
        Mostrar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (Mostrar.isChecked()) {
                    Text.setVisibility(TextView.VISIBLE);
                } else {
                    Text.setVisibility(TextView.INVISIBLE);
                }
            }
        });
        Pulsar.setOnLongClickListener(new View.OnLongClickListener(){

            @Override
            public boolean onLongClick(View v) {

                    Toast.makeText(PantallaEstrelles.this,"Muchas gracias", Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        Estrellas.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Contador.setText("[" + rating + " /5 ]");
            }
        });
    }
}

