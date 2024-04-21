#include <stdio.h>

//---- C언어에서 데이터를 표기하는 방법 ----
// 문자: '(작은 따옴표)로 감싸준다. 문자는 반드시 단 한개만 존재해야 된다.
// 문자열: "(큰 따옴표)로 감싸준다.
// 정수: 숫자 그대로 작성한다.
// 실수: 숫자 뒤에 소수점 자리까지 작성한다.

//---- 서식 지정자 ----
// %c: Character, 하나의 문자
// %s: String, 문자열
// %d: Decimal, 10진수 정수
// %f: Float, 실수
// %o: Octal, 8진수 정수
// %x: Hexadecimal, 16진수 정수
// %p: Pointer, 주소
// %u: Unsigned, 부호가 없는 10진수 정수
// %%: 퍼센트 출력
//
// 서식 지정자에서 소수점 자릿수를 지정해주는 방법: %와 f사이에  .출력할 소수점 자릿수  를 작성해준다.
// ex) %.2f -> 소수점 두 번째 자리까지 출력
// 서식 지정자에서 오른쪽 정렬을 진행하는 방법: %와 d사이에 확보할 공간의 개수를 작성한다.
// ex) %3d -> 3개의 공간을 확보하고 해당 공간에서 오른쪽 정렬 진행
// 서식 지정자에서 왼쪽 정렬을 진행하는 방법: %와 d사이에 확보할 공간의 개수를 작성하고 그 앞에 -를 붙여준다.
// ex) %-3d -> 3개의 공간을 확보하고 해당 공간에서 왼쪽 정렬 진행
// 서식 지정자에서 오른쪽 정렬을 진행하고 남은 공간에 0을 채우는 방법:
// %와 d사이에 확보할 공간의 개수를 작성하고 그 앞에 0을 붙여준다.
// ex) %03d -> 3개의 공간을 확보하고 해당 공간에서 오른쪽 정렬을 진행 후 남은 공간에 0을 채워준다.

//---- 제어 문자 ----
// \": "(큰 따옴표) 출력
// \': '(작은 따옴표) 출력

//---- 변 수 ----
// 값이 변하는 수
// 메모리 공간을 할당 받고 해당 공간을 변수 이름으로 접근해 사용하는 개념
// 변수 선언 원형: 자료형 변수명;
// 한 개의 변수에는 반드시 한 개의 데이터만 저장될 수 있다.
// 변수는 같은 이름을 사용할 수 없다.
// 변수를 선언하면 기존의 공간에 존재하는 데이터가 있는데
// 우리는 이 데이터를 보고 쓰레기 값 이라고 부른다.
// 쓰레기 값을 원하는 값으로 바꿀 수 있는데 이 과정을 초기화라고 부른다.

//---- 변수 이름 선언 규칙 ----
// 변수의 이름은 영문자(대소문자), 숫자, 언더스코어(_)로만 구성된다.
// 변수의 이름은 숫자로 시작할 수 없다.
// 변수의 이름 사이에는 공백을 포함할 수 없다.
// 변수의 이름은 미리 정의된 키워드는 사용할 수 없다.

//---- 자료형 ----
// 변수를 선언할 때 변수 공간을 사용할 데이터 타입을 지정해준다.
// 문자형
//  char: 1byte, -128 ~ 127
// 정수형
//  short: 2byte, -32768 ~ 32767
//  int: 4byte, -2,147,483,648 ~ 2,147,483,647
//  long: 4byte, -2,147,483,648 ~ 2,147,483,647
//  long long: 8byte, 매우 크다.
// 실수형
//  float: 4byte, 소수점 6번째 자리까지 정확하게 표기
//  double: 8byte, 소수점 15번째 자리까지 정확하게 표기

int main()
{
/*printf("%c\n", 'C');
printf("%s\n", "ABCD");
printf("%d\n", 1218);
printf("%.3f\n", 73.2354);*/

/*//printf("%d %d\n", 'A', 'F');

//printf("%010d %d\n", 10, 20);*/

/*//printf("%%c");

//printf("\'Hello\'");*/

/*printf("이름: %s\n", "홍길동");
printf("나이: %d\n", 30);
printf("주소: %s\n", "서울특별시 종로구 묘동 단성사");
printf("키: %.1fcm\t몸무게: %.2fkg\n", 183.2, 70.53);*/

/*printf("%%c를 이용한 출력: \'%c\'\n", 'C');
printf("%%s를 이용한 출력: \"%s\"\n", "Hello");
printf("%%d를 이용한 출력: %d\n", 4315);
printf("%%f를 이용한 출력: %.3f\n", 73.235);*/

/*int num;
int num;

num = 5;

printf("num의 값: %d\n", num);

num = 10;

printf("num의 값: %d\n", num);*/

/*int int;

int = 10;*/

return 0;
}