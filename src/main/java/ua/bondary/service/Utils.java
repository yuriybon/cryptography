package ua.bondary.service;

public class Utils {

    public static long power(long a, long b) {
        long result = 1;
        for (int i=1; i<=b; i++)
            result = result * a;
        return result;
    }
}
