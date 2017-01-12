package com.vimeo.networking.model.notifications;

import com.vimeo.networking.model.Comment;
import com.vimeo.networking.model.Credit;
import com.vimeo.networking.model.User;
import com.vimeo.networking.model.Video;
import com.vimeo.stag.GsonAdapterKey;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zetterstromk on 1/11/17.
 */
public class Notification implements Serializable {

    private static final long serialVersionUID = -68262442832775695L;

    @Nullable
    @GsonAdapterKey("uri")
    String mUri;

    @Nullable
    @GsonAdapterKey("created_time")
    Date mCreatedDate;

    @NotNull
    @GsonAdapterKey("type")
    String mType;

    @Nullable
    @GsonAdapterKey("user")
    User mUser;

    @Nullable
    @GsonAdapterKey("comment")
    Comment mComment;

    @Nullable
    @GsonAdapterKey("clip")
    Video mVideo;

    @Nullable
    @GsonAdapterKey("credit")
    Credit mCredit;

    @Nullable
    public String getUri() {
        return mUri;
    }

    @Nullable
    public Date getCreatedDate() {
        return mCreatedDate;
    }

    @NotNull
    public NotificationType getNotificationType() {
        return NotificationType.notificationTypeFromString(mType);
    }

    @Nullable
    public User getUser() {
        return mUser;
    }

    @Nullable
    public Comment getComment() {
        return mComment;
    }

    @Nullable
    public Video getVideo() {
        return mVideo;
    }

    @Nullable
    public Credit getCredit() {
        return mCredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Notification that = (Notification) o;

        if (mUri != null ? !mUri.equals(that.mUri) : that.mUri != null) {
            return false;
        }
        if (mCreatedDate != null ? !mCreatedDate.equals(that.mCreatedDate) : that.mCreatedDate != null) {
            return false;
        }
        if (!mType.equals(that.mType)) {
            return false;
        }
        if (mUser != null ? !mUser.equals(that.mUser) : that.mUser != null) {
            return false;
        }
        if (mComment != null ? !mComment.equals(that.mComment) : that.mComment != null) {
            return false;
        }
        if (mVideo != null ? !mVideo.equals(that.mVideo) : that.mVideo != null) {
            return false;
        }
        return mCredit != null ? mCredit.equals(that.mCredit) : that.mCredit == null;

    }

    @Override
    public int hashCode() {
        int result = mUri != null ? mUri.hashCode() : 0;
        result = 31 * result + (mCreatedDate != null ? mCreatedDate.hashCode() : 0);
        result = 31 * result + mType.hashCode();
        result = 31 * result + (mUser != null ? mUser.hashCode() : 0);
        result = 31 * result + (mComment != null ? mComment.hashCode() : 0);
        result = 31 * result + (mVideo != null ? mVideo.hashCode() : 0);
        result = 31 * result + (mCredit != null ? mCredit.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Notification{" +
               "mUri='" + mUri + '\'' +
               ", mCreatedDate=" + mCreatedDate +
               ", mType='" + mType + '\'' +
               ", mUser=" + mUser +
               ", mComment=" + mComment +
               ", mVideo=" + mVideo +
               ", mCredit=" + mCredit +
               '}';
    }
}
