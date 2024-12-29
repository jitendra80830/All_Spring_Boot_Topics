package ashok.it.rest;

public class ProductExceptionHandler extends RuntimeException{

    public ProductExceptionHandler(){

    }

    public ProductExceptionHandler(String msg){
        super(msg);
    }
}
