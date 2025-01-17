package es.rodal.libro;

public class Libro {
	private int isbn;
	private String titulo;
	private String autor;
	private int numPaginas;
	
	public Libro(int isbn, String titulo, String autor, int numPaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
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
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	public Libro masPaginas (Libro libro) {
		if (libro.getNumPaginas()> this.numPaginas) {
			return libro;
		} else {
			return this;
		}
	}
	
	@Override
	public String toString() {
		return "El libro con ISBN " + isbn + " creado por el autor " + autor + " tiene " + numPaginas + " páginas";
	}
	
	
}
