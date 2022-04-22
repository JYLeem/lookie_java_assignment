## 숫자 야구 and 행맨 게임 만들기

과제 조건

1. Indent를 3이상 하지 않습니다.(들여쓰기)
2. 객체지향적으로 만드는 것을 목표로 합니다. 
3. 예외 처리는 배우지 않았으므로 사용자의 입력에 예외는 없다고 가정합니다.  
4. 상수를 적절히 사용합니다.
4. 멀티쓰레드 환경이라고 가정합니다. (즉 여러명의 사용자가 동시에 요청할 수 있습니다.)
5. Main 브랜치를 fork해서 과제를 수행합니다.



# 과제 설명

- 함수 실행 시 아래와 같이 출력하며 시작합니다.

![image-20220422171852364](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20220422171852364.png)

- 사용자는 숫자를 입력해서 숫자 야구 or 행맨을 실행합니다.



# 숫자 야구

- 컴퓨터는 랜덤한 3자리 숫자를 생성합니다.
  - 중복되는 숫자는 불가능
  - 맨 앞자리에 0은 불가능

게임 시작시 아래와 같은 화면으로 시작합니다.

![image-20220423021013529](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20220423021013529.png)

- 사용자는 3자리의 숫자를 입력합니다. (3자리만 입력받는다고 가정)
- 숫자 입력에 따라 strike, ball을 출력해줍니다.

![image-20220423021058699](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20220423021058699.png)

- 정답을 맞출시 아래와 같이 출력하고 다음 게임의 진행 여부를 물어봅니다.

![image-20220423021156153](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20220423021156153.png)

# 행맨

- 행맨을 시작하면 컴퓨터는 랜덤한 단어를 생성합니다. (단어는 "cat","dog","school" 3개중에서 랜덤으로 고르게 합니다.)
- 단어를 생성한 직후 아래와 같은 화면을 사용자에게 보여주고, 단어의 글자 수를 알려줍니다.

![image-20220422172500880](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20220422172500880.png)

- 사용자가 단어를 입력한 것에 따라 다르게 동작합니다. (글자 수에 알맞게만 입력받는다고 가정)

  - 아무것도 같지 않다면 아무런 조치 하지 않고 출력
  - 같은 자리에 철자가 동일하면 해당 철자를 채워서 출력
  - 정답을 맞췄다면 출력하고 종료

  ![image-20220423021818617](C:\Users\user\AppData\Roaming\Typora\typora-user-images\image-20220423021818617.png)

- 게임을 종료하고 다음 게임을 할 것인지 여부를 묻는다. 

# 추가 설명

Random

```java
Random rand = new Random();
int randNumber = rand.nextInt(3) // 0~2까지 랜덤한 수 반환
```

BufferedReader

```
BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
br.readLine(); // 사용자의 입력 한 줄을 받아온다. 
```

StringBuilder

```
StringBuilder sb = new StringBuilder()
sb.append("hi");
sb.append("bye"); // sb는 String을 만들어주는 객체이며, append는 두 문자열을 붙여주는 역할을 합니다. 
```

HashSet

```java
HashSet<Integer> set = new HashSet<>();
set.put(1); // 1을 set 집합에 넣는다.

// Set은 중복되는 것은 넣지 않는다. 넣은 순서대로 저장되지는 않는다. 
set.put(1);
set.put(1);
set.size(); // szie = 1로 반환된다.

// interator 반복자 사용 for문을 사용하는 것과 같다고 생각해도 된다.
Iterator<Integer> iterator = set.iterator(); // 원소를 차례차례 방문한다. set은 순서가 없으므로 넣은 순서대로 방문하지는 않는다. 
iterator.hasNext(); // 다음 원소가 있는지 판별
iterator.next(); // 현재 위치한 원소를 반환하고 다음 원소를 가리키게된다. 
```

String

```java
String str = String.valueOf(1);// int, double, char을 String형태로 바꿔준다.

int index = str.indexOf("2"); // str안에 2가 존재한다면 해당 인덱스를 반환 없다면 -1을 반환 
```



