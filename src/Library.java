public class Library {
    public Library() {
    }
    // array initialization and declaration
    LibraryItem[]Item=new LibraryItem[50]{new LibraryItem("intro to c","paul",2023,true,BOOK)
        ,new LibraryItem("programming fundamentals","harvey",2015,false,BOOK);};
    public void additem(LibraryItem item){

    }
    public void borrowitem(LibraryItem item){

    }
    public void returnitem(LibraryItem item){

    }
    public void displayavailableitems(){
        for(int i=0;i< Item.length;i++){
            System.out.println(Item[i]);
        }

    }
    public void displayborroweditems(){

    }

}
