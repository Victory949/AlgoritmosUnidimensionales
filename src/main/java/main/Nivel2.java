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
        
        if(tamano>0)
        {
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
        JOptionPane.showMessageDialog(null,String.format("Promedio del arreglo es de : %.2f%n",prom));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Seleccione un numero valido");
        }
        
    }//fin ejercicio 5
    
    //Ejercicio 6
    public void asistencia()
    {
       boolean asistencias[] = new boolean[20];
       int respuesta = 0;
       int valorV = 0;
       int valorF = 0;
       int porcentaje = 0;
       int cant = 1;
       
       //ciclo for para registrar asistencia
       for(int i = 0;i<asistencias.length; i++)
        {
            respuesta=Integer.parseInt(JOptionPane.showInputDialog("Ha asisitido hoy el alumno #"+cant+"\n1. Si ha asistido\n2. Ausencia"));
            if(respuesta == 1)
            {
                asistencias[i]=true;
                valorV++;
            }
            else if(respuesta == 2)
            {
                asistencias[i]=false;
                valorF++;
            }
            else if (respuesta!=2 && respuesta!=1)
            {
                JOptionPane.showMessageDialog(null,"Seleccione una opción\n1. Si ha asistido\n2. Ausencia");
            }
            
            //Variable decorativa
            cant++;
            
        }//fin for
         
         porcentaje=(valorV*100)/20;
         
        JOptionPane.showMessageDialog(null,"Cantidad de Alumnos = 20\nAsistencias = "+valorV+"\nAusencias = "+valorF+"\nPorcentaje Asistencia = "+porcentaje+"%");
    }//fin ejercicio 6
    
    //Ejercicio 7
    public void cantidadVocales(){
        char[] vocales={'a','e','i','o','u','á','é','í','ó','ú'};
        
        String arreglo= JOptionPane.showInputDialog("Escriba una palabra");
        int contador=0;
        
        for (int i=0;i<arreglo.length();i++){
            for(char v:vocales){
                if(arreglo.charAt(i)==v)contador++;
            }
        }
      JOptionPane.showMessageDialog(null, "Cantidad de vocales: "+contador); 
    }//Fin ejercicio 7
    
    //Ejercicio 8
    public void sumaNumeros(){
        
        int [] numeros = new int[15]; 
        int sumaPares =0;
        int sumaImpares=0;
        
        for (int i=0;i<numeros.length;i++){
            numeros[i] =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número en la posición "+i));
        }
        for (int i=0;i<numeros.length;i++){
            if (i%2 == 0){
               sumaPares+=numeros[i];
            }else{
                sumaImpares+=numeros[i];
            }
          }
        String resultado = "Suma en índices pares: "+sumaPares
                +"\n Suma en índices impares: "+sumaImpares;
    
        JOptionPane.showMessageDialog(null,resultado);         
    }//Fin ejercicio 8
    
}//fin clase Nivel2
