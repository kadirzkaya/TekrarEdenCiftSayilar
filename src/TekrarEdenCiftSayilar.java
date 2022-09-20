public class TekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int[] arr={3,5,1,6,2,75,32,7,21,3,2,75,32,6};
        int[] duplicate=new int[arr.length/2];
        int startIndex=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if ((i!=j) && (arr[i]==arr[j])){
                    if (!isFind(duplicate,arr[i])){
                        duplicate[startIndex++]=arr[i];
                    }
                    break;
                }
            }
        }

        for (int val:duplicate){
            if (val!=0 && val%2==0){
                System.out.println(val);
            }
        }

    }

    static boolean isFind(int[] ar, int val){
        for (int i:ar){
            if (i==val){
                return true;
            }
        }
        return false;
    }
}
