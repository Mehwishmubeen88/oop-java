import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
       Music M2=new Music("zoo",new Artist("rana","pakistan",7),2,"pop","zoo",new Date(1,2,22));
      /*  Music M2=new Music("zoo",new Artist("jerry","india",5),4,"pop","tom1",new Date(23,2,2019));
        Music M3=new Music("butter",new Artist("BTS","Korea",8),3,"kpop","butter",new Date(2,3,2022));
       Music M4=new Music("dynamite",new Artist("BTS","korea",7),4,"kpop","dynamite",new Date(2,4,2022));
       Music M5=new Music("lalisa",new Artist("lisa","korea",4),6,"kpop","lalisa",new Date(2,8,2018));
          if (M1.getTitle()==(M2.getTitle())){
              System.out.println("objects are equal");
          }else {
              System.out.println("objects are not equal");
          }
        if (M4.getTitle()==(M5.getTitle())){
            System.out.println("objects are equal");
        }else {
            System.out.println("objects are not equal");
        }
        System.out.println(M1);

        Music list[]=new Music[6];
        list[0]=M1;
        list[1]=M2;
        list[2]=M3;
        list[3]=M4;
        list[4]=M5;
        for(int i=0;i<=4;i++){
            System.out.println(list[i]);*/

        System.out.println(M2);
        System.out.println("input from user");
            Scanner sc=new Scanner(System.in);
        System.out.println("enter title");
            String title=sc.next();
        System.out.println("enter artist name");
        String name=sc.next();
        System.out.println("enter artist nationality");
        String nationality=sc.next();
        System.out.println("enter artist rating");
        int rating=sc.nextInt();
        System.out.println("enter duration");
        int duration=sc.nextInt();
        System.out.println("enter genera");
        String genera=sc.next();
        System.out.println("enter albumName");
        String albumNmae=sc.next();
        System.out.println("enter release date");
        int releasedate=sc.nextInt();
        System.out.println("enter release month");
        int releasemoth=sc.nextInt();
        System.out.println("enter release year");
        int  releaseyear=sc.nextInt();
//        Artist a = new Artist(name,nationality,rating);
//        a.setName(name);
//        a.setNationality(nationality);
//        a.setRating(rating);
     
        Music M1=new Music(title,new Artist(name,nationality,rating),duration,genera,albumNmae,new Date(releasedate,releasemoth,releaseyear));
        System.out.println(M1);


        }
    }

