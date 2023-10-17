import androidx.compose.ui.unit.*
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt
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
val tokenSetOrder = BTokens_TokenSetOrder
val Default = BTokens_Default
val Default Theme = BTokens_Default Theme
val Light = BTokens_Light
val Dark = BTokens_Dark
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

val _primary = Color("#272e35".toColorInt())
val _secondary = Color("#555f6d".toColorInt())
val _tertiary = Color("#7e8c9a".toColorInt())
val _disabled = Color("#9ea8b3".toColorInt())
val _primary_inverse = Color("#ffffff".toColorInt())
val _secondary_inverse = Color("#ffffffa3".toColorInt())
val _tertiary_inverse = Color("#ffffff66".toColorInt())
val _disabled_inverse = Color("#ffffff3d".toColorInt())
val _info_primary = Color("#113997".toColorInt())
val _info_secondary = Color("#3061d5".toColorInt())
val _success_primary = Color("#b3b7b0".toColorInt())
val _success_secondary = Color("#347434".toColorInt())
val _warning_primary = Color("#3f2828".toColorInt())
val _warning_secondary = Color("#f59638".toColorInt())
val _danger_primary = Color("#30723a".toColorInt())
val _danger_secondary = Color("#279e10".toColorInt())
val _brand_primary = Color("#113997".toColorInt())
val _brand_secondary = Color("#3061d5".toColorInt())
}



object color_Border {

val _default = Color("#eaedf0".toColorInt())
val _defaultA = Color("#10284717".toColorInt())
val _inverse = Color("#ffffff".toColorInt())
val _neutral_strong = Color("#555f6d".toColorInt())
val _neutral_subtle = Color("#cfd6dd".toColorInt())
val _info_strong = Color("#3061d5".toColorInt())
val _info_subtle = Color("#234794".toColorInt())
val _success_strong = Color("#347434".toColorInt())
val _success_subtle = Color("#c6ecc6".toColorInt())
val _warning_strong = Color("#f59638".toColorInt())
val _warning_subtle = Color("#ffd4a8".toColorInt())
val _danger_strong = Color("#279e10".toColorInt())
val _danger_subtle = Color("#76d91c".toColorInt())
}



object color_Background {

val _default = Color("#ffffff".toColorInt())
val _inverse = Color("#272e35".toColorInt())
val _neutral_strong = Color("#555f6d".toColorInt())
val _neutral_muted = Color("#dee3e7".toColorInt())
val _neutral_onSubtle = Color("#eaedf0".toColorInt())
val _neutral_subtle = Color("#f5f7f9".toColorInt())
val _neutral_surface = Color("#fcfcfd".toColorInt())
val _info_strong = Color("#3061d5".toColorInt())
val _info_muted = Color("#d6e3ff".toColorInt())
val _info_onSubtle = Color("#e5eeff".toColorInt())
val _info_subtle = Color("#f5f8ff".toColorInt())
val _info_surface = Color("#fafbff".toColorInt())
val _success_strong = Color("#347434".toColorInt())
val _success_muted = Color("#cff2cf".toColorInt())
val _success_onSubtle = Color("#dff6df".toColorInt())
val _success_subtle = Color("#f4fbf4".toColorInt())
val _success_surface = Color("#fbfefb".toColorInt())
val _warning_strong = Color("#f59638".toColorInt())
val _warning_muted = Color("#fcdec0".toColorInt())
val _warning_onSubtle = Color("#ffe8d1".toColorInt())
val _warning_subtle = Color("#fff5eb".toColorInt())
val _warning_surface = Color("#fffcfa".toColorInt())
val _danger_strong = Color("#279e10".toColorInt())
val _danger_muted = Color("#d15a5a".toColorInt())
val _danger_onSubtle = Color("#fee7e7".toColorInt())
val _danger_subtle = Color("#fef5f5".toColorInt())
val _danger_surface = Color("#fffafa".toColorInt())
val _brand_strong = Color("#3061d5".toColorInt())
val _brand_muted = Color("#d6e3ff".toColorInt())
val _brand_onSubtle = Color("#e5eeff".toColorInt())
val _brand_surface = Color("#fafbff".toColorInt())
val _brand_subtle = Color("#f5f8ff".toColorInt())
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

val action_min_normal = Color("#3061d5".toColorInt())
val action_min_hover = Color("#658b6e".toColorInt())
val action_min_active = Color("#113997".toColorInt())
val action_min_selected = Color("#658b6e".toColorInt())
val action_min_subtle_normal = Color("#ebf0ff".toColorInt())
val action_min_subtle_hover = Color("#e5eeff".toColorInt())
val action_min_subtle_active = Color("#234794".toColorInt())
val action_min_subtle_selected = Color("#e5eeff".toColorInt())
}



object action_Neutral {

val action_min_normal = Color("#4a545e".toColorInt())
val action_min_hover = Color("#3a424a".toColorInt())
val action_min_active = Color("#272e35".toColorInt())
val action_min_selected = Color("#3a424a".toColorInt())
val action_min_subtle_normal = Color("#f0f3f5".toColorInt())
val action_min_subtle_hover = Color("#eaedf0".toColorInt())
val action_min_subtle_active = Color("#cfd6dd".toColorInt())
val action_min_subtle_selected = Color("#eaedf0".toColorInt())
}



object action_Success {

val action_min_normal = Color("#347434".toColorInt())
val action_min_hover = Color("#246626".toColorInt())
val action_min_active = Color("#b3b7b0".toColorInt())
val action_min_selected = Color("#246626".toColorInt())
val action_min_subtle_normal = Color("#e6f9e6".toColorInt())
val action_min_subtle_hover = Color("#dff6df".toColorInt())
val action_min_subtle_active = Color("#c6ecc6".toColorInt())
val action_min_subtle_selected = Color("#dff6df".toColorInt())
}



