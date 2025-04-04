/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista2;

/**
 *
 * @author aluno
 *  Implemente uma classe Carro com os seguintes atributos: modelo, cor, ano, marca, velocidade.
 */
public class carro {
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        if(this.velocidade == 1 || this.velocidade == -1 || this.velocidade == 3){
            metodo();
        }else{
            System.out.println("Erro!");
        }
        this.velocidade = velocidade;
    }
    private String cor;
    private int ano;
    private String marca;
    private float velocidade;
    int x =0; 
   
    public void metodo(){
        if(velocidade == 1){
            x += 5;
        }if(velocidade == -1){
            x -= 5;
        }if(velocidade == 3){
            x = 0;
        }
    }
}
