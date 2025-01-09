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