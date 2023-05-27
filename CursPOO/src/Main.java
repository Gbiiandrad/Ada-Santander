import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Puppy";
        cachorro1.cor = "marron";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDorabo = 5;

        cachorro1.latir();
        System.out.println("O cachorro pegou uma.." + cachorro1.pegar());

        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("dormir"));
        System.out.println("O cachorro está " + cachorro1.interagir("gritar"));
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
    }
}