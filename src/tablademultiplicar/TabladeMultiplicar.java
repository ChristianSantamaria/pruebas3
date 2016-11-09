/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablademultiplicar;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class TabladeMultiplicar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero positivo"));
        do{
            numeros = Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero positivo"));
                if ( numeros >= 0){
                for(int i = 1; i <= 10; i++)
                    System.out.println(numeros +" x " + i + " = " + numeros * i);
                    break;
                }
                else
                    System.out.println("No es valido");
        }
        
        
        
        
        
        while(numeros >= 0);

        }
    
        
        
        
//        for(int numero = 1; numero <= 10; numero++){
//            for(int i = 1; i <= 10; i++){
//            System.out.println(numero +" x " + i + " = " + numero * i);
//            }
//        }
//        
//        int n = 0;
//        while (n <= 10){
//            int n2 = 0;
//            while (n2 <= 10){
//               System.out.println(n +" x " + n2 + " = " + n * n2); 
//               n2++;
//            }
//            n++;
//        }
//        
//        int num = 0;
//        do{
//            int num2 = 0;
//                do{
//                System.out.println(num +" x " + num2 + " = " + num * num2); 
//                num2++;
//                }
//                while(num2<=10);
//                    num ++;
//        }
//        while(num<=10);      
//    }    
}

