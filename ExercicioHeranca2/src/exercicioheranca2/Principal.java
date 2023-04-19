/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioheranca2;

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
        
        Pessoa arthur = new Pessoa();
        
        arthur.setCodigo(16);
        arthur.setDataCadastro("15/05/2023");
        arthur.setNome("Arthur");
        
        System.out.println("Nome: " + arthur.getNome());
        System.out.println("Codigo: " + arthur.getCodigo());
        System.out.println("Data de Cadastro: " + arthur.getDataCadastro());
        System.out.println("");
        
        Cliente gabriel = new Cliente();
        
        gabriel.setCodigo(1);
        gabriel.setDataCadastro("16/01/2020");
        gabriel.setNome("Gabriel");
        gabriel.setEmail("gabriel@gabriel.com");
        gabriel.setEndereco("Patrocinio");
        gabriel.setTelefone("9485251645");
        
        System.out.println("Nome: " + gabriel.getNome());
        System.out.println("Codigo: " + gabriel.getCodigo());
        System.out.println("Data de Cadastro: " + gabriel.getDataCadastro());
        System.out.println("Email: " + gabriel.getEmail());
        System.out.println("Endereco: " + gabriel.getEndereco());
        System.out.println("Telefone: " + gabriel.getTelefone());
        System.out.println("");
        
        Usuario vinicius = new Usuario();
        
        vinicius.setCodigo(66);
        vinicius.setDataCadastro("19/06/2023");
        vinicius.setNome("Vinicius");
        vinicius.setLogin("pinguim123");
        vinicius.setSenha("123pinguim");
        
        System.out.println("Nome: " + vinicius.getNome());
        System.out.println("Codigo: " + vinicius.getNome());
        System.out.println("Data de Cadastro: " + vinicius.getDataCadastro());
        System.out.println("Login: " + vinicius.getLogin());
        System.out.println("Senha: " + vinicius.getSenha());
    }
    
}
