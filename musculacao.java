
package seletor_exercicio;


public abstract class musculacao extends exercicio {
    private float carga;
    private String equipamento;
    private int numero_repeticao;
    private int numero_serie;
    public musculacao(String nome, int numero_repeticao, int numero_serie, String descricao, float carga, String equipamento){
        super(nome,descricao);
        this.carga = carga;
        this.equipamento = equipamento;
        this.numero_repeticao = numero_repeticao;
        this.numero_serie = numero_serie;
    }
}
