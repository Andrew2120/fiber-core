import androidx.compose.ui.unit.*
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt
import android.graphics.Color.parseColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity

object BTokens {

val color = BTokens_Color
val borderWidth = BTokens_BorderWidth
val borderRadius = BTokens_BorderRadius
val size = BTokens_Size
val space = BTokens_Space
val opacity = BTokens_Opacity
val typography = BTokens_Typography
val dimension = BTokens_Dimension
val fontFamily = BTokens_FontFamily
val fontSize = BTokens_FontSize
val fontWeight = BTokens_FontWeight
val letterSpacing = BTokens_LetterSpacing
val lineHeight = BTokens_LineHeight
}



object BTokens_Color {

val content = color_Content
val border = color_Border
val background = color_Background
val action = color_Action
val interaction = color_Interaction
val nonSemantic = color_NonSemantic
val semantic = color_Semantic
val coolGray = color_CoolGray
val coolGrayAlpha = color_CoolGrayAlpha
val neutralGray = color_NeutralGray
val neutralGrayAlpha = color_NeutralGrayAlpha
val warmGray = color_WarmGray
val warmGrayAlpha = color_WarmGrayAlpha
val whiteAlpha = color_WhiteAlpha
val red = color_Red
val magenta = color_Magenta
val purple = color_Purple
val violet = color_Violet
val blue = color_Blue
val cyan = color_Cyan
val teal = color_Teal
val aquamarine = color_Aquamarine
val green = color_Green
val orange = color_Orange
val transparent = color_Transparent
}



object color_Content {

val _primary = Color(parseColor("#272e35"))
val _secondary = Color(parseColor("#555f6d"))
val _tertiary = Color(parseColor("#7e8c9a"))
val _disabled = Color(parseColor("#9ea8b3"))
val _primary_inverse = Color(parseColor("#ffffff"))
val _secondary_inverse = Color(parseColor("#ffffffa3"))
val _tertiary_inverse = Color(parseColor("#ffffff66"))
val _disabled_inverse = Color(parseColor("#ffffff3d"))
val _info_primary = Color(parseColor("#113997"))
val _info_secondary = Color(parseColor("#3061d5"))
val _success_primary = Color(parseColor("#b3b7b0"))
val _success_secondary = Color(parseColor("#347434"))
val _warning_primary = Color(parseColor("#3f2828"))
val _warning_secondary = Color(parseColor("#f59638"))
val _danger_primary = Color(parseColor("#30723a"))
val _danger_secondary = Color(parseColor("#9e6610"))
val _brand_primary = Color(parseColor("#113997"))
val _brand_secondary = Color(parseColor("#3061d5"))
}



object color_Border {

val _default = Color(parseColor("#eaedf0"))
val _defaultA = Color(parseColor("#10284717"))
val _inverse = Color(parseColor("#ffffff"))
val _neutral_strong = Color(parseColor("#555f6d"))
val _neutral_subtle = Color(parseColor("#cfd6dd"))
val _info_strong = Color(parseColor("#3061d5"))
val _info_subtle = Color(parseColor("#234794"))
val _success_strong = Color(parseColor("#347434"))
val _success_subtle = Color(parseColor("#c6ecc6"))
val _warning_strong = Color(parseColor("#f59638"))
val _warning_subtle = Color(parseColor("#ffd4a8"))
val _danger_strong = Color(parseColor("#9e6610"))
val _danger_subtle = Color(parseColor("#76d91c"))
}



object color_Background {

val _default = Color(parseColor("#ffffff"))
val _inverse = Color(parseColor("#272e35"))
val _neutral_strong = Color(parseColor("#555f6d"))
val _neutral_muted = Color(parseColor("#dee3e7"))
val _neutral_onSubtle = Color(parseColor("#eaedf0"))
val _neutral_subtle = Color(parseColor("#f5f7f9"))
val _neutral_surface = Color(parseColor("#fcfcfd"))
val _info_strong = Color(parseColor("#3061d5"))
val _info_muted = Color(parseColor("#d6e3ff"))
val _info_onSubtle = Color(parseColor("#e5eeff"))
val _info_subtle = Color(parseColor("#f5f8ff"))
val _info_surface = Color(parseColor("#fafbff"))
val _success_strong = Color(parseColor("#347434"))
val _success_muted = Color(parseColor("#cff2cf"))
val _success_onSubtle = Color(parseColor("#dff6df"))
val _success_subtle = Color(parseColor("#f4fbf4"))
val _success_surface = Color(parseColor("#fbfefb"))
val _warning_strong = Color(parseColor("#f59638"))
val _warning_muted = Color(parseColor("#fcdec0"))
val _warning_onSubtle = Color(parseColor("#ffe8d1"))
val _warning_subtle = Color(parseColor("#fff5eb"))
val _warning_surface = Color(parseColor("#fffcfa"))
val _danger_strong = Color(parseColor("#9e6610"))
val _danger_muted = Color(parseColor("#d15a5a"))
val _danger_onSubtle = Color(parseColor("#fee7e7"))
val _danger_subtle = Color(parseColor("#fef5f5"))
val _danger_surface = Color(parseColor("#fffafa"))
val _brand_strong = Color(parseColor("#3061d5"))
val _brand_muted = Color(parseColor("#d6e3ff"))
val _brand_onSubtle = Color(parseColor("#e5eeff"))
val _brand_surface = Color(parseColor("#fafbff"))
val _brand_subtle = Color(parseColor("#f5f8ff"))
}



object color_Action {

val primary = action_Primary
val neutral = action_Neutral
val success = action_Success
val danger = action_Danger
val ghost = action_Ghost
val outline = action_Outline
val inverse = action_Inverse
val reverseInverse = action_ReverseInverse
}



object action_Primary {

val action_min_normal = Color(parseColor("#3061d5"))
val action_min_hover = Color(parseColor("#658b6e"))
val action_min_active = Color(parseColor("#113997"))
val action_min_selected = Color(parseColor("#658b6e"))
val action_min_subtle_normal = Color(parseColor("#ebf0ff"))
val action_min_subtle_hover = Color(parseColor("#e5eeff"))
val action_min_subtle_active = Color(parseColor("#234794"))
val action_min_subtle_selected = Color(parseColor("#e5eeff"))
}



object action_Neutral {

val action_min_normal = Color(parseColor("#4a545e"))
val action_min_hover = Color(parseColor("#3a424a"))
val action_min_active = Color(parseColor("#272e35"))
val action_min_selected = Color(parseColor("#3a424a"))
val action_min_subtle_normal = Color(parseColor("#f0f3f5"))
val action_min_subtle_hover = Color(parseColor("#eaedf0"))
val action_min_subtle_active = Color(parseColor("#cfd6dd"))
val action_min_subtle_selected = Color(parseColor("#eaedf0"))
}



