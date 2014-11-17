package kata;

import java.util.HashMap;
import java.util.Map;

public class Lcd {

    private Map<Integer, String[]> cases = new HashMap<Integer, String[]>();
    public Lcd() {
	cases.put(7, new String[]{" _ ", "  |", "  |"});
	cases.put(1, new String[]{"  |", "  |", "  |"});
	cases.put(2, new String[]{" _ ", " _|", "|_ "});
    }
    public String display(int i) {
	String nl = "\n";
	String result = "";
	for (int j = 0; j < 3; j++) {
	    result += cases.get(i)[j];
	    result +=  nl;
	}
	return result;
    }

}
