import javax.swing.*;
  public class Cases{
   public static void main (String args[]){
   int x;
   x=Integer.parseInt(JOptionPane.showInputDialog("Elija una opcion:" ));
   switch (x)
   {
   case 1:
   JOptionPane.showMessageDialog(null, "Hola");
   break;
   case 2: 
   JOptionPane.showMessageDialog(null, "¿Como estas?");
   break;
   case 3:
   JOptionPane.showMessageDialog(null, "adios");
   break;
   default: 
   JOptionPane.showMessageDialog(null, "opcion inexistente");
   break;
   }

}
}