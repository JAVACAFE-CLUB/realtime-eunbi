package com.realtime.trending_search.domain.trend.service

import com.realtime.trending_search.domain.trend.repository.TrendRepository
import org.springframework.stereotype.Service

@Service
class TrendService(
    private val trendRepository: TrendRepository
) {

}
