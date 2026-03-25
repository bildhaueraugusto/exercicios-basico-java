package scanner;

public class ex2Facul {
    public static void main (String[] args) {

        int a = 1;
        int b = 5;
        int c = 6;

        int delta;
        int x1;
        int x2;

        delta = b * b - 4 * a * c;
        x1 = ((-b + 1) / 2 * a);
        x2 = ((-b - 1) / 2 * a);

        System.out.println("O resultado do delta é: " + delta);
        System.out.println("O resultado de x1 é: " + x1);
        System.out.println("O resultado de x2 é: " + x2);
    }
}
