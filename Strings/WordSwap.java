import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class WordSwap {
   public static void main(String[] args) {
      String inputStr = "apple orange pineapple";
      String regexStr = "^(\\S+)\\s+(\\S+)\\s+(\\S+)$";  // Regex pattern to be matched
      String replacementStr = "$3 $1 $2";         // Replacement pattern with back references

      // Step 1: Allocate a Pattern object to compile a regex
      Pattern pattern = Pattern.compile(regexStr);

      // Step 2: Allocate a Matcher object from the Pattern, and provide the input
      Matcher matcher = pattern.matcher(inputStr);

      // Step 3: Perform the matching and process the matching result
      String outputStr = matcher.replaceFirst(replacementStr); // first match only
      System.out.println(outputStr);   // Output: orange apple
   }
}