
package MilitarPackage;

import java.util.ArrayList;


public class ForcaAerea extends Militares
{

    private ArrayList<String> aeronaves = new ArrayList();
    private boolean pilotoHelicoptero;
    private boolean pilotoAviao;
    
    public ForcaAerea()
    {   
    }

    public ArrayList<String> getAeronaves()
    {
        return aeronaves;
    }

    public void adcionarAeronave(String aeronave)
    {
        this.aeronaves.add(aeronave);
    }
    
    public boolean removerAeronave (String aeronave)
    {
       String aeronaveI;
       aeronave = aeronave.toUpperCase();
        for (int i=0; i<getAeronaves().size(); i++)
        {
            aeronaveI = getAeronaves().get(i).toUpperCase();
            if (aeronaveI.equals(aeronave))
            {
                getAeronaves().remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean isPilotoHelicoptero()
    {
        return pilotoHelicoptero;
    }

    public void setPilotoHelicoptero(boolean pilotoHelicoptero)
    {
        this.pilotoHelicoptero = pilotoHelicoptero;
    }

    public boolean isPilotoAviao()
    {
        return pilotoAviao;
    }

    public void setPilotoAviao(boolean pilotoAviao)
    {
        this.pilotoAviao = pilotoAviao;
    }
    
}