object action_Success {

val action_min_normal = Color(parseColor("#347434"))
val action_min_hover = Color(parseColor("#246626"))
val action_min_active = Color(parseColor("#b3b7b0"))
val action_min_selected = Color(parseColor("#246626"))
val action_min_subtle_normal = Color(parseColor("#e6f9e6"))
val action_min_subtle_hover = Color(parseColor("#dff6df"))
val action_min_subtle_active = Color(parseColor("#c6ecc6"))
val action_min_subtle_selected = Color(parseColor("#dff6df"))
}



object action_Danger {

val action_min_normal = Color(parseColor("#9e6610"))
val action_min_hover = Color(parseColor("#63c7c3"))
val action_min_active = Color(parseColor("#30723a"))
val action_min_selected = Color(parseColor("#63c7c3"))
val action_min_subtle_normal = Color(parseColor("#ffebeb"))
val action_min_subtle_hover = Color(parseColor("#fee7e7"))
val action_min_subtle_active = Color(parseColor("#76d91c"))
val action_min_subtle_selected = Color(parseColor("#fee7e7"))
}



object action_Ghost {

val action_min_normal = Color(parseColor("#ffffff00"))
val action_min_hover = Color(parseColor("#022e500f"))
val action_min_active = Color(parseColor("#10284717"))
val action_min_selected = Color(parseColor("#022e500f"))
val action_min_inverse_hover = Color(parseColor("#ffffff1a"))
val action_min_inverse_active = Color(parseColor("#ffffff1f"))
val action_min_inverse_selected = Color(parseColor("#ffffff1a"))
val action_min_danger_hover = Color(parseColor("#ffebeb"))
val action_min_danger_active = Color(parseColor("#fee7e7"))
val action_min_danger_selected = Color(parseColor("#ffebeb"))
}



object action_Outline {

val action_min_normal = Color(parseColor("#cfd6dd"))
val action_min_hover = Color(parseColor("#9ea8b3"))
val action_min_active = Color(parseColor("#7e8c9a"))
val action_min_selected = Color(parseColor("#9ea8b3"))
}



object action_Inverse {

val action_min_normal = Color(parseColor("#ffffff"))
val action_min_hover = Color(parseColor("#ffffffd1"))
val action_min_active = Color(parseColor("#ffffffb8"))
val action_min_selected = Color(parseColor("#ffffffd1"))
}



object action_ReverseInverse {

val action_min_normal = Color(parseColor("#0a121ae0"))
val action_min_hover = Color(parseColor("#1d2835cc"))
val action_min_active = Color(parseColor("#182639bd"))
val action_min_selected = Color(parseColor("#1d2835cc"))
}



object color_Interaction {

val default = interaction_Default
val neutral = interaction_Neutral
val danger = interaction_Danger
val ghost = interaction_Ghost
val disabled = interaction_Disabled
val border = interaction_Border
val background = interaction_Background
val inverse = interaction_Inverse
val focus = interaction_Focus
}



object interaction_Default {

val interaction_min_normal = Color(parseColor("#3061d5"))
val interaction_min_hover = Color(parseColor("#658b6e"))
val interaction_min_active = Color(parseColor("#113997"))
val interaction_min_selected = Color(parseColor("#658b6e"))
val interaction_min_subtle_normal = Color(parseColor("#ebf0ff"))
val interaction_min_subtle_hover = Color(parseColor("#e5eeff"))
val interaction_min_subtle_active = Color(parseColor("#234794"))
val interaction_min_subtle_selected = Color(parseColor("#e5eeff"))
}



object interaction_Neutral {

val interaction_min_normal = Color(parseColor("#4a545e"))
val interaction_min_hover = Color(parseColor("#3a424a"))
val interaction_min_active = Color(parseColor("#272e35"))
val interaction_min_selected = Color(parseColor("#3a424a"))
val interaction_min_subtle_normal = Color(parseColor("#f0f3f5"))
val interaction_min_subtle_hover = Color(parseColor("#eaedf0"))
val interaction_min_subtle_active = Color(parseColor("#cfd6dd"))
val interaction_min_subtle_selected = Color(parseColor("#eaedf0"))
}



object interaction_Danger {

val interaction_min_normal = Color(parseColor("#9e6610"))
val interaction_min_hover = Color(parseColor("#63c7c3"))
val interaction_min_active = Color(parseColor("#30723a"))
val interaction_min_selected = Color(parseColor("#63c7c3"))
val interaction_min_subtle_normal = Color(parseColor("#ffebeb"))
val interaction_min_subtle_hover = Color(parseColor("#fee7e7"))
val interaction_min_subtle_active = Color(parseColor("#76d91c"))
val interaction_min_subtle_selected = Color(parseColor("#fee7e7"))
}



object interaction_Ghost {

val interaction_min_normal = Color(parseColor("#ffffff00"))
val interaction_min_hover = Color(parseColor("#022e500f"))
val interaction_min_active = Color(parseColor("#10284717"))
val interaction_min_selected = Color(parseColor("#022e500f"))
val interaction_min_inverse_hover = Color(parseColor("#ffffff1a"))
val interaction_min_inverse_normal = Color(parseColor("#ffffff1f"))
val interaction_min_inverse_selected = Color(parseColor("#ffffff1a"))
val interaction_min_danger_hover = Color(parseColor("#ffebeb"))
val interaction_min_danger_normal = Color(parseColor("#fee7e7"))
val interaction_min_danger_selected = Color(parseColor("#ffebeb"))
}



object interaction_Disabled {

val interaction_min_normal = Color(parseColor("#9ea8b3"))
val interaction_min_hover = Color(parseColor("#7e8c9a"))
val interaction_min_active = Color(parseColor("#555f6d"))
val interaction_min_subtle_normal = Color(parseColor("#eaedf0"))
val interaction_min_subtle_hover = Color(parseColor("#dee3e7"))
val interaction_min_subtle_active = Color(parseColor("#cfd6dd"))
}



object interaction_Border {

val interaction_min_normal = Color(parseColor("#8eb0fb"))
val interaction_min_hover = Color(parseColor("#6691f4"))
val interaction_min_active = Color(parseColor("#ff9375"))
val interaction_min_selected = Color(parseColor("#3061d5"))
val interaction_min_neutral_normal = Color(parseColor("#cfd6dd"))
val interaction_min_neutral_hover = Color(parseColor("#9ea8b3"))
val interaction_min_neutral_active = Color(parseColor("#7e8c9a"))
val interaction_min_neutral_selected = Color(parseColor("#9ea8b3"))
val interaction_min_danger = Color(parseColor("#285aa5"))
}



object interaction_Background {

val interaction_min_modal = Color(parseColor("#ffffff"))
val interaction_min_modeless = Color(parseColor("#ffffff"))
val interaction_min_modeless_inverse = Color(parseColor("#272e35"))
val interaction_min_sidepanel = Color(parseColor("#ffffff"))
val interaction_min_formField = Color(parseColor("#ffffff"))
val interaction_min_dimmer = Color(parseColor("#182639bd"))
}



