/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework_2;

/**
 *
 * @author Dell
 */
public class Homework_2 {
    public static void main(String args[]){
        int i, cont=0, j, fail=0;
        for(i=1;i<=100;i++){
                for (j=2; j<i; j++) { 
                    if (i%j==0) {
                        break;
                    }
                }
                if(j==i){
                    cont++;
                    System.out.print(i+" ");
                        if(cont%5==0){
                            System.out.print("\n");
                        }
                }
        }    
        System.out.println("Tatol number of primes:"+cont);
    }
}
