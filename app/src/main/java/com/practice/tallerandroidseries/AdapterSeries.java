package com.practice.tallerandroidseries;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterSeries extends RecyclerView.Adapter<AdapterSeries.ViewHolderSeries> {

    ArrayList<Serie> listaSeries;

    public AdapterSeries(ArrayList<Serie> listaSeries) {
        this.listaSeries = listaSeries;
    }

    @NonNull
    @Override
    public ViewHolderSeries onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_serie, null, false);
        return new ViewHolderSeries(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderSeries viewHolderSeries, int i) {
        viewHolderSeries.nameSerie.setText(listaSeries.get(i).getNameSerie());
        viewHolderSeries.imageSerie.setImageResource(listaSeries.get(i).getImageSerie());
    }

    @Override
    public int getItemCount() {
        return listaSeries.size();
    }

    public class ViewHolderSeries extends RecyclerView.ViewHolder {

        TextView nameSerie;
        ImageView imageSerie;


        public ViewHolderSeries(@NonNull View itemView) {
            super(itemView);
            nameSerie = itemView.findViewById(R.id.nameSerie);
            imageSerie = itemView.findViewById(R.id.imageSerie);
        }

    }
}
