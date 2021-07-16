class Atoi
{
    int atoi(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                count++;
            }
        }
        if(count==0){
            return Integer.parseInt(str);
          
        }
        return -1;
    }
}
