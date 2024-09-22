package com.example.echriterbe7bot;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import com.example.echriterbe7bot.R;  // Importation de R

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Gestion des clics sur les éléments du menu
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_accueil:
                        // Afficher la page d'accueil
                        return true;
                    case R.id.nav_categories:
                        // Lancer l'activité "CategoriesActivity"
                        startActivity(new Intent(MainActivity.this, CategoriesActivity.class));
                        return true;
                    case R.id.nav_chatbot:
                        // Lancer l'activité du Chat Bot
                        startActivity(new Intent(MainActivity.this, ChatBotActivity.class));
                        return true;
                    case R.id.nav_promos:
                        // Lancer l'activité "PromosActivity"
                        startActivity(new Intent(MainActivity.this, PromosActivity.class));
                        return true;
                    case R.id.nav_account:
                        // Lancer l'activité "AccountActivity"
                        startActivity(new Intent(MainActivity.this, AccountActivity.class));
                        return true;
                }
                return false;
            }
        });
    }
}
