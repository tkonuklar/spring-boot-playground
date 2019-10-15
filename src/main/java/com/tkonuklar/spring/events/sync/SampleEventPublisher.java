package com.tkonuklar.spring.events.sync;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class SampleEventPublisher {

    private ApplicationEventPublisher applicationEventPublisher;

    public void sendMessage(final String message) {
        log.info("Message details :{} ", message);
        final var event = new SampleEvent(this, message);
        applicationEventPublisher.publishEvent(event);
    }
}
