/**
 * @author PRATHAMESH TIBILE
 * @since 12-6-21
 * snake and ladder game
 */

package Snake_Ladder;

import java.util.Scanner;

public class Game_start {
	public static void main(String[] args) {
		System.out.println("Enter player name:");
		Scanner sc = new Scanner (System.in);
		String Player_name = sc.next();
		int Playerposition = 0;
		System.out.println(" player name:" + Player_name);
		System.out.println(" Your position is " + Playerposition );
	}
}
