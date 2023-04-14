package me.will0mane.libs.uranus.executor;

import lombok.SneakyThrows;
import me.will0mane.libs.uranus.executor.exception.ExecutorDownException;

import java.util.UUID;

@SuppressWarnings("unused")
public abstract class BiExecutor<T,U,R> {

    private boolean executorDown = false;
    private final UUID executorID = UUID.randomUUID();

    public void executorDown(){
        executorDown = true;
    }

    public void start(){
        executorDown = false;
    }

    @SneakyThrows
    public R process(T data1, U data2){
        if(executorDown) {
            throw new ExecutorDownException(executorID);
        }
        return workerTask(data1, data2);
    }

    protected abstract R workerTask(T data1, U data2);

}
