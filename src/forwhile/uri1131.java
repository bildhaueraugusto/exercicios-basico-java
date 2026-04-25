package forwhile;

import java.util.Scanner;

public class uri1131 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 1;
        int golInt, golGre, grenal = 0, vitInt = 0, vitGre = 0, emp = 0;

        while (opcao == 1) {

            golInt = sc.nextInt();
            golGre = sc.nextInt();

            if (golInt > golGre) {
                vitInt++;
            }
            if (golGre > golInt) {
                vitGre++;
            }
            if (golGre == golInt) {
                emp++;
            }
            grenal++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            opcao = sc.nextInt();

        }

        System.out.println(grenal + " grenais");
        System.out.println("Inter:" + vitInt);
        System.out.println("Gremio:" + vitGre);
        System.out.println("Empates:" + emp);

        if (vitInt > vitGre) {
            System.out.println("Inter venceu mais");
        }
        if (vitInt < vitGre) {
            System.out.println("Gremio venceu mais");
        }


        sc.close();
    }
}
