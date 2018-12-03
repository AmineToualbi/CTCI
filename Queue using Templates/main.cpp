#include "Queue.h"
#include <iostream>
#include <string>

using namespace std;

int main() {
    
    Queue<int> intQueue(5);
    
    cout << "SIZE " << intQueue.getSize() << endl;
    
    for(int i=0; i<intQueue.getMaxSize()+2; i++) {
        intQueue.queueUp(i);
        cout << "SIZE " << intQueue.getSize() << endl;
    }
    
    intQueue.printQueue();
    
    intQueue.deQueue();
    intQueue.deQueue();
    
    intQueue.printQueue();
    
    intQueue.queueUp(8);
    intQueue.queueUp(1);
    intQueue.queueUp(11);
    cout << "Peek = " << intQueue.peek() << endl;
    
    
    intQueue.printQueue();
    
    
    Queue<char> charQueue(4);
    
    
    cout << "SIZE " << charQueue.getSize() << endl;
    
    charQueue.queueUp('b');
    charQueue.queueUp('i');
    charQueue.queueUp('l');
    charQueue.deQueue();
    charQueue.queueUp('y');
    cout << "Peek = " << charQueue.peek() << endl;



    charQueue.printQueue();
    cout << "SIZE " << charQueue.getSize() << endl;



    
    
}
