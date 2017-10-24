package gitam.ceoconclave;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import it.sephiroth.android.library.imagezoom.ImageViewTouch;
import it.sephiroth.android.library.imagezoom.ImageViewTouchBase;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class AgendaFullView extends AppCompatActivity {
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * Some older devices needs a small delay between UI widget updates
     * and a change of the status and navigation bar.
     */
    private static final int UI_ANIMATION_DELAY = 300;
    private final Handler mHideHandler = new Handler();

    private final Runnable mHidePart2Runnable = new Runnable() {
        @SuppressLint("InlinedApi")
        @Override
        public void run() {
            // Delayed removal of status and navigation bar

            // Note that some of these constants are new as of API 16 (Jelly Bean)
            // and API 19 (KitKat). It is safe to use them, as they are inlined
            // at compile-time and do nothing on earlier devices.


        }
    };
    private View mControlsView;
    private final Runnable mShowPart2Runnable = new Runnable() {
        @Override
        public void run() {
            // Delayed display of UI elements
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.show();
            }
            mControlsView.setVisibility(View.VISIBLE);
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_agenda_full_view);






        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.

        ImageViewTouch agenda=(ImageViewTouch) findViewById(R.id.imageViewAgenda);

        agenda.setDisplayType(ImageViewTouchBase.DisplayType.FIT_IF_BIGGER);


                    agenda.setSingleTapListener(
                            new ImageViewTouch.OnImageViewTouchSingleTapListener() {

                                @Override
                                public void onSingleTapConfirmed() {

                                }
                            }
                    );

                    agenda.setDoubleTapListener(
                            new ImageViewTouch.OnImageViewTouchDoubleTapListener() {

                                @Override
                                public void onDoubleTap() {

                                }
                            }
                    );

                    agenda.setOnDrawableChangedListener(
                            new ImageViewTouchBase.OnDrawableChangeListener() {

                                @Override
                                public void onDrawableChanged(Drawable drawable) {

                                }
                            }
                    );
        BitmapDrawable d= null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            d = (BitmapDrawable) getResources().getDrawable(R.drawable.agenda,getTheme());
        }
        else
        {
            d = (BitmapDrawable) getResources().getDrawable(R.drawable.agenda);

        }
        Bitmap bitmap = ((BitmapDrawable)d).getBitmap();

//agenda.setImageDrawable(getResources().getDrawable(R.drawable.agenda));
         agenda.setImageBitmap(bitmap, null, -1, -1);

    }







}
