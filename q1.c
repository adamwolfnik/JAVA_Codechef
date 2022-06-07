#include <stdio.h>
int main(){
int r,m1,m2,m3; //input variables
scanf("%d %d %d %d",&r,&m1,&m2,&m3);
int c1=0,c2=0,c3=0; //counter for each machine

//number of pays to refund - only required for 0th case
int t1=25-m1; //rolls left after the last state of machine to reach refund
int t2=120-m2;
int t3=12-m3;

int n1=0,n2=0,n3=0; //after 0th case n1 takes over

while(r>0){
c1++; //m1 transaction
if(n1==0/*0th case*/ && c1==t1 /*rolls reached*/){
r+=20; // refund
r--; //for that round
n1=t1+25; /*n1 takes over t1 -> 25 is added to t1 and saved in n1 - this will be the target when
the machine will again give refund*/
}
else if(c1==n1)/* next target reached when refund will be given*/{
n1+=25; // target incremented
r+=20; //refund
r--; // for the round
}
else{ //other cases when he just loses the rubles
r--;
if(r==0) // if the rubles are depleated he goes broke and he cant play any further
break;
}

c2++;
if(n2==0 && c2==t2){
r+=80;
r--;
n2=t2+120;
}
else if(c2==n2){
n2+=120;
r+=80;
r--;
}
else{
r--;
if(r==0)
break;
}

c3++;
if(c3==t3 && n3==0){
r+=8;
r--;
n3=t3+12;
}
else if(c3==n3){
n3+=12;
r+=8;
r--;
}
else{
r--;
if(r==0)
break;
}
}
printf("Peter plays %d times before broke",c1+c2+c3);
return 0;
}