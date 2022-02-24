public class SteveQueue {



    public SteveQueue()
    {

    }




    private class SteveNode{
        //instance variables
        private int sData;
        private SteveNode sLink;

        //Constructors
        public SteveNode(int sData, SteveNode sLink)
        {
            this.sData = sData;
            this.sLink = sLink;
        }

        //getters and setters
        public int getsData() {
            return sData;
        }

        public SteveNode getsLink() {
            return sLink;
        }
    }//end inner class node
}//end Steve Queue Class
