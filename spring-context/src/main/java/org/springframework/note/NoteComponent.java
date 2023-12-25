package org.springframework.note;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : qisi
 * @date: 2023/12/25
 * @description:
 */
@Component
public class NoteComponent {
	@Bean
	public NoteSecond noteSecond(){
		return new NoteSecond();
	}
}
