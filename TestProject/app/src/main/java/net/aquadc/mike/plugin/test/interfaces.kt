@file:Suppress("ktNoinlineFunc", "UNUSED_PARAMETER")
import android.widget.Toast
import java.io.Serializable


class Iii : AbstractList<Nothing>(), Runnable, Cloneable, () -> Unit {

    private fun a() {
        top(1, 1, emptyList(), this, this) { 0 }
        1.topExt(1, emptyList(), this, this, this)
        member(1, 1, emptyList(), this, this, this)
        1.memberExt(1, emptyList(), this, r = this, cl = this)
        Toast.makeText(null, null, Toast.LENGTH_LONG).show()
    }

    override val size: Int
        get() = 0

    override fun get(index: Int): Nothing {
        throw UnsupportedOperationException()
    }

    override fun run() {
    }

    override fun invoke() {
    }

    private fun member(a: Serializable, b: Comparable<*>, c: List<Number>, f: () -> Unit, cl: Cloneable, r: Runnable) {
    }
    private fun Serializable.memberExt(b: Comparable<*>, c: List<Number>, f: () -> Unit, cl: Cloneable, r: Runnable) {
    }
}

private fun top(a: Serializable, b: Comparable<*>, c: List<Number>, f: () -> Unit, cl: Cloneable, r: () -> Unit) {
}
private fun Serializable.topExt(b: Comparable<*>, c: List<Number>, f: () -> Unit, cl: Cloneable, r: Runnable) {
}
