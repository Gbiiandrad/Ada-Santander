import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Puppy", "Marron", 25, 5.5, 5, "nada");

        cachorro1.latir();
        System.out.println("Nome: " + cachorro2.getNome());
        System.out.println("Cor: " + cachorro2.getCor());
        System.out.println("Altura: " + cachorro2.getAltura());
        System.out.println("Peso: " + cachorro2.getPeso());
        System.out.println("Tamanho do Rabo: " + cachorro2.getTamanhoDorabo());
        System.out.println("Estado de espirito atual: " + cachorro2.getEstadoDeEspirito());


        System.out.println("O cachorro pegou uma.." + cachorro1.pegar());
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("dormir"));
        System.out.println("O cachorro está " + cachorro1.interagir("gritar"));
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
    }
}