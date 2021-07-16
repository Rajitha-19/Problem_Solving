/*
Ex:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> empty=new ArrayList<>();
        int m=matrix.length;

        if(m==0){
            return empty;
        }
        int n=matrix[0].length;
        int toprow=0,bottomrow=m-1,leftcol=0,rightcol=n-1;
        int dir=0;
        while(toprow<=bottomrow && leftcol<=rightcol){
            if(dir==0){
                for(int i=leftcol;i<=rightcol;i++){
                    list.add(matrix[toprow][i]);
                }
                toprow++;
            }
            else if(dir==1){
                for(int k=toprow;k<=bottomrow;k++){
                    list.add(matrix[k][rightcol]);
                }
                rightcol--;
            }
            else if(dir==2){
                for(int l=rightcol;l>=leftcol;l--){
                    list.add(matrix[bottomrow][l]);
                }
                bottomrow--;
            }
            else if(dir==3){
                for(int j=bottomrow;j>=toprow;j--){
                    list.add(matrix[j][leftcol]);
                }
                leftcol++;
            }
            dir=(dir+1)%4;
        }
        return list;
    }
}
