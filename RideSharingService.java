public class RideSharingService
{
    private User[] users = new User[100];
    private Driver[] drivers = new Driver[100];
    private Ride[] rides = new Ride[100];
    private int userCount = 0;
    private int driverCount = 0;
    private int rideCount = 0;

    public void registerUser(User user) {
        for (int i = 0; i < userCount; i++)
        {
            if (users[i].getId() == user.getId())
            {
                System.out.println("Duplicate user ID: " + user.getId());
                return;
            }
        }
        users[userCount++] = user;
        System.out.println("User registered:\n" + user);
    }

    public void registerDriver(Driver driver) {
        drivers[driverCount++] = driver;
        System.out.println("Driver registered:\n" + driver);
    }

    public Ride requestRide(User user, Location start, Location end) {
        if (start == null || end == null) {
            System.out.println("Invalid locations");
            return null;
        }
        Ride ride = new Ride(start, end);
        rides[rideCount++] = ride;
        System.out.println("Ride Requested:\n" + ride);
        return ride;
    }

    public void acceptRide(Driver driver, Ride ride)
    {
        if (!driver.isAvailable())
        {
            System.out.println("Driver is not available.");
            return;
        }
        driver.setAvailable(false);
        ride.setStatus("Accepted");
        System.out.println("Ride Accepted");
    }

    public void completeRide(Driver driver, Ride ride)
    {
        if (!"Accepted".equals(ride.getStatus()))
        {
            System.out.println("Ride is already completed!");
            return;
        }
        ride.setStatus("Completed");
        driver.setAvailable(true);
        System.out.println("Ride completed for " + ride.getId());
    }
}
