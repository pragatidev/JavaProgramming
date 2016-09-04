Mutual Exclusion

"The primary challenge of concurrency is managing access to shared, mutable state" — R. Mark Volkmann. Volkmann is right.


There is three very important concepts when doing concurrent programming :

Atomicity : An operation is said atomic when it cannot be interrupted. There is almost no atomic operations in Java, the only we've is the assignation a = 5, but a = b++ is not atomic. In some cases, you'll have to make atomic some actions with synchronization, we'll see later how to do that.
Visibility : This occurs when a thread must watch the actions of an other threads by example the termination of the thread. This also implies some kind of synchronization.
Order of execution : When you have normal program, all you lines of code run in the same order every time you launch the application. This is not the case when you make concurrent programming. You first instruction can followed by an instruction of the thread B or by the first instruction. And that can change every time you launch the application. The order of execution is not guaranteed ! I will certainly repeat that sometimes, but that's important to know.

Semaphore:
1. Critical Section
2. Order of Execution between the processes
3. Resource management

wait(S) {
while (S<=0)
;
S=S-1;
}

Signal(S) {
S=S+1;
}

Every process has to call wait to go to Critical Section Data.

Bounded wait doesn't work.

Order Of Execution
Two Semaphores