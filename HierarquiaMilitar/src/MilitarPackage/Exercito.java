package MilitarPackage;

import java.util.ArrayList;

public class Exercito extends Militares {
    
    private ArrayList<String> armamentos = new ArrayList();
    private boolean soldadoDeElite;
    private boolean atiradorDeElite;

    public void setArmamentos(ArrayList<String> armamentos) {
        this.armamentos = armamentos;
    }

    public ArrayList<String> getArmamentos()
    {
        return armamentos;
    }

     public void adcionarArmamento(String armamento)
    {
        this.armamentos.add(armamento);
    }
    
    public boolean removerArmamento (String armamento)
    {
       String armamentoI;
       armamento = armamento.toUpperCase();
        for (int i=0; i<getArmamentos().size(); i++)
        {
            armamentoI = getArmamentos().get(i).toUpperCase();
            if (armamentoI.equals(armamento))
            {
                getArmamentos().remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean isSoldadoDeElite()
    {
        return soldadoDeElite;
    }

    public void setSoldadoDeElite(boolean soldadoDeElite)
    {
        this.soldadoDeElite = soldadoDeElite;
    }

    public boolean isAtiradorDeElite()
    {
        return atiradorDeElite;
    }

    public void setAtiradorDeElite(boolean atiradorDeElite)
    {
        this.atiradorDeElite = atiradorDeElite;
    }
    
}
