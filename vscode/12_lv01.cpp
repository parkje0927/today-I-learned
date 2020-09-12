#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{
    bool answer = true;
    
    int p_cnt = 0;
    int y_cnt = 0;
    for (int i=0;i<s.length();i++) {
        if (s[i] == 'P' || s[i] == 'p') {
            p_cnt++;
        }    
        else if (s[i] == 'Y' || s[i] == 'y') {
            y_cnt++;
        }
    }
    
    if (p_cnt != y_cnt) {
        answer = false;
    }
    
    return answer;
}