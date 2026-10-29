public class Main {
    public static void main(String[] args) {
        Shape s1=new Circle(5);
        Shape s2=new Rectirangle(10,5);

        
         System.out.println("circle: "+s1.calculateArea());
         System.out.println("Rectirangle: "+s2.calculateArea());
    }
}
