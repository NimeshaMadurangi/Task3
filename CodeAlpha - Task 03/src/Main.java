public class Main {
    public static void main(String[] args) {

        User user = new User();
        Weather weather = new Weather();
        Hotel hotel = new Hotel();

        user.userdetails();
        weather.view_weather_details();
        hotel.total();

        }
}