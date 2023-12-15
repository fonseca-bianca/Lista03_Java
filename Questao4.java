import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = input.next();

        System.out.println("Total de horas trabalhadas no mês: ");
        int horasTrabalhadas = input.nextInt();

        System.out.println("O valor da hora trabalhada é de R$ ");
        double valorHoraTrabalhada = input.nextDouble();

        //chamando função 'calculaSalario' com os argumentos (horasTrabalhadas e valorHoraTrabalhada
        //resultado é armazenado na variável 'salarioAnual'
        double salarioAnual = calculaSalario(horasTrabalhadas, valorHoraTrabalhada);

        //iremos imprimir salário total anual do funcionário com apenas 2 casas após a vírgula
        System.out.printf("O salário anual do(a) funcionário(a) %s é de R$%.2f", nome, salarioAnual);
    }

    //função pra calcular o salário: horasTrabalhadas * valorHora
    public static double calculaSalario(int horasTrabalhadas, double valorHoraTrabalhada){
        double salarioMensal = horasTrabalhadas * valorHoraTrabalhada;
        return salarioMensal * 12; //*12 pra obter o salarioAnual
    }
}