object action_Danger {

val action_min_normal = Color("#279e10".toColorInt())
val action_min_hover = Color("#63c7c3".toColorInt())
val action_min_active = Color("#30723a".toColorInt())
val action_min_selected = Color("#63c7c3".toColorInt())
val action_min_subtle_normal = Color("#ffebeb".toColorInt())
val action_min_subtle_hover = Color("#fee7e7".toColorInt())
val action_min_subtle_active = Color("#76d91c".toColorInt())
val action_min_subtle_selected = Color("#fee7e7".toColorInt())
}



object action_Ghost {

val action_min_normal = Color("#ffffff00".toColorInt())
val action_min_hover = Color("#022e500f".toColorInt())
val action_min_active = Color("#10284717".toColorInt())
val action_min_selected = Color("#022e500f".toColorInt())
val action_min_inverse_hover = Color("#ffffff1a".toColorInt())
val action_min_inverse_active = Color("#ffffff1f".toColorInt())
val action_min_inverse_selected = Color("#ffffff1a".toColorInt())
val action_min_danger_hover = Color("#ffebeb".toColorInt())
val action_min_danger_active = Color("#fee7e7".toColorInt())
val action_min_danger_selected = Color("#ffebeb".toColorInt())
}



object action_Outline {

val action_min_normal = Color("#cfd6dd".toColorInt())
val action_min_hover = Color("#9ea8b3".toColorInt())
val action_min_active = Color("#7e8c9a".toColorInt())
val action_min_selected = Color("#9ea8b3".toColorInt())
}



object action_Inverse {

val action_min_normal = Color("#ffffff".toColorInt())
val action_min_hover = Color("#ffffffd1".toColorInt())
val action_min_active = Color("#ffffffb8".toColorInt())
val action_min_selected = Color("#ffffffd1".toColorInt())
}



object action_ReverseInverse {

val action_min_normal = Color("#0a121ae0".toColorInt())
val action_min_hover = Color("#1d2835cc".toColorInt())
val action_min_active = Color("#182639bd".toColorInt())
val action_min_selected = Color("#1d2835cc".toColorInt())
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

val interaction_min_normal = Color("#3061d5".toColorInt())
val interaction_min_hover = Color("#658b6e".toColorInt())
val interaction_min_active = Color("#113997".toColorInt())
val interaction_min_selected = Color("#658b6e".toColorInt())
val interaction_min_subtle_normal = Color("#ebf0ff".toColorInt())
val interaction_min_subtle_hover = Color("#e5eeff".toColorInt())
val interaction_min_subtle_active = Color("#234794".toColorInt())
val interaction_min_subtle_selected = Color("#e5eeff".toColorInt())
}



object interaction_Neutral {

val interaction_min_normal = Color("#4a545e".toColorInt())
val interaction_min_hover = Color("#3a424a".toColorInt())
val interaction_min_active = Color("#272e35".toColorInt())
val interaction_min_selected = Color("#3a424a".toColorInt())
val interaction_min_subtle_normal = Color("#f0f3f5".toColorInt())
val interaction_min_subtle_hover = Color("#eaedf0".toColorInt())
val interaction_min_subtle_active = Color("#cfd6dd".toColorInt())
val interaction_min_subtle_selected = Color("#eaedf0".toColorInt())
}



object interaction_Danger {

val interaction_min_normal = Color("#279e10".toColorInt())
val interaction_min_hover = Color("#63c7c3".toColorInt())
val interaction_min_active = Color("#30723a".toColorInt())
val interaction_min_selected = Color("#63c7c3".toColorInt())
val interaction_min_subtle_normal = Color("#ffebeb".toColorInt())
val interaction_min_subtle_hover = Color("#fee7e7".toColorInt())
val interaction_min_subtle_active = Color("#76d91c".toColorInt())
val interaction_min_subtle_selected = Color("#fee7e7".toColorInt())
}



object interaction_Ghost {

val interaction_min_normal = Color("#ffffff00".toColorInt())
val interaction_min_hover = Color("#022e500f".toColorInt())
val interaction_min_active = Color("#10284717".toColorInt())
val interaction_min_selected = Color("#022e500f".toColorInt())
val interaction_min_inverse_hover = Color("#ffffff1a".toColorInt())
val interaction_min_inverse_normal = Color("#ffffff1f".toColorInt())
val interaction_min_inverse_selected = Color("#ffffff1a".toColorInt())
val interaction_min_danger_hover = Color("#ffebeb".toColorInt())
val interaction_min_danger_normal = Color("#fee7e7".toColorInt())
val interaction_min_danger_selected = Color("#ffebeb".toColorInt())
}



object interaction_Disabled {

val interaction_min_normal = Color("#9ea8b3".toColorInt())
val interaction_min_hover = Color("#7e8c9a".toColorInt())
val interaction_min_active = Color("#555f6d".toColorInt())
val interaction_min_subtle_normal = Color("#eaedf0".toColorInt())
val interaction_min_subtle_hover = Color("#dee3e7".toColorInt())
val interaction_min_subtle_active = Color("#cfd6dd".toColorInt())
}



object interaction_Border {

val interaction_min_normal = Color("#8eb0fb".toColorInt())
val interaction_min_hover = Color("#6691f4".toColorInt())
val interaction_min_active = Color("#ff9375".toColorInt())
val interaction_min_selected = Color("#3061d5".toColorInt())
val interaction_min_neutral_normal = Color("#cfd6dd".toColorInt())
val interaction_min_neutral_hover = Color("#9ea8b3".toColorInt())
val interaction_min_neutral_active = Color("#7e8c9a".toColorInt())
val interaction_min_neutral_selected = Color("#9ea8b3".toColorInt())
val interaction_min_danger = Color("#285aa5".toColorInt())
}



