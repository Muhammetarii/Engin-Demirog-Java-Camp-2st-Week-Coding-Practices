public class Main {
    public static void main(String[] args) {
        // void operasyonlar bir şeyi yap kipinde emir operasyonudur.
        String message = "Bugün hava çok güzel.";
        System.out.println(message);
        String newMessage = cityGet();  //substring değer döndürür.
        System.out.println(newMessage);
        int number = gather(13, 7);
        System.out.println(number);
        int total = gatherTwo(2);
        System.out.println(total);

    }

    public static void add() {
        System.out.println("Eklendi.");

    }

    public static void delete() {
        System.out.println("Silindi.");

    }

    public static void update() {
        System.out.println("Güncellendi.");

    }

    public static int gather(int numberone, int numbertwo) {
        return numberone + numbertwo;
    }

    public static int gatherTwo(int... numbers) { //variables arguments
        int total = 0;
        for (int number : numbers) {
            total += number;

        }
        return total;

    }

    public static String cityGet() {
        return "Ankara";
    }
}