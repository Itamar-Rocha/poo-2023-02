public class TestaLivro {
	public static void main(String[] args) {
		Livro livro1 = new Livro("None of This Is True: A Novel", "Lisa Jewell", 2023, "Simon & Schuster Audio");
		Livro livro2 = new Livro("In an Instant", " Suzanne Redfearn", 2020, "Independente");
		Livro livro3 = new Livro("Where the Forest Meets the Stars", " Glendy Vanderah", 2019, "Independente");
		
		System.out.println(livro1.toString()+"\n");
		System.out.println(livro2.toString()+"\n");
		System.out.println(livro3.toString()+"\n");
	}
}
