import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Print the down square triangle");
            System.out.println("4.Print isosceles triangle");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 10; j++) {
                            if (i == 1 || i == 5 || j == 1 || j == 10) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 6; ++i) {
                        for (int j = 1; j < i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 5; i >= 1; --i) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 1; i <=10 ; i ++){
                        for (int j = i; j <= 10; j ++){
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j ++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.exit(0);
            }

        } while (choice != 0);
    }
}
