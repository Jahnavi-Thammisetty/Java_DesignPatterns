package com.ty.windows;

import com.ty.Ui.Button;
import com.ty.Ui.CheckBox;
import com.ty.Ui.UiFactory;

public class WindowsUiFactory implements UiFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
