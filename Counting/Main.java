#include <stdio.h>
#include<string.h>
int main() {
    char line[220];
    int vowels=0,symbol=0,consonant=0,digit=0,space=0;

    
    fgets(line, sizeof(line), stdin);

    for (int i = 0; line[i] != '\0'; ++i) {
        if (line[i] == 'a' || line[i] == 'e' || line[i] == 'i' ||line[i] == 'o' || line[i] == 'u' || line[i] == 'A' ||line[i] == 'E' || line[i] == 'I' || line[i] == 'O' ||line[i] == 'U') {
            ++vowels;
        } else if ((line[i] >= 'a' && line[i] <= 'z') || (line[i] >= 'A' && line[i] <= 'Z')) {
            ++consonant;
        } else if (line[i] >= '0' && line[i] <= '9') {
            ++digit;
        } else if (line[i] == ' ') {
            ++space;
        }
      		else 
        	symbol++;
            
      }

    printf("Vowels:%d", vowels);
    printf("\nConsonants:%d", consonant);
    
    printf("\nWhite Spaces:%d", space);
 	printf("\nDigits:%d", digit);
  	printf("\nSymbols:%d",symbol);
    return 0;
}