package ru.task.four;

public class TaskFour {
	
	public int findSecondMaxElement(int[][][] mas) throws Exception {
		if(mas.length<2 || mas.length!=mas[0].length || mas[0].length!=mas[0][0].length)
			throw new Exception("Array size must be NxNxN");
		int[] maxEl=new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
		for(int i=0; i<mas.length; i++) {
			if(maxEl[0]<mas[i][i][i]) 
				swap(maxEl, mas[i][i][i]);
			if(maxEl[0]<mas[i][i][mas.length-1-i])
				swap(maxEl, mas[i][i][mas.length-1-i]);
			if(maxEl[0]<mas[i][mas.length-1-i][i])
				swap(maxEl, mas[i][mas.length-1-i][i]);
			if(maxEl[0]<mas[mas.length-1-i][i][i])
				swap(maxEl, mas[mas.length-1-i][i][i]);
		}
		return maxEl[1];
	}
	
	private void swap(int[] array, int val) {
		array[1]=array[0];
		array[0]=val;
	}
}
