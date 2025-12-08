package week07.ZoekenEnTellen;

public class Numbers {
    private int[] numbers;

    public Numbers(int[] theNumbers) {
        this.numbers = new int[theNumbers.length];

        for (int i = 0; i < theNumbers.length; i++) {
            this.numbers[i] = theNumbers[i];
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for (int number : this.numbers){
            sb.append(number).append(" ");
        }
        return sb.toString();
    }

    public int numberOfTimes(int number){
        int aantal = 0;
        for (int nummer : this.numbers){
            if (nummer == number) {
                aantal++;
            }
        }
        return aantal;
    }

    public boolean isPresent(int number) {
        for (int num : numbers) {
            if (num == number) return true;
        }
        return false;
    }
}
