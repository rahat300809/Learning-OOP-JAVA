 

public class Main {
    public static void main(String[] args) {
        Reataurant r=new Reataurant("Food House","Dhaka");
        Menu m1=new Menu("Burger",1000);
        Menu m2=new Menu("Pizza",500);

        Order o=new Order(101);
        o.addMenu(m1);
        o.addMenu(m2);

        r.displayRestaurant();

        o.displayorder();


    }
}
