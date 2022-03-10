package JSON;

import by.vasilev.model.Book;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FILE_NAME = "./books.json";
    private static void toJSON(List<JSON.Book> bookList) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(FILE_NAME), bookList);
        System.out.println("JSON created!");
    }
    private static List<Book> toJavaObject(List<JSON.Book> bookList) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return (List<Book>) mapper.readValue(new File (FILE_NAME), List.class);
    }
    public static void main(String[] args) throws IOException {
        JSON.Book book1 = new JSON.Book(1,"War", 1941);
        JSON.Book book2 = new JSON.Book(2,"Piece", 1945);
        JSON.Book book3 = new JSON.Book(3,"Cat", 2000);
        JSON.Book book4 = new JSON.Book(4,"Dog", 2002);
        List<JSON.Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        toJSON((bookList) );

        System.out.println("Записали");
        List<Book> book = toJavaObject(bookList);
        System.out.println(book);
    }
}


