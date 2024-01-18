#include <stdio.h>

//---- 변수 종류 ----
// 지역 변수: '블록' 내부에서 선언된 변수로, 블록 내부에서만 유효하고 블록이 끝나면 해체
// 전역 변수: 함수 외부에서 선언된 변수로 프로그램이 종료될 때 헤제
// 정적 변수: 지역변수와 전역 변수의 특성을 둘 다 갖고 있음

void Func()
{
printf("num의 값: %d\n", num);

}

int main()
{
/*
int num = 5; //중괄호 안에서만 유효한 지역변수
int num2 = 7;

{
int num = 3;

printf("num의 값: %d\n", num); //블록으로 지역이 구분되면 이름이 겹쳐도 정상적으로 진행됨
printf("num2의 값: %d\n", num2); //크게 보면 바깥쪽 지역에 안쪽 지역이 포함되어있는 형태이므로 실행이 된다.

// 지역 변수는 우선순위가 존재하는데 안쪽 블록에서는 안쪽에서 선언된 num이 바깥쪽 블록에서 선언된 num보다 우선순위가 높기 때문에 정상적으로 진행되는 것
}

*/

int num = 3;

printf("num의 값: %d\n", num); //지역 변수에 접근
Func(); //전역 변수에 접근
//지역변수의 우선수위가 전역변수보다 높다

return 0;
}
