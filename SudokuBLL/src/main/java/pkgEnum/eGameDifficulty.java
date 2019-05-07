package pkgEnum;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Iterator;

public enum eGameDifficulty implements Serializable, Comparable<eGameDifficulty> {
	EASY (100), MEDIUM (500), HARD (1000);
	
	private final int iDifficulty;
	private static final Map<Integer, eGameDifficulty> lookup = new HashMap<java.lang.Integer,eGameDifficulty>();
	
	static {
		for (eGameDifficulty d : eGameDifficulty.values()) {
			lookup.put(d.getiDifficulty(),d);
		}
	}
	
	private eGameDifficulty(int iDifficulty) {
		this.iDifficulty = iDifficulty;
	}
	
	public static eGameDifficulty get(int iDifficulty) {
		Iterator it = lookup.entrySet().iterator();
		eGameDifficulty eGD = null;

		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			eGameDifficulty enumDifficulty = (eGameDifficulty) pair.getValue();
			int iDifficultyValue = (int) pair.getKey();
			if (iDifficulty >= iDifficultyValue) {
				eGD = enumDifficulty;
			}
		}
		return eGD;	
	}
	
	public int getiDifficulty() {
		return iDifficulty;
	}
	

	
}