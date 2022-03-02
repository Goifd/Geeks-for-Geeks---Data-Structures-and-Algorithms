class Main{
  public static void main(String[] args){
    System.out.println("Hello World");
  }


    public static void KthBit(int n, int k){
        // num starts with 0th bit
        int x=1;
        if((n&(x<<k))!=0)
            System.out.println(k+"th bit is 1");
        else
            System.out.println(k+"th bit is 0");
        System.out.println("n is: " + Integer.toBinaryString(n));
        System.out.println("k is: " + k);
    }

    public static void KthBit(int n, int k){
        // num starts with 0th bit
        if((0&(n>>k))!=0)
            System.out.println(k+"th bit is 1");
        else
            System.out.println(k+"th bit is 0");
        System.out.println("n is: " + Integer.toBinaryString(n));
        System.out.println("k is: " + k);
    }

    public static int countSetLeftShift(int num){
        int bit = 1;
        int counter=0;
        for(int i=0; i<31; i++){
            if((bit&num)!=0){
                counter++;
            }
            bit = bit<<1;
        }
        System.out.println(Integer.toBinaryString(num));
        System.out.println("Counter is: " + counter);
        return counter;
    }

    public static int countSetRightShift(int num){
        int bit=1;
        int counter=0;
        while(num>0){
            if((bit&num) !=0){
                counter++;
            }
            // most elegant: counter = counter + (num&1);
            /*if(n%2!=0)->the last bit is set*/
            num = num>>1;
            // or num=num/2;
        }
        System.out.println(Integer.toBinaryString(num));
        System.out.println("Counter is: " + counter);
        return counter;
    }

    //Theta(Total Bits in n)

    public static int brianKerningam(int num){
	int counter=0;
	while(num>0){
		num=num$(num-1)
		counter++;
	}
	return counter;
    }
    //Theta(Set Bits)

    int[] table = new int[256];

    void initialize(){
        table[0] = 0;
        for(int i=0; i<256; i++){
        table[i] = (i&1) + table[i/2];
    }

    }
    int lookupTable(int num){
        return table[num & 0xff] +
            table[(num >> 8) & 0xff] +
            table[(num >> 16) & 0xff] +
            table[num >> 24];
    }

    boolean isPowerOfTwo(int num){
        if(num==0)
            return false;
        return ((n&(n-1)==0);
    }
}