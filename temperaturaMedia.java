import java.util.Scanner;

public class temperaturaMedia {
    public static void main(String[] args) {
        int[] dia = new int[5];
        double[] temp = new double[5];
        Scanner ler = new Scanner(System.in);
        double maior = -51;
        double menor = 101;
        double media = 0.0;
        int flagmenor = 0;
        int flagmaior = 0;
        double controle;
        int[] diaBaixo = new int[5];
        System.out.println("BEM VINDO AO PROGRAMA CONTROLE DE TEMPERATURAS");
        System.out.println("NÃO SÃO ACEITAS TEMPERATURAS ACIMAS DE 100° OU ABAIXO DE -50");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < 5; i++) {
                dia[i] = i + 1;
                System.out.println("Digite a temperatura para o dia " + (i + 1) + ": ");
                temp[i] = ler.nextDouble();
                controle = temp[i];
                if (controle > 100 || controle < -50) {
                    System.out.println("Temperaturas acima de 100° ou abaixo de -50° não são permitidas!");
                    i--;
                }
        }

        for (int i = 0; i < 5; i++) {
            if (temp[i] > maior) {
                maior = temp[i];
                flagmaior = i;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (temp[i] < menor) {
                menor = temp[i];
                flagmenor = i;
            }
        }
        for (int i = 0; i < 5; i++) {
            media = media + temp[i];
            }
        media = media / 5.0;

        for (int i = 0; i < 5; i++) {
            if(temp[i] < media){
                diaBaixo[i] = dia[i];
            }
        }
        System.out.println("Menor temperatura foi: " +menor+" no dia " + dia[flagmenor]);
        System.out.println("Maior temperatura foi: " +maior+" no dia " + dia[flagmaior]);
        System.out.println("A temperatura média entre os dias foi: "+media);
        System.out.println("Dias com temperatura abaixo da média:");
        for (int i = 0; i < 5; i++) {
            if(diaBaixo[i] > 0){
                System.out.println("Dia: "+diaBaixo[i]);
            }
        }
    }
}