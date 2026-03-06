import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int marks;
        Scanner sc = new Scanner(System.in);

        marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("A");
        }
        else if (marks >= 75 && marks <= 89) {
            System.out.println("B");
        }
        else if (marks >= 60 && marks <= 74) {
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }

        int c, d;
        c = sc.nextInt();
        d = sc.nextInt();

        char op = sc.next().charAt(0);

        switch(op) {
            case '+':
                System.out.println(c + d);
                break;

            case '-':
                System.out.println(c - d);
                break;

            case '*':
                System.out.println(c * d);
                break;

            case '/':
                System.out.println(c / d);
                break;

            default:
                System.out.println("no valid operator");
        }
    }
}