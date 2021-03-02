/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prizeApp;

import javax.swing.JOptionPane;

/**
 *
 * @author caique
 */
//Prova de Java
//Professor : Edney
//Alunos    : Caique
//Periodo   : 3°
//Edit 06/04/2019
//

public class Main {
     
    
    // criando variavéis para guardar os numeros da sorte do usuario e         
    public static int jg1 = 0,jg2 = 0,jg3 = 0,jg4 = 0,jg5 = 0,jg6 = 0;
        
    
    
    public static void main(String[] args) {
        start();
    }

    //método para iniciar o programa
    public static void start() {
        Process j = new Process();
        j.gerarCartoes();
        j.mostrarCartoes();
        lerjogo();
        j.conferirResultado();

    }
    
    //método para ler o Process que o usuario ira inserir
    public static void lerjogo() {
        //Questão 4
        //guardando os numeros da sorte do usuario em variaveis
        //Questão 5
        // verificando caso ele insira numeros repetidos
            
        jg1 = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe seu 1° numero da sorte : "
        ,"Questão 4"        
        ,JOptionPane.QUESTION_MESSAGE));
        
        jg2 = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe seu 2° numero da sorte : "
        ,"Questão 4"        
        ,JOptionPane.QUESTION_MESSAGE));
        
        while(jg2 == jg1){
           jg2 = Integer.parseInt(JOptionPane.showInputDialog(null,
             "Você ja inseriu : " + jg2
           + "\n Informe seu 2° numero da sorte : "
           ,"Questão 4"        
           ,JOptionPane.QUESTION_MESSAGE));
        }
        /////////////////////////////
        jg3 = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe seu 3° numero da sorte : "
        ,"Questão 4"        
        ,JOptionPane.QUESTION_MESSAGE));
        
        while(jg3 == jg2 || jg3 == jg1){
           jg3 = Integer.parseInt(JOptionPane.showInputDialog(null,
             "Você ja inseriu : " + jg3
           + "\n Informe seu 3° numero da sorte : "
           ,"Questão 4"        
           ,JOptionPane.QUESTION_MESSAGE));
        }
        //////////////////////////////////
        jg4 = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe seu 4° numero da sorte : "
        ,"Questão 4"        
        ,JOptionPane.QUESTION_MESSAGE));
        
        while(jg4 == jg3 || jg4 == jg2 || jg4 == jg1 ){
           jg4 = Integer.parseInt(JOptionPane.showInputDialog(null,
             "Você ja inseriu : " + jg4
           + "\n Informe seu 4° numero da sorte : "
           ,"Questão 4"        
           ,JOptionPane.QUESTION_MESSAGE));
        }
        /////////////////////////////////////////////////////////
        jg5 = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe seu 5° numero da sorte : "
        ,"Questão 4"        
        ,JOptionPane.QUESTION_MESSAGE));
        
        while(jg5 == jg4 || jg5 == jg3 || jg5 == jg2 || jg5 == jg1 ){
           jg5 = Integer.parseInt(JOptionPane.showInputDialog(null,
             "Você ja inseriu : " + jg5
           + "\n Informe seu 5° numero da sorte : "
           ,"Questão 4"        
           ,JOptionPane.QUESTION_MESSAGE));
        }
        /////////////////////////////////////
        jg6 = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Informe seu 6° numero da sorte : "
        ,"Questão 4"        
        ,JOptionPane.QUESTION_MESSAGE));
        
        while(jg6 == jg5 || jg6 == jg4 || jg6 == jg3 || jg6 == jg2 || jg6 == jg1 ){
           jg6 = Integer.parseInt(JOptionPane.showInputDialog(null,
             "Você ja inseriu : " + jg6
           + "\n Informe seu 6° numero da sorte : "
           ,"Questão 4"        
           ,JOptionPane.QUESTION_MESSAGE));
        }    
            
         menuPrincipal();
          
}
        
        
        
        
    
    
    
    public static void menuPrincipal(){
       int op;
       op = Integer.parseInt(JOptionPane.showInputDialog(null,
                         "_________________________________________________"
                       + "\n| Seus Numeros da sorte são : |" 
                       + "\n| Seu 1° numero da sorte = " + jg1 + " |"
                       + "\n| Seu 2° numero da sorte = " + jg2 + " |"
                       + "\n| Seu 3° numero da sorte = " + jg3 + " |"
                       + "\n| Seu 4° numero da sorte = " + jg4 + " |"
                       + "\n| Seu 5° numero da sorte = " + jg5 + " |"
                       + "\n| Seu 6° numero da sorte = " + jg6 + " |"
                       + "\n-----------------------------------------------"        
                       + "\n Escolha uma ação :"
                       + "\n 1 - Checar "
                       + "\n 2 - Novo jogo "
                       + "\n 0 - Sair"
               ,"Menu principal", JOptionPane.INFORMATION_MESSAGE));
        
      // IF para sair do programa
       if(op == 0){ 
         System.exit(0);
       }
       
       //Questão 4
       //Aqui após ele escolher checar iremos verificar se ele ganhou
       //IF para caso ele queira checar se ganhou
       if(op == 1){
             prizeApp.Process.conferirResultado();
       }
       
       
       //Agora um if para caso ele  queira reiniciar todo seu Process
       if(op == 2){
           JOptionPane.showMessageDialog(null,
                   "Vamos começar um novo jogo !"
                   ,"Menu de principal"
                   ,JOptionPane.INFORMATION_MESSAGE);
           start();
       }
       
   
      } 
    }
    
 