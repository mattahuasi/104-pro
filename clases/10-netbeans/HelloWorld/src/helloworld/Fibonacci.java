/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 11
 */
public class Fibonacci {
    
    public static void main(String[] args) {
        
        Scanner leer =new Scanner(System.in);
        
        System.out.print("Ingrese n: ");
        int n = leer.nextInt();
        
        int f = 0;
        int a = 1;
        int b = 0;
        
        for(int i=0;i<n;i++){
            f=a+b;
            a=b;
            b=f;
            System.out.print(f+" ");
        }
        
        leer.close();
    }
    
}
