package biblio;

import person.Author;

public class Query {

	private Author author;
	private String publisher;

	private Query(Author author, String publisher) {
		this.author = author;
		this.publisher = publisher;
	}

	public static Query byAuthor(Author author) {
		return new Query(author, null);
	}

	public static Query byPublisher(String publisher) {
		return new Query(null, publisher);
	}

	public boolean accept(Entry entry) {
		if(entry == null) {
			return false;
		}
		if(author == null) {
			return publisher.equals(entry.getPublisher());
		} else {
			return author.equals(entry.getAuthor());
		}
	}
}