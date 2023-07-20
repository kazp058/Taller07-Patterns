/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller7;

import factorMethod.*;


/**
 *
 * @author Kevin Magallanes
 */
public class Taller7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        // patron FactorMethod
        TareaFcatory tareaSimpleFactory = new TareaSimpleFactory();
        Tarea tareaSimple = tareaSimpleFactory.crearTarea();
        tareaSimple.ejecutar();
        
        TareaFcatory tareaComplejaFactory =new TareaComplejaFactory();
        Tarea tareaCompleja = tareaComplejaFactory.crearTarea();
        tareaCompleja.ejecutar();
    }
    
    
    
}
