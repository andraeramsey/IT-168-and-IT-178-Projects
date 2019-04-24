
public class HighSchoolBaseball extends BaseballGame
{
	private final int INNINGS=7;
	public HighSchoolBaseball()
	{
		scores= new int[2][INNINGS];
		for(int x=0;x<scores.length;x++)
			for(int y=0; y<scores[x].length; y++)
		{
			scores[x][y]=UNPLAYED;
		}
	}
	@Override
	public int getInnings()
	{
		return INNINGS;
	}
}
