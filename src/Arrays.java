public class Arrays {
    public static void main(String[] args) {
        Books[] book = new Books[]{new Books("1234_142_776", "introduction to java")
                ,new Books("456_242_346", "introduction to C"),
                new Books("1784_342_876", "introduction to C++"),
                new Books("1674_442_755", "introduction to python"),
                new Books("1894_542_734", "introduction to javascript")};
       /* Books[] B1 = new Books[]{new Books("1234_142_776", "introduction to java")};
        Books[] B2 = new Books[]{new Books("456_242_346", "introduction to C")};
        Books[] B3 = new Books[]{new Books("1784_342_876", "introduction to C++")};
        Books[] B4 = new Books[]{new Books("1674_442_755", "introduction to python")};
        Books[] B5 = new Books[]{new Books("1894_542_734", "introduction to javascript")};*/
        //initializing the elemets of book array
      /*  book[0]=B1[0];
        book[1]=B2[0];
        book[2]=B3[0];
        book[3]=B4[0];
        book[4]=B5[0];

*/
for(int i=0;i<book.length;i++){
    System.out.println(book[i].getISBN()+ ":" +book[i].getTitle());

}

    }
}