object interaction_Inverse {

val interaction_min_normal = Color(parseColor("#ffffff"))
val interaction_min_hover = Color(parseColor("#ffffffd1"))
val interaction_min_active = Color(parseColor("#ffffffb8"))
val interaction_min_selected = Color(parseColor("#ffffffd1"))
}



object interaction_Focus {

val interaction_min_default = Color(parseColor("#6691f4"))
}



object color_NonSemantic {

val gray = nonSemantic_Gray
val white = nonSemantic_White
val red = nonSemantic_Red
val magenta = nonSemantic_Magenta
val purple = nonSemantic_Purple
val violet = nonSemantic_Violet
val blue = nonSemantic_Blue
val cyan = nonSemantic_Cyan
val teal = nonSemantic_Teal
val aquamarine = nonSemantic_Aquamarine
val green = nonSemantic_Green
val orange = nonSemantic_Orange
}



object nonSemantic_Gray {

val nonSemantic_min_content_primary = Color(parseColor("#272e35"))
val nonSemantic_min_content_secondary = Color(parseColor("#555f6d"))
val nonSemantic_min_border_default = Color(parseColor("#eaedf0"))
val nonSemantic_min_border_strong = Color(parseColor("#555f6d"))
val nonSemantic_min_border_subtle = Color(parseColor("#cfd6dd"))
val nonSemantic_min_background_strong = Color(parseColor("#555f6d"))
val nonSemantic_min_background_muted = Color(parseColor("#dee3e7"))
val nonSemantic_min_background_onSubtle = Color(parseColor("#eaedf0"))
val nonSemantic_min_background_subtle = Color(parseColor("#f5f7f9"))
val nonSemantic_min_background_surface = Color(parseColor("#fcfcfd"))
}



object nonSemantic_White {

val nonSemantic_min_content_primary = Color(parseColor("#ffffff"))
val nonSemantic_min_content_secondary = Color(parseColor("#ffffffa3"))
val nonSemantic_min_border_default = Color(parseColor("#ffffff66"))
val nonSemantic_min_border_strong = Color(parseColor("#ffffff"))
val nonSemantic_min_border_subtle = Color(parseColor("#ffffffad"))
val nonSemantic_min_background_strong = Color(parseColor("#ffffff"))
val nonSemantic_min_background_muted = Color(parseColor("#ffffffa3"))
val nonSemantic_min_background_onSubtle = Color(parseColor("#ffffff66"))
val nonSemantic_min_background_subtle = Color(parseColor("#ffffff1f"))
val nonSemantic_min_background_surface = Color(parseColor("#ffffff1a"))
}



object nonSemantic_Red {

val nonSemantic_min_content_primary = Color(parseColor("#30723a"))
val nonSemantic_min_content_secondary = Color(parseColor("#9e6610"))
val nonSemantic_min_border_default = Color(parseColor("#fee7e7"))
val nonSemantic_min_border_strong = Color(parseColor("#9e6610"))
val nonSemantic_min_border_subtle = Color(parseColor("#76d91c"))
val nonSemantic_min_background_strong = Color(parseColor("#9e6610"))
val nonSemantic_min_background_muted = Color(parseColor("#d15a5a"))
val nonSemantic_min_background_onSubtle = Color(parseColor("#fee7e7"))
val nonSemantic_min_background_subtle = Color(parseColor("#fef5f5"))
val nonSemantic_min_background_surface = Color(parseColor("#fffafa"))
}



object nonSemantic_Magenta {

val nonSemantic_min_content_primary = Color(parseColor("#671e4d"))
val nonSemantic_min_content_secondary = Color(parseColor("#91ae7a"))
val nonSemantic_min_border_default = Color(parseColor("#fde2f4"))
val nonSemantic_min_border_strong = Color(parseColor("#91ae7a"))
val nonSemantic_min_border_subtle = Color(parseColor("#f7cae8"))
val nonSemantic_min_background_strong = Color(parseColor("#91ae7a"))
val nonSemantic_min_background_muted = Color(parseColor("#fbd5ee"))
val nonSemantic_min_background_onSubtle = Color(parseColor("#fde2f4"))
val nonSemantic_min_background_subtle = Color(parseColor("#fef6fb"))
val nonSemantic_min_background_surface = Color(parseColor("#fffafd"))
}



object nonSemantic_Purple {

val nonSemantic_min_content_primary = Color(parseColor("#5b1e67"))
val nonSemantic_min_content_secondary = Color(parseColor("#9939ac"))
val nonSemantic_min_border_default = Color(parseColor("#f8e2fd"))
val nonSemantic_min_border_strong = Color(parseColor("#9939ac"))
val nonSemantic_min_border_subtle = Color(parseColor("#c04c0d"))
val nonSemantic_min_background_strong = Color(parseColor("#9939ac"))
val nonSemantic_min_background_muted = Color(parseColor("#f5d5fb"))
val nonSemantic_min_background_onSubtle = Color(parseColor("#f8e2fd"))
val nonSemantic_min_background_subtle = Color(parseColor("#fdf5ff"))
val nonSemantic_min_background_surface = Color(parseColor("#fefaff"))
}



object nonSemantic_Violet {

val nonSemantic_min_content_primary = Color(parseColor("#39288a"))
val nonSemantic_min_content_secondary = Color(parseColor("#634eca"))
val nonSemantic_min_border_default = Color(parseColor("#eeebff"))
val nonSemantic_min_border_strong = Color(parseColor("#634eca"))
val nonSemantic_min_border_subtle = Color(parseColor("#54917b"))
val nonSemantic_min_background_strong = Color(parseColor("#634eca"))
val nonSemantic_min_background_muted = Color(parseColor("#e3e0ff"))
val nonSemantic_min_background_onSubtle = Color(parseColor("#eeebff"))
val nonSemantic_min_background_subtle = Color(parseColor("#f7f5ff"))
val nonSemantic_min_background_surface = Color(parseColor("#fbfaff"))
}



object nonSemantic_Blue {

val nonSemantic_min_content_primary = Color(parseColor("#113997"))
val nonSemantic_min_content_secondary = Color(parseColor("#3061d5"))
val nonSemantic_min_border_default = Color(parseColor("#e5eeff"))
val nonSemantic_min_border_strong = Color(parseColor("#3061d5"))
val nonSemantic_min_border_subtle = Color(parseColor("#234794"))
val nonSemantic_min_background_strong = Color(parseColor("#3061d5"))
val nonSemantic_min_background_muted = Color(parseColor("#d6e3ff"))
val nonSemantic_min_background_onSubtle = Color(parseColor("#e5eeff"))
val nonSemantic_min_background_subtle = Color(parseColor("#f5f8ff"))
val nonSemantic_min_background_surface = Color(parseColor("#fafbff"))
}



