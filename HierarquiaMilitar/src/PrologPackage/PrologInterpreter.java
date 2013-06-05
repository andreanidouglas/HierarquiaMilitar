/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PrologPackage;

import java.util.Hashtable;
import jpl.Query;

/**
 *
 * @author Doug
 */
public class PrologInterpreter {
    private Query executor;

    public Query getExecutor() {
        return executor;
    }

    public void setExecutor(Query executor) {
        this.executor = executor;
    }
    
    public PrologInterpreter(String queryAExecutar)
    {
        executor = new Query(queryAExecutar);
    }
    
    public Hashtable[] todasSolucoes(Query executor)
    {
        int nSolucoes=0;
        Hashtable[] solucoes = null;
        if (executor.hasSolution())
        {
            solucoes[nSolucoes] = executor.getSolution();
            nSolucoes++;
            while (executor.hasMoreSolutions())
            {
                solucoes[nSolucoes] = executor.nextSolution();
            }
            return solucoes;
        }
        return null;
    }
    
}
