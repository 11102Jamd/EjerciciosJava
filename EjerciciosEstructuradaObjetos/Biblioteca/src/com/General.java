package com;

public class General {
    private int codigo;
    private String Nombre;

    public General(){

    }
    public General(int codigo, String Nombre){
        this.codigo = codigo;
        this.Nombre = Nombre;   
    }
    public void setcodigo(int codigo){
        this.codigo = codigo;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public int getcodigo(){
        return codigo;
    }
    public String getNombre(){
        return Nombre;
    }
    public boolean ValidarDatos(){
        return true;
    }
    public String toString(){
        return "General { Codigo: " +codigo+ " Nombre: " +Nombre+ "}";
    }

}
