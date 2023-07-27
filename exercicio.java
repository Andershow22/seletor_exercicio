
package seletor_exercicio;


public abstract class exercicio {
    //private int numero_repeticao;
    //private int numero_serie;
    private String descricao;
    private String nome;
    
    public exercicio(String nome, String descricao ){
            //this.numero_repeticao = numero_repeticao;
            //this.numero_serie = numero_serie;
            this.descricao = descricao;
            this.nome = nome;
    }
    public String toString() {
        return nome;
        
    }
    public void fazer_exercicio(){
        
    }
}
