package com.cclcjs.user.domain.scancode;

import java.util.Date;

import com.cclcjs.user.domain.base.BaseQuery;

/**
 * BookVideo持久化类
 * 
 * @author jianjun.wang
 * 
 */
public class BookVideoDO extends BaseQuery {

    /** 主键id **/
    private Integer videoId;

    /** 视频名称 **/
    private String videoName;

    /** 二维码 **/
    private String codeName;

    /** 录制老师ID **/
    private Integer teacherId;

    /** 视频地址 **/
    private String videoPath;

    /** 视频封面 **/
    private String videoPic;

    /** 视频时长 **/
    private String videoTime;

    /** 视频大小 **/
    private long videoSize;

    /** 科目 **/
    private String subject;

    /** 所属图书 **/
    private String bookName;

    /** 章节 **/
    private String chapterName;

    /** 小节，分段 **/
    private String sectionName;

    /** 题号 **/
    private String questionNum;

    /** 题型 **/
    private String questionType;

    /** 创建时间 **/
    private Date createTime;

    /** 创建人 **/
    private Integer createId;

    /** 生效状态 **/
    private Integer status;


    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public void setVideoPath(String videoPath) {
        this.videoPath = videoPath;
    }

    public String getVideoPic() {
        return videoPic;
    }

    public void setVideoPic(String videoPic) {
        this.videoPic = videoPic;
    }

    public String getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(String videoTime) {
        this.videoTime = videoTime;
    }

    public long getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(long videoSize) {
        this.videoSize = videoSize;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getQuestionNum() {
        return questionNum;
    }

    public void setQuestionNum(String questionNum) {
        this.questionNum = questionNum;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateId() {
        return createId;
    }

    public void setCreateId(Integer createId) {
        this.createId = createId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
}
