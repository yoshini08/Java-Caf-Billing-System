import java.util.Scanner;

class CoffeeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int choice;

        do {
            System.out.println("\n--- CAFE MENU ---");
            System.out.println("1. Cappuccino - Rs.120");
            System.out.println("2. Latte - Rs.100");
            System.out.println("3. Cold Coffee - Rs.150");
            System.out.println("4. Exit and Bill");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    total += 120;
                    System.out.println("Cappuccino added!");
                    break;
                case 2:
                    total += 100;
                    System.out.println("Latte added!");
                    break;
                case 3:
                    total += 150;
                    System.out.println("Cold Coffee added!");
                    break;
                case 4:
                    System.out.println("\nFinal Bill: Rs." + total);
                    System.out.println("Thank you! Enjoy your coffee ☕✨");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
