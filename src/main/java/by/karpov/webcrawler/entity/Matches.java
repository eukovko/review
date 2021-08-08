package by.karpov.webcrawler.entity;

import java.util.List;

public class Matches {

	String url;
	List<Pair> pairList;

	public static class Pair {
		String word;
		int numberOfTimes;
	}
}


