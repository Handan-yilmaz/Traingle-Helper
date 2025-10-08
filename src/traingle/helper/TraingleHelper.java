package traingle.helper;

import java.util.Scanner;

public class TraingleHelper 
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int a;
        int b;
        System.out.println(" First Side : ");
        a = scanner.nextInt();
        System.out.println(" Second Side : ");
        b = scanner.nextInt();
        
        double h = Math.sqrt( a * a + b * b) ;
        System.out.println("Hypotenuse : " + h );
        
        
    }
    
}
