import java.util.ArrayList;
public class Order {
    private int OrderID;
    ArrayList<Menu>menus=new ArrayList<>();

    public Order(int OrderID)
    {
        this.OrderID=OrderID;
    }
    public void addMenu(Menu m )
    {
        menus.add(m);
    }

    public void displayorder()

    {
        int total=0;
        System.out.println("OrderID: "+OrderID);
        for(Menu m:menus)
        {
            m.displayMenu();
            total+=m.getPrice();
        }
        System.out.println("Total: "+total);

    }
}
