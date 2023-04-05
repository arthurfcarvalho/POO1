/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaarraylistpoo;

import java.util.ArrayList;

/**
 *
 * @author IFTM
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*ArrayList lista = new ArrayList();
        
        lista.add("Arthur");
        lista.add("Macedoo");
        lista.add("Joaquim");
        lista.add("Camargos");
        lista.add("Gabriel");
        lista.add(10);
        lista.add(10.45);
        lista.add(true);
        lista.add(false);
        lista.add(true);
        
        for(int i = 0; i < lista.size(); i++){
            
            System.out.println(lista.get(i));
        }
        
        System.out.println("*********************");
        
        lista.remove(true);
        
        for(int i = 0; i < lista.size(); i++){
            
            System.out.println(lista.get(i));
        }
        */
        
        ArrayList <Pessoa> pessoas = new ArrayList();
    
        Pessoa joao = new Pessoa();
        
        joao.setNome("Joao Pedro");
        joao.setDataNascimento("08/05");
        
        Pessoa philipe = new Pessoa();
        
        philipe.setNome("Macedo");
        philipe.setDataNascimento("17/09");
        
        Pessoa gabriela = new Pessoa();
        
        gabriela.setNome("Gabriela");
        gabriela.setDataNascimento("10/12");

        pessoas.add(joao);
        pessoas.add(philipe);
        pessoas.add(gabriela);
        
        for(Pessoa aux : pessoas){
            System.out.println("Nome: " + aux.getNome());
            System.out.println("Data de Nascimento: " + aux.getDataNascimento());
            System.out.println("");
        }
        
        
    }
    
}
