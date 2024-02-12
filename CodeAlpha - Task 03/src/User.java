import java.net.URL;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class User {
    private int id;
    private String name;
    private int contact;
    private String destination;
    private String date;
    private int noOfMembers;
    private int direct;

    public void userdetails() {

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc1.next();

        // Validate contact number
        while (true) {
            try {
                System.out.print("Enter Contact Number: ");
                contact = sc1.nextInt();
                break; // Break the loop if input is valid
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for the contact number.");
                sc1.next(); // Consume invalid input to avoid an infinite loop
            }
        }

        System.out.print("Enter date: ");
        date = sc1.next();

        // Validate number of members
        while (true) {
            try {
                System.out.print("Enter Number of Members: ");
                noOfMembers = sc1.nextInt();
                if (noOfMembers > 0) {
                    break; // Break the loop if input is valid
                } else {
                    System.out.println("Invalid input. Number of members must be greater than 0.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for the number of members.");
                sc1.next(); // Consume invalid input to avoid an infinite loop
            }
        }

        System.out.print("Enter Destination: ");
        destination = sc1.next();

        System.out.println("Do you want to get directions? enter 1/0 (Yes=1/ No=0)");

        // Validate direct input
        while (true) {
            try {
                direct = sc1.nextInt();
                if (direct == 0 || direct == 1) {
                    break; // Break the loop if input is valid
                } else {
                    System.out.println("Invalid input. Please enter either 0 or 1.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter either 0 or 1.");
                sc1.next(); // Consume invalid input to avoid an infinite loop
            }
        }

        if (direct == 1) {
            try {
                URL url = new URL("https://www.google.com/maps");
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                int responseCode = connection.getResponseCode();
                System.out.println("Response Code: " + responseCode);
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();
                // Print the response
                System.out.println("Response: " + response.toString());
                // Close the connection
                connection.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
