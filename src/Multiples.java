public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (i < 1000) {
            count += doMultiples(i);
            i++;
        }

        System.out.println(count);
    }

    public static int doMultiples(int i) {

        if (i % 3 == 0 || i % 5 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

