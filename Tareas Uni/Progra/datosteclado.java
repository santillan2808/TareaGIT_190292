import javax.swing.*;
public class datosteclado{
   public static void main (String args[]){
   
String nombre, direccion;
int edad;
double estatura, peso; 

    nombre=(JOptionPane.showInputDialog("Ingresa tu nombre"));
    estatura=Double.parseDouble(JOptionPane.showInputDialog("Ingresa estatura"));
    edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
    direccion=(JOptionPane.showInputDialog("Ingresa tu dirección"));
    peso=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu peso"));

    JOptionPane.showMessageDialog(null, "Nombre: "+ nombre +"\n"+ "Estatura: " + estatura + "\n" + "Edad: " + edad + "\n" + "Dirección: " + direccion + "\n"+ "peso: " + peso);
}
}