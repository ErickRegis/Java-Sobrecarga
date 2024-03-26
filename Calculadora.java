import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        /* Isso é um método etático = System.out.println(Operacao.msgEstatica()); */

        while (true) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite a operação: \n"
                    + "1- Adição de dois valores inteiros\n"
                    + "2- Subtração\n"
                    + "3- Multiplicação\n"
                    + "4- Divisão\n"
                    + "5- Exponenciação\n"
                    + "6- Fatorial\n"
                    + "7- Adição de três valores\n"
                    + "8- Adição de dois valores em texto\n"
                    + "9- Encerrar processo");

            int tipo = teclado.nextInt();
            if (tipo == 9) {
                System.out.println("Encerrando o programa...");
                break;
            }

            System.out.println("Digite o 1º valor: ");
            int valor1 = teclado.nextInt();
            int valor2 = 0;
            if (tipo != 6) {
                System.out.println("Digite o 2º valor: ");
                valor2 = teclado.nextInt();
            }

            Operacao operacao = new Operacao(valor2, valor2, valor2, valor2, valor2);

            switch (tipo) {
                case 1:
                    System.out.println("Adição de 2º valores inteiros = " + operacao.soma(valor1, valor2));
                    break;

                case 2:
                    operacao.setMinuendo(valor1);
                    operacao.setSubtraendo(valor2);
                    System.out.println("Subtração = " + operacao.subtracao());
                    break;

                case 3:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    System.out.println("Mulitiplicação = " + operacao.multiplicacao());
                    break;

                case 4:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico2(valor2);
                    System.out.println("Divisão = " + operacao.divisao());
                    break;

                case 5:
                    System.out.println("Exponenciais = " + operacao.exponecial(valor1, valor2));
                    break;

                case 6:
                    operacao.setFatorial(valor1);
                    System.out.println("Fatorial = " + operacao.getFatorial());
                    break;

                case 7:
                    System.out.println("Adição de 3 valores = " + operacao.soma(valor1, valor2, 78));
                    break;

                case 8:
                    System.out.println("Adição de 2 valores texto = "
                            + operacao.soma(Integer.toString(valor1), Integer.toString(valor2)));
                    break;

                default:
                    System.out.println("Operação inválida");
            }
        }
    }
}