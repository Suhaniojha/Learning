import java.util.*;
public class Solution{
 static boolean isAnagram(String a,String b){
  char[] x=a.toLowerCase().toCharArray();
  char[] y=b.toLowerCase().toCharArray();
  Arrays.sort(x); Arrays.sort(y);
  return Arrays.equals(x,y);
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println(isAnagram(sc.next(),sc.next())?"Anagrams":"Not Anagrams");
 }
}