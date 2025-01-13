public class Test3
{
    public static void main(String[] args)
    {

        RideSharingService service = new RideSharingService();

        User user1 = new User("Sahid", 44);
        User pirratedUser = new User("Pirrated Sahid", 44);

        service.registerUser(user1);
        service.registerUser(pirratedUser);
    }
}
