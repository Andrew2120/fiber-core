import androidx.compose.ui.unit.*
import androidx.compose.ui.graphics.Color
import android.graphics.Color.parseColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity

object DesignSystem {
    val color = ColorValuesContainer1
    val borderWidth = BorderWidthValuesContainer1
    val borderRadius = BorderRadiusValuesContainer1
    val size = SizeValuesContainer1
    val space = SpaceValuesContainer1
    val opacity = OpacityValuesContainer1
    val typography = TypographyValuesContainer1
    val dimension = DimensionValuesContainer1
    val elevation = ElevationValuesContainer1
    val fontFamily = FontFamilyValuesContainer1
    val fontSize = FontSizeValuesContainer1
    val fontWeight = FontWeightValuesContainer1
    val letterSpacing = LetterSpacingValuesContainer1
    val lineHeight = LineHeightValuesContainer1
}

object ContentValuesContainer {
    val primary = Color(parseColor("#272e35"))
    val secondary = Color(parseColor("#555f6d"))
    val tertiary = Color(parseColor("#7e8c9a"))
    val disabled = Color(parseColor("#9ea8b3"))
    val primaryInverse = Color(parseColor("#ffffff"))
    val secondaryInverse = Color(parseColor("#ffffffa3"))
    val tertiaryInverse = Color(parseColor("#ffffff66"))
    val disabledInverse = Color(parseColor("#ffffff3d"))
    val infoPrimary = Color(parseColor("#113997"))
    val infoSecondary = Color(parseColor("#3061d5"))
    val successPrimary = Color(parseColor("#b3b7b0"))
    val successSecondary = Color(parseColor("#20b027"))
    val warningPrimary = Color(parseColor("#3f2828"))
    val warningSecondary = Color(parseColor("#f59638"))
    val dangerPrimary = Color(parseColor("#30723a"))
    val dangerSecondary = Color(parseColor("#9e6610"))
    val brandPrimary = Color(parseColor("#113997"))
    val brandSecondary = Color(parseColor("#3061d5"))
}

object BorderValuesContainer {
    val `default` = Color(parseColor("#eaedf0"))
    val defaultA = Color(parseColor("#10284717"))
    val inverse = Color(parseColor("#ffffff"))
    val neutralStrong = Color(parseColor("#555f6d"))
    val neutralSubtle = Color(parseColor("#cfd6dd"))
    val infoStrong = Color(parseColor("#3061d5"))
    val infoSubtle = Color(parseColor("#0085ff"))
    val successStrong = Color(parseColor("#20b027"))
    val successSubtle = Color(parseColor("#00ff10"))
    val warningStrong = Color(parseColor("#f59638"))
    val warningSubtle = Color(parseColor("#ffd4a8"))
    val dangerStrong = Color(parseColor("#9e6610"))
    val dangerSubtle = Color(parseColor("#76d91c"))
}

object BackgroundValuesContainer {
    val `default` = Color(parseColor("#ffffff"))
    val inverse = Color(parseColor("#272e35"))
    val neutralStrong = Color(parseColor("#555f6d"))
    val neutralMuted = Color(parseColor("#dee3e7"))
    val neutralOnSubtle = Color(parseColor("#eaedf0"))
    val neutralSubtle = Color(parseColor("#f5f7f9"))
    val neutralSurface = Color(parseColor("#fcfcfd"))
    val infoStrong = Color(parseColor("#3061d5"))
    val infoMuted = Color(parseColor("#d6e3ff"))
    val infoOnSubtle = Color(parseColor("#e5eeff"))
    val infoSubtle = Color(parseColor("#f5f8ff"))
    val infoSurface = Color(parseColor("#fafbff"))
    val successStrong = Color(parseColor("#20b027"))
    val successMuted = Color(parseColor("#cff2cf"))
    val successOnSubtle = Color(parseColor("#dff6df"))
    val successSubtle = Color(parseColor("#f4fbf4"))
    val successSurface = Color(parseColor("#fbfefb"))
    val warningStrong = Color(parseColor("#f59638"))
    val warningMuted = Color(parseColor("#fcdec0"))
    val warningOnSubtle = Color(parseColor("#ffe8d1"))
    val warningSubtle = Color(parseColor("#fff5eb"))
    val warningSurface = Color(parseColor("#fffcfa"))
    val dangerStrong = Color(parseColor("#9e6610"))
    val dangerMuted = Color(parseColor("#d15a5a"))
    val dangerOnSubtle = Color(parseColor("#fee7e7"))
    val dangerSubtle = Color(parseColor("#fef5f5"))
    val dangerSurface = Color(parseColor("#fffafa"))
    val brandStrong = Color(parseColor("#3061d5"))
    val brandMuted = Color(parseColor("#d6e3ff"))
    val brandOnSubtle = Color(parseColor("#e5eeff"))
    val brandSurface = Color(parseColor("#fafbff"))
    val brandSubtle = Color(parseColor("#f5f8ff"))
}

object PrimaryValuesContainer {
    val actionPrimaryNormal = Color(parseColor("#3061d5"))
    val actionPrimaryHover = Color(parseColor("#658b6e"))
    val actionPrimaryActive = Color(parseColor("#113997"))
    val actionPrimarySelected = Color(parseColor("#658b6e"))
    val actionPrimarySubtleNormal = Color(parseColor("#ebf0ff"))
    val actionPrimarySubtleHover = Color(parseColor("#e5eeff"))
    val actionPrimarySubtleActive = Color(parseColor("#0085ff"))
    val actionPrimarySubtleSelected = Color(parseColor("#e5eeff"))
}

object NeutralValuesContainer {
    val actionNeutralNormal = Color(parseColor("#4a545e"))
    val actionNeutralHover = Color(parseColor("#3a424a"))
    val actionNeutralActive = Color(parseColor("#272e35"))
    val actionNeutralSelected = Color(parseColor("#3a424a"))
    val actionNeutralSubtleNormal = Color(parseColor("#f0f3f5"))
    val actionNeutralSubtleHover = Color(parseColor("#eaedf0"))
    val actionNeutralSubtleActive = Color(parseColor("#cfd6dd"))
    val actionNeutralSubtleSelected = Color(parseColor("#eaedf0"))
}

object SuccessValuesContainer {
    val actionSuccessNormal = Color(parseColor("#20b027"))
    val actionSuccessHover = Color(parseColor("#246626"))
    val actionSuccessActive = Color(parseColor("#b3b7b0"))
    val actionSuccessSelected = Color(parseColor("#246626"))
    val actionSuccessSubtleNormal = Color(parseColor("#e6f9e6"))
    val actionSuccessSubtleHover = Color(parseColor("#dff6df"))
    val actionSuccessSubtleActive = Color(parseColor("#00ff10"))
    val actionSuccessSubtleSelected = Color(parseColor("#dff6df"))
}

object DangerValuesContainer {
    val actionDangerNormal = Color(parseColor("#9e6610"))
    val actionDangerHover = Color(parseColor("#63c7c3"))
    val actionDangerActive = Color(parseColor("#30723a"))
    val actionDangerSelected = Color(parseColor("#63c7c3"))
    val actionDangerSubtleNormal = Color(parseColor("#ffebeb"))
    val actionDangerSubtleHover = Color(parseColor("#fee7e7"))
    val actionDangerSubtleActive = Color(parseColor("#76d91c"))
    val actionDangerSubtleSelected = Color(parseColor("#fee7e7"))
}

object GhostValuesContainer {
    val actionGhostNormal = Color(parseColor("#ffffff00"))
    val actionGhostHover = Color(parseColor("#022e500f"))
    val actionGhostActive = Color(parseColor("#10284717"))
    val actionGhostSelected = Color(parseColor("#022e500f"))
    val actionGhostInverseHover = Color(parseColor("#ffffff1a"))
    val actionGhostInverseActive = Color(parseColor("#ffffff1f"))
    val actionGhostInverseSelected = Color(parseColor("#ffffff1a"))
    val actionGhostDangerHover = Color(parseColor("#ffebeb"))
    val actionGhostDangerActive = Color(parseColor("#fee7e7"))
    val actionGhostDangerSelected = Color(parseColor("#ffebeb"))
}

object OutlineValuesContainer {
    val actionOutlineNormal = Color(parseColor("#cfd6dd"))
    val actionOutlineHover = Color(parseColor("#9ea8b3"))
    val actionOutlineActive = Color(parseColor("#7e8c9a"))
    val actionOutlineSelected = Color(parseColor("#9ea8b3"))
}

object InverseValuesContainer {
    val actionInverseNormal = Color(parseColor("#ffffff"))
    val actionInverseHover = Color(parseColor("#ffffffd1"))
    val actionInverseActive = Color(parseColor("#ffffffb8"))
    val actionInverseSelected = Color(parseColor("#ffffffd1"))
}

object ReverseInverseValuesContainer {
    val actionReverseInverseNormal = Color(parseColor("#0a121ae0"))
    val actionReverseInverseHover = Color(parseColor("#1d2835cc"))
    val actionReverseInverseActive = Color(parseColor("#182639bd"))
    val actionReverseInverseSelected = Color(parseColor("#1d2835cc"))
}

object ActionValuesContainer {
    val primary = PrimaryValuesContainer
    val neutral = NeutralValuesContainer
    val success = SuccessValuesContainer
    val danger = DangerValuesContainer
    val ghost = GhostValuesContainer
    val outline = OutlineValuesContainer
    val inverse = InverseValuesContainer
    val reverseInverse = ReverseInverseValuesContainer
}

object DefaultValuesContainer {
    val interactionDefaultNormal = Color(parseColor("#3061d5"))
    val interactionDefaultHover = Color(parseColor("#658b6e"))
    val interactionDefaultActive = Color(parseColor("#113997"))
    val interactionDefaultSelected = Color(parseColor("#658b6e"))
    val interactionDefaultSubtleNormal = Color(parseColor("#ebf0ff"))
    val interactionDefaultSubtleHover = Color(parseColor("#e5eeff"))
    val interactionDefaultSubtleActive = Color(parseColor("#0085ff"))
    val interactionDefaultSubtleSelected = Color(parseColor("#e5eeff"))
}

object NeutralValuesContainer1 {
    val interactionNeutralNormal = Color(parseColor("#4a545e"))
    val interactionNeutralHover = Color(parseColor("#3a424a"))
    val interactionNeutralActive = Color(parseColor("#272e35"))
    val interactionNeutralSelected = Color(parseColor("#3a424a"))
    val interactionNeutralSubtleNormal = Color(parseColor("#f0f3f5"))
    val interactionNeutralSubtleHover = Color(parseColor("#eaedf0"))
    val interactionNeutralSubtleActive = Color(parseColor("#cfd6dd"))
    val interactionNeutralSubtleSelected = Color(parseColor("#eaedf0"))
}

object DangerValuesContainer1 {
    val interactionDangerNormal = Color(parseColor("#9e6610"))
    val interactionDangerHover = Color(parseColor("#63c7c3"))
    val interactionDangerActive = Color(parseColor("#30723a"))
    val interactionDangerSelected = Color(parseColor("#63c7c3"))
    val interactionDangerSubtleNormal = Color(parseColor("#ffebeb"))
    val interactionDangerSubtleHover = Color(parseColor("#fee7e7"))
    val interactionDangerSubtleActive = Color(parseColor("#76d91c"))
    val interactionDangerSubtleSelected = Color(parseColor("#fee7e7"))
}

object GhostValuesContainer1 {
    val interactionGhostNormal = Color(parseColor("#ffffff00"))
    val interactionGhostHover = Color(parseColor("#022e500f"))
    val interactionGhostActive = Color(parseColor("#10284717"))
    val interactionGhostSelected = Color(parseColor("#022e500f"))
    val interactionGhostInverseHover = Color(parseColor("#ffffff1a"))
    val interactionGhostInverseNormal = Color(parseColor("#ffffff1f"))
    val interactionGhostInverseSelected = Color(parseColor("#ffffff1a"))
    val interactionGhostDangerHover = Color(parseColor("#ffebeb"))
    val interactionGhostDangerNormal = Color(parseColor("#fee7e7"))
    val interactionGhostDangerSelected = Color(parseColor("#ffebeb"))
}

object DisabledValuesContainer {
    val interactionDisabledNormal = Color(parseColor("#9ea8b3"))
    val interactionDisabledHover = Color(parseColor("#7e8c9a"))
    val interactionDisabledActive = Color(parseColor("#555f6d"))
    val interactionDisabledSubtleNormal = Color(parseColor("#eaedf0"))
    val interactionDisabledSubtleHover = Color(parseColor("#dee3e7"))
    val interactionDisabledSubtleActive = Color(parseColor("#cfd6dd"))
}

object BorderValuesContainer1 {
    val interactionBorderNormal = Color(parseColor("#8eb0fb"))
    val interactionBorderHover = Color(parseColor("#6691f4"))
    val interactionBorderActive = Color(parseColor("#ff9375"))
    val interactionBorderSelected = Color(parseColor("#3061d5"))
    val interactionBorderNeutralNormal = Color(parseColor("#cfd6dd"))
    val interactionBorderNeutralHover = Color(parseColor("#9ea8b3"))
    val interactionBorderNeutralActive = Color(parseColor("#7e8c9a"))
    val interactionBorderNeutralSelected = Color(parseColor("#9ea8b3"))
    val interactionBorderDanger = Color(parseColor("#285aa5"))
}

object BackgroundValuesContainer1 {
    val interactionBackgroundModal = Color(parseColor("#ffffff"))
    val interactionBackgroundModeless = Color(parseColor("#ffffff"))
    val interactionBackgroundModelessInverse = Color(parseColor("#272e35"))
    val interactionBackgroundSidepanel = Color(parseColor("#ffffff"))
    val interactionBackgroundFormField = Color(parseColor("#ffffff"))
    val interactionBackgroundDimmer = Color(parseColor("#182639bd"))
}

object InverseValuesContainer1 {
    val interactionInverseNormal = Color(parseColor("#ffffff"))
    val interactionInverseHover = Color(parseColor("#ffffffd1"))
    val interactionInverseActive = Color(parseColor("#ffffffb8"))
    val interactionInverseSelected = Color(parseColor("#ffffffd1"))
}

object FocusValuesContainer {
    val interactionFocusDefault = Color(parseColor("#6691f4"))
}

object InteractionValuesContainer {
    val `default` = DefaultValuesContainer
    val neutral = NeutralValuesContainer1
    val danger = DangerValuesContainer1
    val ghost = GhostValuesContainer1
    val disabled = DisabledValuesContainer
    val border = BorderValuesContainer1
    val background = BackgroundValuesContainer1
    val inverse = InverseValuesContainer1
    val focus = FocusValuesContainer
}

