Given n request ids as an array of strings, requests, and an integer k, after all requests are received, find the k most recent requests. Report the answer in order of most recent to least recent.

Example:

Suppose n = 5 requests = ["item1", "item2", "item3", "item1", "item3"], and k = 3.

Starting from the right and moving left, collecting distinct requests, there is "item3" followed by "item1". Skip the second instance of "item3" and find "item2". The answer is [^ prime prime item 3 ^ prime prime "item1", "item2"].

Function Description

Complete the function getLatestkRequests in the editor below.

getLatestKRequests takes the following arguments:

str requests[n]: the request ids int k: the number of requests to report

Returns

str[k]: the k most recent requests
![image](https://github.com/user-attachments/assets/6fc0976b-6153-4457-a492-70147576250e)

#soultin:

```
import java.util.ArrayList; // Import ArrayList
import java.util.List;      // Import List


public class getLatestRequests {


    public static List<String> getLatestRequestss(List<String> requests,int k){
        List<String> report = new ArrayList<String>();
        int i =requests.size()-1;
        while (report.size()!=k) {
            if (!report.contains(requests.get(i))) {
                report.add(requests.get(i));
            }
            i--;
        }
        return report;
    }
    public static void main(String[] args) {
        List<String> requests=new ArrayList<String>(List.of("item1", "item2", "item3", "item1", "item3"));
        System.out.println(getLatestRequestss(requests, 3));
    }

}
```
