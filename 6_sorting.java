class Main{
  public static void main(String[] args){
    System.out.println("Hello World");
  }

    // Bubble sort
    void bubbleSort(int[] arr) {
        for(int j=0; j<arr.length-1; j++) {
            for(int i=0; i<arr.length-1-j; i++) {
                if(arr[i]<arr[i+1]) {
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    // efficiency: Theta(n^2)
    // Optimized bubble sort
    void bubbleSort(int[] arr) {
        for(int j=0; j<arr.length-1; j++) {
            boolean swapped=false;
            for(int i=0; i<arr.length-1-j; i++) {
                if(arr[i]<arr[i+1]) {
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
    // efficiency: O(n^2)


    // both algorithms are stable: if you have two items with same values 
    // never changes their position
    // auxiliary space: 0

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int index=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[index]>arr[j]){
                    index=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[index];
            arr[index] = temp;
        }
    }

    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    // what does it do wtf? why does it work?


    // example solution
    void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key) { //put = and algo becomes unstable
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    // best case time complexity: Theta(n) - already sorted
    // worst case time complexity: Theta(n^2) - reverse sorted
    // in general: O(n^2)

    void merge(int[] a, int[] b) {
        int i=0;
        int j=0;
        while(i<a.length && j<b.length) {
            if(a[i]<=b[j]) {
                System.out.println(a[i]);
                i++;
            } else {
                System.out.println(b[i]);
                j++;
            }
        }
        while(i<a.length) {
            System.out.println(a[i]);
            i++;
        }
        while(j<b.length) {
            System.out.println(b[j]);
        }
    }

    // Theta(m+n) time
    // stable

    // merge function of merge sort
    // merge ordered subarrays from low-mid, mid+1-high
    void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid-low+1;
        int n2 = high-mid;
        int[] left = new int[n1];
        int[] rigth = new int[n2];
    // copy left side
        for(int i=0; i<n1; i++){
            left[i]=arr[low+i];
        }
    // copy right side
        for(int i=0; i<n2; i++){
            right[i]=arr[mid+i+1];
        }
        int i=0;
        int j=0;
        int k=0;
    // merge 
        while(i<n1 && j<n2) {
            if(left[i]<=right[j]){ //= ensures stability
                arr[k]=left[i];
                i++;
                k++;
            }	else {
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1) {
            a[k]=left[i];
            i++;
            k++
        }
        while(j<n2) {
            a[k]=right[j];
            j++;
            k++;
        }
    }
    // time: theta(n)
    // aux space: theta(n)

    // merge sort algorithm
    void mergeSort(int arr[], int l, int r) {
        if(r>l) {
            int m=l+(r-l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }


    void printIntersection(int[] a, int[] b){
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
                    if(i>0 && a[i]==a[i-1]) {
                        i++;
                        continue;
                    }
            if(a[i]==b[j]) {
                System.out.println(a[i]);
                i++;
                j++;
            }
            else if(a[i]>b[j])
                j++;
            else
                i++;
        }
    }


    // Efficient solution
    void printUnion(int[] a, int[] b){
        int i=0;
        int j=0;
        while(i<a.length && j<b.length) {
            if(j>0 && b[j]==b[j-1] {
                j++;
                continue;
            }
            if(i>0 && a[i]==a[i-1] {
                i++;
                continue;
            }
            if(a[i]==b[j]) {
                System.out.println(a[i]);
                i++;
                j++;
            }
            else if(a[i]>b[j]){
                System.out.println(b[j]);
                j++;
            }
            else {
                System.out.println(a[i]);
                i++;
            }
        }
        while(i<a.length){
            if(i>0 && a[i]!=a[i-1]){
                System.out.println(a[i]);
                i++;
            }
        }
        while(j<b.length){
            if(j>0 && b[j]!=b[j-1]){
                System.out.println(b[j]);
                j++;
            }
        }
    }

    int countInv(int[] arr, int l, int r) {
        int res=0;
        if(l<r){
            int m=l+(r-l)/2;
            res+=countInv(arr,l,m);
            res+=countInv(arr,m+1,r);
            res+=countAndMerge(arr,l,m,r);
        }
        return res;
    }

    int countAndMerge(int arr[], int l, int m, int r) {
        int n1=m-l+1;
        int n2=r-m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0; i<n1;  i++) {
            left[i]=arr[l+i];
        }
        for(int i=0; i<n2; i++) {
            right[i]=arr[m+l+i];
        }
        int res=0;
        int i=0;
        int j=0;
        int k=l;
        while(i<n1 && j<n2) {
            if(left[i]<=right[j]) {
                arr[k]=left[i];
                i++;
            } else {
                arr[k] = right[j]; 
                j++;
                res=res+(n1-i);
            }
        }

        while(i<n1) {
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2) {
            arr[k]=right[k];
            i++;
            k++;
        }
        
    }
    // time complexity: O(nlogn)
    // aux space: O(n)

}