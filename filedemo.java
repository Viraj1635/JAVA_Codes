import java.util.*;
import java.io.*;
public class filedemo {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\viraj\\attendance.txt"));
            bw.write("asdfghjkl");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}