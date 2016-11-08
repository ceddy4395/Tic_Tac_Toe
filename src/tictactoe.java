import java.util.Scanner;

/**
 * Created by cedri on 11/4/2016.
 */
public class tictactoe {
    public static void render(Scanner sc){

         checker.field = createField(3,3);
                 //"+---++---++---+\n| 1 || 2 || 3 | \n+---++---++---+\n+---++---++---+\n| 4 || 5 || 6 |\n+---++---++---+\n+---++---++---+\n| 7 || 8 || 9 |\n+---++---++---+\n";

        System.out.print(checker.field);

        System.out.println(checker.field.charAt(114) + " " +  checker.field.charAt(119) + " " + checker.field.charAt(124));


        System.out.println(checker.field.charAt(115));

        int choice;
        String tempchoice;
        char Choice;

        checker all = new checker();
        all.start();

        player1:

        while(!checker.toContinue()) {

            System.out.println("Player 1: please insert the number of place you want to occupy");
            choice = sc.nextInt();
            tempchoice = choice + "";
            Choice = tempchoice.charAt(0);

            if (checker.field.contains(tempchoice)) {
                checker.field = checker.field.replace(Choice, 'X');
            } else if (Choice == 'q') {
                break;
            } else {
                System.out.println("This place is no longer available");
                continue player1;
            }

            Application.clearScreen();

            System.out.print(checker.field);

            if(!checker.toContinue()) {
               boolean player2 = false;
               while(!player2) {

                   System.out.println("Player 2: please insert the number of place you want to occupy");
                   choice = sc.nextInt();
                   tempchoice = choice + "";
                   Choice = tempchoice.charAt(0);

                   System.out.println(Choice + "");

                   if (checker.field.contains(tempchoice)) {
                       checker.field = checker.field.replace(Choice, 'O');
                       player2 = true;
                   } else {
                       System.out.println("This place is no longer available");
                   }
               }
                Application.clearScreen();

                System.out.print(checker.field);
            }
        }
        ending:
        if (checker.winner.equals("player1")){
            System.out.println("Player 1 won!!!");
            System.out.println("press enter to continue");
            sc.next();
            sc.nextLine();

        }else if(checker.winner.equals("player2")){
            System.out.println("Player 2 won!!!");
            System.out.println("press enter to continue");
            sc.next();
            sc.nextLine();
        }else {
            checker.end = true;
            System.out.println("the game has ended, you are returning to the home screen...");
        }
    }

    public static String createField(int x, int y){
        String field = "";
        int counter = 1;
        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                field = field +  "+---+";
            }
            field = field + "\n";
            for(int j = 0; j < x; j++){
                if(counter < 10) {
                    field = field + "| " + counter + " |";
                    counter++;
                }
                else{
                    field = field + "| " + counter + " |";
                    counter++;
                }
            }
            field = field + "\n";
            for(int j = 0; j < x; j++){
                field = field +  "+---+";
            }
            field = field + "\n";
        }
        return field;
    }
}
