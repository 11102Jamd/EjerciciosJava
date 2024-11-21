import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AppEmpresa {
    public static void main(String[] args) throws Exception {

        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> cargos = new ArrayList<String>();
        ArrayList<Double> salarios = new ArrayList<Double>();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Empleados: "));
        
        for (int emp = 0; emp < cantidad; emp++) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado");
            String cargo = JOptionPane.showInputDialog("Ingrese el cargo del empleado");
            Double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el Salario del Empleado:"));
        
            nombres.add(nombre);
            cargos.add(cargo);
            salarios.add(salario);
        }

        System.out.println("El Número de empleados es: " + cantidad);
        System.out.println("Los nombres de los empleados son:");

        double total = 0;
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Nombre: " + nombres.get(i) + " Salario: " + salarios.get(i));
            total += salarios.get(i); 
        }
        System.out.println("El total de dinero pagado a todos los empleados es: " + total);

        double mayorSalario = salarios.get(0);  
        int posicion = 0;  

        for (int z = 1; z < cantidad; z++) { 
            if (salarios.get(z) > mayorSalario) {
                mayorSalario = salarios.get(z);
                posicion = z;
            }
        }

        System.out.println("El empleado que más dinero gana es:");
        System.out.println("Nombre: " + nombres.get(posicion) + ", Salario: " + salarios.get(posicion) + ", Cargo: " + cargos.get(posicion));
        
        double menorsalario = salarios.get(0);
        int posicionMenor = 0;
        for(int y = 1; y < cantidad; y++){
            if(salarios.get(y) < menorsalario){
                menorsalario = salarios.get(y);
                posicionMenor = y;
            }
        }

        System.out.println("El empleado que gana menos dinero es:");
        System.out.println("Nombre:"+nombres.get(posicionMenor)+ " Salario: " + salarios.get(posicionMenor) + " Cargo: "+cargos.get(posicionMenor));
    }
}



