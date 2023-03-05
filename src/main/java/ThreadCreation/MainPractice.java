package ThreadCreation;

import java.util.Scanner;

public class MainPractice {
    public static void main(String[] args) {
        VolatileCheck volatileCheck= new VolatileCheck();
        volatileCheck.start();
        System.out.println("enter key to shutdown");
        new Scanner(System.in).nextLine();
        volatileCheck.shutDown();
    }
}
