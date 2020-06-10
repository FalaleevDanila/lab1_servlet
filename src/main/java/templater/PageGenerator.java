package templater;

import freemarker.template.Configuration;


public class PageGenerator {
    private static final String HTML_DIR = "templates";

    private static PageGenerator pageGenerator;
    private final Configuration cfg;


    private PageGenerator() {
        cfg = new Configuration();
    }
}