object GrayValuesContainer {
    val nonSemanticGrayContentPrimary = Color(parseColor("#272e35"))
    val nonSemanticGrayContentSecondary = Color(parseColor("#555f6d"))
    val nonSemanticGrayBorderDefault = Color(parseColor("#eaedf0"))
    val nonSemanticGrayBorderStrong = Color(parseColor("#555f6d"))
    val nonSemanticGrayBorderSubtle = Color(parseColor("#cfd6dd"))
    val nonSemanticGrayBackgroundStrong = Color(parseColor("#555f6d"))
    val nonSemanticGrayBackgroundMuted = Color(parseColor("#dee3e7"))
    val nonSemanticGrayBackgroundOnSubtle = Color(parseColor("#eaedf0"))
    val nonSemanticGrayBackgroundSubtle = Color(parseColor("#f5f7f9"))
    val nonSemanticGrayBackgroundSurface = Color(parseColor("#fcfcfd"))
}

object WhiteValuesContainer {
    val nonSemanticWhiteContentPrimary = Color(parseColor("#ffffff"))
    val nonSemanticWhiteContentSecondary = Color(parseColor("#ffffffa3"))
    val nonSemanticWhiteBorderDefault = Color(parseColor("#ffffff66"))
    val nonSemanticWhiteBorderStrong = Color(parseColor("#ffffff"))
    val nonSemanticWhiteBorderSubtle = Color(parseColor("#ffffffad"))
    val nonSemanticWhiteBackgroundStrong = Color(parseColor("#ffffff"))
    val nonSemanticWhiteBackgroundMuted = Color(parseColor("#ffffffa3"))
    val nonSemanticWhiteBackgroundOnSubtle = Color(parseColor("#ffffff66"))
    val nonSemanticWhiteBackgroundSubtle = Color(parseColor("#ffffff1f"))
    val nonSemanticWhiteBackgroundSurface = Color(parseColor("#ffffff1a"))
}

object RedValuesContainer {
    val nonSemanticRedContentPrimary = Color(parseColor("#30723a"))
    val nonSemanticRedContentSecondary = Color(parseColor("#9e6610"))
    val nonSemanticRedBorderDefault = Color(parseColor("#fee7e7"))
    val nonSemanticRedBorderStrong = Color(parseColor("#9e6610"))
    val nonSemanticRedBorderSubtle = Color(parseColor("#76d91c"))
    val nonSemanticRedBackgroundStrong = Color(parseColor("#9e6610"))
    val nonSemanticRedBackgroundMuted = Color(parseColor("#d15a5a"))
    val nonSemanticRedBackgroundOnSubtle = Color(parseColor("#fee7e7"))
    val nonSemanticRedBackgroundSubtle = Color(parseColor("#fef5f5"))
    val nonSemanticRedBackgroundSurface = Color(parseColor("#fffafa"))
}

object MagentaValuesContainer {
    val nonSemanticMagentaContentPrimary = Color(parseColor("#671e4d"))
    val nonSemanticMagentaContentSecondary = Color(parseColor("#91ae7a"))
    val nonSemanticMagentaBorderDefault = Color(parseColor("#fde2f4"))
    val nonSemanticMagentaBorderStrong = Color(parseColor("#91ae7a"))
    val nonSemanticMagentaBorderSubtle = Color(parseColor("#f7cae8"))
    val nonSemanticMagentaBackgroundStrong = Color(parseColor("#91ae7a"))
    val nonSemanticMagentaBackgroundMuted = Color(parseColor("#fbd5ee"))
    val nonSemanticMagentaBackgroundOnSubtle = Color(parseColor("#fde2f4"))
    val nonSemanticMagentaBackgroundSubtle = Color(parseColor("#fef6fb"))
    val nonSemanticMagentaBackgroundSurface = Color(parseColor("#fffafd"))
}

object PurpleValuesContainer {
    val nonSemanticPurpleContentPrimary = Color(parseColor("#5b1e67"))
    val nonSemanticPurpleContentSecondary = Color(parseColor("#9939ac"))
    val nonSemanticPurpleBorderDefault = Color(parseColor("#f8e2fd"))
    val nonSemanticPurpleBorderStrong = Color(parseColor("#9939ac"))
    val nonSemanticPurpleBorderSubtle = Color(parseColor("#c04c0d"))
    val nonSemanticPurpleBackgroundStrong = Color(parseColor("#9939ac"))
    val nonSemanticPurpleBackgroundMuted = Color(parseColor("#f5d5fb"))
    val nonSemanticPurpleBackgroundOnSubtle = Color(parseColor("#f8e2fd"))
    val nonSemanticPurpleBackgroundSubtle = Color(parseColor("#fdf5ff"))
    val nonSemanticPurpleBackgroundSurface = Color(parseColor("#fefaff"))
}

object VioletValuesContainer {
    val nonSemanticVioletContentPrimary = Color(parseColor("#39288a"))
    val nonSemanticVioletContentSecondary = Color(parseColor("#634eca"))
    val nonSemanticVioletBorderDefault = Color(parseColor("#eeebff"))
    val nonSemanticVioletBorderStrong = Color(parseColor("#634eca"))
    val nonSemanticVioletBorderSubtle = Color(parseColor("#54917b"))
    val nonSemanticVioletBackgroundStrong = Color(parseColor("#634eca"))
    val nonSemanticVioletBackgroundMuted = Color(parseColor("#e3e0ff"))
    val nonSemanticVioletBackgroundOnSubtle = Color(parseColor("#eeebff"))
    val nonSemanticVioletBackgroundSubtle = Color(parseColor("#f7f5ff"))
    val nonSemanticVioletBackgroundSurface = Color(parseColor("#fbfaff"))
}

object BlueValuesContainer {
    val nonSemanticBlueContentPrimary = Color(parseColor("#113997"))
    val nonSemanticBlueContentSecondary = Color(parseColor("#3061d5"))
    val nonSemanticBlueBorderDefault = Color(parseColor("#e5eeff"))
    val nonSemanticBlueBorderStrong = Color(parseColor("#3061d5"))
    val nonSemanticBlueBorderSubtle = Color(parseColor("#0085ff"))
    val nonSemanticBlueBackgroundStrong = Color(parseColor("#3061d5"))
    val nonSemanticBlueBackgroundMuted = Color(parseColor("#d6e3ff"))
    val nonSemanticBlueBackgroundOnSubtle = Color(parseColor("#e5eeff"))
    val nonSemanticBlueBackgroundSubtle = Color(parseColor("#f5f8ff"))
    val nonSemanticBlueBackgroundSurface = Color(parseColor("#fafbff"))
}

object CyanValuesContainer {
    val nonSemanticCyanContentPrimary = Color(parseColor("#0c636e"))
    val nonSemanticCyanContentSecondary = Color(parseColor("#0870ba"))
    val nonSemanticCyanBorderDefault = Color(parseColor("#e0f1ff"))
    val nonSemanticCyanBorderStrong = Color(parseColor("#0870ba"))
    val nonSemanticCyanBorderSubtle = Color(parseColor("#c2e2ff"))
    val nonSemanticCyanBackgroundStrong = Color(parseColor("#0870ba"))
    val nonSemanticCyanBackgroundMuted = Color(parseColor("#cce7ff"))
    val nonSemanticCyanBackgroundOnSubtle = Color(parseColor("#e0f1ff"))
    val nonSemanticCyanBackgroundSubtle = Color(parseColor("#f0f9ff"))
    val nonSemanticCyanBackgroundSurface = Color(parseColor("#fafdff"))
}

object TealValuesContainer {
    val nonSemanticTealContentPrimary = Color(parseColor("#7c4fc4"))
    val nonSemanticTealContentSecondary = Color(parseColor("#077597"))
    val nonSemanticTealBorderDefault = Color(parseColor("#e0f3fa"))
    val nonSemanticTealBorderStrong = Color(parseColor("#077597"))
    val nonSemanticTealBorderSubtle = Color(parseColor("#b8e8f5"))
    val nonSemanticTealBackgroundStrong = Color(parseColor("#077597"))
    val nonSemanticTealBackgroundMuted = Color(parseColor("#c5ecf7"))
    val nonSemanticTealBackgroundOnSubtle = Color(parseColor("#e0f3fa"))
    val nonSemanticTealBackgroundSubtle = Color(parseColor("#f0fbff"))
    val nonSemanticTealBackgroundSurface = Color(parseColor("#fafeff"))
}

object AquamarineValuesContainer {
    val nonSemanticAquamarineContentPrimary = Color(parseColor("#0d4a42"))
    val nonSemanticAquamarineContentSecondary = Color(parseColor("#097b68"))
    val nonSemanticAquamarineBorderDefault = Color(parseColor("#daf6f3"))
    val nonSemanticAquamarineBorderStrong = Color(parseColor("#097b68"))
    val nonSemanticAquamarineBorderSubtle = Color(parseColor("#bee9e4"))
    val nonSemanticAquamarineBackgroundStrong = Color(parseColor("#097b68"))
    val nonSemanticAquamarineBackgroundMuted = Color(parseColor("#c5f2ec"))
    val nonSemanticAquamarineBackgroundOnSubtle = Color(parseColor("#daf6f3"))
    val nonSemanticAquamarineBackgroundSubtle = Color(parseColor("#f0faf9"))
    val nonSemanticAquamarineBackgroundSurface = Color(parseColor("#fbfefe"))
}

object GreenValuesContainer {
    val nonSemanticGreenContentPrimary = Color(parseColor("#b3b7b0"))
    val nonSemanticGreenContentSecondary = Color(parseColor("#20b027"))
    val nonSemanticGreenBorderDefault = Color(parseColor("#dff6df"))
    val nonSemanticGreenBorderStrong = Color(parseColor("#20b027"))
    val nonSemanticGreenBorderSubtle = Color(parseColor("#00ff10"))
    val nonSemanticGreenBackgroundStrong = Color(parseColor("#20b027"))
    val nonSemanticGreenBackgroundMuted = Color(parseColor("#cff2cf"))
    val nonSemanticGreenBackgroundOnSubtle = Color(parseColor("#dff6df"))
    val nonSemanticGreenBackgroundSubtle = Color(parseColor("#f4fbf4"))
    val nonSemanticGreenBackgroundSurface = Color(parseColor("#fbfefb"))
}

object OrangeValuesContainer {
    val nonSemanticOrangeContentPrimary = Color(parseColor("#3f2828"))
    val nonSemanticOrangeContentSecondary = Color(parseColor("#f59638"))
    val nonSemanticOrangeBorderDefault = Color(parseColor("#ffe8d1"))
    val nonSemanticOrangeBorderStrong = Color(parseColor("#f59638"))
    val nonSemanticOrangeBorderSubtle = Color(parseColor("#ffd4a8"))
    val nonSemanticOrangeBackgroundStrong = Color(parseColor("#f59638"))
    val nonSemanticOrangeBackgroundMuted = Color(parseColor("#fcdec0"))
    val nonSemanticOrangeBackgroundOnSubtle = Color(parseColor("#ffe8d1"))
    val nonSemanticOrangeBackgroundSubtle = Color(parseColor("#fff5eb"))
    val nonSemanticOrangeBackgroundSurface = Color(parseColor("#fffcfa"))
}

object NonSemanticValuesContainer {
    val gray = GrayValuesContainer
    val white = WhiteValuesContainer
    val red = RedValuesContainer
    val magenta = MagentaValuesContainer
    val purple = PurpleValuesContainer
    val violet = VioletValuesContainer
    val blue = BlueValuesContainer
    val cyan = CyanValuesContainer
    val teal = TealValuesContainer
    val aquamarine = AquamarineValuesContainer
    val green = GreenValuesContainer
    val orange = OrangeValuesContainer
}

object BrandValuesContainer {
    val semanticBrandNegative4 = Color(parseColor("#9e6610"))
    val semanticBrandNegative3 = Color(parseColor("#113997"))
    val semanticBrandNegative2 = Color(parseColor("#658b6e"))
    val semanticBrandNegative1 = Color(parseColor("#ff9375"))
    val semanticBrand0 = Color(parseColor("#3061d5"))
    val semanticBrand1 = Color(parseColor("#6691f4"))
    val semanticBrand2 = Color(parseColor("#8eb0fb"))
    val semanticBrand3 = Color(parseColor("#0085ff"))
    val semanticBrand4 = Color(parseColor("#d6e3ff"))
    val semanticBrand5 = Color(parseColor("#e5eeff"))
    val semanticBrand6 = Color(parseColor("#ebf0ff"))
    val semanticBrand7 = Color(parseColor("#f5f8ff"))
    val semanticBrand8 = Color(parseColor("#fafbff"))
}

object NeutralValuesContainer2 {
    val semanticNeutralNegative4 = Color(parseColor("#1b242c"))
    val semanticNeutralNegative3 = Color(parseColor("#272e35"))
    val semanticNeutralNegative2 = Color(parseColor("#3a424a"))
    val semanticNeutralNegative1 = Color(parseColor("#4a545e"))
    val semanticNeutral0 = Color(parseColor("#555f6d"))
    val semanticNeutral1 = Color(parseColor("#7e8c9a"))
    val semanticNeutral2 = Color(parseColor("#9ea8b3"))
    val semanticNeutral3 = Color(parseColor("#cfd6dd"))
    val semanticNeutral4 = Color(parseColor("#dee3e7"))
    val semanticNeutral5 = Color(parseColor("#eaedf0"))
    val semanticNeutral6 = Color(parseColor("#f0f3f5"))
    val semanticNeutral7 = Color(parseColor("#f5f7f9"))
    val semanticNeutral8 = Color(parseColor("#fcfcfd"))
}

object NeutralAlphaValuesContainer {
    val semanticNeutralANegative4 = Color(parseColor("#09131aed"))
    val semanticNeutralANegative3 = Color(parseColor("#0a121ae0"))
    val semanticNeutralANegative2 = Color(parseColor("#1a232ddb"))
    val semanticNeutralANegative1 = Color(parseColor("#1d2835cc"))
    val semanticNeutralA0 = Color(parseColor("#182639bd"))
    val semanticNeutralA1 = Color(parseColor("#1830498f"))
    val semanticNeutralA2 = Color(parseColor("#0d253f66"))
    val semanticNeutralA3 = Color(parseColor("#10315633"))
    val semanticNeutralA4 = Color(parseColor("#04294321"))
    val semanticNeutralA5 = Color(parseColor("#10284717"))
    val semanticNeutralA6 = Color(parseColor("#022e500f"))
    val semanticNeutralA7 = Color(parseColor("#00295c0a"))
    val semanticNeutralA8 = Color(parseColor("#1f529e05"))
}

