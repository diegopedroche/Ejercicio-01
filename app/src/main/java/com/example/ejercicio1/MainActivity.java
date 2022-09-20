package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnReset;
    private Button btnSaludar;
    private TextView lbSaludo;
    private EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InicializaVistas();

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtNombre.getText().toString().trim().isEmpty()){
                    Toast.makeText(MainActivity.this, "No hay nada escrito en el cuadro de texto", Toast.LENGTH_SHORT).show();
                }else{
                    txtNombre.setText("");
                }
            }
        });

        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!txtNombre.getText().toString().trim().isEmpty()){
                    lbSaludo.setText("Hola "+txtNombre.getText()+", buenos días");
                    lbSaludo.setText("");
                }else{
                    Toast.makeText(MainActivity.this, "No hay nada escrito en el cuadro de texto", Toast.LENGTH_SHORT).show();
                    lbSaludo.setText("");
                }
            }
        });
    }

    private void InicializaVistas() {
        btnReset = findViewById(R.id.btsResetMain);
        btnSaludar = findViewById(R.id.btnSaludarMain);
        txtNombre = findViewById(R.id.txtNombreMain);
        lbSaludo = findViewById(R.id.lbSaludoMain);
    }
}