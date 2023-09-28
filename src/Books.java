public class Books {
    private String title;
    private String author;
    private String ISBN;
    //array initialization
    Books[]bookcollection=new Books[10];
    Books[]bookcollection1=new Books[10];
    public Books(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
        public String getTitle () {
            return title;

        }
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void addBook(Books book){

    }
    public void removeBook(Books book){

    }

    public static void main(String[] args) {
        Books book1=new Books("harry potter","JK rowling","1_234_567891114");

    }
}

