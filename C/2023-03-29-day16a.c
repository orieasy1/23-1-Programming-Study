#include <stdio.h>

//---- 변수의 선언 범위 ----
// 지역 변수: 지역 내부에 새로운 지역에서 같은 이름의 변수가 선언되면
// 외부에 있는 변수보다 내부에 있는 변수가 더 높은 우선순위를 갖게 된다.
// 전역 변수: 전역 변수는 별도의 초기화를 진행하지 않으면 0으로 초기화 된다.
// 전역 변수와 지역 변수가 이름이 같다면 해당 지역에 선언된
// 지역 변수가 더 높은 우선순위를 갖게 된다.
// 정적 변수: 지역 변수와 전역 변수의 특성을 둘 다 갖고 있다.
// 전역 변수의 특성인 프로그램이 종료될 때 공간이 해제된다는 특성을 갖고 있다.
// 지역 변수의 특성인 블록 내부에서만 유효하다는 특성을 갖고 있다.
// 정적 변수 선언 원형: static 자료형 변수명;

void Total(int kor, int mat, int eng, int* total)
{
*total = kor + mat + eng;
}

void Avg(int total, double* avg)
{
*avg = total / 3.0;
}

void Grade(double avg, char* grade)
{
switch ((int)avg / 10)
{
case 10:
case 9:
*grade = 'A';
break;
case 8:
*grade = 'B';
break;
case 7:
*grade = 'C';
break;
case 6:
*grade = 'D';
break;
default:
*grade = 'F';
break;
}
}

int main()
{
int kor, mat, eng, total;
double avg;
char grade;

printf("성적을 입력하세요: ");
scanf("%d %d %d", &kor, &mat, &eng);

Total(kor, mat, eng, &total);
printf("총합: %d\n", total);

Avg(total, &avg);
printf("평균: %.2f\n", avg);

Grade(avg, &grade);
printf("등급: %c\n", grade);


return 0;


}