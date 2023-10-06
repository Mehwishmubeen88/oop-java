public class Magazine extends LibraryItem{
    private  int issueNumber;

    public Magazine(String title, String author, int year,LibraryItemType itemType, int issueNumber) {
       super();
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}

