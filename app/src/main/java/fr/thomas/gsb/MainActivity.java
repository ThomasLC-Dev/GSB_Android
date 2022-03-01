package fr.thomas.gsb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button boutonAjouter;
    private Button boutonListe;
    private Button boutonMaj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boutonAjouter = findViewById(R.id.menuButtonAjoutEchantillon);
        boutonListe = findViewById(R.id.menuButtonListeEchantillons);
        boutonMaj = findViewById(R.id.menuButtonMajEchantillons);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.ajout:
                Intent intentAjout = new Intent(MainActivity.this, AddEchantillonActivity.class);
                startActivity(intentAjout);
                return true;
            case R.id.liste:
                Intent intentListe = new Intent(MainActivity.this, ListEchantillonsActivity.class);
                startActivity(intentListe);
                return true;
            case R.id.maj:
                Intent intentMaj = new Intent(MainActivity.this, UpdateEchantillonActivity.class);
                startActivity(intentMaj);
                return true;
        }
        return false;
    }
}