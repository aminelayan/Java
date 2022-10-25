import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Items item1=new Items();
        item1.name="mocha";
        item1.price=3.5;

        Items item2=new Items();
        item2.name="latte";
        item2.price=4.0;

        Items item3=new Items();
        item3.name="Drip Coffee";
        item3.price=4.5;

        Items item4=new Items();
        item4.name="Cappucino";
        item4.price=5.0;



        // Order variables -- order1, order2 etc.
        Order order1=new Order();
        order1.name="Cindhuri";
        order1.total= item1.price;
        order1.ready=true;
        order1.item.add(item1);


        Order order2=new Order();
        order2.name="Jimmy";
        order2.total= item4.price+item2.price;
        order2.ready=true;
        order2.item.add(item2);

        Order order3=new Order();
        order3.name="Noah";
        order3.total= item4.price+item2.price;
        order3.ready=true;
        order3.item.add(item2);
        order3.item.add(item1);
        order3.item.add(item3);
        order3.item.add(item4);


        Order order4=new Order();
        order4.name="Sam";
        order4.total= item4.price+item2.price;
        order4.ready=true;
        order4.item.add(item2);
        order4.item.add(item4);





        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.format("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.println(order1.item.get(0).name);


        System.out.println("_______________________________");
        System.out.format("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        System.out.println("Items: ");
        for (int i = 0; i < order3.item.size();i++)
        {
            System.out.println(order3.item.get(i).name);
        }
        System.out.println("_______________________________");

        System.out.format("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        System.out.println("Items: ");
        for (int i = 0; i < order4.item.size();i++)
        {
            System.out.println(order4.item.get(i).name);
        }
    }
}
