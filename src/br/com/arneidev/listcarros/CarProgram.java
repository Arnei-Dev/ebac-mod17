package br.com.arneidev.listcarros;

public class CarProgram {
    public static void main(String[] args){
        Carro<String> carro = new Carro<>("Corola");
        carro.getListCarro();

        Carro<String> carro2 = new Carro<>("Honda");
        carro2.getListCarro();

        Carro<String> carro3 = new Carro<>("Volkswagen");
        carro3.getListCarro();

    }
}
