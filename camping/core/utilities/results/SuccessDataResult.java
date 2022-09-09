package com.example.camping.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T>{
        /*Hem data hem mesaj hem de true bilgisini gönderiyoruz super e*/
    public SuccessDataResult(T data,String message) {
        super(true,message,data);//Sub class'a Data bilgisi , mesaj ve başarılı olduğunu gösteren 'true' gönderdik.
    }

    public SuccessDataResult(T data){
        super(true,data);
    }
    /*sadece mesaj göndermek için*/
    public SuccessDataResult(String message){
        super(true,message,null);
    }

}
