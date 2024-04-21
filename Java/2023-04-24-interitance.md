<h1>상속</h1>

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
<br><br>
상위 클래스의 속성과 메소드를 하위 클래스가 상속받아 사용할 수 있으므로 공통된 기능을 한 번만 구현하고 여러 클래스에서 활용할 수 있다.
또 부모 클래스의 수정으로 모든 자식 클래스들도 수정되는 효과를 가져오기 때문에 유지보수시간을 최소화할 수 있다.
<br><br>
또 상속을 통해 다형성을 구현할 수 있다.
상위 클래스 타입으로 하위 클래스의 객체를 참조하면, 동일한 타입으로 여러 종류의 객체를 다룰 수 있다.
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
<br>

```java
class Parent{ //부모클래스
	int parentField = 100;
	
	public void parentMethod() {
		System.out.println("부모 클래스 메소드 입니다.");
	}
}

class Child extends Parent { //자식클래스
	int childField = 200;
	
	public void childMethod() {
		System.out.println("자식클래스 메소드입니다.");
	}
}

public class PrintOut {
	public static void main(String[] args) {
		Child child = new child();
		//자식 객체에서도 부모의 멤버를 자연스럽게 사용할 수 있다.
		
		System.out.println(child.childField); //자식필드
		System.out.println(child.parentField); //부모필드
		System.out.println();
		
		child.childMethod(); //자식메소드
		child.parentMEthod(); //부모메소드
	}
}
```
	
예제) 사람의 이름과, 회사, 직책을 출력하는 프로그램

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
그러기 위해선 부모클래스에 부모클래스의 생성자가 위치하도록 바꿔야할 것이다.
자바에서는 상속 관계에 있을지라도, 상위클래스의 멤버는 상위클래스의 생성자를 통해서 초기화하도록 유도하고 있다.
<br><br>
현실에서 부모없는 자식이 있을 수 없듯이 자바에서도 자식 인스턴스를 생성하면 부모 인스턴스가 먼저 생성된다.
모든 인스턴스는 클래스의 생성자를 먼저 호출해야만 생성된다.
즉 부모클래스의 인스턴스를 생성하기 위해서는 부모클래스의 생성자가 호출이 되어야한다는 뜻이다.

```java
class SuperCLS { //상위클래스
	public SuperCLS() {//생성자
		System.out.println("I'm Super Class");
	}
}

class SubCLS extends SuperCLS { //하위클래스
	public SubCLS() {//생성자
		System.out.println("I'm Sub Class");
		//호출할 상위 클래스의 생성자를 명시하지 않으면 void 생성자 호출됨
		
	}
}

class SuperSubCon {
	public static void main(String[] args) {
		new SubCLS();
		//여기서 SubCLS의 인스턴스가 생성이 되고 그 안에 존재하는 SubCLS 생성자만 실행될 것으로 기대했지만 아님
	}
}

//출력 결과: 상위 클래스의 생성자 실행 후 하위클래
//I'm Super Class
//I'm Sub Class 
```

<br><br>
출력결과로 부모 클래스 생성자 실행 후 자식 클래스 생성자가 실행됨을 알 수 있다.
부모 인스턴스를 생성하기 위한 부모 생성자들은 자식 생성자의 맨 첫 줄에서 호출 된다.
이는 문법적으로 정해져 있는 규칙이기 때문에 내가 작성해주지 않으면 자바 컴파일러가 대신해서 작성해주는 것을 확인할 수 있다.
<br><br>
super();라는 키워드로 부모 클래스의 생성자 호출을 명시할 수 있다.
이 키워드는 부모 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 참조하는 사용하는 참조변수이며, 무조건 생성자 안에서 사용되어야한다.
부모 클래스의 멤버와 자식 클래스 멤버의 이름이 같을 경우 super 키워드를 사용하여 구별할 수 있다.

자바에서는 super 참조변수를 사용하여 부모 클래스 멤버에 접근할 수 있다: super.부모메소드();
this와 마찬가지로 super 참조 변수를 사용할 수 있는 대상도 인스턴스 메소드뿐이며 정적 메소드에는 사용할 수 없다.
상위클래스의 멤버들이 오버로딩 되어있을 경우에는 인자를 통해 어떤 생성자를 호출할지 명시할 수 있다.

