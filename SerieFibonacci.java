
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame un numero entero");
        
        int numero = scanner.nextInt();
        scanner.close();
        
        
        int num = 1;
        int n0 = 0;
        int n1 = 1;
        
        System.out.println("La serie de Fibonacci es " + n0);
        
        for (int i = 1; i < numero; i++) {
        
        System.out.println("La serie de Fibonacci es " + num);
        
        num=n0+n1;
        n0=n1;
        n1=num;
        
                
        
        }
    }
}

