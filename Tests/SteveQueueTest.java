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




//    @Test
//    void addToBack() {
//    }
//
//    @Test
//    void removeFromFront() {
//    }
//
//    @Test
//    void printOut() {
//    }

}