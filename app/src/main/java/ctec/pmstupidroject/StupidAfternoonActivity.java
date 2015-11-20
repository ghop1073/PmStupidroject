package ctec.pmstupidroject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.view.View;
import android.graphics.Color;

public class StupidAfternoonActivity extends AppCompatActivity
{
    private Button colorChangeButton;
    private RelativeLayout background;
    private TextView sillywords;


    /*8
    created instance of button, text, and relative view background
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stupid_afternoon);

        colorChangeButton = (Button) findViewById(R.id.sillybutton);
        background = (RelativeLayout) findViewById(R.id.appBackground);
        sillywords = (TextView) findViewById(R.id.StupidWords);

        setupListeners();
    }

    /**
     * increased size of hello world
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_stupid_afternoon, menu);
        return true;
    }

    /**
     * set up change color method
     */
    private void changeColors()
    {
        int redColor;
        int greenColor;
        int blueColor;

        redColor = (int) (Math.random() * 256);
        greenColor= (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);

        background.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));

        redColor = (int) (Math.random() * 256);
        greenColor= (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);

        colorChangeButton.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));
    }

    /**
     * Set up listener for button allowing button to change colors
     */
    private void setupListeners()
    {
        colorChangeButton.setOnClickListener(new  View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                //This is where you put the code that happens when you click a button.
                changeColors();
            }
        });
    }
}