object interaction_Background {

val interaction_min_modal = Color("#ffffff".toColorInt())
val interaction_min_modeless = Color("#ffffff".toColorInt())
val interaction_min_modeless_inverse = Color("#272e35".toColorInt())
val interaction_min_sidepanel = Color("#ffffff".toColorInt())
val interaction_min_formField = Color("#ffffff".toColorInt())
val interaction_min_dimmer = Color("#182639bd".toColorInt())
}



object interaction_Inverse {

val interaction_min_normal = Color("#ffffff".toColorInt())
val interaction_min_hover = Color("#ffffffd1".toColorInt())
val interaction_min_active = Color("#ffffffb8".toColorInt())
val interaction_min_selected = Color("#ffffffd1".toColorInt())
}



object interaction_Focus {

val interaction_min_default = Color("#6691f4".toColorInt())
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

val nonSemantic_min_content_primary = Color("#272e35".toColorInt())
val nonSemantic_min_content_secondary = Color("#555f6d".toColorInt())
val nonSemantic_min_border_default = Color("#eaedf0".toColorInt())
val nonSemantic_min_border_strong = Color("#555f6d".toColorInt())
val nonSemantic_min_border_subtle = Color("#cfd6dd".toColorInt())
val nonSemantic_min_background_strong = Color("#555f6d".toColorInt())
val nonSemantic_min_background_muted = Color("#dee3e7".toColorInt())
val nonSemantic_min_background_onSubtle = Color("#eaedf0".toColorInt())
val nonSemantic_min_background_subtle = Color("#f5f7f9".toColorInt())
val nonSemantic_min_background_surface = Color("#fcfcfd".toColorInt())
}



object nonSemantic_White {

val nonSemantic_min_content_primary = Color("#ffffff".toColorInt())
val nonSemantic_min_content_secondary = Color("#ffffffa3".toColorInt())
val nonSemantic_min_border_default = Color("#ffffff66".toColorInt())
val nonSemantic_min_border_strong = Color("#ffffff".toColorInt())
val nonSemantic_min_border_subtle = Color("#ffffffad".toColorInt())
val nonSemantic_min_background_strong = Color("#ffffff".toColorInt())
val nonSemantic_min_background_muted = Color("#ffffffa3".toColorInt())
val nonSemantic_min_background_onSubtle = Color("#ffffff66".toColorInt())
val nonSemantic_min_background_subtle = Color("#ffffff1f".toColorInt())
val nonSemantic_min_background_surface = Color("#ffffff1a".toColorInt())
}



object nonSemantic_Red {

val nonSemantic_min_content_primary = Color("#30723a".toColorInt())
val nonSemantic_min_content_secondary = Color("#279e10".toColorInt())
val nonSemantic_min_border_default = Color("#fee7e7".toColorInt())
val nonSemantic_min_border_strong = Color("#279e10".toColorInt())
val nonSemantic_min_border_subtle = Color("#76d91c".toColorInt())
val nonSemantic_min_background_strong = Color("#279e10".toColorInt())
val nonSemantic_min_background_muted = Color("#d15a5a".toColorInt())
val nonSemantic_min_background_onSubtle = Color("#fee7e7".toColorInt())
val nonSemantic_min_background_subtle = Color("#fef5f5".toColorInt())
val nonSemantic_min_background_surface = Color("#fffafa".toColorInt())
}



object nonSemantic_Magenta {

val nonSemantic_min_content_primary = Color("#671e4d".toColorInt())
val nonSemantic_min_content_secondary = Color("#91ae7a".toColorInt())
val nonSemantic_min_border_default = Color("#fde2f4".toColorInt())
val nonSemantic_min_border_strong = Color("#91ae7a".toColorInt())
val nonSemantic_min_border_subtle = Color("#f7cae8".toColorInt())
val nonSemantic_min_background_strong = Color("#91ae7a".toColorInt())
val nonSemantic_min_background_muted = Color("#fbd5ee".toColorInt())
val nonSemantic_min_background_onSubtle = Color("#fde2f4".toColorInt())
val nonSemantic_min_background_subtle = Color("#fef6fb".toColorInt())
val nonSemantic_min_background_surface = Color("#fffafd".toColorInt())
}



object nonSemantic_Purple {

val nonSemantic_min_content_primary = Color("#5b1e67".toColorInt())
val nonSemantic_min_content_secondary = Color("#9939ac".toColorInt())
val nonSemantic_min_border_default = Color("#f8e2fd".toColorInt())
val nonSemantic_min_border_strong = Color("#9939ac".toColorInt())
val nonSemantic_min_border_subtle = Color("#f4caf7".toColorInt())
val nonSemantic_min_background_strong = Color("#9939ac".toColorInt())
val nonSemantic_min_background_muted = Color("#f5d5fb".toColorInt())
val nonSemantic_min_background_onSubtle = Color("#f8e2fd".toColorInt())
val nonSemantic_min_background_subtle = Color("#fdf5ff".toColorInt())
val nonSemantic_min_background_surface = Color("#fefaff".toColorInt())
}



object nonSemantic_Violet {

val nonSemantic_min_content_primary = Color("#39288a".toColorInt())
val nonSemantic_min_content_secondary = Color("#634eca".toColorInt())
val nonSemantic_min_border_default = Color("#eeebff".toColorInt())
val nonSemantic_min_border_strong = Color("#634eca".toColorInt())
val nonSemantic_min_border_subtle = Color("#54917b".toColorInt())
val nonSemantic_min_background_strong = Color("#634eca".toColorInt())
val nonSemantic_min_background_muted = Color("#e3e0ff".toColorInt())
val nonSemantic_min_background_onSubtle = Color("#eeebff".toColorInt())
val nonSemantic_min_background_subtle = Color("#f7f5ff".toColorInt())
val nonSemantic_min_background_surface = Color("#fbfaff".toColorInt())
}



