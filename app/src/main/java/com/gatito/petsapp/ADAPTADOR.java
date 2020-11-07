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

public class ADAPTADOR extends RecyclerView.Adapter<ADAPTADOR.AnimalitosViewHolder> {
    //Implementamos el arreglo que posee los elemenrtos
    ArrayList<Animalitos> animalitos;

    public ADAPTADOR(ArrayList<Animalitos> animalitos){
        this.animalitos = animalitos;
    }

    //En este metodo infla el layout y lo pasa al viewholder para obtener los viewa
    @Override
    public AnimalitosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);

        return new AnimalitosViewHolder(v);
    }

    //Este metodo asocia cada elemento de la lisra con cada view
    @Override
    public void onBindViewHolder(final AnimalitosViewHolder animalitosViewHolder, int position) {

        final Animalitos animalito = animalitos.get(position);
        animalitosViewHolder.img_perrito.setImageResource(animalito.getImg());
        animalitosViewHolder.txt_nombre.setText(animalito.getNombre());
        animalitosViewHolder.txt_votos.setText(animalito.getVoto());

        animalitosViewHolder.ibtn_votos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                int cont =  Integer.parseInt(animalitosViewHolder.txt_votos.getText().toString());
                cont++;
                String voto = String.valueOf(cont);
                animalito.setVoto(voto);
                animalitosViewHolder.txt_votos.setText(animalito.getVoto());
            }
        });

    }

    //En este metodo generamos la cantidad elementos que va a poseer la lista
    @Override
    public int getItemCount() {
        return animalitos.size();
    }

    public static class  AnimalitosViewHolder extends RecyclerView.ViewHolder{

        //Se decalra todos los campos que se va a utilizar
        private ImageView img_perrito;
        private TextView txt_nombre;
        private TextView txt_votos;
        private ImageButton ibtn_votos;

        public AnimalitosViewHolder(View itemView) {
            super(itemView);
            img_perrito = (ImageView) itemView.findViewById(R.id.img_perrito);
            txt_nombre = (TextView) itemView.findViewById(R.id.txt_nombre);
            txt_votos = (TextView) itemView.findViewById(R.id.txt_votos);
            ibtn_votos = (ImageButton)itemView.findViewById(R.id.ibtn_Hueso);
        }
    }

}
