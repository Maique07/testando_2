package lista2;

/**
 *
 * @author Maique
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
    private float velocidade;
    public float getVelocidade() {
        return velocidade;
    }
    private String cor;
    private int ano;
    private String marca; 
   
    public void metodo(int x){
        if(x == 1){
            this.velocidade += 5;
        }else if(x == -1){
            this.velocidade -= 5;
        }else if(x == 3){
            this.velocidade = 0;
        }
    }
}


