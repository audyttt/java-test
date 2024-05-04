
import java.util.*;

public class LabInput {
    public static void main(String[] args) {
        int x = 5;
        int y = 78;
        System.out.print("Test");
        System.out.println("x = " + x + " y = " + y);
        m1();
        int ResultM2 = m2(6, 7);
        System.out.println("xx=" + ResultM2);
        getInput();
        // System.out.println("My name" + args[0]);
        // System.out.println("I am" + args[1]);  
    }

    static void m1() {
        int a = 2;
        System.out.println("a=" + a);
    }

    static int m2(int x1, int z1) {
        int temp = x1 + z1;
        return temp;
    }
    static void getInput() {
        Scanner sc = new Scanner(System.in);
        String name;
        String job;
        int inputNum;
        String temp;
        // System.out.print("Enter your name");
        // name = sc.nextLine();
        // System.out.print("Enter your Job");
        // job = sc.nextLine();
        // System.out.println("My name " + name);
        // System.out.println("Job " + job);
        // inputNum = sc.nextInt();
        temp = sc.nextLine();
        int qqq = Integer.parseInt(temp);
        System.out.println(qqq > 20);



    }
}
