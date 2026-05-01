package vetores;

public class ExFacul40 {
    public static void main(String[] args) {

        int v[] = new int[20];
        int i, num;

        num = 1;
        for (i = 0; i < 20; i++) {
            v[i] = num;
            num = num + 2;
        }

        for (i = 0; i < 20; i++) {
            System.out.println(v[i]);
        }
    }
}