object InfoValuesContainer {
    val semanticInfoNegative4 = Color(parseColor("#041f5d"))
    val semanticInfoNegative3 = Color(parseColor("#113997"))
    val semanticInfoNegative2 = Color(parseColor("#658b6e"))
    val semanticInfoNegative1 = Color(parseColor("#ff9375"))
    val semanticInfo0 = Color(parseColor("#3061d5"))
    val semanticInfo1 = Color(parseColor("#6691f4"))
    val semanticInfo2 = Color(parseColor("#8eb0fb"))
    val semanticInfo3 = Color(parseColor("#0085ff"))
    val semanticInfo4 = Color(parseColor("#d6e3ff"))
    val semanticInfo5 = Color(parseColor("#e5eeff"))
    val semanticInfo6 = Color(parseColor("#ebf0ff"))
    val semanticInfo7 = Color(parseColor("#f5f8ff"))
    val semanticInfo8 = Color(parseColor("#fafbff"))
}

object SuccessValuesContainer1 {
    val semanticSuccessNegative4 = Color(parseColor("#0a2e0b"))
    val semanticSuccessNegative3 = Color(parseColor("#b3b7b0"))
    val semanticSuccessNegative2 = Color(parseColor("#246626"))
    val semanticSuccessNegative1 = Color(parseColor("#2f6f2f"))
    val semanticSuccess0 = Color(parseColor("#20b027"))
    val semanticSuccess1 = Color(parseColor("#55a555"))
    val semanticSuccess2 = Color(parseColor("#fdff84"))
    val semanticSuccess3 = Color(parseColor("#00ff10"))
    val semanticSuccess4 = Color(parseColor("#cff2cf"))
    val semanticSuccess5 = Color(parseColor("#dff6df"))
    val semanticSuccess6 = Color(parseColor("#e6f9e6"))
    val semanticSuccess7 = Color(parseColor("#f4fbf4"))
    val semanticSuccess8 = Color(parseColor("#fbfefb"))
}

object WarningValuesContainer {
    val semanticWarningNegative4 = Color(parseColor("#492909"))
    val semanticWarningNegative3 = Color(parseColor("#3f2828"))
    val semanticWarningNegative2 = Color(parseColor("#a05c1c"))
    val semanticWarningNegative1 = Color(parseColor("#b4610e"))
    val semanticWarning0 = Color(parseColor("#f59638"))
    val semanticWarning1 = Color(parseColor("#f6a351"))
    val semanticWarning2 = Color(parseColor("#feb871"))
    val semanticWarning3 = Color(parseColor("#ffd4a8"))
    val semanticWarning4 = Color(parseColor("#fcdec0"))
    val semanticWarning5 = Color(parseColor("#ffe8d1"))
    val semanticWarning6 = Color(parseColor("#fff0e0"))
    val semanticWarning7 = Color(parseColor("#fff5eb"))
    val semanticWarning8 = Color(parseColor("#fffcfa"))
}

object DangerValuesContainer2 {
    val semanticDangerNegative4 = Color(parseColor("#4a0d0d"))
    val semanticDangerNegative3 = Color(parseColor("#30723a"))
    val semanticDangerNegative2 = Color(parseColor("#63c7c3"))
    val semanticDangerNegative1 = Color(parseColor("#a13636"))
    val semanticDanger0 = Color(parseColor("#9e6610"))
    val semanticDanger1 = Color(parseColor("#285aa5"))
    val semanticDanger2 = Color(parseColor("#494b75"))
    val semanticDanger3 = Color(parseColor("#76d91c"))
    val semanticDanger4 = Color(parseColor("#d15a5a"))
    val semanticDanger5 = Color(parseColor("#fee7e7"))
    val semanticDanger6 = Color(parseColor("#ffebeb"))
    val semanticDanger7 = Color(parseColor("#fef5f5"))
    val semanticDanger8 = Color(parseColor("#fffafa"))
}

object SemanticValuesContainer {
    val brand = BrandValuesContainer
    val neutral = NeutralValuesContainer2
    val neutralAlpha = NeutralAlphaValuesContainer
    val info = InfoValuesContainer
    val success = SuccessValuesContainer1
    val warning = WarningValuesContainer
    val danger = DangerValuesContainer2
}

object CoolGrayValuesContainer {
    val negative4 = Color(parseColor("#1b242c"))
    val negative3 = Color(parseColor("#272e35"))
    val negative2 = Color(parseColor("#3a424a"))
    val negative1 = Color(parseColor("#4a545e"))
    val coolGray0 = Color(parseColor("#555f6d"))
    val coolGray1 = Color(parseColor("#7e8c9a"))
    val coolGray2 = Color(parseColor("#9ea8b3"))
    val coolGray3 = Color(parseColor("#cfd6dd"))
    val coolGray4 = Color(parseColor("#dee3e7"))
    val coolGray5 = Color(parseColor("#eaedf0"))
    val coolGray6 = Color(parseColor("#f0f3f5"))
    val coolGray7 = Color(parseColor("#f5f7f9"))
    val coolGray8 = Color(parseColor("#fcfcfd"))
}

object CoolGrayAlphaValuesContainer {
    val coolGrayANegative4 = Color(parseColor("#09131aed"))
    val coolGrayANegative3 = Color(parseColor("#0a121ae0"))
    val coolGrayANegative2 = Color(parseColor("#1a232ddb"))
    val coolGrayANegative1 = Color(parseColor("#1d2835cc"))
    val coolGrayA0 = Color(parseColor("#182639bd"))
    val coolGrayA1 = Color(parseColor("#1830498f"))
    val coolGrayA2 = Color(parseColor("#0d253f66"))
    val coolGrayA3 = Color(parseColor("#10315633"))
    val coolGrayA4 = Color(parseColor("#04294321"))
    val coolGrayA5 = Color(parseColor("#10284717"))
    val coolGrayA6 = Color(parseColor("#022e500f"))
    val coolGrayA7 = Color(parseColor("#00295c0a"))
    val coolGrayA8 = Color(parseColor("#1f529e05"))
}

object NeutralGrayValuesContainer {
    val negative4 = Color(parseColor("#212121"))
    val negative3 = Color(parseColor("#2e2e2e"))
    val negative2 = Color(parseColor("#404040"))
    val negative1 = Color(parseColor("#525252"))
    val neutralGray0 = Color(parseColor("#5e5e5e"))
    val neutralGray1 = Color(parseColor("#8a8a8a"))
    val neutralGray2 = Color(parseColor("#a6a6a6"))
    val neutralGray3 = Color(parseColor("#d6d6d6"))
    val neutralGray4 = Color(parseColor("#e3e3e3"))
    val neutralGray5 = Color(parseColor("#ebebeb"))
    val neutralGray6 = Color(parseColor("#f2f2f2"))
    val neutralGray7 = Color(parseColor("#f7f7f7"))
    val neutralGray8 = Color(parseColor("#fcfcfc"))
}

object NeutralGrayAlphaValuesContainer {
    val neutralGrayANegative4 = Color(parseColor("#121212ed"))
    val neutralGrayANegative3 = Color(parseColor("#0f0f0fe0"))
    val neutralGrayANegative2 = Color(parseColor("#212121db"))
    val neutralGrayANegative1 = Color(parseColor("#262626cc"))
    val neutralGrayA0 = Color(parseColor("#262627bd"))
    val neutralGrayA1 = Color(parseColor("#2b2b2b8f"))
    val neutralGrayA2 = Color(parseColor("#21212166"))
    val neutralGrayA3 = Color(parseColor("#2e2e2e33"))
    val neutralGrayA4 = Color(parseColor("#1f1f1f21"))
    val neutralGrayA5 = Color(parseColor("#1c1c1c17"))
    val neutralGrayA6 = Color(parseColor("#2121210f"))
    val neutralGrayA7 = Color(parseColor("#2e2e2e0a"))
    val neutralGrayA8 = Color(parseColor("#52525205"))
}

object WarmGrayValuesContainer {
    val negative4 = Color(parseColor("#222220"))
    val negative3 = Color(parseColor("#30302c"))
    val negative2 = Color(parseColor("#40403a"))
    val negative1 = Color(parseColor("#52524c"))
    val warmGray0 = Color(parseColor("#5f5f58"))
    val warmGray1 = Color(parseColor("#8b8b84"))
    val warmGray2 = Color(parseColor("#a8a89f"))
    val warmGray3 = Color(parseColor("#e3e305"))
    val warmGray4 = Color(parseColor("#e5e5e1"))
    val warmGray5 = Color(parseColor("#eaeae6"))
    val warmGray6 = Color(parseColor("#f3f3f1"))
    val warmGray7 = Color(parseColor("#f8f8f7"))
    val warmGray8 = Color(parseColor("#fdfdfc"))
}

object WarmGrayAlphaValuesContainer {
    val warmGrayANegative4 = Color(parseColor("#131311ed"))
    val warmGrayANegative3 = Color(parseColor("#12120de0"))
    val warmGrayANegative2 = Color(parseColor("#22221bdb"))
    val warmGrayANegative1 = Color(parseColor("#272720cc"))
    val warmGrayA0 = Color(parseColor("#26261cbd"))
    val warmGrayA1 = Color(parseColor("#2f2f238f"))
    val warmGrayA2 = Color(parseColor("#28281166"))
    val warmGrayA3 = Color(parseColor("#3e3e1d33"))
    val warmGrayA4 = Color(parseColor("#33331421"))
    val warmGrayA5 = Color(parseColor("#22220217"))
    val warmGrayA6 = Color(parseColor("#2f2f0e0f"))
    val warmGrayA7 = Color(parseColor("#2f2f2d0a"))
    val warmGrayA8 = Color(parseColor("#52525205"))
}

object WhiteAlphaValuesContainer {
    val whiteANegative12 = Color(parseColor("#ffffff05"))
    val whiteANegative11 = Color(parseColor("#ffffff08"))
    val whiteANegative10 = Color(parseColor("#ffffff0d"))
    val whiteANegative9 = Color(parseColor("#ffffff14"))
    val whiteANegative8 = Color(parseColor("#ffffff1a"))
    val whiteANegative7 = Color(parseColor("#ffffff1f"))
    val whiteANegative6 = Color(parseColor("#ffffff3d"))
    val whiteANegative5 = Color(parseColor("#ffffff66"))
    val whiteANegative4 = Color(parseColor("#ffffffa3"))
    val whiteANegative3 = Color(parseColor("#ffffffad"))
    val whiteANegative2 = Color(parseColor("#ffffffb8"))
    val whiteANegative1 = Color(parseColor("#ffffffd1"))
    val whiteA0 = Color(parseColor("#ffffff"))
}

object RedValuesContainer1 {
    val negative4 = Color(parseColor("#4a0d0d"))
    val negative3 = Color(parseColor("#30723a"))
    val negative2 = Color(parseColor("#63c7c3"))
    val negative1 = Color(parseColor("#a13636"))
    val red0 = Color(parseColor("#9e6610"))
    val red1 = Color(parseColor("#285aa5"))
    val red2 = Color(parseColor("#494b75"))
    val red3 = Color(parseColor("#76d91c"))
    val red4 = Color(parseColor("#d15a5a"))
    val red5 = Color(parseColor("#fee7e7"))
    val red6 = Color(parseColor("#ffebeb"))
    val red7 = Color(parseColor("#fef5f5"))
    val red8 = Color(parseColor("#fffafa"))
}

object MagentaValuesContainer1 {
    val negative4 = Color(parseColor("#410b2f"))
    val negative3 = Color(parseColor("#671e4d"))
    val negative2 = Color(parseColor("#f70aa8"))
    val negative1 = Color(parseColor("#953274"))
    val magenta0 = Color(parseColor("#91ae7a"))
    val magenta1 = Color(parseColor("#5d9ede"))
    val magenta2 = Color(parseColor("#ec89cb"))
    val magenta3 = Color(parseColor("#f7cae8"))
    val magenta4 = Color(parseColor("#fbd5ee"))
    val magenta5 = Color(parseColor("#fde2f4"))
    val magenta6 = Color(parseColor("#fdedf8"))
    val magenta7 = Color(parseColor("#fef6fb"))
    val magenta8 = Color(parseColor("#fffafd"))
}

object PurpleValuesContainer1 {
    val negative4 = Color(parseColor("#410b2f"))
    val negative3 = Color(parseColor("#5b1e67"))
    val negative2 = Color(parseColor("#792989"))
    val negative1 = Color(parseColor("#853295"))
    val purple0 = Color(parseColor("#9939ac"))
    val purple1 = Color(parseColor("#4e82ee"))
    val purple2 = Color(parseColor("#d98eec"))
    val purple3 = Color(parseColor("#c04c0d"))
    val purple4 = Color(parseColor("#f5d5fb"))
    val purple5 = Color(parseColor("#f8e2fd"))
    val purple6 = Color(parseColor("#faedfd"))
    val purple7 = Color(parseColor("#fdf5ff"))
    val purple8 = Color(parseColor("#fefaff"))
}

object VioletValuesContainer1 {
    val negative4 = Color(parseColor("#201263"))
    val negative3 = Color(parseColor("#39288a"))
    val negative2 = Color(parseColor("#161617"))
    val negative1 = Color(parseColor("#0e0406"))
    val violet0 = Color(parseColor("#634eca"))
    val violet1 = Color(parseColor("#927ef1"))
    val violet2 = Color(parseColor("#aba2fb"))
    val violet3 = Color(parseColor("#54917b"))
    val violet4 = Color(parseColor("#e3e0ff"))
    val violet5 = Color(parseColor("#eeebff"))
    val violet6 = Color(parseColor("#f3f0ff"))
    val violet7 = Color(parseColor("#f7f5ff"))
    val violet8 = Color(parseColor("#fbfaff"))
}

object BlueValuesContainer1 {
    val negative4 = Color(parseColor("#041f5d"))
    val negative3 = Color(parseColor("#113997"))
    val negative2 = Color(parseColor("#658b6e"))
    val negative1 = Color(parseColor("#ff9375"))
    val blue0 = Color(parseColor("#3061d5"))
    val blue1 = Color(parseColor("#6691f4"))
    val blue2 = Color(parseColor("#8eb0fb"))
    val blue3 = Color(parseColor("#0085ff"))
    val blue4 = Color(parseColor("#d6e3ff"))
    val blue5 = Color(parseColor("#e5eeff"))
    val blue6 = Color(parseColor("#ebf0ff"))
    val blue7 = Color(parseColor("#f5f8ff"))
    val blue8 = Color(parseColor("#fafbff"))
}

