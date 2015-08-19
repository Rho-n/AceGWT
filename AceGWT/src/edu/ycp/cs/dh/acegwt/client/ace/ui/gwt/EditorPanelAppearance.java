package edu.ycp.cs.dh.acegwt.client.ace.ui.gwt;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;

public interface EditorPanelAppearance {
	 UiBinder<Widget, EditorPanelAbst> uiBinder();
	 
	 public FlowPanel getContainer();
}