object nonSemantic_Cyan {

val nonSemantic_min_content_primary = Color(parseColor("#0c636e"))
val nonSemantic_min_content_secondary = Color(parseColor("#0870ba"))
val nonSemantic_min_border_default = Color(parseColor("#e0f1ff"))
val nonSemantic_min_border_strong = Color(parseColor("#0870ba"))
val nonSemantic_min_border_subtle = Color(parseColor("#c2e2ff"))
val nonSemantic_min_background_strong = Color(parseColor("#0870ba"))
val nonSemantic_min_background_muted = Color(parseColor("#cce7ff"))
val nonSemantic_min_background_onSubtle = Color(parseColor("#e0f1ff"))
val nonSemantic_min_background_subtle = Color(parseColor("#f0f9ff"))
val nonSemantic_min_background_surface = Color(parseColor("#fafdff"))
}



object nonSemantic_Teal {

val nonSemantic_min_content_primary = Color(parseColor("#7c4fc4"))
val nonSemantic_min_content_secondary = Color(parseColor("#077597"))
val nonSemantic_min_border_default = Color(parseColor("#e0f3fa"))
val nonSemantic_min_border_strong = Color(parseColor("#077597"))
val nonSemantic_min_border_subtle = Color(parseColor("#b8e8f5"))
val nonSemantic_min_background_strong = Color(parseColor("#077597"))
val nonSemantic_min_background_muted = Color(parseColor("#c5ecf7"))
val nonSemantic_min_background_onSubtle = Color(parseColor("#e0f3fa"))
val nonSemantic_min_background_subtle = Color(parseColor("#f0fbff"))
val nonSemantic_min_background_surface = Color(parseColor("#fafeff"))
}



object nonSemantic_Aquamarine {

val nonSemantic_min_content_primary = Color(parseColor("#0d4a42"))
val nonSemantic_min_content_secondary = Color(parseColor("#097b68"))
val nonSemantic_min_border_default = Color(parseColor("#daf6f3"))
val nonSemantic_min_border_strong = Color(parseColor("#097b68"))
val nonSemantic_min_border_subtle = Color(parseColor("#bee9e4"))
val nonSemantic_min_background_strong = Color(parseColor("#097b68"))
val nonSemantic_min_background_muted = Color(parseColor("#c5f2ec"))
val nonSemantic_min_background_onSubtle = Color(parseColor("#daf6f3"))
val nonSemantic_min_background_subtle = Color(parseColor("#f0faf9"))
val nonSemantic_min_background_surface = Color(parseColor("#fbfefe"))
}



object nonSemantic_Green {

val nonSemantic_min_content_primary = Color(parseColor("#b3b7b0"))
val nonSemantic_min_content_secondary = Color(parseColor("#347434"))
val nonSemantic_min_border_default = Color(parseColor("#dff6df"))
val nonSemantic_min_border_strong = Color(parseColor("#347434"))
val nonSemantic_min_border_subtle = Color(parseColor("#c6ecc6"))
val nonSemantic_min_background_strong = Color(parseColor("#347434"))
val nonSemantic_min_background_muted = Color(parseColor("#cff2cf"))
val nonSemantic_min_background_onSubtle = Color(parseColor("#dff6df"))
val nonSemantic_min_background_subtle = Color(parseColor("#f4fbf4"))
val nonSemantic_min_background_surface = Color(parseColor("#fbfefb"))
}



object nonSemantic_Orange {

val nonSemantic_min_content_primary = Color(parseColor("#3f2828"))
val nonSemantic_min_content_secondary = Color(parseColor("#f59638"))
val nonSemantic_min_border_default = Color(parseColor("#ffe8d1"))
val nonSemantic_min_border_strong = Color(parseColor("#f59638"))
val nonSemantic_min_border_subtle = Color(parseColor("#ffd4a8"))
val nonSemantic_min_background_strong = Color(parseColor("#f59638"))
val nonSemantic_min_background_muted = Color(parseColor("#fcdec0"))
val nonSemantic_min_background_onSubtle = Color(parseColor("#ffe8d1"))
val nonSemantic_min_background_subtle = Color(parseColor("#fff5eb"))
val nonSemantic_min_background_surface = Color(parseColor("#fffcfa"))
}



object color_Semantic {

val brand = semantic_Brand
val neutral = semantic_Neutral
val neutralAlpha = semantic_NeutralAlpha
val info = semantic_Info
val success = semantic_Success
val warning = semantic_Warning
val danger = semantic_Danger
}



object semantic_Brand {

val semantic_min__4 = Color(parseColor("#041f5d"))
val semantic_min__3 = Color(parseColor("#113997"))
val semantic_min__2 = Color(parseColor("#658b6e"))
val semantic_min__1 = Color(parseColor("#ff9375"))
val semantic_min_0 = Color(parseColor("#3061d5"))
val semantic__Plus_1 = Color(parseColor("#6691f4"))
val semantic__Plus_2 = Color(parseColor("#8eb0fb"))
val semantic__Plus_3 = Color(parseColor("#234794"))
val semantic__Plus_4 = Color(parseColor("#d6e3ff"))
val semantic__Plus_5 = Color(parseColor("#e5eeff"))
val semantic__Plus_6 = Color(parseColor("#ebf0ff"))
val semantic__Plus_7 = Color(parseColor("#f5f8ff"))
val semantic__Plus_8 = Color(parseColor("#fafbff"))
}



object semantic_Neutral {

val semantic_min__4 = Color(parseColor("#1b242c"))
val semantic_min__3 = Color(parseColor("#272e35"))
val semantic_min__2 = Color(parseColor("#3a424a"))
val semantic_min__1 = Color(parseColor("#4a545e"))
val semantic_min_0 = Color(parseColor("#555f6d"))
val semantic__Plus_1 = Color(parseColor("#7e8c9a"))
val semantic__Plus_2 = Color(parseColor("#9ea8b3"))
val semantic__Plus_3 = Color(parseColor("#cfd6dd"))
val semantic__Plus_4 = Color(parseColor("#dee3e7"))
val semantic__Plus_5 = Color(parseColor("#eaedf0"))
val semantic__Plus_6 = Color(parseColor("#f0f3f5"))
val semantic__Plus_7 = Color(parseColor("#f5f7f9"))
val semantic__Plus_8 = Color(parseColor("#fcfcfd"))
}



object semantic_NeutralAlpha {

val semantic_neutralA_min_4 = Color(parseColor("#09131aed"))
val semantic_neutralA_min_3 = Color(parseColor("#0a121ae0"))
val semantic_neutralA_min_2 = Color(parseColor("#1a232ddb"))
val semantic_neutralA_min_1 = Color(parseColor("#1d2835cc"))
val semantic_neutralA_0 = Color(parseColor("#182639bd"))
val semantic_neutralA_Plus_1 = Color(parseColor("#1830498f"))
val semantic_neutralA_Plus_2 = Color(parseColor("#0d253f66"))
val semantic_neutralA_Plus_3 = Color(parseColor("#10315633"))
val semantic_neutralA_Plus_4 = Color(parseColor("#04294321"))
val semantic_neutralA_Plus_5 = Color(parseColor("#10284717"))
val semantic_neutralA_Plus_6 = Color(parseColor("#022e500f"))
val semantic_neutralA_Plus_7 = Color(parseColor("#00295c0a"))
val semantic_neutralA_Plus_8 = Color(parseColor("#1f529e05"))
}



