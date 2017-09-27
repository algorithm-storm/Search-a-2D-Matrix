public class Solution {

    public static void main(String []arg){

        int [][] A = {{1, 3, 5, 7},
                    {10, 11, 16, 20},
                    {23, 30, 34, 50}};
        Solution t = new Solution();
        System.out.println(t.searchMatrix(A,3));

    }

    /*
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */

    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix == null || matrix.length == 0){
            return false;
        }
        if(matrix[0] == null || matrix[0].length == 0){
            return false;
        }

        int row = matrix.length;
        int column = matrix[0].length;
        int start = 0;
        int end = row * column -1;

        while(start <= end){
            int mid = end - start /2 + start;
            int midNum = matrix[mid/column][mid%column];
            if(midNum == target){
                return true;
            }
            if(midNum < target){
                start = mid + 1;
            }
            if(midNum > target){
                end = mid - 1;
            }
        }
        return false;
    }
}