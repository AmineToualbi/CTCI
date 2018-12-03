#ifndef QUEUE_H
#define QUEUE_H

#include <iostream>

using namespace std;

template <typename T>
class Queue {
    
public:
    Queue(int s) : size(s), front(0), rear(-1), count (0) { data = new T[size]; }
    
    ~Queue() { cout << "Destructor called." << endl; }
    
    int getSize() { return count; }
    
    T peek() { return data[front]; }
    
    void queueUp(T element) {
        
        //Check if queue is full:
        if (count == size) {
            cout << "Queue is full." << endl;
            return;
        }
        
        rear = rear + 1;
        
        if(rear >= size) {
            for(int i=0; i<size; i++) {
                if(i + front >= size) {
                    data[i] = 0;
                }
                else {
                    data[i] = data[i+front];
                }
            }
            
            cout << "Adding " << element << " to queue." << endl;
            data[count] = element;
           // count++;
            front = 0;
            rear = count;
        }
        else {
            cout << "Adding " << element << " to queue." << endl;
            data[rear] = element;
            //count++;
        }
        count++;
        
        
    }
    
    void deQueue() {
        
        //Check if queue is empty:
        if (isEmpty()) {
            cout << "Queue is empty." << endl;
        }
        
        else {
            T element = data[front];
            cout << "Removing " << element << " from queue." << endl;
            front = front + 1;
            count--;
            //return element;
        }
        
    }
    
    bool isEmpty() {
        
        if(count == 0) {
            return true;
        }
        return false;
        
    }
    
    int getMaxSize() { return size; }
    
    void printQueue() {
        for(int i=front; i<size; i++) {
            cout << data[i] << " ";
        }
        cout << "\n";
    }
    
private:
    int size;
    int front;
    int rear;
    T* data;
    int count;

};


#endif

