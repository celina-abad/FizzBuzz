public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int value = 100;
        while (value > 0) {
            boolean even = value % 2 == 0;
            if (even) {
                value = value / 2;
            } else {
                value = value - 1;
            } count++;
        } System.out.println(count);
    }
}
