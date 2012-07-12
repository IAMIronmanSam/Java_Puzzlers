import java.util.*;

public class Name1 {
    private String first, last;

    public Name11(String first, String last) {
        this.first = first; this.last = last;
    }

    public boolean equals(Name1 n) {
        return n.first.equals(first) && n.last.equals(last);
    }

    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode(); 
    }

    public static void main(String[] args) {
        Set<Name1> s = new HashSet<Name1>();
        s.add(new Name1("Donald", "Duck"));
        System.out.println(
            s.contains(new Name1("Donald", "Duck")));
    }
}
