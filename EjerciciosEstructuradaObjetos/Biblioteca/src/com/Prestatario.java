package com;

public class Prestatario extends General{
    private String direccion;
    private String telefono;
    private String rut;
    private Ciudad ciudad;

    public Prestatario(){

    }
    public Prestatario(int codigo, String Nombre, String direccion, String telefono, String rut, Ciudad ciudad){
        super(codigo, Nombre);
        this.direccion = direccion;
        this.telefono = telefono;
        this.rut = rut;
        this.ciudad = ciudad;
    }
    public void setdireccion(String direccion){
        this.direccion = direccion;
    }
    public void settelefono(String telefono){
        this.telefono = telefono;
    }
    public void setrut(String rut){
        this.rut = rut;
    }
    public void setciudad(Ciudad ciudad){
        this.ciudad = ciudad;
    }
    public String getdireccion(){
        return direccion;
    }

    public String gettelefono(){
        return telefono;
    }

    public String getrut(){
        return rut;
    }
    public Ciudad getCiudad(){
        return ciudad;
    }
    public String toString(){
        return "Prestatario { "+super.toString() + "Direccion: " + direccion + " Telefono: " + telefono +" Rut: " +rut+ " Ciudad: "+ciudad+ '}';   
    }

}
