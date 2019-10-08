/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homeowrk_4;

/**
 *
 * @author Dell
 */
public interface Homeowrk_4 {
    public static void main(String args[]){
        int i;
        System.out.println("Total have Perfect number within 1000:");
        for(i=3;i<=1000;i++){
            for(int j=1, sum=0;j<i;j++){
                if(i%j==0){
                    sum=sum+j;
                }
                if(sum==i){
                    System.out.print(sum+" ");
                    break;
                }
            }
        }
    }
}
