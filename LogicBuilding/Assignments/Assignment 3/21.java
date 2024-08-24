class HelloWorld {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<n;i=i+2){
            for(int j=1;j<=i;j=j+2){
                if(j<i){
                System.out.print(j+"*");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
           
        }
    }
}