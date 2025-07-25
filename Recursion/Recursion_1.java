class Recursion_1 {
    //PRINT NAME 5 TIMES
    public static void print(String name, int n){
        if (n == 0){
            return;
        }else{
            System.out.println(name);
            print(name, --n);
        }
    }
    public static void main(String[] args) {
        print("name", 5);
    }
}