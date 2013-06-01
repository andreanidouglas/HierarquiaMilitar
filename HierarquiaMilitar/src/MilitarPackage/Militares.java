package MilitarPackage;

public abstract class Militares {
    private String patente;
    private String nome;
    private String sobrenome;
    private String nacionalidade;
    private String especializacao;

    public Militares()
    {
        
    }
    
    public String getPatente()
    {
        return patente;
    }

    public void setPatente(String patente)
    {
        this.patente = patente;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getSobrenome()
    {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }

    public String getNacionalidade()
    {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade)
    {
        this.nacionalidade = nacionalidade;
    }

    public String getEspecializacao()
    {
        return especializacao;
    }

    public void setEspecializacao(String especializacao)
    {
        this.especializacao = especializacao;
    }

     
}
