package gsitAssignments;

public class AssignmentSeven_030726 {
    public static void uniqueElements(){
        int[] numbers = {4,1,2,4,5,5,6,8,9,9};
        for(int i = 0;i < numbers.length; i++){
            int currentNumb = numbers[i];
            boolean isPrinted = false;
            for(int j = 0; j<i;j++){
                if(currentNumb == numbers[j]){
                    isPrinted = true;
                    break;
                }
            }
            if(isPrinted){
                continue;
            }
            else{
                System.out.println(currentNumb);
            }
        }
    }
    public static void commonElementFinder(){
        int[] arr1 = {2, 5, 7, 9, 11, 5};
        int[] arr2 = {1, 5, 7, 15, 20, 5};
        for(int i = 0; i < arr1.length; i++){
            int currentNumber = arr1[i];
            boolean isPrinted = false;
            for(int j = 0; j<i;j++){
                if(currentNumber == arr1[j]){
                    isPrinted = true;
                    break;
                }
            }
            if(isPrinted){
                continue;
            }
            else{
                boolean isCommon = false;
                for(int j =0; j < arr2.length;j++){
                    if(currentNumber == arr2[j]){
                        isCommon = true;
                        break;
                    }
                }
                if(isCommon){
                    System.out.println(currentNumber);
                }
            }
        }

    }

    public static void occurenceCounter(){
        int[] numbers = {4,1,2,4,5,5,6,8,9,9};
        for(int i = 0;i < numbers.length; i++){
            int currentNumb = numbers[i];
            boolean isPrinted = false;
            for(int j = 0; j<i;j++){
                if(currentNumb == numbers[j]){
                    isPrinted = true;
                    break;
                }
            }
            if(isPrinted){
                continue;
            }
            else{
                int counter = 0;
                for (int j = 0; j < numbers.length;j++){
                    if(currentNumb == numbers[j]){
                        counter++;
                    }
                }
                if(counter > 1){
                    System.out.println(currentNumb+" occurs "+counter +" times");
                }
                else{
                    System.out.println(currentNumb+" occurs "+counter +" time");
                }
            }
        }
    }
    public static void main(String[] args) {
        uniqueElements();
        System.out.println("----------------------------------------------------------");
        commonElementFinder();
        System.out.println("----------------------------------------------------------");
        occurenceCounter();
    }
}
