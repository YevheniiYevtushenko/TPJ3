public class Main {
    public static void main(String[] args)
    {
        short s1 = 99, s2 = 99;
        float f1, f2;
        byte b = -10;
        boolean q = true;
        s1 = (short) Math.pow(b, 2);
        s2 = (short) ((Math.random() * (10 - 0)) + 0);
        float d1, d2;
        d2 = (float) ((Math.random() * (9999 - 1)) + 1);
        d1 = d2/(s1*s2);

    }
}