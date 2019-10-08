/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework_1;

/**
 *
 * @author Dell_zqy
 */
public class Homewok_1 {
    public static void main(String args[]){
        int sum = 0, i, j, temp = 1;
        for(i=1;i<=10;i++){
            temp*=i;
            sum=sum+temp;
        }
        System.out.println("The last result is:");
        System.out.println(sum);
    }
}
