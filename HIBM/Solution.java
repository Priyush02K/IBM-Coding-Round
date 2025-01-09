import java.util.*;

public class  {
    public static void main(String[] args) {
        // Example inputs
        int matrixSize = 4;
        List<String> commands = Arrays.asList("RIGHT", "UP", "DOWN", "LEFT", "DOWN", "DOWN");

        // Call the roverMove function
        int finalPosition = Result.roverMove(matrixSize, commands);

        // Print the final position
        System.out.println("Final Position: " + finalPosition);
    }
}

class Result {
    /*
     * Complete the 'roverMove' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER matrixSize
     *  2. STRING_ARRAY cmds
     */
    public static int roverMove(int matrixSize, List<String> cmds) {
        // Initialize the starting position (row = 0, col = 0)
        int row = 0, col = 0;

        // Iterate through the list of commands
        for (String cmd : cmds) {
            switch (cmd) {
                case "UP":
                    if (row > 0) row--; // Move up if within bounds
                    break;
                case "DOWN":
                    if (row < matrixSize - 1) row++; // Move down if within bounds
                    break;
                case "LEFT":
                    if (col > 0) col--; // Move left if within bounds
                    break;
                case "RIGHT":
                    if (col < matrixSize - 1) col++; // Move right if within bounds
                    break;
            }
        }

        // Calculate the final position using the formula: (row * size) + column
        return (row * matrixSize) + col;
    }
}
