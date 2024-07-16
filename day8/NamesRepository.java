package day8;

public class NamesRepository {
	private static String[] names = {"Virat", "Rohit", "Shubhman"};
	
	public static int getPosition(String name) throws NameNotFoundException{
		//This method returns the position of the name otherwise throws NameNotFoundException
		//This method may throw the exception but not willing to handle it.
		int position = -1;
		for(int index=0;index<names.length;index++) {
			String currentName = names[index];
			if(currentName.equals(name)) {
				position = index;
				break;
			}
		}
		if(position == -1){//Name not found
			NameNotFoundException nx = new NameNotFoundException("The supplied name is not found", name);
			throw nx;
		}
		return position;
	}
}





