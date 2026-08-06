import java.math.*;import java.util.*;
public class Solution{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=Integer.parseInt(sc.nextLine());
  String[] s=new String[n+2];
  for(int i=0;i<n;i++) s[i]=sc.nextLine();
  Arrays.sort(s,0,n,(a,b)->{
   BigDecimal x=new BigDecimal(a), y=new BigDecimal(b);
   return y.compareTo(x);
  });
  for(int i=0;i<n;i++) System.out.println(s[i]);
 }
}