package parallelarrays;

import java.util.Scanner;

public class ThreeParallelArrays {

	public static void main(String[] args) {
		String states[] = {"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
		String statesAbbreviation[] = {"AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND","OH","OK","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY"};
		String capitals[] = {"Montgomery","Juneau","Phoenix","Little Rock","Sacramento","Denver","Hartford","Dover","Tallahassee","Atlanta","Honolulu","Boise","Springfield","Indianapolis","Des Moines","Topeka","Frankfort","Baton Rouge","Augusta","Annapolis","Boston","Lansing","St. Paul","Jackson","Jefferson City","Helena","Lincoln","Carson City","Concord","Trenton","Santa Fe","Albany","Raleigh","Bismarck","Columbus","Oklahoma City","Salem","Harrisburg","Providence","Columbia","Pierre","Nashville","Austin","Salt Lake City","Montpelier","Richmond","Olympia","Charleston","Madison","Cheyenne"};
		//variables
		Scanner input = new Scanner(System.in);
		String state;
		String zip;
		int pos = 0;
		while (true) {
			//gets user input
			System.out.println("Enter a state name: ");
			state = input.next();
			//searches list of state
			for (int i =0; i < states.length; i++) {
				if (state.equals(states[i])) {
					pos = i;
					break;
				}
				//ends program if state is not found
				else if (i == states.length-1) {
					System.exit(0);
				}
			}
			//prints abbreviation and capital if state is found
			System.out.println(statesAbbreviation[pos] + ": " + capitals[pos]) ;
			System.out.println("Input the zip code for the capital: ");
			zip = input.next();
			capitals[pos] = capitals[pos]+' '+zip;
		}
	}
}