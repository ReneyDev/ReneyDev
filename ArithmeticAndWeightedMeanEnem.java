import java.util.Scanner;

public class ArithmeticAndWeightedMeanEnem {
    public static void main(String args[]) {
        Scanner Peso = new Scanner(System.in);
        System.out.println("Você quer calcular as sua notas utilizando pesos especifícos? (Responda com \"True\" ou \"False\".)");
        boolean peso = Peso.nextBoolean();

        if (peso) {
            Scanner Peso1 = new Scanner(System.in);
            System.out.println("Qual o peso que deseja para Linguagens?");
            int peso1 = Peso1.nextInt();

            Scanner Peso2 = new Scanner(System.in);
            System.out.println("Qual o peso que deseja para Humanas?");
            int peso2 = Peso2.nextInt();

            Scanner Peso3 = new Scanner(System.in);
            System.out.println("Qual o peso que deseja para Naturais?");
            int peso3 = Peso3.nextInt();

            Scanner Peso4 = new Scanner(System.in);
            System.out.println("Qual o peso que deseja para Exatas?");
            int peso4 = Peso4.nextInt();

            Scanner Peso5 = new Scanner(System.in);
            System.out.println("Qual o peso que deseja para a Redação?");
            int peso5 = Peso5.nextInt();

            System.out.println("Obrigado.");

            Scanner Nota1 = new Scanner(System.in);
            System.out.println("Agora Insira sua nota em Linguagens, Códigos e suas Tecnologias:");
            Double nota1 = Nota1.nextDouble();

            Scanner Nota2 = new Scanner(System.in);
            System.out.println("Insira sua nota em Ciências Humanas e suas Tecnologias:");
            Double nota2 = Nota2.nextDouble();

            Scanner Nota3 = new Scanner(System.in);
            System.out.println("Insira sua nota em Ciências da Natureza e suas Tecnologias:");
            Double nota3 = Nota3.nextDouble();

            Scanner Nota4 = new Scanner(System.in);
            System.out.println("Insira sua nota em Matemática e suas Tecnologias:");
            Double nota4 = Nota4.nextDouble();

            Scanner Nota5 = new Scanner(System.in);
            System.out.println("Insira sua nota na Redação:");
            Double nota5 = Nota5.nextDouble();

            System.out.println("Sua média ponderada no Enem foi de: " + ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) + (nota4 * peso4) + (nota5 * peso5)) / (peso1 + peso2 + peso3 + peso4 + peso5));
            
        } else {
            
            Scanner Nota1 = new Scanner(System.in);
            System.out.println("Insira sua nota em Linguagens, Códigos e suas Tecnologias:");
            Double nota1 = Nota1.nextDouble();

            Scanner Nota2 = new Scanner(System.in);
            System.out.println("Insira sua nota em Ciências Humanas e suas Tecnologias:");
            Double nota2 = Nota2.nextDouble();

            Scanner Nota3 = new Scanner(System.in);
            System.out.println("Insira sua nota em Ciências da Natureza e suas Tecnologias:");
            Double nota3 = Nota3.nextDouble();

            Scanner Nota4 = new Scanner(System.in);
            System.out.println("Insira sua nota em Matemática e suas Tecnologias:");
            Double nota4 = Nota4.nextDouble();

            Scanner Nota5 = new Scanner(System.in);
            System.out.println("Insira sua nota na Redação:");
            Double nota5 = Nota5.nextDouble();

            System.out.println("Sua média no Enem foi de: " + (nota1 + nota2 + nota3 + nota4 + nota5) / 5);
        }
    }
}
