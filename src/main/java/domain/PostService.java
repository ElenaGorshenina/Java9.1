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
}


