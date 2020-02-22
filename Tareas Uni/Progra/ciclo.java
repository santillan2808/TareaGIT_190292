import javax.swing.*;
public class ciclo{
  public static void main(String args[]){
  int j; 
  String i, y;
  j=0;
  i="";//acumulador 
  y="*";
  while(j<5){
  //instrucción;
  i=i+y+"\n";
 //contador;
  j++;
  }
  JOptionPane.showMessageDialog(null, i);
}
}