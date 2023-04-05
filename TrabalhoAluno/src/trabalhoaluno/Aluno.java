/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhoaluno;

/**
 *
 * @author IFTM
 */
public class Aluno {
    
    String nome;
    String cidade;
    String instituicao;
    String curso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        
        if(curso.equals("ADS") || curso.equals("EE")){
            this.curso = curso;
        }
        else{
            this.curso = "ADS";
        }
        
    }
    
    public void setAll(String nome, String cidade, String instituicao, String curso){
        
        setNome(nome);
        setCidade(cidade);
        setInstituicao(instituicao);
        setCurso(curso);
        
    }
    
}
