public class Plus_One {
    public static void main(String[] args) {
        int digits[]={1,2,3,4,5};
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                System.out.println(digits[i]);
                return;
            }
            else{
                digits[i]=0;
            }
        }
        int bhu[]=new int[digits.length+1];
        bhu[0]=1;
        for (int i=0;i<bhu.length;i++){
            System.out.println(bhu[i]);
        }

    }
}
