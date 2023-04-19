/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package noiseremoving;

/**
 *
 * @author stream
 * @param <E>
 */
public class CollectionSort <E extends Comparable<E>> {
    
    E[] array;
    
    public void setArray(E[] newArray) {
      array = newArray;
    }
    
    public void quickSort() {
        int left = 0;
        int right = array.length -1;
        doSorting(array, left, right);
    }
    
    private void doSorting(E[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            doSorting(arr, left, pivotIndex - 1);
            doSorting(arr, pivotIndex + 1, right);
        }
    }

    private int partition(E[] arr, int left, int right) {
        E pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    private void swap(E[] arr, int i, int j) {
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
