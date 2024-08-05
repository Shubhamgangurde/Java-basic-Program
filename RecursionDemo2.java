class RecursionDemo2{

    public static int placeTiles(int i,int j,int n,int m){

        if(i == n || j == m){
            
            return 0;
        }
        if(i == n-1 && j == n-1){

            return 1;

        }

            int horiPlace = placeTiles(i+1, j, n, m);

            int verPlace = placeTiles(i, j+1, n, m);
            
            return horiPlace + verPlace;

    }
    public static void main(String args[]){

            int n=3;
            int m=2;

            System.out.println(placeTiles(0,0,n,m));   
            
        
            
    }
}