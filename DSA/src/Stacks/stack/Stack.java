package Stacks.stack;

import DSAbase.StaticDSA;

public class Stack<T> extends StaticDSA<T> {
    private T[] Object;
    public Stack(){
        super();
    }

    public Stack(int capacity){
        super(capacity);
    }

    //Stacks element
    public void empilha(T element) throws Exception{
        super.adding(element);
    }

    //
    public T top(){
        if(this.isEmpty()){
            return null;
        }
        return this.elementos[arrSize-1];
    }

    //Unstack element
    public T unStack(){
        if(this.isEmpty()){
            return null;
        }
//        T element = this.elementos[arrSize-1];
//        arrSize--;
        return this.elementos[--arrSize];
    }

}
