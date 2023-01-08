package br.com.arneidev.listcarros;

import java.util.ArrayList;
import java.util.List;

public class Carro<F> {
    private F car;

    public Carro(F car) {
        this.car = car;
    }

    public void getListCarro() {
       listCarros();
    }
    private void listCarros(){
        List<F>listCar = new ArrayList<>();
        listCar.add(car);
        for (F carros:listCar) {
            System.out.println("Carro: "+carros);
        }
    }
}
