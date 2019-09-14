public class datediff {
	
		public static void main(String[] args) {
	// TODO Auto-generated method stub
	String date1 = "5/21/1969"; 
	String [] arrofDate = date1.split("/");
	
	String date2 = "3/19/1935";
	String [] arrofDate2 = date2.split("/");
	

	
	if (arrofDate [0] == "1" || arrofDate [0] == "3" || arrofDate [0] == "5" || arrofDate [0] == "7" || arrofDate [0] == "8" || arrofDate [0] == "10" || arrofDate [0] == "12")
		arrofDate [0] = "31";
		
	if ( arrofDate [0] == "4" || arrofDate [0] == "6" || arrofDate [0] == "9" || arrofDate [0] == "11" )
		arrofDate [0] = "30";
	if (arrofDate2 [0] == "1" || arrofDate2 [0] == "3" || arrofDate2 [0] == "5" || arrofDate2 [0] == "7" || arrofDate2 [0] == "8" || arrofDate2 [0] == "10" || arrofDate2[0] == "12")
		arrofDate [0] = "31";
	if ( arrofDate2 [0] == "4" || arrofDate2 [0] == "6" || arrofDate2 [0] == "9" || arrofDate2 [0] == "11" )
		if(arrofDate[1] == "2")
			arrofDate[1] = "28";
		if(arrofDate[1] == "2");
			arrofDate[1] = "28";
	int month1 =Integer.parseInt(arrofDate[0]);
	
	int days =Integer.parseInt(arrofDate[1]);
	
	int year1 = Integer.parseInt(arrofDate[2]);
	int year = days*365;
	
	int finalmonth = month1-arrofDate2[0];
	int finalday = arrofDate[1]-arrofDate2[1];
	int finalyear = arrofDaye[2]=arrofDate2[2];
	
	int date = finalmonth + finalday + finalyear;
	
	System.out.println("the difference between the dates is " + date + " days");
	
	

	

	
		
}

}
}
