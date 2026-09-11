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
    private int opcion, numEje;
    private Nivel2 n2 = new Nivel2();
    private Nivel4 n4 = new Nivel4();
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
                    n2.promedioDecimal();
                break;
                
                case 3:
                    
                break;
                
                case 4:
                    
                    n4.copiaArreglo();
                break;
                
                case 5:
                    subMenu5();
                break;
                
                case 6:
                    
                break;
                
                default:
            }//fin switch
            
        }while(opcion!=6);
    }//fin menuPrincipal
    
    public void subMenu5()
    {
        do
        {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("\n===================================="
                                                              + "\n             1.      Ver Ejercicio 17"
                                                              + "\n             2.      Ver Ejercicio 18"
                                                              + "\n             3.      Ver Ejercicio 19"
                                                              + "\n             4.      Ver Ejercicio 20"
                                                              + "\n             5.            Salir"
                                                              + "\n===================================="));
            
            switch(opcion)
            {
                case 1:
                    n5.simetria();
                break;
                
                case 2:
                    
                break;
                
                case 3:
                    
                break;
                
                case 4:
                     n5.sumaArreglos();
                break;
                
                case 5:
                    
                   
                break;
                
                default:
            }//fin switch
            
        }while(numEje!=5);
    }//fin subMenu5
    
}//fin clase menu


