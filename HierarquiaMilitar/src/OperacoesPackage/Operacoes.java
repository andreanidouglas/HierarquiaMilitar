package OperacoesPackage;

import java.util.ArrayList;

public class Operacoes {
    
    private String nomeOperacao;
    private String dificuldade;
    private  long IdOperacao;
    private String responsavel;
    private String localidade;
    private static long idIncremento=-1;
    private ArrayList requisitos;
    private ArrayList terreno;
    private ArrayList soldados;

    public ArrayList getSoldados() {
        return soldados;
    }

    public void setSoldados(ArrayList soldados) {
        this.soldados = soldados;
    }

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

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public ArrayList getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(ArrayList requisitos) {
        this.requisitos = requisitos;
    }

    public ArrayList getTerreno() {
        return terreno;
    }

    public void setTerreno(ArrayList terreno) {
        this.terreno = terreno;
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
