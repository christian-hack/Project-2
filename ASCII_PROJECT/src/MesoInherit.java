
public class MesoInherit extends MesoAbstract {
	
	//create String to reference to when finding average letter
	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	//create instance variable to store base average value in order to be used for all averages
	private int ave;
	//used to implement abstract member variable: station
	private String station;
	
	
	//use "this." statement to utilize mesoStation's getStID method
	public MesoInherit (MesoStation mesoStation) {
		
		this.station = mesoStation.getStID();
	}
	/**
	 * The idea behind the code was to be able to store values needed to compute each of
	 * the averages into 4 separate variable of type int and use these to compute the overall
	 * average value which would be of type double. In the end I'll be using this value (set to a 
	 * variable of type double) to calculate each average and put these averages into the final 
	 * int array.
	 * 
	 */
	@Override
	public int[] calAverage() {
		
		//create array of ints to store averages into to be returned at end
		int[] averages = new int[3];
		
		//create int variables to use for normal average value
		int a = alphabet.indexOf(station.charAt(0)) + 64;
		int b = alphabet.indexOf(station.charAt(1)) + 64;
		int c = alphabet.indexOf(station.charAt(2)) + 64;
		int d = alphabet.indexOf(station.charAt(3)) + 64;
		
		//create double value to store normal average value into
		double ave1 = (a + b + c + d)/4;
		//initialize int value to be utilized for letterAverage method
		ave = (int)(ave1 + 0.5);
		
		//set values to int array to be returned
		averages[0] = (int)(Math.ceil(ave1) + 2);
		averages[1] = (int)Math.round(ave1 + 0.5);
		averages[2] = (int)Math.round(ave1 + 2);
		
		
		//return int array
		return averages;
	}

	@Override
	public char letterAverage() {
		//goes into alphabet String to find the number that correlates to the average minus 63
		return alphabet.charAt(ave - 63);
		
	}
	
}
//Now I'm not saying T-Pain is the most influential artist of our generation. Pre-MAGA days I'd have given that to Mr. West, but he's been on this wacko thing lately. I digress.'
//I shall now make a list of who I believe to be the most influential artists of our generation:
//1) Beyonce