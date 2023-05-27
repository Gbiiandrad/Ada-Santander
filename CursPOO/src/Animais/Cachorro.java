package Animais;

public class Cachorro {
    //Atributos
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDorabo;

    private String estadoDeEspirito;

    //Costrutores

    //Construtores Padrão:
    public Cachorro(){}

    // Costrutores Adicionais
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDorabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDorabo = tamanhoDorabo;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    //metodos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDorabo() {
        return tamanhoDorabo;
    }

    public void setTamanhoDorabo(int tamanhoDorabo) {
        this.tamanhoDorabo = tamanhoDorabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }


    //acões:
    public void comer(){
    }

    public void latir(){
        System.out.println("Au Au 🐕");
    }

    public String pegar(){
        return "Bolinha ⚽";
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
