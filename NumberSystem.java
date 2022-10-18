package task;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberSystem {
		public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int nthNumber = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		int startIndex = 2;
		for(int i=0;i<20;i++){
		list.add((i+startIndex) ,((list.get(i)*10)+3));
		startIndex++;
		list.add((i+startIndex),((list.get(i)*10)+4));
		}
		System.out.print(list.get((nthNumber)-1));
		}		
}
