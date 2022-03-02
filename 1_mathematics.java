class Main{
  public static void main(String[] args){
    System.out.println("Hello World");
  }
    static int countDigits(long n){
        int counter=0;
        while(n!=0){
            n/=10;
            counter++;
        }
        return counter;
    }

    //Recursive solution
    static int countDigits(long n){
        if(n==0)
            return 0;
        return 1+countDigits(n/10);
    }

    //Lograithmic solution
    static int countDigits(long n){
        return Math.floor(Math.log(n)+1);
    }
    boolean isPalindrome(int num){
	int newNum = 0;	
	int temp = num;
	while(num!=0){
		newNum*=10;
		newNum+=num%10;
		num/=10;
	}

	if(newNum==temp)
		return true;
	return false;
    }
    // iterative
    static int factorial(int num){
        int fact=1;
            for(int i=0; i<=num; i++){
                fact*=num;
            }
        return fact;
    }
    // Theta(n) time complexity
    // Theta(1) auxiliary space

    // recursive
    static int factorial(int num){
        if(num==1)
            return num;
        return num*factorial(num-1);
    }
    // Theta(n) time complexity
    // Theta(n) auxiliary space

    // Naive solution
    // calculate factorial an divide by 10
    // causes overwflow in memory

    static int getTrailingZeroes(int num){
        int temp = 5;
        int trailing=0;
        while(temp<=num){
            trailing += num/temp;
            temp*=5;
        }
        return temp;
    /* OR
    int res=0;
    for(int i=5; i<=num; i=i*5){
        res = res + n/i;
    }
    return res;
    */
    }

    // Theta(logn) time complexity
    // Naive solution
    static int gcd(int a, int b){
        int res = Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0)
                break;
            res--;
        }
        return res;
    }

    // Euclidean algorithm
    // Basic idea: Let b be smaller than a
    // gcd(a,b)=gcd(a-b,b)
    // Because, let g be GCD of a and b
    // a=gx, b=gy and GCD(x,y)=1 so (a-b)=g(x-y)

    // Euclidean algorithm
    static int gcd(int a, int b) {
        while(a!=b) {
            if(a>b)
                a=a-b;
            else
                b=b-a
        }
        return a;
    }

    // Optimized Euclidean algorithm
    static int gcd(int a, int b){
        if(b==0)
            return a;
        else
        return gcd(b,a%b); 
    }
    // time complexity: O(log(min(a,b)))

    static int lcm(int a, int b) {
        int res=a*b;
        for(int i=a*b, i>=Math.max(a,b), i--) {
            if(i%a==0 && i%b==0)
                res = i;
        }
        return res;
    }

    static int lcm(int a, int b) {
        int res=Marh.max(a,b);
        while(true){
            if(res%a==0 && res%b==0)
                return res;
            res++;
        }
    }
    // time complexity: O(a*b-max(a,b))

    // Efficient solution
    // basis: a*b=gcd(a,b)*lcm(a,b)
    static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
    // time complexity: O(log(min(a,b)))
    static int lcm(int a, int b) {
        int res=a*b;
        for(int i=a*b, i>=Math.max(a,b), i--) {
            if(i%a==0 && i%b==0)
                res = i;
        }
	return res;
    }

    static int lcm(int a, int b) {
        int res=Marh.max(a,b);
        while(true){
            if(res%a==0 && res%b==0)
                return res;
            res++;
        }
    }
    // time complexity: O(a*b-max(a,b))

    // Efficient solution
    // basis: a*b=gcd(a,b)*lcm(a,b)
    static int gcd(int a, int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
    // time complexity: O(log(min(a,b)))

        // Naive solution
    static void primeFactors(int num) {
        for(int i=2; i<=n; i++){
            if(isPrime(i)) {
                int x=i;
                while(n%x==0){
                    System.out.print(i+" ");
                    x=x*i;
                }
            }
        }
    }
    // time complexity: O(n^2logn)
    // Efficient solution
    // 1. Divisors always appear in pairs
    // 30: (1,30), (2,15), (3,10), (5,6)
    // 2. A number n can be written as multiplication of powers of prime factors
    // 12= 2^2*3
    // 450= 2*3^2*5^2
    // 13= 13
    static void primeFactor(int num){
        if(n<=1) return;
        for(int i=2; i*i<=n; i++){
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
        }
        if(n>1)
            System.out.print(n+" ");
    }
    // Further optimization
    static void primeFactor(int num){
        if(n<=1) return;
        while(n%2==0){
            System.out.print(2+" ");
            n=n/2;
        }
        while(n%3==0){
            System.out.print(3+" ");
            n=n/3;
        }
        for(int i=5; i*i<=n; i+6){
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
            while(n%(i+2)==0){
                System.out.print((i+2)+" ");
                n/=(i+2);
            }
        }
        if(n>3)
            System.out.print(n+" ");
    }
    // time complexity: Theta(sqrt(n))

    // Naive solution
    static void printDivisors(int num){
        for(int i=0; i<=num; i++){
            if(num%i==0)
                System.out.println(i + " ");
        }
    }
    // time complexity: Theta(n);
    // Efficient solution
    static void printDivisors(int num){
        for(int i=0; i<=Math.sqrt(num); i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(i!=n/i)
                    System.out.print(n/i+" ");
            }
        }
    }
    // Print in order
    static void(printDivisors(int num){
        int i;
        for(i=1; i*i<num; i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
        for(; i>=1; i--){
            if(n%i==0)
                System.out.print(n/i+" ");
        }
    }
    // Time efficiency: Theta(sqrt(n));

    // Naive solution
    static int power(int x, int n){
        int res=1;
        for(int i=0; i<n; i++){
            res=res*x;
        }
        return res;
    }
    // time efficiency: Theta(n)

    // Efficient solution (recursive)
    static int power(int x, int n){
        if(n==0)
            return 1;
        int temp=power(x,n/2);
        temp*=temp;
        if(n%2==0)
            return temp;
        else
            return temp*x;
    }
    // time efficiency: Theta(logn)
    // auxiliarty space: Theta(logn)

    // Iterative solution
    // 1. every number can be written as sum of powers of 2 (set bits in binray representation)
    // 2. we can traverse through all bits of a number(from LSB to MSB) in O(logn) time
    while(n>0){
        if(n%2!=0)
            //bit is 1
        else
            //bit is 0
        n=n/2;
    }
    // traverse through all bits of n
    // when x=3, n=10
    // n=1010
    //3^10=3^2*3^8
    static int power(int x, int n){
        int res=1;
        while(n>0){
            if(n%2!=0){
                res+=res*x;
            }
            x=x*x;
            n=n/2;
        }
    }
}