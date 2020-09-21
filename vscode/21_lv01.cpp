#include <iostream>
#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    
    //짝수 => 대문자 / 홀수 => 소문자
    //공백을 기준 32
    
    // 소문자 : //97 ~ 122
    // 대문자 : //65 ~ 90
    
    // toupper, tolower 이용해서 코드 짜기
    
    int start = 0;
    for (int i=0;i<s.size();i++) {
        
        if (s[i] == ' ') {
            int cnt = 0;
            for (int j=start;j<i;j++) {
                answer += cnt % 2 == 0 ? toupper(s[j]) : tolower(s[j]);
                cnt++;
            }
            answer += s[i];
            start = i+1;
        }
        else if (i == s.size() - 1) {
            int cnt = 0;
            for (int j=start;j<=i;j++) {
                answer += cnt % 2 == 0 ? toupper(s[j]) : tolower(s[j]);
                cnt++;
            }
        }   
    }

//     int start = 0;
//     for (int i=0;i<s.length();i++) {
//         if (s[i] == 32) {
            
//             int cnt = 0;
//             for (int j=start;j<i;j++) {
//                 if (cnt % 2 == 0) { //대문자
//                     if (s[j] >= 97) {
//                         s[j] -= 32;
//                     }
//                 }
//                 else if (cnt % 2 == 1) { //소문자
//                     if (s[j] >= 65 && s[j] <= 90) {
//                         s[j] += 32;
//                     }
//                 }  
//                 cnt++;
//             }
                
//             start = i+1;                
//         }
//         else if (i == s.length() - 1) {
//             int cnt = 0;
//             for (int j=start;j<=i;j++) {
//                 if (cnt % 2 == 0) { //대문자
//                     if (s[j] >= 97) {
//                         s[j] -= 32;
//                     }
//                 }
//                 else if (cnt % 2 == 1) { //소문자
//                     if (s[j] >= 65 && s[j] <= 90) {
//                         s[j] += 32;
//                     }
//                 }  
//                 cnt++;
//             }
//         }
//     }
    
//     answer = s;
    return answer;
}