object CyanValuesContainer1 {
    val negative4 = Color(parseColor("#002742"))
    val negative3 = Color(parseColor("#0c636e"))
    val negative2 = Color(parseColor("#165c8d"))
    val negative1 = Color(parseColor("#60a0cf"))
    val cyan0 = Color(parseColor("#0870ba"))
    val cyan1 = Color(parseColor("#5699dc"))
    val cyan2 = Color(parseColor("#79bcf6"))
    val cyan3 = Color(parseColor("#c2e2ff"))
    val cyan4 = Color(parseColor("#cce7ff"))
    val cyan5 = Color(parseColor("#e0f1ff"))
    val cyan6 = Color(parseColor("#ebf5ff"))
    val cyan7 = Color(parseColor("#f0f9ff"))
    val cyan8 = Color(parseColor("#fafdff"))
}

object TealValuesContainer1 {
    val negative4 = Color(parseColor("#012a37"))
    val negative3 = Color(parseColor("#7c4fc4"))
    val negative2 = Color(parseColor("#d1d2d2"))
    val negative1 = Color(parseColor("#196c85"))
    val teal0 = Color(parseColor("#077597"))
    val teal1 = Color(parseColor("#4f9eba"))
    val teal2 = Color(parseColor("#7ac0dc"))
    val teal3 = Color(parseColor("#b8e8f5"))
    val teal4 = Color(parseColor("#c5ecf7"))
    val teal5 = Color(parseColor("#e0f3fa"))
    val teal6 = Color(parseColor("#e8f7fc"))
    val teal7 = Color(parseColor("#f0fbff"))
    val teal8 = Color(parseColor("#fafeff"))
}

object AquamarineValuesContainer1 {
    val negative4 = Color(parseColor("#012d26"))
    val negative3 = Color(parseColor("#0d4a42"))
    val negative2 = Color(parseColor("#15665b"))
    val negative1 = Color(parseColor("#1a7061"))
    val aquamarine0 = Color(parseColor("#097b68"))
    val aquamarine1 = Color(parseColor("#3da496"))
    val aquamarine2 = Color(parseColor("#6ec9bf"))
    val aquamarine4 = Color(parseColor("#c5f2ec"))
    val aquamarine3 = Color(parseColor("#bee9e4"))
    val aquamarine5 = Color(parseColor("#daf6f3"))
    val aquamarine6 = Color(parseColor("#e2f8f5"))
    val aquamarine7 = Color(parseColor("#f0faf9"))
    val aquamarine8 = Color(parseColor("#fbfefe"))
}

object GreenValuesContainer1 {
    val negative4 = Color(parseColor("#0a2e0b"))
    val negative3 = Color(parseColor("#b3b7b0"))
    val negative2 = Color(parseColor("#246626"))
    val negative1 = Color(parseColor("#2f6f2f"))
    val green0 = Color(parseColor("#20b027"))
    val green1 = Color(parseColor("#55a555"))
    val green2 = Color(parseColor("#fdff84"))
    val green3 = Color(parseColor("#00ff10"))
    val green4 = Color(parseColor("#cff2cf"))
    val green5 = Color(parseColor("#dff6df"))
    val green6 = Color(parseColor("#e6f9e6"))
    val green7 = Color(parseColor("#f4fbf4"))
    val green8 = Color(parseColor("#fbfefb"))
}

object OrangeValuesContainer1 {
    val negative4 = Color(parseColor("#492909"))
    val negative3 = Color(parseColor("#3f2828"))
    val negative2 = Color(parseColor("#a05c1c"))
    val negative1 = Color(parseColor("#b4610e"))
    val orange0 = Color(parseColor("#f59638"))
    val orange1 = Color(parseColor("#f6a351"))
    val orange2 = Color(parseColor("#feb871"))
    val orange3 = Color(parseColor("#ffd4a8"))
    val orange4 = Color(parseColor("#fcdec0"))
    val orange5 = Color(parseColor("#ffe8d1"))
    val orange6 = Color(parseColor("#fff0e0"))
    val orange7 = Color(parseColor("#fff5eb"))
    val orange8 = Color(parseColor("#fffcfa"))
}

object TransparentValuesContainer {
    val transparent = Color(parseColor("#ffffff00"))
}

object ColorValuesContainer {
    val content = ContentValuesContainer
    val border = BorderValuesContainer
    val background = BackgroundValuesContainer
    val action = ActionValuesContainer
    val interaction = InteractionValuesContainer
    val nonSemantic = NonSemanticValuesContainer
    val semantic = SemanticValuesContainer
    val coolGray = CoolGrayValuesContainer
    val coolGrayAlpha = CoolGrayAlphaValuesContainer
    val neutralGray = NeutralGrayValuesContainer
    val neutralGrayAlpha = NeutralGrayAlphaValuesContainer
    val warmGray = WarmGrayValuesContainer
    val warmGrayAlpha = WarmGrayAlphaValuesContainer
    val whiteAlpha = WhiteAlphaValuesContainer
    val red = RedValuesContainer1
    val magenta = MagentaValuesContainer1
    val purple = PurpleValuesContainer1
    val violet = VioletValuesContainer1
    val blue = BlueValuesContainer1
    val cyan = CyanValuesContainer1
    val teal = TealValuesContainer1
    val aquamarine = AquamarineValuesContainer1
    val green = GreenValuesContainer1
    val orange = OrangeValuesContainer1
    val transparent = TransparentValuesContainer
}

object BorderWidthValuesContainer {
    val focus = 1.0
    val none = 0.0
    val small = 1.0
    val medium = 2.0
    val large = 4.0
    val xLarge = 8.0
    val borderWidth0 = 0.0
    val borderWidth100 = 1.0
    val borderWidth200 = 2.0
    val borderWidth400 = 4.0
    val borderWidth800 = 8.0
}

object BorderRadiusValuesContainer {
    val none = 0.0
    val small = 2.0
    val medium = 4.0
    val large = 8.0
    val xLarge = 12.0
    val borderRadius2xLarge = 16.0
    val borderRadius3xLarge = 20.0
    val borderRadius4xLarge = 24.0
    val full = 999.0
    val borderRadius0 = 0.0
    val borderRadius25 = 2.0
    val borderRadius50 = 4.0
    val borderRadius100 = 8.0
    val borderRadius150 = 12.0
    val borderRadius200 = 16.0
    val borderRadius250 = 20.0
    val borderRadius300 = 24.0
    val borderRadius999 = 999.0
}

object SizeValuesContainer {
    val size3xLarge = 72.0
    val size2xLarge = 64.0
    val xLarge = 56.0
    val large = 48.0
    val medium = 40.0
    val small = 32.0
    val xSmall = 24.0
    val size2xSmall = 20.0
    val size3xSmall = 16.0
}

object PaddingValuesContainer {
    val none = 0.0
    val padding2xSmall = 2.0
    val xSmall = 4.0
    val small = 8.0
    val medium = 12.0
    val large = 16.0
    val padding2xLarge = 24.0
    val padding3xLarge = 32.0
    val padding4xLarge = 40.0
    val padding5xLarge = 44.0
    val padding6xLarge = 64.0
}

object GapValuesContainer {
    val none = 0.0
    val gap2xSmall = 2.0
    val xSmall = 4.0
    val small = 8.0
    val medium = 12.0
    val large = 16.0
    val xLarge = 24.0
    val gap2xLarge = 32.0
    val gap3xLarge = 44.0
}

object SpaceValuesContainer {
    val padding = PaddingValuesContainer
    val gap = GapValuesContainer
}

object OpacityValuesContainer {
    val disabled = 0.5
    val opacity0 = 0.0
    val opacity50 = 0.5
    val opacity100 = 1.0
}

object CodeValuesContainer {
    val typographyCodeSmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 400.0, fontSize = 12.0, fontFamily = "Noto Sans Mono")
    val typographyCodeMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 400.0, fontSize = 14.0, fontFamily = "Noto Sans Mono")
    val typographyCodeLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 400.0, fontSize = 16.0, fontFamily = "Noto Sans Mono")
}

object UtilityValuesContainer {
    val typographyUtilitySmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 500.0, fontSize = 12.0, fontFamily = "Noto Sans")
    val typographyUtilityMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 500.0, fontSize = 14.0, fontFamily = "Noto Sans")
    val typographyUtilityLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 500.0, fontSize = 16.0, fontFamily = "Noto Sans")
}

object BodyValuesContainer {
    val typographyBodySmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 400.0, fontSize = 12.0, fontFamily = "Noto Sans")
    val typographyBodyMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 400.0, fontSize = 14.0, fontFamily = "Noto Sans")
    val typographyBodyLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 400.0, fontSize = 16.0, fontFamily = "Noto Sans")
}

object HeadingValuesContainer {
    val typographyHeadingSmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 700.0, fontSize = 12.0, fontFamily = "Noto Sans")
    val typographyHeadingMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 700.0, fontSize = 14.0, fontFamily = "Noto Sans")
    val typographyHeadingLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 700.0, fontSize = 16.0, fontFamily = "Noto Sans")
    val typographyHeadingXLarge = Typography(lineHeight = 24.0, letterSpacing = -0.014, fontWeight = 700.0, fontSize = 18.0, fontFamily = "Noto Sans")
    val typographyHeading2xLarge = Typography(lineHeight = 26.0, letterSpacing = -0.017, fontWeight = 700.0, fontSize = 20.0, fontFamily = "Noto Sans")
    val typographyHeading3xLarge = Typography(lineHeight = 32.0, letterSpacing = -0.019, fontWeight = 700.0, fontSize = 24.0, fontFamily = "Noto Sans")
    val typographyHeading4xLarge = Typography(lineHeight = 38.0, letterSpacing = -0.021, fontWeight = 700.0, fontSize = 28.0, fontFamily = "Noto Sans")
    val typographyHeading5xLarge = Typography(lineHeight = 42.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 32.0, fontFamily = "Noto Sans")
    val typographyHeading6xLarge = Typography(lineHeight = 48.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 36.0, fontFamily = "Noto Sans")
    val typographyHeading7xLarge = Typography(lineHeight = 56.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 42.0, fontFamily = "Noto Sans")
    val typographyHeading8xLarge = Typography(lineHeight = 58.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 48.0, fontFamily = "Noto Sans")
    val typographyHeading9xLarge = Typography(lineHeight = 66.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 54.0, fontFamily = "Noto Sans")
}

object DisplayValuesContainer {
    val typographyDisplaySmall = Typography(lineHeight = 66.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 54.0, fontFamily = "Noto Sans")
    val typographyDisplayMedium = Typography(lineHeight = 72.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 60.0, fontFamily = "Noto Sans")
    val typographyDisplayLarge = Typography(lineHeight = 82.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 68.0, fontFamily = "Noto Sans")
    val typographyDisplayXLarge = Typography(lineHeight = 92.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 76.0, fontFamily = "Noto Sans")
    val typographyDisplay2xLarge = Typography(lineHeight = 102.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 84.0, fontFamily = "Noto Sans")
    val typographyDisplay3xLarge = Typography(lineHeight = 112.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 92.0, fontFamily = "Noto Sans")
}

object TypographyValuesContainer {
    val code = CodeValuesContainer
    val utility = UtilityValuesContainer
    val body = BodyValuesContainer
    val heading = HeadingValuesContainer
    val display = DisplayValuesContainer
}

object DimensionValuesContainer {
    val dimension0 = 0.0
    val dimension25 = 2.0
    val dimension50 = 4.0
    val dimension100 = 8.0
    val dimension150 = 12.0
    val dimension200 = 16.0
    val dimension250 = 20.0
    val dimension300 = 24.0
    val dimension400 = 32.0
    val dimension500 = 40.0
    val dimension550 = 44.0
    val dimension600 = 48.0
    val dimension700 = 56.0
    val dimension800 = 64.0
    val dimension900 = 72.0
    val dimension1000 = 80.0
    val dimension1200 = 96.0
    val dimension1500 = 120.0
    val dimension1600 = 128.0
}

object BottomValuesContainer {
    val elevationBottom100 = BoxShadow(y = 1.0, x = 0.0, type = "dropShadow", spread = 0.0, color = "#1b242c1f", blur = 2.0)
    val elevationBottom200 = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c14", blur = 8.0))
    val elevationBottom300 = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 8.0, x = 0.0, type = "dropShadow", spread = -2.0, color = "#1b242c1f", blur = 16.0))
    val elevationBottom400 = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 16.0, x = 0.0, type = "dropShadow", spread = -6.0, color = "#1b242c29", blur = 24.0))
}

object TopValuesContainer {
    val elevationTop100 = BoxShadow(y = -1.0, x = 0.0, type = "dropShadow", spread = 0.0, color = "#1b242c1f", blur = 2.0)
    val elevationTop200 = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c14", blur = 8.0))
    val elevationTop300 = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -8.0, x = 0.0, type = "dropShadow", spread = -2.0, color = "#1b242c1f", blur = 16.0))
    val elevationTop400 = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -16.0, x = 0.0, type = "dropShadow", spread = -6.0, color = "#1b242c29", blur = 24.0))
}

object ElevationValuesContainer {
    val bottom = BottomValuesContainer
    val top = TopValuesContainer
}

object FontFamilyValuesContainer {
    val sans = "Noto Sans"
    val serif = "Noto Serif"
    val mono = "Noto Sans Mono"
}

object FontSizeValuesContainer {
    val fontSize100 = 8.0
    val fontSize125 = 10.0
    val fontSize150 = 12.0
    val fontSize175 = 14.0
    val fontSize200 = 16.0
    val fontSize225 = 18.0
    val fontSize250 = 20.0
    val fontSize300 = 24.0
    val fontSize350 = 28.0
    val fontSize400 = 32.0
    val fontSize450 = 36.0
    val fontSize525 = 42.0
    val fontSize600 = 48.0
    val fontSize675 = 54.0
    val fontSize750 = 60.0
    val fontSize850 = 68.0
    val fontSize950 = 76.0
    val fontSize1050 = 84.0
    val fontSize1150 = 92.0
}

object FontWeightValuesContainer {
    val fontWeight300 = 300.0
    val fontWeight400 = 400.0
    val fontWeight500 = 500.0
    val fontWeight600 = 600.0
    val fontWeight700 = 700.0
}

object LetterSpacingValuesContainer {
    val letterSpacing0 = 0.0
    val letterSpacing100 = -0.006
    val letterSpacing200 = -0.011
    val letterSpacing300 = -0.014
    val letterSpacing400 = -0.017
    val letterSpacing500 = -0.019
    val letterSpacing600 = -0.021
    val letterSpacing700 = -0.022
}

object LineHeightValuesContainer {
    val value150 = 12.0
    val value200 = 16.0
    val value250 = 20.0
    val value275 = 22.0
    val value300 = 24.0
    val value325 = 26.0
    val value400 = 32.0
    val value475 = 38.0
    val value525 = 42.0
    val value600 = 48.0
    val value700 = 56.0
    val value725 = 58.0
    val value825 = 66.0
    val value900 = 72.0
    val value1025 = 82.0
    val value1150 = 92.0
    val value1275 = 102.0
    val value1400 = 112.0
}

