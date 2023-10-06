public class Book extends LibraryItem{

    private int pageCount;

    public Book(String title, String author, int year,LibraryItemType itemType, int pageCount) {
        super(String title, String author,int year,LibraryItemType itemType);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    // book objects
    Book book4 =new Book("intro to java","paul", 2008,BOOK,400);
    Book book5 =new Book("intro to C","harvey", 2016,BOOK,500);
}
