public class TestOrders {
    public static void main(String[] args) {

        // Menu items
        Items item1=new Items();
        item1.setName("mocha");
        item1.setPrice(3.5);

        Items item2=new Items();
        item2.setName("latte");
        item2.setPrice(4.0);

        Items item3=new Items();
        item3.setName("Drip Coffee");
        item3.setPrice(4.5);

        Items item4=new Items();
        item4.setName("Cappucino");
        item4.setPrice(5.0);



        // Order variables -- order1, order2 etc.
        Order order1=new Order();
        order1.setName("Cindhuri");
        order1.setTotal(item1.getPrice());
        order1.setReady(true);
        order1.getItem().add(item1);


        Order order2=new Order();
        order2.setName("Jimmy");
        order2.setTotal(item4.getPrice() + item2.getPrice());
        order2.setReady(true);
        order2.getItem().add(item2);

        Order order3=new Order();
        order3.setName("Noah");
        order3.setTotal(item4.getPrice() + item2.getPrice());
        order3.setReady(true);
        order3.getItem().add(item2);
        order3.getItem().add(item1);
        order3.getItem().add(item3);
        order3.getItem().add(item4);


        Order order4=new Order();
        order4.setName("Sam");
        order4.setTotal(item4.getPrice() + item2.getPrice());
        order4.setReady(true);
        order4.getItem().add(item2);
        order4.getItem().add(item4);





        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.format("Name: %s\n", order1.getName());
        System.out.printf("Total: %s\n", order1.getTotal());
        System.out.printf("Ready: %s\n", order1.isReady());
        System.out.println(order1.getItem().get(0).getName());


        System.out.println("_______________________________");
        System.out.format("Name: %s\n", order3.getName());
        System.out.printf("Total: %s\n", order3.getTotal());
        System.out.printf("Ready: %s\n", order3.isReady());
        System.out.println("Items: ");
        for (int i = 0; i < order3.getItem().size(); i++)
        {
            System.out.println(order3.getItem().get(i).getName());
        }
        System.out.println("_______________________________");

        System.out.format("Name: %s\n", order4.getName());
        System.out.printf("Total: %s\n", order4.getTotal());
        System.out.printf("Ready: %s\n", order4.isReady());
        System.out.println("Items: ");
        for (int i = 0; i < order4.getItem().size(); i++)
        {
            System.out.println(order4.getItem().get(i).getName());
        }
    }
}
