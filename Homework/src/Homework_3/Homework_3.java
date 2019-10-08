/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework_3;

/**
 *
 * @author Dell
 */
public class Homework_3 {
    public static void main(String args[]){
        int i=0;
        float sum=1, temp=1;
        do {
            i++;
            temp=temp*(temp+1);
            sum=sum+1/temp;
        } while (i<19);
        System.out.println("The final reslut is:"+sum);
    }
}
