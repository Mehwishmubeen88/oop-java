class Circle {
    //data
    private double radius;
    private  int x=0;
    private int y=0;

    //default constructor
    Circle(int x, int y, double radius){
//        System.out.println("constructor is called");
        this.x=x;
        this.y=y;
        this.radius=radius;
    }

    //methods
    public void setRadius(double radius){
        if(radius>=0)
            this.radius=radius;

    }
    public double getRadius(){
        return radius;
    }
    public double calArea(){
        return Math.PI*radius*radius;
    }
    public double calCircumference(){
        return  Math.PI*2*radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static Circle getLargestCircle(Circle circle1, Circle circle2){

        if(circle1.radius<circle2.radius)
            return circle2;
        else return circle1;
    }

    public Circle clone(){
        return new Circle(this.x,this.y,this.radius);
    }
}

    public class CircleTest {
        public static void main(String[] args) {
            Circle c1=new Circle(0,0,20);
            Circle c2=new Circle(10,10,25);

//        Circle c3=new Circle(c1.getRadius());
            Circle c3=c1.clone();// call by value


            Circle temp2=c1;//call by reference

            //c1.radius
            c1.setRadius(1345);
            double area= c1.calArea();

//        System.out.println(c1+":"+area);
//        System.out.println(c2+":"+c2.calArea());

            Circle temp=Circle.getLargestCircle(c1,c2);
           temp.setRadius(10);

//            System.out.println("temp"+temp.calArea());
//            System.out.println("c1"+c1.calArea());
//            System.out.println("c2"+c2.calArea());
            System.out.println(c1.getRadius());
            System.out.println(c2.getRadius());
            System.out.println(c1);
            System.out.println(temp);
            //Circle c3=c1.getLargestCircle(c1,c2);
        }
    }

