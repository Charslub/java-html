/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle_2;

import java.util.Scanner;

/**
 *
 * @author Dell_zqy
 */
public class Triangle_2 {
    public static void main(String  args[]){
        Scanner reader = new Scanner(System.in);
        int iline = reader.nextInt();
        int i, j, k, cont;
        for(i=1;i<=iline;i++){
            for(j=i;j<iline;j++){
                System.out.print(" ");
            } 
            for(k=1;k<=i;k++){
                System.out.print(k);
            }
            for(cont=k-2;cont>=1;cont--){         
                System.out.print(cont);
            }        
            System.out.print("\n");
            
        }
    }
}
    


