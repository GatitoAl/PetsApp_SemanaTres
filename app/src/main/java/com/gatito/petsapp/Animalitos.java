package com.gatito.petsapp;

public class Animalitos {

    private String nombre;
    private String voto;
    private int img;

    public Animalitos(int img, String nombre, String voto){
        this.img=img;
        this.nombre=nombre;
        this.voto=voto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
