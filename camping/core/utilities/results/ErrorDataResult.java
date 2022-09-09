package com.example.camping.core.utilities.results;

public final class ErrorDataResult<T> extends DataResult<T>{
    /*Hem data hem mesaj hem de true bilgisini gönderiyoruz super e*/
    public ErrorDataResult(T data,String message) {
        super(false,message,data);//Sub class'a Data bilgisi , mesaj ve başarılı olduğunu gösteren 'true' gönderdik.
    }

    public ErrorDataResult(T data){
        super(false,data);
    }
    /*sadece mesaj göndermek için*/
    public ErrorDataResult(String message) {
        super(false, message, null);
    }
}
