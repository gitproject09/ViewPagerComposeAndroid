package supan.viewpagerexamples.ui.component

import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import supan.viewpagerexamples.R

@Composable
fun ViewPagerButton(title: String, onButtonClick: () -> Unit = {}) {
    Button(onClick = { onButtonClick.invoke() }) {
        TextComponent(title)
    }
}

@Preview
@Composable
private fun ViewPagerButtonPreview() {
    ViewPagerButton(stringResource(id = R.string.app_name))
}