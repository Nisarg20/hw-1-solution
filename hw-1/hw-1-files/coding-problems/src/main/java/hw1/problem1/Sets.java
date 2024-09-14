package hw1.problem1;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
public class Sets {
    public static Set intersection(Set s1, Set s2) {
    // Effects: Return a (non null) Set equal to the intersection of sets s1 and s2
    // A null argument is treated as an empty set
	// complete the implemenation below
        Set res = new HashSet<>();

        if (s1 == null || s2 == null){
            return res;
        }
        for (Object ele : s1){
            if (s2.contains(ele)){
                res.add(ele);
            }
        }

        return res;
    }
}
