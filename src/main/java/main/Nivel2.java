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
public class Nivel2 
{
    //Ejercicio 5
    public void promedioDecimal()
    {
        //Indicar el tamaño deseado
        int tamano = Integer.parseInt(JOptionPane.showInputDialog("¿De cuanto tamaño han de ser los arreglos?"));
        
        //Def Variables
        double decimal = 0.0;
        double valores[] = new double[tamano];
        double suma = 0;
        
        //ciclo for para leer los numeros del arreglo
        for (int i = 0; i < valores.length; i++) {
            decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero con decimales"));
            valores[i] = decimal;
            
        }
        //ciclo para sacar la suma de los valores
        for(int i = 0;i<valores.length; i++)
        {
                suma+=valores[i];
        }
        
        double prom = suma/tamano;
        JOptionPane.showMessageDialog(null,String.format("Promedio: %.2f%n",prom));
        
    }//fin ejercicio 5
    
}//fin clase Nivel2
