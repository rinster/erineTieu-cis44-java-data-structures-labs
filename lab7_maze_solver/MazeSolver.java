package lab7_maze_solver;

public class MazeSolver {

    private char[][] maze;

    public MazeSolver(char[][] maze) {
        this.maze = maze;
    }

    /**
     * Prints the current state of the maze.
     */
    public void printMaze() {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    /**
     * Public wrapper method to start the maze-solving process.
     * It should find the starting 'S' position and initiate the recursive search.
     * 
     * @return true if a path is found, false otherwise.
     */
    public boolean solve() {
        // TODO: Find the starting row and column of 'S'
        int startRow = -1;
        int startCol = -1;
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'S') {
                    startRow = i;
                    startCol = j;
                    break;
                }
            }
        }

        if (startRow != -1) {
            return solve(startRow, startCol);
        }
        return false;
    }

    /**
     * The core recursive method to solve the maze.
     * 
     * @param row The current row position.
     * @param col The current column position.
     * @return true if this position leads to a solution, false otherwise.
     */
    private boolean solve(int row, int col) {
        // Base cases
        if (row < 0 || col < 0 || row >= maze.length || col >= maze[row].length) {
            return false;
        }
        if (maze[row][col] == '#' || maze[row][col] == '.') {
            return false;
        }
        if (maze[row][col] == 'F') {
            return true;
        }

        maze[row][col] = '.';
        // printMaze(); // testing

        if (solve(row - 1, col) || // up
                solve(row, col + 1) || // right
                solve(row + 1, col) || // down
                solve(row, col - 1)) { // left
            return true;
        }

        // Backtrack
        maze[row][col] = ' ';
        return false;
    }

    public static void main(String[] args) {
        char[][] mazeToSolve = {
                { '#', '#', '#', '#', '#', '#', '#' },
                { '#', 'S', ' ', '#', ' ', ' ', '#' },
                { '#', ' ', ' ', '#', ' ', '#', '#' },
                { '#', ' ', '#', ' ', ' ', ' ', '#' },
                { '#', ' ', ' ', ' ', '#', 'F', '#' },
                { '#', '#', '#', '#', '#', '#', '#' }
        };

        MazeSolver solver = new MazeSolver(mazeToSolve);

        System.out.println("Original Maze:");
        solver.printMaze();

        if (solver.solve()) {
            System.out.println("Solution Found:");
        } else {
            System.out.println("No Solution Found:");
        }
        solver.printMaze();
    }
}