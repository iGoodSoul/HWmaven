package by.vasilev.model;

import javax.xml.bind.annotation.XmlType;


@XmlType(propOrder = {"article", "bookName", "year"}, name = "book")
public class Book {

   private int article;
   private String bookName;
   private int year;


    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "by.vasilev.model.Book{" +
                "article=" + article +
                ", name='" + bookName + '\'' +
                ", year=" + year +
                '}';
    }
}
