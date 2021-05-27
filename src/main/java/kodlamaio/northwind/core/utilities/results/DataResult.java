package kodlamaio.northwind.core.utilities.results;

import kodlamaio.northwind.entity.concretes.Product;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DataResult<T> extends Result{
    private T data;
    public DataResult(T data, boolean success, String message) {
        super(success, message);
        this.data = data;
    }
    public DataResult(T data, boolean success) {
        super(success);
        this.data = data;
    }
    public T getData(){
        return this.data;
    }

}
