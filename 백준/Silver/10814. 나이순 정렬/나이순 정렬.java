import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
		
        Person[] p = new Person[N];
 
		for(int i = 0; i < N; i++) {
            String input = br.readLine();
            String[] inputArr = input.split(" ");
			p[i] = new Person(Integer.parseInt(inputArr[0]), inputArr[1]);
		}

        Arrays.sort(p, (p1, p2) -> {
           return p1.age-p2.age; 
        });

        for(int i = 0; i < N; i++){
            bw.write(p[i].toString() + "\n");
        }

        bw.flush(); 
        bw.close();
 
				
	}
    
	public static class Person {
		int age;
		String name;
        
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
        
		@Override
		public String toString() {
			return age + " " + name;
		}
	}
 
}