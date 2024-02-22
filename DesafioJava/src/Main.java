import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        String product1 = "computer";
        String product2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, wich price is R$ %2f %n", product1, price1);
        System.out.printf("%s, wich price is R$ %2f %n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender %s %n", age, code, gender);
        System.out.printf("Número decimal com 8 casas: %.8f%n", measure);
        System.out.printf("Número decimal com 3 casas: %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f%n", measure);
    }
}