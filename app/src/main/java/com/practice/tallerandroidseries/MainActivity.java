package com.practice.tallerandroidseries;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Serie> listaSeries;
    RecyclerView recyclerSeries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerSeries = findViewById(R.id.recyclerSeries);
        //recyclerSeries.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerSeries.setLayoutManager(new GridLayoutManager(this, 1|x));

        listaSeries = new ArrayList<Serie>();
        loadSeries();

        AdapterSeries adapterSeries = new AdapterSeries(listaSeries);
        recyclerSeries.setAdapter(adapterSeries);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void loadSeries() {

        listaSeries.add(new Serie("La Casa de Papel", R.drawable.casapapel));
        listaSeries.add(new Serie("Caso Colmenares", R.drawable.colmenares));
        listaSeries.add(new Serie("Crazy Head", R.drawable.crazyhead));
        listaSeries.add(new Serie("The End of the F**ing World", R.drawable.endworld));
        listaSeries.add(new Serie("Lucifer", R.drawable.lucifer));
        listaSeries.add(new Serie("Maniac", R.drawable.maniac));
        listaSeries.add(new Serie("Narcos", R.drawable.narcos));
        listaSeries.add(new Serie("The Rain", R.drawable.rain));
        listaSeries.add(new Serie("El Recluso", R.drawable.recluso));
        listaSeries.add(new Serie("Sex Education", R.drawable.sexeducation));
        listaSeries.add(new Serie("The Society", R.drawable.society));
        listaSeries.add(new Serie("Universo Stranger Things", R.drawable.strangerthings));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
