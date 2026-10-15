public class Main {
    public static void main(String[] args) {
        // Lista de libros
        DoublyLinkedList<Book> books = new DoublyLinkedList<>();
        books.insertLast(new Book("Clean Code", "Robert C. Martin"));
        books.insertLast(new Book("Effective Java", "Joshua Bloch"));
        books.insertFirst(new Book("Refactoring", "Martin Fowler"));

        books.traverse();
        // Lo nuevo: podemos recorrerla al revés
        books.traverseBackward();

        System.out.println("Existe Clean Code: " + books.contains(new Book("Clean Code", "Robert C. Martin")));
        books.remove(new Book("Clean Code", "Robert C. Martin"));

        books.traverse();
        books.traverseBackward();
    }
}