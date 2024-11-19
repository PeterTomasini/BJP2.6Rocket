import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
    public static void start() {
        System.out.println("BJP 2.6 Rocket");
        System.out.println("enter size");
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        cone(size);
        line(size);
        upbody(size);
        downbody(size);
        line(size);
        downbody(size);
        upbody(size);
        line(size);
        cone(size);
    }
    public static void cone(int size) {
        //repeats once each line
        for (int line = 1; line <= size * 2 - 1; line++) {
            //spaces
            for (int i = size * 2 - 1; i >= line; i--) {
                System.out.print(" ");
            }
            //forward slashes
            for (int i = 1; i <= line; i++) {
                System.out.print("/");
            }
            //stars
            System.out.print("**");
            //backslashes
            for (int i = 1; i <= line; i++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
    public static void line(int size) {
        System.out.print("+");
        for (int i = 1; i <= size; i++) {
            System.out.print("=*=*");
        }
        System.out.println("+");
    }
    public static void upbody(int size) {
        //size lines
        for (int line = 1; line <= size; line++) {
            System.out.print("|");
            for (int i = size - 1; i >= line; i--) {
                System.out.print(".");
            }
            //makes /\
            for (int i = 1; i <= line; i++) {
                System.out.print("/\\");
            }
            for (int i = size - 1; i >= line; i--) {
                System.out.print("..");
            }
            for (int i = 1; i <= line; i++) {
                System.out.print("/\\");
            }
            for (int i = size - 1; i >= line; i--) {
                System.out.print(".");
            }
            System.out.println("|");
        }

    }
    public static void downbody(int size) {
        //size lines
        for (int line = 1; line <= size; line++) {
            System.out.print("|");
            //periods
            for (int i = 1; i < line; i++) {
                System.out.print(".");
            }
            //down arrows
            for (int i = size; i >= line; i--) {
                System.out.print("\\/");
            }
            //periods
            for (int i = 1; i < line; i++) {
                System.out.print("..");
            }
            //down arrows
            for (int i = size; i >= line; i--) {
                System.out.print("\\/");
            }
            //periods
            for (int i = 1; i < line; i++) {
                System.out.print(".");
            }
            System.out.println("|");
        }
    }

}