import java.util.*;
class ReverseLHP {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j< n ;j++){
                if(i>j){
                System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                    System.out.print(" ");
            }
            System.out.println();
        } 
    }
    
}
