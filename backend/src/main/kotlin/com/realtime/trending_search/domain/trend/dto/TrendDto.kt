package com.realtime.trending_search.domain.trend.dto

import com.realtime.trending_search.domain.trend.enum.TrendStatus

data class TrendDto(
    val title: String,
    val currentRank: Int ?= null,
    val prevRank: Int ?= null,
    val trendStatus: TrendStatus,
)
