public class Runner {

    public static void main(String[] args) {
        System.out.println(diff21(16));
        int[] x = {1,2,3,4,5,6,7,8,9};
        System.out.println(array123(x));
        System.out.println(firstTwo("logan"));
        int[] y = {1,2};
        System.out.println(has23(y));
        System.out.println(love6(6,2));
        System.out.println(luckySum(1,2,13));
        System.out.println(countHi("go go lol hi hi hiihhi"));
    }
    public static int diff21 ( int n){
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
    public static boolean array123(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums.length <= 2){
                return false;
            }

            if((nums[i] == 1) && (nums.length - i >= 3)){
                if((nums[i+1] == 2) && (nums[i+2] == 3) && (nums.length >= 3)){
                    return true;
                }
            }
        }
        return false;
    }
    public static String firstTwo(String str) {
        if(str.length() < 2){
            return str;
        }
        if(str.length() >= 2){
            return str.substring(0,2);
        }
        return str;
    }
    public static boolean has23(int[] nums) {
        if((nums[0] == 2) || (nums[0] == 3)){
            return true;
        }
        if((nums[1] == 2) || (nums[1] == 3)){
            return true;
        }
        return false;
    }
    public static boolean love6(int a, int b) {

        if(a == 6){
            return true;
        }
        if(b == 6){
            return true;
        }
        if((a + b) == 6 || (a - b) == 6 || (b - a) == 6){
            return true;
        }
        return false;
    }
    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a != 13){
            sum = a;
            if(b != 13){
                sum += b;
                if(c != 13){
                    sum += c;
                }
            }
        }
        return sum;
    }
    public static int countHi(String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 1; i++){
            if(str.substring(i, i + 2).equals("hi")){
                count += 1;
            }
        }
        return count;
    }
}


