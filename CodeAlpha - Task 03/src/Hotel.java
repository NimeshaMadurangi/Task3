import java.util.Scanner;

public class Hotel {

    private int h_id;
    private String h_name;
    private int h_contact;
    private int room_no;
    private int room_charge;
    private int other_charge;

    public void total(){

        Scanner sc = new Scanner(System.in);
        int tot;

        System.out.print("Enter Hotel Name: ");
        h_name = sc.next();

        System.out.print("Enter Hotel Contact Number: ");
        h_contact = sc.nextInt();

        System.out.print("Enter Room Number: ");
        room_no = sc.nextInt();

        System.out.print("Enter Room Charge: ");
        room_charge = sc.nextInt();

        System.out.print("Enter Other Charges: ");
        other_charge = sc.nextInt();

        tot = room_charge + other_charge;

        System.out.println("Hotel Name: " +h_name);
        System.out.println("Contact Number: " +h_contact);
        System.out.println("Room Number: " +room_no);
        System.out.println("Your Total Balance: Rs." +tot);
        System.out.println("Thank You. Come Again..!");

    }

}
