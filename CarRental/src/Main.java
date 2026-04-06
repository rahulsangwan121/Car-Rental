public class Main {
    public static void main(String[] args) {
        Car luxuryCar = new Car("RJ10GB1280","Mahindra Thar");
        Car familyCar = new Car("RJ14SB5690","Alto 800");
        Bike bike = new Bike("RJ18SJ3490","HF Deluxe");

        luxuryCar.rent();
        familyCar.rent();
        bike.rent();
    }
}