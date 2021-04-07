package `in`.example.bottom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class ThirdFragment : Fragment() {

    lateinit var btnSettings: Button;
    lateinit var btnInvite: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_third, container, false)



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        btnSettings = view.findViewById(R.id.btnSettings)
        btnSettings.setOnClickListener {
            Toast.makeText(activity,"Settings button Clicked",Toast.LENGTH_SHORT).show()
        }
        btnInvite = view.findViewById(R.id.btnInvite)
        btnInvite.setOnClickListener {
            Toast.makeText(activity,"Invite button Clicked",Toast.LENGTH_SHORT).show()
        }

    }
}
