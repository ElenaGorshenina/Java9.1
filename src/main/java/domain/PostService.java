package domain;

public class PostService {
    private String idPost; //id поста
    private String idUrl; //ссылка на id опубликовавшего пост
    private String avatarUrl; // аватар опубликовавшего пост
    private String timePost;
    private String descriptionPost;
    private ObjectPost objectPost; // основной объект: картинка, видео, картинка с переходом по ссылке
    private MenuPost menuPost; //меню поста
    private LikePost likePost;
    private CommentsPost commentsPost;
    private RePost rePost;
    private ViewPost viewPost;

    //после рассмотрения документации
    private int ownerId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private CopyrightPost copyrightPost;
    private String postType;
    private PostSourse postSourse;
    private Geo geo;
    private int signerId;
    private int isPinned;
    private int markedAsAds;
    private Boolean isFavorite;
    private Donut donut;
    private int postponedID;

}


