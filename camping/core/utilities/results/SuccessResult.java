package com.example.camping.core.utilities.results;

//SuccessResult demek işlem sonucu başarılı demek. Yani uğraşmamak adına yapıyoruz.
public class SuccessResult extends Result{
    public SuccessResult() {
        super(true);
    }
    public SuccessResult(String message) {
        super(true,message);
    }
}
