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
public class Menu 
{
    //Inicialización
    private int opcion;
    private Nivel5 n5 = new Nivel5();
    
    public void menuPrincipal()
    {
        do
        {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("\n===================================="
                                                              + "\n     Ingrese el nivel que desee observar"
                                                              + "\n             1.      Nivel 1"
                                                              + "\n             2.      Nivel 2"
                                                              + "\n             3.      Nivel 3"
                                                              + "\n             4.      Nivel 4"
                                                              + "\n             5.      Nivel 5"
                                                              + "\n             6.      Salir"
                                                              + "\n===================================="));
            
            switch(opcion)
            {
                case 1:
                    
                break;
                
                case 2:
                    
                break;
                
                case 3:
                    
                break;
                
                case 4:
                    
                break;
                
                case 5:
                    n5.sumaArreglos();
                break;
                
                case 6:
                    
                break;
                
                default:
            }//fin switch
            
        }while(opcion!=6);
    }//fin menuPrincipal
    
}//fin clase menu
