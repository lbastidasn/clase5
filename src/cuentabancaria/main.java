/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author ESTUDIANTE
 */
public class main {
    public static  void main (String[]args){
        Cuentabancaria magdalena= new Cuentabancaria();
        magdalena.numero=1012;
        magdalena.clave=1234;
        magdalena.usuario= "Magdalena Sanchez";
        magdalena.saldo=0;
        magdalena.monto= consignar(1000000);
        
        
    }
    
}
