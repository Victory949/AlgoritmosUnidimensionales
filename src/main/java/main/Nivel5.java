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
    //Ejercicio 1
    public void sumaArreglos()
    {
        //Indicar el tamaño deseado
        int tamano = Integer.parseInt(JOptionPane.showInputDialog("¿De cuanto tamaño han de ser los arreglos?"));
       
         //Inicialización
        String total = "";
        int num = 0;
        
        int cantidades1[] = new int[tamano];
        int cantidades2[] = new int[tamano];
        int cantidades3[] = new int[tamano];
        
        if(tamano>0)
        {
            //ciclo for para digitar los numeros de los arreglos de cantidades1
            for (int i = 0; i < cantidades1.length; i++) {
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para el arreglo 1"));
                cantidades1[i] = num;
                JOptionPane.showMessageDialog(null, "Se ha ingresado con exito");

            }//fin ciclo for

            //ciclo for para digitar los numeros de los arreglos de cantidades2
            for (int i = 0; i < cantidades2.length; i++) {
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para el arreglo 2"));
                cantidades2[i] = num;
                JOptionPane.showMessageDialog(null, "Se ha ingresado con exito");

            }//fin ciclo for

            //ciclo for para sumar cantidades
            for (int i = 0; i < cantidades3.length; i++) {
                cantidades3[i] = cantidades1[i] + cantidades2[i];
            }//fin ciclo for

            for (int i = 0; i < cantidades3.length; i++) {
                total = total + "\n[" + i + "] = " + cantidades3[i];
            }
            
            JOptionPane.showMessageDialog(null, "La suma de los arreglos cantidades1 y cantidades 2 es: " + total);
            
        }//fin if
        else
        {
            JOptionPane.showMessageDialog(null,"Seleccione un tamaño mayor a 0");
        }
    }//fin metodo sumaArreglos
    
}//fin clase Nivel5
