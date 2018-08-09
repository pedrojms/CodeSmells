/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Good;

/**
 *
 * @author Pedrito
 */
//Refactoring: Extract method.
public class Comments {
    public void mostrarSuma(){
        int array1[] = {9,10,11,12};
        int array2[] = {5,6,7,8};
        int array3[] = {1,2,3,4};
        int sum1 = sumar(array1);
        int sum2 = sumar(array2);
        int sum3 = sumar(array3);
        
        System.out.println("La suma del primer array es "+sum1+", del segundo es "+sum2+" y del tercero "+sum3);
    }
    public static int sumar(int[] array) {
        int sum = 0;
        for (int i = 0; i < 4; i++)
            sum += array[i];

        return sum;
    
    }
}