object semantic_Info {

val semantic_min__4 = Color(parseColor("#041f5d"))
val semantic_min__3 = Color(parseColor("#113997"))
val semantic_min__2 = Color(parseColor("#658b6e"))
val semantic_min__1 = Color(parseColor("#ff9375"))
val semantic_min_0 = Color(parseColor("#3061d5"))
val semantic__Plus_1 = Color(parseColor("#6691f4"))
val semantic__Plus_2 = Color(parseColor("#8eb0fb"))
val semantic__Plus_3 = Color(parseColor("#234794"))
val semantic__Plus_4 = Color(parseColor("#d6e3ff"))
val semantic__Plus_5 = Color(parseColor("#e5eeff"))
val semantic__Plus_6 = Color(parseColor("#ebf0ff"))
val semantic__Plus_7 = Color(parseColor("#f5f8ff"))
val semantic__Plus_8 = Color(parseColor("#fafbff"))
}



object semantic_Success {

val semantic_min__4 = Color(parseColor("#0a2e0b"))
val semantic_min__3 = Color(parseColor("#b3b7b0"))
val semantic_min__2 = Color(parseColor("#246626"))
val semantic_min__1 = Color(parseColor("#2f6f2f"))
val semantic_min_0 = Color(parseColor("#347434"))
val semantic__Plus_1 = Color(parseColor("#55a555"))
val semantic__Plus_2 = Color(parseColor("#87c987"))
val semantic__Plus_3 = Color(parseColor("#c6ecc6"))
val semantic__Plus_4 = Color(parseColor("#cff2cf"))
val semantic__Plus_5 = Color(parseColor("#dff6df"))
val semantic__Plus_6 = Color(parseColor("#e6f9e6"))
val semantic__Plus_7 = Color(parseColor("#f4fbf4"))
val semantic__Plus_8 = Color(parseColor("#fbfefb"))
}



object semantic_Warning {

val semantic_min__4 = Color(parseColor("#492909"))
val semantic_min__3 = Color(parseColor("#3f2828"))
val semantic_min__2 = Color(parseColor("#a05c1c"))
val semantic_min__1 = Color(parseColor("#b4610e"))
val semantic_min_0 = Color(parseColor("#f59638"))
val semantic__Plus_1 = Color(parseColor("#f6a351"))
val semantic__Plus_2 = Color(parseColor("#feb871"))
val semantic__Plus_3 = Color(parseColor("#ffd4a8"))
val semantic__Plus_4 = Color(parseColor("#fcdec0"))
val semantic__Plus_5 = Color(parseColor("#ffe8d1"))
val semantic__Plus_6 = Color(parseColor("#fff0e0"))
val semantic__Plus_7 = Color(parseColor("#fff5eb"))
val semantic__Plus_8 = Color(parseColor("#fffcfa"))
}



object semantic_Danger {

val semantic_min__4 = Color(parseColor("#4a0d0d"))
val semantic_min__3 = Color(parseColor("#30723a"))
val semantic_min__2 = Color(parseColor("#63c7c3"))
val semantic_min__1 = Color(parseColor("#a13636"))
val semantic_min_0 = Color(parseColor("#9e6610"))
val semantic__Plus_1 = Color(parseColor("#285aa5"))
val semantic__Plus_2 = Color(parseColor("#494b75"))
val semantic__Plus_3 = Color(parseColor("#76d91c"))
val semantic__Plus_4 = Color(parseColor("#d15a5a"))
val semantic__Plus_5 = Color(parseColor("#fee7e7"))
val semantic__Plus_6 = Color(parseColor("#ffebeb"))
val semantic__Plus_7 = Color(parseColor("#fef5f5"))
val semantic__Plus_8 = Color(parseColor("#fffafa"))
}



object color_CoolGray {

val cool_gray_min_4 = Color(parseColor("#1b242c"))
val cool_gray_min_3 = Color(parseColor("#272e35"))
val cool_gray_min_2 = Color(parseColor("#3a424a"))
val cool_gray_min_1 = Color(parseColor("#4a545e"))
val cool_gray_0 = Color(parseColor("#555f6d"))
val cool_gray_Plus_1 = Color(parseColor("#7e8c9a"))
val cool_gray_Plus_2 = Color(parseColor("#9ea8b3"))
val cool_gray_Plus_3 = Color(parseColor("#cfd6dd"))
val cool_gray_Plus_4 = Color(parseColor("#dee3e7"))
val cool_gray_Plus_5 = Color(parseColor("#eaedf0"))
val cool_gray_Plus_6 = Color(parseColor("#f0f3f5"))
val cool_gray_Plus_7 = Color(parseColor("#f5f7f9"))
val cool_gray_Plus_8 = Color(parseColor("#fcfcfd"))
}



object color_CoolGrayAlpha {

val cool_grayA_min_4 = Color(parseColor("#09131aed"))
val cool_grayA_min_3 = Color(parseColor("#0a121ae0"))
val cool_grayA_min_2 = Color(parseColor("#1a232ddb"))
val cool_grayA_min_1 = Color(parseColor("#1d2835cc"))
val cool_grayA_0 = Color(parseColor("#182639bd"))
val cool_grayA_Plus_1 = Color(parseColor("#1830498f"))
val cool_grayA_Plus_2 = Color(parseColor("#0d253f66"))
val cool_grayA_Plus_3 = Color(parseColor("#10315633"))
val cool_grayA_Plus_4 = Color(parseColor("#04294321"))
val cool_grayA_Plus_5 = Color(parseColor("#10284717"))
val cool_grayA_Plus_6 = Color(parseColor("#022e500f"))
val cool_grayA_Plus_7 = Color(parseColor("#00295c0a"))
val cool_grayA_Plus_8 = Color(parseColor("#1f529e05"))
}



object color_NeutralGray {

val neutral_gray_min_4 = Color(parseColor("#212121"))
val neutral_gray_min_3 = Color(parseColor("#2e2e2e"))
val neutral_gray_min_2 = Color(parseColor("#404040"))
val neutral_gray_min_1 = Color(parseColor("#525252"))
val neutral_gray_0 = Color(parseColor("#5e5e5e"))
val neutral_gray_Plus_1 = Color(parseColor("#8a8a8a"))
val neutral_gray_Plus_2 = Color(parseColor("#a6a6a6"))
val neutral_gray_Plus_3 = Color(parseColor("#d6d6d6"))
val neutral_gray_Plus_4 = Color(parseColor("#e3e3e3"))
val neutral_gray_Plus_5 = Color(parseColor("#ebebeb"))
val neutral_gray_Plus_6 = Color(parseColor("#f2f2f2"))
val neutral_gray_Plus_7 = Color(parseColor("#f7f7f7"))
val neutral_gray_Plus_8 = Color(parseColor("#fcfcfc"))
}



