# Thread
## Process vs Thread
  - process : 실행중인 프로그램 (process는 자원 할당의 단위, 어떠한 자원을 가지고 어떻게 진행한다) 
  - Thread : process의 resouuce를 이용해, 실제 작업을 수행

## Thread 장점 (prcess 기반 시스템에서 child를 fork했을 때보다 Thread가 좋은 점)
  - process를 만드는 것보다 (child는 전체 program copy) thread를 만드는 게(program code와 data는 share하기 때문에, stack 영역만 copy) 더 시간이 적게 걸린다.
  - 종료시간더 process 보다 적게 걸린다
  - process swtiching의 경우, PCB의 모든 정보를 다 저장해야하지만, thread의 경우 TCB만 저장하면 된다.
  - thread는 process 내에 같이 있어, memory와 file 등을 share 하는데, share 한 memory를 통해 서로 kernel의 도움없이 통신이 가능하다. 반면에 process 는 서로 통신을 하고싶으면 os에게 도움을 요청해야하기 때문에, 이득이 있다.
  
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
