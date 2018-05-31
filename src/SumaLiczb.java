public class SumaLiczb {
    public static void main(String[] args){
        int[] tabLiczb = {4,2,6,9,11};
        int suma=0;
        for(int i=0; i<tabLiczb.length; i++){
            if(i%2!=0){
                continue;
            }
            suma+=tabLiczb[i];
        }
        System.out.println(suma);
    }
}
