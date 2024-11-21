package com;

public class Ciudad extends General{
    private String ciudad;

    public Ciudad(){

    }
    public Ciudad(String ciudad){
        this.ciudad = ciudad;
    }
    public void setCiudad(String ciudad){
        this.ciudad= ciudad;
    }
    public String getCiudad(){
        return ciudad;
    }

}
