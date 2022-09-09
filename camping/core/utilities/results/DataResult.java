package com.example.camping.core.utilities.results;

public class DataResult<T> extends Result{ //DataResult'a hangi tipte veri döndüreceğimizi geçiyoruz(Yani hangi entity).
    private T data;
    public DataResult(boolean success, String message,T data) {
        super(success, message); //parametreye geçilen 2 tipi,Super class'ın constructor parametlerlerine yolla demek.
        this.data = data;
    }
    public DataResult(boolean success,T data) {
        super(success);
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