object nonSemantic_Blue {

val nonSemantic_min_content_primary = Color("#113997".toColorInt())
val nonSemantic_min_content_secondary = Color("#3061d5".toColorInt())
val nonSemantic_min_border_default = Color("#e5eeff".toColorInt())
val nonSemantic_min_border_strong = Color("#3061d5".toColorInt())
val nonSemantic_min_border_subtle = Color("#234794".toColorInt())
val nonSemantic_min_background_strong = Color("#3061d5".toColorInt())
val nonSemantic_min_background_muted = Color("#d6e3ff".toColorInt())
val nonSemantic_min_background_onSubtle = Color("#e5eeff".toColorInt())
val nonSemantic_min_background_subtle = Color("#f5f8ff".toColorInt())
val nonSemantic_min_background_surface = Color("#fafbff".toColorInt())
}



object nonSemantic_Cyan {

val nonSemantic_min_content_primary = Color("#0c636e".toColorInt())
val nonSemantic_min_content_secondary = Color("#0870ba".toColorInt())
val nonSemantic_min_border_default = Color("#e0f1ff".toColorInt())
val nonSemantic_min_border_strong = Color("#0870ba".toColorInt())
val nonSemantic_min_border_subtle = Color("#c2e2ff".toColorInt())
val nonSemantic_min_background_strong = Color("#0870ba".toColorInt())
val nonSemantic_min_background_muted = Color("#cce7ff".toColorInt())
val nonSemantic_min_background_onSubtle = Color("#e0f1ff".toColorInt())
val nonSemantic_min_background_subtle = Color("#f0f9ff".toColorInt())
val nonSemantic_min_background_surface = Color("#fafdff".toColorInt())
}



object nonSemantic_Teal {

val nonSemantic_min_content_primary = Color("#7c4fc4".toColorInt())
val nonSemantic_min_content_secondary = Color("#077597".toColorInt())
val nonSemantic_min_border_default = Color("#e0f3fa".toColorInt())
val nonSemantic_min_border_strong = Color("#077597".toColorInt())
val nonSemantic_min_border_subtle = Color("#b8e8f5".toColorInt())
val nonSemantic_min_background_strong = Color("#077597".toColorInt())
val nonSemantic_min_background_muted = Color("#c5ecf7".toColorInt())
val nonSemantic_min_background_onSubtle = Color("#e0f3fa".toColorInt())
val nonSemantic_min_background_subtle = Color("#f0fbff".toColorInt())
val nonSemantic_min_background_surface = Color("#fafeff".toColorInt())
}



object nonSemantic_Aquamarine {

val nonSemantic_min_content_primary = Color("#0d4a42".toColorInt())
val nonSemantic_min_content_secondary = Color("#097b68".toColorInt())
val nonSemantic_min_border_default = Color("#daf6f3".toColorInt())
val nonSemantic_min_border_strong = Color("#097b68".toColorInt())
val nonSemantic_min_border_subtle = Color("#bee9e4".toColorInt())
val nonSemantic_min_background_strong = Color("#097b68".toColorInt())
val nonSemantic_min_background_muted = Color("#c5f2ec".toColorInt())
val nonSemantic_min_background_onSubtle = Color("#daf6f3".toColorInt())
val nonSemantic_min_background_subtle = Color("#f0faf9".toColorInt())
val nonSemantic_min_background_surface = Color("#fbfefe".toColorInt())
}



object nonSemantic_Green {

val nonSemantic_min_content_primary = Color("#b3b7b0".toColorInt())
val nonSemantic_min_content_secondary = Color("#347434".toColorInt())
val nonSemantic_min_border_default = Color("#dff6df".toColorInt())
val nonSemantic_min_border_strong = Color("#347434".toColorInt())
val nonSemantic_min_border_subtle = Color("#c6ecc6".toColorInt())
val nonSemantic_min_background_strong = Color("#347434".toColorInt())
val nonSemantic_min_background_muted = Color("#cff2cf".toColorInt())
val nonSemantic_min_background_onSubtle = Color("#dff6df".toColorInt())
val nonSemantic_min_background_subtle = Color("#f4fbf4".toColorInt())
val nonSemantic_min_background_surface = Color("#fbfefb".toColorInt())
}



object nonSemantic_Orange {

val nonSemantic_min_content_primary = Color("#3f2828".toColorInt())
val nonSemantic_min_content_secondary = Color("#f59638".toColorInt())
val nonSemantic_min_border_default = Color("#ffe8d1".toColorInt())
val nonSemantic_min_border_strong = Color("#f59638".toColorInt())
val nonSemantic_min_border_subtle = Color("#ffd4a8".toColorInt())
val nonSemantic_min_background_strong = Color("#f59638".toColorInt())
val nonSemantic_min_background_muted = Color("#fcdec0".toColorInt())
val nonSemantic_min_background_onSubtle = Color("#ffe8d1".toColorInt())
val nonSemantic_min_background_subtle = Color("#fff5eb".toColorInt())
val nonSemantic_min_background_surface = Color("#fffcfa".toColorInt())
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

val semantic_min__4 = Color("#041f5d".toColorInt())
val semantic_min__3 = Color("#113997".toColorInt())
val semantic_min__2 = Color("#658b6e".toColorInt())
val semantic_min__1 = Color("#ff9375".toColorInt())
val semantic_min_0 = Color("#3061d5".toColorInt())
val semantic__Plus_1 = Color("#6691f4".toColorInt())
val semantic__Plus_2 = Color("#8eb0fb".toColorInt())
val semantic__Plus_3 = Color("#234794".toColorInt())
val semantic__Plus_4 = Color("#d6e3ff".toColorInt())
val semantic__Plus_5 = Color("#e5eeff".toColorInt())
val semantic__Plus_6 = Color("#ebf0ff".toColorInt())
val semantic__Plus_7 = Color("#f5f8ff".toColorInt())
val semantic__Plus_8 = Color("#fafbff".toColorInt())
}



