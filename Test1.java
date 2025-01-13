public class Test1
{

    public static void main(String[] args)
    {
        // Create Locations
        Location loc1 = new Location("Downtown");
        Location loc2 = new Location("Airport");

        // Create User and Driver
        User user1 = new User("Sahid", 1);
        Driver driver1 = new Driver("Sakib", 101, "Sedan", true); // Driver initially available

        // Create RideSharingService instance
        RideSharingService service = new RideSharingService();

        // Register User and Driver
        service.registerUser(user1);
        service.registerDriver(driver1);

        // Request a Ride
        Ride ride1 = service.requestRide(user1, loc1, loc2);

        // Accept the Ride
        service.acceptRide(driver1, ride1);

        // Complete the Ride
        service.completeRide(driver1, ride1);
    }
}
