/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhoaluno;

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
        
        Aluno id001 = new Aluno();
        id001.setAll("Arthur", "Patrocinio", "IFTM", "ADS");
        
        Aluno id002 = new Aluno();
        id002.setAll("Camargos", "Patrocinio", "IFTM", "abc");
        
        Aluno id003 = new Aluno();
        id003.setAll("Rocha", "Patrocinio", "IFTM", "ADS");
        
        Aluno id004 = new Aluno();
        id004.setAll("Moreira", "Patrocinio", "IFTM", "abc");
        
        Aluno id005 = new Aluno();
        id005.setAll("Macedo", "Uberaba", "IFTM", "EE");
        
        Aluno id006 = new Aluno();
        id006.setAll("Vinicius", "Uberlandia", "IFTM", "EE");
        
        Aluno id007 = new Aluno();
        id007.setAll("Leticia", "Araraquara", "UNESP", "EE");
        
        Aluno id008 = new Aluno();
        id008.setAll("Yuiti", "Patrocinio", "IFTM", "aaaaaa");
        
        Aluno id009 = new Aluno();
        id009.setAll("Victor", "Uberlandia", "UFU", "ADS");
        
        Aluno id010 = new Aluno();
        id010.setAll("Everson", "Patrocinio", "IFTM", "z");
        
        ArrayList <Aluno> ADS = new ArrayList();
        ArrayList <Aluno> EE = new ArrayList();
        
        boolean retornoCurso;
        
        retornoCurso = id001.getCurso().equals("ADS");
        
        if(retornoCurso){
            ADS.add(id001);
        }
        else{
            EE.add(id001);
        }
        
        retornoCurso = id002.getCurso().equals("ADS");
        
        if(retornoCurso){
            ADS.add(id002);
        }
        else{
            EE.add(id002);
        }
        
        retornoCurso = id003.getCurso().equals("ADS");
        
        if(retornoCurso){
            ADS.add(id003);
        }
        else{
            EE.add(id003);
        }
        
        retornoCurso = id004.getCurso().equals("ADS");
        
        if(retornoCurso){
            ADS.add(id004);
        }
        else{
            EE.add(id004);
        }
        
        retornoCurso = id005.getCurso().equals("ADS");
        
        if(retornoCurso){
            ADS.add(id005);
        }
        else{
            EE.add(id005);
        }
        
        retornoCurso = id006.getCurso().equals("ADS");
        
        if(retornoCurso){
            ADS.add(id006);
        }
        else{
            EE.add(id006);
        }
        
        retornoCurso = id007.getCurso().equals("ADS");
        
        if(retornoCurso){
            ADS.add(id007);
        }
        else{
            EE.add(id007);
        }
        
        retornoCurso = id008.getCurso().equals("ADS");
        
        if(retornoCurso){
            ADS.add(id008);
        }
        else{
            EE.add(id008);
        }
        
        retornoCurso = id009.getCurso().equals("ADS");
        
        if(retornoCurso){
            ADS.add(id009);
        }
        else{
            EE.add(id009);
        }
        
        retornoCurso = id010.getCurso().equals("ADS");
        
        if(retornoCurso){
            ADS.add(id010);
        }
        else{
            EE.add(id010);
        }
        
        System.out.println("Alunos no curso 'ADS': " + ADS.size());
        System.out.println("Alunos no curso 'EE': "  + EE.size());
        
        Aluno id011 = new Aluno();
        id011.setAll("David" , "BH", "UFMG", "EE");
        
        Aluno id012 = new Aluno();
        id012.setAll("Gabriela", "Uberlandia", "UFU", "EE");
        
        System.out.println("***************");
        System.out.println("Alunos do curso 'ADS':");
        System.out.println("");
        
        for(int i = 0; i < ADS.size(); i++){
            System.out.println(ADS.get(i).getNome());
            System.out.println(ADS.get(i).getCidade());
            System.out.println("***************");
        }
        
        System.out.println("Alunos do curso 'EE':");
        System.out.println("");
        for(int i = 0; i < EE.size(); i++){
            
            System.out.println(EE.get(i).getNome());
            System.out.println(EE.get(i).getCidade());
            System.out.println("***************");
        }
    }
    
}
