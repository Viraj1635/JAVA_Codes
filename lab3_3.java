import java.util.*;;
public class lab3_3 {
    public static void main(String[] args) {
        Scanner bill=new Scanner(System.in);
        double a,b=0,c,n;
        System.out.print("enter total calls:");
        a=bill.nextInt();
        if(a==100){
            System.out.print("200Rs");
        }
        else if (a<=150){
            b=200+(0.6*(a-100));
            System.out.print(b+"Rs");
        }
        else if(a<=200){
            b=200+(0.6*50)+(0.5*(a-150));
            System.out.print(b+"Rs");
        }
        else if(a>200){
            b=200+(0.6*50)+(0.5*50)+(0.4*(a-200));
            System.out.print(b+"Rs");
        }
    }
}
