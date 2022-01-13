package _03_Text_Funkifier;

public class MixedCapsString {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	public Object funkifyText() {
		   char ch;
	         char cases;
		     String funkytext= ""; 
		 for (int i=0; i<unfunkifiedText.length(); i++){
	          ch= unfunkifiedText.charAt(i); 
	          if(i%2==1) {
	        	  cases=Character.toUpperCase(ch);
	          funkytext= funkytext+cases;
	        }
	          else {
	        	  cases=Character.toLowerCase(ch);
		          funkytext= funkytext+cases;
	          }
		 }
	        System.out.println("Reversed word: "+ funkytext);
	        return funkytext;
	    
	}

}
