public class gridWaysProblem {
    //gridways problem solution
    public static int gridWays(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){ //condition for last cell
            return 1;
        }
        if(i==n ||j==m){
            return 0;
        }
        int w1=gridWays(i+1, j, n, m); //down  
        int w2=gridWays(i, j+1, n, m); //right
        return w1+w2; 
        }
    public static void main(String args[]){
     int n=3,m=3;
     System.out.print(gridWays(0, 0, n, m));
    }
}
