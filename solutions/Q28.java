import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        char oparator = sc.next().charAt(0);
        int num2 = sc.nextInt();
        sc.close();

        switch (oparator) {
            case '+' -> {
                System.out.println(num1 + num2);
            }
            case '-' -> {
                System.out.println(num1 - num2);
            }
            case '*' -> {
                System.out.println(num1 * num2);
            } 
            case '/' -> {
                System.out.println(num1 / num2);
            } 
            case '%' -> {
                System.out.println(num1 % num2);
            }
        } 
        
    }
}
