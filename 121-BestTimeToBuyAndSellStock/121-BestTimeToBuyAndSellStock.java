// Last updated: 9/9/2026, 2:15:18 PM
class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else if(prices[i]-buy>profit){
                profit=prices[i]-buy;
            }
        }
        return profit;
    }
}
// class Solution {
//     public int maxProfit(int[] prices) {
//         int minPrice=Integer.MAX_VALUE;
//         int maxProfit=0; 
//         for(int price:prices) {
//             if(price<minPrice) {
//                 minPrice=price;
//             }
//             int profit=price-minPrice;
//             if(profit>maxProfit) {
//                 maxProfit=profit;
//             }
//         }
//         return maxProfit; 
//     }
// }