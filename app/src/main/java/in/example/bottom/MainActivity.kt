package `in`.example.bottom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val firstFragment=FirstFragment()
        val secondFragment=SecondFragment()
        val thirdFragment = ThirdFragment()

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.pageHome->setCurrentFragment(firstFragment)
                R.id.pageReels->setCurrentFragment(secondFragment)
                R.id.pageProfile ->setCurrentFragment(thirdFragment)

            }
            true
        }
    }
    private fun setCurrentFragment(fragment:Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }


}