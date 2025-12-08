package week07.Oxo;

public class Board {
    private char[][] board;
    final private int rijen = 3;
    final private int kolommen = 3;

    public Board(){
        this.board = new char[this.rijen][this.kolommen];
        for (char[] rij : board){
            for (int i = 0; i < rij.length; i++) {
                rij[i] = ' ';
            }
        }
    }

    public void printBoard() {
        int rijTeller = 0;
        System.out.println("     0   1   2");
        System.out.println("   +---+---+---+");
        // for-each want we printen, geen verandering en stapgrootte +1
        for (char[] rij : board) {
            System.out.print(rijTeller + " ");
            rijTeller++;
            for (char element : rij) {
                System.out.print(" | " + element);
            }
            System.out.println(" |");
            System.out.println("   +---+---+---+");

        }
    }

    public boolean zetSpeler(int x, int y, char speler){
        if (x < 0 || x >= kolommen || y < 0 || y >= rijen) {
            return false;
        }
        if (this.board[x][y] == ' ') {
            this.board[x][y] = speler;
            return true;
        }
        else return false;
    }

    public boolean isVol(){
        for (int i = 0; i < this.rijen; i++) {
            for (int j = 0; j < this.kolommen; j++) {
                if (this.board[i][j] == ' ') {
                    return false;
                }

            }

        }
        return true;
    }

    // Controleert of een speler heeft gewonnen
    public boolean isWin(char speler) {
        // Controleer rijen en kolommen
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == speler && board[i][1] == speler && board[i][2] == speler) ||
                    (board[0][i] == speler && board[1][i] == speler && board[2][i] == speler)) {
                return true;
            }
        }
        // Controleer diagonalen
        if ((board[0][0] == speler && board[1][1] == speler && board[2][2] == speler) ||
                (board[0][2] == speler && board[1][1] == speler && board[2][0] == speler)) {
            return true;
        }
        return false;
    }
}
