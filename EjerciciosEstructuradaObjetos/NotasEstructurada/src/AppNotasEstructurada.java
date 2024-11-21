import javax.swing.JOptionPane;

public class AppNotasEstructurada {
    public static void main(String[] args) throws Exception {
        for(int est = 0; est<2;est++){
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombree del estudiante");
            float nota1 = Float.parseFloat((JOptionPane.showInputDialog(null, "Ingrese la nota 1 del estudiante")));
            float nota2 = Float.parseFloat((JOptionPane.showInputDialog(null, "ingrese la nota 2 del estudiante")));
            float notafinal = (nota1 + nota2)/2;
            JOptionPane.showMessageDialog(null, "El estudiante" +nombre+ "obtuvo una nota final de:" +notafinal);
            if(notafinal <= 3.0){
                JOptionPane.showMessageDialog(null, " El estudiante Reprobo ");
            }else{
                JOptionPane.showMessageDialog(null, " El estudiante Aprobo ");
            }
        }
    }
}
