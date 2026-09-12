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
public class Nivel3 
{
    //Ejercicio 11
    public void cantValor()
    {
        int[] valores = new int[12];
        int num = 0;
        int valorBuscado = 0;
        int repetido = 0;
        //extra
        int cant = 1;
        
        //ciclo for para leer los numeros del arreglo
        for (int i = 0; i < valores.length; i++) 
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Escriba el valor #"+cant+" que requiera"));
            valores[i] = num;
            
            cant++;
            
        }//fin for
        
        valorBuscado=Integer.parseInt(JOptionPane.showInputDialog("Escriba el valor que busca ver"));
                
        //ciclo cuuenta de valores repetidos
        for (int i = 0; i < valores.length; i++) 
        {
            
            if(valores[i]==valorBuscado)
            {
                repetido++;
            }
            
            
        }//fin for
        
        if(repetido>1)
        {
            JOptionPane.showMessageDialog(null,"La cantidad de veces que el valor "+valorBuscado+" se ha repetido es de: "+repetido);
        }
        else if (repetido==1)
        {
            JOptionPane.showMessageDialog(null,"No han habido repeticiones de ese valor");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Seleccione un numero dentro del arreglo");
        }
        
    }//fin ejercicio 11
    
}//fin clasenivel3
