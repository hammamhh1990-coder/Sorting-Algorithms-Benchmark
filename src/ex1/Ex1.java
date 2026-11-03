//3168158
//همام سالم بن غزي
package ex1;
import java.util.Arrays;
import java.util.Random;
public class Ex1 
{
    public static long[][] timer1 = new long[5][4];
    public static void selection_sort(int a[],int n)
    {
        int i,j,smallast;
        int temp;
        
        if(n<2)
            return ;
        
        for(i=0;i<n-1;++i)
        {
            smallast = i;
            for(j=i+1;j<n;++j)
            {
                if(a[smallast]>a[j])
                {
                    smallast=j;
                }
            }
            
            temp = a[i];
            a[i]= a[smallast];
            a[smallast]=temp;
        }
    }
    
    public static void selection_sort_Reversed(int a[],int n)
    {
        int i,j,smallast;
        int temp;
        
        if(n<2)
            return ;
        
        for(i=0;i<n-1;++i)
        {
            smallast = i;
            for(j=i+1;j<n;++j)
            {
                if(a[smallast]<a[j])
                {
                    smallast=j;
                }
            }
            
            temp = a[i];
            a[i]= a[smallast];
            a[smallast]=temp;
        }
    }
    
    public static void Insertion_sort(int s[],int n)
    {
        int j;
        int temp;
        
        if(n<2) return;
        
        for(int i=1;i<n;++i)
        {
            temp = s[i];
            for(j=i;j>0 && s[j-1]>temp;--j)
            {
                s[j]=s[j-1];
            }
            s[j]=temp;
        }
    }
    
    public static void Bubble_Sort(int A[], int n)
    {
        int i,j;
        int temp;
        boolean swap = true;
        
        if(n<2)
            return;
        
        for(i=0;swap && i<n-1;++i)
        {
            swap=false;
            for(j=0;j<n-1;++j)
            {
                if(A[j]>A[j+1])
                {
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                    swap=true;
                }
                    
            }
        }
    }
    
    
    public static int partition(int[] A, int left, int right) 
    {
        Random r = new Random();
        int rIndex = r.nextInt(right-left+1)+left;
        
        int temps = A[rIndex];
        A[rIndex]=A[left];
        A[left]=temps;
        
        int x = A[left];
        int i = left;

        for (int j = left + 1; j <= right; j++) 
        {
            if (A[j] < x) 
            {
                i = i + 1;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i];
        A[i] = A[left];
        A[left] = temp;
 
        return i;
    }
    
    
    public static void quickSort(int[] A, int left, int right) 
    {
        if (left >= right) 
        {
            return;
        }
        int middle = partition(A, left, right);
        quickSort(A, left, middle - 1);
        quickSort(A, middle + 1, right);
    }
    

    public static void mergeSort(int[]A, int left, int right) 
    {
        if (left >= right) 
        {
            return;
        }
        int middle = (left + right) / 2;
        mergeSort(A, left, middle);
        mergeSort(A, middle + 1, right);
        merge(A, left, middle, right);
    }

    public static void merge(int[] A, int left, int middle, int right) 
    {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] L = new int[n1];
        int[] R = new int[n2];
        
        for (int i=0;i<n1;i++) 
        {
            L[i] = A[left+i];
        }
        for (int j=0;j<n2;j++) 
        {
            R[j]=A[middle+1+j];
        }
        
        int i = 0;
        int j = 0;
        int k=left;
        
        while (i<n1&&j<n2) 
        {
            if (L[i]<R[j]) 
            {
                A[k++] = L[i++];
            } 
            else 
            {
                A[k++]=R[j++];
            }
        }
        
        while(i<n1) 
        {
            A[k++]=L[i++];
        }
        
        while (j<n2) 
        {
            A[k++]=R[j++];
        }
    }

    
    public static long S1selection_sort(int s[],int size)
    {
        int []arr = s.clone();
        double sec = 1000000000.0;
        long STime= System.nanoTime();
        selection_sort(arr,size);
        long ETime = System.nanoTime();
        long time = ETime-STime;
        double second = time/sec;
        double micro = time/1000;
        System.out.println("******************************");
        System.out.println("Selection Sort");
        System.out.println("Time in Nanoseconds : "+ time + "ns");
        System.out.println("Time in Microseconds : "+micro+"μs");
        System.out.println("Time by Second : "+ second + "s");
        System.out.println("******************************");
        return time;
    }
    
    public static long S1Insertion_sort(int s[],int size)
    {
        int []arr = s.clone();
        double sec = 1000000000.0;
        long STime= System.nanoTime();
        Insertion_sort(arr,size);
        long ETime = System.nanoTime();
        long time = ETime-STime;
        double second = time/sec;
        double micro = time/1000;
        System.out.println("******************************");
        System.out.println("Insertion sort");
        System.out.println("Time in Nanoseconds : "+ time + "ns");
        System.out.println("Time in Microseconds : "+micro+"μs");
        System.out.println("Time by Second : "+ second + "s");
        System.out.println("******************************");
        return time;
    }
    
