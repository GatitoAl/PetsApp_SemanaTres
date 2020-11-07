package com.gatito.petsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapta_clasificacion extends RecyclerView.Adapter<adapta_clasificacion.AnimalitosViewHolder>{
    //Implementamos el arreglo que posee los elemenrtos
    ArrayList<Animalitos> animalitos;

    public adapta_clasificacion(ArrayList<Animalitos> animalitos){
        this.animalitos = animalitos;
    }



    @NonNull
    @Override
    //En este metodo infla el layout y lo pasa al viewholder para obtener los viewa
    public AnimalitosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);

        return new adapta_clasificacion.AnimalitosViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AnimalitosViewHolder holder, int position) {

        Animalitos animalito = animalitos.get(position);
        holder.img_perritoCal.setImageResource(animalito.getImg());
        holder.txt_nombreCal.setText(animalito.getNombre());
        holder.txt_votosCal.setText(animalito.getVoto());
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public static class  AnimalitosViewHolder extends RecyclerView.ViewHolder{

        //Se decalra todos los campos que se va a utilizar
        private ImageView img_perritoCal;
        private TextView txt_nombreCal;
        private TextView txt_votosCal;

        public AnimalitosViewHolder(View itemView) {
            super(itemView);
            img_perritoCal = (ImageView) itemView.findViewById(R.id.img_perrito);
            txt_nombreCal = (TextView) itemView.findViewById(R.id.txt_nombre);
            txt_votosCal = (TextView) itemView.findViewById(R.id.txt_votos);
        }
    }
}
