public class SearchResult implements Comparable<SearchResult> {
	private PageEntry p;
	private float r;
	public SearchResult(PageEntry p, float r) {
		this.p = p;
		this.r = r;
	}
	public PageEntry getPageEntry () {
		return this.p;
	}
	public float getRelevance () {
		return this.r;
	}

	@Override
	public int compareTo(SearchResult otherObject) {
		if (this.getRelevance() > otherObject.getRelevance()) {
			return 1;
		}
		else if (this.getRelevance() < otherObject.getRelevance()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
