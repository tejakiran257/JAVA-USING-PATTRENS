import java.io.*;
import java.util.*;
class Pattern3{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your Pattern Size : ");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || j==n-1-i){
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
