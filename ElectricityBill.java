import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        System.out.print("Late payment? (1 for Yes, 0 for No): ");
        int late = sc.nextInt();
        double bill = 10; 
        if (units <= 100) {
            bill += units * 0.5;
        } else if (units <= 300) {
            bill += (100 * 0.5) + (units - 100) * 0.75;
        } else {
            bill += (100 * 0.5) + (200 * 0.75) + (units - 300) * 1.2;
        }
        if (late == 1) {
            bill += bill * 0.05;
        }
        System.out.println("Total Bill: $" + bill);
        sc.close();
    }
}
