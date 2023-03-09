package DSA.algorithms.sort;

public class SelectionsSort {
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            var indexOfMin = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[indexOfMin])
                    indexOfMin = j;

            }
            swap(array, indexOfMin, i);
        }
    }


    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
