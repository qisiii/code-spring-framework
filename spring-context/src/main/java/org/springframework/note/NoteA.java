package org.springframework.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * @author : qisi
 * @date: 2023/12/25
 * @description:
 */
@Component
public class NoteA {
	@Autowired
	@Lazy
	private NoteComponent noteComponent;
}