object semantic_Neutral {

val semantic_min__4 = Color("#1b242c".toColorInt())
val semantic_min__3 = Color("#272e35".toColorInt())
val semantic_min__2 = Color("#3a424a".toColorInt())
val semantic_min__1 = Color("#4a545e".toColorInt())
val semantic_min_0 = Color("#555f6d".toColorInt())
val semantic__Plus_1 = Color("#7e8c9a".toColorInt())
val semantic__Plus_2 = Color("#9ea8b3".toColorInt())
val semantic__Plus_3 = Color("#cfd6dd".toColorInt())
val semantic__Plus_4 = Color("#dee3e7".toColorInt())
val semantic__Plus_5 = Color("#eaedf0".toColorInt())
val semantic__Plus_6 = Color("#f0f3f5".toColorInt())
val semantic__Plus_7 = Color("#f5f7f9".toColorInt())
val semantic__Plus_8 = Color("#fcfcfd".toColorInt())
}



object semantic_NeutralAlpha {

val semantic_neutralA_min_4 = Color("#09131aed".toColorInt())
val semantic_neutralA_min_3 = Color("#0a121ae0".toColorInt())
val semantic_neutralA_min_2 = Color("#1a232ddb".toColorInt())
val semantic_neutralA_min_1 = Color("#1d2835cc".toColorInt())
val semantic_neutralA_0 = Color("#182639bd".toColorInt())
val semantic_neutralA_Plus_1 = Color("#1830498f".toColorInt())
val semantic_neutralA_Plus_2 = Color("#0d253f66".toColorInt())
val semantic_neutralA_Plus_3 = Color("#10315633".toColorInt())
val semantic_neutralA_Plus_4 = Color("#04294321".toColorInt())
val semantic_neutralA_Plus_5 = Color("#10284717".toColorInt())
val semantic_neutralA_Plus_6 = Color("#022e500f".toColorInt())
val semantic_neutralA_Plus_7 = Color("#00295c0a".toColorInt())
val semantic_neutralA_Plus_8 = Color("#1f529e05".toColorInt())
}



object semantic_Info {

val semantic_min__4 = Color("#041f5d".toColorInt())
val semantic_min__3 = Color("#113997".toColorInt())
val semantic_min__2 = Color("#658b6e".toColorInt())
val semantic_min__1 = Color("#ff9375".toColorInt())
val semantic_min_0 = Color("#3061d5".toColorInt())
val semantic__Plus_1 = Color("#6691f4".toColorInt())
val semantic__Plus_2 = Color("#8eb0fb".toColorInt())
val semantic__Plus_3 = Color("#234794".toColorInt())
val semantic__Plus_4 = Color("#d6e3ff".toColorInt())
val semantic__Plus_5 = Color("#e5eeff".toColorInt())
val semantic__Plus_6 = Color("#ebf0ff".toColorInt())
val semantic__Plus_7 = Color("#f5f8ff".toColorInt())
val semantic__Plus_8 = Color("#fafbff".toColorInt())
}



object semantic_Success {

val semantic_min__4 = Color("#0a2e0b".toColorInt())
val semantic_min__3 = Color("#b3b7b0".toColorInt())
val semantic_min__2 = Color("#246626".toColorInt())
val semantic_min__1 = Color("#2f6f2f".toColorInt())
val semantic_min_0 = Color("#347434".toColorInt())
val semantic__Plus_1 = Color("#55a555".toColorInt())
val semantic__Plus_2 = Color("#87c987".toColorInt())
val semantic__Plus_3 = Color("#c6ecc6".toColorInt())
val semantic__Plus_4 = Color("#cff2cf".toColorInt())
val semantic__Plus_5 = Color("#dff6df".toColorInt())
val semantic__Plus_6 = Color("#e6f9e6".toColorInt())
val semantic__Plus_7 = Color("#f4fbf4".toColorInt())
val semantic__Plus_8 = Color("#fbfefb".toColorInt())
}



object semantic_Warning {

val semantic_min__4 = Color("#492909".toColorInt())
val semantic_min__3 = Color("#3f2828".toColorInt())
val semantic_min__2 = Color("#a05c1c".toColorInt())
val semantic_min__1 = Color("#b4610e".toColorInt())
val semantic_min_0 = Color("#f59638".toColorInt())
val semantic__Plus_1 = Color("#f6a351".toColorInt())
val semantic__Plus_2 = Color("#feb871".toColorInt())
val semantic__Plus_3 = Color("#ffd4a8".toColorInt())
val semantic__Plus_4 = Color("#fcdec0".toColorInt())
val semantic__Plus_5 = Color("#ffe8d1".toColorInt())
val semantic__Plus_6 = Color("#fff0e0".toColorInt())
val semantic__Plus_7 = Color("#fff5eb".toColorInt())
val semantic__Plus_8 = Color("#fffcfa".toColorInt())
}



object semantic_Danger {

val semantic_min__4 = Color("#4a0d0d".toColorInt())
val semantic_min__3 = Color("#30723a".toColorInt())
val semantic_min__2 = Color("#63c7c3".toColorInt())
val semantic_min__1 = Color("#a13636".toColorInt())
val semantic_min_0 = Color("#279e10".toColorInt())
val semantic__Plus_1 = Color("#285aa5".toColorInt())
val semantic__Plus_2 = Color("#587b4f".toColorInt())
val semantic__Plus_3 = Color("#76d91c".toColorInt())
val semantic__Plus_4 = Color("#d15a5a".toColorInt())
val semantic__Plus_5 = Color("#fee7e7".toColorInt())
val semantic__Plus_6 = Color("#ffebeb".toColorInt())
val semantic__Plus_7 = Color("#fef5f5".toColorInt())
val semantic__Plus_8 = Color("#fffafa".toColorInt())
}



