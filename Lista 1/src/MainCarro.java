// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import exe0.Carro;

public class MainCarro {
    public static void main(String[] args) {
        //criano objetos da classe
        Carro obj1 = new Carro();
        obj1.ano = 2022;
        obj1.velocidade = 0;
        obj1.marca = "Volkswagen";
        obj1.modelo = "Polo";
        obj1.exibirDetalhes();
        obj1.acelerar(100);
        obj1.exibirDetalhes();

        Carro obj2 = new Carro(2025, 50, "Fiat", "Toro");
        obj2.exibirDetalhes();
        obj2.acelerar(30);
        obj2.exibirDetalhes();
        obj2.frear(10);
        obj2.exibirDetalhes();

        Carro obj3 = new Carro();
        obj3.exibirDetalhes();

    }
}