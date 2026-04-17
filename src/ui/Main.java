package ui;

import service.HospitalSystem;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HospitalSystem system = new HospitalSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add doctor");
            System.out.println("2. Add patient");
            System.out.println("3. Admit patient");
            System.out.println("4. Discharge patient");
            System.out.println("5. Schedule appointment");
            System.out.println("6. Generate bill");
            System.out.println("7. View doctors");
            System.out.println("8. View patients");
            System.out.println("9. Exit");

            int choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1: break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    case 5: break;
                    case 6: break;
                    case 7: break;
                    case 8: break;
                    case 9: System.exit(0);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}