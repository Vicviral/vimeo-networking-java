package com.vimeo.networking2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.vimeo.networking2.annotations.Internal

/**
 * All actions that can be taken on a video.
 *
 * @param album The interaction used to add a video to multiple albums.
 * @param buy The buy interaction for a On Demand video.
 * @param channel When a video is referenced by a channel URI, if the user is a moderator of the channel, include
 * information about removing the video from the channel.
 * @param like Information about whether the authenticated user has liked this video.
 * @param rent The Rent interaction for an On Demand video.
 * @param report Information about where and how to report a video.
 * @param subscription Subscription information for an On Demand video.
 * @param watchLater Information about whether this video appears on the authenticated user's Watch Later list.
 */
@JsonClass(generateAdapter = true)
data class VideoInteractions(

    @Json(name = "album")
    val album: BasicInteraction? = null,

    @Internal
    @Json(name = "buy")
    val buy: BuyInteraction? = null,

    @Internal
    @Json(name = "channel")
    val channel: BasicInteraction? = null,

    @Json(name = "like")
    val like: LikeInteraction? = null,

    @Internal
    @Json(name = "rent")
    val rent: RentInteraction? = null,

    @Json(name = "report")
    val report: BasicInteraction? = null,

    @Internal
    @Json(name = "subscribe")
    val subscription: SubscriptionInteraction? = null,

    @Json(name = "watchlater")
    val watchLater: WatchLaterInteraction? = null

)
