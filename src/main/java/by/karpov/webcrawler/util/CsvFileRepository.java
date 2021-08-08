package by.karpov.webcrawler.util;

import by.karpov.webcrawler.entity.Matches;
import jdk.jfr.Name;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Name("csvrepo")
@Profile("test")
public class CsvFileRepository implements Repository {

	String filename;

	public CsvFileRepository(String filename) {
		this.filename = filename;
	}

	@Override
	public void save(Matches matches) {

	}

	@Override
	public void saveAll(List<Matches> matches) {
			matches.forEach(matches1 -> {
				// create csv
			});
	}
}
