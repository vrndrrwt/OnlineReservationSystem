
 

import java.util.HashMap;

import java.util.Map;

import java.util.Scanner;

 

class ReservationSystem {

    private Map<String, Boolean> reservations;

 

    public ReservationSystem() {

        reservations = new HashMap<>();

    }

 

    public boolean makeReservation(String reservationId) {

        if (reservations.containsKey(reservationId)) {

            System.out.println("Reservation with ID " + reservationId + " already exists.");

            return false;

        }

 

        reservations.put(reservationId, true);

        System.out.println("Reservation with ID " + reservationId + " has been made.");

        return true;

    }

 

    public boolean cancelReservation(String reservationId) {

        if (!reservations.containsKey(reservationId)) {

            System.out.println("Reservation with ID " + reservationId + " does not exist.");

            return false;

        }

 

        reservations.remove(reservationId);

        System.out.println("Reservation with ID " + reservationId + " has been canceled.");

        return true;

    }

}

 

public class OnlineReservationSystem {

    public static void main(String[] args) {

        ReservationSystem reservationSystem = new ReservationSystem();

        Scanner scanner = new Scanner(System.in);

 

        while (true) {

            System.out.println("1. Make Reservation");

            System.out.println("2. Cancel Reservation");

            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

 

            switch (choice) {

                case 1:

                    System.out.print("Enter reservation ID: ");

                    String reservationId = scanner.next();

                    reservationSystem.makeReservation(reservationId);

                    break;

                case 2:

                    System.out.print("Enter reservation ID: ");

                    reservationId = scanner.next();

                    reservationSystem.cancelReservation(reservationId);

                    break;

                case 3:

                    System.out.println("Exiting...");

                    System.exit(0);

                    break;

                default:

                    System.out.println("Invalid choice! Please try again.");

            }

        }

    }

}

 





 

