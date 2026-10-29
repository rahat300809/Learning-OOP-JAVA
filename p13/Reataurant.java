public class Reataurant {
    private String name;
    private String address;

    public Reataurant(String name,String address)
    {
        this.name=name;
        this.address=address;
        
    }

    public void displayRestaurant()
    {
        System.out.println("Restaurant: "+name);
        System.out.println("Address: "+address);
    }

}
