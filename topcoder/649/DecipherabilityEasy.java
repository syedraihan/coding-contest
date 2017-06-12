import java.util.*;
import java.math.*;
import static java.lang.Math.*;
 
public class DecipherabilityEasy {
  
  public String check(String s, String t) {
 
        Boolean possible = false;
        for (int i=0; i<s.length(); i++) {
            String n = s.substring(0, i) + s.substring(i+1);
            if (n.equals(t)) {
                possible = true;
                break;
            }
        }
    return possible ? "Possible": "Impossible";
  }
}