super(매개값1, 매개값2,...); 이렇게 작성하면 매개값의 타입과 일치하는 부모 생성자를 호출한다.
매개값의 타입과 일치하는 부모 생성자가 없을 경우 컴파일 에러가 발생한다.
하위 클래스의 생성자에서는 상위클래스의 생성자를 명시적으로 호출해주는 것이 좋다.
super(매개값, ...);이 생략되면 컴파일러에 의해 super()가 자동적으로 추가되기 때문에 부모 클래스의 기본 생성자가 존재해야한다.
부모 클래스에 기본 생성자가 없고 매개 변수가 있는 생성자만 있다면 반드시 자식 생성자에서 super(매개값, ..)을 명시적으로 호출해야한다.
<br><br>
예제) 사람의 이름, 회사, 직책을 출력하는 프로그램 수정본

```java
class Man {
	String name;
	
	public Man(String name) {
		this.name = name;
	}
	
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}

class BussinessMan extends Man {
	String company;
	String position;
	
	public BusinessMan (String name, String company, String position) {
		//자식 클래스는 인자값을 다 받아주긴 해야함
	
		super(name);
		//부모 클래스에 속해있는 멤버는 부모클래스에서 초기화하는 것이 안정적 -> 호출
		//초기화해줄 재료는 전달
		this.company = company;
		this.position = position;

		public void tellYourInfo() {
			System.out.println("My company is " + company);
			System.out.println("My position is " + position);
			tellYourName();
		}
	}
}

public class MyBusinessMan {
	public static void main(String[] args) {
		BusinessMan man = new BusinessMan("yoon", "hybrid ELD", "Staff Eng.");
		man.tellYourInfo();
	}
}
```

```java
class Sedan {
	String color;
	
	public Sedan(String color) {
		System.out.println("Sedan 클래스 생성자 입니다");
		this.color = color
	}
}	
	
class Sonata extends Sedan() {
	public Sonata(String color) { //생성자
		super("파랑");
		System.out.println("Sonata 클래스 생성자 입니다.");
	}
}

public class PrintOut {
	public static void main(String[] args) {
		Sonata sonata = new Sonata("파랑");
		//Sedan 객체가 먼저 생성이 되고 그 다음에 Sonata 객체가 생성이됨
		
		System.out.println(sonata.color);
	}
}
```

```java
class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
}

public class StudentExample {

	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("이름: " + student.name);
		System.out.println("주민등록번호: " + student.ssn);
		System.out.println("학번: " + student.studentNo);
	}

}
```

<h3>클래스 변수, 클래스 메소드와 상속</h3>
이 얘기를 하기에 앞서 클래스 변수, 메소드의 특징에 대해 이해할 필요가 있다.
클래스 변수와 메소드를 묶어서 클래스 멤버라고 부르는데 정적(static) 멤버라고도 부른다. 
클래스 멤버의 특징은 다음과 같다.

 1. 인스턴스의 생성과 상관없이 접근이 가능하다.
 2. 클래스 내부와 외부에서(접근 수준 지시자가 허용하면) 접근이 가능하다.
 3. 클래스 변수와 메소드가 위치한 클랫 내에서는 직접 접근이 가능하다.

클래스 변수와 메소드는 해당 클래스의 모든 인스턴스들이 공유하는 변수로 모든 인스턴스가 동일한 값을 가진다.
static 키워드로 선언된다는 것이 특징인데, 인스턴스 변수와 메소드와 구별되는 키워드이다.
클래스 이름으로 직접 접근이 가능하며 객체 생성과 상관없이 사용가능하다.
(인스턴스 생성없이도 이름만으로 접근가능함: 클래스명.변수명)
프로그램을 실행할 동안 메모리에 한번만 할당되며 모든 인스턴스들이 공유하기 때문에 데이터의 일관성과 효율성을 유지하는데 사용된다.

클레스 메소드는 클래스 변수에 접근할 수 있지만 인스턴스 변수에는 직접 접근이 불가능하다.
<br><br>
인스턴스 변수와 메소드는 객체 또는 인스턴스에 속하는 멤버들이다.
이들은 객체의 상태를 나타내고 해당 객체에 대한 동작을 정의하는데 사용된다.
둘다 객체가 생성될 때 해당 객체에 할당된다는 것이 특징이다.
인스턴스 변수는 개별 인스턴스마다 유지되는 변수로 클래스 내에서, 메소드 밖에서 선언된다.
인스턴스 생성시 해당 객체에 할당되어 각각 독립적인 값을 가진다는 것이 특징이다.
인스턴스 메소드는 해당 객체의 상태를 변경하거나 인스턴스 변수에 접그할 수 있으며 인스턴스의 참조를 통해 호출된다는 것이 특징이다.
<br><br>

