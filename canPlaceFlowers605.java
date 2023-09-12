
import java.util.*;
public class canPlaceFlowers605 {
    public static void main(String[] args) {
//int flowerbed[] = {1,0,0,0,0,1};
        int flowerbed[] = {0,0,1,0,1};

int n=1;
//boolean result = canPlaceFlowers(flowerbed,n);
//        System.out.println(result);
        System.out.println(canPlaceFlowers(flowerbed,n));
    }


    public static boolean canPlaceFlowers(int[] a, int n) {
        int i = 0;
        int N = a.length;
        if(N == 1){
            if(a[0] == 0 && n == 1){
                return true;
            }
        }
        while(i < N && n > 0){
            if(i == 0){
                if(a[i] == 0 && a[i+1] == 0){
                    a[i] = 1;
                    n--;
                }
            }
            else if(i == N-1){
                if(a[i-1] == 0 && a[i] == 0){
                    a[i] = 1;
                    n--;
                }
            }
            else if(a[i-1] == 0 && a[i] == 0 && a[i+1] ==0){
                a[i] = 1;
                n--;
            }
        }

        if(n == 0){
            return true;
        }
        else
            return false;
    }

    //////////////////////////////////////////////////////////////////////

//    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
//        if (n == 0)
//            return true;
//
////        for (int i = 0; i < flowerbed.length; ++i)
////            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
////                    (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
////                flowerbed[i] = 1;
////                if (--n == 0)
////                    return true;
////            }


    //////////////////////////////////////////////////////////////////////////////////////////

//        for (int i =1; i < flowerbed.length-2; i=i+2){
//            int prev=flowerbed[i-1];
//            int next=flowerbed[i+1];
//            int curr=flowerbed[i];
//            if(prev+curr==0 && curr+next==0){
//                n=n-1;
//                System.out.println("1");
//                if(n==0){
//                    return true;
//                }
//
//            }
//        }
//
//        return false;
//    }

}
