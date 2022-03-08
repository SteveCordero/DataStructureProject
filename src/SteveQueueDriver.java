public class SteveQueueDriver {

    public static void main(String args[])
    {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(7);
        queue.addToBack(8);
        queue.addToBack(100);
        queue.addToBack(9);
        queue.addToBack(10);


        queue.printOut();
        System.out.println();
        queue.length();

        queue.removeFromFront();
        System.out.println();

        queue.printOut();
        System.out.println();
        queue.length();


        queue.removeFromFront();
        System.out.println();

        queue.addToBack(70);
        queue.printOut();
        queue.length();

        queue.removeFromFront();
        System.out.println();
        queue.printOut();
        queue.length();

        //queue.printOut();
    }//end main method
}//end SteveQueueDriver
