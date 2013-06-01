package MilitarPackage;

import java.util.ArrayList;

public class Marinha extends Militares {
    
    private ArrayList<String> embarcacoes = new ArrayList();
   
    public ArrayList<String> getEmbarcacoes()
    {
        return embarcacoes;
    }
    
    public void adcionarEmbarcacao(String embarcacao)
    {
        this.embarcacoes.add(embarcacao);
    }
    
    public boolean removerAeronave (String embarcacao)
    {
       String embarcacaoI;
       embarcacao = embarcacao.toUpperCase();
        for (int i=0; i<getEmbarcacoes().size(); i++)
        {
            embarcacaoI = getEmbarcacoes().get(i).toUpperCase();
            if (embarcacaoI.equals(embarcacao))
            {
                getEmbarcacoes().remove(i);
                return true;
            }
        }
        return false;
    }
}
