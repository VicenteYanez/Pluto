/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plutoQap;

import javax.swing.DefaultListModel;

/**
 *
 * @author vicente
 */
public class Lista extends javax.swing.JList{
    
    //variables globales
    DefaultListModel modelo;
    
    public Lista(){
        setModel(modelo);
    }
    
    //metodo para agregar valores
    public void agregarValores(String valor){
        modelo.addElement(valor);
    }
    
    //metodo para eliminar valores
    public void eliminarValores(int valor){
        modelo.removeElementAt(valor);
    }
}
