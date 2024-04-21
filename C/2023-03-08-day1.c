#include <stdio.h> // stido.h 헤더파일을 포함시켜주는 코드
                   // stido.h: 기본 입출력을 가능하게 만들어주는 헤더파일

//---- 주  석 ----
//코드에 대한 추가적인 코멘트를 작성할 때 사용
//기본적으로 //(슬래시 두개를 사용해서 주석을 작성)
//프로그램을 실행하는데 영향을 끼치지 않는 부분
// 한번에 여러줄을 주석처리하고 싶을 때는 /*로 주석을 열고*/로 주석을 닫을 수 있다.

//---- C언어의 특성 ----
// 1. C언어에서 작성되는 코드는 ;(세미 콜론)으로 끝나야한다.
// 2. C언어는 대소문자를 구별한다.
// 3. C언어는 자유 형식(free-format)을 허용한다.
// 4. C언어는 절차지향적 언어이다.

//---- 제어 문자 ----
// 정의: 출력 결과를 제어해주는 문자
// 1. \n: New line 개행: 커서를 다음줄로 옮김
// 2. \t: Tab 탭: 탭만큼 공간을 띄워주는 역할
// 3. \r: Carriage return: 커서를 문자열의 처음으로 옮김
// 4. \b: Back space: 커서 바로 이전의 문자 한개를 지워줌
// 5. \a: Alert: 경고음을 한번 발생


int main() //주된 코드의 영역을 알려주는 코드
//main은 반드시 단 한 개만 존재해야한다.
{ /*"(큰 따옴표)"안에 작성된 문자열을 출력해주는 코드
printf("Hello \nworld!\n"); //Hello
//world!
printf("Hello \tworld!\n"); //Hello world!
printf("Hello \rworld!\n"); //world!Hello
printf("Hello \bworld!\n"); //Helloworld! : 공백 또한 문자로 취급
*/

printf("웃음: (*^o^*) \n");
printf("사랑: (♥.♥) \n");
printf("슬픔: (ㅠ.ㅠ) \n");
printf("화남: (-_-^)\n\n");

printf("이름: 홍길동\n");
printf("나이: 30 \n");
printf("주소: 서울특별시 종로구 묘동 단성사 \n");
printf("키: 183.2cm \t몸무게: 70.53kg\n");
return 0; // 값을 반환해주는 코드
}