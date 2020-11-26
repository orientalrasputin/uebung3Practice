package gol;


public class GameOfLife {
    private int[][] field;
    private final int param;

    public GameOfLife(int[][] field, final int param){
        this.param = param;
        this.field = field;
    }

    public int getParam(){
        return param;
    }

    public int numberOfNeighbors(){
        return param;
    }

    public int numberOfNeighbors2(){
        return 0;
    }

    /**
     functions:

     func(int[][])
         isAlive() - Main Class - check if the cell has a living Creature in it
         spawnCreature() - Main Class - if empty field has 3 neighbors, then create a creature on next round
         countNeighbors(int[][]) - Main Class
         willSurvive() - Main Class - check if neighbor == 2 or 3, if yes then return true
         iterateField() - Main Class - Iterator

     initialize() - Test - initialize the mock Field
     **/
}
