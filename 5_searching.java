class Main{
  public static void main(String[] args){
    System.out.println("Hello World");
  }

    public static int iterativeBinarySearch(int[] arr, int element){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int middle = (low+high)/2;
            if(arr[middle] == element)
                return middle;
            else if(arr[middle]<element){
                low = middle+1;
            }
            else{
                high = middle-1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int[] arr, int element, int high, int low){
        if(high<low)
            return -1;
        int middle=(high+low)/2;
        if(arr[middle]==element)
            return middle;
        if(arr[middle]>element)
            return recursiveBinarySearch(arr, element, middle-1, low);
        else
            return recursiveBinarySearch(arr, element, high, middle+1);
    }

    public static int recursiveIndexOfFirstOccurrence(int[] arr, int el, int hi, int lo){
        if(lo>hi)
            return -1;
        int mid=(lo+hi)/2;
        if(arr[mid]==el){
            if(mid==0 || arr[mid-1]!=el)
                return mid;
            return recursiveIndexOfFirstOccurrence(arr, el, mid-1,lo);
        }
        if(arr[mid]>el)
            return recursiveIndexOfFirstOccurrence(arr, el, mid-1, lo);
        else
            return recursiveIndexOfFirstOccurrence(arr, el, hi, mid+1);
    }

    public static int iterativeIndexOfFirstOccurrence(int[] arr, int el){
        int high = arr.length-1;
        int low = 0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==el){
                if(mid==0||arr[mid-1]!=arr[mid])
                    return mid;
                else
                    high = mid-1;
            }
            if(arr[mid]<el)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }

    public static int recursiveIndexOfLastOccurrence(int[] arr, int el, int hi, int lo){
        if(lo>hi)
            return -1;
        int mid=(lo+hi)/2;
        if(arr[mid]==el){
            if(mid==arr.length-1 || arr[mid+1]!=el)
                return mid;
            return recursiveIndexOfLastOccurrence(arr, el, hi,mid+1);
        }
        if(arr[mid]>el)
            return recursiveIndexOfLastOccurrence(arr, el, mid-1, lo);
        else
            return recursiveIndexOfLastOccurrence(arr, el, hi, mid+1);
    }

    public static int iterativeIndexOfLastOccurrence(int[] arr, int el){
        int high = arr.length-1;
        int low = 0;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==el){
                if(mid==arr.length-1 || arr[mid+1]!=arr[mid])
                    return mid;
                else
                    low = mid+1;
            }
            if(arr[mid]<el)
                low=mid+1;
            else if(arr[mid]>el)
                high=mid-1;
        }
        return -1;
    }
    int floorSqrt(int num){
    	int i=1;
	while(i*i<=x)
		i++;
	return i-1;
    }

    //time complexity - Theta(sqrt(x))

    int floorSqrt(int num){
        int high=num;
        int low=1;
        while(true)}
            int mid=(high+low)/2;
            if(mid*mid<=num && (mid+1)*(mid+1)>num)
                return mid;
            if(mid*mid>num)
                high=mid-1;
            else if(mid*mid<num)
                low=mid+1;
        }
    }


    //linear search
    //rotate back the array to sorted and perform binary search

    public static int searchRotatedArray(int arr[], int lo, int hi, int element){
        if(hi<lo)
            return -1;
        int mid = (hi + lo) / 2;
        System.out.println("low: " + lo + " high: " + hi);
        if(arr[mid]==element)
            return mid;
        if(arr[mid]>arr[lo]) {
            if(element>=arr[lo] && element<arr[mid])
                return searchRotatedArray(arr, lo, mid - 1, element);
            else
                return searchRotatedArray(arr, mid+1, hi, element);
        }
        else {
            if (element > arr[mid] && element <= arr[hi])
                return searchRotatedArray(arr, mid + 1, hi, element);
            else
                return searchRotatedArray(arr, lo, mid-1, element);
        }
    }


    // Class solution
    int search(int arr[], int x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x)
                return mid;
            // Left half sorted
            if(arr[low]<arr[mid]{
                // In sorted side
                if(x>=arr[low] && x<arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            // Right half sorted
            else {
                // In sorted side
                if(x>arr[mid] && x<arr=[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
    }

    // Naive solution with two arrays
    // time complexity O(n^2)
    // Hashtable solution
    // time complexity O(n)
    // auxiliary space O(n)

    boolean twoPointer(int arr, int x){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]==x) 
                return true;
            else if(arr[low]+arr[high]<=x)
                low+=1;
            else if(arr[low]+arr[high]>=x)
                high-=1;
        }
        return false;
    }

}