public class SpecialPythagoreanTriplet {
    static int findTripletProduct(){
        for(int i=1;i<1000; i++){
            for(int j =1;j<=i; j++){
                for(int k=0; k<1000; k++){
                    if(i+j+k == 1000 && (i*i + j*j) == k*k) return i*j*k;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //problem 9
        System.out.println(findTripletProduct());
        //31875000
    }
}
