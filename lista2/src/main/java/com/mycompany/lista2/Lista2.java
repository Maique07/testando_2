/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista2;

import java.util.Scanner;

/**
 *
 * @author aluno
 * . Crie o projeto Veículo. Implemente uma classe Carro com os seguintes atributos: modelo, cor, ano, marca, velocidade.
Faça o encapsulamento de seus atributos;
Implemente o método acelera que aumenta a velocidade em 5 km/h, se receber 1 ou diminui a velocidade em 5 km/h se receber -1;
Implemente o método freia que para o carro – Velocidade = 0 km/h.
Após criada a classe Carro, crie a classe Principal, instancie um objeto da classe Carro, solicite os dados ao usuário e utilize os métodos da classe
 */
public class Lista2 {

    public static void main(String[] args) {
        carro c = new carro();
        Scanner s = new Scanner(System.in);
        System.out.println("informe o modelo do carro: ");
        c.setModelo(s.next());
        System.out.println("informe a cor do carro: ");
        c.setCor(s.next());
        System.out.println("informe a marca do carro: ");
        c.setMarca(s.next());
        System.out.println("informe o ano do carro: ");
        c.setAno(s.nextInt());
        int opcao; 
        do{
        System.out.println("\nMenu:");
        System.out.println("\n1: acelerar ");
        System.out.println("\n2: diminuir ");
        System.out.println("\n3: freia");
        System.out.println("\n4: mostrar informacoes do carro: ");
        opcao = s.nextInt();
        
        switch(opcao){
            case 1:
                c.setVelocidade(1);
                System.out.println("carro acelerando.");
                break;
                case 2:
                c.setVelocidade(2);
                 System.out.println("carro desacelerando.");
                break;
                case 3:
                c.setVelocidade(3);
                 System.out.println("carro parou.");
                break;
                case 4:
                c.setVelocidade(4);
                 System.out.println(
               "modelo='" + c.getModelo() + "\n" + 
               " cor='" + c.getCor() + '\'' + 
               " ano=" + c.getAno()+ 
               " marca='" + c.getMarca() + '\'' + 
               " velocidade=" + " km/h");
                break;
                case 5:
                c.setVelocidade(1);
                
        }
    } while(opcao != 0);
    }
}
