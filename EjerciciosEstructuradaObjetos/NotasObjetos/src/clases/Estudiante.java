package clases;

public class Estudiante {
  private String nombre;
  private float nota1;
  private float nota2;
  private float notafinal;

  public Estudiante(String nombre){
    this.nombre = nombre;
  }
  public Estudiante(String nombre, float nota1, float nota2){
    this.nombre = nombre;
    this.nota1 = nota1;
    this.nota2 = nota2;
  }

  public void asignarNotaParcial1(float nota1){
    this.nota1 = nota1;
  }

  public void asignarNotaParcial2(float nota2){
    this.nota2 = nota2;
  }
  public void AsignarNombre(String nombre){
    this.nombre = nombre;
  }
  public String ObtenerNombre(){
    return nombre;
  }
  public float obtenerNotaParcial1(){
    return nota1;
  }
  public float obtenerNotaParcial2(){
    return nota2;
  }

  public void calcularNotaFinal(){
    notafinal = (nota1+nota2) /2;
  }

  public float obtenernotafinal(){
    return notafinal;
  }
  
  public String ObtenerMensaje()
  {
    if (notafinal <= 3.0){
        return "Reprobo";
    }else{
        return "Aprobo";
    }
  }
}



