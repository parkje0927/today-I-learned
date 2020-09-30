#include <string>
#include <vector>
#include <iostream>

using namespace std;

long long solution(long long n) {
    long long answer = 0;

//     string s = to_string(n);
//     long long len = s.size()/2+1;
//     long long comp = 1;
    
//     if (s.size() % 2 == 0) {      
//         for (int i=0;i<len;i++) {
//             comp *= 10;
//         } 
//         comp *= 4; //루트 10 보다 큰 수
//     }
//     else {
//         for (int i=0;i<len;i++) {
//             comp *= 10;
//         }
//     }
    
//     //만일 n이 5자리수라면, 최대 99999의 숫자가 입력될 수 있고 
//     //6자리 수 인 100000의 제곱근(100루트10) 보다 작게 반복문을 돌리면 된다.

//     for (long long i=1;i<=comp;i++) {
//         if (i*i == n) {
//             answer = (i+1)*(i+1);
//             break;
//         }
//         else if (i*i > n) {
//             answer = -1;
//             break;
//         }
//     }
    
    long long i;
    for (i=1;i*i<=n;i++) {
        if (i*i == n) {
            answer = (i+1)*(i+1);
            break;
        }
        else {
            answer = -1;
        }
        
    }
    
    return answer;
}