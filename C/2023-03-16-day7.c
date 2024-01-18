#include <stdio.h>

//---- 상향 연산자 ----
// 1. 다른 연산자들과는 다르게 피연산자가 3개이다.
// 2. 상향 연산자의 원형: 조건식? 참일 때의 반환 값 : 거짓일 때의 반환 값

//---- sizeof 연산자 ----
// 1. 개념: 넘겨준 값의 자료형의 크기를 구해주는 연산자
// 2. sizeof 연산자의 원형: sizeof(크기를 구해줄 값)

//---- 조건문 ----
// 1. 조건식을 비교하고 해당 조건식이 참이면 종속 문장을 실행, 거짓이면 탈출
// 2. 종류: if ~ else, switch ~ case 두 개가 존재
// 3. if else의 원형
// if (조건식)
// {
// 종속 문장
// }
//
// else if (조건식)
// {
// 종속 문장
// }
//
// else
// {
// 종속문장
// }
// 4. if else문에서 조건식 뒤에 ;(세미 콜론)을 작성하면 종속문장을 가질 수 없게 된다.
// 5. if else문에서 종속 문장이 한 줄 일때는{}(중괄호)를 생략할 수 있다.

int main()
{
//printf("연산 결과: %d\n", 3 != 5 ? 1 : 0);

/*
int n1;
printf("입력: ");
scanf("%d", &n1);
printf("%s\n", n1 >= 14 ? "14보다 크거나 같은 수" : "14보다 작은 수");
*/

/*
int n2;
scanf("%d", &n2);
printf("%s\n", n2 % 3 ? "거짓" : "참");
*/

/*printf("크기: %d\n", sizeof(17));*/

/*
int num;
printf("입력: ");
scanf("%d", &num);

if (num > 10)
{
printf("num은 10보다 큽니다.\n");
}

else if (num > 5)
{
printf("num은 5보다 큽니다.\n");
}
else
{
printf("num은 5보다 작거나 같습니다.\n");
}
*/

/*
int num;

printf("입력: ");
scanf("%d", &num);

if (num == 5)
{
printf("num은 5입니다");
}
*/

/*
int n1;
printf("입력: ");
scanf("%d", &n1);

if (n1 >= 14)
{
printf("14보다 크거나 같은 수\n");
}
else
{
printf("14보다 작은수\n");
}

int n2;
printf("입력: ");
scanf("%d", &n2);

n2 %= 3;

if (n2 % 3)
{
printf("\거짓\n");
}

else
{
printf("거짓]\n");
}
*/

int k, m, e;

printf("국어 점수 입력: ");
scanf("%d", &k);

printf("수학 점수 입력: ");
scanf("%d", &m);

printf("영어 점수 입력: ");
scanf("%d", &e);


double t = (double)(k + m + e) / 3;
printf("평균: %.2f\n", t);


if (t >= 90)
{
printf("등급: A");
}
else if (t >= 80)
{
printf("등급: B");
}
else if (t >= 70)
{
printf("등급: C");
}
else if (t >= 60)
{
printf("등급: D");
}
else
{
printf("등급: F");
}


return 0;
}