/*
 * Clase GraficoQap
 * 
 * Versión 1.1
 * 
 * 8 de Marzo de 2013
 * 
 * Copyright Vicente Yáñez Cuadra
*/

package plutoQap;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class GraficoQap extends Canvas {
    /**
     *clase hereda de Canvas, contiene los metodos para dibujar, 
     * y trabajar con el grafico 
     */
    public GraficoQap()
    {
        //constructor
        setSize(600,600);
        setVisible(true);
    }
    
    //variables globales de la clase 
    int x, y;
    int[] coordenadax = new int[1000];
    int[] coordenaday = new int[1000];
    String[] nMuestra = new String[1000];
    String[] mColor = new String[1000];
    boolean escritura = true;
    boolean nombMuestra = true;
    boolean numeroMuestrasTrabajo = true;
    /**
     *
     * @param g
     */

    @Override
    public void paint(Graphics  g) {
        
        /*
         * Metodo que sobreescribe el metodo paint.
         * Con esto se pinta el grafico, incluyendo los puntos de muestras cada
         * vez que se redibuja el grafico
         */
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setFont(new Font( "Serif", Font.ROMAN_BASELINE, 12 ) );
        g.setColor(Color.black);
        
        //Triangulo
        int xPoints[] = {300, 50, 550};
        int yPoints[] = {87, 520, 520};
        g.drawPolygon(xPoints, yPoints, 3);
        g.setFont(new Font( "Serif", Font.BOLD, 16 ) );
        g.drawString("Q", 295, 85);
        g.drawString("A", 35, 525);
        g.drawString("P", 555, 525);
        g.setFont(new Font( "Serif", Font.ROMAN_BASELINE, 12 ) );
        
        //Lineas horizontales
        g.setColor(Color.gray);
        g.drawLine(399, 260, 200, 260);
        g.drawLine(100, 433, 500, 433);
        g.drawLine(62, 500, 538, 500);
       
        //Lineas transversales
        g.drawLine(380, 260, 500, 520);
        g.drawLine(330, 260, 375, 520);
        g.drawLine(240, 433, 225, 520);        
        g.drawLine(220, 260, 100, 520);
        
        //Numeros de %
        g.setColor(Color.black);        
        g.drawString("90",500 , 535);
        g.drawString("65",370 , 535);
        g.drawString("35",220 , 535);
        g.drawString("10",95 , 535); 
        g.drawString("60", 405, 265);
        g.drawString("20",505 , 438);
        g.drawString("5", 543, 505);
        g.drawString("60", 180, 265);
        g.drawString("20", 80 , 438);
        g.drawString("5", 50, 505);
        
        //Texto nombre de los campos
        if(escritura){
            g.drawString("Granito", 245, 350);
            g.drawString("Gabro, Diorita", 495, 560);
            g.drawString("Anortosita", 495, 575);
            g.drawString("Sienita alcalina", 45, 559);
            g.drawString("Sienita", 150, 515);
            g.drawString("Monzonita", 270, 515);
            g.drawString("Monzogabro", 400, 560);
            g.drawString("Monzodiorita", 400, 575);
            g.drawString("Monzogabro/", 380, 455);
            g.drawString("Monzodiorita", 380, 470);
            g.drawString("cuarcífero/a", 380, 485);
            g.drawString("Monzonita", 270, 470);
            g.drawString("cuarcífera", 270, 480);
            g.drawString("Sienita", 155, 470);
            g.drawString("cuarcífera", 146, 480);
            g.drawString("Sienita alcalina", 2, 400);
            g.drawString("cuarcífera", 2, 418);
            g.drawString("Gabro/Diorita", 510, 400);
            g.drawString("cuarcífera", 510, 418);
            
            //lineas verticales
            g.drawLine(525, 510, 525, 550);
            g.drawLine(80, 510, 80, 550);
            g.drawLine(440, 510, 440, 550);
        
            /*linea de la sianita alcalina cuarcífera y
             * diorita/gabro cuarcifero*/
            g.drawLine(90, 470, 40, 420);
            g.drawLine(490, 470, 540, 420);
        
            //texto rotado
            Graphics2D g2d=(Graphics2D)g;  
            AffineTransform at=new AffineTransform();  
            at.setToRotation(Math.PI*0.33);  
            g2d.setTransform(at);
            g2d.drawString("Tonalita", 500, -195);

            Graphics2D g3d=(Graphics2D)g;  
            AffineTransform a3=new AffineTransform();  
            a3.setToRotation(-Math.PI*561/100);  
            g3d.setTransform(a3);  
            g3d.drawString("Granodiorita",430, -240);

            Graphics2D g4d=(Graphics2D)g;  
            AffineTransform a4=new AffineTransform();  
            a4.setToRotation(-Math.PI*0.35);  
            g4d.setTransform(a4);  
            g4d.drawString("Granito alcalino",-275, 307);
            a4.setToRotation(Math.PI*0.0);
            g4d.setTransform(a4);
        }
        
        //dibujar puntos de composición modal en grafico QAP 
        g.setFont(new Font( "Serif", Font.BOLD,  12 ) );
        for (int i = 0; i < coordenadax.length; i++) 
        {
            if(coordenadax[i] != 0){
                /*primero se fija el color con el que se va a dibujar el punto 
                 * de composición modal y el codigo de la muestra*/
                if("Azul".equals(mColor[i])){
                    g.setColor(Color.blue);
                }
                else if("Rojo".equals(mColor[i])){
                    g.setColor(Color.red);
                }
                else if("Verde".equals(mColor[i])){
                    g.setColor(Color.green.darker());
                }
                else if("Magenta".equals(mColor[i])){
                    g.setColor(Color.magenta);
                }
                else if("Negro".equals(mColor[i])){
                    g.setColor(Color.black);
                }
                g.drawOval(coordenadax[i]-1, coordenaday[i]-1, 3, 3);
                g.fillOval(coordenadax[i]-1, coordenaday[i]-1, 3, 3);
                /*escribir el nº de muestra a la derecha del punto de 
                 * composición modal siempre que nombMuestra sea true*/
                if (nombMuestra){
                    g.drawString(nMuestra[i], coordenadax[i]+5, 
                            coordenaday[i]+2);      
                }                 
            }
        }
    }
    
    public void obtener(float X, float Y, int largo, String color) {
        /*metodo para agregar valores a las matrices coordenadax/y usando 
         * System.arraycopy primero de obtienen las variables para el 
         * constructor: las coordenadas del punto y el color condicional sirve 
         * para determinar si se agregan más muestras al grafico o si solo 
         * se trabaja con una que cambia cada vez que se ejecuta el codigo*/
        if (numeroMuestrasTrabajo){
            String[] textColor = new String[1];
            textColor[0] = color;
            x = (int)X;
            y = (int)Y;
            int mx[], my[];
            mx = new int[1]; 
            my = new int[1];
            mx[0] = x;
            my[0] = y;
            /*System.arraycopy(aOrigen, inicioArrayOrigen, aDestino, 
             * inicioArrayDestino, numeroElementosACopiar)*/
            System.arraycopy(mx, 0, coordenadax, largo, 1); 
            System.arraycopy(my, 0, coordenaday, largo, 1);
            System.arraycopy(textColor, 0, mColor, largo, 1);            
        }
        else {
            String[] textColor = new String[1];
            largo = 1;
            textColor[0] = color;
            x = (int)X;
            y = (int)Y;
            int mx[], my[];
            mx = new int[1]; 
            my = new int[1];
            mx[0] = x;
            my[0] = y;
            /*System.arraycopy(aOrigen, inicioArrayOrigen, aDestino, 
             * inicioArrayDestino, numeroElementosACopiar)*/
            System.arraycopy(mx, 0, coordenadax, largo, 1); 
            System.arraycopy(my, 0, coordenaday, largo, 1);
            System.arraycopy(textColor, 0, mColor, largo, 1);            
        }   
     }
    
    public void nMuestra(String muestra, int largo)
    {
        //pequeño metodo para obtener el codigo de muestra elegido
        String[] text = new String[1];
        text[0] = muestra;
        if (numeroMuestrasTrabajo){
                        /*System.arraycopy(aOrigen, inicioArrayOrigen, aDestino, 
                         * inicioArrayDestino, numeroElementosACopiar)*/
            System.arraycopy(text, 0, nMuestra, largo, 1);
        }
        else {
            System.arraycopy(text, 0, nMuestra, 1, 1);
        }
        
    }
    
    public void reiniciar()
    {
        //metodo para reiniciar valores de coordenadasx/y
        for (int i = 0; i <= 999; i++){
            coordenadax[i] = 0;
            coordenaday[i] = 0;
            nMuestra[i] = "";
            mColor[i] = "";
            continue;
        }

     }
   public void nCampos(boolean campos){
       if(campos){
           escritura = true;
       }
       else {
           escritura = false;
       }
   }
   
   public void nombMuestras(boolean nombre){
       if (nombre){
           nombMuestra = true;
       }
       else {
           nombMuestra = false;
       }
   }
   public void numeroMuestras(boolean activar){
       if(activar){
           numeroMuestrasTrabajo = true;
       }
       else {
           numeroMuestrasTrabajo = false;
       }
   }
       public void borrarUltimo()
    {
        //metodo para reiniciar valores de coordenadasx/y
        for (int i =999; i>=0; i--){
            if(coordenadax[i] != 0){
                coordenadax[i] = 0;
                coordenaday[i] = 0;
                nMuestra[i] = "";
                mColor[i] = "";
                break;
            }
        }
     }
}
           
    
    
