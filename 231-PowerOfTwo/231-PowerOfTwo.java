// Last updated: 9/9/2026, 2:12:58 PM
class Solution {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0;    
    }
    public static void main(String args[]){
        Scanner x = new Scanner (System.in);
        int m = x.nextInt();
        System.out.println(isPowerOfTwo(m));
    }
}