object color_CoolGray {

val cool_gray_min_4 = Color("#1b242c".toColorInt())
val cool_gray_min_3 = Color("#272e35".toColorInt())
val cool_gray_min_2 = Color("#3a424a".toColorInt())
val cool_gray_min_1 = Color("#4a545e".toColorInt())
val cool_gray_0 = Color("#555f6d".toColorInt())
val cool_gray_Plus_1 = Color("#7e8c9a".toColorInt())
val cool_gray_Plus_2 = Color("#9ea8b3".toColorInt())
val cool_gray_Plus_3 = Color("#cfd6dd".toColorInt())
val cool_gray_Plus_4 = Color("#dee3e7".toColorInt())
val cool_gray_Plus_5 = Color("#eaedf0".toColorInt())
val cool_gray_Plus_6 = Color("#f0f3f5".toColorInt())
val cool_gray_Plus_7 = Color("#f5f7f9".toColorInt())
val cool_gray_Plus_8 = Color("#fcfcfd".toColorInt())
}



object color_CoolGrayAlpha {

val cool_grayA_min_4 = Color("#09131aed".toColorInt())
val cool_grayA_min_3 = Color("#0a121ae0".toColorInt())
val cool_grayA_min_2 = Color("#1a232ddb".toColorInt())
val cool_grayA_min_1 = Color("#1d2835cc".toColorInt())
val cool_grayA_0 = Color("#182639bd".toColorInt())
val cool_grayA_Plus_1 = Color("#1830498f".toColorInt())
val cool_grayA_Plus_2 = Color("#0d253f66".toColorInt())
val cool_grayA_Plus_3 = Color("#10315633".toColorInt())
val cool_grayA_Plus_4 = Color("#04294321".toColorInt())
val cool_grayA_Plus_5 = Color("#10284717".toColorInt())
val cool_grayA_Plus_6 = Color("#022e500f".toColorInt())
val cool_grayA_Plus_7 = Color("#00295c0a".toColorInt())
val cool_grayA_Plus_8 = Color("#1f529e05".toColorInt())
}



object color_NeutralGray {

val neutral_gray_min_4 = Color("#212121".toColorInt())
val neutral_gray_min_3 = Color("#2e2e2e".toColorInt())
val neutral_gray_min_2 = Color("#404040".toColorInt())
val neutral_gray_min_1 = Color("#525252".toColorInt())
val neutral_gray_0 = Color("#5e5e5e".toColorInt())
val neutral_gray_Plus_1 = Color("#8a8a8a".toColorInt())
val neutral_gray_Plus_2 = Color("#a6a6a6".toColorInt())
val neutral_gray_Plus_3 = Color("#d6d6d6".toColorInt())
val neutral_gray_Plus_4 = Color("#e3e3e3".toColorInt())
val neutral_gray_Plus_5 = Color("#ebebeb".toColorInt())
val neutral_gray_Plus_6 = Color("#f2f2f2".toColorInt())
val neutral_gray_Plus_7 = Color("#f7f7f7".toColorInt())
val neutral_gray_Plus_8 = Color("#fcfcfc".toColorInt())
}



object color_NeutralGrayAlpha {

val neutral_grayA_min_4 = Color("#121212ed".toColorInt())
val neutral_grayA_min_3 = Color("#0f0f0fe0".toColorInt())
val neutral_grayA_min_2 = Color("#212121db".toColorInt())
val neutral_grayA_min_1 = Color("#262626cc".toColorInt())
val neutral_grayA_0 = Color("#262627bd".toColorInt())
val neutral_grayA_Plus_1 = Color("#2b2b2b8f".toColorInt())
val neutral_grayA_Plus_2 = Color("#21212166".toColorInt())
val neutral_grayA_Plus_3 = Color("#2e2e2e33".toColorInt())
val neutral_grayA_Plus_4 = Color("#1f1f1f21".toColorInt())
val neutral_grayA_Plus_5 = Color("#1c1c1c17".toColorInt())
val neutral_grayA_Plus_6 = Color("#2121210f".toColorInt())
val neutral_grayA_Plus_7 = Color("#2e2e2e0a".toColorInt())
val neutral_grayA_Plus_8 = Color("#52525205".toColorInt())
}



object color_WarmGray {

val warm_gray_min_4 = Color("#222220".toColorInt())
val warm_gray_min_3 = Color("#30302c".toColorInt())
val warm_gray_min_2 = Color("#40403a".toColorInt())
val warm_gray_min_1 = Color("#52524c".toColorInt())
val warm_gray_0 = Color("#5f5f58".toColorInt())
val warm_gray_Plus_1 = Color("#8b8b84".toColorInt())
val warm_gray_Plus_2 = Color("#a8a89f".toColorInt())
val warm_gray_Plus_3 = Color("#d9d9d3".toColorInt())
val warm_gray_Plus_4 = Color("#e5e5e1".toColorInt())
val warm_gray_Plus_5 = Color("#eaeae6".toColorInt())
val warm_gray_Plus_6 = Color("#f3f3f1".toColorInt())
val warm_gray_Plus_7 = Color("#f8f8f7".toColorInt())
val warm_gray_Plus_8 = Color("#fdfdfc".toColorInt())
}



object color_WarmGrayAlpha {

val warm_grayA_min_4 = Color("#131311ed".toColorInt())
val warm_grayA_min_3 = Color("#12120de0".toColorInt())
val warm_grayA_min_2 = Color("#22221bdb".toColorInt())
val warm_grayA_min_1 = Color("#272720cc".toColorInt())
val warm_grayA_0 = Color("#26261cbd".toColorInt())
val warm_grayA_Plus_1 = Color("#2f2f238f".toColorInt())
val warm_grayA_Plus_2 = Color("#28281166".toColorInt())
val warm_grayA_Plus_3 = Color("#3e3e1d33".toColorInt())
val warm_grayA_Plus_4 = Color("#33331421".toColorInt())
val warm_grayA_Plus_5 = Color("#22220217".toColorInt())
val warm_grayA_Plus_6 = Color("#2f2f0e0f".toColorInt())
val warm_grayA_Plus_7 = Color("#2f2f2d0a".toColorInt())
val warm_grayA_Plus_8 = Color("#52525205".toColorInt())
}



