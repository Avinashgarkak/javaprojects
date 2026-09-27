import java.util.Scanner;

public class prt {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of times ");
        int x = sc.nextInt();

        for(int count=0; count<x;count++){
            System.out.println("enter your principle amount");
            int p = sc.nextInt();

            System.out.println("enter your rate");
            int r = sc.nextInt();

            System.out.println("enter your years1 ");
            int t= sc.nextInt();

            int si = p*r*t/100;

            System.out.println("simple intrest is "+ si);


        }
        
    }
} 
    
    

