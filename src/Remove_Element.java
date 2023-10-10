public class Remove_Element {
    public static void main(String[] args) {
int arr[]={1,2,3,3,4,5,5};
int key=3;
int value=0;
for (int i=0;i<arr.length;i++){
    if (arr[i]!=key){
        arr[value]=arr[i];
        value++;
    }
}
for (int i=0;i<value+1;i++){
    System.out.println(arr[i]);
}
    }
}
