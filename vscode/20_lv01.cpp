#include <iostream>

using namespace std;
int solution(int n) {

//     int answer = 0;   
//     int len = 1;
    
//     while(true) {
//         if (n / len >= 1) {
//             len *= 10;
//         }
//         else {
//             break;
//         }
//     }
    
//     len /= 10;

//     while(true) {
//         int temp = n / len;
//         answer += temp;
        
//         if (len == 1) {
//             break;
//         }

//         n %= len; 
//         len /= 10;
//     }
    
    int answer = 0;

    string s = to_string(n);
    for(int i = 0; i < s.size(); i++) {
        answer += (s[i] - '0');
    }
    return answer;
}