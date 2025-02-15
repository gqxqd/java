import java.util.Date;
import java.text.SimpleDateFormat;
////////////////////////////////////////////////////////////////
class ArraySel {
	private long[] a; // ref to array a
	private int nElems; // number of data items
	// --------------------------------------------------------------
	public ArraySel(int max) // constructor
	{
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}
	// --------------------------------------------------------------
	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}
	// --------------------------------------------------------------
	public void display() // displays array contents
	{
		for (int j = 0; j < nElems; j++)
			// for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
	// --------------------------------------------------------------
	public void selectionSort() {
		int out, in, min;

		for (out = 0; out < nElems - 1; out++) // outer loop
		{
			min = out; // minimum
			for (in = out + 1; in < nElems; in++)
				// inner loop
				if (a[in] < a[min]) // if min greater,
					min = in; // we have a new min
			swap(out, min); // swap them
		}
	}
	// --------------------------------------------------------------
	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
////////////////////////////////////////////////////////////////
public class SelectSortApp {
	public static void main(String[] args) {
		int maxSize = 20000; // array size
		ArraySel arr; // reference to array
		arr = new ArraySel(maxSize); // create the array

		for(int j=0; j<maxSize; j++){ // random numbers
		    long n = (long)( java.lang.Math.random()*(maxSize-1) );
		    arr.insert(n);
		  }    

		System.out.println("before sorted");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");// 设置日期格式
		Date before = new Date();
		System.out.println(df.format(before));// new Date()为获取当前系统时间

		System.out.println("Sorting...");// new Date()为获取当前系统时间

		arr.selectionSort(); // selection-sort them

		System.out.println("after sorted");
		Date after = new Date();
		System.out.println(df.format(after));
		long interval = after.getTime() - before.getTime();// 计算时间间隔，毫秒单位

		System.out.println(interval);
	} 
} 