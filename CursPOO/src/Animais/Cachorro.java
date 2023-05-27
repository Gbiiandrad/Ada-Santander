package Animais;

public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDorabo;

    public String estadoDeEspirito;

    public void comer(){
    }

    public void latir(){
        System.out.println("Au Au");
    }

    public String pegar(){
        return "Bolinha";
    }

    public  String interagir (String acao){

        switch (acao){
            case "carinho":
                this.estadoDeEspirito = "Feliz! 😍";
            break;

            case "dormir":
                this.estadoDeEspirito = "Bravo! 😡";
            break;

            case "gritar":
                this.estadoDeEspirito = "triste! 🥺";
            break;

            default:
                this.estadoDeEspirito = "Neutro! 🙄";
        }
        return this.estadoDeEspirito;
    }
}
