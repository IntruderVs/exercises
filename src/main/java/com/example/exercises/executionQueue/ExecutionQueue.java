package com.example.exercises.executionQueue;

/**
 * The creation of a new ExecutionQueue witch says "execute 'this' then do the next" - the queue
 */

@FunctionalInterface
public interface ExecutionQueue {
    void execute();

    default ExecutionQueue oneMoreExecute(ExecutionQueue next) {
        return () -> {
            this.execute();
            next.execute();
        };
    }
}
