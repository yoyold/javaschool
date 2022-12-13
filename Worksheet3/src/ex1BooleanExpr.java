public class ex1BooleanExpr {
    public static Boolean ExactlyOne(Boolean a, Boolean b, Boolean c)
    {
        return (a ^ b ^ c) ^ (a && b && c);
    }
}
