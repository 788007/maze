
/**
 * @Laurel Woods
 */
public class MazeWalker
{
    public static void run()
    {
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze.getMazeBot());
    }
    
    private int x;

    public MazeWalker()
    {
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
            if (mazeBot.canMoveForward() == false) {
              mazeBot.turnRight();
              if (mazeBot.canMoveForward() == false) {
                mazeBot.turnLeft();
                mazeBot.turnLeft();
              }
           }
       
        }
        
        if (mazeBot.didReachGoal()) {
           mazeBot.signalSuccess();
        }else{
           mazeBot.signalError();
        }
    }
}
