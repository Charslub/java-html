/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle_1;

import java.util.Scanner;

/**
 *
 * 
 * @author Dell_zqy
 */
public class Triangle_1 {
    public static  void  main(String args[]){
    int i, j, k;  
    System.out.println("please print a num for line:");
    Scanner reader = new Scanner(System.in);
    int iline = reader.nextInt();
    for(i=1; i<=iline;i++){
        for(j=i;j<iline;j++){
            System.out.print(" ");
            } 
        for(k=1;k<=2*i-1;k++){
            System.out.print("*");
            }
        System.out.print("\n");
        }     
    }
}//*Triangle

















