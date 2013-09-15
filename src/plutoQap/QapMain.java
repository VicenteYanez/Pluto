/*
 * Clase QapMain.java
 * 
 * Versión 1.1
 * 
 * 8 de Marzo de 2013
 * 
 * Copyright Vicente Yáñez Cuadra 2012-2013. Todos los derechos reservados
 * 
 * Licencia GPLv3
*/

package plutoQap;

/**
 * Clase que inicia el programa creando una instancia de la clase Interfaz.java
 * 
 * @version 1 
 * @author Vicente Yáñez
 */
public class QapMain {

    public static void main(String[] args) {
        
       Interfaz ventana = new Interfaz();
       ventana.setVisible(true);
       ventana.setLocation(40, 50);
       ventana.setResizable(false);
    }
}
