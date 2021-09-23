

    static void printArray(String[] names){
        for (String name : names) System.out.println(name);
    }
    static int mySum(int[] array){
        int sum=0;
        for(int k:array){
            sum=sum+k;
        }
        return sum;
    }
    static float myAverage(int[] array){
        int sum=0;
        for(int k:array){
            sum=sum+k;
        }
        return sum/array.length;
    }

    public static void main(String[] args) {
         String[] tanks = {"AnglerFish","Duck","Hippo"};
         printArray(tanks);
        boolean [] bools= {true, false, false};
        int [] ints = {1,2,3};
        System.out.println(mySum(ints)); 

    }


}
