
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoMatchException{
        checkStr cs = new checkStr();
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter your string: ");
            String Str = sc.next();

            String checkResult = cs.checker(Str);
            System.out.println("The word entered is equal to BooM");
        }

        catch (NoMatchException e)
        {
            System.out.println(e);
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}