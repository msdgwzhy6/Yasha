package zlc.season.yasha

import android.view.View
import kotlinx.android.extensions.LayoutContainer
import zlc.season.sange.SangeItem
import zlc.season.sange.SangeViewHolder

interface YashaItem : SangeItem


class YashaScope<T : YashaItem>(override val containerView: View) : LayoutContainer {
    lateinit var data: T
}


class YashaStateItem(val state: Int, val retry: () -> Unit) : YashaItem


open class YashaViewHolder(containerView: View) : SangeViewHolder<YashaItem>(containerView)

