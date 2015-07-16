/**
 *  Practicing arrays.
 */
package com.craigmcgarry.ocjaq.practiceArrays;

import java.util.Random;

/**
 * @author Craig McGarry
 *
 */
public class ArrayApp {

	public static void main(String[] args) {

		int [] scores = new int [50];
		for(int i = 0; i<scores.length;++i){
			scores[ i ]=i+1;	
			System.out.print(scores[i] + " ");
		}
		float total = 0;
		int min = scores [0];
		int max = scores [0];
		//TOTAL
		for(int i=0; i < scores.length; ++i){
			total = total + scores[i];
		}
		//MEAN
		float mean = total / scores.length;
		System.out.println("\nMean is " + mean);

		//MIN
		for(int i=0; i < scores.length; ++i){
			if(scores[i]< min  ){
				min = scores[i];
			}
		}
		System.out.println("Min is " + min);

		//MAX
		for(int i=0; i < scores.length; ++i){
			if(scores[i] > max ) {
				max = scores[i];
			}
		}
		System.out.println("Max is " + max);

		Random rand = new Random();
		int num = rand.nextInt(scores.length);
		if(num > 25){
			System.out.println("the random number is higher the 25 the random number is: "  +num);			
		}
		else if(num < 25){
			System.out.println("the random number is lower the 25 the random number is: " + num);

		}


	}

}
