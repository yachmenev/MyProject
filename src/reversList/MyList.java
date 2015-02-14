package reversList;

/**
 * Created by Admin on 30.11.14.
 */
public class MyList {
    Object head;
    Object value;
    Object next;

    public MyList(){

    }
    public MyList(Object object){
        this.value = object;
    }
    public void add(Object object){
        if (head == null){
            head = object;
            value = object;
        } else {
            next = new MyList(object);
        }
    }
    public boolean hasNext(){
        if (next != null){
            return true;
        } else {
            return false;
        }
    }

    public void print(){
        System.out.println(value.toString());
    }

}
