package org.springframework.note;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : qisi
 * @date: 2023/7/20
 * @description:
 */
@Configuration
public class NoteConfig {
	@Bean
	public NoteBean noteBean(){
		return new NoteBean();
	}
}
