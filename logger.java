package labs;

interface logger 
{
	public void Log(String string);
	public void Error(String string);
}

class AsteriskLogger implements logger
{
	public void Log(String string)
	{
		System.out.println("***" + string + "***\n");
	}
	
	public void Error(String string)
	{
		System.out.println("*******************\n" + "*** ERROR: " + string + " ***\n" + "*******************\n");
	}
	
	public static void main(String[] args)
	{
		AsteriskLogger a = new AsteriskLogger();
		
		a.Log("boi");
		a.Error("boi");
	}
}

class SpacedLogger implements logger
{
	public void Log(String string)
	{
		
		for(int i = 0; i <= string.length() - 1; i++)
		{
			System.out.print(string.charAt(i) + " ");
		}
		System.out.println("\n");
	}
	
	public void Error(String string)
	{
		System.out.print("i.e. ERROR: ");
		for(int i = 0; i <= string.length() - 1; i++)
		{
			System.out.print(string.charAt(i) + " ");
		}
	}
	
	public static void main(String[] args)
	{
		SpacedLogger s = new SpacedLogger();
		
		s.Log("boi");
		s.Error("boi");
	}
}
