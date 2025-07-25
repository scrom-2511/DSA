class Recursion_2 {
    
    //SUMMATION OF FIRST N NUMBERS(Parameterized)
    public static int sumParameterized(int i, int sum){
        if (i == 0){
            return sum;
        }else{
            return sumParameterized(i-1, sum+i);
        }
    }
    
    public static void main(String[] args) {
        int sumResult1 = sumParameterized(3,0);
        System.out.println(sumResult1);
    }
}
