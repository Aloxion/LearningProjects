package domain;

public class Game {

    private Tile[][] gameBoard = new Tile[3][3];
    private boolean gameFinished;

    public Game (){
    createTiles();
    printGameBoard();
    Parser parser = new Parser();
    gameIntroductions();
    }

    private void createTiles(){
    for (int x = 0; x < gameBoard.length; x++){
        for (int y = 0; y< gameBoard[x].length; y++){
            gameBoard[x][y] = new Tile("▢", x, y);
        }
    }
}

    private void printGameBoard(){
        for (int y = 0; y < gameBoard.length; y++){
            for (int x = 0; x< gameBoard[y].length; x++){
                System.out.print(gameBoard[x][y].getType()+" ");
            }
            System.out.println(" ");
        }
    }

    private void gameIntroductions(){

        play();
    }

    private void play(){
        //Hvis spillet er igang:
        if (!gameFinished){

        }
    }

}

