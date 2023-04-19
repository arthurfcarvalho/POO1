/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaheranca;

import java.util.Set;

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
        
        Funcionario gabriel = new Funcionario();
        
        gabriel.setNome("Gabriel Camargos");
        gabriel.setEndereco("Ouro Preto");
        gabriel.setSalario(4100);
        gabriel.setCodSetor(1);
        
        FuncionarioComissionado macedo = new FuncionarioComissionado();
        
        macedo.setNome("Phillipe Macedo");
        macedo.setEndereco("Martim Galeto");
        macedo.setSalario(5000);
        macedo.setCodSetor(2);
        
        macedo.setComissao(250);
        macedo.setVendas(6);
        
        System.out.println("Funcionario: " + gabriel.getNome());
        System.out.println("Endereco: " + gabriel.getEndereco());
        System.out.println("Salario: " + gabriel.getSalario());
        System.out.println("Cod. Setor: " + gabriel.getCodSetor());
        System.out.println("");
        System.out.println("Funcionario: " + macedo.getNome());
        System.out.println("Endereco: " + macedo.getEndereco());
        System.out.println("Salario: " + macedo.getSalario());
        System.out.println("Cod. Setor: " + macedo.getCodSetor());
        System.out.println("Vendas no mes: " + macedo.getVendas());
        System.out.println("Comissao: " + macedo.getComissao());
        System.out.println("Salario Comissionado: " + macedo.calcularPagamento());
        
    }
    
}
