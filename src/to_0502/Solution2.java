package to_0502;
/*3-5. CPU 스케줄링 */
//CPU 스케쥴링
import java.util.*;
class Solution2 {
	public int[] solution(int[][] tasks){
		int[] answer = {};
			
		return answer;
	}

	public static void main(String[] args){
		Solution2 T = new Solution2();
		System.out.println(Arrays.toString(T.solution(new int[][]{{2, 3}, {1, 2}, {8, 2}, {3, 1}, {10, 2}})));
		System.out.println(Arrays.toString(T.solution(new int[][]{{5, 2}, {7, 3}, {1, 3}, {1, 5}, {2, 2}, {1, 1}})));
		System.out.println(Arrays.toString(T.solution(new int[][]{{1, 2}, {2, 3}, {1, 3}, {3, 3}, {8, 2}, {1, 5}, {2, 2}, {1, 1}})));
		System.out.println(Arrays.toString(T.solution(new int[][]{{999, 1000}, {996, 1000}, {998, 1000}, {999, 7}})));
	}
}