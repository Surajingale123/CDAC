 class HelloWorld {
    public static void main(String[] args) {
        int n=6;
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                if(j<i){
                System.out.print((6-j)+"*");
                }
                else{
                    System.out.print(6-j);
                }
            }
            System.out.println();
           
        }
    }
}