/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro2;

/**
 *
 * @author famil
 */
public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumeroDePaginas;

    //constructor por defecto
    public Libro(){
        
    }
 // constructor por parametros
    public Libro(int ISBN, String Titulo, String Autor, int NumeroDePaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroDePaginas = NumeroDePaginas;
    }
    // getter and setter

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumeroDePaginas(int NumeroDePaginas) {
        this.NumeroDePaginas = NumeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NumeroDePaginas=" + NumeroDePaginas + '}';
    }
    
    
    
}
