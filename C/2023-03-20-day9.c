#include <stdio.h>

//---- 반복문 ----
// 1. 개념: 프로그램에서 특정 코드를 일정 횟수만큼 반복시키는 문법
// 2. 종류: for(), while(), do ~ while() 3가지가 존재
//
// 3. for문의 기본 원형
// for (초기식; 조건식; 변화식)
// {
// 종속문장;
// }
//
// 4. 진행순서: 초기식 -> 조건식 -> 종속 문장 -> 변화식 -> 조건식 -> 종속 문장 -> 변화식 -> ... 순
// 5. 초기식에서 변수 선언과 동식에 초기화가 요즘 방식임
// 6. for()문에서 무한 루프를 사용하고 싶을 때는 초기식, 조건식, 변화식을 생략하면 된다.
// ex) for(;;)
// 7. for()문에서 종속문자잉 한 줄 일때는 {}(중괄호)를 생략할 수 있다.
//
// ---- 기타 키워드 ----
// 1. break; 해당 키워드를 만나게 되면 반복문을 탈출
// 2. continue: 해당 키워드를 만나게 되면 continue보다 아래 있는 종속 문장은 실행하지 않고 진행한다.
//

int main()
{
/*
for (int i = 0; i < 10 ; i++)
{
if (i == 5)
{
//break;
continue;
}

printf("Hello World! i = %d\n", i);
}
*/


//예제 1)
/*
for (int a = 65; a < 91; a++)
{
printf("%c ", a);
}
printf("\n");

for (char i = 'A'; i <= 'Z'; i++)
{
printf("%c", i);
}
*/
/*예제 2)
char end;

printf("입력: ");
scanf("%c", &end);

for (int start = 97; start <= end; start++)
{
printf("%c ", start);
}
*/


//예제 3)
/*
for (int num=1; num < 10; num++)
{
printf("입력: ");
scanf("%d", &num);


printf("출력: %d\n\n", num);

if (num == 9)
printf("9가 입력되어 프로그램을 종료합니다");
}
*/

/*이중포문
for (int i = 0; i < 5; i++)
{
for (int j = 0; j < 5; j++)
{
printf("i: %d; j: %d ", i, j);

}
printf("\n");
}

*/

/*
//예제1
for (int i = 0; i < 5; i++)
{
for (int j = 0; j < 5; j++)
{
printf("*");
}
printf("\n");
}

//예제2
for (int a = 0; a < 5; a++)
{
for (int b = 1; b <= a; b++)
{
printf(" ");

}

for (int s = 0; s < 2; s++)
{
printf("*");
}
printf("\n");

}

//예제3
for (int c = 0; c < 5; c++)
{
for (int d = 4; d > c; d--)
{
printf(" ");
}

for (int e = 0; e < c * 2 + 1; e++)
{
printf("*");
}
printf("\n");
}

//예제4
for (int f = 0; f < 5; f++)
{
for (int g = 0; g < f; g++)
{
printf(" ");
}

for (int h = 10; h > f * 2 + 1; h--)
{
printf("*");
}
printf("\n");
}

*/

// 추가 예제1)
for (int i = 1; i < 6; i++)
{
if (i = 1, 9)
{
for (int j = 0; j < 9; j++)
printf("*");
printf("\n");
}
else if (i = 2, 3, 4, 5)
{
printf("*");
for (int j = 0; j < (i - 2); j++)
printf(" ");
printf("*");

for (int k = 6; k > (i - 2) * +1; k--)
printf(" ");

printf("*");
for (int j = 0; j < (i - 2); j++)
printf(" ");
printf("*");
}
else if (i = 6, 7, 8)
{
printf("*");
for (int j = 0; j < (i - 2); j++)
printf(" ");
printf("*");
}
}

return 0;
}