import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int N = scan.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		int M = scan.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			int num = scan.nextInt();
			sb.append(upperBound(arr, num) - lowerBound(arr, num)).append(' ');
		}
		System.out.println(sb);
	}
 
 
	public static int lowerBound(int[] arr, int a) {
		int lo = 0; 
		int hi = arr.length; 
 
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if(a <= arr[mid]) {
				hi = mid;
			}else{
				lo = mid + 1;
			}
		}
 
		return lo;
	}
 
	public static int upperBound(int[] arr, int a) {
		int lo = 0; 
		int hi = arr.length; 
 
		while (lo < hi) {
			int mid = (lo + hi) / 2; 
			if (a < arr[mid]) {
				hi = mid;
			}else {
				lo = mid + 1;
			}
		}
 
		return lo;
	}
	
}
