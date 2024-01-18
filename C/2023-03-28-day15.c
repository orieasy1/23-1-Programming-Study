#include <stdio.h>

//int Add(int n1, int n2)
//{
// return n1 + n2;
//}
//
//void Add2(int n1, int n2)
//{
// printf("연산 결과: %d\n", n1 + n2);
//}
//int와 void의 차이점에 대해 공부할 필요가 있다

void Add(int n1, int n2)
{
printf("더한 값: %d\n", n1 + n2);
}

void Sub(int n1, int n2)
{
printf("뺀 값: %d\n", n1 - n2);
}

int Mul(int n1, int n2)
{
return n1 * n2;
}

int Div(int n1, int n2)
{
return n1 / n2;
}
void Calc(int num1, char oper, int num2)
{
switch (oper)
{
case '+':
Add(num1, num2);
break;
case '-':
Sub(num1, num2);
break;
case '*':
printf("곱한 값: %d\n", Mul(num1, num2));
break;
case '/':
printf("나눈 값: %d\n", Div(num1, num2));

}
}
int Total(int n1, int n2, int n3)
{
return n1 + n2 + n3;
}
double Avg(int n1, int n2, int n3)
{
return (n1 + n2 + n3) / 3.0;
}
char Grade(double n4)
{
//case1
if (n4 < 60)
{
return 'F';
}
else if (n4 < 70)
{
return 'D';
}
else if (n4 < 80)
{
return 'C';
}
else if (n4 < 90)
{
return 'B';
}
else
{
return 'A';
}

//case2
switch ((int)n4 / 10)
{
case 10:
case 9:
return 'A';
break;
case 8:
return 'B';
break;
case 7:
return 'C';
break;
case 6:
return 'D';
break;
default:
return 'F';
break;

}
}


int main()
{
/*int result;

result = Add(10, 14);

printf("연산 결과: %d\n", result);*/

//Add2(8, 25);

/* int num1, num2;
printf("두 수 입력: ");
scanf("%d %d", &num1, &num2);

Add(num1, num2);
Sub(num1, num2);
printf("곱한 값: %d\n", Mul(num1, num2));
printf("나눈 값: %d\n", Div(num1, num2));
*/

/*나의 똥망한 예제 추측
int n1, n2, n3, n4, n5, n6, n7, n8;

printf("연산 입력: ");
scanf("%d + %d", &n1, &n2);

printf(" \t\t연산 입력: ");
scanf("%d * %d", &n3, &n4);

Add(n1, n2);
printf("곱한 값: %d\n", Mul(n3, n4));

printf("-------------------------------------");

printf("연산 입력: ");
scanf("%d + %d", &n5, &n6);

printf("\t\t연산 입력: ");
scanf("%d * %d", &n7, &n8);

Sub(n5, n6);
printf("나눈 값: %d\n", Div(n7, n8));
*/
int num1, num2;
char oper;

printf("연산 입력: ");
scanf("%d %c %d", &num1, &oper, &num2);

/*
switch (oper)
{
case '+':
Add(num1, num2);
break;
case '-':
Sub(num1, num2);
break;
case '*':
printf("곱한 값: %d\n", Mul(num1, num2));
break;
case '/':
printf("나눈 값: %d\n", Div(num1, num2));

}
*/
Calc(num1, oper, num2);


int kor, mat, eng, total;
double avg;
char grade;

printf("국어, 수학, 영어 성적 입력: ");
scanf("%d %d %d", &kor, &mat, &eng);

total = Total(kor, mat, eng);
printf("총합: %d\n", total);

avg = Avg(kor, mat, eng);
printf("평균: %.2f\n", avg);

grade = Grade(avg);
printf("등급: %c", grade);

return 0;
}