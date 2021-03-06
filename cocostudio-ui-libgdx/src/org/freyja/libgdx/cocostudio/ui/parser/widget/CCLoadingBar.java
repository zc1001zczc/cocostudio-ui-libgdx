package org.freyja.libgdx.cocostudio.ui.parser.widget;

import org.freyja.libgdx.cocostudio.ui.CocoStudioUIEditor;
import org.freyja.libgdx.cocostudio.ui.model.CCOption;
import org.freyja.libgdx.cocostudio.ui.model.CCWidget;
import org.freyja.libgdx.cocostudio.ui.parser.WidgetParser;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

public class CCLoadingBar extends WidgetParser {

	@Override
	public String getClassName() {
		return "LoadingBar";
	}

	@Override
	public Actor parse(CocoStudioUIEditor editor, CCWidget widget,
			CCOption option) {

		if (option.getTextureData() == null) {
			return new Image();
		}
		Drawable tr = editor.findDrawable(option, option.getTextureData()
				.getPath());
		if (tr == null) {
			return new Image();
		}
		Image image = new Image(tr);
		return image;

	}

}
