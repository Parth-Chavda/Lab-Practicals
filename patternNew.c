#include<stdio.h>

void main() {
	int i, j, k;
	
	for(i = 1; i <= 5; i++) {
		for(j = i; j <= 4; j++) {
			printf("\t");
		}
		
		for(k = 1; k <= i; k++) {
			if(i == 3) {
				printf("*\t   Yog Karmasu\t\t*");
				break;
			} else if(i == 4) {
				printf("*\t\t    Kaushalam\t\t\t*");
				break;
			} else {
				printf("*\t\t");
			}
		}
		
		printf("\n");
	}
	
	for(i = 4; i >= 1; i--) {
		for(j = i; j <= 4; j++) {
			printf("\t");
		}
		
		for(k = 1; k <= i; k++) {
			if(i == 4) {
				printf("*\t\t   Yog Karmasu\t\t\t*");
				break;
			} else if(i == 3) {
				printf("*\t    Kaushalam\t\t*");
				break;
			} else {
				printf("*\t\t");
			}
		}
		
		printf("\n");
	}
}
