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
                    
        }//fin ciclo for
        
        JOptionPane.showMessageDialog(null,"Fila - Fila Copia"
                +"\n[0] = "+fila[0]+" |  [0] = "+filaCopia[0]+
                "\n[1] = "+fila[1]+" |  [1] = "+filaCopia[1]+
                "\n[2] = "+fila[2]+" |  [2] = "+filaCopia[2]+
                "\n[3] = "+fila[3]+" |  [3] = "+filaCopia[3]+
                "\n[4] = "+fila[4]+" |  [4] = "+filaCopia[4]+
                "\n[5] = "+fila[5]+" |  [5] = "+filaCopia[5]+
                "\n[6] = "+fila[6]+" |  [6] = "+filaCopia[6]+
                "\n[7] = "+fila[7]+" |  [7] = "+filaCopia[7]+
                "\n[8] = "+fila[8]+" |  [8] = "+filaCopia[8]+
                "\n[9] = "+fila[9]+"  |  [9] = "+filaCopia[9]);
        
        //ciclo for para modificar el arreglo copiado
        for (int i = 0; i < filaCopia.length; i++) {
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite el digito que desee ingresar a la copia de su fila"));
            filaCopia[i] = num;
            
        }
        JOptionPane.showMessageDialog(null,"Fila - Fila Copia"
                +"\n[0] = "+fila[0]+" | [0] = "+filaCopia[0]+
                "\n[1] = "+fila[1]+" | [1] = "+filaCopia[1]+
                "\n[2] = "+fila[2]+" | [2] = "+filaCopia[2]+
                "\n[3] = "+fila[3]+" | [3] = "+filaCopia[3]+
                "\n[4] = "+fila[4]+" | [4] = "+filaCopia[4]+
                "\n[5] = "+fila[5]+" | [5] = "+filaCopia[5]+
                "\n[6] = "+fila[6]+" | [6] = "+filaCopia[6]+
                "\n[7] = "+fila[7]+" | [7] = "+filaCopia[7]+
                "\n[8] = "+fila[8]+" | [8] = "+filaCopia[8]+
                "\n[9] = "+fila[9]+" | [9] = "+filaCopia[9]);
        
        
    }//fin copiaArreglo
    
}//fin clase Nivel4
