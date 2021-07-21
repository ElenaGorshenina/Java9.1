package domain;

public class LikePost {
    private int counterLikePost;
    private IdUrlLikePost idUrlLikePost; //ссылка на id поставившего лайк
    private int userLike;
    private int canLike;
    private int canPublish;

    public int getIdUrlLikePost() {
        return counterLikePost;
    }
}
