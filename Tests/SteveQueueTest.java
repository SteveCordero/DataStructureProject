import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SteveQueueTest {

    //Tests for length
    @Test
    void lengthOf1() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(100);
        assertEquals(1, queue.length());
    }

    @Test
    void lengthOf2() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(100);
        queue.addToBack(99);
        assertEquals(2, queue.length());
    }

    @Test
    void lengthOf3() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(98);

        assertEquals(3, queue.length());
    }

//Tests for adding integer to the q

    @Test
    void add0toback() {
        SteveQueue queue = new SteveQueue();

        assertEquals("Empty List!", queue.printOut());
    }

    @Test
    void add1toback() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(1);

        assertEquals("1\n-\n", queue.printOut());
    }

    @Test
    void add2toback() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(1);
        queue.addToBack(2);

        assertEquals("1\n-\n2\n-\n", queue.printOut());
    }

    @Test
    void add5toback() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(1);
        queue.addToBack(2);
        queue.addToBack(3);
        queue.addToBack(4);
        queue.addToBack(5);


        assertEquals("1\n-\n2\n-\n3\n-\n4\n-\n5\n-\n", queue.printOut());
    }

    //Tests for removeFromFront method
    @Test
    void remove1FromFront() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(1);
        queue.addToBack(2);
        queue.addToBack(3);
        queue.addToBack(4);
        queue.addToBack(5);

        queue.removeFromFront();


        assertEquals("2\n-\n3\n-\n4\n-\n5\n-\n", queue.printOut());
    }

    @Test
    void remove2FromFront() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(1);
        queue.addToBack(2);
        queue.addToBack(3);
        queue.addToBack(4);
        queue.addToBack(5);

        queue.removeFromFront();
        queue.removeFromFront();


        assertEquals("3\n-\n4\n-\n5\n-\n", queue.printOut());
    }

    @Test
    void remove3FromFront() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(1);
        queue.addToBack(2);
        queue.addToBack(3);
        queue.addToBack(4);
        queue.addToBack(5);

        queue.removeFromFront();
        queue.removeFromFront();
        queue.removeFromFront();


        assertEquals("4\n-\n5\n-\n", queue.printOut());
    }

//Tests for length

    @Test
    void queueWith3substract1() {
        SteveQueue queue = new SteveQueue();

        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(98);
        queue.removeFromFront();

        assertEquals(2, queue.length());

    }

    @Test
    void queueWith5subtract2() {
        SteveQueue queue = new SteveQueue();

        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(98);
        queue.addToBack(97);
        queue.addToBack(96);

        queue.removeFromFront();
        queue.removeFromFront();

        assertEquals(3, queue.length());
    }

    @Test
    void queueWith3substract3() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(98);

        queue.removeFromFront();
        queue.removeFromFront();
        queue.removeFromFront();

        assertEquals(0, queue.length());
    }

    @Test
    void queueWith3substract1add1() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(98);

        queue.removeFromFront();

        queue.addToBack(100);

        assertEquals(3, queue.length());
    }

    @Test
    void queueWith4substract1add2() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(97);
        queue.addToBack(98);

        queue.removeFromFront();

        queue.addToBack(100);
        queue.addToBack(99);

        assertEquals(5, queue.length());
    }

    @Test
    void queueWith4substract4add1() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(97);
        queue.addToBack(98);

        queue.removeFromFront();
        queue.removeFromFront();
        queue.removeFromFront();
        queue.removeFromFront();

        queue.addToBack(100);
        assertEquals(1, queue.length());
    }

    //Test for Printout method
    @Test
    void queueWith5substract4add2() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(97);
        queue.addToBack(98);
        queue.addToBack(97);

        queue.removeFromFront();
        queue.removeFromFront();
        queue.removeFromFront();
        queue.removeFromFront();

        queue.addToBack(96);
        queue.addToBack(95);
        assertEquals("97\n-\n96\n-\n95\n-\n", queue.printOut());
    }

    @Test
    void queueWith8substract2add4() {
        SteveQueue queue = new SteveQueue();
        queue.addToBack(100);
        queue.addToBack(99);
        queue.addToBack(98);
        queue.addToBack(97);
        queue.addToBack(96);
        queue.addToBack(95);
        queue.addToBack(94);
        queue.addToBack(93);

        queue.removeFromFront();
        queue.removeFromFront();

        queue.addToBack(92);
        queue.addToBack(91);
        queue.addToBack(90);
        queue.addToBack(89);
        assertEquals("98\n-\n97\n-\n96\n-\n95\n-\n94\n-\n93\n-\n92\n-\n91\n-\n90\n-\n89\n-\n", queue.printOut());
    }

}