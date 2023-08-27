import java.util.*;
public class Task {
    public static void main(String[] args) {
        Scanner enter=new Scanner(System.in);
        int i,j,n,a=0;
        System.out.print("enter a number:");
        n=enter.nextInt();
        for(i=0;i<(2*n-1);i++){
           for(j=0;j<(2*n-1);j++){
                if(i==0||j==0||i==(2*n-2)||j==(2*n-2)){
                    System.out.print(" "+n);
                }
                else if(i==a+1||i==(2*n-3)||j==a+1||j==(2*n-3)){
                    System.out.print(" "+(n-1));
                }
                else if(i==a+2||i==(2*n-4)||j==a+2||j==(2*n-4)){
                    System.out.print(" "+(n-2));
                }
                else if(i==a+3||i==(2*n-5)||j==a+3||j==(2*n-5)){
                    System.out.print(" "+(n-3));
                }
                else if(i==a+4||i==(2*n-6)||j==a+4||j==(2*n-6)){
                    System.out.print(" "+(n-4));
                }
            }
            System.out.println(" ");
        }
    }
}
