import java.util.Scanner;

import com.*;
public class AppBiblioteca {

    Libro libro;
    Prestatario prestatario;

    public static void main(String[] args) throws Exception {
        AppBiblioteca appbiblioteca = new AppBiblioteca();
        appbiblioteca.cargarLibro();
        appbiblioteca.imprimir();
    }
    public void cargarLibro() {
        libro = new Libro();
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingrese el codigo del libro:");
        libro.setcodigo(Integer.parseInt(sc.nextLine()));
    
        System.out.println("Ingrese el nombre del libro:");
        libro.setNombre(sc.nextLine());
    
        System.out.println("Ingrese el numero de la Edicion:");
        libro.setEdicion(Integer.parseInt(sc.nextLine())); // Usamos `nextLine()` para leer toda la línea
    
        System.out.println("Ingrese el año de publicacion:");
        libro.setAñopublicacion(Integer.parseInt(sc.nextLine()));
    
        Autor autor = new Autor();
        System.out.println("Ingrese el Codigo del Autor:");
        autor.setcodigo(Integer.parseInt(sc.nextLine()));
    
        System.out.println("Ingrese el Nombre del Autor:");
        autor.setNombre(sc.nextLine());

        System.out.println("Ingrese la observacion del libro:");
        autor.setObservacion(sc.nextLine());

        System.out.println("Ingrese la cantidad de libros publicados:");
        autor.setLibrospublicados(Integer.parseInt(sc.nextLine()));

        System.out.println("Ingrese el Pais de origen del autor:");
        String nombrepais = sc.nextLine();
        Pais pais = new Pais(nombrepais);
        autor.setPais(pais);

        System.out.println("Ingrese los datos del Prestatario:");
        prestatario = new Prestatario();
        System.out.println("Ingrese el Nombre del Prestatario:");
        prestatario.setNombre(sc.nextLine());
        System.out.println("Ingrese el codigo del Prestatario:");
        prestatario.setcodigo(Integer.parseInt(sc.nextLine()));
        System.out.println("Ingrese la direccion del Prestatario:");
        prestatario.setdireccion(sc.nextLine());
        System.out.println("Ingrese el rut del Prestatario:");
        prestatario.setrut(sc.nextLine());
        System.out.println("Ingrese el Telefono del Prestatario:");
        prestatario.settelefono(sc.nextLine());
        System.out.println("Ingrese la ciudad del prestatario:");
        Ciudad ciudad = new Ciudad(sc.nextLine());
        prestatario.setciudad(ciudad);

    
        libro.setAutor(autor);
    
        sc.close(); // Cerramos el Scanner al final
    }
    
    public void imprimir(){
        System.out.println(libro);
            System.out.println(libro);
            System.out.println(prestatario);
        
    }
}
