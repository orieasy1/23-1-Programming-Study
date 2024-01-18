#include <stdio.h>
//---- 조건문 ----
// 1. switch ~ case의 원형
// switch (비교할 값)
// {
// case 해당값; // 각 조건
// 종속문장;
// break;
//
// default: // 나머지
// 종속문장;
// break;
// }
//
// 2. switch ~ case문에서 break 키워드는 해당 문법을 탈출하는 용도로 사용됩니다.
// 3. switch ~ case문에서 break 키워드는 필수가 아니다. 일부로 작성하지 않는 경우도 있음
// 4. switch ~ case문에서 비교할 값의 공간에는 정수, 정수로 변환할 수 있는 값, 정수가 저장되는 변수만 작성할 수 있다
// 5. 각 case에 작성되는 값을 반드시
//

int main()
{
/*
double num;
printf("입력: ");
scanf("%d", &num);

switch (num)
{
case 1:
printf("num은 1입니다.\n");
break;

case 2:
printf("num은 2입니다.\n");
break;

case 3:
printf("num은 3입니다.\n");
break;

default 4:
printf("1~3 중 하나를 입력해주세요.\n");
break;

}

switch (num)
{
case 4:
printf("4.\n");

case 3:
printf("3\n");

case 2:
printf("2\n");
break;

case 1:
printf("1\n");

case 0:

}
*/

/* 초기답
int num1, num2;

printf("입력: ");
scanf("%d", &num1);


switch (num1 /= 14)
{
case 0:
printf("14보다 작은 수\n");
break;
default:
printf("14보다 크거나 같은 수\n");
break;
}


printf("입력: ");
scanf("%d", &num2);

switch (num2 %= 3)
{
case 0:
printf("참\n");
break;
default:
printf("거짓\n");
break;
}
*/

/*수정답안
int num1, num2;

printf("입력: ");
scanf("%d", &num1);


switch (num1 >= 14)
{
case 0:
printf("14보다 작은 수\n");
break;
case 1:
printf("14보다 크거나 같은 수\n");
break;
}


printf("입력: ");
scanf("%d", &num2);

switch (num2 % 3)
{
case 0:
printf("참\n");
break;
case 1:
printf("거짓\n");
break;
case 2:
printf("거짓\n");
break;

}
*/

int kor, mat, eng;
double avg;

printf("국어 성적 입력: ");
scanf("%d", &kor);

printf("수학 성적 입력: ");
scanf("%d", &mat);

printf("영어 성적 입력: ");
scanf("%d", &eng);

avg = (kor + mat + eng) / 3.0;

printf("평균: %.2f\n", avg);
switch ((int) avg/10)
{
case 10:
case 9:
printf("등급: A\n");
break;
case 8:
printf("등급: B\n");
break;
case 7:
printf("등급: C\n");
break;
case 6:
printf("등급: D\n");
break;
default:
printf("등급: F\n");
}


return 0;
}
