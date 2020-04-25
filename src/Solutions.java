import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solutions {
    ArrayList<Integer> get_Fibonacci(int n){
        //series is 1 1 2 3 5 8 ......
        ArrayList<Integer> series = new ArrayList<Integer>();
        int t1 = 1,t2 = 1,n_start = 3;
        if (n<1){
            return series;
        }
        else if(n==1){
            series.add(t1);
            return series;
        }
        else if(n>=2){
            series.add(t1);
            series.add(t2);
        }
        int t3;
        while(n_start<=n){
            t3 = t1 + t2;
            series.add(t3);
            t1 = t2;
            t2 = t3;
            n_start++;
        }
        return series;
    }

    boolean checkPalindrome(String str){
        boolean flag=true;
        for(int i = 0,j=str.length()-1;i<(str.length())/2;i++,j--){
            if (str.charAt(i)!=str.charAt(j)){
                flag=false;
                break;
            }
        }
       return flag;
    }

    boolean checkPalindrome(int no){
        int rev_no=0,temp=no;
        while(temp>0){
            rev_no*=10;
            rev_no+=temp%10;
            temp/=10;
        }
        if(rev_no==no)
            return true;
        else
            return false;
    }

    void primeSeries(int n){
        System.out.print("Prime Series is : ");
        for(int i=1,j=1;i<=n;j++){
            if(checkPrime(j)){
                System.out.print(j+" ");
                i++;
            }
        }
    }

    boolean checkPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    boolean checkArmstrong(int n){
        int temp=n,sum=0,size=0;
        while (temp>0){
            temp/=10;
            size++;
        }
        temp=n;
        while(temp>0){
            sum+= Math.pow(temp%10,size);
            temp/=10;
        }
        if(sum==n)
            return true;
        else
            return false;
    }

    double calFactorial(int n){
        double ans = n;
        n--;
        while(n>0){
            ans*=n;
            n--;
        }
        return ans;
    }

    String reverseFunction(String str){
        String rev= new String();
        for(int i=(str.length()-1);i>=0;i--){
            rev = rev+str.charAt(i);
        }
        return rev;
    }

    int[] reverseFunction(int[] arr){
        int[] ans = new int[arr.length];
        for(int i=(ans.length-1),j=0;i>=0;i--,j++){
            ans[j] = arr[i];
        }
        return ans;
    }

    void removeDuplicate(int [] arr){
        Arrays.sort(arr);
        int[] temp= new int[arr.length];
        int new_length = arr.length;
        for(int i=0,j=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j] = arr[i];
                new_length=j;
                j++;
            }
        }
        if(arr[arr.length-1]!=arr[arr.length-2]){
            temp[++new_length] = arr[arr.length-1];

        }
        System.out.print("Array after removing duplicate : ");
        for(int i=0; i<=new_length;i++)
            System.out.print(temp[i]+" ");
    }

    void removeDuplicate(String arr){
        String ans=new String();
        for(int i=0;i<arr.length()-1;i++){
            if(arr.charAt(i)!=arr.charAt(i+1)){
                ans+=arr.charAt(i);
            }
        }
        if(arr.charAt(arr.length()-1)!=arr.charAt(arr.length()-2)){
            ans+=arr.charAt(arr.length()-1);

        }
        System.out.print("String after removing duplicate : "+ans);
    }

}
