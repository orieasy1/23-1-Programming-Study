#include <stdio.h>
//---- 구조체 포인터 ----
// 1. 구조체는 하나의 자료형으로 취급해줄것, 포인터는 우리가 알고 있는 역할 그대로 생각해줄 것
// 2. 구조체 포인터에서 역참조를 진행할 때 기본적으로 ->(애로우 연산자)를 사용한다.
// ->(애로우 연산자)는 *와 .를 합친 것과 같다'
// 3. 기존 사용하던 *를 사용할 수도 있는데 이때는 .(도트 연산자)와 우선순위 문제 때문에()로 묶어준다.
// ex) (*d).data1 == d->data1
//

typedef struct {
int data1;
int data2;

}Data;

/*
void Func(Data d)
{
d.data1 = 11;
d.data2 = 22;
}
*/

void Func(Data* d)
{
(*d).data1 = 11;
d->data2 = 22;
}

typedef struct {
int kor, mat, eng, total;
double avg;
char grade;
}Test;

void Total(Test* t)
{
(*t).total = (*t).kor + (*t).mat + (*t).eng;
}
double Avg(Test* t)
{
(*t).avg = (*t).total / 3.0;
}
void Grade(Test* t)
{
switch ((int)(t->avg) / 3)
{
case 10:
case 9:
t->grade = 'A';
break;
case 8:
t->grade = 'B';
break;
case 7:
t->grade = 'C';
break;
case 6:
t->grade = 'D';
break;
default:
t->grade = 'F';
break;
}
}

typedef struct {
(*d)data1;
data2;
data3;
}Data;
int main()
{
/*
Data d;

d.data1 = 10; //구조체 안 변수에 접근하기 위해서는 .(도트연산자) 사용
d.data2 = 20;

Func(d);
printf("출력 %d %d\n", d.data1, d.data2);

*/

/*

Test t;

printf("국어, 수학, 영어 성적 입력: ");
scanf("%d %d %d", &t.kor, &t.mat, &t.eng);

Total(&t);
printf("총합: %d\n", t.total);

Avg(&t);
printf("평균: %.2f\n", t.avg);

Grade(&t);
printf("등급: %c", t.grade);
*/

Data d;
Data* pd;

pd = &d;

printf("d의 크기: %d\n", sizeof(d));
printf("pd의 킈기: %d\n". sizeof(pd));

printf("pd: %p")


return 0;
} 
