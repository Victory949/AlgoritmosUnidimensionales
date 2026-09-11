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
public class Nivel5 
{
    //Ejercicio 17
    public void sumaArreglos()
    {
        String total = "";
        int cantidades1[] = {2,4,6,8,10};
        int cantidades2[] = {1,3,7,9,13};
                
        int cantidades3[] = new int[5];

        //ciclo for para sumar cantidades
        for (int i = 0; i < cantidades3.length; i++)
        {
            cantidades3[i] = cantidades1[i] + cantidades2[i];
        }//fin ciclo for
        
        for (int i = 0; i<cantidades3.length; i++)
        {
            total= total+"\n["+i+"] = "+cantidades3[i];
        }
        JOptionPane.showMessageDialog(null, "La suma de los arreglos cantidades1 y cantidades 2 es: "+total);
    }//fin metodo sumaArreglos
    
}//fin clase Nivel5
