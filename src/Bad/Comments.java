/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bad;

/**
 *
 * @author Pedrito
 */
//Refactoring: Extract method
public class Comments {
    public void mostrarSuma(){
        int array1[] = {9,10,11,12};
        int array2[] = {5,6,7,8};
        int array3[] = {1,2,3,4};
        //haciendo la suma del primer array
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        //haciendo la suma del segundo array
        int sum2 = 0;
        for (int j = 0; j < array2.length; j++){
            sum2 += array2[j];
        }
        
        //haciendo la suma del tercer array
        int sum3 = 0;
        for (int k = 0; k < 4; k++){
            sum3 += array2[k];
        }
        
        System.out.println("La suma del primer array es "+sum1+", del segundo es "+sum2+" y del tercero "+sum3);
    }
}
  
