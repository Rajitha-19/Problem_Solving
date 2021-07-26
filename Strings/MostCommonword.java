/*
Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. It is guaranteed there is at least one word that is not banned, and that the answer is unique.

The words in paragraph are case-insensitive and the answer should be returned in lowercase.

 Ex:
 Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
 Output: "ball"

*/

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        List arrlist = Arrays.asList(banned);
        paragraph=paragraph.replace("."," ").replace("?"," ").replace(";"," ").replace(","," ").replace("'"," ").replace("!"," ");
        String st1=paragraph.replaceAll("\\s+"," ").trim().toLowerCase();
        String[] arr=st1.split("\\s");
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(String s:arr){
            if(!(arrlist.contains(s)) && map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }
        for(Integer k:map.values()){
            list.add(k);
        }
        int target=Collections.max(list);
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==target){
                return entry.getKey();
            }
        }
        return "";
    }
}

/*
Given an array arr containing N words consisting of lowercase characters. Your task is to find the most frequent word in the array. If multiple words have same frequency, then print the word whose first occurence occurs last in the array as compared to the other strings with same frequency.

Example 1:

Input:
N = 3
arr[] = {geeks,for,geeks}
Output: geeks
Explanation: "geeks" comes 2 times.
Example 2:

Input:
N = 2
arr[] = {hello,world}
Output: world
Explanation: "hello" and "world" both
have 1 frequency. We print world as
its first occurence comes last in the
input array.
*/

class Solution
{
    //Function to find most frequent word in an array of strings.
    public String mostFrequentWord(String arr[],int n)
    {
        // code here
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            list.add(entry.getValue());
        }
        int k=Collections.max(list);
        ArrayList<String> ans=new ArrayList<>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==k){
                ans.add(entry.getKey());
            }
        }
        return ans.get(ans.size()-1);
    }

}
