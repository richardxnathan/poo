/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author richa
 */
public class ImportadorUrna {
    
    private Map<Chapa, Integer> votos;
    private File arquivo;

    public ImportadorUrna() {
        votos = new HashMap<>();
    }

    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }
    
    public void processarArquivo() throws FileNotFoundException{
        Scanner s = new Scanner(arquivo);
        
        s.nextLine();
        
         while(s.hasNextLine()){
              String[] linha = s.nextLine().split(";");
              
              Chapa chapa = new Chapa(linha[2], linha[0], linha[1], linha[3], linha[4] );
              
              Integer quantidadeVotos = votos.get(chapa);
              
              if (quantidadeVotos != null){
                  votos.put(chapa,Integer.parseInt(linha[5]) + quantidadeVotos); 
              }else{
                  votos.put(chapa,Integer.parseInt(linha[5]));
              }           
              
          }
    }

    public Map<Chapa, Integer> getVotos() {
        return votos;
    }
    
    public int obterTotalVotos(){
        
        Integer totalVotos = 0;
        
        Set<Map.Entry<Chapa, Integer>> entradas = this.votos.entrySet();
        
        for (Map.Entry<Chapa, Integer> e : entradas) {
            totalVotos += e.getValue();
        }
        
        return totalVotos;
    }
    
    public Entry<Chapa, Integer> obterChapaVencedora(){
        
        Set<Map.Entry<Chapa, Integer>> entradas = this.votos.entrySet();
        
        Integer maisVotos = 0;
        Chapa chapaVencedora = null;
        
        for (Map.Entry<Chapa, Integer> e : entradas) {

            if(e.getValue() > maisVotos){
                maisVotos = e.getValue();
                chapaVencedora = e.getKey();
            }
        }
        
        return (Entry<Chapa, Integer>) chapaVencedora;
    }
    
    
}
