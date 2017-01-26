package com.concurrent;

public class ConcurrentStack1 {
	
	 public ConcurrentStack1()
     {
         _head = new Node(default(T), _head);
         _objLock = new object();
         _isEmpty = true;
     }
 
     
 
     public void Push(T item)
     {
         lock (_objLock)
         {
             _head = new Node(item, _head);
             if (!_isEmpty)
                 _isEmpty = false;
         }
     }
 
     public T Pop()
     {
         T item;
         lock (_objLock)
         {
             if (_head._next == null)
                 throw new IndexOutOfRangeException("Stack is empty");
 
              item = _head._item;
             _head = _head._next;
 
             if (_head._next == null)
                 _isEmpty = true;
         }
          
         return item;
     }
 }

}
