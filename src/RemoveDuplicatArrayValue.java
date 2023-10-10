import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatArrayValue {
    public static void main(String[] args) {
int arr[]={1,1,2,2,2,3,3,4,5,6,7};
int j=0;
for (int i=0;i<arr.length;i++)
{
    if (arr[j]!=arr[i]){
        j++;//use it before for adding 1 index of j because 0 index is already
        // add 0 index value that is 1 and the 1 index is value is 2
        arr[j]=arr[i];
    }

}
// j add j+1 because we assign value 0
for (int i=0;i<j+1;i++){
    System.out.println(arr[i]);
}
    }
}
