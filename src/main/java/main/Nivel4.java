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
        
        
    }//fin ejericio 14
    
    //Ejericio 16
    public void intercambioIndices()
    {
        //Indicar el tamaño deseado
        int tamano = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos libros aberga su estante?"));
        
        int num = 0;
        int libreria[] = new int[tamano];
        int indice1 = 0;
        int indice2 = 0;
        int temporal = 0;
        String resultado = "";
        
        //ciclo for para elegir los valores del arreglo
        for (int i = 0; i < libreria.length; i++) {
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de libro que ha escogido"));
            libreria[i] = num;
                    
        }//fin ciclo for
        
       //ciclo for resultado
       for (int i = 0; i < libreria.length; i++)
       {
           resultado += "\n["+i+"] = "+libreria[i];
       }//fin ciclo for
        
        
       JOptionPane.showMessageDialog(null,"----Libreria----"+resultado);
       
       
       //Consulta de los dos indices que desee intercambiar
       indice1= Integer.parseInt(JOptionPane.showInputDialog("Elija el primer digito que desee intercambiar de la librería"));
       indice2= Integer.parseInt(JOptionPane.showInputDialog("Elija el segundo digito que desee intercambiar de la librería"));
            
        //IF para verificar que los indices correspondan al arreglo
        if(indice1>=0 && indice1<libreria.length && indice2>=0 && indice2<libreria.length)
        {
            JOptionPane.showMessageDialog(null,"["+indice1+"]->["+indice2+"]");
            temporal = libreria[indice1];
            libreria[indice1] = libreria[indice2];
            libreria[indice2] = temporal;
            
            //ACTUALIZACIÓN DE RESULTADO
            for (int i = 0; i < libreria.length; i++) {
                resultado += "\n[" + i + "] = " + libreria[i];
            }//fin ciclo for
            
            JOptionPane.showMessageDialog(null,"----Libreria----"+resultado);
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Uno de los indices seleccionados no corresponde al arreglo");
        }
            
        
        
        
    }//fin ejericico 16
    
    
    
}//fin clase Nivel4
