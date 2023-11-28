/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author erick
 */
public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int lancamento;
    private String genero;
    private String nota;

    public Livro(int id, String titulo, String autor, int lançamento, String genero, String nota) {
this.id = id;
this.titulo = titulo;
this.autor = autor;
this.lancamento = lançamento;
this.genero = genero;
this.nota = nota;
}
public int getId() {
 return id;
 }
 public void setId(int id) {
 this.id = id;
 }
public String getTitulo() {
 return titulo;
 }
 public void setTitulo(String titulo) {
 this.titulo = titulo;
 }
public String getAutor() {
 return autor;
 }
 public void setAutor(String autor) {
 this.autor = autor;
 }
 public int getLancamento() {
 return lancamento;
 }
 public void setLancamento(int lancamento) {
 this.lancamento = lancamento;
 }
public String getGenero() {
 return genero;
 }
 public void setGenero(String nota) {
 this.nota = nota;
 }
public String getNota() {
 return nota;
 }
 public void setNota(String nota) {
 this.nota = nota;
 }
}
