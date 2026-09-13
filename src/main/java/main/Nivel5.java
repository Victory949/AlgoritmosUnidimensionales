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
    
    //Ejercicio 18
    public void diferentePrecios(){
    double[] precios1={12.50, 8.75, 20.00, 15.30, 9.99};
    double[] precios2={10.20, 9.50, 18.75, 16.00, 7.49};
    double[] diferencias=new double[precios1.length];
    
    double suma=0;
    
    for(int i=0;i<precios1.length;i++){
        diferencias[i]=Math.abs(precios1[i]-precios2[2]);
        suma+=diferencias[i];  
    }
    double promedio=suma/diferencias.length;
    
    String resultado="Diferencias:\n";
    for (int i=0;i<diferencias.length;i++){
        resultado+=diferencias[i]+"";
    }
    resultado+="\n\nPromedio de las diferencias: "+promedio;
    
    JOptionPane.showMessageDialog(null,resultado);
    }//Fin del ejercicio18
    
    //Ejercicio 19
    public void ordenAscendente(){
        int[] numeros=new int [10];
        
        for(int i=0;i<numeros.length;i++){
          numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero en la posicion "+i));
        }
        boolean ordenado=true;//se asume hasta que se demuestre lo contrario\
        
        for(int i=0;i<numeros.length-1;i++){
            if (numeros[i]>numeros[i+1]){
                ordenado=false;
                break;
            }
        }
        String resultado;
        if (ordenado){
            resultado="El arreglo SI esta ordenado de forma ascendente";
        }else{
            resultado="El arreglo NO esta ordendo de forma ascente";
       }
        JOptionPane.showMessageDialog(null,resultado);
    }//Fin del ejercico 19
    
    //Ejercicio 20
    public void simetria()
    {
        //Indicar el tamaño deseado
        int tamano = Integer.parseInt(JOptionPane.showInputDialog("¿De cuanto tamaño han de ser los arreglos?"));
        
        //Def Variables
        int num = 0;
        int orden[] = new int[tamano];
        boolean noEsCapicúa = false;
        
        //ciclo for para leer los numeros del arreglo
        for (int i = 0; i < orden.length; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            orden[i] = num;
            
        }
        
        int fin = orden.length-1;
        
        for(int i = 0; i < orden.length; i++)
        {
            if (orden[i] != orden[fin]) 
            {
                noEsCapicúa = true;
            } 
            else 
            {                
               fin--;
            }
        }//fin for
        
        if(noEsCapicúa==false)
        {
             JOptionPane.showMessageDialog(null,"Es capicúa");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No es capicúa");
        }
    }//fin metodo simetria
}//fin clase Nivel5
