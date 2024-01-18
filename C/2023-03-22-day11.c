#include <stdio.h>
#include <windows.h>

//---- 기타 함수 ----
// system("명령어"): 콘솔 환경에서 사용되는 명령어를 실행시켜주는 함수
// ex) system("cls"): 콘솔창 초기화
// Sleep(멈춰줄 시간): 콘솔 창을 잠깐 재워주는 함수, 멈춰 준다고 볼 수 있다.
// 시간 단위는 1/1000초이다.
// system 함수를 사용하기 위해서는 windows.h 헤더파일은 선언해줘야 한다.

int main()
{
/*
printf("ABCD\n");

Sleep(5000);

printf("EFGH\n");

*/

/*
int choice;
int monl = 10000;
int monp, monu;

do
{

printf("카드잔액: %d\n", monl);
printf("1. 카드 작액 충전\n");
printf("2. 카드 잔액 사용\n");
printf("3. 종료\n");

printf("\n\n입력: ");
scanf("%d", &choice);

system("cls");

if (choice == 1)
{

printf("카드 잔액: %d\n", monl);

printf("충전 금액 입력: ");
scanf("%d", &monp);

printf("%d원 충전해서 %d원 사용 가능합니다.\n", monp, monl + monp);

monl += monp;

Sleep(1000);
system("cls");
}
else if (choice == 2)
{
system("cls");
printf("카드 잔액: %d\n", monl);

printf("사용 금액 입력: ");
scanf("%d", &monu);

if ((monl - monu) < 0)
{
system("cls");
continue;
}

printf("%d원 사용하고 %d원 남았습니다.\n", monu, monl - monu);

monl -= monu;

Sleep(1000);
system("cls");
}

} while (choice != 3);

printf("시스템이 종료됩니다.");
*/

int choice;
int monl = 10000;
int monp, monu;

do
{

printf("카드잔액: %d\n", monl);
printf("1. 카드 작액 충전\n");
printf("2. 카드 잔액 사용\n");
printf("3. 종료\n");

printf("\n\n입력: ");
scanf("%d", &choice);

system("cls");

switch (choice)
{
case 1:
printf("카드 잔액: %d\n", monl);

printf("충전 금액 입력: ");
scanf("%d", &monp);

printf("%d원 충전해서 %d원 사용 가능합니다.\n", monp, monl + monp);

monl += monp;
Sleep(1000);
system("cls");

break;

case 2:
do
{
system("cls");
printf("카드 잔액: %d\n", monl);

printf("사용 금액 입력: ");
scanf("%d", &monu);

} while (monu > monl);

printf("%d원 사용하고 %d원 남았습니다.\n", monu, monl - monu);
monl -= monu;

Sleep(1000);
system("cls");

break;

case 3:
break;

default:
printf("1~3 중 하나의 숫자를 입력해주세요.");
Sleep(1000);
system("cls");
break;
}



} while (choice != 3);

printf("시스템이 종료됩니다.");

return 0;
}
