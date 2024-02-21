package com.ty;

import com.ty.Ui.Button;
import com.ty.Ui.CheckBox;
import com.ty.Ui.UiFactory;

public class Application {

    private Button button;
    private CheckBox checkBox;


    public Application(UiFactory uiFactory)
    {
        button=uiFactory.createButton();
        checkBox=uiFactory.createCheckBox();

    }

    public void point()
    {
        button.point();
        checkBox.point();
    }


}
