package supportArray;
import java.util.function.Predicate;

public class SupportArray{
     public static <T> boolean every(T[] arr, Predicate<T> cond) {
          for (T i : arr) {
               if (!cond.test(i)) {
                    return false;
               }
          }
          return true;
     }

     public static <T> boolean some(T[] arr, Predicate<T> cond) {
          for (T i : arr) {
               if (cond.test(i)) {
                    return true;
               }
          }
          return false;
     }
}
