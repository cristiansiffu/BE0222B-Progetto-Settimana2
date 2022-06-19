package articolo;

import java.util.Date;

public class ArticoloFantasy extends Articolo {

	private String descrizione;

	public ArticoloFantasy(int id, String titolo, Date data, String testo, Autore autore, Tags tags) {
		super(id, titolo, data, testo, autore, tags);
		// TODO Auto-generated constructor stub
		this.descrizione = "Un articolo fantasy";
		this.setCategoria("Fantasy");
	}

	@Override
	public String toString() {
		String stringa = "";
		stringa = "Titolo: " + super.getTitolo() + "\n" + "Data: " + super.getData() + "\n" + "Categoria: "
				+ super.getCategoria() + "\n" + "Descrizione: " + this.descrizione + "\n" + "Testo: " + super.getTesto()
				+ "\n" + "Autore: " + super.getAutore().getNome() + " " + super.getAutore().getCognome() + "\n"
				+ "Tags: " + super.getTags().toString() + "\n";
		return stringa;
	}
}