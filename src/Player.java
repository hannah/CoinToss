public class Player {
    public static void main(String args[]){
    String guess = "heads";
    int score = 0;
    String sideUp = "heads";
        System.out.println("Testing");
    //if guess.equals(coin.sideup)
        if (guess.equals(sideUp)) {
                score++;
                System.out.println("Your score is " + score);
        }
        else {
            score = score--;
            System.out.println(score);
        }
    }


    //has a current guess
    //has a current score - needs to be cumulative
    //if current guess is correct - add 1 to score
    //if current guess is incorrect - subtract 1 from score.
    //does a player go to negative for guesses? or does it stay at zero like finite amount of money

}