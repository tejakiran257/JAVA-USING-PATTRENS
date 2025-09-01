import java.util.*;
class righttriangle{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter size: ");
        int n=s.nextInt();
        int i,j;
        for(i=0;i<n;i++){
           for(j=n+i;j>n-1;j--){
              System.out.print("* ");
            }
            System.out.println(" ");

        }
    }
}
