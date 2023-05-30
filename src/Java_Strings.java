public class Java_Strings
{
    public static void main(String[] args)
    {
        String user = "Casey";
        String lastName = "McMillen";
        String fullName = user + " " + lastName;

        System.out.println(fullName);

        int score = 100;

        System.out.println("The score is " + score); // "100"

        int caseyLength = user.length(); // 5

        System.out.println(caseyLength);

        System.out.println(user.toLowerCase()); //"casey"
        System.out.println(user.toUpperCase()); //"CASEY"
        System.out.println(user);

        user = user.toUpperCase(); //change username from Casey to CASEY
        System.out.println(user);

        String first = fullName.substring(0, 5);
        System.out.println("First is " + first);

        String second = fullName.substring(6);
        System.out.println("Second is " + second);

        String bill = "Bill";
        String billy = bill;

        System.out.println("Casey".equals("CASEY"));
        System.out.println("Casey".equalsIgnoreCase("CASEY"));

        String untrimmed = "  an untrimmed String ";

        System.out.println(untrimmed.trim());

        String num100 = String.valueOf(100); // "100"
        System.out.println(num100);

        // \n newLine \t tab

        System.out.println("Mary had a little lamb!");
        System.out.println("Mary\t had\t a\t little\t lamb!");
        System.out.println("Mary\n had\n a\n little\n lamb!");
    }
}