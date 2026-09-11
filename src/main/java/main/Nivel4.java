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
public class Nivel4 {
    
    //ejericio 14
    public void copiaArreglo()
    {
        int num = 0;
        int fila[] = new int[10];
        int filaCopia[] = new int[10]; 
        
        //ciclo for para registrar los 10 enteros que desee el usuario
        for (int i = 0; i < fila.length; i++) {
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite el digito que desee ingresar a su fila"));
            fila[i] = num;
            filaCopia[i] = num;
            JOptionPane.showMessageDialog(null, "Se ha ingresado con exito!!");

        }//fin ciclo for
        
        JOptionPane.showMessageDialog(null,"[0] de fila"+fila[0]+" y [0] de copia"+filaCopia[0]);
        
        //ciclo for para modificar el arreglo copiado
        for (int i = 0; i < filaCopia.length; i++) {
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite el digito que desee ingresar a la copia de su fila"));
            filaCopia[i] = num;
            
        }
        JOptionPane.showMessageDialog(null,"[0] de fila"+fila[0]+" y [0] de copia"+filaCopia[0]);
        
        
    }//fin copiaArreglo
    
}//fin clase Nivel4
