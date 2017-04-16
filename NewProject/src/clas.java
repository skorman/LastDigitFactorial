import java.sql.Time;
import java.util.Arrays;

public class clas {

public static String a = "b";
	
	public static int[] nums = {3, 5, -12, 32, 44};
	public static String[] strs = {"Hello", "Adam", "Sam", "Neolithic"};
	
	public static void main(String[] args) {
		long bui;
		long lastDig = 1;
		double time = System.currentTimeMillis() / 1000.0;
		for(long i = 2; i <= 1000000000; i++){
			Long j = new Long(i);
			if(i % 10 == 4){
				j = new Long(lastDigit(i * (i+1)));
				i++;
			}
			bui = lastDig * j.longValue();
			lastDig = lastDigit(bui);
		}
		double endTime = System.currentTimeMillis() / 1000.0;
		System.out.println(lastDig);
		System.out.println(endTime - time);
	}
	
	public static int[] insertionSort(int[] nums){
		for (int i = 1; i < nums.length; i++){
			int temp = nums[i];
			int n = i - 1;
			while(n >= 0 && nums[n] > temp){
				nums[n + 1] = nums[n];
				n--;
			}
			nums[n + 1] = temp;
		}
		return nums;
	}
	
	public static String[] selectionSort(String[] nums){
		for(int i = 0; i < nums.length; i++){
			int index = i;
			for(int j = i + 1; j < nums.length; j++){
				if(nums[i].compareTo(nums[j]) > 0){
					index = j;
				}
			}
			String temp = nums[i];
			nums[i] = nums[index];
			nums[index] = temp;
		}
		return nums;
	}
	
	public void insert(int[] nums){
		for(int i = 1; i < nums.length; i++){
			int temp = nums[i];
			int j = i - 1;
			while(j > -1 && nums[j] > temp){
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = temp;
		}
	}
	
	public static int binarySearch(int[] nums, int key){
		int high, mid, low;
		low = 0;
		high = nums.length - 1;
		while(high >= low){
			mid = (high + low) / 2;
			if(nums[mid] == key) return mid;
			else if(key > nums[mid]) low = mid + 1;
			else high = mid - 1;
		}
		return -1;
	}
	
	public static long bigNum(long num){
		long ans = 1;
		for(long i = 2; i <= num; i++){
			//System.out.println(ans);
			ans = ans * i;
		}
		//if(ans < 0) System.out.println("boi u dum");
		return ans;
	}
	
	public static long lastDigit(long num){
		while(num % 10 == 0){
			num /= 10;
		}
		return num % 10;
	}
	public static long secondLastDigit(long num){
		while(num % 10 == 0){
			num /= 10;
		}
		num /= 10;
		return num % 10;
	}
}
