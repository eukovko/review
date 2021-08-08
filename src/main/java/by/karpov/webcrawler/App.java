package by.karpov.webcrawler;

import by.karpov.webcrawler.service.Crawler;
import by.karpov.webcrawler.service.DepthService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class App {

    @Value("url")
    String url;
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext();
        cxt.scan("by.karpov.webcrawler");
        cxt.refresh();
        String startUrl = "default";
        if (args.length > 0) {
            startUrl = args[0];
            // url matcher
        }
        System.out.println("default URL (" + startUrl + ") will be used for demonstration \n");
        var crawler = cxt.getBean(Crawler.class);
        DepthService depthService = cxt.getBean(DepthService.class);
        crawler.process(startUrl, depthService.getInt("Inter depth:"), crawler.keywordService.getKeyWordList(), crawler.filenameService.getFilename()); // List<Matches>
        // repository.save(matches)

    }

}

