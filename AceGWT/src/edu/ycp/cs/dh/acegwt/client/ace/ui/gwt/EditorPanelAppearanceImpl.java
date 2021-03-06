package edu.ycp.cs.dh.acegwt.client.ace.ui.gwt;
/*
 * The MIT License (MIT)
 * 
 * Copyright (c) 2015 Roan Horning (roan.horning@gmail.com)
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
import java.util.Iterator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;
import edu.ycp.cs.dh.acegwt.client.ace.AceEditor;

/**
 * @author Roan Horning
 *
 */
public class EditorPanelAppearanceImpl extends Composite implements EditorPanelAppearance, HasWidgets, HasText  {

	static {
		Resources.INSTANCE.css().ensureInjected();
	}

	interface Resources extends ClientBundle {

		Resources INSTANCE = GWT.create(Resources.class);

		@Source({"EditorPanel.css"})
		EditorPanelCss css();

	}	

	private static final UiBinder<Widget, EditorPanelAbst> UI_BINDER = GWT.create(EditorPanelUiBinder.class);

	@Override
	public UiBinder<Widget, EditorPanelAbst> uiBinder() {
		return UI_BINDER;
	}

	@UiTemplate("EditorPanel.ui.xml")
	public interface EditorPanelUiBinder extends UiBinder<Widget, AceEditor> {
	}

	@UiField
	FlowPanel container;

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(Widget w) {
		container.add(w);
	}

	@Override
	public void clear() {
		container.clear();
	}

	@Override
	public Iterator<Widget> iterator() {
		return container.iterator();
	}

	@Override
	public boolean remove(Widget w) {
		return container.remove(w);
	}

	@Override
	public FlowPanel getContainer() {
		return container;
	}

	@Override
	public EditorPanelCss css() {
		return Resources.INSTANCE.css();
	}

}
