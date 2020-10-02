// <에라토스테네스의 체>
// 소수를 구하는 방법 중 하나이고 O(n log n)이다.

// 1은 소수가 아니다. 
// 2는 소수이고 2의 배수는 소수가 될 수 없다. 
// 3은 소수이고 3의 배수는 소수가 될 수 없다. 
// 5는 소수이고 5의 배수는 소수가 될 수 없다. 

// n이 소수냐라고 묻는다면 1부터 루트n까지 하는 게 좋다.


#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int n) {
    int answer = 0; 
    
    //시간 초과
//     for (int i=2;i<=n;i++) {
//         int cnt = 0;
//         for (int j=1;j*j<=i;j++) {
//             if (i % j == 0) { 
//                 cnt++;
//             }
//         }
        
//         if (cnt == 1) {
//             answer++;
//         }
//     }
    
    //에라토스테네스의 체
    int nums[1000000];
    for (int i=2;i<=n;i++) {
        
        if (nums[i] == 0) {
            answer++;
        }
        
        for (int j=i;j<=n;j+=i) {
            nums[j] = 1;
        }
 
    }

    return answer;
}