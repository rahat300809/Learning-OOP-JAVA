
public class Canteen {
    public String name;
    public int No_of_fooditem;
    public int No_of_tables;

    Canteen(String name,int No_of_fooditem,int No_of_tables)
    {
        this.name=name;
        this.No_of_tables=No_of_tables;
        this.No_of_fooditem=No_of_fooditem;
    }

    public void Display()
    {
        System.out.println(name);
        System.out.println(No_of_tables);
        System.out.println(No_of_fooditem);
    }

}
