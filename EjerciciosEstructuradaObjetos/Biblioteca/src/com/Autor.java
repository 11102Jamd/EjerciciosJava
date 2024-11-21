package com;

public class Autor extends General{
    private String observacion;
    private int librospublicados;
    private Pais pais;

    public Autor(){

    }
    public Autor(int codigo, String Nombre, String observacion, int librospublicados, Pais pais){
        super(codigo,Nombre);
        this.observacion = observacion;
        this.librospublicados = librospublicados;
        this.pais = pais;
    }
    public void setObservacion(String observacion){
        this.observacion = observacion;
    }
    public void setLibrospublicados(int librospublicados){
        this.librospublicados = librospublicados;
    }
    public void setPais(Pais pais){
        this.pais = pais;
    }
    public String getObservacion(){
        return observacion;
    }
    public int getLibrospublicados(){
        return librospublicados;
    }
    public Pais getPais(){
        return pais;
    }
    public String toString(){
        return "Autor { "+super.toString() + "Observacion: " + observacion + " Libros Publicados: " + librospublicados+ " Pais: " +pais+ '}';   
    }

}