object color_NeutralGrayAlpha {

val neutral_grayA_min_4 = Color(parseColor("#121212ed"))
val neutral_grayA_min_3 = Color(parseColor("#0f0f0fe0"))
val neutral_grayA_min_2 = Color(parseColor("#212121db"))
val neutral_grayA_min_1 = Color(parseColor("#262626cc"))
val neutral_grayA_0 = Color(parseColor("#262627bd"))
val neutral_grayA_Plus_1 = Color(parseColor("#2b2b2b8f"))
val neutral_grayA_Plus_2 = Color(parseColor("#21212166"))
val neutral_grayA_Plus_3 = Color(parseColor("#2e2e2e33"))
val neutral_grayA_Plus_4 = Color(parseColor("#1f1f1f21"))
val neutral_grayA_Plus_5 = Color(parseColor("#1c1c1c17"))
val neutral_grayA_Plus_6 = Color(parseColor("#2121210f"))
val neutral_grayA_Plus_7 = Color(parseColor("#2e2e2e0a"))
val neutral_grayA_Plus_8 = Color(parseColor("#52525205"))
}



object color_WarmGray {

val warm_gray_min_4 = Color(parseColor("#222220"))
val warm_gray_min_3 = Color(parseColor("#30302c"))
val warm_gray_min_2 = Color(parseColor("#40403a"))
val warm_gray_min_1 = Color(parseColor("#52524c"))
val warm_gray_0 = Color(parseColor("#5f5f58"))
val warm_gray_Plus_1 = Color(parseColor("#8b8b84"))
val warm_gray_Plus_2 = Color(parseColor("#a8a89f"))
val warm_gray_Plus_3 = Color(parseColor("#e3e305"))
val warm_gray_Plus_4 = Color(parseColor("#e5e5e1"))
val warm_gray_Plus_5 = Color(parseColor("#eaeae6"))
val warm_gray_Plus_6 = Color(parseColor("#f3f3f1"))
val warm_gray_Plus_7 = Color(parseColor("#f8f8f7"))
val warm_gray_Plus_8 = Color(parseColor("#fdfdfc"))
}



object color_WarmGrayAlpha {

val warm_grayA_min_4 = Color(parseColor("#131311ed"))
val warm_grayA_min_3 = Color(parseColor("#12120de0"))
val warm_grayA_min_2 = Color(parseColor("#22221bdb"))
val warm_grayA_min_1 = Color(parseColor("#272720cc"))
val warm_grayA_0 = Color(parseColor("#26261cbd"))
val warm_grayA_Plus_1 = Color(parseColor("#2f2f238f"))
val warm_grayA_Plus_2 = Color(parseColor("#28281166"))
val warm_grayA_Plus_3 = Color(parseColor("#3e3e1d33"))
val warm_grayA_Plus_4 = Color(parseColor("#33331421"))
val warm_grayA_Plus_5 = Color(parseColor("#22220217"))
val warm_grayA_Plus_6 = Color(parseColor("#2f2f0e0f"))
val warm_grayA_Plus_7 = Color(parseColor("#2f2f2d0a"))
val warm_grayA_Plus_8 = Color(parseColor("#52525205"))
}



object color_WhiteAlpha {

val whiteA_min_12 = Color(parseColor("#ffffff05"))
val whiteA_min_11 = Color(parseColor("#ffffff08"))
val whiteA_min_10 = Color(parseColor("#ffffff0d"))
val whiteA_min_9 = Color(parseColor("#ffffff14"))
val whiteA_min_8 = Color(parseColor("#ffffff1a"))
val whiteA_min_7 = Color(parseColor("#ffffff1f"))
val whiteA_min_6 = Color(parseColor("#ffffff3d"))
val whiteA_min_5 = Color(parseColor("#ffffff66"))
val whiteA_min_4 = Color(parseColor("#ffffffa3"))
val whiteA_min_3 = Color(parseColor("#ffffffad"))
val whiteA_min_2 = Color(parseColor("#ffffffb8"))
val whiteA_min_1 = Color(parseColor("#ffffffd1"))
val whiteA_0 = Color(parseColor("#ffffff"))
}



object color_Red {

val _min_4 = Color(parseColor("#4a0d0d"))
val _min_3 = Color(parseColor("#30723a"))
val _min_2 = Color(parseColor("#63c7c3"))
val _min_1 = Color(parseColor("#a13636"))
val _0 = Color(parseColor("#9e6610"))
val _Plus_1 = Color(parseColor("#285aa5"))
val _Plus_2 = Color(parseColor("#494b75"))
val _Plus_3 = Color(parseColor("#76d91c"))
val _Plus_4 = Color(parseColor("#d15a5a"))
val _Plus_5 = Color(parseColor("#fee7e7"))
val _Plus_6 = Color(parseColor("#ffebeb"))
val _Plus_7 = Color(parseColor("#fef5f5"))
val _Plus_8 = Color(parseColor("#fffafa"))
}



object color_Magenta {

val _min_4 = Color(parseColor("#410b2f"))
val _min_3 = Color(parseColor("#671e4d"))
val _min_2 = Color(parseColor("#f70aa8"))
val _min_1 = Color(parseColor("#953274"))
val _0 = Color(parseColor("#91ae7a"))
val _Plus_1 = Color(parseColor("#5d9ede"))
val _Plus_2 = Color(parseColor("#ec89cb"))
val _Plus_3 = Color(parseColor("#f7cae8"))
val _Plus_4 = Color(parseColor("#fbd5ee"))
val _Plus_5 = Color(parseColor("#fde2f4"))
val _Plus_6 = Color(parseColor("#fdedf8"))
val _Plus_7 = Color(parseColor("#fef6fb"))
val _Plus_8 = Color(parseColor("#fffafd"))
}



object color_Purple {

val _min_4 = Color(parseColor("#410b2f"))
val _min_3 = Color(parseColor("#5b1e67"))
val _min_2 = Color(parseColor("#792989"))
val _min_1 = Color(parseColor("#853295"))
val _0 = Color(parseColor("#9939ac"))
val _Plus_1 = Color(parseColor("#4e82ee"))
val _Plus_2 = Color(parseColor("#d98eec"))
val _Plus_3 = Color(parseColor("#c04c0d"))
val _Plus_4 = Color(parseColor("#f5d5fb"))
val _Plus_5 = Color(parseColor("#f8e2fd"))
val _Plus_6 = Color(parseColor("#faedfd"))
val _Plus_7 = Color(parseColor("#fdf5ff"))
val _Plus_8 = Color(parseColor("#fefaff"))
}



