/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulas_poo;

/**
 *
 * @author 86243542505
 */
    public class SerHumano {
    // Atributos da classe ser humano 
	private String nome; 
	private int idade; 
	private String CorDosOlhos; 
	private String CorDosCabelos; 
        private float altura;
        private String etnia;
        
        public void dormir(){
            System.out.println("zZzZzZzZz");
        }
        
        public void falar(){
            System.out.println("Oi, eu sou um ser humano!");
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorDosOlhos() {
        return CorDosOlhos;
    }

    public void setCorDosOlhos(String CorDosOlhos) {
        this.CorDosOlhos = CorDosOlhos;
    }

    public String getCorDosCabelos() {
        return CorDosCabelos;
    }

    public void setCorDosCabelos(String CorDosCabelos) {
        this.CorDosCabelos = CorDosCabelos;
    }
    
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public String getEtnia() {
        return etnia;
    }

    public void setEtnia(String etnia) {
        this.etnia = etnia;
    }
}