object ContentValuesContainer1 {
    val primary = Color(parseColor("#272e35"))
    val secondary = Color(parseColor("#555f6d"))
    val tertiary = Color(parseColor("#7e8c9a"))
    val disabled = Color(parseColor("#9ea8b3"))
    val primaryInverse = Color(parseColor("#ffffff"))
    val secondaryInverse = Color(parseColor("#ffffffa3"))
    val tertiaryInverse = Color(parseColor("#ffffff66"))
    val disabledInverse = Color(parseColor("#ffffff3d"))
    val infoPrimary = Color(parseColor("#113997"))
    val infoSecondary = Color(parseColor("#3061d5"))
    val successPrimary = Color(parseColor("#b3b7b0"))
    val successSecondary = Color(parseColor("#20b027"))
    val warningPrimary = Color(parseColor("#3f2828"))
    val warningSecondary = Color(parseColor("#f59638"))
    val dangerPrimary = Color(parseColor("#30723a"))
    val dangerSecondary = Color(parseColor("#9e6610"))
    val brandPrimary = Color(parseColor("#113997"))
    val brandSecondary = Color(parseColor("#3061d5"))
}

object BorderValuesContainer2 {
    val `default` = Color(parseColor("#eaedf0"))
    val defaultA = Color(parseColor("#10284717"))
    val inverse = Color(parseColor("#ffffff"))
    val neutralStrong = Color(parseColor("#555f6d"))
    val neutralSubtle = Color(parseColor("#cfd6dd"))
    val infoStrong = Color(parseColor("#3061d5"))
    val infoSubtle = Color(parseColor("#0085ff"))
    val successStrong = Color(parseColor("#20b027"))
    val successSubtle = Color(parseColor("#00ff10"))
    val warningStrong = Color(parseColor("#f59638"))
    val warningSubtle = Color(parseColor("#ffd4a8"))
    val dangerStrong = Color(parseColor("#9e6610"))
    val dangerSubtle = Color(parseColor("#76d91c"))
}

object BackgroundValuesContainer2 {
    val `default` = Color(parseColor("#ffffff"))
    val inverse = Color(parseColor("#272e35"))
    val neutralStrong = Color(parseColor("#555f6d"))
    val neutralMuted = Color(parseColor("#dee3e7"))
    val neutralOnSubtle = Color(parseColor("#eaedf0"))
    val neutralSubtle = Color(parseColor("#f5f7f9"))
    val neutralSurface = Color(parseColor("#fcfcfd"))
    val infoStrong = Color(parseColor("#3061d5"))
    val infoMuted = Color(parseColor("#d6e3ff"))
    val infoOnSubtle = Color(parseColor("#e5eeff"))
    val infoSubtle = Color(parseColor("#f5f8ff"))
    val infoSurface = Color(parseColor("#fafbff"))
    val successStrong = Color(parseColor("#20b027"))
    val successMuted = Color(parseColor("#cff2cf"))
    val successOnSubtle = Color(parseColor("#dff6df"))
    val successSubtle = Color(parseColor("#f4fbf4"))
    val successSurface = Color(parseColor("#fbfefb"))
    val warningStrong = Color(parseColor("#f59638"))
    val warningMuted = Color(parseColor("#fcdec0"))
    val warningOnSubtle = Color(parseColor("#ffe8d1"))
    val warningSubtle = Color(parseColor("#fff5eb"))
    val warningSurface = Color(parseColor("#fffcfa"))
    val dangerStrong = Color(parseColor("#9e6610"))
    val dangerMuted = Color(parseColor("#d15a5a"))
    val dangerOnSubtle = Color(parseColor("#fee7e7"))
    val dangerSubtle = Color(parseColor("#fef5f5"))
    val dangerSurface = Color(parseColor("#fffafa"))
    val brandStrong = Color(parseColor("#3061d5"))
    val brandMuted = Color(parseColor("#d6e3ff"))
    val brandOnSubtle = Color(parseColor("#e5eeff"))
    val brandSurface = Color(parseColor("#fafbff"))
    val brandSubtle = Color(parseColor("#f5f8ff"))
}

object PrimaryValuesContainer1 {
    val actionPrimaryNormal = Color(parseColor("#3061d5"))
    val actionPrimaryHover = Color(parseColor("#658b6e"))
    val actionPrimaryActive = Color(parseColor("#113997"))
    val actionPrimarySelected = Color(parseColor("#658b6e"))
    val actionPrimarySubtleNormal = Color(parseColor("#ebf0ff"))
    val actionPrimarySubtleHover = Color(parseColor("#e5eeff"))
    val actionPrimarySubtleActive = Color(parseColor("#0085ff"))
    val actionPrimarySubtleSelected = Color(parseColor("#e5eeff"))
}

object NeutralValuesContainer3 {
    val actionNeutralNormal = Color(parseColor("#4a545e"))
    val actionNeutralHover = Color(parseColor("#3a424a"))
    val actionNeutralActive = Color(parseColor("#272e35"))
    val actionNeutralSelected = Color(parseColor("#3a424a"))
    val actionNeutralSubtleNormal = Color(parseColor("#f0f3f5"))
    val actionNeutralSubtleHover = Color(parseColor("#eaedf0"))
    val actionNeutralSubtleActive = Color(parseColor("#cfd6dd"))
    val actionNeutralSubtleSelected = Color(parseColor("#eaedf0"))
}

object SuccessValuesContainer2 {
    val actionSuccessNormal = Color(parseColor("#20b027"))
    val actionSuccessHover = Color(parseColor("#246626"))
    val actionSuccessActive = Color(parseColor("#b3b7b0"))
    val actionSuccessSelected = Color(parseColor("#246626"))
    val actionSuccessSubtleNormal = Color(parseColor("#e6f9e6"))
    val actionSuccessSubtleHover = Color(parseColor("#dff6df"))
    val actionSuccessSubtleActive = Color(parseColor("#00ff10"))
    val actionSuccessSubtleSelected = Color(parseColor("#dff6df"))
}

object DangerValuesContainer3 {
    val actionDangerNormal = Color(parseColor("#9e6610"))
    val actionDangerHover = Color(parseColor("#63c7c3"))
    val actionDangerActive = Color(parseColor("#30723a"))
    val actionDangerSelected = Color(parseColor("#63c7c3"))
    val actionDangerSubtleNormal = Color(parseColor("#ffebeb"))
    val actionDangerSubtleHover = Color(parseColor("#fee7e7"))
    val actionDangerSubtleActive = Color(parseColor("#76d91c"))
    val actionDangerSubtleSelected = Color(parseColor("#fee7e7"))
}

object GhostValuesContainer2 {
    val actionGhostNormal = Color(parseColor("#ffffff00"))
    val actionGhostHover = Color(parseColor("#022e500f"))
    val actionGhostActive = Color(parseColor("#10284717"))
    val actionGhostSelected = Color(parseColor("#022e500f"))
    val actionGhostInverseHover = Color(parseColor("#ffffff1a"))
    val actionGhostInverseActive = Color(parseColor("#ffffff1f"))
    val actionGhostInverseSelected = Color(parseColor("#ffffff1a"))
    val actionGhostDangerHover = Color(parseColor("#ffebeb"))
    val actionGhostDangerActive = Color(parseColor("#fee7e7"))
    val actionGhostDangerSelected = Color(parseColor("#ffebeb"))
}

object OutlineValuesContainer1 {
    val actionOutlineNormal = Color(parseColor("#cfd6dd"))
    val actionOutlineHover = Color(parseColor("#9ea8b3"))
    val actionOutlineActive = Color(parseColor("#7e8c9a"))
    val actionOutlineSelected = Color(parseColor("#9ea8b3"))
}

object InverseValuesContainer2 {
    val actionInverseNormal = Color(parseColor("#ffffff"))
    val actionInverseHover = Color(parseColor("#ffffffd1"))
    val actionInverseActive = Color(parseColor("#ffffffb8"))
    val actionInverseSelected = Color(parseColor("#ffffffd1"))
}

object ReverseInverseValuesContainer1 {
    val actionReverseInverseNormal = Color(parseColor("#0a121ae0"))
    val actionReverseInverseHover = Color(parseColor("#1d2835cc"))
    val actionReverseInverseActive = Color(parseColor("#182639bd"))
    val actionReverseInverseSelected = Color(parseColor("#1d2835cc"))
}

object ActionValuesContainer1 {
    val primary = PrimaryValuesContainer1
    val neutral = NeutralValuesContainer3
    val success = SuccessValuesContainer2
    val danger = DangerValuesContainer3
    val ghost = GhostValuesContainer2
    val outline = OutlineValuesContainer1
    val inverse = InverseValuesContainer2
    val reverseInverse = ReverseInverseValuesContainer1
}

object DefaultValuesContainer1 {
    val interactionDefaultNormal = Color(parseColor("#3061d5"))
    val interactionDefaultHover = Color(parseColor("#658b6e"))
    val interactionDefaultActive = Color(parseColor("#113997"))
    val interactionDefaultSelected = Color(parseColor("#658b6e"))
    val interactionDefaultSubtleNormal = Color(parseColor("#ebf0ff"))
    val interactionDefaultSubtleHover = Color(parseColor("#e5eeff"))
    val interactionDefaultSubtleActive = Color(parseColor("#0085ff"))
    val interactionDefaultSubtleSelected = Color(parseColor("#e5eeff"))
}

object NeutralValuesContainer4 {
    val interactionNeutralNormal = Color(parseColor("#4a545e"))
    val interactionNeutralHover = Color(parseColor("#3a424a"))
    val interactionNeutralActive = Color(parseColor("#272e35"))
    val interactionNeutralSelected = Color(parseColor("#3a424a"))
    val interactionNeutralSubtleNormal = Color(parseColor("#f0f3f5"))
    val interactionNeutralSubtleHover = Color(parseColor("#eaedf0"))
    val interactionNeutralSubtleActive = Color(parseColor("#cfd6dd"))
    val interactionNeutralSubtleSelected = Color(parseColor("#eaedf0"))
}

object DangerValuesContainer4 {
    val interactionDangerNormal = Color(parseColor("#9e6610"))
    val interactionDangerHover = Color(parseColor("#63c7c3"))
    val interactionDangerActive = Color(parseColor("#30723a"))
    val interactionDangerSelected = Color(parseColor("#63c7c3"))
    val interactionDangerSubtleNormal = Color(parseColor("#ffebeb"))
    val interactionDangerSubtleHover = Color(parseColor("#fee7e7"))
    val interactionDangerSubtleActive = Color(parseColor("#76d91c"))
    val interactionDangerSubtleSelected = Color(parseColor("#fee7e7"))
}

object GhostValuesContainer3 {
    val interactionGhostNormal = Color(parseColor("#ffffff00"))
    val interactionGhostHover = Color(parseColor("#022e500f"))
    val interactionGhostActive = Color(parseColor("#10284717"))
    val interactionGhostSelected = Color(parseColor("#022e500f"))
    val interactionGhostInverseHover = Color(parseColor("#ffffff1a"))
    val interactionGhostInverseNormal = Color(parseColor("#ffffff1f"))
    val interactionGhostInverseSelected = Color(parseColor("#ffffff1a"))
    val interactionGhostDangerHover = Color(parseColor("#ffebeb"))
    val interactionGhostDangerNormal = Color(parseColor("#fee7e7"))
    val interactionGhostDangerSelected = Color(parseColor("#ffebeb"))
}

object DisabledValuesContainer1 {
    val interactionDisabledNormal = Color(parseColor("#9ea8b3"))
    val interactionDisabledHover = Color(parseColor("#7e8c9a"))
    val interactionDisabledActive = Color(parseColor("#555f6d"))
    val interactionDisabledSubtleNormal = Color(parseColor("#eaedf0"))
    val interactionDisabledSubtleHover = Color(parseColor("#dee3e7"))
    val interactionDisabledSubtleActive = Color(parseColor("#cfd6dd"))
}

object BorderValuesContainer3 {
    val interactionBorderNormal = Color(parseColor("#8eb0fb"))
    val interactionBorderHover = Color(parseColor("#6691f4"))
    val interactionBorderActive = Color(parseColor("#ff9375"))
    val interactionBorderSelected = Color(parseColor("#3061d5"))
    val interactionBorderNeutralNormal = Color(parseColor("#cfd6dd"))
    val interactionBorderNeutralHover = Color(parseColor("#9ea8b3"))
    val interactionBorderNeutralActive = Color(parseColor("#7e8c9a"))
    val interactionBorderNeutralSelected = Color(parseColor("#9ea8b3"))
    val interactionBorderDanger = Color(parseColor("#285aa5"))
}

object BackgroundValuesContainer3 {
    val interactionBackgroundModal = Color(parseColor("#ffffff"))
    val interactionBackgroundModeless = Color(parseColor("#ffffff"))
    val interactionBackgroundModelessInverse = Color(parseColor("#272e35"))
    val interactionBackgroundSidepanel = Color(parseColor("#ffffff"))
    val interactionBackgroundFormField = Color(parseColor("#ffffff"))
    val interactionBackgroundDimmer = Color(parseColor("#182639bd"))
}

object InverseValuesContainer3 {
    val interactionInverseNormal = Color(parseColor("#ffffff"))
    val interactionInverseHover = Color(parseColor("#ffffffd1"))
    val interactionInverseActive = Color(parseColor("#ffffffb8"))
    val interactionInverseSelected = Color(parseColor("#ffffffd1"))
}

object FocusValuesContainer1 {
    val interactionFocusDefault = Color(parseColor("#6691f4"))
}

object InteractionValuesContainer1 {
    val `default` = DefaultValuesContainer1
    val neutral = NeutralValuesContainer4
    val danger = DangerValuesContainer4
    val ghost = GhostValuesContainer3
    val disabled = DisabledValuesContainer1
    val border = BorderValuesContainer3
    val background = BackgroundValuesContainer3
    val inverse = InverseValuesContainer3
    val focus = FocusValuesContainer1
}

object GrayValuesContainer1 {
    val nonSemanticGrayContentPrimary = Color(parseColor("#272e35"))
    val nonSemanticGrayContentSecondary = Color(parseColor("#555f6d"))
    val nonSemanticGrayBorderDefault = Color(parseColor("#eaedf0"))
    val nonSemanticGrayBorderStrong = Color(parseColor("#555f6d"))
    val nonSemanticGrayBorderSubtle = Color(parseColor("#cfd6dd"))
    val nonSemanticGrayBackgroundStrong = Color(parseColor("#555f6d"))
    val nonSemanticGrayBackgroundMuted = Color(parseColor("#dee3e7"))
    val nonSemanticGrayBackgroundOnSubtle = Color(parseColor("#eaedf0"))
    val nonSemanticGrayBackgroundSubtle = Color(parseColor("#f5f7f9"))
    val nonSemanticGrayBackgroundSurface = Color(parseColor("#fcfcfd"))
}

