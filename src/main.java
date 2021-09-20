import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter First String :");
        String str1 = input.next();
        System.out.print("Enter Second String:");
        String str2 = input.next();
        System.out.print(isAnagram(str1,str2));
    }

    static boolean isAnagram(String str1, String str2){
        boolean temp = false;

        if(str1.length()==str2.length()){
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            char arr1[] = str1.toCharArray();
            Arrays.sort(arr1);
            char arr2[] = str2.toCharArray();
            Arrays.sort(arr2);
            for(int i=0;i<str1.length();i++){
                if(arr1[i]==arr2[i])
                {
                    temp = true;
                }
            }
        }
        return temp;
    }
    public boolean isValid(String s) {
        char str[] = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.contains("(")){


            }
        }

        return false;
    }
}



