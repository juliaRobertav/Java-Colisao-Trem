import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner trem = new Scanner(System.in);

        double SOa = 0;
        //SOa = posição inicial A

        double SOb = 0;
        //SOb = posição inicial B

        double Va = 0;
        //Va = velocidade A

        double Vb = 0;
        //Vb = velocidade B

        double calculo_tempo = 0;
        double calculo_velocidade = 0;
        double tempo;

        while (true) {
            try {
                while (true) {
                    System.out.println("Digite a posicao inicial do Trem A:");
                    SOa = trem.nextDouble();
                    System.out.println("Digite a posicao inicial do Trem B:");
                    SOb = trem.nextDouble();
                    System.out.println("Digite a velocidade do Trem B(NEGATIVA):");
                    Vb = trem.nextDouble();
                    System.out.println("Digite a velocidade do Trem A(POSITIVA):");
                    Va = trem.nextDouble();
                    break;
                }

                while (true) {
                    //cálculo do tempo
                    System.out.println("Calculo do tempo(em horas):");
                    System.out.println((SOa - SOb) / (Vb - Va));
                    calculo_tempo = trem.nextDouble();
                    System.out.println(calculo_tempo);
                    break;
                }

                while (true) {
                    //cálculo da velocidade
                    System.out.println("Calculo da velocidade:");
                    System.out.println((SOa + Va) * calculo_tempo);
                    calculo_velocidade = trem.nextDouble();
                }

            } catch (Exception e) {
                //erros
                if (SOa > 10.000 || SOb > 10.000) {
                    System.out.println("Erro...Posição inválida...Está entre 0 e 10.000KM...");

                } else if (Va > 300 || Vb > 300) {
                    System.out.println("Erro...Velocidade inválida...Até 300km/h apenas...");
                } else if (calculo_tempo == 0 && calculo_velocidade == 0 || calculo_tempo != calculo_velocidade) {
                    System.out.println("Os trens não irão colidir");
                } else {
                    System.out.println("Ops...você digitou caracteres invalidos" +
                            "Precisamos que digite apenas números");
                    break;
                }
            }


        }
    }
}