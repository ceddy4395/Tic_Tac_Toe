
/**
 * Created by cedri on 11/5/2016.
 */
public class checker extends Thread{
    protected static String field;
    protected static String winner = "";
    protected static boolean end = false;

    @Override
    public void run() {
        while(!end) {
            String temp = "";
            if (field.charAt(18) == 'X' && field.charAt(23) == 'X' && field.charAt(28) == 'X') {
                winner = "player1";
                //first row
            } else if (field.charAt(66) == 'X' && field.charAt(71) == 'X' && field.charAt(76) == 'X') {
                winner = "player1";
                //second row
            } else if (field.charAt(114) == 'X' && field.charAt(119) == 'X' && field.charAt(124) == 'X') {
                winner = "player1";
                //third row
            } else if (field.charAt(18) == 'X' && field.charAt(71) == 'X' && field.charAt(124) == 'X') {
                winner = "player1";
                //diagonal left top to right bottom
            } else if (field.charAt(28) == 'X' && field.charAt(71) == 'X' && field.charAt(114) == 'X') {
                winner = "player1";
                //diagonal right top to left bottom
            } else if (field.charAt(18) == 'X' && field.charAt(66) == 'X' && field.charAt(114) == 'X') {
                winner = "player1";
                //first column
            } else if (field.charAt(23) == 'X' && field.charAt(71) == 'X' && field.charAt(119) == 'X') {
                winner = "player1";
                //second column
            } else if (field.charAt(28) == 'X' && field.charAt(76) == 'X' && field.charAt(124) == 'X') {
                winner = "player1";
                //third column
            } else if (field.charAt(18) == 'O' && field.charAt(23) == 'O' && field.charAt(28) == 'O') {
                winner = "player2";
                //first row
            } else if (field.charAt(66) == 'O' && field.charAt(71) == 'O' && field.charAt(76) == 'O') {
                winner = "player2";
                //second row
            } else if (field.charAt(114) == 'O' && field.charAt(119) == 'O' && field.charAt(124) == 'O') {
                winner = "player2";
                //third row
            } else if (field.charAt(18) == 'O' && field.charAt(71) == 'O' && field.charAt(124) == 'O') {
                winner = "player2";
                //diagonal left top to right bottom
            } else if (field.charAt(28) == 'O' && field.charAt(71) == 'O' && field.charAt(114) == 'O') {
                winner = "player2";
                //diagonal right top to left bottom
            }else if (field.charAt(18) == 'O' && field.charAt(66) == 'O' && field.charAt(114) == 'O') {
                winner = "player2";
                //first column
            } else if (field.charAt(23) == 'O' && field.charAt(71) == 'O' && field.charAt(119) == 'O') {
                winner = "player2";
                //second column
            } else if (field.charAt(28) == 'O' && field.charAt(76) == 'O' && field.charAt(124) == 'O') {
                winner = "player2";
                //third column
            } else {
                int counter = 0;
                for (int i = 1; i <= 9; i++) {
                    if (!field.contains(Integer.toString(i))) {
                        counter ++;
                    }
                }
                if(counter == 9){
                    end = true;
                }
            }
        }
    }

    public static boolean toContinue(){
        return end || winner.equals("player1") || winner.equals("player2");
    }

}
