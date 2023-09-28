class Student{
    private int id;
    private String name;
    public void setName(String n ){
    name=n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
public class employee {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("sara");
        System.out.println(s1.getName());
        s1.setId(1);
        System.out.println(s1.getId());

    }
}
