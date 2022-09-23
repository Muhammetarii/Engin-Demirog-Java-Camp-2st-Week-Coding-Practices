public class Main {
    public static void main(String[] args) {
        // Method isimleri camelCase olarak isimlendirilir.
        // Class isimleri PascalCase olarak isimlendirilir.
        numberFind();
        numberFind();
        numberFind();
        numberFind();
    }

    public static void numberFind() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int find = 6;
        boolean isThere = false;
        for (int number : numbers) {
            if (number == find) {
                isThere = true;
                break;
            }
        }
        String message = "";
        if (isThere) {
            message = "Sayı mevcuttur. " + find;
            messageGet(message);
        } else {
            messageGet("Sayı mevcut değildir. " + find);
        }
    }
    public static void messageGet(String message) {
        System.out.println(message);

    }
}