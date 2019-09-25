public class Coin {
    //should not store past state, only current state
    //double check conventions - private variables?
    String sideUp;


    //should have following methods

    //A no-args constructor that randomly determines the side of the coin that is facing up
    //("heads" || "tails") and initializes sideUp accordingly
    Coin() {
        System.out.println("Is this working?");
    }

    //A void method named toss that simulates the tossing of the coin. When the toss
    //method is called, it randomly determines the side of the coin that is facing up ("heads || "tails)
    //and sets the sideUp field accordingly
    public void toss() {
         // boolean tossResult = boolean.rand - this isn't the right syntax

    }

    //A method named getSideUp that returns the value of the sideUp field
    private static double getSideUp() {
        //this doesn't do anything yet either
        return 0;
    }

    public static void main( String args) {
        new Coin();
        //this doesn't do anything but it's the main output from the class
    }
}
