#include <stdio.h>

//---- 배열 ----
// 1. 정의: 일정한 간격을 두고 붙여 놓은 것
// 2. 특정 자료형형을 가진 변수를 여러 개 선언하는 개념
// 3. 배열 선언 원형: 자료형 배열명[공간의 개수];
// 4. 배열의 각 공간을 나타내주는 숫자를 보고 index(인덱스)라고 한다.
// 5. 인덱스는 0 ~ (선언한 공간의 개수 - 1)까지 갖고 있다. 그 이유는 인덱스는 0부터 시작하기 때문이다.
// 6. 배열을 사용할 때는 반복문을 적절하게 같이 사용해줘야한다.
// 7. 배열을 초기화 할 때는 { }(중괄호)를 같이 사용한다.
// ex) int arr[5] = { 3, 1, 4, 6, 8 };
// 8. 모든 공간을 한번에 0으로 초기화할 때는 괄호안에 0,을 작성해준다.
// ex) int arr[100] = { 0, }

//---- 2차원 배열 ----
// 1. 정의: 1차원 배열을 다시 배열로 만드는 개념
// 2. 2차원 배열 선언 원형: 자료형 배열명[행 크기][열 크기];
// 3. 2차원 배열을 초기화 할 때는 { }(중괄호)와 개행을 적절히 사용해준다.
// ex) int arr[3][3] = {
// {1 ,2, 3}
// {4, 5, 6}
// {7, 8, 9} };
// 4. 2차원 배열을 사용하고 접근할 때는 보통 이중 반복문을 이용해서 접근한다.
//


int main()
{
/*
int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;

printf("입력: ");
scanf("%d %d %d %d %d %d %d %d %d %d", &n1, &n2, &n3, &n4, &n5, &n6, &n7, &n8, &n9, &n10);
printf("출력: %d %d %d %d %d %d %d %d %d %d", n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
*/

/*
int arr[10];
arr[0] = 10;
arr[9] = 20;

printf("출력: %d %d\n", arr[0], arr[9]);
*/

/*
int arr[10];

printf("입력: ");
for (int i = 0; i < 10; i++)
scanf("%d", &arr[i]);

printf("출력: ");
for (int i = 0; i < 10; i++)
printf("%d ", arr[i]);
*/

/*
int arr[5] = { 0, }; //데이터 값 모두 0으로 초기화

printf("출력: ");
for (int i = 0; i < 5; i++)
{
printf("%d", arr[i]);
}
*/

/*
int arr[10];

printf("입력: ");
for (int i = 0; i < 10; i++)
{
scanf("%d", &arr[i]);
}

printf("출력: \n");
for (int i = 0; i < 10; i++)
{
printf("arr[%d]: %d\n", i, arr[i]);
}
*/

int arr[3][3] = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9} };

printf("출력: \n");
for (int i = 0; i < 3; i++)
{
for (int j = 0; j < 3; j++)
{
printf("%d ", arr[i][j]);
}
printf("\n");
}
/*
printf("%d ", arr[0][0]);
printf("%d ", arr[0][1]);
printf("%d ", arr[0][2]);
printf("\n");

printf("%d", arr[1][0]);
printf("%d", arr[1][1]);
printf("%d", arr[1][2]);
printf("\n");

printf("%d", arr[2][0]);
printf("%d", arr[2][1]);
printf("%d", arr[2][2]);
printf("\n");
*/




return 0;
}