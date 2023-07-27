
package seletor_exercicio;

public class sugestaoExercicio {
    private musculacao exercicio_musculacao;
    private corrida exercicio_corrida;
     public musculacao getexcMusculacao() {
        return exercicio_musculacao;
    }
    
    public corrida getexcCorrida(){
        return exercicio_corrida;
    }
    public void sorteia(int opcao)
    {
        if(opcao == 1)
        {
            exercicio_musculacao = new Supino(15,2,30);
            exercicio_corrida = new abdominal(0,2);
        }
        else
        {
            exercicio_corrida = new correrNaEsteira(12,2);
            exercicio_musculacao = new legPress(10,2,20);
        }
    }
}
