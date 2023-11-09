import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_calculate.*
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.tan

class CalculateFragment : Fragment() {
    private var currentInput = ""
    private var currentOperator = ""
    private var currentResult = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calculate, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Fungsi untuk menangani klik tombol angka
        fun onButtonClicked(button: Button) {
            currentInput += button.text
            resultTextView.text = currentInput
        }

        // Fungsi untuk menangani klik tombol operator
        fun onOperatorClicked(button: Button) {
            currentOperator = button.text.toString()
            currentResult = currentInput.toDouble()
            currentInput = ""
        }

        // Fungsi untuk menangani klik tombol "="
        fun onCalculateClicked(button: Button) {
            when (currentOperator) {
                "+" -> currentResult += currentInput.toDouble()
                "-" -> currentResult -= currentInput.toDouble()
                "*" -> currentResult *= currentInput.toDouble()
                "/" -> currentResult /= currentInput.toDouble()
                "sin" -> currentResult = sin(currentInput.toDouble())
                "cos" -> currentResult = cos(currentInput.toDouble())
                "tan" -> currentResult = tan(currentInput.toDouble())
            }
            resultTextView.text = currentResult.toString()
            currentInput = ""
            currentOperator = ""
        }

        // Menambahkan click listener ke tombol-tombol angka
        button1.setOnClickListener { onButtonClicked(it as Button) }
        button2.setOnClickListener { onButtonClicked(it as Button) }

        // Menambahkan click listener ke tombol-tombol operator
        buttonPlus.setOnClickListener { onOperatorClicked(it as Button) }
        buttonMinus.setOnClickListener { onOperatorClicked(it as Button) }
        buttonMultiply.setOnClickListener { onOperatorClicked(it as Button) }
        buttonDivide.setOnClickListener { onOperatorClicked(it as Button) }
        buttonSin.setOnClickListener { onOperatorClicked(it as Button) }
        buttonCos.setOnClickListener { onOperatorClicked(it as Button) }
        buttonTan.setOnClickListener { onOperatorClicked(it as Button) }

        // Menambahkan click listener ke tombol "="
        buttonEquals.setOnClickListener { onCalculateClicked(it as Button) }
    }
}
