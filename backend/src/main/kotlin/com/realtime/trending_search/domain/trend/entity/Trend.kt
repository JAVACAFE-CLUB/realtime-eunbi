package com.realtime.trending_search.domain.trend.entity

import com.realtime.trending_search.domain.trend.enum.TrendStatus
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "trend")
data class Trend (
    @Id val id: Long,

    @Column(name = "title") val title: String,

    @Column(name = "cnt") val cnt: Long,

    @Column(name = "currentRank") val currentRank: Int ?= null,

    @Column(name = "prevRank") val prevRank: Int ?= null,

    @Column(name = "peakRank") val peakRank: Int ?= null,

    @Column(name = "trendStatus") val trendStatus: TrendStatus,
)