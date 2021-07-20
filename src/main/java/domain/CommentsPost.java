package domain;

public class CommentsPost {
    private int counterCommentsPost; // счетчик комментариев
    private String idCommentsPost;
    private AttachCommentsPost attachCommentsPost; // меню вложения
    private String urlAttachPhotoCommentsPost;
    private String urlAttachSmileCommentsPost;

    public int getCommentsPost () {return counterCommentsPost;}

    public String setCommentsPost (String textCommentsPost) {return null;}
}
