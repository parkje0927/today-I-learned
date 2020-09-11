#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string s) {
    string answer = "";
    
    int value;
    if (s.length() % 2 == 1) {
        value = s.length() / 2;
        answer = s[value];
    }
    else {
        value = s.length() / 2 - 1;
        answer = s.substr(value, 2);
        //value에서부터 길이 2
    }
    
    return answer;
}