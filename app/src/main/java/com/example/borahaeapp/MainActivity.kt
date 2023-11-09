import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username == "shilmy.aulia" && password == "bangtan") {
                // Login berhasil
                Snackbar.make(it, "Login Berhasil", Snackbar.LENGTH_SHORT).show()
            } else {
                // Login gagal
                Snackbar.make(it, "Login Gagal", Snackbar.LENGTH_SHORT).show()
            }
        }
    }
}
