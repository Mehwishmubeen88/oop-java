 public class Rectangle {
        private double length;
        private double width;

        public double area(){
            return length*width;
        }

        public double getLength() {
            return length;
        }

     public double getWidth() {
         return width;
     }

     public void setWidth(double width) {
         this.width=width;
     }
     public void setLength(double length) {

         if(length>0)
             this.length = length;

     }

     public static void main(String[] args) {
         Rectangle r1=new Rectangle();
         r1.setLength(12);
         r1.setWidth(2);
         System.out.println(r1.getLength());
         System.out.println(r1.getWidth());
         System.out.println(r1.area());
     }



    }

