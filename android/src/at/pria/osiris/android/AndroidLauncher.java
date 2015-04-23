package at.pria.osiris.android;

import android.os.Bundle;
import android.view.View;
import at.pria.osiris.OsirisSimulation;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

/**
 * to create a View usable in Android: get an AndroidApplicationConfiguration
 * and a Game instance (i.e. OsirisSimulation) then get the view with
 * initializeForView(Game, config);
 */
public class AndroidLauncher extends AndroidApplication {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // needed
        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        OsirisSimulation osirisSimulation = new OsirisSimulation();
        // only for libgdx Android launcher, not needed (and this whole AndroidLauncher class)
        // if you just use the View
        initialize(osirisSimulation, config);
        // magic
        View gameView = initializeForView(osirisSimulation, config);
    }
}
