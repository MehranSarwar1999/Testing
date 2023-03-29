package Testing;

public class WordOccurrences {
  
	public int totalWords(int x){
	   return x*x;
   }

   public int countA(String word) {
	   int count = 0;
	   for(int n = 0; n < word.length(); n++) {
		   if(word.charAt(n)=='a' || word.charAt(n)=='A') {
			   count++;
		   }
	   }
	   return count;
   }
}
