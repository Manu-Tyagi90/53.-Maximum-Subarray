public class Solution {
public static int kadaneAlo(int[] arr){
int currentSum = arr[0];
int maxSum= arr[0];
for(int i=1;i<arr.length;i++){
currentSum = Math.max(currentSum,arr[i] + currentSum);
maxSum = Math.max(maxSum, currentSum);
}
return maxSum;
}}
