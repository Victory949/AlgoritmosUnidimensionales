/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author aaron
 */
public class Nivel1 
{

    //Ejercicio 1
    public void longitudDecimales () {
        
        double[] numeros={1.75,3.50,7.42,9.99};
        
        int longitud =numeros.length;
        double ultimoElemento=numeros[numeros.length];
        
        String resultado= "Longitud del arreglo: "+longitud+
                          "\n Ultimo elemento: "+ultimoElemento;
                
          JOptionPane.showMessageDialog(null, resultado);
        
    } //Fin del ejercicio 1
    
    //Ejercicio 2
    public void posicionBoolean (){
        
        boolean [] valores = {true, true, false, true, false, true};
        String resultado = "";
        
        for (int i=0;i<valores.length; i++){
            resultado +="Posición "+i+": "+valores[i];
        }
        JOptionPane.showMessageDialog(null, resultado);
        
    }//Fin del ejercicio 2
    
    

    //Ejercicio 3
    public void leerArreglo()
    {
        //Consultar tamaño
        int tamano = Integer.parseInt(JOptionPane.showInputDialog("¿Que tan grande desea su arreglo?"));
        
        int num = 0;
        int[] numeros = new int[tamano];
        String resultado ="";

        
        //ciclo for para conseguir resultado y registrar numeros
        for (int i = 0; i < numeros.length; i++) 
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Registre el numero que desee"));
            numeros[i] = num;
            resultado += "\n"+numeros[i];
            
        }
        
        JOptionPane.showMessageDialog(null,"--------------"+ resultado +"\n--------------");
        
    }//fin ejericicio 3

    //Ejericio 4
    public void completarPalabra()
    {
        String palabra = JOptionPane.showInputDialog("Escriba una palabra");
        char[] caracteres = new char[palabra.length()];
        String resultado ="";
        
        
        //ciclo for para convertir una palabra conocida a un arreglo de caracteres
        for (int i = 0; i < caracteres.length; i++) 
        {
            
            caracteres[i]= palabra.charAt(i);
            resultado += "\n"+caracteres[i];
            
        }
        
        JOptionPane.showMessageDialog(null,"--------------"+ resultado +"\n--------------");
    } //fin ejercicio 4
    
}//fin clase Nivel1
