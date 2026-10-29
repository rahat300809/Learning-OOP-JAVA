public class House {
    private int number;
    private String location;
    private Room room;

    House(int  number,String location,String name,int size)
    {
        this.number=number;
        this.location=location;
        this.room=new Room(name,size);
    }
    public void display()
    {
        room.display();
        System.out.println(number+" "+location+" ");
        
    }
    
}