object color_WhiteAlpha {

val whiteA_min_12 = Color("#ffffff05".toColorInt())
val whiteA_min_11 = Color("#ffffff08".toColorInt())
val whiteA_min_10 = Color("#ffffff0d".toColorInt())
val whiteA_min_9 = Color("#ffffff14".toColorInt())
val whiteA_min_8 = Color("#ffffff1a".toColorInt())
val whiteA_min_7 = Color("#ffffff1f".toColorInt())
val whiteA_min_6 = Color("#ffffff3d".toColorInt())
val whiteA_min_5 = Color("#ffffff66".toColorInt())
val whiteA_min_4 = Color("#ffffffa3".toColorInt())
val whiteA_min_3 = Color("#ffffffad".toColorInt())
val whiteA_min_2 = Color("#ffffffb8".toColorInt())
val whiteA_min_1 = Color("#ffffffd1".toColorInt())
val whiteA_0 = Color("#ffffff".toColorInt())
}



object color_Red {

val _min_4 = Color("#4a0d0d".toColorInt())
val _min_3 = Color("#30723a".toColorInt())
val _min_2 = Color("#63c7c3".toColorInt())
val _min_1 = Color("#a13636".toColorInt())
val _0 = Color("#279e10".toColorInt())
val _Plus_1 = Color("#285aa5".toColorInt())
val _Plus_2 = Color("#587b4f".toColorInt())
val _Plus_3 = Color("#76d91c".toColorInt())
val _Plus_4 = Color("#d15a5a".toColorInt())
val _Plus_5 = Color("#fee7e7".toColorInt())
val _Plus_6 = Color("#ffebeb".toColorInt())
val _Plus_7 = Color("#fef5f5".toColorInt())
val _Plus_8 = Color("#fffafa".toColorInt())
}



object color_Magenta {

val _min_4 = Color("#410b2f".toColorInt())
val _min_3 = Color("#671e4d".toColorInt())
val _min_2 = Color("#f70aa8".toColorInt())
val _min_1 = Color("#953274".toColorInt())
val _0 = Color("#91ae7a".toColorInt())
val _Plus_1 = Color("#5d9ede".toColorInt())
val _Plus_2 = Color("#ec89cb".toColorInt())
val _Plus_3 = Color("#f7cae8".toColorInt())
val _Plus_4 = Color("#fbd5ee".toColorInt())
val _Plus_5 = Color("#fde2f4".toColorInt())
val _Plus_6 = Color("#fdedf8".toColorInt())
val _Plus_7 = Color("#fef6fb".toColorInt())
val _Plus_8 = Color("#fffafd".toColorInt())
}



object color_Purple {

val _min_4 = Color("#410b2f".toColorInt())
val _min_3 = Color("#5b1e67".toColorInt())
val _min_2 = Color("#792989".toColorInt())
val _min_1 = Color("#853295".toColorInt())
val _0 = Color("#9939ac".toColorInt())
val _Plus_1 = Color("#4e82ee".toColorInt())
val _Plus_2 = Color("#d98eec".toColorInt())
val _Plus_3 = Color("#f4caf7".toColorInt())
val _Plus_4 = Color("#f5d5fb".toColorInt())
val _Plus_5 = Color("#f8e2fd".toColorInt())
val _Plus_6 = Color("#faedfd".toColorInt())
val _Plus_7 = Color("#fdf5ff".toColorInt())
val _Plus_8 = Color("#fefaff".toColorInt())
}



object color_Violet {

val _min_4 = Color("#201263".toColorInt())
val _min_3 = Color("#39288a".toColorInt())
val _min_2 = Color("#161617".toColorInt())
val _min_1 = Color("#0e0406".toColorInt())
val _0 = Color("#634eca".toColorInt())
val _Plus_1 = Color("#927ef1".toColorInt())
val _Plus_2 = Color("#aba2fb".toColorInt())
val _Plus_3 = Color("#54917b".toColorInt())
val _Plus_4 = Color("#e3e0ff".toColorInt())
val _Plus_5 = Color("#eeebff".toColorInt())
val _Plus_6 = Color("#f3f0ff".toColorInt())
val _Plus_7 = Color("#f7f5ff".toColorInt())
val _Plus_8 = Color("#fbfaff".toColorInt())
}



object color_Blue {

val _min_4 = Color("#041f5d".toColorInt())
val _min_3 = Color("#113997".toColorInt())
val _min_2 = Color("#658b6e".toColorInt())
val _min_1 = Color("#ff9375".toColorInt())
val _0 = Color("#3061d5".toColorInt())
val _Plus_1 = Color("#6691f4".toColorInt())
val _Plus_2 = Color("#8eb0fb".toColorInt())
val _Plus_3 = Color("#234794".toColorInt())
val _Plus_4 = Color("#d6e3ff".toColorInt())
val _Plus_5 = Color("#e5eeff".toColorInt())
val _Plus_6 = Color("#ebf0ff".toColorInt())
val _Plus_7 = Color("#f5f8ff".toColorInt())
val _Plus_8 = Color("#fafbff".toColorInt())
}



object color_Cyan {

val _min_4 = Color("#002742".toColorInt())
val _min_3 = Color("#0c636e".toColorInt())
val _min_2 = Color("#165c8d".toColorInt())
val _min_1 = Color("#60a0cf".toColorInt())
val _0 = Color("#0870ba".toColorInt())
val _Plus_1 = Color("#5699dc".toColorInt())
val _Plus_2 = Color("#79bcf6".toColorInt())
val _Plus_3 = Color("#c2e2ff".toColorInt())
val _Plus_4 = Color("#cce7ff".toColorInt())
val _Plus_5 = Color("#e0f1ff".toColorInt())
val _Plus_6 = Color("#ebf5ff".toColorInt())
val _Plus_7 = Color("#f0f9ff".toColorInt())
val _Plus_8 = Color("#fafdff".toColorInt())
}



