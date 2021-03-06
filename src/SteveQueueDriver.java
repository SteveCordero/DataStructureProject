public class SteveQueueDriver {

    public static void main(String args[])
    {
        SteveQueue queue = new SteveQueue();

        System.out.println(queue.printOut());

        queue.addToBack(7);
        queue.addToBack(8);
        queue.addToBack(100);
        queue.addToBack(9);
        queue.addToBack(10);


        System.out.println(queue.printOut());
        System.out.println();
        System.out.println("The length of the queue is: " + queue.length());

        queue.removeFromFront();
        System.out.println();

        System.out.println(queue.printOut());
        System.out.println();
        System.out.println("The length of the queue is: " + queue.length());


        queue.removeFromFront();
        System.out.println();

        queue.addToBack(70);
        System.out.println(queue.printOut());
        System.out.println("The length of the queue is: " + queue.length());

        queue.removeFromFront();
        System.out.println();
        System.out.println(queue.printOut());
        System.out.println("The length of the queue is: " + queue.length());


        //queue.printOut();
    }//end main method
}//end SteveQueueDriver