object WhiteValuesContainer1 {
    val nonSemanticWhiteContentPrimary = Color(parseColor("#ffffff"))
    val nonSemanticWhiteContentSecondary = Color(parseColor("#ffffffa3"))
    val nonSemanticWhiteBorderDefault = Color(parseColor("#ffffff66"))
    val nonSemanticWhiteBorderStrong = Color(parseColor("#ffffff"))
    val nonSemanticWhiteBorderSubtle = Color(parseColor("#ffffffad"))
    val nonSemanticWhiteBackgroundStrong = Color(parseColor("#ffffff"))
    val nonSemanticWhiteBackgroundMuted = Color(parseColor("#ffffffa3"))
    val nonSemanticWhiteBackgroundOnSubtle = Color(parseColor("#ffffff66"))
    val nonSemanticWhiteBackgroundSubtle = Color(parseColor("#ffffff1f"))
    val nonSemanticWhiteBackgroundSurface = Color(parseColor("#ffffff1a"))
}

object RedValuesContainer2 {
    val nonSemanticRedContentPrimary = Color(parseColor("#30723a"))
    val nonSemanticRedContentSecondary = Color(parseColor("#9e6610"))
    val nonSemanticRedBorderDefault = Color(parseColor("#fee7e7"))
    val nonSemanticRedBorderStrong = Color(parseColor("#9e6610"))
    val nonSemanticRedBorderSubtle = Color(parseColor("#76d91c"))
    val nonSemanticRedBackgroundStrong = Color(parseColor("#9e6610"))
    val nonSemanticRedBackgroundMuted = Color(parseColor("#d15a5a"))
    val nonSemanticRedBackgroundOnSubtle = Color(parseColor("#fee7e7"))
    val nonSemanticRedBackgroundSubtle = Color(parseColor("#fef5f5"))
    val nonSemanticRedBackgroundSurface = Color(parseColor("#fffafa"))
}

object MagentaValuesContainer2 {
    val nonSemanticMagentaContentPrimary = Color(parseColor("#671e4d"))
    val nonSemanticMagentaContentSecondary = Color(parseColor("#91ae7a"))
    val nonSemanticMagentaBorderDefault = Color(parseColor("#fde2f4"))
    val nonSemanticMagentaBorderStrong = Color(parseColor("#91ae7a"))
    val nonSemanticMagentaBorderSubtle = Color(parseColor("#f7cae8"))
    val nonSemanticMagentaBackgroundStrong = Color(parseColor("#91ae7a"))
    val nonSemanticMagentaBackgroundMuted = Color(parseColor("#fbd5ee"))
    val nonSemanticMagentaBackgroundOnSubtle = Color(parseColor("#fde2f4"))
    val nonSemanticMagentaBackgroundSubtle = Color(parseColor("#fef6fb"))
    val nonSemanticMagentaBackgroundSurface = Color(parseColor("#fffafd"))
}

object PurpleValuesContainer2 {
    val nonSemanticPurpleContentPrimary = Color(parseColor("#5b1e67"))
    val nonSemanticPurpleContentSecondary = Color(parseColor("#9939ac"))
    val nonSemanticPurpleBorderDefault = Color(parseColor("#f8e2fd"))
    val nonSemanticPurpleBorderStrong = Color(parseColor("#9939ac"))
    val nonSemanticPurpleBorderSubtle = Color(parseColor("#c04c0d"))
    val nonSemanticPurpleBackgroundStrong = Color(parseColor("#9939ac"))
    val nonSemanticPurpleBackgroundMuted = Color(parseColor("#f5d5fb"))
    val nonSemanticPurpleBackgroundOnSubtle = Color(parseColor("#f8e2fd"))
    val nonSemanticPurpleBackgroundSubtle = Color(parseColor("#fdf5ff"))
    val nonSemanticPurpleBackgroundSurface = Color(parseColor("#fefaff"))
}

object VioletValuesContainer2 {
    val nonSemanticVioletContentPrimary = Color(parseColor("#39288a"))
    val nonSemanticVioletContentSecondary = Color(parseColor("#634eca"))
    val nonSemanticVioletBorderDefault = Color(parseColor("#eeebff"))
    val nonSemanticVioletBorderStrong = Color(parseColor("#634eca"))
    val nonSemanticVioletBorderSubtle = Color(parseColor("#54917b"))
    val nonSemanticVioletBackgroundStrong = Color(parseColor("#634eca"))
    val nonSemanticVioletBackgroundMuted = Color(parseColor("#e3e0ff"))
    val nonSemanticVioletBackgroundOnSubtle = Color(parseColor("#eeebff"))
    val nonSemanticVioletBackgroundSubtle = Color(parseColor("#f7f5ff"))
    val nonSemanticVioletBackgroundSurface = Color(parseColor("#fbfaff"))
}

object BlueValuesContainer2 {
    val nonSemanticBlueContentPrimary = Color(parseColor("#113997"))
    val nonSemanticBlueContentSecondary = Color(parseColor("#3061d5"))
    val nonSemanticBlueBorderDefault = Color(parseColor("#e5eeff"))
    val nonSemanticBlueBorderStrong = Color(parseColor("#3061d5"))
    val nonSemanticBlueBorderSubtle = Color(parseColor("#0085ff"))
    val nonSemanticBlueBackgroundStrong = Color(parseColor("#3061d5"))
    val nonSemanticBlueBackgroundMuted = Color(parseColor("#d6e3ff"))
    val nonSemanticBlueBackgroundOnSubtle = Color(parseColor("#e5eeff"))
    val nonSemanticBlueBackgroundSubtle = Color(parseColor("#f5f8ff"))
    val nonSemanticBlueBackgroundSurface = Color(parseColor("#fafbff"))
}

object CyanValuesContainer2 {
    val nonSemanticCyanContentPrimary = Color(parseColor("#0c636e"))
    val nonSemanticCyanContentSecondary = Color(parseColor("#0870ba"))
    val nonSemanticCyanBorderDefault = Color(parseColor("#e0f1ff"))
    val nonSemanticCyanBorderStrong = Color(parseColor("#0870ba"))
    val nonSemanticCyanBorderSubtle = Color(parseColor("#c2e2ff"))
    val nonSemanticCyanBackgroundStrong = Color(parseColor("#0870ba"))
    val nonSemanticCyanBackgroundMuted = Color(parseColor("#cce7ff"))
    val nonSemanticCyanBackgroundOnSubtle = Color(parseColor("#e0f1ff"))
    val nonSemanticCyanBackgroundSubtle = Color(parseColor("#f0f9ff"))
    val nonSemanticCyanBackgroundSurface = Color(parseColor("#fafdff"))
}

object TealValuesContainer2 {
    val nonSemanticTealContentPrimary = Color(parseColor("#7c4fc4"))
    val nonSemanticTealContentSecondary = Color(parseColor("#077597"))
    val nonSemanticTealBorderDefault = Color(parseColor("#e0f3fa"))
    val nonSemanticTealBorderStrong = Color(parseColor("#077597"))
    val nonSemanticTealBorderSubtle = Color(parseColor("#b8e8f5"))
    val nonSemanticTealBackgroundStrong = Color(parseColor("#077597"))
    val nonSemanticTealBackgroundMuted = Color(parseColor("#c5ecf7"))
    val nonSemanticTealBackgroundOnSubtle = Color(parseColor("#e0f3fa"))
    val nonSemanticTealBackgroundSubtle = Color(parseColor("#f0fbff"))
    val nonSemanticTealBackgroundSurface = Color(parseColor("#fafeff"))
}

object AquamarineValuesContainer2 {
    val nonSemanticAquamarineContentPrimary = Color(parseColor("#0d4a42"))
    val nonSemanticAquamarineContentSecondary = Color(parseColor("#097b68"))
    val nonSemanticAquamarineBorderDefault = Color(parseColor("#daf6f3"))
    val nonSemanticAquamarineBorderStrong = Color(parseColor("#097b68"))
    val nonSemanticAquamarineBorderSubtle = Color(parseColor("#bee9e4"))
    val nonSemanticAquamarineBackgroundStrong = Color(parseColor("#097b68"))
    val nonSemanticAquamarineBackgroundMuted = Color(parseColor("#c5f2ec"))
    val nonSemanticAquamarineBackgroundOnSubtle = Color(parseColor("#daf6f3"))
    val nonSemanticAquamarineBackgroundSubtle = Color(parseColor("#f0faf9"))
    val nonSemanticAquamarineBackgroundSurface = Color(parseColor("#fbfefe"))
}

object GreenValuesContainer2 {
    val nonSemanticGreenContentPrimary = Color(parseColor("#b3b7b0"))
    val nonSemanticGreenContentSecondary = Color(parseColor("#20b027"))
    val nonSemanticGreenBorderDefault = Color(parseColor("#dff6df"))
    val nonSemanticGreenBorderStrong = Color(parseColor("#20b027"))
    val nonSemanticGreenBorderSubtle = Color(parseColor("#00ff10"))
    val nonSemanticGreenBackgroundStrong = Color(parseColor("#20b027"))
    val nonSemanticGreenBackgroundMuted = Color(parseColor("#cff2cf"))
    val nonSemanticGreenBackgroundOnSubtle = Color(parseColor("#dff6df"))
    val nonSemanticGreenBackgroundSubtle = Color(parseColor("#f4fbf4"))
    val nonSemanticGreenBackgroundSurface = Color(parseColor("#fbfefb"))
}

object OrangeValuesContainer2 {
    val nonSemanticOrangeContentPrimary = Color(parseColor("#3f2828"))
    val nonSemanticOrangeContentSecondary = Color(parseColor("#f59638"))
    val nonSemanticOrangeBorderDefault = Color(parseColor("#ffe8d1"))
    val nonSemanticOrangeBorderStrong = Color(parseColor("#f59638"))
    val nonSemanticOrangeBorderSubtle = Color(parseColor("#ffd4a8"))
    val nonSemanticOrangeBackgroundStrong = Color(parseColor("#f59638"))
    val nonSemanticOrangeBackgroundMuted = Color(parseColor("#fcdec0"))
    val nonSemanticOrangeBackgroundOnSubtle = Color(parseColor("#ffe8d1"))
    val nonSemanticOrangeBackgroundSubtle = Color(parseColor("#fff5eb"))
    val nonSemanticOrangeBackgroundSurface = Color(parseColor("#fffcfa"))
}

object NonSemanticValuesContainer1 {
    val gray = GrayValuesContainer1
    val white = WhiteValuesContainer1
    val red = RedValuesContainer2
    val magenta = MagentaValuesContainer2
    val purple = PurpleValuesContainer2
    val violet = VioletValuesContainer2
    val blue = BlueValuesContainer2
    val cyan = CyanValuesContainer2
    val teal = TealValuesContainer2
    val aquamarine = AquamarineValuesContainer2
    val green = GreenValuesContainer2
    val orange = OrangeValuesContainer2
}

object BrandValuesContainer1 {
    val semanticBrandNegative4 = Color(parseColor("#9e6610"))
    val semanticBrandNegative3 = Color(parseColor("#113997"))
    val semanticBrandNegative2 = Color(parseColor("#658b6e"))
    val semanticBrandNegative1 = Color(parseColor("#ff9375"))
    val semanticBrand0 = Color(parseColor("#3061d5"))
    val semanticBrand1 = Color(parseColor("#6691f4"))
    val semanticBrand2 = Color(parseColor("#8eb0fb"))
    val semanticBrand3 = Color(parseColor("#0085ff"))
    val semanticBrand4 = Color(parseColor("#d6e3ff"))
    val semanticBrand5 = Color(parseColor("#e5eeff"))
    val semanticBrand6 = Color(parseColor("#ebf0ff"))
    val semanticBrand7 = Color(parseColor("#f5f8ff"))
    val semanticBrand8 = Color(parseColor("#fafbff"))
}

object NeutralValuesContainer5 {
    val semanticNeutralNegative4 = Color(parseColor("#1b242c"))
    val semanticNeutralNegative3 = Color(parseColor("#272e35"))
    val semanticNeutralNegative2 = Color(parseColor("#3a424a"))
    val semanticNeutralNegative1 = Color(parseColor("#4a545e"))
    val semanticNeutral0 = Color(parseColor("#555f6d"))
    val semanticNeutral1 = Color(parseColor("#7e8c9a"))
    val semanticNeutral2 = Color(parseColor("#9ea8b3"))
    val semanticNeutral3 = Color(parseColor("#cfd6dd"))
    val semanticNeutral4 = Color(parseColor("#dee3e7"))
    val semanticNeutral5 = Color(parseColor("#eaedf0"))
    val semanticNeutral6 = Color(parseColor("#f0f3f5"))
    val semanticNeutral7 = Color(parseColor("#f5f7f9"))
    val semanticNeutral8 = Color(parseColor("#fcfcfd"))
}

object NeutralAlphaValuesContainer1 {
    val semanticNeutralANegative4 = Color(parseColor("#09131aed"))
    val semanticNeutralANegative3 = Color(parseColor("#0a121ae0"))
    val semanticNeutralANegative2 = Color(parseColor("#1a232ddb"))
    val semanticNeutralANegative1 = Color(parseColor("#1d2835cc"))
    val semanticNeutralA0 = Color(parseColor("#182639bd"))
    val semanticNeutralA1 = Color(parseColor("#1830498f"))
    val semanticNeutralA2 = Color(parseColor("#0d253f66"))
    val semanticNeutralA3 = Color(parseColor("#10315633"))
    val semanticNeutralA4 = Color(parseColor("#04294321"))
    val semanticNeutralA5 = Color(parseColor("#10284717"))
    val semanticNeutralA6 = Color(parseColor("#022e500f"))
    val semanticNeutralA7 = Color(parseColor("#00295c0a"))
    val semanticNeutralA8 = Color(parseColor("#1f529e05"))
}

object InfoValuesContainer1 {
    val semanticInfoNegative4 = Color(parseColor("#041f5d"))
    val semanticInfoNegative3 = Color(parseColor("#113997"))
    val semanticInfoNegative2 = Color(parseColor("#658b6e"))
    val semanticInfoNegative1 = Color(parseColor("#ff9375"))
    val semanticInfo0 = Color(parseColor("#3061d5"))
    val semanticInfo1 = Color(parseColor("#6691f4"))
    val semanticInfo2 = Color(parseColor("#8eb0fb"))
    val semanticInfo3 = Color(parseColor("#0085ff"))
    val semanticInfo4 = Color(parseColor("#d6e3ff"))
    val semanticInfo5 = Color(parseColor("#e5eeff"))
    val semanticInfo6 = Color(parseColor("#ebf0ff"))
    val semanticInfo7 = Color(parseColor("#f5f8ff"))
    val semanticInfo8 = Color(parseColor("#fafbff"))
}

