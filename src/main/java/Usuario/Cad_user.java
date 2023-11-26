/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;



/**
 *
 * @author erick
 */
public class Cad_user {
    private int cpf;
    private String nome;
    private String email;
    private int idade;
    private String sexo;
    private String senha;
    
    
    public Cad_user(int cpf, String nome, String email, int idade, String sexo, String senha) {
 this.cpf = cpf;
 this.nome = nome;
 this.email = email;
 this.idade = idade;
 this.sexo = sexo;
 this.senha = senha;
 }
 public int getCpf() {
 return cpf;
 }
 public void setCpf(int cpf) {
 this.cpf = cpf;
 }
 
public String getNome() {
 return nome;
 }
 public void setNome(String nome) {
 this.nome = nome;
 }
 public String getEmail() {
 return email;
 }
 public void setEmail(String email) {
 this.email = email;
 }
 public int getIdade() {
 return idade;
 }
 public void setIdade(int idade) {
 this.idade = idade;
 }
 public String getSexo() {
 return sexo;
 }
 public void setSexo(String sexo) {
 this.sexo = sexo;
 }
 public String getSenha() {
 return senha;
 }
 public void setSenha(String senha) {
 this.senha = senha;
 }
}