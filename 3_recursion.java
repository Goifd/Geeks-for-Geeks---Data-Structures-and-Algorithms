class Main{
  public static void main(String[] args){
    System.out.println("Hello World");
  }
  void printN(int N){
        if(N==0)
            return;
        System.out.println(N);
        printN(N-1);
    }
    // T(N)=T(N-1)+C
    // time complexity: Theta(N)
    // auxiliary space: Theta(N)

    void printOne(int N){
        if(N==0)
            return;
        printOne(N-1);
        System.out.println(N);
    }
    // T(N)=T(N-1)+C
    // time complexity: Theta(N)
    // auxiliary space: Theta(N)

    int sum(int n){
        if(n==0)
            return 0;	
        if(n==1)
            return 1;
        return n+sum(n-1);
    }

    boolean checkPalindrome(String str, int start, int end){
        if(start>end)
            return true;
        if(str.charAt(start)==str.charAt(end))
            return checkPalindrome(str, start+1, end-1);
    }

    int sumOfDigits(int num){
        if(num==0)
            return 0;
        return num%10+sumOfDigits(num/10);
    }

    int ropeCutting(int n, int a, int b, int c){
        if(n<a && n<b && n<c)
            return -1;
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        int res = Math.max(ropeCutting(n-a,a,b,c),
                                            ropeCutting(n-b,a,b,c),
                                            ropeCutting(n-c,a,b,c));
        if(res==-1)
            return -1;
        return 1+res;
    }

    // curr="", i=0 for fist call
    void subset(String s, String curr, int i){
        if(i==s.length())
            System.out.println(curr);
            return;
        subset(s, curr, i+1);
        subset(s, curr+s[i], i+1);
    } 

    // curr="", i=0 for fist call
    void subset(String s, String curr, int i){
        if(i==s.length())
            System.out.println(curr);
            return;
        subset(s, curr, i+1);
        subset(s, curr+s[i], i+1);
    } 
}
