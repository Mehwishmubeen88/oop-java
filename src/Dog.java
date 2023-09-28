public class Dog {
    private String name;
    private String breed;
Dog(String name,String breed){
this.name=name;
this.breed=breed;
}
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog d1=new Dog("tommy","german shepherd");
        System.out.println("dog 1: "+d1.getName()+ "  :" +d1.getBreed());
        Dog d2=new Dog("jerry","australian shepherd");
        System.out.println("dog 2: "+d2.getName()+"  :" +d2.getBreed());
        d1.setBreed("australian shepherd");
        d1.setName("hound");
        System.out.println("after modifying attributes of dog1 using setter method");
        System.out.println(d1.getName() +"  :"+d1.getBreed());

    }

}