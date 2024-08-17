
import java.util.*;

class IntersectionStringArray {

  public static String FindIntersection(String strArr) {
    // code goes here  
    int n = strArr.length();
    if (n == 0)
      return null;
    if (n == 1)
      return strArr[0];

    String[] temp1 = strArr[0].split(", ");

    String[] temp2 = strArr[1].split(", ");

    int i = 0, j = 0;
    String ans = "";
    while (i < temp1.length && j < temp2.length){
      int x = Integer.parseInt(temp1[i]);
      int y = Integer.parseInt(temp2[j]);
      if(x == y){
          ans += (temp1[i] + ",");
          i++;
          j++;
      }
      else if(x > y){
        j++;
      }else{
        i++;
      }
    }

    return ans.substring(0,ans.length()-1);
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(s.nextLine())); 
  }

}
