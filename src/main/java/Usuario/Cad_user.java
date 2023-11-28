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
    private String cpf;
    private String nome;
    private String email;
    private int idade;
    private String sexo;
    private String senha;
    private String gen1;
    private String gen2;
    
    
    public Cad_user(String cpf, String nome, String email, int idade, String sexo, String senha, String gen1, String gen2) {
 this.cpf = cpf;
 this.nome = nome;
 this.email = email;
 this.idade = idade;
 this.sexo = sexo;
 this.senha = senha;
 this.gen1 = gen1;
 this.gen2 = gen2;
 }
 public String getCpf() {
 return cpf;
 }
 public void setCpf(String cpf) {
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
 public String getGen1() {
 return gen1;
 }
 public void setGen1(String gen1) {
 this.gen1 = gen1;
 }
 public String getGen2() {
 return gen2;
 }
 public void setGen2(String gen2) {
 this.gen2 = gen2;
 }
}