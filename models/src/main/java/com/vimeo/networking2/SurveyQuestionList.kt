package com.vimeo.networking2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import com.vimeo.networking2.common.Page

/**
 * A list of [SurveyQuestions][SurveyQuestion].
 */
@JsonClass(generateAdapter = true)
data class SurveyQuestionList(

    @Json(name = "total")
    override val total: Int? = null,

    @Json(name = "data")
    override val data: List<SurveyQuestion>? = null,

    @Json(name = "filtered_total")
    override val filteredTotal: Int? = null
) : Page<SurveyQuestion>
