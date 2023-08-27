import java.util.*;
public class lab6_2 {
    public static void main(String[] args) {
        Candidate c1 = new Candidate();
        c1.GetCandidateDetails();
        c1.DisplayCandidateDetails();
    }
}
class Candidate{
    int id;
    String name;
    int age;
    double weight;
    double height;

    public void GetCandidateDetails(){
        Scanner can=new Scanner(System.in);
        System.out.print("enter id number:");
        id=can.nextInt();
        can.nextLine();
        System.out.print("enter name:");
        name=can.nextLine();
        System.out.print("enter age:");
        age=can.nextInt();
        System.out.print("enter height:");
        weight=can.nextDouble();
        System.out.print("enter weight:");
        height=can.nextDouble();
    }

    public void DisplayCandidateDetails(){
        System.out.println(id+" "+name+" "+age+" "+weight+" "+height);
    }
}
