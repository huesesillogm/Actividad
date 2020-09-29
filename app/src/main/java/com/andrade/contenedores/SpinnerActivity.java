package com.andrade.contenedores;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.RatingBar;
        import android.widget.ArrayAdapter;
        import android.widget.Toast;

        import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {


    EditText txtnombre,txtpaterno,txtmaterno,txtrut;
    RadioButton rbmasculino,rbfemenino;
    RatingBar rating;
    Button btnregistro;
    RadioGroup caca;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        txtnombre = findViewById(R.id.txtnombre);
        caca = findViewById(R.id.caca);
        txtpaterno = findViewById(R.id.txtpaterno);
        txtmaterno = findViewById(R.id.txtmaterno);
        txtrut = findViewById(R.id.txtrut);
        rbfemenino = findViewById(R.id.rbfemenino);
        rbmasculino = findViewById(R.id.rbmasculino);
        rating = findViewById(R.id.rating);
        btnregistro = findViewById(R.id.btnregistro);


        final ArrayList<String> lista = new ArrayList<>();
        final ArrayAdapter<String> listas =
                new ArrayAdapter<String>(SpinnerActivity.this, android.R.layout.simple_list_item_1, lista);
        btnregistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lista.add(txtnombre.getText().toString().trim());
                lista.add(txtpaterno.getText().toString().trim());
                lista.add(txtmaterno.getText().toString().trim());
                lista.add(txtrut.getText().toString().trim());
                lista.add(Float.toString(rating.getRating()));
                lista.add(Boolean.toString(rbfemenino.isChecked()));
                lista.add(Boolean.toString(rbmasculino.isChecked()));

                Toast.makeText(SpinnerActivity.this, "Inscrito para la postulacion", Toast.LENGTH_LONG).show();




            }

        });
    }
}



































