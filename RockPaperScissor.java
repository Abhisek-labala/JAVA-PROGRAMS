import java.util.*;
import java.util.Random;
public class RockPaperScissor
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		String[] rps={"r","p","s"};
	String computerMove = rps[new Random().nextInt(rps.length)];
	
	String playerMove;
	while(true)
	{
		System.out.println("Please enter your move(r,p or s)");
		playerMove=sc.nextLine();
		if(playerMove.equals("r")||playerMove.equals("p")||playerMove.equals("s"))
		{
			break;
		}
		System.out.println(playerMove +"is not a valid move.");
	}
	System.out.println("computer played:" +computerMove);
	if(playerMove.equals(computerMove))
	{
		System.out.println ("The game was a tie");
	}
	else if(playerMove.equals("r"))
	{
		if(computerMove.equals("p"))
		{
			System.out.println("You Lose!");
		}
		else if(computerMove.equals("s"))
		{
			System.out.println("You Win");
		}
	}
	else if(playerMove.equals("p"))
	{
		if(computerMove.equals("r"))
		{
			System.out.println("You Win");
		}
		else if(computerMove.equals("s"))
		{
			System.out.println("You lose!");
		}
	}
	else if(playerMove.equals("s"))
	{
		if(computerMove.equals("p"))
		{
			System.out.println("You Win");
		}
		else if(computerMove.equals("r"))
		{
			System.out.println("You lose!");
		}
	}
	System.out.println("Want to Play Again?(Y/N)");
	String playAgain=sc.nextLine();
	if(!playAgain.equals("y")){
		break;
	}
	
	}
}
}
