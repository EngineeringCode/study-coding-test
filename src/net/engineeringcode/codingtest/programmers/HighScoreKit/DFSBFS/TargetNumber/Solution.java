package net.engineeringcode.codingtest.programmers.HighScoreKit.DFSBFS.TargetNumber;
import java.util.*;

public class Solution {
	/*
	 * ���α׷��ӽ� > �ڵ��׽�Ʈ ���� > ����/�ʺ� �켱 Ž��(DFS/BFS) > Ÿ�� �ѹ�
	 * https://programmers.co.kr/learn/courses/30/lessons/43165
	 * �ۼ���: �����ڵ�(engineeringcode93@gmail.com)
	 * ó�� ���ں��� ������ ���ڱ��� ���ϰų� ���� ��� ����� ���� ����ؾ��ϴ� �����̹Ƿ� DFS(Depth-first search)�� Ǫ�� ���� ���������� BFS(Breadth-First Search)�� Ǯ��ô�.
	 * 
	 */
	
    public int solution(int[] numbers, int target) {
    	int answer = 0;
    	
    	// To-Do
        
        return answer;
    }
           
    public static void main(String[] args) { 
    	Solution solution = new Solution();
    	
    	int[] numbers = new int[]{1, 1, 1, 1, 1};
    	int target = 3;
    	
    	int answerCorrect = 5;
    	int answerReturned = -1;
    	
		answerReturned = solution.solution(numbers, target);
		
		System.out.println("Returned Value == " + answerReturned);
		System.out.println("Expected Value == " + answerCorrect);
		
		if(answerCorrect == answerReturned){
			System.out.println("CASE 1 PASS");
		}else {
			System.out.println("CASE 1 FAIL");
		}
		
		numbers = new int[]{4, 1, 2, 1};
    	target = 4;
    	
    	answerCorrect = 2;
    	answerReturned = -1;
    	
		answerReturned = solution.solution(numbers, target);
		
		System.out.println("Returned Value == " + answerReturned);
		System.out.println("Expected Value == " + answerCorrect);
		
		if(answerCorrect == answerReturned){
			System.out.println("CASE 2 PASS");
		}else {
			System.out.println("CASE 2 FAIL");
		}
    }
}