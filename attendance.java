import java.util.*;
public class attendance{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter class: ");
		char division = sc.next().charAt(0);
        int rollNo,std,n=0;
        if (division=='a') {
            rollNo=101;
            std=66;
        }
        else if (division=='b') {
            rollNo=201;
            std=67;
        } 
        else {
            rollNo=301;
            std=66;
        }
		int temp = rollNo;
		char a[] = new char [std];	
		int i = 0;
        System.out.println("Enter P for Present and A for Absent");
		for(i=0;i<a.length;i++){
			System.out.print((rollNo++) + " : ");
			a[i] = sc.next().charAt(0);
		}
        System.out.print("Total present students: " );
        for(i=0;i<a.length;i++){
			if (a[i]=='p') {
                n++;
            }
		}
        System.out.println(n);
		rollNo = temp;
        System.out.print("Roll mumbers of Absent students : " );
		for(i=0;i<a.length;i++){
			if(a[i]=='a'){
				System.out.print(i+rollNo + " ");
			}
            else if (a[i]=='p') {
                n++;
            }
		}
	}
}















import java.util.*;
import java.io.*;
public class filedemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("attendance.txt"));            
            String a=sc.nextLine();
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}