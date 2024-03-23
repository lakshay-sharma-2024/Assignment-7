public class Function {
    public RationalNo addRationals(RationalNo r1, RationalNo r2)
    {
        int r1_num = r1.getNume();
        int r2_num = r2.getNume();

        int r1_denom = r1.getDenom();
        int r2_denom = r2.getDenom();

        int r1_num_new = r1_num*r2_denom;
        int r2_num_new = r2_num*r1_denom;
        int common_denom = r1_denom*r2_denom;

        if (r2_denom == r1_denom)
        {
            r1_num_new = r1_num;
            r2_num_new = r2_num;
            common_denom = r2_denom;
        }

        int result_num = r1_num_new + r2_num_new;

        if (result_num < 0 && common_denom < 0)
        {
            result_num = Math.abs(result_num);
            common_denom = Math.abs(common_denom);
        }

        return new RationalNo(result_num, common_denom);
    }

    public RationalNo subRationals(RationalNo r1, RationalNo r2)
    {
        int r1_num = r1.getNume();
        int r2_num = r2.getNume();

        int r1_denom = r1.getDenom();
        int r2_denom = r2.getDenom();

        int r1_num_new = r1_num*r2_denom;
        int r2_num_new = r2_num*r1_denom;
        int common_denom = r1_denom*r2_denom;

        if (r2_denom == r1_denom)
        {
            r1_num_new = r1_num;
            r2_num_new = r2_num;
            common_denom = r2_denom;
        }

        int result_num = r1_num_new - r2_num_new;

        if (result_num < 0 && common_denom < 0)
        {
            result_num = Math.abs(result_num);
            common_denom = Math.abs(common_denom);
        }

        return new RationalNo(result_num, common_denom);
    }

    public RationalNo multiplyRationals(RationalNo r1, RationalNo r2)
    {
        int r1_num = r1.getNume();
        int r2_num = r2.getNume();

        int r1_denom = r1.getDenom();
        int r2_denom = r2.getDenom();


        int result_num = (r1_num*r2_num);
        int result_denom = (r1_denom*r2_denom);

        if (result_num < 0 && result_denom < 0)
        {
            result_num = Math.abs(result_num);
            result_denom = Math.abs(result_denom);
        }

        return new RationalNo(result_num, result_denom);
    }

    public RationalNo divideRationals(RationalNo r1, RationalNo r2)
    {
        int r1_num = r1.getNume();
        int r2_num = r2.getNume();

        int r1_denom = r1.getDenom();
        int r2_denom = r2.getDenom();


        int result_num = (r1_num*r2_denom);
        int result_denom = (r1_denom*r2_num);

        if (result_num < 0 && result_denom < 0)
        {
            result_num = Math.abs(result_num);
            result_denom = Math.abs(result_denom);
        }

        return new RationalNo(result_num, result_denom);
    }

    public String compareRationals(RationalNo r1, RationalNo r2)
    {
        int r1_num = r1.getNume();
        int r2_num = r2.getNume();

        int r1_denom = r1.getDenom();
        int r2_denom = r2.getDenom();

        int r1_num_new = r1_num*r2_denom;
        int r2_num_new = r2_num*r1_denom;

        String result = "";


        if (r2_denom == r1_denom)
        {
            r1_num_new = r1_num;
            r2_num_new = r2_num;
        }

        if (r1_num_new == r2_num_new)
        {
            result = "=";
        }

        else if (r1_num_new > r2_num_new)
        {
            result = ">";
        }

        else
        {
            result = "<";
        }

        return result;
    }

    public float convertToFloat(RationalNo r1)
    {
        return (float) r1.getNume() / r1.getDenom();
    }

    public RationalNo absoluteRational(RationalNo r1)
    {
        return new RationalNo(Math.abs(r1.getNume()), Math.abs(r1.getDenom()));
    }
}