package com;

public class Libro extends General{
    private int edicion;
    private int añopublicacion;
    private Autor autor;

    public Libro(){

    }
    public Libro(int edicion, int añopublicacion, Autor autor){
        this.edicion = edicion;
        this.añopublicacion = añopublicacion;
        this.autor = autor;
    }
    public void setEdicion(int edicion){
        this.edicion = edicion;
    }
    public void setAñopublicacion(int añopublicacion){
        this.añopublicacion = añopublicacion;
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    public int getEdicion(){
        return edicion;
    }
    public int getAñopublicacion(){
        return añopublicacion;
    }
    public Autor getAutor(){
        return autor;
    }
    public String toString(){
        return "Libro { "+super.toString() + "Edicion: " + edicion + " Año de Publicacion: " + añopublicacion +" Autor: " +autor+ '}';   
    }


}
