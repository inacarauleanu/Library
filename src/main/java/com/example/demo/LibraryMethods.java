package com.example.demo;

import java.util.*;

public class LibraryMethods{
    private static HashMap<Long, Book> books = new HashMap<>(); //a dictionary where the key is of type long and represents the id of the bookand the value is of type Book
    private static Long index = 2L; //initializing the index to 1
    static {
        Book book1 = new Book(1L, "Harry Potter", "J.K.Rowling");
        books.put(1L, book1);
    }
    //method for adding a book to the library
    public static Book addBook(Book book) {
        Long id = index++; //incrementing the index
        //calling the Book constructor in order to keep the details about the new book
        Book newBook = new Book(id,  book.getTitle(), book.getAuthor());
        //save the entry in the hashmap using the put method
        //book.setId(id);
        books.put(id, newBook);
        return newBook;
    }

    //method to find a book based on its id
    public static Book findBook(String title) {
        Long i = 0L;
        for(Map.Entry<Long, Book> entry: books.entrySet()) {

            // if the given value is equal to the value from entry, we save the value of the corresponding key
            if (entry.getValue().getTitle().equals(title)) {
                i = entry.getKey();
                break;
            }
        }
        return books.get(i); //the get method returns the values associated with the key, in our case with the specified id
    }

    //method to print all the books in the library
    public static List<Book> showBooks() {
        List<Book> booksList = new ArrayList<Book>(books.values()); //converted the hashmap into a list with all the values
        booksList.sort(Comparator.comparing(Book::getAuthor) //applied the sort method, first by author, then by title
                .thenComparing(Book::getTitle));
        return booksList; //returns an array of all the values contained in the map
    }

    //method to update the details of a specified book based on its id
    public static Book updateBook(Long id, Book book) {
        Book updatedBook = new Book(id,  book.getTitle(),  book.getAuthor());
        books.replace(id, updatedBook); //we replace the book with the specified id with the one we updated using the constructor
        return updatedBook;
    }

    //method to delete a book with a specified id
    public static Book deleteBook(Long id) {
       return books.remove(id);
    }








    



}
