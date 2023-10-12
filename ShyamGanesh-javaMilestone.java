import java.util.Scanner;
class Solution {
    public static void main(String args[]) {
        String sent;
        Scanner obj=new Scanner(System.in);
        sent=obj.nextLine();
        System.out.println(sent);
        String[] word=sent.split(" ");
        String revset=" ";      
        for(int i=0;i<word.length;i++){
            String letter=word[i];
            String revword=" ";
            for(int j=letter.length()-1;j>=0;j--){
                revword=revword+letter.charAt(j);
                
            }
            revset=revset+revword+"";

        }
        System.out.println(revset);
        }
}