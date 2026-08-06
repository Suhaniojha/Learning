import java.util.*;
public class Solution{
 public static String getSmallestAndLargest(String s,int k){
  String small=s.substring(0,k), large=small;
  for(int i=1;i<=s.length()-k;i++){
   String sub=s.substring(i,i+k);
   if(sub.compareTo(small)<0) small=sub;
   if(sub.compareTo(large)>0) large=sub;
  }
  return small+"\n"+large;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println(getSmallestAndLargest(sc.next(),sc.nextInt()));
 }
}