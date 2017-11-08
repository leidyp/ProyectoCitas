package com.dba_leidy.citas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {
    EditText user;
    EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }
    }


    public void ValidateLogin(View view) {
        String usuario = user.getText().toString().trim();
        String contrasena = pass.getText().toString().trim();
        if (!usuario.equals("") && !contrasena.equals("")) {
            if (usuario.equals("leidyacuna") && contrasena.equals("12345")) {
                //Intent intent = new Intent(getApplicationContext(), OperationActivity.class);
                //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                //startActivity(intent);
//                    Intent intent = new Intent(this, OperationActivity.class);
//                    startActivity(intent);
            } else {
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(this, R.style.AppCompatAlertDialogStyle);
                builder.setTitle("Alerta");
                builder.setMessage("Usuario o Contraseña incorrectos.");
                builder.setPositiveButton("OK", null);
                builder.show();
            }
        } else {
            AlertDialog.Builder builder =
                    new AlertDialog.Builder(this, R.style.AppCompatAlertDialogStyle);
            builder.setTitle("Alerta");
            builder.setMessage("Los campos estan vacios, Introduzca contenido para continuar.");
            builder.setPositiveButton("OK", null);
            builder.show();
        }
    }
}

