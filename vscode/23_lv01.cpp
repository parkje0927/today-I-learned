#include <functional>
#include <algorithm>
#include <string>
#include <vector>

using namespace std;

long long solution(long long n) {
    long long answer = 0;
    
    // string str = to_string(n);
    // sort(str.begin(), str.end(), greater<char>());
    // answer = stoll(str);
    
    vector <int> temp;
    string s = to_string(n);
    for (int i=0;i<s.size();i++) {
        temp.push_back(s[i] - '0');
    }
    
    sort(temp.begin(), temp.end());
    int len = 1;
    
    for (int i=0;i<temp.size();i++) {
        answer += temp[i] * len;
        len *= 10;
    }
    
    // stoi = string to int
    // stof = string to float
    // stol = string to long int
    // stod = string to double
    // stoul = string to unsigned int
    // stoll = string to long long
    // stoull = string to unsigned long long
    // stold = string to long double
    
    return answer;
}