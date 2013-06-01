package OperacoesPackage;

public class Operacoes {
    
    private String nomeOperacao;
    private String dificuldade;
    private  long IdOperacao;
    private static long idIncremento;

    public Operacoes()
    {
        idIncremento++;
    }

    public String getNomeOperacao()
    {
        return nomeOperacao;
    }

    public void setNomeOperacao(String nomeOperacao)
    {
        this.nomeOperacao = nomeOperacao;
    }

    public String getDificuldade()
    {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade)
    {
        this.dificuldade = dificuldade;
    }

    public  long getIdOperacao()
    {
        return IdOperacao;
    }

    public  void setIdOperacao(long IdOperacao)
    {
        this.IdOperacao = IdOperacao;
    }
    
    public boolean Equals(Object obj)
    {
        Operacoes operacao;
        if (obj instanceof Operacoes)
        {
            operacao = (Operacoes) obj;
            if (operacao.getNomeOperacao().equals(this.getNomeOperacao()))
            {
                if(operacao.getIdOperacao() == this.getIdOperacao())
                {
                    return true;
                }
            }
        }
        return false;
    }    
}