    public static long S1Bubble_Sort(int s[],int size)
    {
        int []arr = s.clone();
        double sec = 1000000000.0;
        long STime= System.nanoTime();
        Bubble_Sort(arr,size);
        long ETime = System.nanoTime();
        long time = ETime-STime;
        double second = time/sec;
        double micro = time/1000;
        System.out.println("******************************");
        System.out.println("Bubble Sort");
        System.out.println("Time in Nanoseconds : "+ time + "ns");
        System.out.println("Time in Microseconds : "+micro+"μs");
        System.out.println("Time by Second : "+ second + "s");
        System.out.println("******************************");
        return time;
    }
    
    public static long S1quickSort(int s[],int size)
    {
        int []arr = s.clone();
        double sec = 1000000000.0;
        long STime= System.nanoTime();
        quickSort(arr,0,size-1);
        long ETime = System.nanoTime();
        long time = ETime-STime;
        double second = time/sec;
        double micro = time/1000;
        System.out.println("******************************");
        System.out.println("Quick Sort");
        System.out.println("Time in Nanoseconds : "+ time + "ns");
        System.out.println("Time in Microseconds : "+micro+"μs");
        System.out.println("Time by Second : "+ second + "s");
        System.out.println("******************************");
        return time;
    }
    
    public static long S1mergeSort(int s[],int size)
    {
        int []arr = s.clone();
        double sec = 1000000000.0;
        long STime= System.nanoTime();
        mergeSort(arr,0,size-1);
        long ETime = System.nanoTime();
        long time = ETime-STime;
        double second = time/sec;
        double micro = time/1000;
        System.out.println("******************************");
        System.out.println("Merge Sort");
        System.out.println("Time in Nanoseconds : "+ time + "ns");
        System.out.println("Time in Microseconds : "+micro+"μs");
        System.out.println("Time by Second : "+ second + "s");
        System.out.println("******************************");
        return time;
    }
    
    public static void Scenario1(int s[],int size)
    {
        System.out.println("Scenario 1 Rendom Array");
        
        //Selection Sort
        long tselection_sort = S1selection_sort(s,size);
        timer1[0][0]=tselection_sort/1000;
        
        //Insertion sort
        long tInsertion_sort = S1Insertion_sort(s,size);
        timer1[1][0]=tInsertion_sort/1000;
        
        //Bubble_Sort
        long tBubbleSort = S1Bubble_Sort(s,size);
        timer1[2][0]=tBubbleSort/1000;
        
        //Quick Sort
        long tQuickSort = S1quickSort(s,size);
        timer1[3][0]=tQuickSort/1000;
        
        //Merge Sort
        long tmergeSort = S1mergeSort(s,size);
        timer1[4][0]=tmergeSort/1000;
        
        long minTime1 = Math.min(Math.min(tselection_sort, tInsertion_sort),Math.min(tBubbleSort, tQuickSort));
        long minTime = Math.min(minTime1, tmergeSort);
        String fastest="";
        if(minTime==tselection_sort)
        {
            fastest = "selection Sort";
        }
        else if(minTime==tInsertion_sort)
        {
            fastest = "Insertion Sort";
        }
        else if(minTime==tBubbleSort)
        {
            fastest = "Bubble Sort";
        }
        else if(minTime==tQuickSort)
        {
            fastest = "Quick Sort";
        }
        else if(minTime==tmergeSort)
        {
            fastest="Merge Sort";
        }
        System.out.println("The Fastest is "+fastest);
    }
    
    public static void Scenario2(int s[],int size)
    {
        System.out.println("Scenario 2 Sorted Array");
        int []arr = s.clone();
        Arrays.sort(arr);
        
        //Selection Sort
        long tselection_sort = S1selection_sort(arr,size);
        timer1[0][1]=tselection_sort/1000;
        
        //Insertion sort
        long tInsertion_sort = S1Insertion_sort(arr,size);
        timer1[1][1]=tInsertion_sort/1000;
        
        //Bubble_Sort
        long tBubbleSort = S1Bubble_Sort(arr,size);
        timer1[2][1]=tBubbleSort/1000;
        
        //Quick Sort
        long tQuickSort = S1quickSort(arr,size);
        timer1[3][1]=tQuickSort/1000;
        
        //Merge Sort
        long tmergeSort = S1mergeSort(arr,size);
        timer1[4][1]=tmergeSort/1000;
        
        long minTime1 = Math.min(Math.min(tselection_sort, tInsertion_sort),Math.min(tBubbleSort, tQuickSort));
        long minTime = Math.min(minTime1, tmergeSort);
        String fastest="";
        if(minTime==tselection_sort)
        {
            fastest = "selection Sort";
        }
        else if(minTime==tInsertion_sort)
        {
            fastest = "Insertion Sort";
        }
        else if(minTime==tBubbleSort)
        {
            fastest = "Bubble Sort";
        }
        else if(minTime==tQuickSort)
        {
            fastest = "Quick Sort";
        }
        else if(minTime==tmergeSort)
        {
            fastest="Merge Sort";
        }
        System.out.println("The Fastest is "+fastest);
    }
    
