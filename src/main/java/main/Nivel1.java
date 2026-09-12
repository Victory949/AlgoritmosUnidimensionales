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
        
        JOptionPane.showMessageDialog(null,"--------------\n"+ resultado +"\n--------------");
    } //fin ejercicio 4
    
}//fin clase Nivel1
