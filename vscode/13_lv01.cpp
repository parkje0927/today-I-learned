#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string s) {

    // printf("%d\n", 'A'); //65
    // printf("%d\n", 'a'); //97
    
    //선택정렬
//     for (int i=0;i<s.length()-1;i++) {
//         for (int j=i+1;j<s.length();j++) {
//             if (s[i] < s[j]) {
//                 int temp = s[i];
//                 s[i] = s[j];
//                 s[j] = temp;
//             }            
//         }
//     }
    
//     return s;
    
    //sort(answer.begin(), answer.end(), greater<자료형>()); => 내림차순
    //sort(answer.begin(), answer.end(), less<자료형>()); => 오름차순
    
    string answer = s;
    sort(answer.begin(), answer.end(), greater<char>());
    return answer;
}