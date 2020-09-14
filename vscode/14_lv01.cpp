#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
    bool answer = true;
    
    // printf("%d\n", 'A'); //65
    // printf("%d\n", 'a'); //97
    
    //숫자가 아니면 false
    for (int i=0;i<s.length();i++) {
        if (s[i] >= 65 && s[i] <= 122) {
            return false;
        }
    }
    
    //숫자이고 길이가 4 혹은 6이면 true
    if (s.length() == 4 || s.length() == 6) {
        return answer;
    }
    
    //숫자이고 길이가 4나 6이 아니면 false
    else {
        return false;
    }    
}