object SuccessValuesContainer3 {
    val semanticSuccessNegative4 = Color(parseColor("#0a2e0b"))
    val semanticSuccessNegative3 = Color(parseColor("#b3b7b0"))
    val semanticSuccessNegative2 = Color(parseColor("#246626"))
    val semanticSuccessNegative1 = Color(parseColor("#2f6f2f"))
    val semanticSuccess0 = Color(parseColor("#20b027"))
    val semanticSuccess1 = Color(parseColor("#55a555"))
    val semanticSuccess2 = Color(parseColor("#fdff84"))
    val semanticSuccess3 = Color(parseColor("#00ff10"))
    val semanticSuccess4 = Color(parseColor("#cff2cf"))
    val semanticSuccess5 = Color(parseColor("#dff6df"))
    val semanticSuccess6 = Color(parseColor("#e6f9e6"))
    val semanticSuccess7 = Color(parseColor("#f4fbf4"))
    val semanticSuccess8 = Color(parseColor("#fbfefb"))
}

object WarningValuesContainer1 {
    val semanticWarningNegative4 = Color(parseColor("#492909"))
    val semanticWarningNegative3 = Color(parseColor("#3f2828"))
    val semanticWarningNegative2 = Color(parseColor("#a05c1c"))
    val semanticWarningNegative1 = Color(parseColor("#b4610e"))
    val semanticWarning0 = Color(parseColor("#f59638"))
    val semanticWarning1 = Color(parseColor("#f6a351"))
    val semanticWarning2 = Color(parseColor("#feb871"))
    val semanticWarning3 = Color(parseColor("#ffd4a8"))
    val semanticWarning4 = Color(parseColor("#fcdec0"))
    val semanticWarning5 = Color(parseColor("#ffe8d1"))
    val semanticWarning6 = Color(parseColor("#fff0e0"))
    val semanticWarning7 = Color(parseColor("#fff5eb"))
    val semanticWarning8 = Color(parseColor("#fffcfa"))
}

object DangerValuesContainer5 {
    val semanticDangerNegative4 = Color(parseColor("#4a0d0d"))
    val semanticDangerNegative3 = Color(parseColor("#30723a"))
    val semanticDangerNegative2 = Color(parseColor("#63c7c3"))
    val semanticDangerNegative1 = Color(parseColor("#a13636"))
    val semanticDanger0 = Color(parseColor("#9e6610"))
    val semanticDanger1 = Color(parseColor("#285aa5"))
    val semanticDanger2 = Color(parseColor("#494b75"))
    val semanticDanger3 = Color(parseColor("#76d91c"))
    val semanticDanger4 = Color(parseColor("#d15a5a"))
    val semanticDanger5 = Color(parseColor("#fee7e7"))
    val semanticDanger6 = Color(parseColor("#ffebeb"))
    val semanticDanger7 = Color(parseColor("#fef5f5"))
    val semanticDanger8 = Color(parseColor("#fffafa"))
}

object SemanticValuesContainer1 {
    val brand = BrandValuesContainer1
    val neutral = NeutralValuesContainer5
    val neutralAlpha = NeutralAlphaValuesContainer1
    val info = InfoValuesContainer1
    val success = SuccessValuesContainer3
    val warning = WarningValuesContainer1
    val danger = DangerValuesContainer5
}

object CoolGrayValuesContainer1 {
    val negative4 = Color(parseColor("#1b242c"))
    val negative3 = Color(parseColor("#272e35"))
    val negative2 = Color(parseColor("#3a424a"))
    val negative1 = Color(parseColor("#4a545e"))
    val coolGray0 = Color(parseColor("#555f6d"))
    val coolGray1 = Color(parseColor("#7e8c9a"))
    val coolGray2 = Color(parseColor("#9ea8b3"))
    val coolGray3 = Color(parseColor("#cfd6dd"))
    val coolGray4 = Color(parseColor("#dee3e7"))
    val coolGray5 = Color(parseColor("#eaedf0"))
    val coolGray6 = Color(parseColor("#f0f3f5"))
    val coolGray7 = Color(parseColor("#f5f7f9"))
    val coolGray8 = Color(parseColor("#fcfcfd"))
}

object CoolGrayAlphaValuesContainer1 {
    val coolGrayANegative4 = Color(parseColor("#09131aed"))
    val coolGrayANegative3 = Color(parseColor("#0a121ae0"))
    val coolGrayANegative2 = Color(parseColor("#1a232ddb"))
    val coolGrayANegative1 = Color(parseColor("#1d2835cc"))
    val coolGrayA0 = Color(parseColor("#182639bd"))
    val coolGrayA1 = Color(parseColor("#1830498f"))
    val coolGrayA2 = Color(parseColor("#0d253f66"))
    val coolGrayA3 = Color(parseColor("#10315633"))
    val coolGrayA4 = Color(parseColor("#04294321"))
    val coolGrayA5 = Color(parseColor("#10284717"))
    val coolGrayA6 = Color(parseColor("#022e500f"))
    val coolGrayA7 = Color(parseColor("#00295c0a"))
    val coolGrayA8 = Color(parseColor("#1f529e05"))
}

object NeutralGrayValuesContainer1 {
    val negative4 = Color(parseColor("#212121"))
    val negative3 = Color(parseColor("#2e2e2e"))
    val negative2 = Color(parseColor("#404040"))
    val negative1 = Color(parseColor("#525252"))
    val neutralGray0 = Color(parseColor("#5e5e5e"))
    val neutralGray1 = Color(parseColor("#8a8a8a"))
    val neutralGray2 = Color(parseColor("#a6a6a6"))
    val neutralGray3 = Color(parseColor("#d6d6d6"))
    val neutralGray4 = Color(parseColor("#e3e3e3"))
    val neutralGray5 = Color(parseColor("#ebebeb"))
    val neutralGray6 = Color(parseColor("#f2f2f2"))
    val neutralGray7 = Color(parseColor("#f7f7f7"))
    val neutralGray8 = Color(parseColor("#fcfcfc"))
}

object NeutralGrayAlphaValuesContainer1 {
    val neutralGrayANegative4 = Color(parseColor("#121212ed"))
    val neutralGrayANegative3 = Color(parseColor("#0f0f0fe0"))
    val neutralGrayANegative2 = Color(parseColor("#212121db"))
    val neutralGrayANegative1 = Color(parseColor("#262626cc"))
    val neutralGrayA0 = Color(parseColor("#262627bd"))
    val neutralGrayA1 = Color(parseColor("#2b2b2b8f"))
    val neutralGrayA2 = Color(parseColor("#21212166"))
    val neutralGrayA3 = Color(parseColor("#2e2e2e33"))
    val neutralGrayA4 = Color(parseColor("#1f1f1f21"))
    val neutralGrayA5 = Color(parseColor("#1c1c1c17"))
    val neutralGrayA6 = Color(parseColor("#2121210f"))
    val neutralGrayA7 = Color(parseColor("#2e2e2e0a"))
    val neutralGrayA8 = Color(parseColor("#52525205"))
}

object WarmGrayValuesContainer1 {
    val negative4 = Color(parseColor("#222220"))
    val negative3 = Color(parseColor("#30302c"))
    val negative2 = Color(parseColor("#40403a"))
    val negative1 = Color(parseColor("#52524c"))
    val warmGray0 = Color(parseColor("#5f5f58"))
    val warmGray1 = Color(parseColor("#8b8b84"))
    val warmGray2 = Color(parseColor("#a8a89f"))
    val warmGray3 = Color(parseColor("#e3e305"))
    val warmGray4 = Color(parseColor("#e5e5e1"))
    val warmGray5 = Color(parseColor("#eaeae6"))
    val warmGray6 = Color(parseColor("#f3f3f1"))
    val warmGray7 = Color(parseColor("#f8f8f7"))
    val warmGray8 = Color(parseColor("#fdfdfc"))
}

object WarmGrayAlphaValuesContainer1 {
    val warmGrayANegative4 = Color(parseColor("#131311ed"))
    val warmGrayANegative3 = Color(parseColor("#12120de0"))
    val warmGrayANegative2 = Color(parseColor("#22221bdb"))
    val warmGrayANegative1 = Color(parseColor("#272720cc"))
    val warmGrayA0 = Color(parseColor("#26261cbd"))
    val warmGrayA1 = Color(parseColor("#2f2f238f"))
    val warmGrayA2 = Color(parseColor("#28281166"))
    val warmGrayA3 = Color(parseColor("#3e3e1d33"))
    val warmGrayA4 = Color(parseColor("#33331421"))
    val warmGrayA5 = Color(parseColor("#22220217"))
    val warmGrayA6 = Color(parseColor("#2f2f0e0f"))
    val warmGrayA7 = Color(parseColor("#2f2f2d0a"))
    val warmGrayA8 = Color(parseColor("#52525205"))
}

object WhiteAlphaValuesContainer1 {
    val whiteANegative12 = Color(parseColor("#ffffff05"))
    val whiteANegative11 = Color(parseColor("#ffffff08"))
    val whiteANegative10 = Color(parseColor("#ffffff0d"))
    val whiteANegative9 = Color(parseColor("#ffffff14"))
    val whiteANegative8 = Color(parseColor("#ffffff1a"))
    val whiteANegative7 = Color(parseColor("#ffffff1f"))
    val whiteANegative6 = Color(parseColor("#ffffff3d"))
    val whiteANegative5 = Color(parseColor("#ffffff66"))
    val whiteANegative4 = Color(parseColor("#ffffffa3"))
    val whiteANegative3 = Color(parseColor("#ffffffad"))
    val whiteANegative2 = Color(parseColor("#ffffffb8"))
    val whiteANegative1 = Color(parseColor("#ffffffd1"))
    val whiteA0 = Color(parseColor("#ffffff"))
}

object RedValuesContainer3 {
    val negative4 = Color(parseColor("#4a0d0d"))
    val negative3 = Color(parseColor("#30723a"))
    val negative2 = Color(parseColor("#63c7c3"))
    val negative1 = Color(parseColor("#a13636"))
    val red0 = Color(parseColor("#9e6610"))
    val red1 = Color(parseColor("#285aa5"))
    val red2 = Color(parseColor("#494b75"))
    val red3 = Color(parseColor("#76d91c"))
    val red4 = Color(parseColor("#d15a5a"))
    val red5 = Color(parseColor("#fee7e7"))
    val red6 = Color(parseColor("#ffebeb"))
    val red7 = Color(parseColor("#fef5f5"))
    val red8 = Color(parseColor("#fffafa"))
}

object MagentaValuesContainer3 {
    val negative4 = Color(parseColor("#410b2f"))
    val negative3 = Color(parseColor("#671e4d"))
    val negative2 = Color(parseColor("#f70aa8"))
    val negative1 = Color(parseColor("#953274"))
    val magenta0 = Color(parseColor("#91ae7a"))
    val magenta1 = Color(parseColor("#5d9ede"))
    val magenta2 = Color(parseColor("#ec89cb"))
    val magenta3 = Color(parseColor("#f7cae8"))
    val magenta4 = Color(parseColor("#fbd5ee"))
    val magenta5 = Color(parseColor("#fde2f4"))
    val magenta6 = Color(parseColor("#fdedf8"))
    val magenta7 = Color(parseColor("#fef6fb"))
    val magenta8 = Color(parseColor("#fffafd"))
}

object PurpleValuesContainer3 {
    val negative4 = Color(parseColor("#410b2f"))
    val negative3 = Color(parseColor("#5b1e67"))
    val negative2 = Color(parseColor("#792989"))
    val negative1 = Color(parseColor("#853295"))
    val purple0 = Color(parseColor("#9939ac"))
    val purple1 = Color(parseColor("#4e82ee"))
    val purple2 = Color(parseColor("#d98eec"))
    val purple3 = Color(parseColor("#c04c0d"))
    val purple4 = Color(parseColor("#f5d5fb"))
    val purple5 = Color(parseColor("#f8e2fd"))
    val purple6 = Color(parseColor("#faedfd"))
    val purple7 = Color(parseColor("#fdf5ff"))
    val purple8 = Color(parseColor("#fefaff"))
}

object VioletValuesContainer3 {
    val negative4 = Color(parseColor("#201263"))
    val negative3 = Color(parseColor("#39288a"))
    val negative2 = Color(parseColor("#161617"))
    val negative1 = Color(parseColor("#0e0406"))
    val violet0 = Color(parseColor("#634eca"))
    val violet1 = Color(parseColor("#927ef1"))
    val violet2 = Color(parseColor("#aba2fb"))
    val violet3 = Color(parseColor("#54917b"))
    val violet4 = Color(parseColor("#e3e0ff"))
    val violet5 = Color(parseColor("#eeebff"))
    val violet6 = Color(parseColor("#f3f0ff"))
    val violet7 = Color(parseColor("#f7f5ff"))
    val violet8 = Color(parseColor("#fbfaff"))
}

object BlueValuesContainer3 {
    val negative4 = Color(parseColor("#041f5d"))
    val negative3 = Color(parseColor("#113997"))
    val negative2 = Color(parseColor("#658b6e"))
    val negative1 = Color(parseColor("#ff9375"))
    val blue0 = Color(parseColor("#3061d5"))
    val blue1 = Color(parseColor("#6691f4"))
    val blue2 = Color(parseColor("#8eb0fb"))
    val blue3 = Color(parseColor("#0085ff"))
    val blue4 = Color(parseColor("#d6e3ff"))
    val blue5 = Color(parseColor("#e5eeff"))
    val blue6 = Color(parseColor("#ebf0ff"))
    val blue7 = Color(parseColor("#f5f8ff"))
    val blue8 = Color(parseColor("#fafbff"))
}

object CyanValuesContainer3 {
    val negative4 = Color(parseColor("#002742"))
    val negative3 = Color(parseColor("#0c636e"))
    val negative2 = Color(parseColor("#165c8d"))
    val negative1 = Color(parseColor("#60a0cf"))
    val cyan0 = Color(parseColor("#0870ba"))
    val cyan1 = Color(parseColor("#5699dc"))
    val cyan2 = Color(parseColor("#79bcf6"))
    val cyan3 = Color(parseColor("#c2e2ff"))
    val cyan4 = Color(parseColor("#cce7ff"))
    val cyan5 = Color(parseColor("#e0f1ff"))
    val cyan6 = Color(parseColor("#ebf5ff"))
    val cyan7 = Color(parseColor("#f0f9ff"))
    val cyan8 = Color(parseColor("#fafdff"))
}

