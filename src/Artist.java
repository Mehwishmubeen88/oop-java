public class Artist {
    private String name;
    private String nationality;
    private double rating;
   Artist( String name,String nationality,double rating){
        this.name=name;
        this.nationality=nationality;
        this.rating=rating;
    }
//    Artist(String  a,String n,double r){
//
//    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setNationality(String nationality){
        this.nationality=nationality;
    }
    public String setNationality(){
      return nationality;
    }
    public void setRating(double rating){
        this.rating=rating;
    }
    public double setRating(){
        return rating;
    }
    public String toString(){
        String A=String.format("%10s%15s%12f",name,nationality,rating);
        return A;
    }
}
