package org.springframework.note;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/**
 * @author : qisi
 * @date: 2023/12/25
 * @description:
 */
@Component
public class NoteEventListener implements ApplicationListener<NoteEvent> {
	@Override
	public void onApplicationEvent(NoteEvent event) {
		System.out.println(event.name);
	}
}
