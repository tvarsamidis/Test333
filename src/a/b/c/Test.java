package a.b.c;

public class Test {
    public static void main(String[] args) {
        aaa("first 2");
        aaa("second");
        System.out.println("Keep this important line");
    }

    private static void aaa(String second) {
        System.out.println(second);
    }
}
