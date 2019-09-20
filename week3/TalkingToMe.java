public class TalkingToMe
{
    public static void main(String[] args)
    {
        if (args.length !=2)
        {
            System.out.println("Usage: java HelloInput firstName lastName");

        }
        else
        {
            String firstName = args[0];
            String lastName = args[1];
            System.out.println("Who is she? " + firstName + " " + lastName);

        }
    }
}