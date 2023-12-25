package org.springframework.note;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * @author : qisi
 * @date: 2023/12/25
 * @description:
 */
public class NoteEvent extends ApplicationEvent implements Serializable {
	private static final long serialVersionUID = -153468561252983294L;
	public String name;

	public NoteEvent(String name) {
		super(name);
		this.name=name;
	}
}
