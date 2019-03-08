import java.io.IOException;
//The album that T-Pain dropped is titled: 1Up
public class Main 
{
	public static void main(String[] args) throws IOException 
	{
		String StID = "OKCE";
		MesoInherit mesoinherit = new MesoInherit(new MesoStation(StID));
		
		System.out.println("Ascii Ceiling is: " + mesoinherit.calAverage()[0]
			+ ", Ascii Floor is: " + mesoinherit.calAverage()[1]
				+ ", Ascii Average is: " + mesoinherit.calAverage()[2]
					+ ", and Letter Avg is: " + mesoinherit.letterAverage());
	}
}
//1Up is like 7Up, but you multiply the constant by (1/7)