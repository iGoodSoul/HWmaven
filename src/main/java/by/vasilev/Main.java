package by.vasilev;

import by.vasilev.model.Book;
import by.vasilev.model.BooksGroup;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class Main {
    private static final String FILE_NAME = "./test.xml";

    private static BooksGroup createJavaObject(){
        BooksGroup group = new BooksGroup();
        group.setName("bookList");
        group.getBooks().add(createBook(1,"war", 1941));
        group.getBooks().add(createBook(2,"piece", 1945));
        group.getBooks().add(createBook(3,"cats",2000));
        group.getBooks().add(createBook(4,"dogs",2001));
        return group;
    }
    private static Book createBook(int article, String name, int year) {
        Book book = new Book();
        book.setArticle(article);
        book.setBookName(name);
        book.setYear(year);
        return book;
    }
    private static void marshall() {
        try {
            JAXBContext context = JAXBContext.newInstance(BooksGroup.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(createJavaObject(), new File(FILE_NAME));
        } catch (JAXBException e) {
            System.out.println("Something wrong while marshalling");
        }
    }
    private static BooksGroup unmarshall() throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(BooksGroup.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (BooksGroup) unmarshaller.unmarshal(new File(FILE_NAME));
    }
    public static void main(String[] args) throws JAXBException {
        Main.marshall();
        //System.out.println(Main.unmarshall());

    }

}