object TealValuesContainer3 {
    val negative4 = Color(parseColor("#012a37"))
    val negative3 = Color(parseColor("#7c4fc4"))
    val negative2 = Color(parseColor("#d1d2d2"))
    val negative1 = Color(parseColor("#196c85"))
    val teal0 = Color(parseColor("#077597"))
    val teal1 = Color(parseColor("#4f9eba"))
    val teal2 = Color(parseColor("#7ac0dc"))
    val teal3 = Color(parseColor("#b8e8f5"))
    val teal4 = Color(parseColor("#c5ecf7"))
    val teal5 = Color(parseColor("#e0f3fa"))
    val teal6 = Color(parseColor("#e8f7fc"))
    val teal7 = Color(parseColor("#f0fbff"))
    val teal8 = Color(parseColor("#fafeff"))
}

object AquamarineValuesContainer3 {
    val negative4 = Color(parseColor("#012d26"))
    val negative3 = Color(parseColor("#0d4a42"))
    val negative2 = Color(parseColor("#15665b"))
    val negative1 = Color(parseColor("#1a7061"))
    val aquamarine0 = Color(parseColor("#097b68"))
    val aquamarine1 = Color(parseColor("#3da496"))
    val aquamarine2 = Color(parseColor("#6ec9bf"))
    val aquamarine4 = Color(parseColor("#c5f2ec"))
    val aquamarine3 = Color(parseColor("#bee9e4"))
    val aquamarine5 = Color(parseColor("#daf6f3"))
    val aquamarine6 = Color(parseColor("#e2f8f5"))
    val aquamarine7 = Color(parseColor("#f0faf9"))
    val aquamarine8 = Color(parseColor("#fbfefe"))
}

object GreenValuesContainer3 {
    val negative4 = Color(parseColor("#0a2e0b"))
    val negative3 = Color(parseColor("#b3b7b0"))
    val negative2 = Color(parseColor("#246626"))
    val negative1 = Color(parseColor("#2f6f2f"))
    val green0 = Color(parseColor("#20b027"))
    val green1 = Color(parseColor("#55a555"))
    val green2 = Color(parseColor("#fdff84"))
    val green3 = Color(parseColor("#00ff10"))
    val green4 = Color(parseColor("#cff2cf"))
    val green5 = Color(parseColor("#dff6df"))
    val green6 = Color(parseColor("#e6f9e6"))
    val green7 = Color(parseColor("#f4fbf4"))
    val green8 = Color(parseColor("#fbfefb"))
}

object OrangeValuesContainer3 {
    val negative4 = Color(parseColor("#492909"))
    val negative3 = Color(parseColor("#3f2828"))
    val negative2 = Color(parseColor("#a05c1c"))
    val negative1 = Color(parseColor("#b4610e"))
    val orange0 = Color(parseColor("#f59638"))
    val orange1 = Color(parseColor("#f6a351"))
    val orange2 = Color(parseColor("#feb871"))
    val orange3 = Color(parseColor("#ffd4a8"))
    val orange4 = Color(parseColor("#fcdec0"))
    val orange5 = Color(parseColor("#ffe8d1"))
    val orange6 = Color(parseColor("#fff0e0"))
    val orange7 = Color(parseColor("#fff5eb"))
    val orange8 = Color(parseColor("#fffcfa"))
}

object TransparentValuesContainer1 {
    val transparent = Color(parseColor("#ffffff00"))
}

object ColorValuesContainer1 {
    val content = ContentValuesContainer1
    val border = BorderValuesContainer2
    val background = BackgroundValuesContainer2
    val action = ActionValuesContainer1
    val interaction = InteractionValuesContainer1
    val nonSemantic = NonSemanticValuesContainer1
    val semantic = SemanticValuesContainer1
    val coolGray = CoolGrayValuesContainer1
    val coolGrayAlpha = CoolGrayAlphaValuesContainer1
    val neutralGray = NeutralGrayValuesContainer1
    val neutralGrayAlpha = NeutralGrayAlphaValuesContainer1
    val warmGray = WarmGrayValuesContainer1
    val warmGrayAlpha = WarmGrayAlphaValuesContainer1
    val whiteAlpha = WhiteAlphaValuesContainer1
    val red = RedValuesContainer3
    val magenta = MagentaValuesContainer3
    val purple = PurpleValuesContainer3
    val violet = VioletValuesContainer3
    val blue = BlueValuesContainer3
    val cyan = CyanValuesContainer3
    val teal = TealValuesContainer3
    val aquamarine = AquamarineValuesContainer3
    val green = GreenValuesContainer3
    val orange = OrangeValuesContainer3
    val transparent = TransparentValuesContainer1
}

object BorderWidthValuesContainer1 {
    val focus = 1.0
    val none = 0.0
    val small = 1.0
    val medium = 2.0
    val large = 4.0
    val xLarge = 8.0
    val borderWidth0 = 0.0
    val borderWidth100 = 1.0
    val borderWidth200 = 2.0
    val borderWidth400 = 4.0
    val borderWidth800 = 8.0
}

object BorderRadiusValuesContainer1 {
    val none = 0.0
    val small = 2.0
    val medium = 4.0
    val large = 8.0
    val xLarge = 12.0
    val borderRadius2xLarge = 16.0
    val borderRadius3xLarge = 20.0
    val borderRadius4xLarge = 24.0
    val full = 999.0
    val borderRadius0 = 0.0
    val borderRadius25 = 2.0
    val borderRadius50 = 4.0
    val borderRadius100 = 8.0
    val borderRadius150 = 12.0
    val borderRadius200 = 16.0
    val borderRadius250 = 20.0
    val borderRadius300 = 24.0
    val borderRadius999 = 999.0
}

object SizeValuesContainer1 {
    val size3xLarge = 72.0
    val size2xLarge = 64.0
    val xLarge = 56.0
    val large = 48.0
    val medium = 40.0
    val small = 32.0
    val xSmall = 24.0
    val size2xSmall = 20.0
    val size3xSmall = 16.0
}

object PaddingValuesContainer1 {
    val none = 0.0
    val padding2xSmall = 2.0
    val xSmall = 4.0
    val small = 8.0
    val medium = 12.0
    val large = 16.0
    val padding2xLarge = 24.0
    val padding3xLarge = 32.0
    val padding4xLarge = 40.0
    val padding5xLarge = 44.0
    val padding6xLarge = 64.0
}

object GapValuesContainer1 {
    val none = 0.0
    val gap2xSmall = 2.0
    val xSmall = 4.0
    val small = 8.0
    val medium = 12.0
    val large = 16.0
    val xLarge = 24.0
    val gap2xLarge = 32.0
    val gap3xLarge = 44.0
}

object SpaceValuesContainer1 {
    val padding = PaddingValuesContainer1
    val gap = GapValuesContainer1
}

object OpacityValuesContainer1 {
    val disabled = 0.5
    val opacity0 = 0.0
    val opacity50 = 0.5
    val opacity100 = 1.0
}

object CodeValuesContainer1 {
    val typographyCodeSmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 400.0, fontSize = 12.0, fontFamily = "Noto Sans Mono")
    val typographyCodeMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 400.0, fontSize = 14.0, fontFamily = "Noto Sans Mono")
    val typographyCodeLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 400.0, fontSize = 16.0, fontFamily = "Noto Sans Mono")
}

object UtilityValuesContainer1 {
    val typographyUtilitySmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 500.0, fontSize = 12.0, fontFamily = "Noto Sans")
    val typographyUtilityMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 500.0, fontSize = 14.0, fontFamily = "Noto Sans")
    val typographyUtilityLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 500.0, fontSize = 16.0, fontFamily = "Noto Sans")
}

object BodyValuesContainer1 {
    val typographyBodySmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 400.0, fontSize = 12.0, fontFamily = "Noto Sans")
    val typographyBodyMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 400.0, fontSize = 14.0, fontFamily = "Noto Sans")
    val typographyBodyLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 400.0, fontSize = 16.0, fontFamily = "Noto Sans")
}

object HeadingValuesContainer1 {
    val typographyHeadingSmall = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 700.0, fontSize = 12.0, fontFamily = "Noto Sans")
    val typographyHeadingMedium = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 700.0, fontSize = 14.0, fontFamily = "Noto Sans")
    val typographyHeadingLarge = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 700.0, fontSize = 16.0, fontFamily = "Noto Sans")
    val typographyHeadingXLarge = Typography(lineHeight = 24.0, letterSpacing = -0.014, fontWeight = 700.0, fontSize = 18.0, fontFamily = "Noto Sans")
    val typographyHeading2xLarge = Typography(lineHeight = 26.0, letterSpacing = -0.017, fontWeight = 700.0, fontSize = 20.0, fontFamily = "Noto Sans")
    val typographyHeading3xLarge = Typography(lineHeight = 32.0, letterSpacing = -0.019, fontWeight = 700.0, fontSize = 24.0, fontFamily = "Noto Sans")
    val typographyHeading4xLarge = Typography(lineHeight = 38.0, letterSpacing = -0.021, fontWeight = 700.0, fontSize = 28.0, fontFamily = "Noto Sans")
    val typographyHeading5xLarge = Typography(lineHeight = 42.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 32.0, fontFamily = "Noto Sans")
    val typographyHeading6xLarge = Typography(lineHeight = 48.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 36.0, fontFamily = "Noto Sans")
    val typographyHeading7xLarge = Typography(lineHeight = 56.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 42.0, fontFamily = "Noto Sans")
    val typographyHeading8xLarge = Typography(lineHeight = 58.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 48.0, fontFamily = "Noto Sans")
    val typographyHeading9xLarge = Typography(lineHeight = 66.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 54.0, fontFamily = "Noto Sans")
}

object DisplayValuesContainer1 {
    val typographyDisplaySmall = Typography(lineHeight = 66.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 54.0, fontFamily = "Noto Sans")
    val typographyDisplayMedium = Typography(lineHeight = 72.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 60.0, fontFamily = "Noto Sans")
    val typographyDisplayLarge = Typography(lineHeight = 82.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 68.0, fontFamily = "Noto Sans")
    val typographyDisplayXLarge = Typography(lineHeight = 92.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 76.0, fontFamily = "Noto Sans")
    val typographyDisplay2xLarge = Typography(lineHeight = 102.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 84.0, fontFamily = "Noto Sans")
    val typographyDisplay3xLarge = Typography(lineHeight = 112.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 92.0, fontFamily = "Noto Sans")
}

object TypographyValuesContainer1 {
    val code = CodeValuesContainer1
    val utility = UtilityValuesContainer1
    val body = BodyValuesContainer1
    val heading = HeadingValuesContainer1
    val display = DisplayValuesContainer1
}

object DimensionValuesContainer1 {
    val dimension0 = 0.0
    val dimension25 = 2.0
    val dimension50 = 4.0
    val dimension100 = 8.0
    val dimension150 = 12.0
    val dimension200 = 16.0
    val dimension250 = 20.0
    val dimension300 = 24.0
    val dimension400 = 32.0
    val dimension500 = 40.0
    val dimension550 = 44.0
    val dimension600 = 48.0
    val dimension700 = 56.0
    val dimension800 = 64.0
    val dimension900 = 72.0
    val dimension1000 = 80.0
    val dimension1200 = 96.0
    val dimension1500 = 120.0
    val dimension1600 = 128.0
}

object BottomValuesContainer1 {
    val elevationBottom100 = BoxShadow(y = 1.0, x = 0.0, type = "dropShadow", spread = 0.0, color = "#1b242c1f", blur = 2.0)
    val elevationBottom200 = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c14", blur = 8.0))
    val elevationBottom300 = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 8.0, x = 0.0, type = "dropShadow", spread = -2.0, color = "#1b242c1f", blur = 16.0))
    val elevationBottom400 = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 16.0, x = 0.0, type = "dropShadow", spread = -6.0, color = "#1b242c29", blur = 24.0))
}

object TopValuesContainer1 {
    val elevationTop100 = BoxShadow(y = -1.0, x = 0.0, type = "dropShadow", spread = 0.0, color = "#1b242c1f", blur = 2.0)
    val elevationTop200 = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c14", blur = 8.0))
    val elevationTop300 = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -8.0, x = 0.0, type = "dropShadow", spread = -2.0, color = "#1b242c1f", blur = 16.0))
    val elevationTop400 = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -16.0, x = 0.0, type = "dropShadow", spread = -6.0, color = "#1b242c29", blur = 24.0))
}

object ElevationValuesContainer1 {
    val bottom = BottomValuesContainer1
    val top = TopValuesContainer1
}

object FontFamilyValuesContainer1 {
    val sans = "Noto Sans"
    val serif = "Noto Serif"
    val mono = "Noto Sans Mono"
}

object FontSizeValuesContainer1 {
    val fontSize100 = 8.0
    val fontSize125 = 10.0
    val fontSize150 = 12.0
    val fontSize175 = 14.0
    val fontSize200 = 16.0
    val fontSize225 = 18.0
    val fontSize250 = 20.0
    val fontSize300 = 24.0
    val fontSize350 = 28.0
    val fontSize400 = 32.0
    val fontSize450 = 36.0
    val fontSize525 = 42.0
    val fontSize600 = 48.0
    val fontSize675 = 54.0
    val fontSize750 = 60.0
    val fontSize850 = 68.0
    val fontSize950 = 76.0
    val fontSize1050 = 84.0
    val fontSize1150 = 92.0
}

object FontWeightValuesContainer1 {
    val fontWeight300 = 300.0
    val fontWeight400 = 400.0
    val fontWeight500 = 500.0
    val fontWeight600 = 600.0
    val fontWeight700 = 700.0
}

object LetterSpacingValuesContainer1 {
    val letterSpacing0 = 0.0
    val letterSpacing100 = -0.006
    val letterSpacing200 = -0.011
    val letterSpacing300 = -0.014
    val letterSpacing400 = -0.017
    val letterSpacing500 = -0.019
    val letterSpacing600 = -0.021
    val letterSpacing700 = -0.022
}

object LineHeightValuesContainer1 {
    val value150 = 12.0
    val value200 = 16.0
    val value250 = 20.0
    val value275 = 22.0
    val value300 = 24.0
    val value325 = 26.0
    val value400 = 32.0
    val value475 = 38.0
    val value525 = 42.0
    val value600 = 48.0
    val value700 = 56.0
    val value725 = 58.0
    val value825 = 66.0
    val value900 = 72.0
    val value1025 = 82.0
    val value1150 = 92.0
    val value1275 = 102.0
    val value1400 = 112.0
}

data class Typography (
    val lineHeight: Double, 
    val letterSpacing: Double, 
    val fontWeight: Double, 
    val fontSize: Double, 
    val fontFamily: String, 
)

data class BoxShadow (
    val y: Double, 
    val x: Double, 
    val type: String, 
    val spread: Double, 
    val color: String, 
    val blur: Double, 
)