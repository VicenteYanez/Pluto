/*
 * Clase Roca Qap
 * 
 * Versión 1.1
 * 
 * 8 de Marzo de 2013
 * 
 * Copyright Vicente Yáñez Cuadra
*/

package plutoQap;

/**
 * Clase que se encarga de todo lo que tiene que ver con nombrar la roca.
 * 
 * @version 1
 * @author Vicente Yáñez
 */

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class RocaQap {
    
    java.lang.String triangulo(float qz, float fa, float pl) {
        /*
         * Metodo que devuelve un String con el nombre de la roca, para esto
         * considera las relaciones entre los % de cuarzo, plagioclasa y 
         * Fesdespato alcalino
         */
        float LT;
        float a2, b2, c2;
        java.lang.String roca = new java.lang.String();
        LT = fa / pl;
        a2 = (float) (1.0 / 9.0);
        b2 = (float) (13.0 / 7.0);
        c2 = (float) (7.0 / 13.0);

        if (qz < 5 && LT < 9 && LT > b2) {
            roca = "Sianita";
        }
        else if (qz > 5 && qz < 20 && LT < 9 && LT > b2) {
            roca = "Sianita cuarcífera";
        }
        else if (qz > 5 && qz < 20 && LT > 9) {
            roca = "Sianita alcalina cuarcífera";
        }
        else if (qz < 5 && LT > 9) {
            roca = "Sianita alcalina";
        }
        else if (qz < 60 && qz > 20 && LT > 9) {
            roca = "Granito alcalino";
        }
        else if (qz < 60 && qz > 20 && LT < 9 && LT > c2) {
            roca = "Granito";
        }
        else if (qz < 60 && qz > 20 && LT < c2 && LT > a2) {
            roca = "Granodiorita";
        }
        else if (qz < 60 && qz > 20 && LT < a2) {
            roca = "Tonalita";
        }
        else if (qz < 20 && qz > 5 && LT < b2 && LT > c2) {
            roca = "Monzonita cuarcífera";
        }
        else if (qz < 20 && qz > 5 && LT < c2 && LT > a2) {
            roca = "Monzodiorita cuarcífera";
        }
        else if (qz < 20 && qz > 5 && LT < a2) {
            roca = "Diorita cuarcífera";
        }
        else if (qz < 5 && LT < b2 && LT > c2) {
            roca = "Monzonita";
        }
        else if (qz < 5 && LT < c2 && LT > a2) {
            roca = "Monzodiorita";
        }
        else if (qz < 5 && LT < a2) {
            roca = "Diorita, gabro, anortosita";
        }
        //Para casos donde el resultado se encuentre en una linea o interseccion
        else if (qz == 5 || qz == 20 || qz == 60 || LT == 9 || LT == a2 
                || LT == b2 || LT == c2) {
            roca = "Estas sobre una linea u interseccion";
        }

        return roca;
    }

    float normalizador(float qz, float ort, float pl, float micro, float ol, 
            float cpx, float opx, float anf, float bt, float musc, 
            float otros, int eleccionMineral) {
        
        /*
        * El metodo normaliza el mineral pedido. Puede ser qz, plagioclasa o 
        * feldespato alcalino. Para elegir cual devuelve el metodo se usa la
        * variable eleccionMineral. Cuyo valor se ingresa como argumento cuando 
        * se llama al metodo. 
        * 1 : Plagioclasa
        * 2 : Cuarzo
        * 3 : Feldespato Alcalino
        */
        switch(eleccionMineral){
            case 1:
                float PL, sum1;
                sum1 = qz + pl + micro + ort;
                PL = ((float) (pl * 100) / sum1);
                return PL;
            case 2:
                float QZ, sum2;
                sum2 = qz + pl + micro + ort;
                QZ = ((float) (qz * 100) / sum2);
                return QZ;
            case 3:
                float FK, sum3;
                sum3 = qz + pl + micro + ort;
                FK = ((float) ((ort + micro) * 100) / sum3);
                return FK;   
            default:
                return 0;
        }              
    }
    
    float puntox(float PL, float FK, float QZ) {
        
        /*
         * Metodo que devuelve la posición del punto composicional en el eje x
         */
        float x;
        PL = PL/100;
        FK = FK/100;
        QZ = QZ/100;
        x = ((PL*550)+(FK*50)+(QZ*300));
        return x; 
    }
    
    float puntoy(float PL, float FK, float QZ) {
        /*
         * Metodo que devuelve la posicion del punto composicional en el eje y
         */
        float y;
        PL = PL/100;
        FK = FK/100;
        QZ = QZ/100;
        y = ((PL*520)+(FK*520)+(QZ*87));
        return y;
    }
    
    /*String dealgo(float ol, float opx, float cpx, float anf, float bt, 
     * float musc)
    {
        //este metodo ordena de mayor a menor los minerales, y en caso de que 
        * estos sean mayor o igual a 5%, agrega el sufico "...de xMineral"
        int[] minerales ={(int)ol, (int)opx, (int)cpx, (int)anf, (int)bt, 
        * (int)musc};
        String[] nMinerales = {"de olivino", "de ortopiroxeno", 
        * "de clinopiroxeno", "de anfibol", "de biotita", "de muscovita"};
        
        int[] mineralesTemp = new int[6];
        ordenar(minerales, mineralesTemp);
        String deMineral;
        deMineral = "";
        for(int i = 5 ; i >= 0; i--){
            
        }
        if()
        
        return deMineral;
    }*/
    
    public static void ordenar(int array[],int arrayTemp[]) {
        /*
         * Clase que ordenaria los valores de minerales en orden decreciente
         * AUN NO OPERATIVO!!!!
         */
		int n=0;
		SortedSet<Integer> sortedSet = new TreeSet<Integer>();
		for(int index=0;index<array.length;index++){
			sortedSet.add(array[index]);
		}
		Iterator<Integer> s = sortedSet.iterator();
			while(s.hasNext()){
				arrayTemp[n]=s.next();
				n++;
			}
		}
}


