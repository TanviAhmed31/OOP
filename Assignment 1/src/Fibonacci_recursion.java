/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donlo
 */
import java.util.Scanner;

public class Fibonacci_recursion {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter how many numbers of fibonacci numbers you want to see");
        
        int n = in.nextInt();
        
        fib(n,0,1);
    }
    
    public static void fib(int i,int a,int b)
    {
        if(i==0)
        {
            System.out.println(" ");
            return;
        }
        
        else
        {
            i--;
            int x = a + b;
            System.out.println(x + " ");
            a = b;
            b = x;
            fib(i,a,b);
        }
    }
}
