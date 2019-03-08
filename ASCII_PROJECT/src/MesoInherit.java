
public class MesoInherit extends MesoAbstract {
	//create String to reference to when finding average letter
	private String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	//create instance variable to store base average value in order to be used for all averages
	private int ave;
	//used to implement abstract member variable: station
	private String station;
	
	public MesoInherit (MesoStation mesoStation) {
		
		this.station = mesoStation.getStID();
	}

	@Override
	public int[] calAverage() {
		int[] averages = new int[3];
		int a = alphabet.indexOf(station.charAt(0)) + 64;
		int b = alphabet.indexOf(station.charAt(1)) + 64;
		int c = alphabet.indexOf(station.charAt(2)) + 64;
		int d = alphabet.indexOf(station.charAt(3)) + 64;
		
		double ave1 = (a + b + c + d)/4;
		ave = (int)(ave1 + 0.5);
		
		averages[1] = (int)(ave1 + 0.5);
		averages[2] = (int)Math.round(ave1);
		averages[0] = (int)(Math.round(ave1) + 1);
		
		
		return averages;
	}

	@Override
	public char letterAverage() {
		
		return alphabet.charAt(ave - 64);
		
	}
	
}