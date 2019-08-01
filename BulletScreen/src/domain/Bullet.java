package domain;

/**
 * 弹幕类
 * @author yihang
 */
public class Bullet {
    /**
     * 弹幕编号
     */
    private int id;
    /**
     * 视频编号
     */
    private int videoId;
    /**
     * 弹幕时间（第几秒发的）
     */
    private int time;
    /**
     * 弹幕内容
     */
    private String content;
    /**
     * 弹幕皮肤编号
     */
    private int skinId;

    /**
     * 用户昵称
     */
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSkinId() {
        return skinId;
    }

    public void setSkinId(int skinId) {
        this.skinId = skinId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
