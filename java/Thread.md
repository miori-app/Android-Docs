# Thread
## Process vs Thread
  - process : 실행중인 프로그램 
  - Thread : process의 resouuce를 이용해, 실제 작업을 수행
  
## Multithreading 의 장점
  - cpu 사용률 향상
  - resourece 효율적으로 사용가능
  - 작업이 분리되어 코드가 간결
  - 사용자에 대한 응답성 향상

다만, 여러 thread가 같은 process 내 resource를 공유하면서 작업하기 때문에 synchronization, deadlock 문제 고려해야한다

## Thread 구현
  1. Thread class 상속
    - thread class를 상속 받게 되면 다른 thread 상속 받을 수 없어서, runnalbe이 일반적이다
      - `public void run() //run()을 overriding `
  2. Runnable interface
    - reusability가 높고, consistency 유지 가능
