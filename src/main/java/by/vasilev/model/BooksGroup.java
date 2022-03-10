package by.vasilev.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlType(propOrder =  {"name", "books"}, name = "booksGroup")
public class BooksGroup {
    @XmlElement(name = "book")
    @XmlElementWrapper(name = "books")
    public List<Book> getBooks() {
        return books;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String name;
    private List<Book> books = new ArrayList<>();







    public void setBooks(List<Book> books) {
        this.books = books;
    }
        @Override
        public String toString() {
            return "by.vasilev.model.BooksGroup{" +
                    "name='" + name + '\'' +
                    ", books=" + books +
                    '}';

    }
}


