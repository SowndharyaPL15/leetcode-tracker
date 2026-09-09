// Last updated: 9/9/2026, 2:16:46 PM
class Solution {
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i>= 0; i--){
            digits[i]++;
            if(digits[i]<10){
                return digits;
            }
                digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result [0] = 1;
        return result;
    }
    public static void main(String args[]){
        Scanner x = new Scanner(System.in);
        String[] parts = x.nextLine().split(" ");
        int[] digits = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            digits[i] = Integer.parseInt(parts[i]);
        }
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}
