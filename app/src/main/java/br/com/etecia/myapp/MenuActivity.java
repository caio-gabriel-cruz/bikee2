package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    CardView bikes, acessorios, manutencao, dicas, locais, eventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.menu_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bikes = findViewById(R.id.menuBike);
        acessorios = findViewById(R.id.menuAcessorios);
        manutencao = findViewById(R.id.menuManutencao);
        dicas = findViewById(R.id.menuDicas);
        locais = findViewById(R.id.menuLocais);
        eventos = findViewById(R.id.menuEventos);


        bikes.setOnClickListener(this);
        acessorios.setOnClickListener(this);
        manutencao.setOnClickListener(this);
        dicas.setOnClickListener(this);
        locais.setOnClickListener(this);
        eventos.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.menuBike) {
            startActivity(new Intent(getApplicationContext(), BIkesActivity.class));
            finish();
        }
        if (view.getId() == R.id.menuAcessorios) {
            startActivity(new Intent(getApplicationContext(), AcessoriosActivity.class));
            finish();
        }
        if (view.getId() == R.id.menuManutencao) {
            startActivity(new Intent(getApplicationContext(), ManutencaoActivity.class));
            finish();
        }
        if (view.getId() == R.id.menuDicas) {
            startActivity(new Intent(getApplicationContext(), DicasActivity.class));
            finish();
        }
        if (view.getId() == R.id.menuLocais) {
            startActivity(new Intent(getApplicationContext(), LocaisActivity.class));
            finish();
        }
        if (view.getId() == R.id.menuEventos) {
            startActivity(new Intent(getApplicationContext(), EventosActivity.class));
            finish();
        }


    }
}