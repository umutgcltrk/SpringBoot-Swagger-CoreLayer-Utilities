package com.example.camping.core.utilities.results;

/*Not core katmanı uygulamanın her yerinde kullanılan kodların içerildiği alan
 Burada ise , Crud işlemlerinin sonuçlarını mesaj olarak bildiriyor.
* */
public class Result {
    private boolean success;
    private String message;
    public Result(boolean success){
        this.success = success;
    }
    public Result(boolean success,String message){
        this(success); //Bu classdaki(this) tek parametreli olan constructor'ı çağır demek.
        this.message = message;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }
}
