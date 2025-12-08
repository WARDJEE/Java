package week07.Beeldscherm;

public class Screen {
        private char[][] scherm;
        final private int WIDTH = 80;
        final private int HEIGHT = 25;

        public Screen(){
            this.scherm = new char[this.HEIGHT][this.WIDTH];
        }

        public void clear(){
            for (char[] rij : this.scherm){
                for (int i = 0; i < rij.length; i++) {
                    rij[i] = ' ';
                }
            }
        }

        public void print(){
            for (char[] rij : this.scherm){
                for (char teken : rij){
                    System.out.print(teken);
                }
                System.out.println();
            }
        }

        public void setCharacter(int x, int y, char c){
            if (x < 0 || x >= this.WIDTH) return;
            if (y < 0 || y >= this.HEIGHT) return;

            this.scherm[y][x] = c;

        }


}
