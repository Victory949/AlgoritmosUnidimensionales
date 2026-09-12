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
    private Nivel1 n1 = new Nivel1();
    private Nivel2 n2 = new Nivel2();
    private Nivel3 n3 = new Nivel3();
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
                    subMenu1();
                break;
                
                case 2:
                    subMenu2();
                break;
                
                case 3:
                    subMenu3();
                break;
                
                case 4:
                    subMenu4();
                break;
                
                case 5:
                    subMenu5();
                break;
                
                case 6:
                    JOptionPane.showMessageDialog(null,"Muchas gracias por su visita! Tenga bonito día");
                break;
                
                default:
                    JOptionPane.showMessageDialog(null,"Seleccione una opcion valida");
            }//fin switch
            
        }while(opcion!=6);
    }//fin menuPrincipal
    
    public void subMenu1()
    {
        do
        {
            numEje=Integer.parseInt(JOptionPane.showInputDialog("\n===================================="
                                                              + "\n             1.      Ver Ejercicio 1"
                                                              + "\n             2.      Ver Ejercicio 2"
                                                              + "\n             3.      Ver Ejercicio 3"
                                                              + "\n             4.      Ver Ejercicio 4"
                                                              + "\n             5.            Salir"
                                                              + "\n===================================="));
            
            switch(numEje)
            {
                case 1:
                    
                break;
                
                case 2:
                   
                break;
                
                case 3:
                        n1.leerArreglo();
                break;
                
                case 4:
                        n1.completarPalabra();
                break;
                
                case 5:
                    JOptionPane.showMessageDialog(null,"Ha salido del Nivel 1 con exito");
                break;
                
                default:
                    JOptionPane.showMessageDialog(null,"Seleccione una opcion valida");
            }//fin switch
            
        }while(numEje!=5);
    }//fin subMenu1
    
    public void subMenu2()
    {
        do
        {
            numEje=Integer.parseInt(JOptionPane.showInputDialog("\n===================================="
                                                              + "\n             1.      Ver Ejercicio 5"
                                                              + "\n             2.      Ver Ejercicio 6"
                                                              + "\n             3.      Ver Ejercicio 7"
                                                              + "\n             4.      Ver Ejercicio 8"
                                                              + "\n             5.            Salir"
                                                              + "\n===================================="));
            
            switch(numEje)
            {
                case 1:
                    n2.promedioDecimal();
                break;
                
                case 2:
                    n2.asistencia();
                break;
                
                case 3:
                    
                break;
                
                case 4:
                     
                break;
                
                case 5:
                    JOptionPane.showMessageDialog(null,"Ha salido del Nivel 2 con exito");
                   
                break;
                
                default:
                    JOptionPane.showMessageDialog(null,"Seleccione una opcion valida");
            }//fin switch
            
        }while(numEje!=5);
    }//fin subMenu2

    public void subMenu3()
    {
        do
        {
            numEje=Integer.parseInt(JOptionPane.showInputDialog("\n===================================="
                                                              + "\n             1.      Ver Ejercicio 9"
                                                              + "\n             2.      Ver Ejercicio 10"
                                                              + "\n             3.      Ver Ejercicio 11"
                                                              + "\n             4.      Ver Ejercicio 12"
                                                              + "\n             5.            Salir"
                                                              + "\n===================================="));
            
            switch(numEje)
            {
                case 1:
                    
                break;
                
                case 2:
                    
                break;
                
                case 3:
                    n3.cantValor();
                break;
                
                case 4:
                     n3.separarCaracteres();
                break;
                
                case 5:
                    JOptionPane.showMessageDialog(null,"Ha salido del Nivel 3 con exito");
                   
                break;
                
                default:
                    JOptionPane.showMessageDialog(null,"Seleccione una opcion valida");
            }//fin switch
            
        }while(numEje!=5);
    }//fin subMenu3
    
    public void subMenu4()
    {
        do
        {
            numEje=Integer.parseInt(JOptionPane.showInputDialog("\n===================================="
                                                              + "\n             1.      Ver Ejercicio 13"
                                                              + "\n             2.      Ver Ejercicio 14"
                                                              + "\n             3.      Ver Ejercicio 15"
                                                              + "\n             4.      Ver Ejercicio 16"
                                                              + "\n             5.            Salir"
                                                              + "\n===================================="));
            
            switch(numEje)
            {
                case 1:
                    
                break;
                
                case 2:
                    n4.copiaArreglo();
                break;
                
                case 3:
                    
                break;
                
                case 4:
                     n4.intercambioIndices();
                break;
                
                case 5:
                    JOptionPane.showMessageDialog(null,"Ha salido del Nivel 4 con exito");
                   
                break;
                
                default:
                    JOptionPane.showMessageDialog(null,"Seleccione una opcion valida");
            }//fin switch
            
        }while(numEje!=5);
    }//fin subMenu4
    
    
    public void subMenu5()
    {
        do
        {
            numEje=Integer.parseInt(JOptionPane.showInputDialog("\n===================================="
                                                              + "\n             1.      Ver Ejercicio 17"
                                                              + "\n             2.      Ver Ejercicio 18"
                                                              + "\n             3.      Ver Ejercicio 19"
                                                              + "\n             4.      Ver Ejercicio 20"
                                                              + "\n             5.            Salir"
                                                              + "\n===================================="));
            
            switch(numEje)
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
                    
                   JOptionPane.showMessageDialog(null,"Ha salido del Nivel 5 con exito");
                break;
                
                default:
                    JOptionPane.showMessageDialog(null,"Seleccione una opcion valida");
            }//fin switch
            
        }while(numEje!=5);
    }//fin subMenu5
    
}//fin clase menu


