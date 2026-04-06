public class Car extends Vehicle{
    @Override
    protected double calculateRateDay(int day){
        int rateDay = 2400;
        return rateDay *day;
    }
    @Override
    protected double calculateRateHours(int hours){
        int rateHour = 250;
        return rateHour *hours;
    }

    Car(String vehicleNumber, String modelName){
        super(vehicleNumber,modelName);
    }
}
