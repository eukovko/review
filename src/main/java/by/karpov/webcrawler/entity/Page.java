package by.karpov.webcrawler.entity;

import lombok.Data;

import java.util.List;

@Data
/**
 * This is simple entity
 * */
public class Page {

    /**
     * Html page URL from which the data is collected.
     */
    private final String url;

    /**
     * Array of data rows.
     */
    private final List<String> lines;


}
