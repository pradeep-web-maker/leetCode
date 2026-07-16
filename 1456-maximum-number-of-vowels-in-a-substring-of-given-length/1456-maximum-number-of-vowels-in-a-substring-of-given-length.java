class Solution {
    public int maxVowels(String s, int k) {
        int ms=0;
        int ws=0;
        //String[] a=s.split(" ");
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(isVowel(c)){
                ws++;
            }
        }
        ms=ws;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                ws++;
            }
            if(isVowel(s.charAt(i-k))){
                ws--;
            }
            ms=Math.max(ms,ws);

        }
        return ms;
    }
    private boolean isVowel(char c){
        return c=='a'|| c=='e'||c=='i'||c=='o'||c=='u';
    }
}