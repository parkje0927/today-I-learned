#include <string>
#include <vector>

using namespace std;

bool solution(int x) {
    bool answer = true;
    
    int sum = 0;
    
    int X = x;
    while (true) {
        sum += x % 10;
        x /= 10;
        
        if (x == 0) {
            break;
        }
    }
    
    if (X % sum != 0) {
        answer = false;
    }
    
//     string s = to_string(x);
//     for (int i=0;i<s.size();i++) {
//         sum += s[i] - '0';
//     }
    
//     if (x % sum != 0) {
//         answer = false;
//     }
    
    return answer;
}