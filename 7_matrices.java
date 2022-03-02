class Main{
  public static void main(String[] args){
    System.out.println("Hello World");
  }

    void printSnake(int arr[][]){
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                for(int j=0; j<arr[i].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
            } else{
                for(int j=arr[i].length; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }

    void boundaryTraversal(int arr[][]){
        int R = arr.length;
        int C = arr[0].length;
        if(R==1){
            for(int i=0; i<C; i++){
                System.out.print(arr[0][i]+" ");
            }
        }
    }

}