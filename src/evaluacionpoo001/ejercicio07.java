/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionpoo001;

/**
 *
 * @author fernandogupioc
 */
public class ejercicio07 {
    
       public static void main(String[] args) { 
          
          //Dada la siguiente sentencia, encontrar el resultado
int x=1, y=2, z=3;
if (++x > y++ || x-- > 0)
z++;
else
z--;
System.out.println(x+" "+y+" "+z);
          
          //da como resultado 2 3 4
      }
}
