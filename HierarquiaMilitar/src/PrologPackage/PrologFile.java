/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PrologPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Doug
 */
public class PrologFile {

    private String fileName;
    
    public PrologFile(String fileName)
    {
        this.fileName = fileName;
    }
    
    public static boolean verificaExistenciaDoArquivo(String fileName)
    {
        File arquivo = new File(fileName);
        if (arquivo.exists())
        {
            return true;
        }
        return false;
    }
    
    public static boolean criaArquivo(String fileName)
    {
        File arquivo = new File(fileName);
        try 
        {
            if (arquivo.createNewFile())
            {
                return true;
            }
        } 
        catch (IOException ex) 
        {
            ex.getStackTrace();
            return false;
        }
        return false;
    }
    
    public void escritorArquivo(String linhaASerEscrita) throws IOException
    {
        FileWriter escritor = new FileWriter(fileName, true);
        escritor.write(linhaASerEscrita + System.getProperty("line.separator"));
        escritor.close();
    }
}
