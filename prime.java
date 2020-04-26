import java.io.*;
import java.util.*;
public class prime_no {
    public static void main(String[] args) throws IOException{
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number:");
        int x=s.nextInt();
        
        //method-1
        if (x==2 || x==3 || x==5 || x==7)
        System.out.println("prime number.");            
        else if(x==1 || x==0 || x<0 || x%2==0 || x%3==0 || x%5==0 || x%7==0)
            System.out.println("not a prime number.");
        else if( x%2!=0 && x%3!=0 && x%5!=0 && x%7!=0)
            System.out.println("prime number.");       
        
        //method-2
        boolean isPrime =true;
        for(int i=2;i<x;i++){
            if(x%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number.");
        }
    }
}
