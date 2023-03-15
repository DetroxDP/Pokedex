package com.detrox.pokedex;

import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.detrox.pokedex.databinding.ActivityMainBinding;

public class Login extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.bntLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (binding.edtUsuario.getText().toString().equals("Ash") && binding.edtContrasenia.getText().toString().equals("1234")) {
                    Intent intent = new Intent(Login.this, Pokedex.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(Login.this, "Credenciales Incorrectas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
    }

}