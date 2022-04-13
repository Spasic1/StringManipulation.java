import java.util.*;
class StringManipulation {

  /**
   * Reverses the end of a string.
   *
   *                          012345                     012345
   * For example: reverseEnd("Hello, world", 5) returns "Hellodlrow ,"
   *                               <----->                    <----->
   *
   * With start == 0, reverses the entire text.
   * With start == text.length(), reverses nothing.
   *
   * @param text    non-null String that will have its end reversed
   * @param start   the index at which the remainder of the input is reversed,
   *                requires 0 <= start <= text.length()
   * @return input text with the substring from start to the end of the string reversed
   */

  public static String reverseEnd(String text, int start) {
//    int length =text.length();
//    ArrayList<char> cacat = new ArrayList<>();
//    String pisat = null;
//    if(length ==  start)
//    {
//      System.out.println("");
//    }
//    else{
//      for (int i = start; i < length; i++)
//        cacat.add(text.charAt(i));
//
//      for (int i = 0; i < start; i++)
//        pisat += text.charAt(i);
//
//      for (int i = length; i >= start; i--)
//        pisat += cacat.get(i);
//    }
//    return pisat;
    int a = text.length();
    if(a== 0 )
    {
      return "";
    }
    else if(a < start)
    {
      return "";
    }
    else{
      String substringout = text.substring(start);
      String substringin = text.substring(0,start);
      StringBuilder input = new StringBuilder();
      input.append(substringout);
      input.reverse();
      String newString = substringin+input;
      return newString;
    }
  }
}
