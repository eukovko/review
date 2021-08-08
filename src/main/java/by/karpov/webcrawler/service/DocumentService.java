package by.karpov.webcrawler.service;

import lombok.RequiredArgsConstructor;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DocumentService {

    private static final int STATUS_OK = 200;

    public Optional<Document> getDocument(String url)  {
        try {
            Connection connection = Jsoup.connect(url);
            Document document = connection
                    .userAgent("Chrome/81.0.4044.138")
                    .get();
            // use status
            if (STATUS_OK == connection.response().statusCode()) {
                return Optional.of(document);
            }
        } catch (IOException e) {
            // log exception
        }
        return Optional.empty();
    }
}
