package ifsuldeminas.alunos;

 public class Aluno {
 private String nome;
 private int ra;
 private String curso;
 private int per�odo=1;


    
 public Aluno(String nome, int ra, int periodo, String curso) {
  this.nome = nome;
  this.curso=curso;
  this.ra=ra;
  this.per�odo=periodo;
  
 }
 
 public String getNome(){
  return nome;
 }
 
 public void setNome(String nome) {
  this.nome = nome;
 }
 public int getRa() {
  return ra;
 }

 public void setRa(int ra) {
  this.ra = ra;
 }

 public String getCurso() {
  return curso;
 }

 public void setCurso(String curso) {
  this.curso = curso;
 }
 
 public int getPer�odo() {
  return per�odo;
 }
 
 public void setPer�odo(int per�odo) {
  this.per�odo = per�odo;
 }
    
 public void Aluno(String nome, int ra, String curso) {
     this.nome=nome;
     this.curso=curso;
     this.ra=ra;
   
    }
 public void mostrarInformacoes() {
  System.out.println(nome);
  System.out.println(ra);
  System.out.println(per�odo);
  System.out.println(curso);
 
}
    }
