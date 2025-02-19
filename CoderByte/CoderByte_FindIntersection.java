/* Find Intersection
Have the function FindIntersection(strArr) read the array of strings stored in strArr 
which will contain 2 elements: the first element will represent a list 
of comma-separated numbers sorted in ascending order, the second element 
will represent a second list of comma-separated numbers (also sorted). 
Your goal is to return a comma-separated string containing the numbers that 
occur in elements of strArr in sorted order. If there is no intersection, 
return the string false.
Examples
Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
Output: 1,4,13
Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
Output: 1,9,10*/

import java.util.Scanner;

public class CoderByte_FindIntersection {
public static String FindIntersection(String[] strArr) {
    // code goes here  
    if(strArr[0].length()==0||strArr[1].length()==0){
        return "";
    }
    //char[] arr1 = strArr[0].toCharArray();
    String[] arr1 = strArr[0].replace(" ","").split(",");
    String[] arr2 = strArr[1].replace(" ","").split(",");
   String common="";
   int arr1Length=arr1.length;
   int arr2Length=arr2.length;
    int pos1=0,pos2=0;
    while(pos1<arr1Length && pos2<arr2Length){
        if(Integer.valueOf(arr1[pos1])==Integer.valueOf(arr2[pos2])){
            if(common.length()>0){
                common=common+",";  
            }
            common=common+arr1[pos1];
            pos1++;
            pos2++;
        }
        else if(Integer.valueOf(arr1[pos1])<Integer.valueOf(arr2[pos2])){
            pos1++;
        }
        else{
            pos2++;
        }
    }
    return common.replace(" ", ",");
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FindIntersection(new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"})); 
  }
    
}
