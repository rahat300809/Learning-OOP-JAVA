public class Menu {
    private String name;
    private int price;

    public Menu(String name,int price)
    {
        this.name=name;
        this.price=price;

    }
    public void displayMenu()
    {
        System.out.println(name+" "+price);
    }
    public int getPrice()
    {
        return price;
    }
}
