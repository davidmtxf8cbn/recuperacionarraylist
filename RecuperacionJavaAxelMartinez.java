/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacion.java.axecl.martinez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class RecuperacionJavaAxeclMartinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        ArrayList<String> nombre = new ArrayList<String>();
        ArrayList<Float> tiempo = new ArrayList<Float>();
        ArrayList<Float> vel = new ArrayList<Float>();
        int mejor=0,peor=0,op = 1,cont=0,i; 
        float prom=0;
        
        while (op != 0){
            System.out.println("Nombre del estudiante");
            nombre.add(l.next());
            System.out.println("Velocidad del estudiante;  Presiona 0 para salir del ciclo");
            op = l.nextInt();
            
            if(op != 0){
                vel.add((float)op);
                tiempo.add(100/vel.get(vel.size()-1));
                prom = prom + tiempo.get(vel.size()-1);
            }
        }
        
        prom = prom / tiempo.size();
        
        for(i=0; i<vel.size(); i++){
            if(vel.get(i)>vel.get(mejor)){
                mejor = i;
            }
            
            if(vel.get(i)<vel.get(peor)){
                peor = i;
            }
            
            if(tiempo.get(i)>prom){
                cont=cont+1;
            }
            
             System.out.println(nombre.get(i) + "\t" + vel.get(i) + "\t" + tiempo.get(i));
            
        }
        
        System.out.println("el promedio es: " + prom);
        System.out.println("el mas rapido es : " + nombre.get(mejor) + " con un tiempo de : " +tiempo.get(mejor));
        System.out.println("el mas lento es :"+ nombre.get(peor) + " con un tiempo de : " + tiempo.get(peor));
        System.out.println("el numero de estudiantes por encima del promedio es : " + cont );
        
        
        
        
        
       
        
    }

}
    

