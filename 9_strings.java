class Main{
  public static void main(String[] args){
    System.out.println("Hello World");
  }

    // 4 ways to create Strings

    // Character array/arraylist
    char[] arr = ['g','e','e','k','s'];
    // String class - Immutable string (so threadsafe too)
    // all string class functions return a new object
    String str = "geeks";
    String str = new String("geeks");
    // StringBuffer class - Mutable class - Threadsafe
    StringBuffer str = new StringBuffer("geeks");
    // StringBuilder class - Mutable class - Not threadsafe
    StringBuilder str = new StringBuilder("geeks");


    str.length();
    str.charAt(2);
    str.substring(2);
    // beginning index and end index (end index not included)
    str.substring(2,5);

    String s1="geeks";
    String s2="geeks"; // no new object is created, since string is immutable
    if(s1==s2)
        //returns true since the references point to the same object
        // called string literal pool in java
    Strig s3 = new String("geeks"); // this creates a new string object
    if(s2==s3)
        // returns false since they don't reference the same object

    s1.contains(s2);
        // returns true since s2 is present as a substring in s1
    s1.equals(s2);
        // returns true if the content of the two strings are the same
    s1.compareTo(s2);
        // equals extension 
        // returns the lexigraphical comparison of two strings
        // 0 if same
        // pos if s1 is lexigraphically greater
        // neg if s1 is lexigraphically smaller
    s1.indexOf(s2);
        // contains extension
        // if s2 is present as substring returns starting index
    s1.indexOf(s2,1);
        // returns beginning of second substring

    // Naive solution
    boolean isPalindrome(String str){
        StringBuilder rev=new StringBuilder(str);
        rev.reverse();
        return str.equals(rev);
    }
    // Theta(n) time
    // Theta(n) space

    // Efficient solution
    boolean isPalindrome(String str){
        int hi=str.length()-1;
        int low=0;
        while(low<high){
            if(str.charAt(low)!=str.charAt(hi))
                return false;
            low++;
            hi++;
        }
        return true;
    }
    // O(n) time
    // Theta(1) space

    // subsequences of string with length n has 2^n subsequences

    //iterative solution
    boolean isSubsequentString(String s1, String s2){
        int index1=0;
        int index2=0;
        while(index2<s2.length()){
            if(s1.charAt(index1)==s2.charAt(index2){
                index1++;
                index2++;
            }
            else
                index2++;
            if(index1==s1.length()-1)
                return true;
        }
        return false;
    }

    // GfG solution
    boolean isSubsequentString(String s1, String s2){
        if(s1.length()<s2.length())
            return false;
        int j=0;
        for(int i=0; i<s1.length() && j<s2.length; i++){
            if(s1.charAt(i)==s2.charAt(j))
                j++;
        }
        return j==s2.length();
    }

    // time: O(n+m)
    // aux space: O(1);

    // Recursive solution
    boolean isSubsequentString(String s1, String s2, int index1, int index2){
        if(index1==s1.length())
            return true;
        if(index2==s2.length())
            return false;
        if(s1.charAt(index1)==s2.charAt(index2))
            return isSubsequentString(s1,s2,index1+1,index2+1);
        return isSubsequentString(s1,s2,index1,index2+1);
    }
    // for C++
    bool isSubSeqRec(string s1,string s2,int n,int m){
        if(m==0)
            return true;
        if(n==0)
            return false;
        if(s1[n-1]==s2[m-1])
            return isSubSeqRec(s1,s2,n-1,m-1);
        else
            return isSubSeqRec(s1,s2,n-1,m);
    }

    // time: O(m+n)
    // aux space: O(m+n)

    // Naive solution
    boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length())
        return false;

        char[] a=s1.toCharArray();
    Arrays.sort(a);
    s1=new String(a);
    char[] b=s2.toCharArray();
    Arrays.sort(b);
    s2=new String(b);

    return s1.equals(s2);
    }

    // Efficient solution
    static final int CHAR=256;
    boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length*())
            return false;
        int[] count=new int[CHAR];
        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0; i<CHAR; i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }
    // O(n)
    // O(CHAR) aux space

    // abcc - c
    // geeksforgeeks - g

    // Naive solution
    // double loop - O(n^2)

    // Efficient solution - 1
    // create UTF array traverse once to count characters, traverse once more to find leftmost repeating
    int leftmostRepeating(String s){
        char[] arr = new char[256];
        int i;
        for(i=0; i<s.length(); i++){
            arr[s.charAt(i)]++;
            if(arr[s.charAt(i)]==2))
                break;
        }
        for(int i=0; i<s.length(); i++)
            if(arr[s.charAt(i)]==2)
                return i;
    }
    // O(n) time
    // O(CHAR) aux space

    // Store first occurences of every character so only need one traversal
    int leftmostRepeating(String s){
        char[] arr = new char[256];
        Arrays.fill(fIndex, -1);
        int res = Integer.MAX_VALUE;
        for(int i=0; i<s.length(); i++){
            int fi = fIndex[str.charAt(i)];
            if(fi==-1)
                fIndex[str.charAt(i)]=i;
            else
                res=Math.min(res,fi);	
        }
    }
    // O(n+CHAR) time
    // O(CHAR) aux space

    // Travese string from right
    int leftmostRepeating(String s){
        boolean[] visited = new boolean[CHAR];
        int res=-1;
        for(int i=s.length()-1; i>=0; i--){
            if(visited[str.charAt(i)]
                res=i;
            else
                visited[str.charAt(i)]=true;
        }
        return res;
    }

    // Naive approach
    // double loops

    // Better approach
    // traverse once, assign number of repetiion to char array
    // traverse tiwce, find leftmost element with only one repetition

    // Efficient solution
    // initialize with -1
    // set to i for first occurence
    // set to -2 for second occurence
    int leftmmostNonRepeated(String s){
        int[] fi = new int[256];
        Arrays.fill(fi,-1);
        for(int i=0; i<s.length(); i++){
            if(fi[s.charAt(i)]==-1)
                fi[s.charAt(i)]=i;
            else
                fi[s.charAt(i)]=-2;
        }
        int res=Integer.MAX_VALUE;
        for(int  i=0; i<256; i++)
            if(fi[i]>=0)
                res=Math.min(res,fi[i]);
        return (res==Integer.MAX_VALUE)? -1: res;
    }
    // Theta(n+CHAR)
    // Theta(CHAR)

    // Naive method
    /*
    1. creae a stack
    2. Push words one by one to the stack
    3. Pop words from the stack and append to output
    */
    // O(n) aux space

    // In place solution
    // first reverse individual strings
    // then reverse the whole array
    void reversWords(char[] str){
        int start=0;
        for(int end=0; end<str.length(); end++){
            if(str[end]==' '){ // change gor while loop if there are possibly multiple spaces
                reverse(str, start, end-1);
                start=end+1;
            }
        }
        reverse(str, start, str.length-1);
        reverse(str,0,str.length-1);
    }

    void reverse(char[] str, int lo, int hi){
        while(lo<=hi){
            char temp = str[lo];
            str[lo]=str[hi];
            str[hi]=temp;
            lo++;
            hi--;
        }
    }

    // some Java specifics
    String s = "Welcome to gfg";
    char[] str = s.toCharArray();
    String s = new String(str);

    void findPatterns(String pat, String txt){
        int m=pat.length();
        int n=txt.length();
        for(int i=0; i<=n-m; i++){
            int j;
            for(int j=0; j<m; j++){
                if(pat.charAt(j)!=txt.charAt(i+j))
                    break;		
            }
            if(j==m)
                System.out.println(i+" ");
        }
    }
    // O((m+n-1)*m)

    void findPatterns(String pat, String txt){
        int m=pat.length();
        int n=txt.length();
        for(int i=0; i<=n-m; ){
            int j;
            for(int j=0; j<m; j++)
                if(pat.charAt(j)!=txt.charAt(i+j))
                    break;		
            if(j==m)
                System.out.println(i+" ");
            if(j==0)
                i++;
            else
                i+=j;
        }
    }
    // time: Theta(n)

    // Naive solution
    int longestPropPrefSuff(String s){
        int n=s.length();
        // try for len=n-1 - 0
        for(int len=n-1; len>0; len--){
            boolean flag=true;
            // compare the prefix and suffix strings for length n
            for(int i=0; i<len; i++){
                if(s.charAt(i)!=s.charAt(n-len+i))
                    flag = false;
            if(flag)
                return len;
        }
        return 0;
    }

    void fillLPS(String s, int[] lps){
        for(int i=0; i<s.length(); i++)
            lps[i]=longPropPreSuff(s, i+1);
    }

    // Efficient solution
    int longestPropPrefSuff(Strin s){
        int lo=0; 
        int hi=s.length()-1;
        while(lo!=s.length()-2){
            if(s.charAt(lo)==s.charAt(hi))
                    
        }
    }

    // Naive solution
    int longestPropPrefSuff(String s){
        int n=s.length();
        // try for len=n-1 - 0
        for(int len=n-1; len>0; len--){
            boolean flag=true;
            // compare the prefix and suffix strings for length n
            for(int i=0; i<len; i++){
                if(s.charAt(i)!=s.charAt(n-len+i))
                    flag = false;
            if(flag)
                return len;
        }
        return 0;
    }

    void fillLPS(String s, int[] lps){
        for(int i=0; i<s.length(); i++)
            lps[i]=longPropPreSuff(s, i+1);
    }

    // Efficient solution
    int longestPropPrefSuff(Strin s){
        int lo=0; 
        int hi=s.length()-1;
        while(lo!=s.length()-2){
            if(s.charAt(lo)==s.charAt(hi))
                    
        }
    }
}