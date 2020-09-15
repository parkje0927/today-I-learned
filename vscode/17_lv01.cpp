#include <string>
#include <vector>
#include <stdlib.h>

using namespace std;

int solution(string s) {
    int answer = 0;
    
    //#1
    // answer = stoi(s);
    
    // printf("%d\n", '1'); //49
    
    //#2
    bool flag = true;
    for (int i=0;i<s.length();i++) {
        
        if (s[i] == '-') {
            flag = false;
        }
        
        else if (s[i] == '+') {
            flag = true;
        }
        
        else {
            answer = answer*10 + s[i] - 48;   
        }
    }
    
    if (!flag) {
        answer *= (-1);
    }
    
    return answer;
}