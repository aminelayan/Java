import java.util.Set;
import java.util.HashMap;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Track 1 Title", "Track 1 Lyrics");
        userMap.put("Track 2 Title", "Track 2 Lyrics");
        userMap.put("Track 3 Title", "Track 3 Lyrics");
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println("Track: "+ key + " | Lyrics: "+ userMap.get(key));
        }
    }
}

