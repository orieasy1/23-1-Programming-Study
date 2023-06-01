<h1>상속과 다형성</h1>

현실에서 상속은 부모가 자식에게 무엇을 물려주는 행위를 말한다. 
객체 지향 프로그래밍에서도 부모 클래스의 멤버를 자식 클래스에게 물려줄 수 있다.
자바 프로그래밍에서도 부모클래스의 멤버를 자식 클래스에게 물려줄 수 있다.
부모 클래스를 상위클래스라고 부르고 자식 클래스를 하위 크래스 또는 파생 클래스라고 부른다.
<br><br>
상속의 장점을 크게 코드의 재사용, 확장성, 다형성으로 정리할 수 있다.
그래서 상속이 코드의 재활용을 위한 문법이라는 오해를 하고는 하는데, 상속은 절대 코드의 재활용을 위한 문법이 아니다.
연관된 인련의 클래스들에 대한 공통적인 규칙을 정의할 수 있는 것이라고 이해해야한다.
A, B, C라는 클래스가 있다고 할 때 클래스가 다른 어떤 규칙을 적용시키기 어렵니다.
기본적으로 A, B, C를 위한 규칙이 서로 다르기 때문이다.
그러나 상속으로 A, B, C를 묶어서 서로 관계를 갖게 하면 서로 동일한 규칙, 규약을 적용할 수 있게 된다.
또 부모 클래스의 수정으로 모든 자식 클래스들도 수정되는 효과를 가져오기 때문에 유지보수시간을 최소화할 수 있다.
<br><br><br>

<h3>클래스 상속</h3>
상속의 가장 큰 특성은 **계층 구조 형성**이다.
부모(상위) 클래스와 자식(하위) 클래스 사이의 관계를 구성하여 
현실에서 상속은 부모가 자식을 선택해서 물려주지만 프로그램에서는 자식이 부모를 선택한다.

자식 클래스를 선언할 때 어떤 부모 클래스를 상속받을 것인지 결정하고, 선택된 부모 클래스는 extends 뒤에 기술한다

```java
class 자식클래스 extends 부모클래스 {
  //필드
  //생성자
  //메소드
}
```
 
상속에는 다음과 같은 특징이 있다.
 
1. 여러 개의 부모클래스를 상속할 수 없다.<br>
자바에서는 단일 상속만 지원한기에 extends 키워드 뒤에는 단 하나의 부모 클래스만 와야한다. 자바에서 클래스들은 1대 1의 관계이다.
2. 부모클래스에서 private 접근제한을 갖는 필드와 메솓는 상속대상에서 제외된다.<br>
또 만약 부모클래스와 자식 클래스가 다른 패키지에 존재한다면 default 접근제한을 갖는 필드와 메소드도 상속 대상에서 제외된다.

```java
class Man {
  //필드
  String name;
  
  // Man 클래스의 생성자 삭제 후 자식 클래스에 같이 작성해 줄 것
  // 이 위치에서 초기화를 진행하면 BusinessMan 인스턴스를 생성했을 때
  //이 인스턴스 안에 존재하는 변수 name에 대한 초기화가 이루어지지 않는다.
 /*public Man(String name) {
    this.name = name;
  }*/
  
  public void tellYourName() {//메소드
    System.out.println("My name is " + name);
  }
}

class BusinessMan extends Man {
  String company;
  String position;
  
  public BusinessMan(String name, String company, String position_ {
    //상위 클래스 Man의 멤버 초기화
    //Man의 멤버가 private이 아니기 때문에 접근가능함
    //상속으로 인해 자식클래스의 멤버가 된 변수 또한 자식클래스의 생성자에서 초기화가 필요하다.
    this.name = name;
    
    //BussinessMan 클래스의 멤버 초기화
    this.company = company;
    this.position = position;
  }
  
  public void tellYourInfo() {
    System.out.println("My company is " + company);
    System.out.println("My position is " + position);
    tellyYourname();
  }
}

class MyBusinessMan {
  public static void main(String[] args) {
    BusinessMan man = new BusinessMan("Yoon", "Hybrid ELD", "Staff Eng.");
		man.tellYourInfo();
	}
}
```

위 코드로 알 수 있는 상속의 효과는 상위 클래스의 인스턴스 변수와 메소드, 하위 클래스의 인스턴스 변수와 메소드가 하나로 묶여서 하나의 인스턴스를 형성한다는 것이다.
하나의 인스턴스(영역)안에 같이 존재하기 때문에 BussinessMan에서 Man의 메소드 tellYourName에 대한 호출 및 접근이 가능한 것이다.
그러나 위에서 언급한 것 처럼 같은 인스턴스 안에 존재할지라도 Man의 멤버들이 private으로 설정되어있다면 접근 불가능하다.
<br><br><br>

<h3>부모 생성자의 호출</h3>
부모클래스의 생성자를 부모클래스 내에 작성한다고 하자.
만약 자식클래스인 BussinessMan이 부모클래스인 Man을 상속하지 않는다면 Man은 변수 name에 대한 생성자를 만들어서 초기화하고 BusinessMan은 company와 position에 대한 생성자를 만들어서 초기화하기 때문에 문제가 없다.
하지만 BusinessMan이 Man을 상속하기 때문에 BusinessMan은 Man에 있는 인스턴스 멤버들도 갖게 된다.
그렇게 되면 BusinessMan 인스턴스를 생성했을 때 그 안에 존재하는 모든 인스턴스 변수 3개 name, company, position 모두 초기화가 이루어지않는다는 문제점이 있다.

**부모클래스의 멤버이지만 상속으로 인해 자식클래스의 멤버가 된 변수 또한 자식 클래스 생성자에서 초기화가 필요하다.**
<br><br>
그래서 위 예시에서 변수 name을 자식클래스에서 초기화시킨 것이다.
하지만 위 코드도 좋은 코드라고 할 수 없다.
모든 멤버는 그 멤버가 속한 클래스의 생성자를 통해 초기화하는 것이 좋다.
그것이 제일 안정적인 방법이다. 
그러기 위해선 부모클래스의 생성자를 
<br><br>
현실에서 부모없는 자식이 있을 수 없듯이 자바에서도 자식 인스턴스를 생성하면 부모 인스턴스가 먼저 생성된다.
모든 객체는 클래스의 생성자를 먼저 호출해야한다.

















