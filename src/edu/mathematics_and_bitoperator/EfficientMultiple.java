package edu.mathematics_and_bitoperator;

public class EfficientMultiple {
    public static void main(String[] args) {
        System.out.println(multipleBySeven(5));
    }
    private static int multipleBySeven(int n)
    {
        return ((n<<3 )-n);
    }
}
