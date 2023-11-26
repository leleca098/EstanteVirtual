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
    private int id;
    private String nome;
    private String email;
    private int idade;
    
    public Cad_user(int id, String nome, String email, int idade) {
 this.id = id;
 this.nome = nome;
 this.email = email;
 this.idade = idade;
 }
 public int getId() {
 return id;
 }
 public void setId(int id) {
 this.id = id;
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
}