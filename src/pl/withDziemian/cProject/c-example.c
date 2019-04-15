#include <stdio.h>
int main()
{

	char xArray[9][9];
	for (int i = 0; i < 10; ++i){
		int j;
		xArray[i][j] = 'X';
			
			for (j; i < 10; ++j){
			xArray[i][j] = 'X';
			}
	}
   return 0;
}