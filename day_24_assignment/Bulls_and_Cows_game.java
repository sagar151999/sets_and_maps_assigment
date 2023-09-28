package day_24_assignment;



public class Bulls_and_Cows_game 
{
	public static String gethint(String secret,String guest)
	{
		int bulls=0;
		int cows=0;
		int []secretfreq=new int[10];
		int []guessfreq=new int[10];
		for (int i=0;i<secret.length();i++)
		{
			char s=secret.charAt(i);
			char g=guest.charAt(i);
			if(s==g)
			{
				bulls++;
			}
			else
			{
				secretfreq[s-'o']++;
				guessfreq[g-'o']++;
			}
		}
		for(int i=0;i<10;i++)
		{
			cows+=Math.min(secretfreq[i], guessfreq[i]);
		}
		return bulls+"A"+cows+"B";
	}

	public static void main(String[] args)
	{
		String secret1="1807";
		String guest1="7810";
		System.out.println(gethint(secret1,guest1));
		
	}

}
