package org.example.constants;

public enum ElementarySubjects {

    MATHEMATICS ("Mathematics"),
    ENGLISH ("English"),
    SCIENCE ("Science"),
    SOCIAL_STUDIES ("Social Studies");

    private final String SUBJECT_NAME;

    private ElementarySubjects(String SUBJECT_NAME ) {
        this.SUBJECT_NAME = SUBJECT_NAME;
    }

    public String getSUBJECT_NAME() {
        return SUBJECT_NAME;
    }
}
