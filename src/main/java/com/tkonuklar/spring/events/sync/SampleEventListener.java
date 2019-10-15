package com.tkonuklar.spring.events.sync;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SampleEventListener implements ApplicationListener<SampleEvent> {

    @Override
    public void onApplicationEvent(final SampleEvent event) {
        log.info("Receive message: {}", event.getMessage());
    }
}