**클래스 변수와 클래스 메소드는 인스턴스에 속하지 않은 딱 하나만 존재하는 변수와 메소드이다.**
상속의 대상이 아니라는 뜻이다.

집을 소유하고 있는 어떤 부모가 있다하자.
그리고 그 집의 1층에 다른 사람들이 세들어 살고 있다고 하자.
집주인 부모가 자식에게 집을 물려주려고 할 때, 당연히 세들어 살고 있는 사람들이 들고온 가전제품들은 물려줄 수 없다.
이것들은 상속의 대상이 아니기 때문이다.

클래스 변수와 클래스 메소드도 마찬가지이다.

1. 집주인 부모 = 부모클래스
2. 집주인 자식 = 자식클래스
3. 세들어 사는 사람들 = static으로 선언된 클래스 변수와 메소드

로 표현할 수 있을 것이다.

부모클래스의 인스턴스와 static 멤버들은 전혀 상관이 없다.
부모는 단순히 바로 직접적인 접근이 가능하다는 접근권한만 있는 것이지 실제로 정적 멤버를 가지고 있는 것은 아니기 때문이다.
정적 멤버도 상속이 가능한지에 대해 따질 때도 이렇게 생각하면 된다.
부모클래스의 것이 아닌데 어떻게 상속을 할 수 있을까?
프로그램 전체 영역에서 자기 혼자 존재하기 때문에 상속이 불가능한 것이다.
<br><br>

그렇다면<br>
**상위 클래스에 위치한 클래스 변수와 메소드에 하위 클래스에서 어떻게 접근할까?**

하위 클래스가 상위 클래스를 상속하고 있는 경우, 상위 클래스의 클래스 변수와 메소드는 하위 클래스에서 자동으로 상속된다.
따라서 하위 클래스에서는 상위 클래스의 멤버들을 그대로 사용할 수 있다.

1. 직접접근<br>
하위 클래스에서 상위 클래스의 클래스 변수와 메소드는 상위 클래스의 이름을 사용하여 직접 접근할 수 있다. 이는 상위 클래스가 동일한 패키지 내에 있거나 상위 클래스의 접근 제어자가 public 또는 protected로  설정된 경우에 가능하다.
2. super 키워드<br>
super 키워드를 사용하여 하위 클래스에서 상위클래스의 클래스 변수와 메소드에 접근할 수 있다.
super.variable 형태로 상위 클래스의 클래스 변수에 접근할 수 있고 super.method()형태로 상위클래스의 클래스 메소드에 접근할 수 있다.
<br>

최종 정리를 하자면 상위 클래스의 인스턴스를 생성해도 상위 클래스의 클래스 변수는 그 안에 존재하지 않는데 하위 클래스 인스턴스 안에는 당연하지 존재하지 않을 것이다.
클래스 변수와 클래스 메소드 모두 상속의 대상이아니다.
그러나 세들어 사는 것처럼, 자리를 빌려 클래스 변수가 들어오는 것이다 보니 직접 접근이 가능한데 이 권한은 자식도 가진다.
이 경우는 접근제한자가 private이 아닐 때 해당하는 말이다.
protected의 경우, 하위 클래스 접근을 허용한다.

```java
class SuperCLS {
	protected static int count = 0;	// 클래스 변수
	
	public SuperCLS() {
		count++;
	}
}

class SubCLS extends SuperCLS {
	public void showCount() {
		System.out.println(count);
	}
}

class SuperSubStatic {
	public static void main(String[] args) {
		SuperCLS obj1 = new SuperCLS();	//count값 1 증가
		SuperCLS obj2 = new SuperCLS(); //count값 1 증가
		
		//아래 하위 클래의 인스턴스 생성과정에서 SuperCLS 생성자가 호출됨
		SubCLS obj3 = new SubCLS(); //count값 1 증가
		obj3.showCount();
	}
}
```


<h3>상속을 위한 두 클래스의 관계: IS-A관계</h3>
IS-A관계는 객체지향 프로그래밍에서 상속관계를 나타내는 개념이다.
기본적으로 이 관계가 성립해야 상속의 후보로 고려할 수 있다.
A는 B이다로 표현되는 개념으로, 하나의 클래스가 다른 클래스의 일종이라는 의미를 가지게 된다.

