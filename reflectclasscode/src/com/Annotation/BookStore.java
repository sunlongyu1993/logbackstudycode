package com.Annotation;

/**
 * @author 孙珑瑜
 * @version 20220301
 */
@BookAnnotation(value = "<<书名>>",price = 11,author = {"sly1"})
public class BookStore {
    @BookAnnotation(value = "<<书名method>>",price = 12,author = {"sly2"})
    public void bookmethod(){ }
}
