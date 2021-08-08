package by.karpov.webcrawler.util;

import by.karpov.webcrawler.entity.Matches;

import java.util.List;

public interface Repository {

	void save(Matches matches);
	void saveAll(List<Matches> matches);

}
