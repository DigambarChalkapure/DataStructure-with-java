public class BinarySearch {

    public void binarySearch(int startIndex,int endIndex,int[] array,int target){
        int mid = (startIndex+endIndex)/2;
        if(startIndex<endIndex){
            if(target==array[mid]){
                System.out.println(mid);
            }
            else if (target > array[mid]) {
                startIndex = mid + 1;
                binarySearch(startIndex, endIndex, array, target);
            }
            
            else{
                endIndex = mid - 1;
                binarySearch(startIndex, endIndex, array, target);
            }
        }
        else{
            System.out.println("element is not present");
        }
            
        }
        
        public static void main(String[] args) {
            int[] arr = {2,3,4,5,6,7,8,9,10};
            int target = 11;
            int start = 0;
            int end = arr.length-1;

            BinarySearch bs = new BinarySearch();
            bs.binarySearch(start,end,arr,target);

        }
}
