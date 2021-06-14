package Snake_Ladder;

import java.util.Scanner;

public class Roll_dice {
	public static void main(String[] args) {
		System.out.println("Enter player name:");
		Scanner sc = new Scanner (System.in);
		String Player_name = sc.next();
		int Playerposition = 0;
		System.out.println(" player name:" + Player_name);
		System.out.println(" Your position is " + Playerposition );	
	
		int dice_roll = (int) (Math.floor(Math.random() * 10 ) % 6) + 1;
		System.out.println("Dice roll is " + dice_roll );
	}
	

}
