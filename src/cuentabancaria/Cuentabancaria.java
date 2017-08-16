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
public class Cuentabancaria {
public int numero;
public int clave;
public String usuario;
        public double saldo;
        public boolean consignar(double monto){
            if (monto>0){
                this.saldo += monto;
            return true;
            }else{
                return false;
            
                
            }
        }
public boolean retirar (double monto){
    if(monto<0&&monto<this.saldo){
        this.saldo-=monto; 
        return true;}else{ 
        return false;
    }
}
       public boolean cambiarClave (int claveactual, int nuevaclave){
           if (claveactual==this.clave){
               this.clave=nuevaclave;
                      return true;}else{
               return false;
               
           }
           
       }
       public double consultarsaldo(){
           return this.saldo;
       }
       
        
        /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
