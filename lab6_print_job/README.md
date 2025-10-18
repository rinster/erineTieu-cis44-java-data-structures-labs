# Lab Project 2: Print Job Simulator
Operating systems often manage shared resources like printers using a queue. When multiple users send documents to a printer, the jobs are processed in the order they were received. This lab simulates a simple print queue using the FIFO principle.

### Objective
You will complete two classes: PrintJob and Printer. The Printer class will use a Queue to manage a list of PrintJob objects. You will implement methods to add a job to the queue and to process the next job in the queue.

### Requirements
Complete the PrintJob class to store a document name and the number of pages.
In the Printer class, you must use a Queue to store the print jobs. A LinkedQueue is recommended as the number of jobs is unknown.
Implement the addJob(PrintJob job) method to enqueue a new print job.
Implement the processNextJob() method to dequeue the job at the front of the queue and simulate "printing" it by displaying a message.