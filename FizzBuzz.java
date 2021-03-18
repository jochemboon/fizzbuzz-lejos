import lejos.nxt.Button;

public class FizzBuzz {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 100; i++)
        {
            String output = "";

            if(isMultipleOf(i, 3))
                output += "Fizz";

            if(isMultipleOf(i, 5))
                output += "Buzz";

            if (output.equals(""))
                System.out.println(i);
            else
                System.out.println(output);

            System.out.println();
            Button.waitForAnyPress();
        }
    }

    public static boolean isMultipleOf(int number, int divider)
    {
        return number % divider == 0;
    }
}
