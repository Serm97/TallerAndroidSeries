package com.practice.tallerandroidseries;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class AdapterChapter extends RecyclerView.Adapter<AdapterChapter.ViewHolderChapter> implements View.OnClickListener{

    private View.OnClickListener listener;
    private Serie serie;

    public AdapterChapter(Serie serie) {
        this.serie = serie;
    }

    @NonNull
    @Override
    public AdapterChapter.ViewHolderChapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_chapter, null, false);

        view.setOnClickListener(this);

        return new ViewHolderChapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterChapter.ViewHolderChapter viewHolderChapter, int i) {
        viewHolderChapter.temporada.setText("T1");
        viewHolderChapter.nombreCapitulo.setText("Capitulo " + i + " de la serie " + serie.getNameSerie());
        viewHolderChapter.duracion.setText("01:"+i+(i+1));
    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        if(listener != null){
            listener.onClick(v);
        }
    }

    public class ViewHolderChapter extends RecyclerView.ViewHolder {

        TextView temporada, nombreCapitulo, duracion;

        public ViewHolderChapter(@NonNull View itemView) {
            super(itemView);

            temporada = itemView.findViewById(R.id.temporada);
            nombreCapitulo = itemView.findViewById(R.id.nombreCapitulo);
            duracion = itemView.findViewById(R.id.duracion);

        }
    }
}
