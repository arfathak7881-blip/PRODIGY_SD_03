import java.util.Scanner;

public class ContactManagementSystem {
    public static void main(String[] args) {

        try (var sc = new Scanner(System.in)) {
            String name = "";
            String phone = "";
            String email = "";
            
            int choice;
            
            do {
                System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Contact");
                System.out.println("2. View Contact");
                System.out.println("3. Edit Contact");
                System.out.println("4. Delete Contact");
                System.out.println("5. Exit");
                System.out.print("Enter Your Choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter Name: ");
                        name = sc.nextLine();
                        System.out.print("Enter Phone Number: ");
                        phone = sc.nextLine();
                        System.out.print("Enter Email: ");
                        email = sc.nextLine();
                        
                        System.out.println("Contact Added Successfully!");
                    }
                    
                    case 2 -> {
                        System.out.println("\n--- Contact Details ---");
                        System.out.println("Name  : " + name);
                        System.out.println("Phone : " + phone);
                        System.out.println("Email : " + email);
                    }
                    
                    case 3 -> {
                        System.out.print("Enter New Name: ");
                        name = sc.nextLine();
                        
                        System.out.print("Enter New Phone Number: ");
                        phone = sc.nextLine();
                        
                        System.out.print("Enter New Email: ");
                        email = sc.nextLine();
                        
                        System.out.println("Contact Updated Successfully!");
                    }
                    
                    case 4 -> {
                        name = "";
                        phone = "";
                        email = "";
                        
                        System.out.println("Contact Deleted Successfully!");
                    }
                    
                    case 5 -> System.out.println("Exiting Program...");
                    
                    default -> System.out.println("Invalid Choice!");
                }
                
            } while(choice != 5);
        }
    }
}