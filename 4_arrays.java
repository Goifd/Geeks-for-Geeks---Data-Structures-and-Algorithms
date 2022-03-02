class Main{
  public static void main(String[] args){
    System.out.println("Hello World");
  }

  int getLargest(int arr[], int n){
        int largest = arr[0];
        int index = 0;
        for(int i=1; i<n; i++){		
            if(arr[i]>=largest){
                index = i;
                largest=arr[i];
            }			
        }
      return index;
    }

    int getLargest(int arr[], int n){
        int res = -1;
        int largest = 0;
        for(int i=1; i<n; i++){
            if(arr[i]>largest){
                res = largest;
                largest = i;
            }else if(arr[i] != arr[largest]{
                if(res==-1 || arr[i]>arr[ress])
                    res = i;
            }
        }
        return res;
    }

    int isSorted(int arr[]){
        for(int i=0; i<(arr.length-1); i++){
            if(arr[i+1]<arr[i])
                return false;
        }
        return true;
    }

    void reverseArray(int arr[]){
        int lower=0;
        int higher=arr.length-1;
        while(lower<higher){
            int temp = arr[lower];
            arr[lower] = arr[higher];
            arr[higher] = temp;
            lower++;
            higher++;
        }
    }

    int removeDuplicates(int[] arr){
        int size = arr.length;
        for(int i=arr.length-1; i>-1; i++){
            if(arr[i]==arr[i-1]){
                arr[i]=-1;
                size--;
            }
        }
    // this can also be done iterating from front to end
        return size;
    }

    void moveZeros(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j]!=0){
                        arr[i]=arr[j];
                        arr[j]=0;
                    }
                }
            }
        }
    }

    // With extra space
    void leftRotate(int[] arr){
        int temp = arr[0];
        for(int i=0; i<arr.length-1; i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

    // With extra space
void leftRotateD(int[] arr){
	int[] temp = new int[D];
	for(int i=0; i<D; i++){
		temp[i] = arr[i];
	}
	for(int j=0; j<arr.length-D; i++){
		arr[i] = arr[D+i];
	}
}

    // Without extra space
    // use left rotate by one D times

    // Juggling algorithm
    /*Function to left rotate arr[] of siz n by d*/
    void leftRotate(int arr[], int d, int n){
        int i, j, k, temp;
        for (i = 0; i < gcd(d, n); i++)
        {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while(1){
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    // Naive solution
    // iterate through with two for loops
    // time complexity: Theta(n^2)

    int maxDif(int[] arr){
        int min=arr[0];
        int maxDiff = arr[1]-arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]-min>maxDiff)
                maxDiff=arr[i]-min;
            if(min>arr[i])
                min=arr[i];
        }
    }
    // time complexity: Theta(1)

    public static void frequencies(int[] arr){
        int current = arr[0];
        int freq=1;
        for(int i=1; i<=arr.length; i++){
            if(i<arr.length && arr[i]==current)
                    freq++;
            else if(i<arr.length){
                System.out.println(current + " " + freq);
                current = arr[i];
                freq=1;
            } else{
                System.out.println(current + " " + freq);
            }
        }
    }

// GfG solution
    void printFreq(int[] arr){
        int freq=1
        int i=1;
        while(i<n){
            while(i<n && arr[i]==arr[i-1]{
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " " + freq);
            i++;
            freq=1;
        }
        n=arr.length;
        if(arr.length==1 || arr[n-1]!=arr[n-2]
            System.out.println(arr[n-1] + " " + 1);
    }
    //time complexity: Theta(n)

    // Naive solution
    int getWater(int[] arr){
        int water=0;
        for(int i=1; i<arr.length-1; i++){
            int left_max=arr[0];
            int right_max=arr[1];
            // find maximum support on left
            for(int j=0; j<i; j++){
                if(arr[j]>left_max)
                    left_max=arr[j];
            }
            // find maximum support on right
            for(int k=arr.length-2; k>i; k--){
                if(arr[k]>right_max)
                    right_max=arr[k];
            }
            if((Math.min(left_max, right_max)-arr[i])>0)
                water+=(Math.min(left_max, right_max)-arr[i]);
        }
    }

    // GfG solution
    int getWater(int[] arr){
        int res=0;
        for(int i=1; i<arr.length-1; i++){
            int lMax=arr[i];
            for(int j=0; j<i; j++){
                lMax=Math.max(lMax, arr[j]);
            }
            int rMax=arr[i];
            for(int j=i+1; j<n; j++){
                rMax=Math.max(rMax, arr[j]);
            }
            res= res+Math.min(lMax,rMax)-arr[i];
        }
        return res;
    }
    // time complexity: Theta(n^2)
    // space complexity: Theta(1)

    // Efficient solution
    int getWater(int[] arr){
        int[] lMax = new int[arr.length];
        int[] rMax = new int[arr.length];
        int res=0;

        lMax[0]=arr[0];
        for(int i=1; i<arr.length; i++)
            lMax[i]=Math.max(arr[i], lMax[i-1];
        rMax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--)
            rMax[i]=Math.max(arr[i],rMax[i+1]);
        for(int i=1; i<arr.length-1; i++)
            res=res+(Math.min(rMax[i],lMax[i])-arr[i]);
        return res;
    }

    // time complexity: Theta(n)
    // auxiliary space: Theta(n^2)

    // Efficient solution - Kadane's algorithm
    // for every element we find out the maximum subarrary that ends 
    // with the element 
    int maxSubSum(int[] arr){
        int res=arr[0];
        int maxEnding=arr[0];
        for(int i=1; i<arr.length; i++){
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res=Math.max(maxEnding, res);
        }
        return res;
    }
    // O(n)

    // Naive solution
    int maxCircSub(int[] arr){
        int res=arr[0];
        for(int i=0; i<n; i++){
            int curr_max=arr[i];
            int curr_sum=arr[i];
            for(int j=1; j<n; j++){
                int index=(i+j)%n;
                curr_sum+=arr[index];
                curr_max=Math.max(curr_max, curr_sum);
            }
            res = Math.max(res, curr_max);
        }
        return res;
    }

    // Efficient solution
    // 1. Maximum sum of normal subarrays (Kadane)
    // 2. Maximum sum of circular subarrays: rotate through the whole array
    // or find minimum subarray in array using modified Kadane

    int minSub(int[] arr){
        int min=arr[0];
        int tempMin=arr[0];
        for(int i=1; i<arr.length; i++){
            tempMin=Math.min(tempMin+arr[i], arr[i]);
            min=Math.max(min,tempMin);
        }
        return min;
    }
    // or invert the elements and call normal Kadane

    // Naive solution: consider every element as a beginning element
    // and run a loop
    // O((n-k)*k)

    // Efficient solution
    // i can be end or beginning of current window
    int maxKSum(int[] arr, int k){
        int sum=0;
        for(int i=0; i<k; i++){
            sum+=arr[i];
        }
        int max=sum;
        for(int i=1; i<arr.length-k+1; i++){
            sum-=arr[i-1];
            sum+=arr[i+k-1];
            if(sum>max)
                max=sum;
        }
        return max;
    }

    //  GfG solution
    int maxKSum(int[] arr, int k){
        int currSum = 0;
        for(int i=0; i<k; i++){
            currSum+=arr[i];
        }
        int maxSum=currSum;
        for(int i=k; i<arr.length; i++){
            currSum+=(arr[i]-arr[i-l]);
            maxSum=Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}