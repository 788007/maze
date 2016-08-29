
/**
 * @Laurel Woods
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int x;

  
    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
    }

    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public void walkMaze(MazeBot mazeBot) {
        while (mazeBot.canMoveForward()) {
            mazeBot.moveForward();
        }
        mazeBot.turnLeft();
        while (mazeBot.canMoveForward()) {
            mazeBot.moveForward();
        }
        mazeBot.turnRight();
        while (mazeBot.canMoveForward()) {
            mazeBot.moveForward();
        }
        mazeBot.turnRight();
        while (mazeBot.canMoveForward()) {
            mazeBot.moveForward();
        }
        mazeBot.turnLeft();
        while (mazeBot.canMoveForward()) {
            mazeBot.moveForward();
        }
        mazeBot.turnLeft();
        while (mazeBot.canMoveForward()) {
            mazeBot.moveForward();
        }
        mazeBot.turnRight();
        while (mazeBot.canMoveForward()) {
            mazeBot.moveForward();
        }
    
        if (mazeBot.didReachGoal()) {
           mazeBot.signalSuccess();
        }else{
           mazeBot.signalError();
        }
    }
}
