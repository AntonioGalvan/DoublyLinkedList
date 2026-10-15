import java.util.Objects;

public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }

    //Valida que el libro a comparar no sea nulo o sea de diferente clase
    //Después válida que tengan los mismos valores en sus atributos
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    //Devuelve un numero calculado a partir de los campos del objeto
    //Funciona como una huella digital
    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
