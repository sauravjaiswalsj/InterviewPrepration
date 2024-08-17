import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

class LRUCache extends LinkedHashMap<Integer, String> {
	private static final long serialVersionUID = 1l;
	private static final int MAX_ENTRIES = 5;

	public LRUCache(){
		super(16, 0.75f, true);
	}

	@Override
	protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest){
		return size() > MAX_ENTRIES;
	}
}

public class LRUCacheMain{
	public static void main(String[] args){

		LinkedHashMap<Integer, String> lruCache = new LRUCache();

		lruCache.put(1784 , "Thr GodFather");
		lruCache.put(1202, "TItanic");
		lruCache.put(1503, "Jaws");
		lruCache.put(1501, "Saying Private Ryan");
		lruCache.put(2501, "Back to the Future");

		System.out.println("Added 5 entries\n");

		for(Entry<Integer, String> entry : lruCache.entrySet()){
			System.out.println(entry);
		}

		lruCache.get(1784);
		System.out.println();
		for(Entry<Integer, String> entry : lruCache.entrySet()){
			System.out.println(entry);
		}

	
	}
}


