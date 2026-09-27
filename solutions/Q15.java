import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String days = sc.nextLine().trim().toLowerCase();
        sc.close();

        switch (days) {
            case "monday" -> {
                System.out.println("Fortune : Purple");
                System.out.println("Unfortune : Red");
            }
            case "tuesday" -> {
                System.out.println("Fortune : Orange");
                System.out.println("Unfortune : Yellow , White");
            }
            case "wednesday" -> {
                System.out.println("Fortune : Black , Brown , Gray");
                System.out.println("Unfortune : Pink");
            }
            case "thursday" -> {
                System.out.println("Fortune : Red");
                System.out.println("Unfortune : Purple");
            }
            case "friday" -> {
                System.out.println("Fortune : Pink");
                System.out.println("Unfortune : Black , Blue , Gray");
            }
            case "saturday" -> {
                System.out.println("Fortune : Blue , Baby Blue");
                System.out.println("Unfortune : Green");
            }
            case "sunday" -> {
                System.out.println("Fortune : Green");
                System.out.println("Unfortune : Blue , Baby Blue");
            } 
            default -> System.out.println("Input is invalid");
        }
    }
}