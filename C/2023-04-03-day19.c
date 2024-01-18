#include <stdio.h>
//---- 포인터와 배열의 관계 ----
// 1. 포인터와 배영을 상당히 밀접한 관계를 갖고 있으나 분명한 차이점이 있다.
// 2. 배열을 선언하게 되면 기본적으로 배열 자기자신의 주소를 갖고 있다.
// 3. 포인터와 배열은 둘 다 주소를 가지고 연산을 진행하기 때문에 포인터를 배열처럼 인덱스를 통해 접근할 수 있다
// 4. 배열은 자기 자신의 공간을 사용하고, 포인터는 다른 누군가의 공간을 빌려서 사용한다.

//---- 동적 할당 ----
// 프로그램 중간에 메모리 공간의 크기를 지정해서 할당 받고 그 공간을 사용 후 원하는 시점에서 해제하는 방식
// 메모리 공간을 할당 받을 때는 malloc()함수를 사용해서 할당 받을 수 있다.
// 이때 반드시 stdlib.h 헤더 파일을 선언해야한다.
// malloc()함수의 원형 주소를 저장할 변수 = malloc의 크기
// 동적 할당을 통해서 할당 받은 메모리 공간은 Heap 영역에 해당한다.
// 동적 할당 받은 메모리 공간을 해제할 때는 free(해제할 공간의 주소);  형식으로 해제할 수 있다.
// 한 번의 동적할당에는 반드시 한 번의 동적해제가 진행되어야한다.
// malloc()함수에서 크기를 넘겨줄 때는 기본적으로 sizeof()연산자를 이용해서 넘겨준다.
//
//저장할 공간의 자료형* 변수명;
//주소를 저장할 변수 = (저장할 변수의 자료형) malloc(zmrl);


int main()
{
/*printf("str의 주소: %p\n", &str);
printf("str의 값: %p\n", str);

printf("입력: ");
scanf("%s", str);

printf("출력: %s");
char str[10];
*/

/*
char str1[10] = "Hello";
char str2[10] = "Abcde";

//printf("str1: %s\n", str);
printf("str1: %c%c%c%c\n", str1[0], str1[1], str1[2], str1[3], str1[4]);
printf("str2: %c%c%c%c\n", str2[0], str2[1], str2[2], str2[3], str2[4]);
*/

/*
int* ptr;

ptr = (int*)malloc(4);

*ptr = 10;

printf("출력: %d\n", *ptr);
*/

/*
저장할 공간의 자료형* 변수명;
주소를 저장할 변수 = (저장할 변수의 자료형) malloc(8);
int* ptr;
ptr = (int*)malloc(8);
//ptr = (int*)malloc(size0f(int) * 34);

ptr[0] = 10;
ptr[2] = 20;

printf("cnffur: %d %d\n", ptr[0], ptr[1]);

free(ptr);
*/

int i;
char* ptr;

printf("영단어 길이 입력: ");
scanf("%d", &i);


ptr = (char*)malloc(sizeof(char) * (i+1));

printf("영단어 입력: ");
scanf("%s", ptr);

printf("영단어 출력: ");
while (i > 0)
{
printf("%c", ptr[i-1]);
i--;
}

free(ptr);
