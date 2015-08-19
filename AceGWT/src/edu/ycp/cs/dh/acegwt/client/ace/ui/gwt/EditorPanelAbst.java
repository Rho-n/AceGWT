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

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.InsertPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

public abstract class EditorPanelAbst extends Composite implements
	InsertPanel.ForIsWidget, HasWidgets {

	protected static final EditorPanelAppearance DEFAULT_APPEARANCE = GWT.create(EditorPanelAppearanceImpl.class);

	protected EditorPanelAppearance appearance;

	public EditorPanelAbst() {
		this(DEFAULT_APPEARANCE);
	}

	public EditorPanelAbst(EditorPanelAppearance apperance) {
		this.appearance = apperance;
	}	

	 @Override
	  public void add(Widget w) {
		 this.appearance.getContainer().add(w);
	  }

	  @Override
	  public void clear() {
		  this.appearance.getContainer().clear();
	  }

	  @Override
	  public Iterator<Widget> iterator() {
	    return this.appearance.getContainer().iterator();
	  }

	  @Override
	  public boolean remove(Widget w) {
	    return this.appearance.getContainer().remove(w);
	  }

	@Override
	public void insert(Widget w, int beforeIndex) {
		this.appearance.getContainer().insert(w, beforeIndex);
	}

	@Override
	public Widget getWidget(int index) {
	    return this.appearance.getContainer().getWidget(index);
	}

	@Override
	public int getWidgetCount() {
	    return this.appearance.getContainer().getWidgetCount();
	}

	@Override
	public int getWidgetIndex(Widget child) {
	    return this.appearance.getContainer().getWidgetIndex(child);
	}

	@Override
	public boolean remove(int index) {
	    return this.appearance.getContainer().remove(index);
	}

	@Override
	public int getWidgetIndex(IsWidget child) {
	    return this.appearance.getContainer().getWidgetIndex(child);
	}

	@Override
	public void add(IsWidget w) {
		this.appearance.getContainer().add(w);
	}

	@Override
	public void insert(IsWidget w, int beforeIndex) {
		this.appearance.getContainer().insert(w, beforeIndex);
	}

	public FlowPanel getContainer() {
		return this.appearance.getContainer();
	}


}
