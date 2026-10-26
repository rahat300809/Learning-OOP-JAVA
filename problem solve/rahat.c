#include <stdio.h>

int main() {
  
    long int x,i,temp=1,fact,sfact=1;    //clt+alt+n
    printf("enter a number\n");

    scanf("%ld",&x);
    fact = x;
    long int outer;
    for(outer = 1;outer <= x;outer++){
      fact =1;
    for(i=outer;i>1;i--){
      //temp = i-1;
      fact = i*fact;
        
    }
    sfact = fact*sfact;
  }
    printf("%ld\n",sfact);
  
  
    return 0;
}