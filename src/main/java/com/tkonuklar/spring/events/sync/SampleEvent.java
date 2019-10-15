package com.tkonuklar.spring.events.sync;

import lombok.Getter;
import lombok.Value;
import org.springframework.context.ApplicationEvent;

@Getter
@Value
public class SampleEvent extends ApplicationEvent {

    private String message;

    public SampleEvent(final Object source, final String message) {
        super(source);
        this.message = message;
    }
}
