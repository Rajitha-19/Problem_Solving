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
