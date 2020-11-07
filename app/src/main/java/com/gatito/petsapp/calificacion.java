package com.gatito.petsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;


public class calificacion extends AppCompatActivity {

    ArrayList<Animalitos> animalitos;
    private RecyclerView listaDeAnimalitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calificacion);
        
        //Metodo para que se pueda observar la toolbar
        Toolbar ttoolBar = (Toolbar)findViewById(R.id.tooolbar);
        setSupportActionBar(ttoolBar);

        //Con las siguientes lineas de codigo damos la orientacion al reciclerview
        listaDeAnimalitos = (RecyclerView)findViewById(R.id.rvAnimales);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listaDeAnimalitos.setLayoutManager(linearLayoutManager);
        llenadoDeArreglo();
        inicializarAdaptador();
    }

    //Metodo para que el adaptador pueda hacer toodo
    public void inicializarAdaptador(){
        ADAPTADOR adaptador = new ADAPTADOR(animalitos);
        listaDeAnimalitos.setAdapter(adaptador);
    }

    public void llenadoDeArreglo(){

        //Array con los datos de los animales

        animalitos = new ArrayList<Animalitos>();

        animalitos.add(new Animalitos(R.drawable.perrotres,"Sarita","5"));
        animalitos.add(new Animalitos(R.drawable.perrodos,"Camila","3"));
        animalitos.add(new Animalitos(R.drawable.perrouno,"Chocolatina","2"));
        animalitos.add(new Animalitos(R.drawable.perrocuatro,"Nena","1"));
        animalitos.add(new Animalitos(R.drawable.perrocinco,"Bolo","1"));


    }

    //Metodo para regresar al main activity
    public void regresar(View v){
        Intent next = new Intent(this,MainActivity.class);
        startActivity(next);

    }
}