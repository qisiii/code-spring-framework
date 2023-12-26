package org.springframework.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author : qisi
 * @date: 2023/12/25
 * @description:
 */
@Component
public class NoteComponent {
	@Autowired
	private NoteA noteA;
	public NoteSecond noteSecond(){
		return new NoteSecond();
	}
	@Async
	public void test(){
		System.out.println("hi");
	}
}
