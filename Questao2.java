import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //solicitar ao usuário q digite temperatura q deseja converter
        System.out.println("Digite a temperatura: ");
        double temperatura = input.nextDouble();

        //solicitar ao usuário a medida da temperatura fornecida
        System.out.println("Digite a medida atual: ");
        String medidaAtual = input.next().toLowerCase(); //caso usuário inicie com minúscula, pois '.equals()' é sensível à Maiúscula e minúscula

        //solicitar ao usuário q diga pra qual medida ele quer converter a atual
        System.out.println("Digite a medida que você quer que converta a temperatura: ");
        String medidaFinal = input.next().toLowerCase();

        //chamada do método 'converterTemperatura()' pra q ele converta a temperatura fornecida pelo usuário
        double temperaturaFinal = converterTemperatura(temperatura, medidaAtual, medidaFinal);

       if(temperaturaFinal != temperatura){
            System.out.println("A temperatura final convertida é: " + temperaturaFinal + " " + medidaFinal);
        } else{
           System.out.println("Não é possível converter a temperatura, pois não foi dada em Celsius.");
       }
    }

    //método estático definido pra converter a temperatura de celsius pra kelvin
    public static double converterTemperatura(double temperatura, String medidaAtual, String medidaFinal){
        if(medidaAtual.equals("celsius") && medidaFinal.equals("kelvin")){ //comparando se for Maiúscula ou minúscula tanto faz

            return temperatura + 273.15; //convertendo tempertura de celsius pra kelvin
        }
        return temperatura; //esse return é obrigatório por ser função, mas não vai retornar pq se não for True no if acima, ele já vai ter caído no loop anterior
    }
}

