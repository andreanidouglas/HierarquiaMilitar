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
        try (FileWriter escritor = new FileWriter(fileName, true)) {
            escritor.write(linhaASerEscrita + System.getProperty("line.separator"));
        }
    }
    
    public void escreverRegras() throws IOException
    {
        
       this.escritorArquivo("dificuldade(facil).");
       this.escritorArquivo("dificuldade(medio)." );
       this.escritorArquivo("dificuldade(dificil)." );
        
       this.escritorArquivo("requisitos(X, Y):-aitradorElite(X),Y == 'atiradorElite';"
               + "(soldadoElite(X), Y == 'soldadoElite');"
               + "(pilotoAviao(X), Y == 'pilotoAviao');"
               + "(pilotoHelicoptero(X), Y == 'pilotoHelicoptero');"
               + "(veiculos(X,K), nth0(Zindex,Klist,'granada'), Zindex > 0, Y == 'infantaria');"
               + "(veiculos(X,K), nth0(Zindex,Klist,'cargueiro'), Zindex > 0, Y == 'transporte de carga');"
               + "(veiculos(X,K), nth0(Zindex,Klist,'transporte de tripulação'), Zindex > 0, Y == 'transporte de tripulacao');"
               + "." );
    }
}
