import java.util.*;
public class lab3 {
    public static void main(String[] args) {
        Scanner calc=new Scanner(System.in);
        int a,b,c=0,n;
        System.out.print("enter value of a:");
        a=calc.nextInt();
        System.out.print("enter value of b:");
        b=calc.nextInt();
        System.out.print("enter 1 for addition , 2 for substraction , 3 for multiplication , 4 for dividion:");
        n=calc.nextInt();
        switch (n) {
            case 1:
                c=a+b;
                System.out.print("enter sum of a and b:"+c);
                break;
            case 2:
                c=a-b;
                System.out.print("enter sub of a and b:"+c);
                break;
            case 3:
                c=a*b;
                System.out.print("enter mul of a and b:"+c);
                break;
            case 4:
                c=a/b;
                System.out.print("enter div of a and b:"+c);
                break;
            default:
                System.out.print("enter valid number"+c);
                break;
        }
    }
}
