import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class GetKey2 {
	public static void main(String[] args) {
		Map<String,String> map=new LinkedHashMap<String, String>();
		map.put("ram", "hari");
		map.put("cisco", "burfi");
		map.put("honeywell", "cs");
		map.put("cts", "hari");
		
		String value="hari";

		for(Entry<String, String> entry: map.entrySet())
		{
			if(entry.getValue().equals(value))
			{
				System.out.println(entry.getKey());
			}
		}
		
		
	}

}
