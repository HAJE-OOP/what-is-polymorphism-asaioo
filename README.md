[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/zVoKiE2u)
# 오리 게임 과제

이것은 객체 지향 프로그래밍(OOP) 수업을 위한 과제입니다. 이 과제의 목표는 자바에서 캡슐화, 다형성과 상속을 사용하여 간단한 오리 게임을 만드는 것입니다.

## 기능

- 다양한 모습과 행동을 가진 여러 종류의 오리
- 무작위 오리 생성
- 오리를 움직이기 위한 키보드 컨트롤
- Swing을 사용한 그래픽 사용자 인터페이스(GUI)

## 클래스

게임은 다음 클래스로 구성됩니다:

1. `DuckGame`: 게임 로직을 제어하고 사용자 입력을 처리하는 메인 클래스입니다.
2. `MallardDuck`, `RedheadDuck`, `RubberDuck`, `DecoyDuck`: 다양한 종류의 오리를 대표하는 클래스들입니다.

## 시작하기

게임을 실행하려면, 단순히 `DuckGame` 클래스를 컴파일하고 실행하세요. (IntelliJ가 최고!)

```
javac DuckGame.java
java DuckGame
```

게임 창이 나타나고 무작위 오리가 생성됩니다. W, A, S, D 키를 사용하여 화면에서 오리를 움직이세요.

## 과제 요구 사항

1. 오리 클래스에서 다형성과 상속을 구현하세요.
   - 오리에 대한 추상 기본 클래스 또는 인터페이스를 생성합니다.
   - 기본 클래스를 상속하거나 인터페이스를 구현하는 구체적인 오리 클래스를 구현합니다.
   - 각 오리 유형에 대한 독특한 행동을 제공하기 위해 파생 클래스에서 메소드를 오버라이드합니다.

2. 오리의 움직임 로직을 캡슐화하세요.
   - 움직임을 처리하기 위해 오리 클래스에 메소드를 만듭니다.
   - `DuckGame` 클래스에서 직접 오리의 위치를 수정하는 것을 피하세요.

3. 코드 구조와 조직을 개선하세요.
   - 코드를 더 읽기 쉽고 유지 관리하기 쉽도록 리팩터링합니다.
   - 적절한 명명 규칙과 주석을 사용하세요.
   - 필요한 경우 코드를 별도의 메소드나 클래스로 분할하는 것을 고려하세요.

4. (선택 사항) 게임에 추가 기능 또는 개선 사항을 추가하세요.
   - 오리와 화면 경계 사이의 충돌 감지를 구현하세요.
   - 독특한 행동이나 외모를 가진 더 많은 오리 유형을 추가하세요.
   - 오리가 상호 작용할 수 있는 장애물이나 게임 요소를 도입하세요.
   - 점수 시스템이나 게임 목표를 구현하세요.

(TODO를 참고하세요)

## 제출

다음을 제출해 주세요:

- 코드 변경 사항을 커밋하세요.

기본 요구 사항을 넘어서 게임을 확장하고 개선하는 것을 망설이지 마세요. 즐겁게 코딩하고 행복한 코딩 시간 보내세요!

---

# Duck Game Assignment

This is an assignment for an Object-Oriented Programming (OOP) class. The goal of this assignment is to create a simple Duck Game using encapsulate, polymorphism and inheritance in Java.

## Features

- Different types of ducks with varying appearances and behaviors
- Random generation of ducks
- Keyboard controls to move the ducks
- Graphical user interface (GUI) using Swing

## Classes

The game consists of the following classes:

1. `DuckGame`: The main class that controls the game logic and handles user input.
2. `MallardDuck`, `RedheadDuck`, `RubberDuck`, `DecoyDuck`: Classes representing different types of ducks.

## Getting Started

To run the game, simply compile and run the `DuckGame` class. (IntelliJ is the best!)

```
javac DuckGame.java
java DuckGame
```

The game window will appear, and a random duck will be generated. Use the W, A, S, D keys to move the duck around the screen.

## Assignment Requirements

1. Implement polymorphism and inheritance in the duck classes.
    - Create an abstract base class or interface for the ducks.
    - Implement specific duck classes that inherit from the base class or implement the interface.
    - Override methods in the derived classes to provide unique behavior for each duck type.

2. Encapsulate the duck's movement logic.
    - Create methods in the duck classes to handle movement.
    - Avoid directly modifying the duck's position from the `DuckGame` class.

3. Improve the code structure and organization.
    - Refactor the code to make it more readable and maintainable.
    - Use appropriate naming conventions and comments.
    - Consider splitting the code into separate methods or classes if necessary.

4. (Optional) Add additional features or enhancements to the game.
    - Implement collision detection between the ducks and the screen boundaries.
    - Add more duck types with unique behaviors or appearances.
    - Introduce obstacles or game elements that the ducks can interact with.
    - Implement a scoring system or game objectives.

(Refer to TODOs)
## Submission

Please submit the following:

- Commit your code changes.

Feel free to extend and enhance the game beyond the basic requirements. Have fun and happy coding!
