import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //receber do usuário o tempo q ele gastou na viagem
        System.out.println("Qual o tempo gasto na viagem: ");
        double tempoViagem = input.nextDouble();

        //velocidade média
        System.out.println("A velocidade média durante a viagem (em km/h) é de: ");
        int velocidadeMedia = input.nextInt();

        int consumoCombustivel = 12;

        //descobrir qual distância percorrida
        //chamando função 'distanciaDistancia' com seus respectivos argumentos
        //resultado armazenado na variável tipo double 'distanciaPercorrida'
        double distanciaPercorrida = calculaDistancia(velocidadeMedia, tempoViagem);
        System.out.println("A distância percorrida (em km) foi de:  " + distanciaPercorrida);

        double combustivelNecessario = calculaCombustivel(distanciaPercorrida, consumoCombustivel);
        System.out.printf("Para a distância percorrida, será necessário %.3f litros de combustivel", combustivelNecessario);

    }
    public static double calculaDistancia(int velocidadeMedia, double tempoViagem) {
        double distancia = velocidadeMedia * tempoViagem;
        return distancia;
    }


    public static double calculaCombustivel(double distanciaPercorrida, int consumoCombustivel){
        double combustivel = distanciaPercorrida / consumoCombustivel;
        return combustivel;
    }
}


