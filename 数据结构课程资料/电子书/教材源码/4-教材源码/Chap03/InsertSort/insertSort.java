// insertSort.java
// demonstrates insertion sort
// to run this program: C>java InsertSortApp
import java.util.Date;
import java.text.SimpleDateFormat;
//--------------------------------------------------------------
class ArrayIns
   {
   private long[] a;                 // ref to array a
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public ArrayIns(int max)          // constructor
      {
      a = new long[max];                 // create the array
      nElems = 0;                        // no items yet
      }
//--------------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      a[nElems] = value;             // insert it
      nElems++;                      // increment size
      }
//--------------------------------------------------------------
   public void display()             // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         System.out.print(a[j] + " ");  // display it
      System.out.println("");
      }
//--------------------------------------------------------------
   public void insertionSort()
      {
      int in, out;

      for(out=1; out<nElems; out++)     // out is dividing line
         {
         long temp = a[out];            // remove marked item
         in = out;                      // start shifts at out
         while(in>0 && a[in-1] >= temp) // until one is smaller,
            {
            a[in] = a[in-1];            // shift item to right
            --in;                       // go left one position
            }
         a[in] = temp;                  // insert marked item
         }  // end for
      }  // end insertionSort()
//--------------------------------------------------------------
   }  // end class ArrayIns
////////////////////////////////////////////////////////////////
class insertSort//InsertSortApp
   {
   public static void main(String[] args)
      {
      int maxSize = 20000;            // array size
      ArrayIns arr;                 // reference to array
      arr = new ArrayIns(maxSize);  // create the array

      /*arr.insert(77);               // insert 10 items
      arr.insert(99);
      arr.insert(44);
      arr.insert(55);
      arr.insert(22);
      arr.insert(88);
      arr.insert(11);
      arr.insert(00);
      arr.insert(66);
      arr.insert(33);*/

      //arr.display();                // display items

		for(int j=0; j<maxSize; j++){ // random numbers
		    long n = (long)( java.lang.Math.random()*(maxSize-1) );
		    arr.insert(n);
		} 
		
		System.out.println("before sorted");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");//设置日期格式
        Date before = new Date();
        System.out.println(df.format(before));// new Date()为获取当前系统时间 

        System.out.println("Sorting...");// new Date()为获取当前系统时间 

		arr.insertionSort();          // insertion-sort them
    
        System.out.println("after sorted");
        Date after = new Date();    
        System.out.println(df.format(after));    
        long interval=after.getTime()-before.getTime();// 计算时间间隔，毫秒单位

        System.out.println(interval);


      //arr.display();                // display them again
      }  // end main()
   }  // end class InsertSortApp
