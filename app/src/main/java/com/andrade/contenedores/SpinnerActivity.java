package com.andrade.contenedores;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.widget.CheckBox;
        import android.widget.EditText;

public class SpinnerActivity extends AppCompatActivity {


    EditText txtnombre,txtpaterno,txtmaterno;
    CheckBox cbmasculino,cbfemenino;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
    }

}