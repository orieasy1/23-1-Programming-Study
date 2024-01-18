#include <stdio.h>
//---- 구조체 ----
// 1. 여러 개의 멤버들을 모아서 하나의 새로운 자료형을 만드는 개념
// 2. 구조체 변수의 멤버에 접근할 때는  구조체변수.멤버  형식으로 접근한다.
// ex) struct Data d;
// d.data1 = 10;
// 3. 구조체의 크기는 구조체 멤버들을 모두 더한 크기이다.
// 4. 기본 구조체의 정의 원형:
//
// struct 구조체 이름{
// 멤버;
// };


/*기본구조체
struct Data {
int data1;
int data2; //총 8바이트
int data3; //총 12바이트
};
*/

// 별칭 구조체 정의
// 별칭 구조체를 사용하면 구조체 이름, 별칭 모두 사용 가능
// 이름이 두 개라는 점이 번거롭긴함
/*
typedef struct {
int data1;
int data2;
}Da;
*/

// 익명 구조체 정의
// 익명 구조체를 사용하면 구조체 이름으로 변수 선언 불가, 별칭만 사용가능
/*
typedef struct{
int data1;
int data2;
}Da;
*/
/*
struct subject {
int kor;
int mat;
int eng;
int* Total;
double* avg;
char* grade;
};

int Total(int a, int b, int c, int* d)
{
*d = a + b + c;
return d;
}

double Avg(int a, double* b)
{
*b = a / 3.0;
}

void Grade(double a, char b)
{
switch ((int)a / 10)
{
case 10:
case 9:
*b = 'A';
break;
case 8:
*b = 'B';
break;
case 7:
*b = 'C';
break;
case 6:
*b = 'D';
break;
default:
*b = 'F';
break;
}
}


int main()
{
/*
struct Data d;
Da d2;

d.data1 = 10;
d.data2 = 20;

printf("출력: %d %d\n", d.data1, d.data2);
printf("d의 크기: %d\n", sizeof(d));


struct subject sub;

printf("성적을 입력하세요. ");
scanf("%d %d %d", &sub.kor, &sub.mat, &sub.eng);

Total(sub.kor, sub.mat, sub.eng, sub.Total);
printf("총합: %d\n", sub.Total);

Avg(sub.kor, sub.mat, sub.eng, sub.avg);
printf("평균: %.2f\n", sub.avg);

Grade(sub.avg, sub.grade);
printf("등급: %c", sub.grade);


return 0;
}
*/


//정답

typedef struct {
int kor, mat, eng, total;
double avg;
char grade;
}Student;

int Total(int kor, int mat, int eng, int* total)
{
*total = kor + mat + eng;
}
void Avg(int total, double* avg)
{
*avg = total / 3.0;
}
void Grade(int avg, char* grade)
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
Student st;
printf("국어 수학 영어 성적 입력: ");
scanf("%d %d %d", &st.kor, &st.mat, &st.eng);

Total(st.kor, st.mat, st.eng, &st.total);
Avg(st.total, &st.avg);
Grade(st.avg, &st.grade);

printf("총합: %d\n", st.total);
printf("평균: %.2f\n", st.avg);
printf("등급: %c\n", st.grade);
}