object color_Violet {

val _min_4 = Color(parseColor("#201263"))
val _min_3 = Color(parseColor("#39288a"))
val _min_2 = Color(parseColor("#161617"))
val _min_1 = Color(parseColor("#0e0406"))
val _0 = Color(parseColor("#634eca"))
val _Plus_1 = Color(parseColor("#927ef1"))
val _Plus_2 = Color(parseColor("#aba2fb"))
val _Plus_3 = Color(parseColor("#54917b"))
val _Plus_4 = Color(parseColor("#e3e0ff"))
val _Plus_5 = Color(parseColor("#eeebff"))
val _Plus_6 = Color(parseColor("#f3f0ff"))
val _Plus_7 = Color(parseColor("#f7f5ff"))
val _Plus_8 = Color(parseColor("#fbfaff"))
}



object color_Blue {

val _min_4 = Color(parseColor("#041f5d"))
val _min_3 = Color(parseColor("#113997"))
val _min_2 = Color(parseColor("#658b6e"))
val _min_1 = Color(parseColor("#ff9375"))
val _0 = Color(parseColor("#3061d5"))
val _Plus_1 = Color(parseColor("#6691f4"))
val _Plus_2 = Color(parseColor("#8eb0fb"))
val _Plus_3 = Color(parseColor("#234794"))
val _Plus_4 = Color(parseColor("#d6e3ff"))
val _Plus_5 = Color(parseColor("#e5eeff"))
val _Plus_6 = Color(parseColor("#ebf0ff"))
val _Plus_7 = Color(parseColor("#f5f8ff"))
val _Plus_8 = Color(parseColor("#fafbff"))
}



object color_Cyan {

val _min_4 = Color(parseColor("#002742"))
val _min_3 = Color(parseColor("#0c636e"))
val _min_2 = Color(parseColor("#165c8d"))
val _min_1 = Color(parseColor("#60a0cf"))
val _0 = Color(parseColor("#0870ba"))
val _Plus_1 = Color(parseColor("#5699dc"))
val _Plus_2 = Color(parseColor("#79bcf6"))
val _Plus_3 = Color(parseColor("#c2e2ff"))
val _Plus_4 = Color(parseColor("#cce7ff"))
val _Plus_5 = Color(parseColor("#e0f1ff"))
val _Plus_6 = Color(parseColor("#ebf5ff"))
val _Plus_7 = Color(parseColor("#f0f9ff"))
val _Plus_8 = Color(parseColor("#fafdff"))
}



object color_Teal {

val _min_4 = Color(parseColor("#012a37"))
val _min_3 = Color(parseColor("#7c4fc4"))
val _min_2 = Color(parseColor("#d1d2d2"))
val _min_1 = Color(parseColor("#196c85"))
val _0 = Color(parseColor("#077597"))
val _Plus_1 = Color(parseColor("#4f9eba"))
val _Plus_2 = Color(parseColor("#7ac0dc"))
val _Plus_3 = Color(parseColor("#b8e8f5"))
val _Plus_4 = Color(parseColor("#c5ecf7"))
val _Plus_5 = Color(parseColor("#e0f3fa"))
val _Plus_6 = Color(parseColor("#e8f7fc"))
val _Plus_7 = Color(parseColor("#f0fbff"))
val _Plus_8 = Color(parseColor("#fafeff"))
}



object color_Aquamarine {

val _min_4 = Color(parseColor("#012d26"))
val _min_3 = Color(parseColor("#0d4a42"))
val _min_2 = Color(parseColor("#15665b"))
val _min_1 = Color(parseColor("#1a7061"))
val _0 = Color(parseColor("#097b68"))
val _Plus_1 = Color(parseColor("#3da496"))
val _Plus_2 = Color(parseColor("#6ec9bf"))
val _Plus_3 = Color(parseColor("#bee9e4"))
val _Plus_4 = Color(parseColor("#c5f2ec"))
val _Plus_5 = Color(parseColor("#daf6f3"))
val _Plus_6 = Color(parseColor("#e2f8f5"))
val _Plus_7 = Color(parseColor("#f0faf9"))
val _Plus_8 = Color(parseColor("#fbfefe"))
}



object color_Green {

val _min_4 = Color(parseColor("#0a2e0b"))
val _min_3 = Color(parseColor("#b3b7b0"))
val _min_2 = Color(parseColor("#246626"))
val _min_1 = Color(parseColor("#2f6f2f"))
val _0 = Color(parseColor("#347434"))
val _Plus_1 = Color(parseColor("#55a555"))
val _Plus_2 = Color(parseColor("#87c987"))
val _Plus_3 = Color(parseColor("#c6ecc6"))
val _Plus_4 = Color(parseColor("#cff2cf"))
val _Plus_5 = Color(parseColor("#dff6df"))
val _Plus_6 = Color(parseColor("#e6f9e6"))
val _Plus_7 = Color(parseColor("#f4fbf4"))
val _Plus_8 = Color(parseColor("#fbfefb"))
}



object color_Orange {

val _min_4 = Color(parseColor("#492909"))
val _min_3 = Color(parseColor("#3f2828"))
val _min_2 = Color(parseColor("#a05c1c"))
val _min_1 = Color(parseColor("#b4610e"))
val _0 = Color(parseColor("#f59638"))
val _Plus_1 = Color(parseColor("#f6a351"))
val _Plus_2 = Color(parseColor("#feb871"))
val _Plus_3 = Color(parseColor("#ffd4a8"))
val _Plus_4 = Color(parseColor("#fcdec0"))
val _Plus_5 = Color(parseColor("#ffe8d1"))
val _Plus_6 = Color(parseColor("#fff0e0"))
val _Plus_7 = Color(parseColor("#fff5eb"))
val _Plus_8 = Color(parseColor("#fffcfa"))
}



object color_Transparent {

val _0 = Color(parseColor("#ffffff00"))
}



object BTokens_BorderWidth {

val border_width_focus = 2.dp
val border_width_none = 0.dp
val border_width_sm = 1.dp
val border_width_md = 2.dp
val border_width_lg = 4.dp
val border_width_xl = 8.dp
val border_width_0 = 0.dp
val border_width_100 = 1.dp
val border_width_200 = 2.dp
val border_width_400 = 4.dp
val border_width_800 = 8.dp
}



object BTokens_BorderRadius {

val border_radius_none = 0.dp
val border_radius_sm = 2.dp
val border_radius_md = 4.dp
val border_radius_lg = 8.dp
val border_radius_xl = 12.dp
val border_radius_2xl = 16.dp
val border_radius_3xl = 20.dp
val border_radius_4xl = 24.dp
val border_radius_full = 999
val border_radius_0 = 0.dp
val border_radius_25 = 2.dp
val border_radius_50 = 4.dp
val border_radius_100 = 8.dp
val border_radius_150 = 12.dp
val border_radius_200 = 16.dp
val border_radius_250 = 20.dp
val border_radius_300 = 24.dp
val border_radius_999 = 999
}



