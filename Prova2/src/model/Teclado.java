/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author Robson Walter de Souza
 */
public class Teclado {
    private Scanner scanner;
    
    public Teclado(){
        scanner = new Scanner(System.in);
    }
    
    public LocalDate lerData(){
        boolean erro = false; 
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate valor = null;
        do{
          try{    
            valor = LocalDate.parse(scanner.nextLine(), dtf);
            erro = false;
          }
          catch(NumberFormatException e){
              System.out.println("Valor digitado incorreto. Digite um valor no formato dd/mm/aaaa.");
              erro = true;
          }  
        }while(erro);
        
        return valor;
    }
    
    public int lerInt(){
        boolean erro = false; 
        int valor = 0;
        do{
          try{    
            valor = Integer.parseInt(scanner.nextLine());
            erro = false;
          }
          catch(NumberFormatException e){
              System.out.println("Valor digitado incorreto. Digite um valor Inteiro.");
              erro = true;
          }  
        }while(erro);
        
        return valor;
    }
    
    public double lerDouble(){
        boolean erro = false; 
        double valor = 0;
        do{
          try{    
            valor = Double.parseDouble(scanner.nextLine());
            erro = false;
          }
          catch(NumberFormatException e){
              System.out.println("Valor digitado incorreto. Digite um valor Double.");
              erro = true;
          }  
        }while(erro);
        
        return valor;
    }
    
    public boolean lerBoolean(){
        boolean retorno = false;
        boolean erro = false;
        do{
            erro = false;  
            String valor = scanner.nextLine();
         
            if (valor.equalsIgnoreCase("sim") || 
                valor.equalsIgnoreCase("verdadeiro") ||
                valor.equalsIgnoreCase("positivo") ||
                valor.equalsIgnoreCase("s")){
                retorno = true;
            }else if (valor.equalsIgnoreCase("nao") || 
                      valor.equalsIgnoreCase("falso") ||
                      valor.equalsIgnoreCase("negativo") ||
                      valor.equalsIgnoreCase("n")){
                retorno = false;
            }else{
                System.out.println("Valor incorreto. Digite novamente.");
                erro = true;
            }
        }while(erro);
        
        return retorno;
    }
    
    public String lerString(){
        return scanner.nextLine();
    }
}