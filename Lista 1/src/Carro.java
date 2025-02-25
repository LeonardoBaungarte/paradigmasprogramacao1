import javax.swing.*;

public class Carro{
    public int ano;
    public float velocidade;
    public String marca, modelo;

    public Carro(){
        this.marca = "Marca inválida";
        this.modelo = "Modelo inválido";
    }

    public Carro(int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    //metodos
    public void exibirDetalhes() {
        JOptionPane.showMessageDialog(null,"\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nAno: "
                + this.ano + "\nVelocidade: " + this.velocidade);
    }

    //vai acelera o carro em x unidades
    public void acelerar(float x){
        this.velocidade += x;
    }

    public void frear(float x){
        if(this.velocidade -x >= 0){
            this.velocidade -= x;
        }else{
            System.out.println("Não é possível frear o carro");
        }
    }
}
