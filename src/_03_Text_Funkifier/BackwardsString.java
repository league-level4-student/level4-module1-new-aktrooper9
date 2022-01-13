package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
          char ch;
         
     String funkytext= ""; 
         
        for (int i=0; i<unfunkifiedText.length(); i++){
          ch= unfunkifiedText.charAt(i); 
          funkytext= ch+funkytext;
        }
        System.out.println("Reversed word: "+ funkytext);
        return funkytext;

    }
}