하위 클래스는 상위 클래스의 모든 특성을 지닌다.
거기에 더해서 하위 클래스는 자신만의 추가적인 특성을 더하게 되는 것이다.
클래스 B가 클래스 A를 상속한다고 하자.
두 클래스는 각자 변수와 메소드를 가지고 있을 것이다.
클래스 B는 클래스 A가 가지고 있는 변수와 메소드를 상속받기 때문에 B 클래스의 인스턴스를 생성하면 그 안에는 클래스 A가 가지고 있는 변수와 메소드가 같이 존재하게 된다.
즉 하위클래스인 B는 상위 클래스인 A의 변수와 메소드를 모두 지니기 때문에 하위 클래스 B가 상위클래스 A의 모든 특성을 가진다고 할 수 있다.
다르게 말하면 A클래스가 할 수 있는 일은 B클래스도 할 수 있다.

```java
class MobilePhone {
	protected String number; //전화번호
	
	public MobilePhone(String num) { //생성자
		number = num;
	}
	
	public void answer() { //메소드
		System.out.println("hi~ from + number");
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer; //안드로이드 운영체제
	
	public SmartPhone(String num, String ver) { //생성자
		super(num); //부모클래스 MobilePhone의 생성자 호출
		androidVer = ver;
	}
	
	public void playApp() { //메소드
		System.out.println("App is running in" + androidVer);
	}
}

class MobileSnartPhone {
	public static void main(String[] args) {
	SmartPhone phone = new SmartPhone("010-5101-5167", "Nougat");
	
	phone.answer();
	phone.playApp();
	}
}
```

위 예시에서 스마트폰은 모바일 폰을 상속한다.
전화기능이 전부인 폰을 모바일 폰이라고 한다면 스마트폰은 전화기능은 물론 다른 여러 가지 기능을 가질 수 잇을 것이다.
위 코드에서는 앱을 실행할 수 있는 기능을 추가했다고 보면 된다.
모바일폰이 가지고 있는기능이 스마트폰에도 그대로 있다고 볼 수 있기에 이 둘을 상속으로 묶는 것은 바람직하다.

<h3>메소드 오버라이딩(재정의)</h3>
부모 클래스의 모든 메소드가 자식 클래스에 맞게 설계되어있다면 좋겠지만 어떤 메소드는 자식 클래스가 사용하기에 적합하지 않을 수도 있다.
이 경우 상속된 일부 메소드는 자식 클래스에서 다시 수정해서 이용해야한다.
자바는 이런 경우 메소드 오버라이딩(재정의) 기능을 제공한다.
<br><br>
우선 메소드 오버라이딩이란 상위(부모) 클래스에서 정의된 메소드를 하위 클래스에서 다시 정의하는 것을 뜻한다.
메소드 오버라이딩을 할 때 다음과 같은 규칙에 주의해서 작성해야한다.

1. 부모와 동일한 시그니처(리턴타입, 메소드 이름, 매개변수목록)을 가져야한다.
2. 접근 제한을 더 강하게 재정의할 수 없다.<br>
부모 메소드가 public 접근 제한을
3. 새로운 예외를 throws할 수 없다.
<br>

**참조변수의 참조가능성에 대한 정리**

IS-A관계에서 예시로 들었던 것처럼 자식클래스를 스마트폰, 부모클래스를 모바일폰이라 하면 IS-A관계에 의해 스마트폰 클래스는 스마트폰이자 모바일폰이 되는 것이다.
자식클래스의 인스턴스는 자식클래스형 참조변수로도 참조가능하지만 부모클래스형 참조변수로도 참조가능하다.
이 두 경우는 분명히 차이가 있다.
스마트폰인지 알고 사용하는 사람과, 스마트폰이 그저 폴더폰인줄 알고 사용하는 사람과 스마트폰을 사용하는데있어 다를 수 밖에 없는 것처럼 말이다.
부모 클래스인 모바일폰형 참조변수로 스마트폰 클래스를 접근한다면 스마트폰을 모바일폰처럼 쓸 수 밖에 없다.
자식 클래스 인스턴스가 모든 멤버를 가지고 있더라도 접근할 수 있는 것은 부모의 인스턴스로 제한된다.
스마트폰처럼 쓰려면 스마트폰 참조변수로 접근해야한다.
정리하자면 **자식클래스형 참조변수와 부모클래스형 참조변수로 자식 인스턴스를 참조할 수 있으며 부모클래스형 참조변수로 자식 인스턴스를 참조하게 된다면 제한되는 부분이 생길 수 있다**는 것이다.
그 참조변수가 어떤 클래스의 인스턴스를 참조하는지와는 전혀 상관이 없다.
참조변수의 형(부모클래스형인지 자식클래스형인지)에 따라 접근가능한 멤버가 결정된다.
이러한 형태의 판단은 속도가 빠르다.
<br><br>
그러나 자식클래스형 참조변수로 부모 인스턴스를 참조하는 것은 불가능하다.
자식클래스에서는 부모 클래스 멤버를 모두 상속받아 사용할 수 있지만, 부모 클래스에서는 자식클래스에 선언된 멤버를 알지 못하기 때문이다.
따라서 부모클래스의 인스턴스를 자식클래스의 참조변수로 참조할 경우, 자식 클래스에만 존재하는 멤버에 접근하려 시도하면 컴파일러가 이를 알지 못해 오류가 발생한다.

