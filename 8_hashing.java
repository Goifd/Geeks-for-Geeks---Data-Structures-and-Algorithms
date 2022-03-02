class Main{
  public static void main(String[] args){
    System.out.println("Hello World");
  }

    // Naive solution
    // traverse the array for every element with two for loops
    // O(n^2)
    // O(1) aux space

    // Efficient solution
    int countDistinct(int[] arr){
        HashSet<Integer> hset = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            hset.add(arr[i]);
        }
        return hset.size();
    }
    //Theta(n)
    //O(n) aux space
    int countDistinct(int[] arr){
        HashSet<Integer> s = new HashSet<>(Arrays.asList(arr));
        return s.size();
    }
    //Theta(n)
    //O(n) 

    // Naive solution
    // count every element and check left side if element was already seen
    void printFreq(int[] arr)
        for(int i=0; i<arr.length; i++){
            boolean flag=false;
            for(int j=0; j<i; j++)
                if(arr[i]==arr[j]){flag=true; break;}
            if(flag)
                continue;
            int freq=1;
            for(int j=i+1; j<arr.length; j++)
                if(arr[j]==arr[i];
                    freq++;
            System.out.println(arr[i] + " " + freq);
        }
    }
    // Efficient solution
    public static void frequenciesOfElements(int[] arr){
            HashMap<Integer, Integer> m = new HashMap<>();
            for(int i=0; i<arr.length; i++){
                if(m.containsKey(arr[i]))
                    m.put(arr[i], m.get(arr[i])+1);
                else
                    m.put(arr[i], 1);
            }

            for(Map.Entry<Integer, Integer> e: m.entrySet())
                System.out.println(e.getKey()+" "+e.getValue());
        }


    int frequency(int[] arr){
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int x:arr)
            h.put(x, h.getOrDefault(x,0)+1);
        for(Map.Entry<Integer, Integer> e: h.entrySet())
            System.out.println(e.getKey()+" "+e.getValue());
    }
    // Theta(n) - time complexity
    // O(n) - aux space

    // Naive solution
    // initialize res=0
    // traverse through every element of a[], check if it has appeared already
    // if it is a new element and also present in b[] do res++
    int intersection(int[] a, int[] b){
        int res=0;
        for(int i=0; i<a.length; i++){
            boolean flag=true;
            for(int j=0; j<i; j++){
                if(a[i]==a[j])
                    flag=false;
            }
            if(flag){
                for(int j=0; j<b.length; j++){
                    if(a[i]==b[j]){
                        res++;
                        break;
                    }
                }
            }
        }
    }
    // time complexity: O(m(n+m))
    // aux space: O(1)


    // Efficient solution
    int intersection(int[] a, int[] b){
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(a));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(b));
        HashSet<Integer> intersection = new HashSey<Integer>(s1);
        intersection.retainAll(s2);
    }
    // 2nd solution
    public static void intersection(int[] arr1, int[] arr2){
            HashSet<Integer> s1 = new HashSet<>();
            HashSet<Integer> s2 = new HashSet<>();
            for(int i=0; i<arr1.length; i++){
                s1.add(arr1[i]);
            }
            for(int i=0; i<arr2.length; i++){
                s2.add(arr2[i]);
            }
            Iterator iter = s1.iterator();
            int res=0;
            while(iter.hasNext()){
                if(s2.contains(iter.next()))
                    res++;
            }
            System.out.println(res);
        }
    // O(m+n) time

    // Efficient solution
    int intersection(int[] a, int[] b){
        int res=0;
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<a.length; i++){
            s.add(a[i]);
        }
        for(int i=0; i<b.length; i++){
            if(s.contains(b[i]){
                res++;
                s.remove(b[i]);
            }
        }
        return res;
    }
    // Theta(n+m) time
    // 

    // Efficient solution
    void union(int[] a, int[] b){
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<a.length; i++){
            s.add(a[i]);
        }
        for(int i=0; i<b.length; i++){
            s.add(b[i]);
        }
        Iterator it=s.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    // time: Theta(n+m)
    // space: O(n+m)

    // Naive solution
    //O(n^2) time
    // O(1) space


    // Two pointer approach
    // O(nlogn) - logn is sorting

    // Efficient solution

    int pairWithSum(int[] arr), int num{
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(s.contains(num-arr[i])
                res++;
            else // needed in case of duplicates
                s.add(arr[i]);
        }
        return res;
    }
    // O(n) space and time


    // Naive solution
    boolean is0Subarray(int[] arr){
        for(int i=0; i<arr.length; i++){
            int currSum=0;
            for(int j=i; j<arr.length; j++){
                currSum+=arr[j];
                if(currSum==0)
                    return true;
            }
        }
        return false;
    }
    // time complexity: O(n^2)
    // space: O(1)

    // Efficent solution
    //prefux sum and hashing
    boolean is0Subarray(int[] arr){
        HashSet<Integer> s = new HashSet<>();
        int prefix=0;
        for(int i=0; i<arr.length; i++){
            prefix+=arr[i];
            if(s.contains(prefix))
                return true;
            if(pre_sum==0)
                return true;
            s.add(prefix);
        }
    }
    // O(n) time
    // O(n) space

    // Naive solution
    int maxLen(int[] arr, int sum){
        int res=0;
        for(int i=0 i<arr.length; i++){
            int curr_sum=0;
            for(int j=i; j<arr.length; j++){
                curr_sum+=arr[j];
                if(curr_sum==sum)
                    res=Math.max(res,j-i+1);
            }
        }
        return res;
    }
    // time: Theta(n^2)
    // aux space: O(1)

    // Efficient solution with prefix sum
    int maxLen(int[] arr, int sum){
        HashMap<Integer, Integer> m = new HashMap<>();
        int prefix=0;
        int res=0;
        for(int i=0; i<arr.length; i++){
            prefix+=arr[i];
            if(s.containsKey(prefix-sum)){
                Integer a = m.get(prefix-sum);
                if(i-a>res)
                    res=i-a;
            } 
            m.put(prefix, i);
        }	
        return res;
    }

    //GfG solution
    int maxLen(int[] arr, int sum){
        int pre_sum=0;
        int res=0;
        for(int i=0; i<arr.length; i++){
            pre_sum+=arr[i];
            if(pre_sum==sum)
                res=i+1;
            if(m.contains(pre_sum)==false)
                m.put(pre_sum, i);
            if(m.contains(pre_sum-sum))
                res=Math.max(res, i-m.get(pre_sum-sum));
        }
        return res;
    }
    // time: Theta(n)
    // aux-space: O(n)


    // Naive solution
    boolean givenSum(int[] arr, int num){
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr.length; j++){
                sum+=arr[j];
                if(sum==num)
                    return true;
            }
        }
        return false;
    }
    // O(n^2), O(1)

    // Efficient solution
    boolean givenSum(int[] arr, int num){
        HashSet<Integer> s = new HashSet<>();
        int prefix=0;
        for(int i=0; i<arr.length; i++){
            prefix+=arr[i];
            if(prefix==num) return true; // for subarrays that begin with index 0
            if(s.contains(prefix-num)) return true;
            s.add(arr[i]);
        }
        return false;
    }
    // Theta(n), O(n)

    // Naive solution
    int maxLen(int[] arr, int sum){
        int res=0;
        for(int i=0 i<arr.length; i++){
            int curr_sum=0;
            for(int j=i; j<arr.length; j++){
                curr_sum+=arr[j];
                if(curr_sum==sum)
                    res=Math.max(res,j-i+1);
            }
        }
        return res;
    }
    // time: Theta(n^2)
    // aux space: O(1)

    // Efficient solution with prefix sum
    int maxLen(int[] arr, int sum){
        HashMap<Integer, Integer> m = new HashMap<>();
        int prefix=0;
        int res=0;
        for(int i=0; i<arr.length; i++){
            prefix+=arr[i];
            if(s.containsKey(prefix-sum)){
                Integer a = m.get(prefix-sum);
                if(i-a>res)
                    res=i-a;
            } 
            m.put(prefix, i);
        }	
        return res;
    }

    //GfG solution
    int maxLen(int[] arr, int sum){
        int pre_sum=0;
        int res=0;
        for(int i=0; i<arr.length; i++){
            pre_sum+=arr[i];
            if(pre_sum==sum)
                res=i+1;
            if(m.contains(pre_sum)==false)
                m.put(pre_sum, i);
            if(m.contains(pre_sum-sum))
                res=Math.max(res, i-m.get(pre_sum-sum));
        }
        return res;
    }
    // time: Theta(n)
    // aux-space: O(n)
}