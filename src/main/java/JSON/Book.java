package JSON;


    public class Book {

        private int article;
        private String bookName;
        private int year;


        public Book(int article, String bookName, int year) {
            this.article = article;
            this.bookName = bookName;
            this.year = year;
        }

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
        }
