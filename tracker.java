import java.util.Scanner;

public class tracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input buying price :
        System.out.println("Enter your buying price per share: ");
        double buyingPrice = sc.nextDouble();
        int day = 1;
        double closingPrice;
        double[] weekly = new double[7];

        //checking earning
        int i = 0;
        while (i < weekly.length) {
            System.out.println("Enter closing price for the day: " +day);
            closingPrice = sc.nextDouble();
            double earnings = closingPrice - buyingPrice;
            weekly[i] = earnings;

            day += 1;
            i += 1;
            //checking profit or loss
            if (earnings > 0) {
                System.out.printf("After day " + day + " you have gained $%.2f " + " per share since yesterday ", earnings);
                System.out.println(" ");
            } else if (earnings < 0) {
                System.out.printf("After day " + day + " you have lost $%.2f" + " per share since yesterday.", (-earnings));
                // - sign as we have lost that day
                System.out.println(" ");
            } else {
                System.out.println("After day " + day + ", you have nio earnings per share");
            }
        }
        //Output Screen
        System.out.println("Your weekly earnings: ");
        double totalWeeklyEarnings = 0;
        for (int j = 0; j < weekly.length; j++) {
            System.out.printf("Your earning on a day " + j + " is $%.2f", weekly[j]);
            System.out.println(" ");
            totalWeeklyEarnings += weekly[j];  //adding all earnings one by one
        }
        System.out.printf("Total earnings: " + "$%.2f" + " per share", totalWeeklyEarnings);
        System.out.println("Just this that's it");

        sc.close();
    }
}
