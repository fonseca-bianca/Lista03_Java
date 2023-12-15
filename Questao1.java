import java.util.Scanner;

public class Questao1{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //usuário deverá inserir o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        //usuário deverá inserir o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        //função criada pra aparecer pro usuário as opções de operação q ele poderá fazer entre 1-4
        menuDeOpcoes();

        //usuário irá escolher de 1-4 qual operação deseja fazer
        System.out.print("Escolha a operação entre as opções 1 e 4 que deseja fazer: ");
        int operacao = input.nextInt();

        //'resultado' é a variável q será usada pra armazenar o resultado da operação. Começa em zero, pois é seu valor inicial
        double resultado = 0;

        //blocos do switch irão percorrer a variável conforme opção digitada pelo usuário
        switch (operacao) {
            case 1:
                resultado = soma(num1, num2);
                break;
            case 2:
                resultado = subtracao(num1, num2);
                break;
            case 3:
                resultado = multiplicacao(num1, num2);
                break;
            case 4:
                resultado = divisao(num1, num2);
                break;
            default:
                System.out.println("ERRO! Digite um número de 1-4 para realizar a operação.");
                return;
        }

        //imprimir o resultado
        System.out.println("O resultado da operação é: " + resultado);
    }

    //função q vai exibir o menu de operações
    public static void menuDeOpcoes() {
        System.out.println("Escolha a operação:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
    }

    // Função para realizar a soma
    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    // Função para realizar a subtração
    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    // Função para realizar a multiplicação
    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    // Função para realizar a divisão
    public static double divisao(double num1, double num2) {
            return num1 / num2;
    }
}


