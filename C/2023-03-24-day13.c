#include <stdio.h>
#include <windows.h>

//---- 문자열 입력받는 방법 ----
// scanf()함수를 통해 문자열을 입력받을 때는 배열이름 앞에 &나 배열 뒤에 인덱스를 작성하지 않는다.
// 문자열의 끝에는 항상 문자열의 끝을 알려주는 NULL문자가 존재한다.
// 문자열을 배열에 저장할 때는 반드시 NULL문자의 크기까지 고려해줘야 한다.
// NULL문자를 표기할 때는 정수 0, 문자 '\0', NULL 키워드로 표기할 수 있다.
// 배열을 문자열로 초기화 할 때는 초기화 할 문자열을 ""(큰 따옴표)로 감싸주면 된다.
// ex) char str[6] = "Hello";
// 모든 공간을 NULL로 초기화 할 때는 ""(큰 따옴표)만 작성하면 된다.
// ex) char str[10] = "";

int main()
{
/*char str[5];

printf("입력: ");
for (int i = 0; i < 5; i++)
{
scanf("%c", &str[i]);
}

printf("출력: ");
for (int i = 0; i < 5; i++)
{
printf("%c", str[i]);
}*/

/*char str[6];

printf("입력: ");
scanf("%s", str);

str[2] = NULL;

printf("출력: %s\n", str);*/

/*char str[6] = "Hello";

printf("출력: %s\n", str);*/

/*
char str[10] = "";

printf("입력: ");
scanf("%s", str);

str[5] = 'a';

printf("출력: %s\n", str);
*/

char name[10];
char address[10];
int age;
double height, weight;

printf("이름 입력: ");
scanf("%s", name);

printf("나이 입력: ");
scanf("%d", &age);

printf("주소 입력: ");
scanf("%s", address);

printf("키 입력: ");
scanf("%lf", &height);

printf("몸무게 입력: ");
scanf("%lf", &weight);


system("cls");

printf("출력\n-----------------------------------------------\n");
printf("이름: %s\n", name);
printf("나이: %d\n", age);
printf("주소: %s\n", address);
printf("키: %.1f \t몸무게:%.2f", height, weight);




return 0;
}
