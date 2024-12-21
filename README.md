# java8-dsa-project
"A collection of Java 8 features and Data Structures &amp; Algorithms (DSA) implementations. This repository demonstrates practical uses of Java 8 features like Streams and Lambda Expressions while solving various DSA problems. Includes code examples and explanations to enhance Java skills and understanding of algorithms."

## QUEUE
- A queue is a useful data structure in programming. It is similar to the ticket queue outside a cinema hall, where the first person entering the queue is the first person who gets the ticket.

- Queue follows the First In First Out (FIFO) rule - the item that goes in first is the item that comes out first.

- Representation of Queue in first in first out principle FIFO Representation of Queue

- In programming terms, putting items in the queue is called enqueue, and removing items from the queue is called dequeue.

### Working of Queue
Queue operations work as follows:

- two pointers FRONT and REAR
- FRONT track the first element of the queue
- REAR track the last element of the queue
- initially, set value of FRONT and REAR to -1

###### Enqueue Operation
- check if the queue is full
- for the first element, set the value of FRONT to 0
- increase the REAR index by 1
- add the new element in the position pointed to by REAR

###### Dequeue Operation
- check if the queue is empty
- return the value pointed by FRONT
- increase the FRONT index by 1
- for the last element, reset the values of FRONT and REAR to -1