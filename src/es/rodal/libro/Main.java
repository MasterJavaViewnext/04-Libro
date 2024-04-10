package es.rodal.libro;

public class Main {
	public static void main(String[] args) {

		Libro libro1 = new Libro(1234, "titulo", "autor", 102);
		Libro libro2 = new Libro(1235, "titulo", "autor", 101);
		 System.out.println(libro1.masPaginas(libro2));
	}
	
	
}
