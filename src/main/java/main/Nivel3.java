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
                
        //ciclo cuenta de valores repetidos
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
    
    //Ejercicio 12
    public void separarCaracteres()
    {
        //Indicar el tamaño deseado
        int tamano = Integer.parseInt(JOptionPane.showInputDialog("¿De que tamaño desea que sea el arreglo?"));
        char[] letras = new char[tamano];
        char letra = ' ';
        int vocal = 0;
        int consonantes = 0;
        int otros = 0;
        
        //extra
        int cant = 1;
        
        //Ciclo for para digitar un caracter y registrar tipo
        for (int i = 0; i < letras.length; i++) 
        {
            letra = JOptionPane.showInputDialog("Escriba el caracter #"+cant+" que requiera").charAt(0);
            letras[i] = letra;
            cant++;
            
            if (letras[i]== 'a' || letras[i]== 'e' || letras[i]== 'i' || letras[i]== 'o' || letras[i]== 'u')
            {
                vocal++;
            }
            else if(letras[i]>='a' && letras[i]<='z')
            {
                consonantes++;
            }
            else
            {
                otros++;
            }

        }//fin for
        
        //Resultado
            JOptionPane.showMessageDialog(null,"----------------\nCantidad vocales: "+vocal
                                            +"\nCantidad consonantes: "+consonantes
                                            +"\nCantidad de caracteres especiales/no identificados: "+otros);
        
    }//fin ejercicio 12
    
}//fin clase nivel3
