#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    
    int idx = 0;
    for (int i=0;i<arr.size();i++) {
        if (i == 0) {
            answer.push_back(arr[i]);
            idx++;
            continue;
        }
        
        answer.push_back(arr[i]);
        
        if (answer[idx-1] == answer[idx]) {
            answer.pop_back();
        }
        else {
            idx++;
        }      
    }
        
    return answer;
}