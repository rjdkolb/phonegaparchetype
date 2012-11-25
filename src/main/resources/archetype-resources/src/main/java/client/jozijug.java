#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import ${package}.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import com.google.gwt.query.client.GQuery;
import com.google.gwt.query.client.Function;
import com.google.gwt.query.client.Selector;
import com.google.gwt.query.client.Selectors;
import static com.google.gwt.query.client.GQuery.*;
import static com.google.gwt.query.client.css.CSS.*;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.googlecode.gwtphonegap.client.PhoneGap;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableEvent;
import com.googlecode.gwtphonegap.client.PhoneGapAvailableHandler;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutEvent;
import com.googlecode.gwtphonegap.client.PhoneGapTimeoutHandler;
import com.googlecode.mgwt.mvp.client.AnimatableDisplay;
import com.googlecode.mgwt.mvp.client.Animation;
import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTSettings;
import com.googlecode.mgwt.ui.client.animation.AnimationHelper;

//import elemental.client.Browser;
//import elemental.html.AudioContext;
//import elemental.html.AudioParam;
//import elemental.html.Oscillator;
//import elemental.html.Window;
/**
 * Entry point classes define
 * <code>onModuleLoad()</code>.
 */
public class jozijug implements EntryPoint {

    //final PhoneGap phoneGap = GWT.create(PhoneGap.class);
    /**
     * The message displayed to the user when the server cannot be reached or
     * returns an error.
     */
    private static final String SERVER_ERROR = "An error occurred while "
            + "attempting to contact the server. Please check your network "
            + "connection and try again.";
    /**
     * Create a remote service proxy to talk to the server-side Greeting
     * service.
     */
    private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
    private final Messages messages = GWT.create(Messages.class);

    AnimatableDisplay display = GWT.create(AnimatableDisplay.class);
    
    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
//        phoneGap.addHandler(new PhoneGapAvailableHandler() {
//            @Override
//            public void onPhoneGapAvailable(PhoneGapAvailableEvent event) {
//                //start your app - phonegap is ready
//            }
//        });
//
//        phoneGap.addHandler(new PhoneGapTimeoutHandler() {
//            @Override
//            public void onPhoneGapTimeout(PhoneGapTimeoutEvent event) {
//                //can not start phonegap - something is for with your setup
//            }
//        });
//
//
//        phoneGap.initializePhoneGap();


        MGWT.applySettings(MGWTSettings.getAppSetting());

        // build animation helper and attach it
        AnimationHelper animationHelper = new AnimationHelper();
        RootPanel.get().add(animationHelper);

        // build some UI
        LayoutPanel layoutPanel = new LayoutPanel();
        Button button = new Button("Hello mgwt");
        layoutPanel.add(button);

        // animate
        animationHelper.goTo(layoutPanel, Animation.SLIDE);

    }
}
