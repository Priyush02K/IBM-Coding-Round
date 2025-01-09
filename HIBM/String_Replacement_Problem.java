public class String_Replacement_Problem {

    public static String getSmallestString99(String word,String substr){
        int n=word.length();
        int m =substr.length();

        if (m>n) {
            return "-1";
        }

        for(int start=0; start<=n-m;++start){
            boolean match =true;
            char[]result=word.toCharArray();
            for(int i=0;i<m;++i){
                if (word.charAt(start+1)=='?' || word.charAt(start +1)== substr.charAt(i)) {
                    result[start+1]=substr.charAt(i);
                }
            }
            if (match) {
                for(int j=0;j<n;++j){
                    if (result[j]=='?') {
                        result[j]= 'a';
                    }
                }
                return new String(result);
            }
        }
        return "-1";
    }
    public static void main(String[] args) {
        String word="aa7b7e7gf";
        String substr="dbk";
        System.out.println(getSmallestString99(word, substr));
        
    }
}
