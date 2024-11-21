import clases.Estudiante;

public class AppNotasObjetos {
    public static void main(String[] args) throws Exception {
        Estudiante est = new Estudiante("Carlos Rodriguez", Float.parseFloat("2.5"), Float.parseFloat("5.0"));
        Estudiante est1 = new Estudiante("Santiago ibañez", Float.parseFloat("2.5"), Float.parseFloat("3.0"));
        est.calcularNotaFinal();
        est1.calcularNotaFinal();
        System.out.println("El estudiante "+est.ObtenerNombre()+ " Obtuvo una nota Final de: " +est.obtenernotafinal() +" Por consiguiente " +est.ObtenerMensaje());
        System.out.println("El estudiante "+est1.ObtenerNombre()+ " Obtuvo una nota Final de: " +est1.obtenernotafinal() +" Por consiguiente " +est1.ObtenerMensaje());
    }
}