object color_Teal {

val _min_4 = Color("#012a37".toColorInt())
val _min_3 = Color("#7c4fc4".toColorInt())
val _min_2 = Color("#d1d2d2".toColorInt())
val _min_1 = Color("#196c85".toColorInt())
val _0 = Color("#077597".toColorInt())
val _Plus_1 = Color("#4f9eba".toColorInt())
val _Plus_2 = Color("#7ac0dc".toColorInt())
val _Plus_3 = Color("#b8e8f5".toColorInt())
val _Plus_4 = Color("#c5ecf7".toColorInt())
val _Plus_5 = Color("#e0f3fa".toColorInt())
val _Plus_6 = Color("#e8f7fc".toColorInt())
val _Plus_7 = Color("#f0fbff".toColorInt())
val _Plus_8 = Color("#fafeff".toColorInt())
}



object color_Aquamarine {

val _min_4 = Color("#012d26".toColorInt())
val _min_3 = Color("#0d4a42".toColorInt())
val _min_2 = Color("#15665b".toColorInt())
val _min_1 = Color("#1a7061".toColorInt())
val _0 = Color("#097b68".toColorInt())
val _Plus_1 = Color("#3da496".toColorInt())
val _Plus_2 = Color("#6ec9bf".toColorInt())
val _Plus_3 = Color("#bee9e4".toColorInt())
val _Plus_4 = Color("#c5f2ec".toColorInt())
val _Plus_5 = Color("#daf6f3".toColorInt())
val _Plus_6 = Color("#e2f8f5".toColorInt())
val _Plus_7 = Color("#f0faf9".toColorInt())
val _Plus_8 = Color("#fbfefe".toColorInt())
}



object color_Green {

val _min_4 = Color("#0a2e0b".toColorInt())
val _min_3 = Color("#b3b7b0".toColorInt())
val _min_2 = Color("#246626".toColorInt())
val _min_1 = Color("#2f6f2f".toColorInt())
val _0 = Color("#347434".toColorInt())
val _Plus_1 = Color("#55a555".toColorInt())
val _Plus_2 = Color("#87c987".toColorInt())
val _Plus_3 = Color("#c6ecc6".toColorInt())
val _Plus_4 = Color("#cff2cf".toColorInt())
val _Plus_5 = Color("#dff6df".toColorInt())
val _Plus_6 = Color("#e6f9e6".toColorInt())
val _Plus_7 = Color("#f4fbf4".toColorInt())
val _Plus_8 = Color("#fbfefb".toColorInt())
}



object color_Orange {

val _min_4 = Color("#492909".toColorInt())
val _min_3 = Color("#3f2828".toColorInt())
val _min_2 = Color("#a05c1c".toColorInt())
val _min_1 = Color("#b4610e".toColorInt())
val _0 = Color("#f59638".toColorInt())
val _Plus_1 = Color("#f6a351".toColorInt())
val _Plus_2 = Color("#feb871".toColorInt())
val _Plus_3 = Color("#ffd4a8".toColorInt())
val _Plus_4 = Color("#fcdec0".toColorInt())
val _Plus_5 = Color("#ffe8d1".toColorInt())
val _Plus_6 = Color("#fff0e0".toColorInt())
val _Plus_7 = Color("#fff5eb".toColorInt())
val _Plus_8 = Color("#fffcfa".toColorInt())
}



object color_Transparent {

val _0 = Color("#ffffff00".toColorInt())
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



object BTokens_TokenSetOrder {

val 0 = OtherData("g","l","o","b","a","l",)
val 1 = OtherData("a","l","i","a","s",)
val 2 = OtherData("c","o","m","p","o","n","e","n","t","/","l","i","g","h","t",)
val 3 = OtherData("c","o","m","p","o","n","e","n","t","/","d","a","r","k",)
}



object BTokens_Default {

val selectedTokenSets = Default_SelectedTokenSets
val $figmaStyleReferences = Default_$figmaStyleReferences
val $figmaVariableReferences = Default_$figmaVariableReferences
}



object Default_SelectedTokenSets {

}



object Default_$figmaStyleReferences {

}



object Default_$figmaVariableReferences {

}



object BTokens_Default Theme {

val selectedTokenSets = Default Theme_SelectedTokenSets
val $figmaStyleReferences = Default Theme_$figmaStyleReferences
val $figmaVariableReferences = Default Theme_$figmaVariableReferences
}



object Default Theme_SelectedTokenSets {

}



object Default Theme_$figmaStyleReferences {

}



object Default Theme_$figmaVariableReferences {

}



object BTokens_Light {

val selectedTokenSets = Light_SelectedTokenSets
val $figmaStyleReferences = Light_$figmaStyleReferences
val $figmaVariableReferences = Light_$figmaVariableReferences
}



object Light_SelectedTokenSets {

}



object Light_$figmaStyleReferences {

}



object Light_$figmaVariableReferences {

}



object BTokens_Dark {

val selectedTokenSets = Dark_SelectedTokenSets
val $figmaStyleReferences = Dark_$figmaStyleReferences
val $figmaVariableReferences = Dark_$figmaVariableReferences
}



object Dark_SelectedTokenSets {

}



object Dark_$figmaStyleReferences {

}



object Dark_$figmaVariableReferences {

}



 data class TypographyData(val fontFamily:String,val fontWeight:Any,val lineHeight:Any,val fontSize:Any,val letterSpacing:Any,)



 data class OtherData(val 0:String,val 1:String,val 2:String,val 3:String,val 4:String,val 5:String,)