```java
class MobilePhone {
	protected String number;
	
	public MobilePhone1(String num) { //생성자
		number = num;
	}
	
	public void answer() { //메소드
		System.out.println("hi~ from" + number);
	}
}

class SmartPhone extends MobilePhone {
	private String androidVer;
	
	public SmartPhone(String num, String ver) { //생성자
		super(num);
		androidVer = ver;
	}
	
	public void playApp() { //메소드
		System.out.println("App is running in" + androidVer);
	}
}

public class MobileSmartPhoneREf {
	public static void main(String[] args) {
		//SmartPhone형 참조변수를 통해 SmartPhone의 인스턴스 접근
		SmartPhone ph1 = new SmartPhone("010-5101-5167", "Nougat");
		//MobilePhone형 참조변수를 통해 SmartPhone의 인스턴스 접근
		MobilePhone ph2 = new SmartPhone("010-3691-1493", "Nougat");

		ph1.answer();
		ph1.playApp();
		System.out.println();
		
		ph2.answer();
		//ph2.playApp();	은 불가능
		//ph2는 MobilePhone형 참조변수로 ph2를 통해 접근 가능한 멤버는 MobilePhone 클래스에 정의 되었거나 이 클래스가 상속하는 클래스의 멤버로 제한
		//ph2가 참조하는 인스턴스가 무엇인지 상관없다.
	}
}
```

최종정리를 해보자.

```java
class Cake { 
	public void sweet() {...}
}

class CheeseCake extends Cake { 
	public void milky() {...}
}

class StrawberrCheeseCake extends CheeseCake {
	public void sour() {...}
}

public class YummyCake {
	public static void main(String[] args) {
		Cake cake1 = new StrawberryCheeseCake();
		CheeseCake cake2 = new StrawberryCheeseCake();
	}
}
```
우선 참조변수 cake1은 Cake형 참조변수로 StrawberryCheeseCake 인스턴스를 참조하고 있고
참조변수 cake2는 CheeseCake형 참조변수로 역시 StrawberryCheeseCake 인스턴스를 참조하고 있다.

Cake형 참조변수 cake1을 통해사 호출할 수 있는 메소드는 sweet 메소드 한 가지이다.<br>
cake1.sweet();

CheeseCake형 참조변수 cake2를 통해 호출할 수 있는 메소드는 CheeseCake 클래스 안에 존재하는 milky 메소드와 CheeseCake 클래스가 상속하는 Cake 클래스 안에 존재하는 sweet 메소드이다.<br>
cake2.sweet();<br>
cake2.milky();
<br><br>
추가적으로 상속관계에 있는 두 클래스의 참조관계가 배열까지 이어진다는 사실을 기억하자.<br>
CheeseCake[] cales = new CheeseCake[10];<br>
Cake[] cakes = new CheeseCake[10];<br>
위에는 당연하 가능한 부분이고 밑의 경우와 같이 CheeseCake배열을 생성하고 참조하는 것도 가능하다는 뜻이다.

<br>

**메소드 오버라이딩**
상위 클래스에 정의된 메소드를 하위 클래스에서 다시 정의하는 행위를 메소드 오버라이딩이라 하는데, 여기서 말하는 오버라이딩은 무효화 시키다의 뜻으로 해석ㄷ이 된다.
메소드가 재정의 되었다면 부모 객체의 메소드는 무효화되기 때문에 즉 숨겨지기 때문에 자식 객체에서 메소드를 호출하면 재정의된 자식 메소드가 호출된다.

```java
class Cake {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake {
	public void yummy() { //Cake의 yummy를 오버라이딩 
		System.out.println("Yummy Cheese Cake");
	}
}

class YummyCakeOverrideing {
	public static void main(String[] args) {
		Cake cake1 = new CheeseCake();
		CheeseCake cake2 = new CheeseCake();
		
		cake1.yummy(); //오버라이딩한 CheesCake의 yummy 메소드 호출됨

```











