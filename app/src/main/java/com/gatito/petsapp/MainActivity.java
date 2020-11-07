package com.gatito.petsapp;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Animalitos> animalitos;
private RecyclerView listaDeAnimalitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Metodo para que se pueda observar la toolbar
        Toolbar myToolBar = (Toolbar)findViewById(R.id.myy_toolbar);
        setSupportActionBar(myToolBar);

        //Agregamso el boton flotante
        btnFlotante();

        //Con las siguientes lineas de codigo damos la orientacion al reciclerview
        listaDeAnimalitos = (RecyclerView)findViewById(R.id.rvAnimales);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listaDeAnimalitos.setLayoutManager(linearLayoutManager);
        llenadoDeArreglo();
        inicializarAdaptador();
    }

    //Metodo para el menu


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    //Metodo para que hace al cliclear sobre el menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.btn_pata){
            Intent next = new Intent(this,calificacion.class);
            startActivity(next);
        }

        return true;
    }

    //Metodo para el FloatingBuuton
    public void btnFlotante(){
        FloatingActionButton bnt_flotante = (FloatingActionButton)findViewById(R.id.fb_camara);
        bnt_flotante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    //Metodo para que el adaptador pueda hacer toodo
    public void inicializarAdaptador(){
        ADAPTADOR adaptador = new ADAPTADOR(animalitos);
        listaDeAnimalitos.setAdapter(adaptador);
    }

    public void llenadoDeArreglo(){

        //Array con los datos de los animales

        animalitos = new ArrayList<Animalitos>();

        animalitos.add(new Animalitos(R.drawable.perrotres,"Sarita","0"));
        animalitos.add(new Animalitos(R.drawable.perrodos,"Camila","0"));
        animalitos.add(new Animalitos(R.drawable.perrouno,"Chocolatina","0"));
        animalitos.add(new Animalitos(R.drawable.perrocuatro,"Nena","0"));
        animalitos.add(new Animalitos(R.drawable.perrocinco,"Bolo","0"));
        animalitos.add(new Animalitos(R.drawable.perrotres,"Straus","0"));
        animalitos.add(new Animalitos(R.drawable.perrodos,"Tobby","0"));
        animalitos.add(new Animalitos(R.drawable.perrouno,"Lucas","0"));
        animalitos.add(new Animalitos(R.drawable.perrocuatro,"Luna","0"));
        animalitos.add(new Animalitos(R.drawable.perrocinco,"Bala","0"));

    }



}