package com.javamvcweb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class PageHitsController {

    private final AtomicLong pageHits = new AtomicLong(0);

    @Value("${page.hits.interval.seconds:3}")
    private long pageHitsInterval;

    @ResponseBody
    @GetMapping("/api/page-hits")
    public long getPageHits() {
        return pageHits.get();
    }

    @Async
    @Scheduled(fixedRateString = "${page.hits.interval.seconds}000")
    public void incrementPageHits() {
        pageHits.incrementAndGet();
    }
}
