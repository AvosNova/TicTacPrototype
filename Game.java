import java.util.Scanner;

public class Game
{   
    public static void Player_set()
    {
        // Scanner Obj
        Scanner input = new Scanner(System.in);


        // Player One Info
        System.out.println("\nEnter name: ");
        String Player_name = input.nextLine();

        System.out.println("\nEnter team: ");
        String Player_team = input.nextLine();

        System.out.println("\nEnter turn: ");
        int Player_turn = input.nextInt();
        input.nextLine();

        // Set Player One
        Player player_one = new Player(Player_name, Player_team, Player_turn);


        // Player Two Info
        System.out.println("\nEnter name: ");
        Player_name = input.nextLine();

        System.out.println("\nEnter team: ");
        Player_team = input.nextLine();

        System.out.println("\nEnter turn: ");
        Player_turn = input.nextInt();
        input.nextLine();

        // Set Player Two
        Player player_two = new Player(Player_name, Player_team, Player_turn);


        // Player Print
        System.out.println("\n- " + player_one.Player_name + ", " + player_one.Player_team + ", " + player_one.Player_turn + "\n");
        System.out.println("\n");
        System.out.println("\n- " + player_two.Player_name + ", " + player_two.Player_team + ", " + player_two.Player_turn + "\n");

        int turn = 1;
        Game_run(player_one.Player_name, player_one.Player_team, player_one.Player_turn, player_two.Player_name, player_two.Player_team, player_two.Player_turn, turn);

        input.close();
    }

    public static void Game_run(String PL_one_name, String PL_one_team, int PL_one_turn, String PL_two_name, String PL_two_team, int PL_two_turn, int turn)
    {
        Run.TicTacToe(PL_one_name, PL_one_team, PL_one_turn, PL_two_name, PL_two_team,PL_two_turn, turn);
    }

    public static void Game_WLC()
    {

    }

    public static void Game_restart()
    {

    }
}

//// Methods

// Build game (player names, player symbols, game)
// Run game
// Player turns
// Challenges
// Win or Loss