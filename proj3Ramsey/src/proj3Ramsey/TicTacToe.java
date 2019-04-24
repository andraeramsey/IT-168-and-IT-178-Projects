package proj3Ramsey;

import java.util.Scanner;

public class TicTacToe
{
			
	public static void main(String[] args)
	{
		char ticTacToeBoard [][]=new char [3][3];
		Scanner keyboard=new Scanner(System.in);
		
		int r=0;
		int c=0;
		
		boolean player1Winner=false;
		boolean player2Winner=false;
		
		while(player1Winner==false||player2Winner==false||player1Winner==true||player2Winner==true){
		//fill board
		for (int row=0;row<3;row++)
		{
			for(int column=0;column<3;column++)
			{
				ticTacToeBoard[row][column]='-';
			}
		}
		
		
		while (player1Winner==false||player2Winner==false){
		//display board
		for (int row=0;row<3;row++)
		{
			for(int column=0;column<3;column++)
			{
				System.out.print(ticTacToeBoard[row][column]);
			}
			System.out.print("\n");
		}
		
		
		//player1 move
		System.out.println("Player 1 (X) make your move: ");
		System.out.println("Enter row of next move:");
		r=keyboard.nextInt();
		System.out.println("Enter column of next move:");
		c=keyboard.nextInt();
		ticTacToeBoard[r][c]='X';
		
		//player 1 win check
		if(ticTacToeBoard[0][0]=='X'&&ticTacToeBoard[1][0]=='X'&&ticTacToeBoard[2][0]=='X')
			player1Winner=true;
		else if(ticTacToeBoard[0][1]=='X'&&ticTacToeBoard[1][1]=='X'&&ticTacToeBoard[2][1]=='X')
			player1Winner=true;
		else if(ticTacToeBoard[0][2]=='X'&&ticTacToeBoard[1][2]=='X'&&ticTacToeBoard[2][2]=='X')
			player1Winner=true;
		else if(ticTacToeBoard[0][0]=='X'&&ticTacToeBoard[0][1]=='X'&&ticTacToeBoard[0][2]=='X')
			player1Winner=true;
		else if(ticTacToeBoard[1][0]=='X'&&ticTacToeBoard[1][1]=='X'&&ticTacToeBoard[1][2]=='X')
			player1Winner=true;
		else if(ticTacToeBoard[2][0]=='X'&&ticTacToeBoard[2][1]=='X'&&ticTacToeBoard[2][2]=='X')
			player1Winner=true;
		else if(ticTacToeBoard[0][0]=='X'&&ticTacToeBoard[1][1]=='X'&&ticTacToeBoard[2][2]=='X')
			player1Winner=true;
		else
			player1Winner=false;
		
		if (player1Winner==true)
		{
			System.out.println("Player 1 wins");
			//System.exit(0);
			break;
		}
		else
		{System.out.println("No winner yet.");}

		//player2 move
		System.out.println("Player 2 (O) make your move: ");
		System.out.println("Enter row of next move:");
		r=keyboard.nextInt();
		System.out.println("Enter column of next move:");
		c=keyboard.nextInt();
		ticTacToeBoard[r][c]='O';
		
		//player 2 win check
		if(ticTacToeBoard[0][0]=='O'&&ticTacToeBoard[1][0]=='O'&&ticTacToeBoard[2][0]=='O')
			player2Winner=true;
		else if(ticTacToeBoard[0][1]=='O'&&ticTacToeBoard[1][1]=='O'&&ticTacToeBoard[2][1]=='O')
			player2Winner=true;
		else if(ticTacToeBoard[0][2]=='O'&&ticTacToeBoard[1][2]=='O'&&ticTacToeBoard[2][2]=='O')
			player2Winner=true;
		else if(ticTacToeBoard[0][0]=='O'&&ticTacToeBoard[0][1]=='O'&&ticTacToeBoard[0][2]=='O')
			player2Winner=true;
		else if(ticTacToeBoard[1][0]=='O'&&ticTacToeBoard[1][1]=='O'&&ticTacToeBoard[1][2]=='O')
			player2Winner=true;
		else if(ticTacToeBoard[2][0]=='O'&&ticTacToeBoard[2][1]=='O'&&ticTacToeBoard[2][2]=='O')
			player2Winner=true;
		else if(ticTacToeBoard[0][0]=='O'&&ticTacToeBoard[1][1]=='O'&&ticTacToeBoard[2][2]=='O')
			player2Winner=true;
		else
			player2Winner=false;		
		
		if(player2Winner==true)
		{
			System.out.println("Player 2 wins");
			System.exit(0);	
		}
		
		else
			{System.out.println("No winner yet.");}	

		}
		}
	}

}
