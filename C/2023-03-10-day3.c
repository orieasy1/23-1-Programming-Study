#include <stdio.h>
//---- 입 력 ----
// 1. scanf()함수를 사용해서 입력을 받는다.
// 2. scanf("입력 받을 데이터의 서식 지정", 입력값을 저장할 변수의 주소);
// 3. 입력 받을 데이터의 서식을 지정할 때는 서식지정자를 사용하면 되고
//  입력 값을 저장할 변수의 주소를 표기해줄 때는 변수명 앞에 &(엠퍼샌드)를 붙여주면 된다.
// ex) scanf("%d", &num);
// 4. scanf()함수를 사용할 때 ""(큰 따옴표)안에는 서식 지정자를 제외한 문자열은 작성하지 않는다.
// 5. 예외로 ""(큰따옴표)안에 문자는 작성되는 경우가 있는데 이때는 해당문자로 입력 값을 구분할 때 사용한다.
// 6. scanf()를 사용해 double 자료형을 가진 변수에 입력 값을 저장할 때는 서식 지정자 %lf를 사용해줘야한다.

int main()
{
/*
int num;
printf("입력: ");
scanf("%d", &num);
printf("출력: %d\n", num);
*/

/*
int num1, num2;

printf("입력: ");
scanf("%d %d", &num1, &num2);

printf("출력: %d %d\n", num1, num2);
*/

/*
char ch;
printf("입력: ");
scanf("%d", &ch);

printf("출력: %d\n",ch);
*/

/*
double fnum;

printf("입력: ");
scanf("%lf", &fnum);

prinf("출력: %f\n", fnum);
*/


char A, B;

printf("입력: ");
scanf("%c %c", &A, &B);

printf("출력: %c %c\n", B, A);



int year, month, day;
printf("입력: ");
scanf("%d-%d-%d", &year, &month, &day);

printf("%d년 %02d월 %02d일\n", year, month, day);




int n1, n2, n3, n4, n5, n6, n7, n8;

printf("입력: ");
scanf("%d %d %d %d %d %d %d %d", &n1, &n2, &n3, &n4, &n5, &n6, &n7, &n8);

printf("%c%c%c%c%c%c%c%c", n1, n2, n3, n4, n5, n6, n7, n8);

return 0;
}
