package com.practice.tallerandroidseries;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SerieActivity extends AppCompatActivity {

    RecyclerView recyclerChapters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie);

        TextView titleSerie = findViewById(R.id.titleSerie);
        ImageView posterSerie = findViewById(R.id.posterSerie);

        Bundle bundle = this.getIntent().getExtras();

        if(bundle != null){
            Serie miSerie = (Serie) bundle.getSerializable("serie");
            titleSerie.setText(miSerie.getNameSerie());
            posterSerie.setImageResource(miSerie.getImageSerie());
        }

        recyclerChapters = findViewById(R.id.recyclerChapters);
        recyclerChapters.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        AdapterChapter adapterChapters = new AdapterChapter();
        adapterChapters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Capitulo #", Toast.LENGTH_SHORT).show();
            }
        });
        recyclerChapters.setAdapter(adapterChapters);
    }

    public void onClick(View view) {

        Intent intent = new Intent(SerieActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
