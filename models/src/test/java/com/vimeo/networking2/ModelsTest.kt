package com.vimeo.networking2

import org.junit.Assert.assertTrue
import org.junit.Test
import kotlin.reflect.full.primaryConstructor

class ModelsTest {

    private val models = listOf(
        AccessGrant::class,
        AddSubfolderInteraction::class,
        Album::class,
        AlbumConnections::class,
        AlbumEmbed::class,
        AlbumInteractions::class,
        AlbumList::class,
        AlbumPrivacy::class,
        ApiConfiguration::class,
        ApiError::class,
        AppConfiguration::class,
        BasicInteraction::class,
        Billing::class,
        BuyInteraction::class,
        Category::class,
        CategoryConnections::class,
        CategoryInteractions::class,
        CategoryList::class,
        Channel::class,
        ChannelConnections::class,
        ChannelFollowInteraction::class,
        ChannelInteractions::class,
        ChannelList::class,
        CinemaConnections::class,
        Comment::class,
        CommentConnections::class,
        CommentList::class,
        ConnectedApp::class,
        ConnectedAppList::class,
        ConnectedAppInteraction::class,
        ConnectedScopes::class,
        BasicConnection::class,
        Credit::class,
        DashVideoFile::class,
        DefaultConnection::class,
        Document::class,
        Drm::class,
        Email::class,
        EmbedButtons::class,
        EmbedTitle::class,
        FacebookConfiguration::class,
        FacetOption::class,
        FeaturesConfiguration::class,
        FeedItem::class,
        FeedItemConnections::class,
        FeedList::class,
        Folder::class,
        FolderAncestorConnection::class,
        FolderInteractions::class,
        FolderList::class,
        FolderConnections::class,
        FolderPrivacy::class,
        FollowInteraction::class,
        Gcs::class,
        Group::class,
        GroupConnections::class,
        GroupFollowInteraction::class,
        GroupInteractions::class,
        GroupPrivacy::class,
        Lifetime::class,
        LikeInteraction::class,
        Live::class,
        LiveChat::class,
        LiveChatConfiguration::class,
        LiveConfiguration::class,
        LiveHeartbeatConfiguration::class,
        LiveQuota::class,
        LiveStats::class,
        LiveStatsViewers::class,
        LiveStreamsQuota::class,
        LiveTime::class,
        Membership::class,
        Metadata::class,
        MetadataConnections::class,
        MetadataInteractions::class,
        Notification::class,
        NotificationConnection::class,
        NotificationList::class,
        NotificationSubscriptions::class,
        NotificationTypeCount::class,
        Paging::class,
        Periodic::class,
        PermissionActions::class,
        PermissionPolicy::class,
        Picture::class,
        PictureCollection::class,
        PinCodeInfo::class,
        PlatformConstraint::class,
        Play::class,
        PlayProgress::class,
        Preferences::class,
        Privacy::class,
        Product::class,
        ProductInteractions::class,
        ProductList::class,
        ProjectItem::class,
        ProjectItemList::class,
        ProgrammedContentItem::class,
        ProgrammedContentItemList::class,
        Publish::class,
        PublishJob::class,
        PublishJobAttempts::class,
        PublishJobBlockers::class,
        PublishJobDestination::class,
        PublishJobDestinations::class,
        PublishJobConnection::class,
        PublishOptionItem::class,
        PurchaseInteraction::class,
        PurchaseOnDemandInteraction::class,
        Quota::class,
        Recommendation::class,
        RecommendationList::class,
        RentInteraction::class,
        ReviewPage::class,
        SearchFacet::class,
        SearchFacetCollection::class,
        SearchResult::class,
        SearchResultList::class,
        Season::class,
        SeasonConnections::class,
        SeasonInteractions::class,
        SeasonList::class,
        Space::class,
        Spatial::class,
        SsoDomain::class,
        Subscription::class,
        SubscriptionInteraction::class,
        SubscriptionTrial::class,
        SubscriptionRenewal::class,
        Tag::class,
        Team::class,
        TeamBranding::class,
        TeamList::class,
        TeamMembership::class,
        TeamMembershipList::class,
        TeamMembershipConnections::class,
        TeamMembersConnection::class,
        TeamOwnerConnection::class,
        TextTrack::class,
        TextTrackList::class,
        Transcode::class,
        TrialEligibility::class,
        TvodItem::class,
        TvodItemConnections::class,
        TvodItemList::class,
        Upload::class,
        UploadQuota::class,
        User::class,
        UserBadge::class,
        UserConnections::class,
        UserInteractions::class,
        UserList::class,
        Video::class,
        VideoBadge::class,
        VideoBadges::class,
        VideoConnections::class,
        VideoContext::class,
        VideoEmbed::class,
        HlsVideoFile::class,
        VideoInteractions::class,
        VideoList::class,
        VideoLog::class,
        VideoSourceFile::class,
        VideosPreference::class,
        VideoStats::class,
        VideosTvodItemConnection::class,
        WatchedInteraction::class,
        WatchLaterInteraction::class,
        Website::class,
        VideoStatus::class,
        EditSession::class
    )

    @Test
    fun `model should be data class`() {
        models.forEach {
            assertTrue("Model should defined as a data class for ${it.simpleName}", it.isData)
        }
    }

    @Test
    fun `model should have optional constructor parameters`() {
        models.forEach { kClass ->
            kClass.primaryConstructor?.parameters?.forEach {
                assertTrue("Constructor params should be optional.${it.name}", it.isOptional)
            }
        }
    }
}
