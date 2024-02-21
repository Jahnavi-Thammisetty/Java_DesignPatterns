package com.ty.mac;

import com.ty.Ui.Button;
import com.ty.Ui.CheckBox;
import com.ty.Ui.UiFactory;

public class MacUiFactory implements UiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
