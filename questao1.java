import java.util.Scanner;

public class SistemaEscolarHumanoDeVerdade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];

        System.out.println("Oi! Tudo certo?");
        System.out.println("Seguinte… eu preciso que você me diga suas 8 notas do ano.");
        System.out.println("Nada complicado, prometo. Vamos no seu ritmo.\n");

        for (int i = 0; i < 8; i++) {
            while (true) {
                System.out.printf("Me diga a %dª nota (de 0 a 10): ", i + 1);

                if (!sc.hasNextDouble()) {
                    System.out.println("Então… isso não parece um número. 😅 Tenta de novo?");
                    sc.next();
                    continue;
                }

                double v = sc.nextDouble();
                if (v < 0 || v > 10) {
                    System.out.println("Calma lá! A nota tem que ser entre 0 e 10. Vamos tentar outra vez.");
                    continue;
                }

                notas[i] = v;
                System.out.println("Boa! Anotado aqui.");
                break;
            }

            // Pausa humana (opcional)
            try { Thread.sleep(350); } catch (Exception e) {}
        }

        System.out.println("\nBeleza, agora deixa eu pensar um pouquinho aqui… 🤔");
        try { Thread.sleep(1200); } catch (Exception e) {}

        double b1 = (notas[0] + notas[1]) / 2.0;
        double b2 = (notas[2] + notas[3]) / 2.0;
        double b3 = (notas[4] + notas[5]) / 2.0;
        double b4 = (notas[6] + notas[7]) / 2.0;

        double sem1 = (b1 + b2) / 2.0;
        double sem2 = (b3 + b4) / 2.0;

        double mediaFinal = (sem1 + sem2) / 2.0;

        System.out.println("\nProntinho! Dei uma boa olhada nas suas notas.");
        System.out.println("Dá uma olhada no que eu calculei pra você:\n");

        System.out.printf("• 1º Bimestre: %.1f%n", b1);
        System.out.printf("• 2º Bimestre: %.1f%n", b2);
        System.out.printf("→ Média do 1º Semestre: %.1f%n%n", sem1);

        System.out.printf("• 3º Bimestre: %.1f%n", b3);
        System.out.printf("• 4º Bimestre: %.1f%n", b4);
        System.out.printf("→ Média do 2º Semestre: %.1f%n%n", sem2);

        System.out.println("----------------------------");
        System.out.printf("🌟 MÉDIA FINAL DO ANO: %.1f%n", mediaFinal);
        System.out.println("----------------------------");

        System.out.println();

        if (mediaFinal >= 7) {
            System.out.println("Cara, mandou muito bem! Sério mesmo. Continua assim! 😄");
        } else if (mediaFinal >= 5) {
            System.out.println("Olha, tá indo bem! Só ajustar umas coisinhas que você voa.");
        } else {
            System.out.println("Ei, sem desespero. De verdade. Você consegue melhorar tranquilo.");
        }

        System.out.println("\nValeu por confiar em mim! Qualquer coisa é só chamar. 👍");

        sc.close();
    }
}
