#include <iostream>
#include <string>
#include <vector>

using namespace std;

vector<int> solution(long long n) {
    vector<int> answer;
    
//     while (true) {        
//         answer.push_back(n % 10);
//         n /= 10;
        
//         if (n == 0) {
//             break;
//         }
//     }
      
    string s = to_string(n);
    for (int i=s.size()-1;i>=0;i--) {
        answer.push_back(s[i] - '0');
    }
    
    return answer;
}