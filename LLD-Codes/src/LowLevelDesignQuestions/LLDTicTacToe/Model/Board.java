package LowLevelDesignQuestions.LLDTicTacToe.Model;

import java.util.ArrayList;
import java.util.List;

public class Board {

    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece){
        //place already occupied
        if(board[row][column]!=null)
            return false;
        board[row][column] = playingPiece;
        return true;
    }

    public List<List<Integer>> getFreeCells(){

        List<List<Integer>> freeCells = new ArrayList<>();

        for(int i=0; i<size;i++){
            for(int j=0; j<size;j++){
                if(board[i][j] == null){
                    List<Integer> rowColumn = new ArrayList<>(); // Create an inner list to hold i and j
                    rowColumn.add(i);                            // Add the first value
                    rowColumn.add(j);                            // Add the second value

                    freeCells.add(rowColumn);                    // Add the inner list to freeCells
                }
            }
        }
        return freeCells;
    }

    public void printBoard(){

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(board[i][j] != null){
                    System.out.print(board[i][j].pieceType.name() + "  ");
                }
                else
                    System.out.print("   ");

                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
