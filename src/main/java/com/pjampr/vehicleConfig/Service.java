package com.pjampr.vehicleConfig;

import java.util.Scanner;

public class Service {

    static Scanner scanner = new Scanner(System.in);

    static VehicleConfigApplication vehicleApp = new VehicleConfigApplication();

    static int option;

    public static void serviceApp(){

        while (true) {

            printMenu();
            option = getOption();

            if (option == 1) {
                printSubMenuVehicleTypeSelect();
                option = getOption();
                if (option == 1) {
                    printSubMenuVehicleSearchSelect();
                    option = getOption();
                    if (option == 1){
                        System.out.println("Insert a brand to search for: ");
                        String input = scanner.next();
                        vehicleApp.searchByBrand(input);
                    }
                    else if (option == 2){
                        System.out.println("Insert a model to search for: ");
                        String input = scanner.next();
                        vehicleApp.searchByModel(input);
                    }
                    else if (option == 3){
                        System.out.println("Insert registration number you are searching for: ");
                        String input = scanner.next();
                        vehicleApp.searchByRegistrationNumber(input);
                    }
                    else if (option == 9){
                        System.out.println("Exiting...");
                        break;
                    }
                    else if (option == 0){
                        System.out.println("Exiting...");
                        break;
                    }
                    else {
                        System.out.println("Select proper option!");
                    }
                }

                else if (option == 2){
                    System.out.println("All lorries are currently unavailable");
                }

                else if (option == 3){
                    System.out.println("All motorbikes are currently unavailable");
                }

                else if (option == 9){
                    System.out.println("Exiting...");
                    break;
                }
                else if (option == 0){
                    System.out.println("Exiting...");
                    break;
                }
                else {
                    System.out.println("Select proper option!");
                    continue;
                }

            }

            else if (option == 2){
                printSubMenuVehicleRent();
            }
            else if (option == 3){
                printSubMenuVehicleReturn();
            }
            else if (option == 4){
                System.out.println("Option not yet available");
            }
            else if (option == 0){
                System.out.println("Exiting...");
                break;
            }


        }

    }

    public static void printMenu() {
        System.out.println("Select an option: ");
            System.out.printf("\n\t1 - Search for a vehicle\n\t2 - Rent a vehicle\n\t3 - Return a vehicle\n\t4 - Log in (service only)\n\t0 - ::EXIT::");
            System.out.print("\nOption: ");

    }

    public static void printSubMenuVehicleTypeSelect() {
            System.out.println("Choose a type of vehicle you are searching for: ");
            System.out.println("\n\t1 - Cars\n\t2 - Lorries\n\t3 - Motorbikes and scooters\n\t4 - Other\n\t9 - ::BACK::\n\t0 - ::EXIT::");
            System.out.print("\nOption: ");

    }

    public static void printSubMenuVehicleSearchSelect(){
        System.out.println("Choose the feature to search with: ");
        System.out.println("\n\t1 - Search by BRAND\n\t2 - Search by MODEL\n\t3 - Search by REGISTRATION NUMBER\n\t9 - Back\n\t0 - Exit");
        System.out.print("\nOption: ");

    }

    public static void printSubMenuVehicleRent(){
        System.out.println("Insert registration number of the car you wish to rent: ");
        String input = scanner.next();
        vehicleApp.rentCar(input);

    }

    public static void printSubMenuVehicleReturn(){
        System.out.println("Insert registration number of the car you wish to return: ");
        String input = scanner.next();
        vehicleApp.returnCar(input);
    }


    public static int getOption(){
        int a = scanner.nextInt();
        return a;
    }

//    public static void printCars() {
//
//        System.out.println("XX");
//    }


}
