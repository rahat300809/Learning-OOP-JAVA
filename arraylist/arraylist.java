import java.util.ArrayList;
public class arraylist
{
    public static void main(String[] args) {
        ArrayList<Integer>number=new ArrayList<Integer>();
        System.out.println("Size" + number.size());

        number.add(10);
        number.add(20);
        number.add(0);
        number.add(0,30);
        System.out.println(number);
        System.out.println("Size " + number.size());

        // Iterator itr = number.iterator();
        // while(itr.hasNext()){
        //      System.out.println(itr.next());
        // }
        // number.remove(2);
        // System.out.println(number);
        // // number.removeAll(number);
        // // System.out.println(number);
        // number.clear();
        // System.out.println(number);

        boolean check = number.isEmpty();
        System.out.println(check);
        boolean is30=number.contains(30);
        System.out.println(is30);
        int pos=number.indexOf(30);
        System.out.println(pos);
        number.set(0,1);
        System.out.println(number);

    }
}