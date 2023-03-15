package com.detrox.pokedex;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragPokemon#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragPokemon extends Fragment {



    public FragPokemon() {
        // Required empty public constructor
    }


    public static FragPokemon newInstance(String param1, String param2) {
        FragPokemon fragment = new FragPokemon();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_pokemon, container, false);
    }
}