package collections;
import java.util.Arrays;

import org.apache.logging.log4j.LogManager;


public class Define<E>
{
private int size=0;
private static final int dsize=10;
private static final org.apache.logging.log4j.Logger priya1 =LogManager.getLogger(Define.class);

private Object ele[];

public Define() {
    ele = new Object[dsize];
    for(int var=0;var<dsize;var++)
    {
    	ele[size++]=var+2;
    }
}

public void add(E e)
{
	if (size == ele.length) {
        extendCapacity();
    }
    ele[size++] = e;
}

private void extendCapacity() {
    int newSize = ele.length * 3;
    ele = Arrays.copyOf(ele, newSize);
}

public E get(int i) {
	i=i-1;
	try {
    if (i >= size || i < 0) {
 }
    }
	catch(Exception e){
		priya1.info("Out of range");
	}
    return (E) ele[i];
}

public E remove(int i) {
	i=i-1;
	try {
    if (i >= size || i < 0) {
          }}
	catch(Exception e)
	{
		priya1.info("Index does't exist");
	}
	 Object item = ele[i];
    int numElts = ele.length - ( i + 1 ) ;
    System.arraycopy( ele, i + 1, ele, i, numElts ) ;
    size--;
    return (E) item;
}

public int size() {
    return size;
}


@Override
public String toString() 
{
     StringBuilder sb = new StringBuilder();
    
     for(int i = 0; i < size ;i++) {
         sb.append(ele[i].toString());
         if(i<size-1){
             sb.append("  ");
         }
     }

     return sb.toString();
}


}
