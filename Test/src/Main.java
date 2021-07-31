import java.util.Scanner;

public class Main {

    public static int Add(int a, int b){

        return (a+b);
    }
    public static void Multiplication(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number : ");
        int x = scan.nextInt();
        System.out.println("enter second number : ");
        int y = scan.nextInt();

        System.out.println("Result : " + (x*y));

    }
    public static void main(String[] args) {
        int a,b;
        System.out.println("add : " + Add(3,5));

        Multiplication();
    }
}
