/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prizeApp;

import java.util.Random;
import javax.swing.JOptionPane;
//import static provaedney.Main.jogo;


import static prizeApp.Main.jg1;
import static prizeApp.Main.jg2;
import static prizeApp.Main.jg3;
import static prizeApp.Main.jg4;
import static prizeApp.Main.jg5;
import static prizeApp.Main.jg6;


/**
 *
 * @author cristiano
 */
public class Process {

    //Questão 3
    //criando variaveis privadas
    // e variavel numeroJogo para controlar o numerro de cartões
    
    
    //Questão 3
    //Para gerarmos um vetor com 5000 posições
    //Iremos gerar 1000 cartões com 5 posições cada
    //variavel pra controlar facilmente o numero de cartões que serão gerados
    private static final int numeroJogo = 5000;
    
    //variavel pra controlar facilmente o numero de posições que serão gerados nos cartões
    private static final int posis = 5;
    
    //variavel pra controlar facilmente o aleatorio que serão gerados em cada posição
    private static final int vari = 60;
    
    //variavel para guardar os cartoes que serão gerados
    private static final int[][] cartoes = new int[numeroJogo][posis];
    
    
    
    
    
    
    public void gerarCartoes() {

        Random r = new Random();
        int num;

        //for para gerar a quantidade de cartoes (linhas) que tera esse Process
        for (int i = 0; i < numeroJogo; i++) {
            //for para gerar posições(posis) em cada cartãoo
            for (int j = 0; j < posis; j++) {
                num = r.nextInt(vari) + 1;

                if (j > 0) {
                    //Questão 3
                    //Impedimos que ele coloque nas posições numeros sorteados repetidos
                    //for para voltarmos verificando se o numero que geramos aleatoriamente
                    //se repediu  nas outras posições
                    for (int p = j - 1; p >= 0; p--) {
                        //se o numero for repetido ele ira gerar um novo e testar tudo denovo
                        if (num == cartoes[i][p]) {
                            num = r.nextInt(vari) + 1;
                            p = j;
                        }
                    }
                }
                cartoes[i][j] = num;

            }

        }

    }

    //método para mostrar os cartoes gerados
    public void mostrarCartoes() {
        for (int i = 0; i < numeroJogo; i++) {
            for (int j = 0; j < posis; j++) {
                System.out.print(cartoes[i][j] + "-");
            }
            System.out.print("\n");
        }

    }

    

    //Metodo que ira ler todos os cartoes gerados e ver se acertamos algum
    public static void conferirResultado() {
        //Questão 4
        //aqui vamos checar se ele ganhou usando os numeros que ele fornecceu

        //varivael para contar quanto acertamos,para ganhar temos que acertar 6
        int acertos = 0;

        //variavel para guardarmos se acertamos ou não 
        

        //for para ler todas as linhas
        for (int i = 0; i < numeroJogo; i++) {
            //vamos zerar os acertos para que ele não junte acertos do cartao de cima
            //com o cartao de baixo e informe varias vazes que você ganhou
            acertos = 0;

            //for para ler todas as 6 posições
            for (int j = 0; j < posis; j++) { 
                if (jg1 == cartoes[i][j] || jg2 == cartoes[i][j]
                    || jg3 == cartoes[i][j]  || jg4 == cartoes[i][j]        
                    || jg5 == cartoes[i][j]  || jg6 == cartoes[i][j]        
                            ) {
                        acertos++;
                    }
                if (acertos >= 5) {
                    //Questão 4
                    // Caso ele ganhe mostramos o cartão que o deu a vitoria 
                    JOptionPane.showMessageDialog(null,
                          "!!!PARABÉNS!!"
                          + "\n !!! VOCÊ GANHOU !!!"
                          + "\n Seu Jogo : "
                          + "\n 1° : " + jg1
                          + "\n 2° : " + jg2
                          + "\n 3° : " + jg3
                          + "\n 4° : " + jg4
                          + "\n 5° : " + jg5
                          + "\n 6° : " + jg6
                          + "\n--------------------------" 
                          + "\n Cartão sorteado : " 
                          + "\n 1° = " + cartoes[i][0] 
                          + "\n 2° = " + cartoes[i][1] 
                          + "\n 3° = " + cartoes[i][2] 
                          + "\n 4° = " + cartoes[i][3] 
                          + "\n 5° = " + cartoes[i][4] 
                          + "\n--------------------------"   
                          , "Questão 4", JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                     
                }

            }
        }
        
        
        JOptionPane.showMessageDialog(null,
                "Você Perdeu !"
                ,"Questão 4"
                ,JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
        

        

    }

     

}
