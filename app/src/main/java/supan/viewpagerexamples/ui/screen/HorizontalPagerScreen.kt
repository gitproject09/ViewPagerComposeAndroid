package supan.viewpagerexamples.ui.screen

import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import supan.viewpagerexamples.ui.component.ViewPagerItem

@Composable
fun HorizontalPagerScreen() {
    val pagerState = rememberPagerState(pageCount = { 10 })
    HorizontalPager(state = pagerState) { page ->
        ViewPagerItem(page = page)
    }
}

@Preview
@Composable
private fun HorizontalPagerScreenPreview() {
    HorizontalPagerScreen()
}