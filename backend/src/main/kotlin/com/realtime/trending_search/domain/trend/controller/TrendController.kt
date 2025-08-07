package com.realtime.trending_search.domain.trend.controller

import com.realtime.trending_search.domain.trend.service.TrendService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/trend")
class TrendController(
    private val trendService: TrendService
) {
}