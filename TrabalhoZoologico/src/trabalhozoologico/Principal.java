/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhozoologico;

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
       
        Zoologico id001 = new Zoologico();
        
        ArrayList auxAves = new ArrayList();
        
        auxAves.add("Pardal");
        auxAves.add("Pombo");
        auxAves.add("Rolinha");
        auxAves.add("Ema");
        auxAves.add("Avestruz");
        
        id001.setAves(auxAves);
        
        ArrayList auxMamiferos = new ArrayList();
        
        auxMamiferos.add("Onca");
        auxMamiferos.add("Veado");
        auxMamiferos.add("Gamba");
        auxMamiferos.add("Urso");
        auxMamiferos.add("Zebra");
        
        id001.setMamiferos(auxMamiferos);
        
        ArrayList auxPeixes = new ArrayList();
        
        auxPeixes.add("Baleia");
        auxPeixes.add("Tubarao");
        auxPeixes.add("Bagre");
        auxPeixes.add("Piaba");
        auxPeixes.add("Tilapia");
        
        id001.setPeixes(auxPeixes);
        
        System.out.println("Total de animais: " + (id001.getMamiferos().size() + id001.getAves().size() + id001.getPeixes().size()));
        System.out.println("*************");
        System.out.println("Aves:");
        for(int i = 0; i < id001.getAves().size(); i++){
            System.out.println(id001.getAves().get(i));
        }
        System.out.println("");
        System.out.println("Mamiferos:");
        for(int i = 0; i < id001.getMamiferos().size(); i++){
            System.out.println(id001.getMamiferos().get(i));
        }
        System.out.println("");
        System.out.println("Peixes:");
        for(int i = 0; i < id001.getPeixes().size(); i++){
            System.out.println(id001.getPeixes().get(i));
        }
        
        id001.getAves().remove(2);
        id001.getAves().remove(2);
        
        
        boolean pelicanoExiste = false;
        
        for(int i = 0; i < id001.getAves(). size(); i++){
            
            if(id001.getAves().get(i).equals("Pelicano")){
                pelicanoExiste = true;
            }
        }
        
        
        if(!pelicanoExiste){
            
            auxAves.add("Pelicano");
            id001.setAves(auxAves);
        }
        System.out.println(id001.getAves());
    }
}
