public class Ride
{
    private static int idCounter = 1;
    private String id;
    private Location startLocation;
    private Location endLocation;
    private String status;

    public Ride(Location startLocation, Location endLocation)
    {
        this.id = "R" + idCounter++;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.status = "Requested";
    }

    public String getId()
    {
        return id;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "Ride ID: " + id + ", From: " + startLocation + ", To: " + endLocation;
    }
}
