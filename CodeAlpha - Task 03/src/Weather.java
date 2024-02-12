import java.util.Scanner;

public class Weather {
    private String country;
    private String city;
    private String date;
    private int temp;

    public void view_weather_details(){

        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter Country Name: ");
        country = sc2.next();

        System.out.print("Enter City Name: ");
        city = sc2.next();

        System.out.print("Enter date: ");
        date = sc2.next();

        System.out.print("Enter Temperature in Celsius: ");
        temp = sc2.nextInt();

        if (temp <= 16) {

            System.out.println(city     + "weather is not well");

        }
        else if (temp > 16) {

            System.out.println(city     + "weather is well");

        }
        else {

            System.out.println("This temperature is not valid");

        }


    }
}
