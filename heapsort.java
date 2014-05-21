public class HeapSort{

    /*
      Post condition: data is maxHeapified
     */
    public void heapify(int[] data){
	boolean working=true;
	int pointer=1;
	int heapified=1;
	if(data.length<=1) return;
	while(!working){
	    if(pointer==data.length-1){
		working=false;
	    }
	    int parent=(pointer+1)/2
	    if(data[pointer]>data[parent]){
		int tmp=data[pointer];
		data[pointer]=data[parent];
		data[parent]=temp;
		pointer--
	    }
	    else{
		pointer=heapify+1;
	    }
	}
    }

    /*
      Precondition: data is maxHeapified!
      Postcondition: data is sorted in ascending order
     */
    public void sort(int[] data){
	int 

    }

}