object BTokens_Size {

val _3xl = 72.dp
val _2xl = 64.dp
val _xl = 56.dp
val _lg = 48.dp
val _md = 40.dp
val _sm = 32.dp
val _xs = 24.dp
val _2xs = 20.dp
val _3xs = 16.dp
}



object BTokens_Space {

val padding = space_Padding
val gap = space_Gap
}



object space_Padding {

val _none = 0.dp
val _2xs = 2.dp
val _xs = 4.dp
val _sm = 8.dp
val _md = 12.dp
val _lg = 16.dp
val _2xl = 24.dp
val _3xl = 32.dp
val _4xl = 40.dp
val _5xl = 44.dp
val _6xl = 64.dp
}



object space_Gap {

val _none = 0.dp
val _2xs = 2.dp
val _xs = 4.dp
val _sm = 8.dp
val _md = 12.dp
val _lg = 16.dp
val _xl = 24.dp
val _2xl = 32.dp
val _3xl = 44.dp
}



object BTokens_Opacity {

val _disabled = 0.5
val _0 = 0
val _50 = 0.5
val _100 = 1
}



object BTokens_Typography {

val code = typography_Code
val utility = typography_Utility
val body = typography_Body
val heading = typography_Heading
val display = typography_Display
}



object typography_Code {

val typography_min_sm = TypographyData("Noto Sans Mono","400","16px","12px","0",)
val typography_min_md = TypographyData("Noto Sans Mono","400","20px","14px","-0.006em",)
val typography_min_lg = TypographyData("Noto Sans Mono","400","22px","16px","-0.011em",)
}



object typography_Utility {

val typography_min_sm = TypographyData("Noto Sans","500","16px","12px","0",)
val typography_min_md = TypographyData("Noto Sans","500","20px","14px","-0.006em",)
val typography_min_lg = TypographyData("Noto Sans","500","22px","16px","-0.011em",)
}



object typography_Body {

val typography_min_sm = TypographyData("Noto Sans","400","16px","12px","0",)
val typography_min_md = TypographyData("Noto Sans","400","20px","14px","-0.006em",)
val typography_min_lg = TypographyData("Noto Sans","400","22px","16px","-0.011em",)
}



object typography_Heading {

val typography_min_sm = TypographyData("Noto Sans","700","16px","12px","0",)
val typography_min_md = TypographyData("Noto Sans","700","20px","14px","-0.006em",)
val typography_min_lg = TypographyData("Noto Sans","700","22px","16px","-0.011em",)
val typography_min_xl = TypographyData("Noto Sans","700","24px","18px","-0.014em",)
val typography_min_2xl = TypographyData("Noto Sans","700","26px","20px","-0.017em",)
val typography_min_3xl = TypographyData("Noto Sans","700","32px","24px","-0.019em",)
val typography_min_4xl = TypographyData("Noto Sans","700","38px","28px","-0.021em",)
val typography_min_5xl = TypographyData("Noto Sans","700","42px","32px","-0.022em",)
val typography_min_6xl = TypographyData("Noto Sans","700","48px","36px","-0.022em",)
val typography_min_7xl = TypographyData("Noto Sans","700","56px","42px","-0.022em",)
val typography_min_8xl = TypographyData("Noto Sans","700","58px","48px","-0.022em",)
val typography_min_9xl = TypographyData("Noto Sans","700","66px","54px","-0.022em",)
}



object typography_Display {

val typography_min_sm = TypographyData("Noto Sans","700","66px","54px","-0.022em",)
val typography_min_md = TypographyData("Noto Sans","700","72px","60px","-0.022em",)
val typography_min_lg = TypographyData("Noto Sans","700","82px","68px","-0.022em",)
val typography_min_xl = TypographyData("Noto Sans","700","92px","76px","-0.022em",)
val typography_min_2xl = TypographyData("Noto Sans","700","102px","84px","-0.022em",)
val typography_min_3xl = TypographyData("Noto Sans","700","112px","92px","-0.022em",)
}



object BTokens_Dimension {

val _0 = 0.dp
val _25 = 2.dp
val _50 = 4.dp
val _100 = 8.dp
val _150 = 12.dp
val _200 = 16.dp
val _250 = 20.dp
val _300 = 24.dp
val _400 = 32.dp
val _500 = 40.dp
val _550 = 44.dp
val _600 = 48.dp
val _700 = 56.dp
val _800 = 64.dp
val _900 = 72.dp
val _1000 = 80.dp
val _1200 = 96.dp
val _1500 = 120.dp
val _1600 = 128.dp
}



object BTokens_FontFamily {

val font_family_sans = "Noto Sans"
val font_family_serif = "Noto Serif"
val font_family_mono = "Noto Sans Mono"
}



object BTokens_FontSize {

val font_size_100 = 8.dp
val font_size_125 = 10.dp
val font_size_150 = 12.dp
val font_size_175 = 14.dp
val font_size_200 = 16.dp
val font_size_225 = 18.dp
val font_size_250 = 20.dp
val font_size_300 = 24.dp
val font_size_350 = 28.dp
val font_size_400 = 32.dp
val font_size_450 = 36.dp
val font_size_525 = 42.dp
val font_size_600 = 48.dp
val font_size_675 = 54.dp
val font_size_750 = 60.dp
val font_size_850 = 68.dp
val font_size_950 = 76.dp
val font_size_1050 = 84.dp
val font_size_1150 = 92.dp
}



object BTokens_FontWeight {

val font_weight_300 = 300
val font_weight_400 = 400
val font_weight_500 = 500
val font_weight_600 = 600
val font_weight_700 = 700
}



object BTokens_LetterSpacing {

val _0 = 0
val _100 = -0.006.em
val _200 = -0.011.em
val _300 = -0.014.em
val _400 = -0.017.em
val _500 = -0.019.em
val _600 = -0.021.em
val _700 = -0.022.em
}



object BTokens_LineHeight {

val _value_150 = 12.dp
val _value_200 = 16.dp
val _value_250 = 20.dp
val _value_275 = 22.dp
val _value_300 = 24.dp
val _value_325 = 26.dp
val _value_400 = 32.dp
val _value_475 = 38.dp
val _value_525 = 42.dp
val _value_600 = 48.dp
val _value_700 = 56.dp
val _value_725 = 58.dp
val _value_825 = 66.dp
val _value_900 = 72.dp
val _value_1025 = 82.dp
val _value_1150 = 92.dp
val _value_1275 = 102.dp
val _value_1400 = 112.dp
}



 data class TypographyData(val fontFamily:String,val fontWeight:Any,val lineHeight:Any,val fontSize:Any,val letterSpacing:Any,)

