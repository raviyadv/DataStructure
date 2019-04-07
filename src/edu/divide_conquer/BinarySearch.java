package edu.divide_conquer;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearchByRecursionAndWithoutDivideAndConquer(new int[]{1, 2, 4, 9, 11, 13, 15, 16, 22, 35, 41, 45, 50, 55, 60}, 0, 14, 22));
        System.out.println(binarySearchByRecursionAndDivideAndConquer(new int[]{1, 2, 4, 9, 11, 13, 15, 16, 22, 35, 41, 45, 50, 55, 60}, 0, 14, 22));


    }

    private static int binarySearchByRecursionAndWithoutDivideAndConquer(int[] a, int l, int h, int key) {
        if (l == h) {
            if (a[l] == key)
                return 1;
            else
                return 0;
        }
        int mid = (l + h) / 2;
        if (a[mid] == key)
            return 1;
        /**
         * this will always return 1, if the element is found or not found.
         *
         * if(a[mid]>key)
         *             binarySearchByRecursionAndWithoutDivideAndConquer(a,l,mid-1,key);
         *         else
         *             binarySearchByRecursionAndWithoutDivideAndConquer(a,mid+1,h,key);
         *         return 1;
         *
         * try with tree tracing , we will get to know why it is returning 1 and 0 always.
         */
        int result;
        if (a[mid] > key)
           result= binarySearchByRecursionAndWithoutDivideAndConquer(a, l, mid - 1, key);
        else
            result=binarySearchByRecursionAndWithoutDivideAndConquer(a, mid + 1, h, key);
        return result;
    }
    private static int binarySearchByRecursionAndDivideAndConquer(int[] a, int l, int h, int key) {
      if(l==h){
          if(a[l]==key)
              return 1;
          else
              return 0;
      }
      int mid=(l+h)/2;
      if(a[mid]==key)
          return 1;
      if(a[mid]>key)
          return binarySearchByRecursionAndDivideAndConquer(a,l,mid-1,key);
      else
          return binarySearchByRecursionAndDivideAndConquer(a,mid+1,h,key);

    }
}
