public class recursionBasicss{
    //this function is for Decreasing number
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    //This function is for Increasing number
    
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }
    //Factorial of a number n
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn=n*fnm1;
        return fn;
    }
    //print sum of first n natural numbers
    public static int printSum(int n){
        if(n==1){
            return 1;
        }
        int fnm1=printSum(n-1);
        int fn=n+fnm1;
        return fn;
    }
    //Print Nth fibonacci number
    public static int printFibo(int n){
        if(n==0||n==1){
            return n;
        }
        int fnm1=printFibo(n-1);
        int fnm2=printFibo(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    //Check if a array is sorted or not
    public static boolean sortedArr(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sortedArr(arr,i+1);

    }
      //Function to find the first occurence of an array
      public static int firstOccur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccur(arr,key,i+1);
      }
      //Function to find the last occurence of an element in an array
      public static int lastOccur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccur(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
      }
      //Print x to the power n
      public static int power(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower=power(a,n/2);
        int halfpowersq=halfpower*halfpower;
        if(n%2!=0){
            halfpowersq=a*halfpowersq;
        }
        return halfpowersq;
      }
      //print all occurence of an element in an array
      public static void allOccurence(int arr[],int key,int i){
        if( i==arr.length){
           return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");   
        }
        
        allOccurence(arr, key, i+1);
        
      }
      //write a program to find length of a string
      public static int lengthOstr(String str){
        if(str.length()==0){
            return 0;
        }
        return lengthOstr(str.substring(1))+1;
    }
    //you are given a number convert into string
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printStr(int n){
        if(n==0){
            return;
        }
        int lastdigit=n%10;
        printStr(n/10);
        System.out.print(digits[lastdigit]+" ");

        
    }
    public static void main(String args[]){
       int n=2024;
    
       printStr(n);
       System.out.println();
    }
}
