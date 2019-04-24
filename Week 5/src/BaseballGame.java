
public class BaseballGame
{
	private String[] names=new String[2];
	protected int[][] scores;
	//prtected vs public all vs inheretience
	private final int INNINGS=9;
	public static final int UNPLAYED= -1;
	
	public BaseballGame()
	{
		scores= new int[2][INNINGS];
		for(int x=0;x<scores.length;x++)
			for(int y=0; y<scores[x].length; y++)
		{
			scores[x][y]=UNPLAYED;
		}
	}
	public void setNames(String n1, String n2)
	{
		names[0]=n1;
		names[1]=n2;
		
	}
	public void setScore(int team,int inning, int score)
	{
		boolean isBadTeam=false;
		boolean isBadInning=false;
		if(team<0|| team> 1)
		{
			System.out.println("*****"+ team+ "is not a valid team value");
			isBadTeam=true;
		}
			else
				if(inning <1 || inning >scores[0].length-1)
				{
					System.out.println("*****"+inning+" is not a valid inning value");
					isBadInning=true;
				}
				else
					if(scores[team][inning-2]==UNPLAYED)
					{
						isBadInning=true;
					}
					if(isBadInning)
						System.out.println("******"+inning);
					else
						scores[team][inning]=score;
	}
	public String getNames(){return names[0]+" vs. "+names[1];}
	public String getName(int pos){return names[pos];}
	public int getScore(int team, int inning)
	{
		int score=0;
		if(team<0||team>1)
			System.out.println(team+" is an invalid team number");
		else
			score=scores[team][inning];
		return score;
	}
	public int getInnings()
	{
		return INNINGS;
	}
}
