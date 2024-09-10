/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import Model.Chapa;
import Model.ImportadorUrna;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author richa
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        ImportadorUrna imp = new ImportadorUrna();
        
        //System.out.print("Informe o caminho do arquivo: ");
        //String caminho = sc.nextLine();
        
        imp.setArquivo(new File("C:\\Users\\richa\\Desktop\\POO\\ReposicaoP3_Urnas.csv"));
        imp.processarArquivo();
        
        Set<Map.Entry<Chapa, Integer>> entradas = imp.getVotos().entrySet();
        
        for (Map.Entry<Chapa, Integer> e : entradas) {
            System.out.println("\n***** CHAPA *****");
            System.out.println("Nome da chapa: " + e.getKey().getNome());
            System.out.println("Nome do presidente da chapa: " + e.getKey().getPresidente());
            System.out.println("Nome do curso do presidente da chapa: " + e.getKey().getCursoPresidente());
            System.out.println("Nome do vice da chapa: " + e.getKey().getVicePresidente());
            System.out.println("Nome do curso do vice da chapa: " + e.getKey().getCursoVicePresidente());
        }
        
        System.out.println("\n\nO total de votos da eleição foi de " + imp.obterTotalVotos());
        

        
    }
    
}
