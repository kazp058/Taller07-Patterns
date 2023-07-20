/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorMethod;

/**
 *
 * @author Kevin Magallanes
 */
public class TareaSimpleFactory implements TareaFcatory {
    @Override
    public Tarea crearTarea(){
        return new TareaSimple();
    }
}
