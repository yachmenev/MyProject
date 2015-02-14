package reversList;

/**
 * Created by Admin on 30.11.14.
 */
public class Type {
    String str;
    Integer i;

    public Type(Object obj){
        if (obj instanceof String){
            str = (String) obj;
        } else if (obj instanceof Integer){
            i = (Integer) obj;
        } else {
            new IllegalStateException("illegal");
        }
    }

    @Override
    public String toString() {
        if (str != null){
            return str;
        } else {
            return i.toString();
        }
    }
}
