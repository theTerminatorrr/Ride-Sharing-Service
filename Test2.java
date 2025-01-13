public class Test2
{
    public static void main(String[] args)
    {
        // Create Locations
        Location loc1 = new Location("Downtown");
        Location loc2 = new Location("Airport");

        // Create User and Drivers
        User user2 = new User("Hossain", 2);
        Driver driver1 = new Driver("Sakib", 101, "Sedan", false); // Initially unavailable
        Driver driver2 = new Driver("Alisha", 102, "SUV", true);  // Initially available

        // Create RideSharingService instance
        RideSharingService service = new RideSharingService();

        // Register User and Drivers
        service.registerUser(user2);
        service.registerDriver(driver1);
        service.registerDriver(driver2);

        // Request a Ride
        Ride ride2 = service.requestRide(user2, loc1, loc2);

        // Try to accept Ride with an unavailable driver
        service.acceptRide(driver1, ride2);

        // Accept Ride with an available driver
        service.acceptRide(driver2, ride2);

        // Complete the Ride
        service.completeRide(driver2, ride2);

        // Attempt to complete the same ride again
        service.completeRide(driver2, ride2);
    }
}
