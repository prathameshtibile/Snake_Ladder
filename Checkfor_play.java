package Snake_Ladder;

import java.util.Scanner;

public class Checkfor_play {
	public static void main(String[] args) {
			System.out.println("Enter player name:");
			Scanner sc = new Scanner (System.in);
			String Player_name = sc.next();
			int Playerposition = 0;
			System.out.println(" player name:" + Player_name);
			System.out.println(" Your position is " + Playerposition );	
		
			int dice_roll = (int) (Math.floor(Math.random() * 10 ) % 6) + 1;
			System.out.println("Dice roll is " + dice_roll );
		
			int option = (int) (Math.floor(Math.random() * 10 ) % 3) ;
			switch (option)
			{
			case 0:
				System.out.println("NO play");
				Playerposition +=0;
				break;
			case 1:
				System.out.println("Ladder");
				Playerposition += dice_roll;
				break;
			default:
				System.out.println("Snake");
				Playerposition -= dice_roll;
				if(Playerposition < 0)
					Playerposition = 0;	
			}
			System.out.println("Your current position is : " + Playerposition);
	}
	
}
