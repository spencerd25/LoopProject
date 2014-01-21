package loop.model;

public class Looper
{

	public String loopTestOne()
	{
		String loopResult = "";
		int numberOfTimes = 0;
		
		for(int counter = 5; counter <= 17; counter++)
		{
			loopResult += counter +", ";
			numberOfTimes++;
		}
		
		loopResult += "was the last time." ;
		loopResult += "\nThe loop was executed " + numberOfTimes + " times.";
	
		return loopResult;
	}
	
	
	public String loopTestTwo()
	{
		String loopResult = "";
		int numberOfTimes = 0;
		for(int count = 0; count < 10; count++)
		{	
			loopResult += "count is " + count + "\n";
			for(int otherCount = 0; otherCount < 10; otherCount++)
			{
				loopResult += "otherCount is " + otherCount + "\n";
				numberOfTimes++;
			}
		}
	
	
	loopResult += "The loop executed " + numberOfTimes + " times - wow!";
	return loopResult;
	}
}
