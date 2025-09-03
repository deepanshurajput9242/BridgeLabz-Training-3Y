package Level2PracticeQuestion3;

public class ProgramCheckPalindromeString {
    String text;
    ProgramCheckPalindromeString(String text){
        this.text=text;
    }
    public void  isPalindrome() {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase(); // remove spaces & lowercase
        int left = 0, right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {

                System.out.println("The Text is not a Palindome");
                break;
            }

            left++;
            right--;
        }
        System.out.println("The Text is  a Palindome");
    }

}
