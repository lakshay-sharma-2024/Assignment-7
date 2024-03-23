
import java.util.Objects;

public class checkStr {
    public String checker(String str) throws NoMatchException
    {
        if (Objects.equals(str, "BooM"))
        {
            return "True";
        }

        else {
            throw new NoMatchException("The word entered is not equal to BooM.");
        }
    }
}