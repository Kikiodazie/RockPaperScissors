package model;

public class Game {

    private int shape;

    public int getShape() {
        return shape;
    }

    public Game(int formAShape){
        this.shape = formAShape;
    }

    public void play (int thatNewShape){
        int[] shapesArray = {1, 2, 3};
        int x = (int) (3 * Math.random());

        if(thatNewShape == shapesArray[x]){
            System.out.println("It's a tie, play again!!");
        }
        if(thatNewShape > 3 || thatNewShape < 1){
            System.out.println("Wrong Input my G ");
            System.out.println("You dey craze put valid shape na!! Enter 1 for Rock, 2 for Paper and 3 for scissors");
        }
        if(thatNewShape == 1 &&  shapesArray[x] == 2){
            System.out.println("Computer choose Paper"  );
            System.out.println("Computer Won. Sorry, Paper covers Rock");

        }
        if(thatNewShape == 1 &&  shapesArray[x] == 3){
            System.out.println("Computer choose Scissors"  );
            System.out.println("You won. Rock destroys Scissors");
        }

        if(thatNewShape == 2 &&  shapesArray[x] == 3){
            System.out.println("Computer choose Scissors"  );
            System.out.println("Computer won. Sorry, Scissors cuts Paper");

        }
        if(thatNewShape == 2 &&  shapesArray[x] == 1){
            System.out.println("Computer choose Rock"  );
            System.out.println("You won. Paper covers Rock");
        }

        if( thatNewShape == 3 &&  shapesArray[x] == 2){
            System.out.println("Computer choose paper"  );
            System.out.println("You win. Scissors cuts Paper");

        }
        if(thatNewShape == 3 &&  shapesArray[x] == 1){
            System.out.println("Computer choose rock"  );
            System.out.println("Computer won. Sorry Rock destroys Scissors");

        }
    }



}
