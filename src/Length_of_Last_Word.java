public class Length_of_Last_Word {
    public static void main(String[] args) {
        int no=0;
        String bhu="bhupendra shahu andka ";
        String r=bhu.trim();
//        System.out.println(bhu.length());
        for (int i=r.length()-1;i>=0;i--){
            if (bhu.charAt(i)!=' '){
                no++;
            }
            else {
                break;
            }
        }
        System.out.println(no);
    }
}
