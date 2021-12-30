package challengesChapter4;

public class SecondsAndMintues {

	
	private static final String Invalid_Value_Message = "Invalid Value";  //constant , value cannot not be used
	
	
	public static void main(String[] args) {
		
		//Invalid_Value_Message = "Value";
	
		//getDurationString(-6, 60);
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(65, 9));
		System.out.println(getDurationString(3945));
		System.out.println(getDurationString(-41));
	}

	public static String getDurationString(int mintues, int seconds) {
		if ((mintues < 0) || (seconds < 0) || (seconds > 59)) {
			return Invalid_Value_Message;
		}
		int hours = mintues / 60;
		int remainingMinutes = mintues % 60;
		
		String hoursString = hours + "h";
		if(hours<10) {
			hoursString = "0" + hoursString;			
		}
		
		String minuteString = remainingMinutes + "m";
		if(remainingMinutes<10) {
			minuteString = "0" + minuteString;			
		}
		
		String secondsString = seconds + "s";
		if(seconds<10) {
			secondsString = "0" + secondsString;			
		}
		
		
		//return hours + "h " + remainingMinutes + "m " + seconds + "s ";
		
		return hoursString + " " + minuteString + " " + secondsString + " ";
		
	}
	
	public static String getDurationString(int seconds) {
		if(seconds <0) {
			return Invalid_Value_Message;
		}
		int mintues = seconds/60;
		int remainingSeconds = seconds%60;
		return getDurationString(mintues,remainingSeconds);
	}
	
}
