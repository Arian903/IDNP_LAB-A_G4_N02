package com.idnp.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtNombres = findViewById(R.id.edtName);
        EditText edtApellidoPaterno = findViewById(R.id.edtLastNamePaternal);
        EditText edtApellidoMaterno = findViewById(R.id.edtLastNameMaternal);
        EditText edtFechaNacimiento = findViewById(R.id.edtDateBirth);
        EditText edtColegioPrecedencia = findViewById(R.id.edtSchoolOrigin);
        EditText edtCarrera = findViewById(R.id.edtCareerApply);
        btnRegistrar = findViewById(R.id.btnRegister);
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("Info", "Valor Información");
                String nombres = edtNombres.getText().toString();
                String apellidoPaterno = edtApellidoPaterno.getText().toString();
                String apellidoMaterno = edtApellidoMaterno.getText().toString();
                String fechaNacimiento = edtFechaNacimiento.getText().toString();
                String colegioPrecedencia = edtColegioPrecedencia.getText().toString();
                String carrera = edtCarrera.getText().toString();

                Log.i("Nombres", nombres);
                Log.i("Apellido Paterno", apellidoPaterno);
                Log.i("Apellido Materno", apellidoMaterno);
                Log.i("Fecha Nacimiento", fechaNacimiento);
                Log.i("Colegio Precedencia", colegioPrecedencia);
                Log.i("Carrera", carrera);


            }
        });
    }
}