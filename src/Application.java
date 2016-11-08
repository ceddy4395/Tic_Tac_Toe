import java.util.Scanner;

/**
 * Created by cedri on 11/4/2016.
 */
public class Application {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome at Tic Tac Toe");
        while(true) {
            System.out.println("1 - Start game");
            System.out.println("2 - quit game");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    clearScreen();
                    tictactoe.render(sc);
                    break;
                case 2:
                    System.out.println("goodbye");
                    System.exit(0);
                    break;
                case 3: clearScreen();
                        System.out.println(tictactoe.createField(4, 4));
            }
        }
    }

    public static void clearScreen() {
        for(int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
