package com.realtime.trending_search.global.common.trend.dto

import com.realtime.trending_search.global.common.trend.enum.TrendStatus

data class TrendDto(
    val title: String,
    val currentRank: Int ?= null,
    val prevRank: Int ?= null,
    val trendStatus: TrendStatus,
)
