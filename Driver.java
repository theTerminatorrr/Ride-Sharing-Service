public class Driver
{
    private String name;
    private int id;
    private String vehicleType;
    private boolean available;

    public Driver(String name, int id, String vehicleType, boolean available)
    {
        this.name = name;
        this.id = id;
        this.vehicleType = vehicleType;
        this.available = available;
    }

    public boolean isAvailable()
    {
        return available;
    }

    public void setAvailable(boolean available)
    {
        this.available = available;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", ID: " + id;
    }
}
