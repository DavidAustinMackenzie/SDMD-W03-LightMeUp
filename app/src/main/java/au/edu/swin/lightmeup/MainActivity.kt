package au.edu.swin.lightmeup

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView((R.layout.activity_main))

        //Get the imageView
        val imageView = findViewById<ImageView>(R.id.imageView)
        //Set the ImageView to the first picture
        imageView.setImageDrawable(getDrawable(R.drawable.ic_done_all_black_24dp))

        //Update to a random picture when the view is tapped
        imageView.setOnClickListener{
            when((0..2).random()){
                0->imageView.setImageDrawable(getDrawable(R.drawable.ic_done_all_black_24dp))
                1->imageView.setImageDrawable(getDrawable(R.drawable.ic_done_black_24dp))
                2->imageView.setImageDrawable(getDrawable(R.drawable.ic_info_black_24dp))
            }
        }

        //Reset the imageView back to the first picture when long tap
        imageView.setOnLongClickListener{
            imageView.setImageDrawable(getDrawable(R.drawable.ic_done_all_black_24dp))
            true
        }
    }
}