    public static void Scenario3(int s[],int size)
    {
        System.out.println("Scenario 3 Inversely Sorted Array");
        int []arr = s.clone();
        selection_sort_Reversed(arr,size);
        
        //Selection Sort
        long tselection_sort = S1selection_sort(arr,size);
        timer1[0][2]=tselection_sort/1000;
        
        //Insertion sort
        long tInsertion_sort = S1Insertion_sort(arr,size);
        timer1[1][2]=tInsertion_sort/1000;
        
        //Bubble_Sort
        long tBubbleSort = S1Bubble_Sort(arr,size);
        timer1[2][2]=tBubbleSort/1000;
        
        //Quick Sort
        long tQuickSort = S1quickSort(arr,size);
        timer1[3][2]=tQuickSort/1000;
        
        //Merge Sort
        long tmergeSort = S1mergeSort(arr,size);
        timer1[4][2]=tmergeSort/1000;
        
        long minTime1 = Math.min(Math.min(tselection_sort, tInsertion_sort),Math.min(tBubbleSort, tQuickSort));
        long minTime = Math.min(minTime1, tmergeSort);
        String fastest="";
        if(minTime==tselection_sort)
        {
            fastest = "selection Sort";
        }
        else if(minTime==tInsertion_sort)
        {
            fastest = "Insertion Sort";
        }
        else if(minTime==tBubbleSort)
        {
            fastest = "Bubble Sort";
        }
        else if(minTime==tQuickSort)
        {
            fastest = "Quick Sort";
        }
        else if(minTime==tmergeSort)
        {
            fastest="Merge Sort";
        }
        System.out.println("The Fastest is "+fastest);
    }
    
    public static void Scenario4(int s[],int size)
    {
        System.out.println("Scenario 4 Sorted by 20% Array");
        int []arr = s.clone();
        int tp = size/5;
        Arrays.sort(arr, 0, tp);
        
        //Selection Sort
        long tselection_sort = S1selection_sort(arr,size);
        timer1[0][3]=tselection_sort/1000;
        
        //Insertion sort
        long tInsertion_sort = S1Insertion_sort(arr,size);
        timer1[1][3]=tInsertion_sort/1000;
        
        //Bubble_Sort
        long tBubbleSort = S1Bubble_Sort(arr,size);
        timer1[2][3]=tBubbleSort/1000;
        
        //Quick Sort
        long tQuickSort = S1quickSort(arr,size);
        timer1[3][3]=tQuickSort/1000;
        
        //Merge Sort
        long tmergeSort = S1mergeSort(arr,size);
        timer1[4][3]=tmergeSort/1000;
        
        long minTime1 = Math.min(Math.min(tselection_sort, tInsertion_sort),Math.min(tBubbleSort, tQuickSort));
        long minTime = Math.min(minTime1, tmergeSort);
        String fastest="";
        if(minTime==tselection_sort)
        {
            fastest = "selection Sort";
        }
        else if(minTime==tInsertion_sort)
        {
            fastest = "Insertion Sort";
        }
        else if(minTime==tBubbleSort)
        {
            fastest = "Bubble Sort";
        }
        else if(minTime==tQuickSort)
        {
            fastest = "Quick Sort";
        }
        else if(minTime==tmergeSort)
        {
            fastest="Merge Sort";
        }
        System.out.println("The Fastest is "+fastest);
    }
    
    public static void main(String[] args) 
    {
        int []x = new Random().ints(100000).toArray();
        
        Scenario1(x,x.length);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Scenario2(x,x.length);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Scenario3(x,x.length);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        Scenario4(x,x.length);
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("----------------------------------------------------------------------------------------------------------");
        String[] algorithms = {"Selection Sort", "Insertion Sort", "Bubble Sort","Quick Sort","Merge Sort"};
        System.out.println("Algorithms            "+ "  Random        "+ "        Sorted    "+"         Inversely Sorted   "+"      Partially Sorted  ");
        System.out.println("----------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < algorithms.length; i++) 
        {
            System.out.printf(java.util.Locale.US,"%-18s | %-12d μs     | %-12d μs     | %-12d μs     | %-12d μs%n",
                    algorithms[i], 
                    timer1[i][0], 
                    timer1[i][1], 
                    timer1[i][2], 
                    timer1[i][3]);
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
}