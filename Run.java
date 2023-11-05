import java.util.HashMap;
import java.util.Scanner;

public class Run
{
    public static void TicTacToe(String PL_one_name, String PL_one_team, int PL_one_turn, String PL_two_name, String PL_two_team, int PL_two_turn, int turn)
    {
        Scanner input = new Scanner(System.in);
        int num;

        // Set board
        // - HashMap, sets key as board space number, value as team
        HashMap<Integer, String> gameBoard = new HashMap<>();

        for(int i = 1; i < 10; i++)
        {
            gameBoard.put(i, " ");
        }
        // Prompt to welcome players

        // Alternating turns + Insert

        boolean running = true;

        while(running)
        {
            System.out.println("\nCheck 1: " + running);

            if(turn == PL_one_turn)
            {
                System.out.println("It's " + PL_one_name + "'s turn, pick a spot 1-9: ");
                num = input.nextInt();
                input.nextLine();

                gameBoard.replace(num, PL_one_team);
                turn = PL_two_turn;
            }
            else if(turn == PL_two_turn)
            {
                System.out.println("It's " + PL_two_name + "'s turn, pick a spot 1-9: ");
                num = input.nextInt();
                input.nextLine();

                gameBoard.replace(num, PL_two_team);
                turn = PL_one_turn;
            }

            System.out.println("\nCheck 2: " + running);

            running = (isEqualto(gameBoard.get(1), gameBoard.get(2), gameBoard.get(3)));
            running = (isEqualto(gameBoard.get(1), gameBoard.get(5), gameBoard.get(9)));
            running = (isEqualto(gameBoard.get(1), gameBoard.get(4), gameBoard.get(7)));

            running = (isEqualto(gameBoard.get(3), gameBoard.get(6), gameBoard.get(9)));
            running = (isEqualto(gameBoard.get(3), gameBoard.get(5), gameBoard.get(7)));

            running = (isEqualto(gameBoard.get(2), gameBoard.get(5), gameBoard.get(8)));
            running = (isEqualto(gameBoard.get(4), gameBoard.get(5), gameBoard.get(6)));
            running = (isEqualto(gameBoard.get(7), gameBoard.get(8), gameBoard.get(9)));

            System.out.println("\nCheck 3: " + running);

            /* if(gameBoard.get(1) != null)
                if(gameBoard.get(1) == gameBoard.get(2) && gameBoard.get(1) == gameBoard.get(3))
                    running = false;
            else if(gameBoard.get(1) != null)
                if(gameBoard.get(1) == gameBoard.get(4) && gameBoard.get(1) == gameBoard.get(7))
                    running = false;
            else if(gameBoard.get(1) != null)
                if(gameBoard.get(1) == gameBoard.get(5) && gameBoard.get(1) == gameBoard.get(9))
                    running = false;
            else if(gameBoard.get(1) != null)
                if(gameBoard.get(4) == gameBoard.get(5) && gameBoard.get(4) == gameBoard.get(6))
                    running = false;
            else if(gameBoard.get(1) != null)
                if(gameBoard.get(2) == gameBoard.get(5) && gameBoard.get(2) == gameBoard.get(8))
                    running = false;
            else if(gameBoard.get(1) != null)
                if(gameBoard.get(7) == gameBoard.get(8) && gameBoard.get(7) == gameBoard.get(9))
                    running = false;
            else if(gameBoard.get(1) != null)
                if(gameBoard.get(3) == gameBoard.get(6) && gameBoard.get(3) == gameBoard.get(9))
                    running = false;
            else if(gameBoard.get(1) != null)                    
                if(gameBoard.get(3) == gameBoard.get(5) && gameBoard.get(3) == gameBoard.get(7))
                    running = false;
            */

            System.out.println(gameBoard.toString());
        }

        // Win Loss
        // Ask to restart or not
    }

    public static boolean isEqualto(String a, String b, String c)
    {
        boolean aFull = false;
        boolean bFull = false;
        boolean cFull = false;

        if(a != " ")
            aFull = true;
        else if(b != " ")
            bFull = true;
        else if(c!= " ")
            cFull = true;

        if(cFull == true)
        {
            System.out.println("\nCheck 4: continue");

            if(a == b)
            {
                System.out.println("\nCheck 5: continue");

                if(a == c)
                {   
                    System.out.println("\nCheck 6: continue");
                    return false;
                }
                else
                {
                    System.out.println("\nCheck 7: continue");
                    return true;
                }
            }
            else
            {
                System.out.println("\nCheck 8: continue");
                return true;
            }
        }
        else
        {
            System.out.println("\nCheck 9: continue");
            
        }
    }

    /*
    public static void run()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("\n-- Select a Game Mode --");
        System.out.println("\n- 1. TicTacToe");

        int choice = input.nextInt();
        input.nextLine();

        if(choice == 1)
        {
            String PL_one_name = null;
            String PL_one_team = null;
            int PL_one_turn = 10;

            String PL_two_name = null;
            String PL_two_team = null;
            int PL_two_turn = 10;

            int turn = 10;
        
            TicTacToe(PL_one_name, PL_one_team, PL_one_turn, PL_two_name, PL_two_team,PL_two_turn, turn);
        }

        input.close();
    } 
    */
}