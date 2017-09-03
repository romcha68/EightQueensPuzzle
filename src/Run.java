public class Run
{
    public static void main(String[] args) {
        QueensPuzzle puzzle = QueensPuzzle(1,1, 3, 2);
        System.out.println(puzzle.toString() + "\n");
        puzzle.fillBoard();
        System.out.println(puzzle.toString() + "\n");
    }
}
