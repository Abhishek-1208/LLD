import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****Welcome to Abhishek's Library Management System****\n");
        System.out.println("1. Logging in as(A for Admin, U for User): ");
        String userType = scanner.next();
        if (userType.equalsIgnoreCase("A")) {
            while(true) {
                System.out.println("Welcome Admin!");
                System.out.println("1. Manage Admin");
                System.out.println("2. Manage Users");
                System.out.println("3. Manage Books");
                System.out.println("4. Exit");
                System.out.println("Enter your choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> System.out.println("Manage Admin");
                    case 2 -> System.out.println("Manage Users");
                    case 3 -> System.out.println("Manage books");
                    case 4 -> {
                        System.out.println("Good Bye...!");
                        System.exit(0);
                    }
                    default -> System.out.println("Invalid choice!... Try again.");
                }
            }
        } else if (userType.equalsIgnoreCase("U")) {
            System.out.println("Welcome User!");
        } else {
            System.out.println("Invalid user type");
        }

    }
}


/*
1. Book Store
2. Users
3. Admin
 */