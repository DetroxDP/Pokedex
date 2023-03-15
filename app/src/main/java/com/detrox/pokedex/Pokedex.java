package com.detrox.pokedex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.detrox.pokedex.databinding.ActivityPokedexBinding;

public class Pokedex extends AppCompatActivity {

    ActivityPokedexBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPokedexBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.navView.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.mInicio:
                    FragHome fragment = new FragHome();

                    Fragment fragmentToHide = getSupportFragmentManager().findFragmentById(R.id.fragment_pokemon);
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.hide(fragmentToHide);
                    transaction.add(R.id.fragment_home, fragment);
                    FragmentManager fragmentManager = getSupportFragmentManager();

                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fragment_home, fragment, "fragment_tag");
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                    return true;
                case R.id.mPokemons:
                    FragPokemon fragment1 = new FragPokemon();

                    Fragment fragmentToHide1 = getSupportFragmentManager().findFragmentById(R.id.fragment_home);
                    FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                    transaction1.hide(fragmentToHide1);
                    transaction1.add(R.id.fragment_pokemon, fragment1);

                    FragmentManager fragmentManager1 = getSupportFragmentManager();
                    FragmentTransaction fragmentTransaction1 = fragmentManager1.beginTransaction();
                    fragmentTransaction1.replace(R.id.fragment_pokemon, fragment1, "fragment_tag");
                    fragmentTransaction1.addToBackStack(null);
                    fragmentTransaction1.commit();
                    return true;
                case R.id.mCerrarSesion:
                    Intent intent = new Intent(Pokedex.this, Login.class);
                    startActivity(intent);
                    return true;
            }
            return false;
        });

    }

    @Override
    public void onBackPressed() {
    }
}