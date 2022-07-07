package Ram;

public class LengthOfWord {
	public String findLengthOfWord(String[] a) {
		int max=0;
		String I="";
		for(int i=0;i<a.length;i++) {
		  if(a[i].length()>max) {
			max=a[i].length();
			I=a[i];
		}
	}
	return I.toUpperCase();
			
		}
}