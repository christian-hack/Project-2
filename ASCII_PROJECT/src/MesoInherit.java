
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
		averages[1] = (int)(ave1 + 0.5);
		averages[2] = (int)Math.round(ave1);
		averages[0] = (int)(Math.round(ave1) + 1);
		
		//return int array
		return averages;
	}

	@Override
	public char letterAverage() {
		
		return alphabet.charAt(ave - 64);
		
	}
	
}