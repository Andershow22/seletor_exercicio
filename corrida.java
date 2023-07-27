
package seletor_exercicio;


public abstract class corrida extends exercicio {
    private float distancia;
    private String movimento;
    private int duracao_em_minutos;
    public corrida(String nome, String descricao, float distancia, String movimento, int duracao_em_minutos){
        super(nome,descricao);
        this.distancia = distancia;
        this.movimento = movimento;
        this.duracao_em_minutos = duracao_em_minutos;
    }
}
