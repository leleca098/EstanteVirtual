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
    private int nota;

    public Livro(int id, String titulo, String autor, int lançamento, int nota) {
this.id = id;
this.titulo = titulo;
this.autor = autor;
this.lancamento = lançamento;
//this.nota = nota;
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
/*public int getNota() {
 return nota;
 }
 public void setNota(int nota) {
 this.nota = nota;
 }
*/
}
