import java.io.*;
import java.util.*;
class Pattern4{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your Pattern Size : ");
        int n=s.nextInt();
        if(n%2==0){
              System.out.print(" ");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0  || (j==n/2)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
              System.out.println();
        }
    }
}
