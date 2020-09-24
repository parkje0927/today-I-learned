#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    
    if (arr.size() == 1) {
        answer.push_back(-1);
        return answer;
    }
    
    int mymin = arr[0];
    int idx = 0;    
    for (int i=0;i<arr.size();i++) {
        if (arr[i] < mymin) {
            mymin = arr[i];
            idx = i;
        }
    }
    
    //idx번째 원소 삭제
    arr.erase(arr.begin() + idx);
    answer = arr;
    return answer;
}