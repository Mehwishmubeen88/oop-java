 public class Book {

     // private, public , , protected
     private String title;
     private String author;
     public void setTtile(String t1) {
         title = t1;
     }

     public void setAuthor(String author1) {
         author = author1;
     }

     public String getTitle() {
         return title;
     }

     public String getAuthor() {
         return author;
     }


     public static void main(String[] args) {
Book b1=new Book();
b1.setAuthor("sara");
         System.out.println(b1.getAuthor());
      ;
         }
     }


