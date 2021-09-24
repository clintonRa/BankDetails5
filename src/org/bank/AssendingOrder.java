package org.bank;

public class AssendingOrder {
public static void main(String[] args) {
	int a[]= {1,5,8,6,9,4};
	//ASSENDING ODER
	for(int i=0; i<a.length; i++){
				for (int j = i+1; j < a.length; j++) {
					if(a[i]>a[j]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
		     }
		   }
		}
		for (int i : a) {
			System.out.println(i);
		}
	}

}
