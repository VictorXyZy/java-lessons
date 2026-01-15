package LESSON1;

public class Width {
    public static void main(String[] args) {

        // %[width]
        // 0 = zero padding
        // positive number = right justified padding
        // negative number = left jsutified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 354;
        int id4 = 9876;

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);
    }
}
