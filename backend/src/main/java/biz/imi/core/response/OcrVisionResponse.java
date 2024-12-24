package biz.imi.core.response;

public class OcrVisionResponse {

    private TextAnnotation textAnnotation;

    private String page;

    public OcrVisionResponse() {
    }

    public TextAnnotation getTextAnnotation() {
        return textAnnotation;
    }

    public void setTextAnnotation(TextAnnotation textAnnotation) {
        this.textAnnotation = textAnnotation;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
}
