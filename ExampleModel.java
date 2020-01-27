package com.vaadin.trainings.intro;

import com.vaadin.flow.templatemodel.TemplateModel;

public interface ExampleModel extends TemplateModel{
	void setValue(String value);
	String getValue();

}
