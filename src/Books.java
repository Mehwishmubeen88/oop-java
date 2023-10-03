public class Books {
    String ISBN;
    String Title;

    public Books(String ISBN, String Title) {
        this.ISBN = ISBN;
        this.Title = Title;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.Title = Title;
    }
}
