import androidx.compose.ui.unit.*
import androidx.compose.ui.graphics.Color
import android.graphics.Color.parseColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity

data class DesignSystem (
    val color : ColorValuesContainer1 = ColorValuesContainer1(), 
    val borderWidth : BorderWidthValuesContainer1 = BorderWidthValuesContainer1(), 
    val borderRadius : BorderRadiusValuesContainer1 = BorderRadiusValuesContainer1(), 
    val size : SizeValuesContainer1 = SizeValuesContainer1(), 
    val space : SpaceValuesContainer1 = SpaceValuesContainer1(), 
    val opacity : OpacityValuesContainer1 = OpacityValuesContainer1(), 
    val typography : TypographyValuesContainer1 = TypographyValuesContainer1(), 
    val dimension : DimensionValuesContainer1 = DimensionValuesContainer1(), 
    val elevation : ElevationValuesContainer1 = ElevationValuesContainer1(), 
    val fontFamily : FontFamilyValuesContainer1 = FontFamilyValuesContainer1(), 
    val fontSize : FontSizeValuesContainer1 = FontSizeValuesContainer1(), 
    val fontWeight : FontWeightValuesContainer1 = FontWeightValuesContainer1(), 
    val letterSpacing : LetterSpacingValuesContainer1 = LetterSpacingValuesContainer1(), 
    val lineHeight : LineHeightValuesContainer1 = LineHeightValuesContainer1(), 
)

data class ContentValuesContainer (
    val primary : Color = Color(parseColor("#272e35")), 
    val secondary : Color = Color(parseColor("#555f6d")), 
    val tertiary : Color = Color(parseColor("#7e8c9a")), 
    val disabled : Color = Color(parseColor("#9ea8b3")), 
    val primaryInverse : Color = Color(parseColor("#ffffff")), 
    val secondaryInverse : Color = Color(parseColor("#ffffffa3")), 
    val tertiaryInverse : Color = Color(parseColor("#ffffff66")), 
    val disabledInverse : Color = Color(parseColor("#ffffff3d")), 
    val infoPrimary : Color = Color(parseColor("#113997")), 
    val infoSecondary : Color = Color(parseColor("#3061d5")), 
    val successPrimary : Color = Color(parseColor("#b3b7b0")), 
    val successSecondary : Color = Color(parseColor("#2e3e58")), 
    val warningPrimary : Color = Color(parseColor("#3f2828")), 
    val warningSecondary : Color = Color(parseColor("#f59638")), 
    val dangerPrimary : Color = Color(parseColor("#30723a")), 
    val dangerSecondary : Color = Color(parseColor("#9e6610")), 
    val brandPrimary : Color = Color(parseColor("#113997")), 
    val brandSecondary : Color = Color(parseColor("#3061d5")), 
)

data class BorderValuesContainer (
    val default : Color = Color(parseColor("#eaedf0")), 
    val defaultA : Color = Color(parseColor("#10284717")), 
    val inverse : Color = Color(parseColor("#ffffff")), 
    val neutralStrong : Color = Color(parseColor("#555f6d")), 
    val neutralSubtle : Color = Color(parseColor("#cfd6dd")), 
    val infoStrong : Color = Color(parseColor("#3061d5")), 
    val infoSubtle : Color = Color(parseColor("#e30404")), 
    val successStrong : Color = Color(parseColor("#2e3e58")), 
    val successSubtle : Color = Color(parseColor("#0005ff")), 
    val warningStrong : Color = Color(parseColor("#f59638")), 
    val warningSubtle : Color = Color(parseColor("#ffd4a8")), 
    val dangerStrong : Color = Color(parseColor("#9e6610")), 
    val dangerSubtle : Color = Color(parseColor("#76d91c")), 
)

data class BackgroundValuesContainer (
    val default : Color = Color(parseColor("#ffffff")), 
    val inverse : Color = Color(parseColor("#272e35")), 
    val neutralStrong : Color = Color(parseColor("#555f6d")), 
    val neutralMuted : Color = Color(parseColor("#dee3e7")), 
    val neutralOnSubtle : Color = Color(parseColor("#eaedf0")), 
    val neutralSubtle : Color = Color(parseColor("#f5f7f9")), 
    val neutralSurface : Color = Color(parseColor("#fcfcfd")), 
    val infoStrong : Color = Color(parseColor("#3061d5")), 
    val infoMuted : Color = Color(parseColor("#d6e3ff")), 
    val infoOnSubtle : Color = Color(parseColor("#e5eeff")), 
    val infoSubtle : Color = Color(parseColor("#f5f8ff")), 
    val infoSurface : Color = Color(parseColor("#fafbff")), 
    val successStrong : Color = Color(parseColor("#2e3e58")), 
    val successMuted : Color = Color(parseColor("#cff2cf")), 
    val successOnSubtle : Color = Color(parseColor("#dff6df")), 
    val successSubtle : Color = Color(parseColor("#f4fbf4")), 
    val successSurface : Color = Color(parseColor("#fbfefb")), 
    val warningStrong : Color = Color(parseColor("#f59638")), 
    val warningMuted : Color = Color(parseColor("#fcdec0")), 
    val warningOnSubtle : Color = Color(parseColor("#ffe8d1")), 
    val warningSubtle : Color = Color(parseColor("#fff5eb")), 
    val warningSurface : Color = Color(parseColor("#fffcfa")), 
    val dangerStrong : Color = Color(parseColor("#9e6610")), 
    val dangerMuted : Color = Color(parseColor("#d15a5a")), 
    val dangerOnSubtle : Color = Color(parseColor("#fee7e7")), 
    val dangerSubtle : Color = Color(parseColor("#fef5f5")), 
    val dangerSurface : Color = Color(parseColor("#fffafa")), 
    val brandStrong : Color = Color(parseColor("#3061d5")), 
    val brandMuted : Color = Color(parseColor("#d6e3ff")), 
    val brandOnSubtle : Color = Color(parseColor("#e5eeff")), 
    val brandSurface : Color = Color(parseColor("#fafbff")), 
    val brandSubtle : Color = Color(parseColor("#f5f8ff")), 
)

data class PrimaryValuesContainer (
    val actionPrimaryNormal : Color = Color(parseColor("#3061d5")), 
    val actionPrimaryHover : Color = Color(parseColor("#658b6e")), 
    val actionPrimaryActive : Color = Color(parseColor("#113997")), 
    val actionPrimarySelected : Color = Color(parseColor("#658b6e")), 
    val actionPrimarySubtleNormal : Color = Color(parseColor("#ebf0ff")), 
    val actionPrimarySubtleHover : Color = Color(parseColor("#e5eeff")), 
    val actionPrimarySubtleActive : Color = Color(parseColor("#e30404")), 
    val actionPrimarySubtleSelected : Color = Color(parseColor("#e5eeff")), 
)

data class NeutralValuesContainer (
    val actionNeutralNormal : Color = Color(parseColor("#4a545e")), 
    val actionNeutralHover : Color = Color(parseColor("#3a424a")), 
    val actionNeutralActive : Color = Color(parseColor("#272e35")), 
    val actionNeutralSelected : Color = Color(parseColor("#3a424a")), 
    val actionNeutralSubtleNormal : Color = Color(parseColor("#f0f3f5")), 
    val actionNeutralSubtleHover : Color = Color(parseColor("#eaedf0")), 
    val actionNeutralSubtleActive : Color = Color(parseColor("#cfd6dd")), 
    val actionNeutralSubtleSelected : Color = Color(parseColor("#eaedf0")), 
)

data class SuccessValuesContainer (
    val actionSuccessNormal : Color = Color(parseColor("#2e3e58")), 
    val actionSuccessHover : Color = Color(parseColor("#246626")), 
    val actionSuccessActive : Color = Color(parseColor("#b3b7b0")), 
    val actionSuccessSelected : Color = Color(parseColor("#246626")), 
    val actionSuccessSubtleNormal : Color = Color(parseColor("#e6f9e6")), 
    val actionSuccessSubtleHover : Color = Color(parseColor("#dff6df")), 
    val actionSuccessSubtleActive : Color = Color(parseColor("#0005ff")), 
    val actionSuccessSubtleSelected : Color = Color(parseColor("#dff6df")), 
)

data class DangerValuesContainer (
    val actionDangerNormal : Color = Color(parseColor("#9e6610")), 
    val actionDangerHover : Color = Color(parseColor("#63c7c3")), 
    val actionDangerActive : Color = Color(parseColor("#30723a")), 
    val actionDangerSelected : Color = Color(parseColor("#63c7c3")), 
    val actionDangerSubtleNormal : Color = Color(parseColor("#ffebeb")), 
    val actionDangerSubtleHover : Color = Color(parseColor("#fee7e7")), 
    val actionDangerSubtleActive : Color = Color(parseColor("#76d91c")), 
    val actionDangerSubtleSelected : Color = Color(parseColor("#fee7e7")), 
)

data class GhostValuesContainer (
    val actionGhostNormal : Color = Color(parseColor("#ffffff00")), 
    val actionGhostHover : Color = Color(parseColor("#022e500f")), 
    val actionGhostActive : Color = Color(parseColor("#10284717")), 
    val actionGhostSelected : Color = Color(parseColor("#022e500f")), 
    val actionGhostInverseHover : Color = Color(parseColor("#ffffff1a")), 
    val actionGhostInverseActive : Color = Color(parseColor("#ffffff1f")), 
    val actionGhostInverseSelected : Color = Color(parseColor("#ffffff1a")), 
    val actionGhostDangerHover : Color = Color(parseColor("#ffebeb")), 
    val actionGhostDangerActive : Color = Color(parseColor("#fee7e7")), 
    val actionGhostDangerSelected : Color = Color(parseColor("#ffebeb")), 
)

data class OutlineValuesContainer (
    val actionOutlineNormal : Color = Color(parseColor("#cfd6dd")), 
    val actionOutlineHover : Color = Color(parseColor("#9ea8b3")), 
    val actionOutlineActive : Color = Color(parseColor("#7e8c9a")), 
    val actionOutlineSelected : Color = Color(parseColor("#9ea8b3")), 
)

data class InverseValuesContainer (
    val actionInverseNormal : Color = Color(parseColor("#ffffff")), 
    val actionInverseHover : Color = Color(parseColor("#ffffffd1")), 
    val actionInverseActive : Color = Color(parseColor("#ffffffb8")), 
    val actionInverseSelected : Color = Color(parseColor("#ffffffd1")), 
)

data class ReverseInverseValuesContainer (
    val actionReverseInverseNormal : Color = Color(parseColor("#0a121ae0")), 
    val actionReverseInverseHover : Color = Color(parseColor("#1d2835cc")), 
    val actionReverseInverseActive : Color = Color(parseColor("#182639bd")), 
    val actionReverseInverseSelected : Color = Color(parseColor("#1d2835cc")), 
)

data class ActionValuesContainer (
    val primary : PrimaryValuesContainer = PrimaryValuesContainer(), 
    val neutral : NeutralValuesContainer = NeutralValuesContainer(), 
    val success : SuccessValuesContainer = SuccessValuesContainer(), 
    val danger : DangerValuesContainer = DangerValuesContainer(), 
    val ghost : GhostValuesContainer = GhostValuesContainer(), 
    val outline : OutlineValuesContainer = OutlineValuesContainer(), 
    val inverse : InverseValuesContainer = InverseValuesContainer(), 
    val reverseInverse : ReverseInverseValuesContainer = ReverseInverseValuesContainer(), 
)

data class DefaultValuesContainer (
    val interactionDefaultNormal : Color = Color(parseColor("#3061d5")), 
    val interactionDefaultHover : Color = Color(parseColor("#658b6e")), 
    val interactionDefaultActive : Color = Color(parseColor("#113997")), 
    val interactionDefaultSelected : Color = Color(parseColor("#658b6e")), 
    val interactionDefaultSubtleNormal : Color = Color(parseColor("#ebf0ff")), 
    val interactionDefaultSubtleHover : Color = Color(parseColor("#e5eeff")), 
    val interactionDefaultSubtleActive : Color = Color(parseColor("#e30404")), 
    val interactionDefaultSubtleSelected : Color = Color(parseColor("#e5eeff")), 
)

data class NeutralValuesContainer1 (
    val interactionNeutralNormal : Color = Color(parseColor("#4a545e")), 
    val interactionNeutralHover : Color = Color(parseColor("#3a424a")), 
    val interactionNeutralActive : Color = Color(parseColor("#272e35")), 
    val interactionNeutralSelected : Color = Color(parseColor("#3a424a")), 
    val interactionNeutralSubtleNormal : Color = Color(parseColor("#f0f3f5")), 
    val interactionNeutralSubtleHover : Color = Color(parseColor("#eaedf0")), 
    val interactionNeutralSubtleActive : Color = Color(parseColor("#cfd6dd")), 
    val interactionNeutralSubtleSelected : Color = Color(parseColor("#eaedf0")), 
)

data class DangerValuesContainer1 (
    val interactionDangerNormal : Color = Color(parseColor("#9e6610")), 
    val interactionDangerHover : Color = Color(parseColor("#63c7c3")), 
    val interactionDangerActive : Color = Color(parseColor("#30723a")), 
    val interactionDangerSelected : Color = Color(parseColor("#63c7c3")), 
    val interactionDangerSubtleNormal : Color = Color(parseColor("#ffebeb")), 
    val interactionDangerSubtleHover : Color = Color(parseColor("#fee7e7")), 
    val interactionDangerSubtleActive : Color = Color(parseColor("#76d91c")), 
    val interactionDangerSubtleSelected : Color = Color(parseColor("#fee7e7")), 
)

data class GhostValuesContainer1 (
    val interactionGhostNormal : Color = Color(parseColor("#ffffff00")), 
    val interactionGhostHover : Color = Color(parseColor("#022e500f")), 
    val interactionGhostActive : Color = Color(parseColor("#10284717")), 
    val interactionGhostSelected : Color = Color(parseColor("#022e500f")), 
    val interactionGhostInverseHover : Color = Color(parseColor("#ffffff1a")), 
    val interactionGhostInverseNormal : Color = Color(parseColor("#ffffff1f")), 
    val interactionGhostInverseSelected : Color = Color(parseColor("#ffffff1a")), 
    val interactionGhostDangerHover : Color = Color(parseColor("#ffebeb")), 
    val interactionGhostDangerNormal : Color = Color(parseColor("#fee7e7")), 
    val interactionGhostDangerSelected : Color = Color(parseColor("#ffebeb")), 
)

data class DisabledValuesContainer (
    val interactionDisabledNormal : Color = Color(parseColor("#9ea8b3")), 
    val interactionDisabledHover : Color = Color(parseColor("#7e8c9a")), 
    val interactionDisabledActive : Color = Color(parseColor("#555f6d")), 
    val interactionDisabledSubtleNormal : Color = Color(parseColor("#eaedf0")), 
    val interactionDisabledSubtleHover : Color = Color(parseColor("#dee3e7")), 
    val interactionDisabledSubtleActive : Color = Color(parseColor("#cfd6dd")), 
)

data class BorderValuesContainer1 (
    val interactionBorderNormal : Color = Color(parseColor("#8eb0fb")), 
    val interactionBorderHover : Color = Color(parseColor("#6691f4")), 
    val interactionBorderActive : Color = Color(parseColor("#ff9375")), 
    val interactionBorderSelected : Color = Color(parseColor("#3061d5")), 
    val interactionBorderNeutralNormal : Color = Color(parseColor("#cfd6dd")), 
    val interactionBorderNeutralHover : Color = Color(parseColor("#9ea8b3")), 
    val interactionBorderNeutralActive : Color = Color(parseColor("#7e8c9a")), 
    val interactionBorderNeutralSelected : Color = Color(parseColor("#9ea8b3")), 
    val interactionBorderDanger : Color = Color(parseColor("#285aa5")), 
)

data class BackgroundValuesContainer1 (
    val interactionBackgroundModal : Color = Color(parseColor("#ffffff")), 
    val interactionBackgroundModeless : Color = Color(parseColor("#ffffff")), 
    val interactionBackgroundModelessInverse : Color = Color(parseColor("#272e35")), 
    val interactionBackgroundSidepanel : Color = Color(parseColor("#ffffff")), 
    val interactionBackgroundFormField : Color = Color(parseColor("#ffffff")), 
    val interactionBackgroundDimmer : Color = Color(parseColor("#182639bd")), 
)

data class InverseValuesContainer1 (
    val interactionInverseNormal : Color = Color(parseColor("#ffffff")), 
    val interactionInverseHover : Color = Color(parseColor("#ffffffd1")), 
    val interactionInverseActive : Color = Color(parseColor("#ffffffb8")), 
    val interactionInverseSelected : Color = Color(parseColor("#ffffffd1")), 
)

data class FocusValuesContainer (
    val interactionFocusDefault : Color = Color(parseColor("#6691f4")), 
)

data class InteractionValuesContainer (
    val default : DefaultValuesContainer = DefaultValuesContainer(), 
    val neutral : NeutralValuesContainer1 = NeutralValuesContainer1(), 
    val danger : DangerValuesContainer1 = DangerValuesContainer1(), 
    val ghost : GhostValuesContainer1 = GhostValuesContainer1(), 
    val disabled : DisabledValuesContainer = DisabledValuesContainer(), 
    val border : BorderValuesContainer1 = BorderValuesContainer1(), 
    val background : BackgroundValuesContainer1 = BackgroundValuesContainer1(), 
    val inverse : InverseValuesContainer1 = InverseValuesContainer1(), 
    val focus : FocusValuesContainer = FocusValuesContainer(), 
)

data class GrayValuesContainer (
    val nonSemanticGrayContentPrimary : Color = Color(parseColor("#272e35")), 
    val nonSemanticGrayContentSecondary : Color = Color(parseColor("#555f6d")), 
    val nonSemanticGrayBorderDefault : Color = Color(parseColor("#eaedf0")), 
    val nonSemanticGrayBorderStrong : Color = Color(parseColor("#555f6d")), 
    val nonSemanticGrayBorderSubtle : Color = Color(parseColor("#cfd6dd")), 
    val nonSemanticGrayBackgroundStrong : Color = Color(parseColor("#555f6d")), 
    val nonSemanticGrayBackgroundMuted : Color = Color(parseColor("#dee3e7")), 
    val nonSemanticGrayBackgroundOnSubtle : Color = Color(parseColor("#eaedf0")), 
    val nonSemanticGrayBackgroundSubtle : Color = Color(parseColor("#f5f7f9")), 
    val nonSemanticGrayBackgroundSurface : Color = Color(parseColor("#fcfcfd")), 
)

data class WhiteValuesContainer (
    val nonSemanticWhiteContentPrimary : Color = Color(parseColor("#ffffff")), 
    val nonSemanticWhiteContentSecondary : Color = Color(parseColor("#ffffffa3")), 
    val nonSemanticWhiteBorderDefault : Color = Color(parseColor("#ffffff66")), 
    val nonSemanticWhiteBorderStrong : Color = Color(parseColor("#ffffff")), 
    val nonSemanticWhiteBorderSubtle : Color = Color(parseColor("#ffffffad")), 
    val nonSemanticWhiteBackgroundStrong : Color = Color(parseColor("#ffffff")), 
    val nonSemanticWhiteBackgroundMuted : Color = Color(parseColor("#ffffffa3")), 
    val nonSemanticWhiteBackgroundOnSubtle : Color = Color(parseColor("#ffffff66")), 
    val nonSemanticWhiteBackgroundSubtle : Color = Color(parseColor("#ffffff1f")), 
    val nonSemanticWhiteBackgroundSurface : Color = Color(parseColor("#ffffff1a")), 
)

data class RedValuesContainer (
    val nonSemanticRedContentPrimary : Color = Color(parseColor("#30723a")), 
    val nonSemanticRedContentSecondary : Color = Color(parseColor("#9e6610")), 
    val nonSemanticRedBorderDefault : Color = Color(parseColor("#fee7e7")), 
    val nonSemanticRedBorderStrong : Color = Color(parseColor("#9e6610")), 
    val nonSemanticRedBorderSubtle : Color = Color(parseColor("#76d91c")), 
    val nonSemanticRedBackgroundStrong : Color = Color(parseColor("#9e6610")), 
    val nonSemanticRedBackgroundMuted : Color = Color(parseColor("#d15a5a")), 
    val nonSemanticRedBackgroundOnSubtle : Color = Color(parseColor("#fee7e7")), 
    val nonSemanticRedBackgroundSubtle : Color = Color(parseColor("#fef5f5")), 
    val nonSemanticRedBackgroundSurface : Color = Color(parseColor("#fffafa")), 
)

data class MagentaValuesContainer (
    val nonSemanticMagentaContentPrimary : Color = Color(parseColor("#671e4d")), 
    val nonSemanticMagentaContentSecondary : Color = Color(parseColor("#91ae7a")), 
    val nonSemanticMagentaBorderDefault : Color = Color(parseColor("#fde2f4")), 
    val nonSemanticMagentaBorderStrong : Color = Color(parseColor("#91ae7a")), 
    val nonSemanticMagentaBorderSubtle : Color = Color(parseColor("#f7cae8")), 
    val nonSemanticMagentaBackgroundStrong : Color = Color(parseColor("#91ae7a")), 
    val nonSemanticMagentaBackgroundMuted : Color = Color(parseColor("#fbd5ee")), 
    val nonSemanticMagentaBackgroundOnSubtle : Color = Color(parseColor("#fde2f4")), 
    val nonSemanticMagentaBackgroundSubtle : Color = Color(parseColor("#fef6fb")), 
    val nonSemanticMagentaBackgroundSurface : Color = Color(parseColor("#fffafd")), 
)

data class PurpleValuesContainer (
    val nonSemanticPurpleContentPrimary : Color = Color(parseColor("#5b1e67")), 
    val nonSemanticPurpleContentSecondary : Color = Color(parseColor("#9939ac")), 
    val nonSemanticPurpleBorderDefault : Color = Color(parseColor("#f8e2fd")), 
    val nonSemanticPurpleBorderStrong : Color = Color(parseColor("#9939ac")), 
    val nonSemanticPurpleBorderSubtle : Color = Color(parseColor("#c04c0d")), 
    val nonSemanticPurpleBackgroundStrong : Color = Color(parseColor("#9939ac")), 
    val nonSemanticPurpleBackgroundMuted : Color = Color(parseColor("#f5d5fb")), 
    val nonSemanticPurpleBackgroundOnSubtle : Color = Color(parseColor("#f8e2fd")), 
    val nonSemanticPurpleBackgroundSubtle : Color = Color(parseColor("#fdf5ff")), 
    val nonSemanticPurpleBackgroundSurface : Color = Color(parseColor("#fefaff")), 
)

data class VioletValuesContainer (
    val nonSemanticVioletContentPrimary : Color = Color(parseColor("#39288a")), 
    val nonSemanticVioletContentSecondary : Color = Color(parseColor("#634eca")), 
    val nonSemanticVioletBorderDefault : Color = Color(parseColor("#eeebff")), 
    val nonSemanticVioletBorderStrong : Color = Color(parseColor("#634eca")), 
    val nonSemanticVioletBorderSubtle : Color = Color(parseColor("#54917b")), 
    val nonSemanticVioletBackgroundStrong : Color = Color(parseColor("#634eca")), 
    val nonSemanticVioletBackgroundMuted : Color = Color(parseColor("#e3e0ff")), 
    val nonSemanticVioletBackgroundOnSubtle : Color = Color(parseColor("#eeebff")), 
    val nonSemanticVioletBackgroundSubtle : Color = Color(parseColor("#f7f5ff")), 
    val nonSemanticVioletBackgroundSurface : Color = Color(parseColor("#fbfaff")), 
)

data class BlueValuesContainer (
    val nonSemanticBlueContentPrimary : Color = Color(parseColor("#113997")), 
    val nonSemanticBlueContentSecondary : Color = Color(parseColor("#3061d5")), 
    val nonSemanticBlueBorderDefault : Color = Color(parseColor("#e5eeff")), 
    val nonSemanticBlueBorderStrong : Color = Color(parseColor("#3061d5")), 
    val nonSemanticBlueBorderSubtle : Color = Color(parseColor("#e30404")), 
    val nonSemanticBlueBackgroundStrong : Color = Color(parseColor("#3061d5")), 
    val nonSemanticBlueBackgroundMuted : Color = Color(parseColor("#d6e3ff")), 
    val nonSemanticBlueBackgroundOnSubtle : Color = Color(parseColor("#e5eeff")), 
    val nonSemanticBlueBackgroundSubtle : Color = Color(parseColor("#f5f8ff")), 
    val nonSemanticBlueBackgroundSurface : Color = Color(parseColor("#fafbff")), 
)

data class CyanValuesContainer (
    val nonSemanticCyanContentPrimary : Color = Color(parseColor("#0c636e")), 
    val nonSemanticCyanContentSecondary : Color = Color(parseColor("#0870ba")), 
    val nonSemanticCyanBorderDefault : Color = Color(parseColor("#e0f1ff")), 
    val nonSemanticCyanBorderStrong : Color = Color(parseColor("#0870ba")), 
    val nonSemanticCyanBorderSubtle : Color = Color(parseColor("#c2e2ff")), 
    val nonSemanticCyanBackgroundStrong : Color = Color(parseColor("#0870ba")), 
    val nonSemanticCyanBackgroundMuted : Color = Color(parseColor("#cce7ff")), 
    val nonSemanticCyanBackgroundOnSubtle : Color = Color(parseColor("#e0f1ff")), 
    val nonSemanticCyanBackgroundSubtle : Color = Color(parseColor("#f0f9ff")), 
    val nonSemanticCyanBackgroundSurface : Color = Color(parseColor("#fafdff")), 
)

data class TealValuesContainer (
    val nonSemanticTealContentPrimary : Color = Color(parseColor("#7c4fc4")), 
    val nonSemanticTealContentSecondary : Color = Color(parseColor("#077597")), 
    val nonSemanticTealBorderDefault : Color = Color(parseColor("#e0f3fa")), 
    val nonSemanticTealBorderStrong : Color = Color(parseColor("#077597")), 
    val nonSemanticTealBorderSubtle : Color = Color(parseColor("#b8e8f5")), 
    val nonSemanticTealBackgroundStrong : Color = Color(parseColor("#077597")), 
    val nonSemanticTealBackgroundMuted : Color = Color(parseColor("#c5ecf7")), 
    val nonSemanticTealBackgroundOnSubtle : Color = Color(parseColor("#e0f3fa")), 
    val nonSemanticTealBackgroundSubtle : Color = Color(parseColor("#f0fbff")), 
    val nonSemanticTealBackgroundSurface : Color = Color(parseColor("#fafeff")), 
)

data class AquamarineValuesContainer (
    val nonSemanticAquamarineContentPrimary : Color = Color(parseColor("#0d4a42")), 
    val nonSemanticAquamarineContentSecondary : Color = Color(parseColor("#097b68")), 
    val nonSemanticAquamarineBorderDefault : Color = Color(parseColor("#daf6f3")), 
    val nonSemanticAquamarineBorderStrong : Color = Color(parseColor("#097b68")), 
    val nonSemanticAquamarineBorderSubtle : Color = Color(parseColor("#bee9e4")), 
    val nonSemanticAquamarineBackgroundStrong : Color = Color(parseColor("#097b68")), 
    val nonSemanticAquamarineBackgroundMuted : Color = Color(parseColor("#c5f2ec")), 
    val nonSemanticAquamarineBackgroundOnSubtle : Color = Color(parseColor("#daf6f3")), 
    val nonSemanticAquamarineBackgroundSubtle : Color = Color(parseColor("#f0faf9")), 
    val nonSemanticAquamarineBackgroundSurface : Color = Color(parseColor("#fbfefe")), 
)

data class GreenValuesContainer (
    val nonSemanticGreenContentPrimary : Color = Color(parseColor("#b3b7b0")), 
    val nonSemanticGreenContentSecondary : Color = Color(parseColor("#2e3e58")), 
    val nonSemanticGreenBorderDefault : Color = Color(parseColor("#dff6df")), 
    val nonSemanticGreenBorderStrong : Color = Color(parseColor("#2e3e58")), 
    val nonSemanticGreenBorderSubtle : Color = Color(parseColor("#0005ff")), 
    val nonSemanticGreenBackgroundStrong : Color = Color(parseColor("#2e3e58")), 
    val nonSemanticGreenBackgroundMuted : Color = Color(parseColor("#cff2cf")), 
    val nonSemanticGreenBackgroundOnSubtle : Color = Color(parseColor("#dff6df")), 
    val nonSemanticGreenBackgroundSubtle : Color = Color(parseColor("#f4fbf4")), 
    val nonSemanticGreenBackgroundSurface : Color = Color(parseColor("#fbfefb")), 
)

data class OrangeValuesContainer (
    val nonSemanticOrangeContentPrimary : Color = Color(parseColor("#3f2828")), 
    val nonSemanticOrangeContentSecondary : Color = Color(parseColor("#f59638")), 
    val nonSemanticOrangeBorderDefault : Color = Color(parseColor("#ffe8d1")), 
    val nonSemanticOrangeBorderStrong : Color = Color(parseColor("#f59638")), 
    val nonSemanticOrangeBorderSubtle : Color = Color(parseColor("#ffd4a8")), 
    val nonSemanticOrangeBackgroundStrong : Color = Color(parseColor("#f59638")), 
    val nonSemanticOrangeBackgroundMuted : Color = Color(parseColor("#fcdec0")), 
    val nonSemanticOrangeBackgroundOnSubtle : Color = Color(parseColor("#ffe8d1")), 
    val nonSemanticOrangeBackgroundSubtle : Color = Color(parseColor("#fff5eb")), 
    val nonSemanticOrangeBackgroundSurface : Color = Color(parseColor("#fffcfa")), 
)

data class NonSemanticValuesContainer (
    val gray : GrayValuesContainer = GrayValuesContainer(), 
    val white : WhiteValuesContainer = WhiteValuesContainer(), 
    val red : RedValuesContainer = RedValuesContainer(), 
    val magenta : MagentaValuesContainer = MagentaValuesContainer(), 
    val purple : PurpleValuesContainer = PurpleValuesContainer(), 
    val violet : VioletValuesContainer = VioletValuesContainer(), 
    val blue : BlueValuesContainer = BlueValuesContainer(), 
    val cyan : CyanValuesContainer = CyanValuesContainer(), 
    val teal : TealValuesContainer = TealValuesContainer(), 
    val aquamarine : AquamarineValuesContainer = AquamarineValuesContainer(), 
    val green : GreenValuesContainer = GreenValuesContainer(), 
    val orange : OrangeValuesContainer = OrangeValuesContainer(), 
)

data class BrandValuesContainer (
    val semanticBrandNegative4 : Color = Color(parseColor("#041f5d")), 
    val semanticBrandNegative3 : Color = Color(parseColor("#113997")), 
    val semanticBrandNegative2 : Color = Color(parseColor("#658b6e")), 
    val semanticBrandNegative1 : Color = Color(parseColor("#ff9375")), 
    val semanticBrand0 : Color = Color(parseColor("#3061d5")), 
    val semanticBrand1 : Color = Color(parseColor("#6691f4")), 
    val semanticBrand2 : Color = Color(parseColor("#8eb0fb")), 
    val semanticBrand3 : Color = Color(parseColor("#e30404")), 
    val semanticBrand4 : Color = Color(parseColor("#d6e3ff")), 
    val semanticBrand5 : Color = Color(parseColor("#e5eeff")), 
    val semanticBrand6 : Color = Color(parseColor("#ebf0ff")), 
    val semanticBrand7 : Color = Color(parseColor("#f5f8ff")), 
    val semanticBrand8 : Color = Color(parseColor("#fafbff")), 
)

data class NeutralValuesContainer2 (
    val semanticNeutralNegative4 : Color = Color(parseColor("#1b242c")), 
    val semanticNeutralNegative3 : Color = Color(parseColor("#272e35")), 
    val semanticNeutralNegative2 : Color = Color(parseColor("#3a424a")), 
    val semanticNeutralNegative1 : Color = Color(parseColor("#4a545e")), 
    val semanticNeutral0 : Color = Color(parseColor("#555f6d")), 
    val semanticNeutral1 : Color = Color(parseColor("#7e8c9a")), 
    val semanticNeutral2 : Color = Color(parseColor("#9ea8b3")), 
    val semanticNeutral3 : Color = Color(parseColor("#cfd6dd")), 
    val semanticNeutral4 : Color = Color(parseColor("#dee3e7")), 
    val semanticNeutral5 : Color = Color(parseColor("#eaedf0")), 
    val semanticNeutral6 : Color = Color(parseColor("#f0f3f5")), 
    val semanticNeutral7 : Color = Color(parseColor("#f5f7f9")), 
    val semanticNeutral8 : Color = Color(parseColor("#fcfcfd")), 
)

data class NeutralAlphaValuesContainer (
    val semanticNeutralANegative4 : Color = Color(parseColor("#09131aed")), 
    val semanticNeutralANegative3 : Color = Color(parseColor("#0a121ae0")), 
    val semanticNeutralANegative2 : Color = Color(parseColor("#1a232ddb")), 
    val semanticNeutralANegative1 : Color = Color(parseColor("#1d2835cc")), 
    val semanticNeutralA0 : Color = Color(parseColor("#182639bd")), 
    val semanticNeutralA1 : Color = Color(parseColor("#1830498f")), 
    val semanticNeutralA2 : Color = Color(parseColor("#0d253f66")), 
    val semanticNeutralA3 : Color = Color(parseColor("#10315633")), 
    val semanticNeutralA4 : Color = Color(parseColor("#04294321")), 
    val semanticNeutralA5 : Color = Color(parseColor("#10284717")), 
    val semanticNeutralA6 : Color = Color(parseColor("#022e500f")), 
    val semanticNeutralA7 : Color = Color(parseColor("#00295c0a")), 
    val semanticNeutralA8 : Color = Color(parseColor("#1f529e05")), 
)

data class InfoValuesContainer (
    val semanticInfoNegative4 : Color = Color(parseColor("#041f5d")), 
    val semanticInfoNegative3 : Color = Color(parseColor("#113997")), 
    val semanticInfoNegative2 : Color = Color(parseColor("#658b6e")), 
    val semanticInfoNegative1 : Color = Color(parseColor("#ff9375")), 
    val semanticInfo0 : Color = Color(parseColor("#3061d5")), 
    val semanticInfo1 : Color = Color(parseColor("#6691f4")), 
    val semanticInfo2 : Color = Color(parseColor("#8eb0fb")), 
    val semanticInfo3 : Color = Color(parseColor("#e30404")), 
    val semanticInfo4 : Color = Color(parseColor("#d6e3ff")), 
    val semanticInfo5 : Color = Color(parseColor("#e5eeff")), 
    val semanticInfo6 : Color = Color(parseColor("#ebf0ff")), 
    val semanticInfo7 : Color = Color(parseColor("#f5f8ff")), 
    val semanticInfo8 : Color = Color(parseColor("#fafbff")), 
)

data class SuccessValuesContainer1 (
    val semanticSuccessNegative4 : Color = Color(parseColor("#0a2e0b")), 
    val semanticSuccessNegative3 : Color = Color(parseColor("#b3b7b0")), 
    val semanticSuccessNegative2 : Color = Color(parseColor("#246626")), 
    val semanticSuccessNegative1 : Color = Color(parseColor("#2f6f2f")), 
    val semanticSuccess0 : Color = Color(parseColor("#2e3e58")), 
    val semanticSuccess1 : Color = Color(parseColor("#55a555")), 
    val semanticSuccess2 : Color = Color(parseColor("#fdff84")), 
    val semanticSuccess3 : Color = Color(parseColor("#0005ff")), 
    val semanticSuccess4 : Color = Color(parseColor("#cff2cf")), 
    val semanticSuccess5 : Color = Color(parseColor("#dff6df")), 
    val semanticSuccess6 : Color = Color(parseColor("#e6f9e6")), 
    val semanticSuccess7 : Color = Color(parseColor("#f4fbf4")), 
    val semanticSuccess8 : Color = Color(parseColor("#fbfefb")), 
)

data class WarningValuesContainer (
    val semanticWarningNegative4 : Color = Color(parseColor("#492909")), 
    val semanticWarningNegative3 : Color = Color(parseColor("#3f2828")), 
    val semanticWarningNegative2 : Color = Color(parseColor("#a05c1c")), 
    val semanticWarningNegative1 : Color = Color(parseColor("#b4610e")), 
    val semanticWarning0 : Color = Color(parseColor("#f59638")), 
    val semanticWarning1 : Color = Color(parseColor("#f6a351")), 
    val semanticWarning2 : Color = Color(parseColor("#feb871")), 
    val semanticWarning3 : Color = Color(parseColor("#ffd4a8")), 
    val semanticWarning4 : Color = Color(parseColor("#fcdec0")), 
    val semanticWarning5 : Color = Color(parseColor("#ffe8d1")), 
    val semanticWarning6 : Color = Color(parseColor("#fff0e0")), 
    val semanticWarning7 : Color = Color(parseColor("#fff5eb")), 
    val semanticWarning8 : Color = Color(parseColor("#fffcfa")), 
)

data class DangerValuesContainer2 (
    val semanticDangerNegative4 : Color = Color(parseColor("#4a0d0d")), 
    val semanticDangerNegative3 : Color = Color(parseColor("#30723a")), 
    val semanticDangerNegative2 : Color = Color(parseColor("#63c7c3")), 
    val semanticDangerNegative1 : Color = Color(parseColor("#a13636")), 
    val semanticDanger0 : Color = Color(parseColor("#9e6610")), 
    val semanticDanger1 : Color = Color(parseColor("#285aa5")), 
    val semanticDanger2 : Color = Color(parseColor("#494b75")), 
    val semanticDanger3 : Color = Color(parseColor("#76d91c")), 
    val semanticDanger4 : Color = Color(parseColor("#d15a5a")), 
    val semanticDanger5 : Color = Color(parseColor("#fee7e7")), 
    val semanticDanger6 : Color = Color(parseColor("#ffebeb")), 
    val semanticDanger7 : Color = Color(parseColor("#fef5f5")), 
    val semanticDanger8 : Color = Color(parseColor("#fffafa")), 
)

data class SemanticValuesContainer (
    val brand : BrandValuesContainer = BrandValuesContainer(), 
    val neutral : NeutralValuesContainer2 = NeutralValuesContainer2(), 
    val neutralAlpha : NeutralAlphaValuesContainer = NeutralAlphaValuesContainer(), 
    val info : InfoValuesContainer = InfoValuesContainer(), 
    val success : SuccessValuesContainer1 = SuccessValuesContainer1(), 
    val warning : WarningValuesContainer = WarningValuesContainer(), 
    val danger : DangerValuesContainer2 = DangerValuesContainer2(), 
)

data class CoolGrayValuesContainer (
    val negative4 : Color = Color(parseColor("#1b242c")), 
    val negative3 : Color = Color(parseColor("#272e35")), 
    val negative2 : Color = Color(parseColor("#3a424a")), 
    val negative1 : Color = Color(parseColor("#4a545e")), 
    val coolGray0 : Color = Color(parseColor("#555f6d")), 
    val coolGray1 : Color = Color(parseColor("#7e8c9a")), 
    val coolGray2 : Color = Color(parseColor("#9ea8b3")), 
    val coolGray3 : Color = Color(parseColor("#cfd6dd")), 
    val coolGray4 : Color = Color(parseColor("#dee3e7")), 
    val coolGray5 : Color = Color(parseColor("#eaedf0")), 
    val coolGray6 : Color = Color(parseColor("#f0f3f5")), 
    val coolGray7 : Color = Color(parseColor("#f5f7f9")), 
    val coolGray8 : Color = Color(parseColor("#fcfcfd")), 
)

data class CoolGrayAlphaValuesContainer (
    val coolGrayANegative4 : Color = Color(parseColor("#09131aed")), 
    val coolGrayANegative3 : Color = Color(parseColor("#0a121ae0")), 
    val coolGrayANegative2 : Color = Color(parseColor("#1a232ddb")), 
    val coolGrayANegative1 : Color = Color(parseColor("#1d2835cc")), 
    val coolGrayA0 : Color = Color(parseColor("#182639bd")), 
    val coolGrayA1 : Color = Color(parseColor("#1830498f")), 
    val coolGrayA2 : Color = Color(parseColor("#0d253f66")), 
    val coolGrayA3 : Color = Color(parseColor("#10315633")), 
    val coolGrayA4 : Color = Color(parseColor("#04294321")), 
    val coolGrayA5 : Color = Color(parseColor("#10284717")), 
    val coolGrayA6 : Color = Color(parseColor("#022e500f")), 
    val coolGrayA7 : Color = Color(parseColor("#00295c0a")), 
    val coolGrayA8 : Color = Color(parseColor("#1f529e05")), 
)

data class NeutralGrayValuesContainer (
    val negative4 : Color = Color(parseColor("#212121")), 
    val negative3 : Color = Color(parseColor("#2e2e2e")), 
    val negative2 : Color = Color(parseColor("#404040")), 
    val negative1 : Color = Color(parseColor("#525252")), 
    val neutralGray0 : Color = Color(parseColor("#5e5e5e")), 
    val neutralGray1 : Color = Color(parseColor("#8a8a8a")), 
    val neutralGray2 : Color = Color(parseColor("#a6a6a6")), 
    val neutralGray3 : Color = Color(parseColor("#d6d6d6")), 
    val neutralGray4 : Color = Color(parseColor("#e3e3e3")), 
    val neutralGray5 : Color = Color(parseColor("#ebebeb")), 
    val neutralGray6 : Color = Color(parseColor("#f2f2f2")), 
    val neutralGray7 : Color = Color(parseColor("#f7f7f7")), 
    val neutralGray8 : Color = Color(parseColor("#fcfcfc")), 
)

data class NeutralGrayAlphaValuesContainer (
    val neutralGrayANegative4 : Color = Color(parseColor("#121212ed")), 
    val neutralGrayANegative3 : Color = Color(parseColor("#0f0f0fe0")), 
    val neutralGrayANegative2 : Color = Color(parseColor("#212121db")), 
    val neutralGrayANegative1 : Color = Color(parseColor("#262626cc")), 
    val neutralGrayA0 : Color = Color(parseColor("#262627bd")), 
    val neutralGrayA1 : Color = Color(parseColor("#2b2b2b8f")), 
    val neutralGrayA2 : Color = Color(parseColor("#21212166")), 
    val neutralGrayA3 : Color = Color(parseColor("#2e2e2e33")), 
    val neutralGrayA4 : Color = Color(parseColor("#1f1f1f21")), 
    val neutralGrayA5 : Color = Color(parseColor("#1c1c1c17")), 
    val neutralGrayA6 : Color = Color(parseColor("#2121210f")), 
    val neutralGrayA7 : Color = Color(parseColor("#2e2e2e0a")), 
    val neutralGrayA8 : Color = Color(parseColor("#52525205")), 
)

data class WarmGrayValuesContainer (
    val negative4 : Color = Color(parseColor("#222220")), 
    val negative3 : Color = Color(parseColor("#30302c")), 
    val negative2 : Color = Color(parseColor("#40403a")), 
    val negative1 : Color = Color(parseColor("#52524c")), 
    val warmGray0 : Color = Color(parseColor("#5f5f58")), 
    val warmGray1 : Color = Color(parseColor("#8b8b84")), 
    val warmGray2 : Color = Color(parseColor("#a8a89f")), 
    val warmGray3 : Color = Color(parseColor("#e3e305")), 
    val warmGray4 : Color = Color(parseColor("#e5e5e1")), 
    val warmGray5 : Color = Color(parseColor("#eaeae6")), 
    val warmGray6 : Color = Color(parseColor("#f3f3f1")), 
    val warmGray7 : Color = Color(parseColor("#f8f8f7")), 
    val warmGray8 : Color = Color(parseColor("#fdfdfc")), 
)

data class WarmGrayAlphaValuesContainer (
    val warmGrayANegative4 : Color = Color(parseColor("#131311ed")), 
    val warmGrayANegative3 : Color = Color(parseColor("#12120de0")), 
    val warmGrayANegative2 : Color = Color(parseColor("#22221bdb")), 
    val warmGrayANegative1 : Color = Color(parseColor("#272720cc")), 
    val warmGrayA0 : Color = Color(parseColor("#26261cbd")), 
    val warmGrayA1 : Color = Color(parseColor("#2f2f238f")), 
    val warmGrayA2 : Color = Color(parseColor("#28281166")), 
    val warmGrayA3 : Color = Color(parseColor("#3e3e1d33")), 
    val warmGrayA4 : Color = Color(parseColor("#33331421")), 
    val warmGrayA5 : Color = Color(parseColor("#22220217")), 
    val warmGrayA6 : Color = Color(parseColor("#2f2f0e0f")), 
    val warmGrayA7 : Color = Color(parseColor("#2f2f2d0a")), 
    val warmGrayA8 : Color = Color(parseColor("#52525205")), 
)

data class WhiteAlphaValuesContainer (
    val whiteANegative12 : Color = Color(parseColor("#ffffff05")), 
    val whiteANegative11 : Color = Color(parseColor("#ffffff08")), 
    val whiteANegative10 : Color = Color(parseColor("#ffffff0d")), 
    val whiteANegative9 : Color = Color(parseColor("#ffffff14")), 
    val whiteANegative8 : Color = Color(parseColor("#ffffff1a")), 
    val whiteANegative7 : Color = Color(parseColor("#ffffff1f")), 
    val whiteANegative6 : Color = Color(parseColor("#ffffff3d")), 
    val whiteANegative5 : Color = Color(parseColor("#ffffff66")), 
    val whiteANegative4 : Color = Color(parseColor("#ffffffa3")), 
    val whiteANegative3 : Color = Color(parseColor("#ffffffad")), 
    val whiteANegative2 : Color = Color(parseColor("#ffffffb8")), 
    val whiteANegative1 : Color = Color(parseColor("#ffffffd1")), 
    val whiteA0 : Color = Color(parseColor("#ffffff")), 
)

data class RedValuesContainer1 (
    val negative4 : Color = Color(parseColor("#4a0d0d")), 
    val negative3 : Color = Color(parseColor("#30723a")), 
    val negative2 : Color = Color(parseColor("#63c7c3")), 
    val negative1 : Color = Color(parseColor("#a13636")), 
    val red0 : Color = Color(parseColor("#9e6610")), 
    val red1 : Color = Color(parseColor("#285aa5")), 
    val red2 : Color = Color(parseColor("#494b75")), 
    val red3 : Color = Color(parseColor("#76d91c")), 
    val red4 : Color = Color(parseColor("#d15a5a")), 
    val red5 : Color = Color(parseColor("#fee7e7")), 
    val red6 : Color = Color(parseColor("#ffebeb")), 
    val red7 : Color = Color(parseColor("#fef5f5")), 
    val red8 : Color = Color(parseColor("#fffafa")), 
)

data class MagentaValuesContainer1 (
    val negative4 : Color = Color(parseColor("#410b2f")), 
    val negative3 : Color = Color(parseColor("#671e4d")), 
    val negative2 : Color = Color(parseColor("#f70aa8")), 
    val negative1 : Color = Color(parseColor("#953274")), 
    val magenta0 : Color = Color(parseColor("#91ae7a")), 
    val magenta1 : Color = Color(parseColor("#5d9ede")), 
    val magenta2 : Color = Color(parseColor("#ec89cb")), 
    val magenta3 : Color = Color(parseColor("#f7cae8")), 
    val magenta4 : Color = Color(parseColor("#fbd5ee")), 
    val magenta5 : Color = Color(parseColor("#fde2f4")), 
    val magenta6 : Color = Color(parseColor("#fdedf8")), 
    val magenta7 : Color = Color(parseColor("#fef6fb")), 
    val magenta8 : Color = Color(parseColor("#fffafd")), 
)

data class PurpleValuesContainer1 (
    val negative4 : Color = Color(parseColor("#410b2f")), 
    val negative3 : Color = Color(parseColor("#5b1e67")), 
    val negative2 : Color = Color(parseColor("#792989")), 
    val negative1 : Color = Color(parseColor("#853295")), 
    val purple0 : Color = Color(parseColor("#9939ac")), 
    val purple1 : Color = Color(parseColor("#4e82ee")), 
    val purple2 : Color = Color(parseColor("#d98eec")), 
    val purple3 : Color = Color(parseColor("#c04c0d")), 
    val purple4 : Color = Color(parseColor("#f5d5fb")), 
    val purple5 : Color = Color(parseColor("#f8e2fd")), 
    val purple6 : Color = Color(parseColor("#faedfd")), 
    val purple7 : Color = Color(parseColor("#fdf5ff")), 
    val purple8 : Color = Color(parseColor("#fefaff")), 
)

data class VioletValuesContainer1 (
    val negative4 : Color = Color(parseColor("#201263")), 
    val negative3 : Color = Color(parseColor("#39288a")), 
    val negative2 : Color = Color(parseColor("#161617")), 
    val negative1 : Color = Color(parseColor("#0e0406")), 
    val violet0 : Color = Color(parseColor("#634eca")), 
    val violet1 : Color = Color(parseColor("#927ef1")), 
    val violet2 : Color = Color(parseColor("#aba2fb")), 
    val violet3 : Color = Color(parseColor("#54917b")), 
    val violet4 : Color = Color(parseColor("#e3e0ff")), 
    val violet5 : Color = Color(parseColor("#eeebff")), 
    val violet6 : Color = Color(parseColor("#f3f0ff")), 
    val violet7 : Color = Color(parseColor("#f7f5ff")), 
    val violet8 : Color = Color(parseColor("#fbfaff")), 
)

data class BlueValuesContainer1 (
    val negative4 : Color = Color(parseColor("#041f5d")), 
    val negative3 : Color = Color(parseColor("#113997")), 
    val negative2 : Color = Color(parseColor("#658b6e")), 
    val negative1 : Color = Color(parseColor("#ff9375")), 
    val blue0 : Color = Color(parseColor("#3061d5")), 
    val blue1 : Color = Color(parseColor("#6691f4")), 
    val blue2 : Color = Color(parseColor("#8eb0fb")), 
    val blue3 : Color = Color(parseColor("#e30404")), 
    val blue4 : Color = Color(parseColor("#d6e3ff")), 
    val blue5 : Color = Color(parseColor("#e5eeff")), 
    val blue6 : Color = Color(parseColor("#ebf0ff")), 
    val blue7 : Color = Color(parseColor("#f5f8ff")), 
    val blue8 : Color = Color(parseColor("#fafbff")), 
)

data class CyanValuesContainer1 (
    val negative4 : Color = Color(parseColor("#002742")), 
    val negative3 : Color = Color(parseColor("#0c636e")), 
    val negative2 : Color = Color(parseColor("#165c8d")), 
    val negative1 : Color = Color(parseColor("#60a0cf")), 
    val cyan0 : Color = Color(parseColor("#0870ba")), 
    val cyan1 : Color = Color(parseColor("#5699dc")), 
    val cyan2 : Color = Color(parseColor("#79bcf6")), 
    val cyan3 : Color = Color(parseColor("#c2e2ff")), 
    val cyan4 : Color = Color(parseColor("#cce7ff")), 
    val cyan5 : Color = Color(parseColor("#e0f1ff")), 
    val cyan6 : Color = Color(parseColor("#ebf5ff")), 
    val cyan7 : Color = Color(parseColor("#f0f9ff")), 
    val cyan8 : Color = Color(parseColor("#fafdff")), 
)

data class TealValuesContainer1 (
    val negative4 : Color = Color(parseColor("#012a37")), 
    val negative3 : Color = Color(parseColor("#7c4fc4")), 
    val negative2 : Color = Color(parseColor("#d1d2d2")), 
    val negative1 : Color = Color(parseColor("#196c85")), 
    val teal0 : Color = Color(parseColor("#077597")), 
    val teal1 : Color = Color(parseColor("#4f9eba")), 
    val teal2 : Color = Color(parseColor("#7ac0dc")), 
    val teal3 : Color = Color(parseColor("#b8e8f5")), 
    val teal4 : Color = Color(parseColor("#c5ecf7")), 
    val teal5 : Color = Color(parseColor("#e0f3fa")), 
    val teal6 : Color = Color(parseColor("#e8f7fc")), 
    val teal7 : Color = Color(parseColor("#f0fbff")), 
    val teal8 : Color = Color(parseColor("#fafeff")), 
)

data class AquamarineValuesContainer1 (
    val negative4 : Color = Color(parseColor("#012d26")), 
    val negative3 : Color = Color(parseColor("#0d4a42")), 
    val negative2 : Color = Color(parseColor("#15665b")), 
    val negative1 : Color = Color(parseColor("#1a7061")), 
    val aquamarine0 : Color = Color(parseColor("#097b68")), 
    val aquamarine1 : Color = Color(parseColor("#3da496")), 
    val aquamarine2 : Color = Color(parseColor("#6ec9bf")), 
    val aquamarine4 : Color = Color(parseColor("#c5f2ec")), 
    val aquamarine3 : Color = Color(parseColor("#bee9e4")), 
    val aquamarine5 : Color = Color(parseColor("#daf6f3")), 
    val aquamarine6 : Color = Color(parseColor("#e2f8f5")), 
    val aquamarine7 : Color = Color(parseColor("#f0faf9")), 
    val aquamarine8 : Color = Color(parseColor("#fbfefe")), 
)

data class GreenValuesContainer1 (
    val negative4 : Color = Color(parseColor("#0a2e0b")), 
    val negative3 : Color = Color(parseColor("#b3b7b0")), 
    val negative2 : Color = Color(parseColor("#246626")), 
    val negative1 : Color = Color(parseColor("#2f6f2f")), 
    val green0 : Color = Color(parseColor("#2e3e58")), 
    val green1 : Color = Color(parseColor("#55a555")), 
    val green2 : Color = Color(parseColor("#fdff84")), 
    val green3 : Color = Color(parseColor("#0005ff")), 
    val green4 : Color = Color(parseColor("#cff2cf")), 
    val green5 : Color = Color(parseColor("#dff6df")), 
    val green6 : Color = Color(parseColor("#e6f9e6")), 
    val green7 : Color = Color(parseColor("#f4fbf4")), 
    val green8 : Color = Color(parseColor("#fbfefb")), 
)

data class OrangeValuesContainer1 (
    val negative4 : Color = Color(parseColor("#492909")), 
    val negative3 : Color = Color(parseColor("#3f2828")), 
    val negative2 : Color = Color(parseColor("#a05c1c")), 
    val negative1 : Color = Color(parseColor("#b4610e")), 
    val orange0 : Color = Color(parseColor("#f59638")), 
    val orange1 : Color = Color(parseColor("#f6a351")), 
    val orange2 : Color = Color(parseColor("#feb871")), 
    val orange3 : Color = Color(parseColor("#ffd4a8")), 
    val orange4 : Color = Color(parseColor("#fcdec0")), 
    val orange5 : Color = Color(parseColor("#ffe8d1")), 
    val orange6 : Color = Color(parseColor("#fff0e0")), 
    val orange7 : Color = Color(parseColor("#fff5eb")), 
    val orange8 : Color = Color(parseColor("#fffcfa")), 
)

data class TransparentValuesContainer (
    val transparent : Color = Color(parseColor("#ffffff00")), 
)

data class ColorValuesContainer (
    val content : ContentValuesContainer = ContentValuesContainer(), 
    val border : BorderValuesContainer = BorderValuesContainer(), 
    val background : BackgroundValuesContainer = BackgroundValuesContainer(), 
    val action : ActionValuesContainer = ActionValuesContainer(), 
    val interaction : InteractionValuesContainer = InteractionValuesContainer(), 
    val nonSemantic : NonSemanticValuesContainer = NonSemanticValuesContainer(), 
    val semantic : SemanticValuesContainer = SemanticValuesContainer(), 
    val coolGray : CoolGrayValuesContainer = CoolGrayValuesContainer(), 
    val coolGrayAlpha : CoolGrayAlphaValuesContainer = CoolGrayAlphaValuesContainer(), 
    val neutralGray : NeutralGrayValuesContainer = NeutralGrayValuesContainer(), 
    val neutralGrayAlpha : NeutralGrayAlphaValuesContainer = NeutralGrayAlphaValuesContainer(), 
    val warmGray : WarmGrayValuesContainer = WarmGrayValuesContainer(), 
    val warmGrayAlpha : WarmGrayAlphaValuesContainer = WarmGrayAlphaValuesContainer(), 
    val whiteAlpha : WhiteAlphaValuesContainer = WhiteAlphaValuesContainer(), 
    val red : RedValuesContainer1 = RedValuesContainer1(), 
    val magenta : MagentaValuesContainer1 = MagentaValuesContainer1(), 
    val purple : PurpleValuesContainer1 = PurpleValuesContainer1(), 
    val violet : VioletValuesContainer1 = VioletValuesContainer1(), 
    val blue : BlueValuesContainer1 = BlueValuesContainer1(), 
    val cyan : CyanValuesContainer1 = CyanValuesContainer1(), 
    val teal : TealValuesContainer1 = TealValuesContainer1(), 
    val aquamarine : AquamarineValuesContainer1 = AquamarineValuesContainer1(), 
    val green : GreenValuesContainer1 = GreenValuesContainer1(), 
    val orange : OrangeValuesContainer1 = OrangeValuesContainer1(), 
    val transparent : TransparentValuesContainer = TransparentValuesContainer(), 
)

data class BorderWidthValuesContainer (
    val focus : Double = 1.0, 
    val none : Double = 0.0, 
    val small : Double = 1.0, 
    val medium : Double = 2.0, 
    val large : Double = 4.0, 
    val xLarge : Double = 8.0, 
    val borderWidth0 : Double = 0.0, 
    val borderWidth100 : Double = 1.0, 
    val borderWidth200 : Double = 2.0, 
    val borderWidth400 : Double = 4.0, 
    val borderWidth800 : Double = 8.0, 
)

data class BorderRadiusValuesContainer (
    val none : Double = 0.0, 
    val small : Double = 2.0, 
    val medium : Double = 4.0, 
    val large : Double = 8.0, 
    val xLarge : Double = 12.0, 
    val borderRadius2xLarge : Double = 16.0, 
    val borderRadius3xLarge : Double = 20.0, 
    val borderRadius4xLarge : Double = 24.0, 
    val full : Double = 999.0, 
    val borderRadius0 : Double = 0.0, 
    val borderRadius25 : Double = 2.0, 
    val borderRadius50 : Double = 4.0, 
    val borderRadius100 : Double = 8.0, 
    val borderRadius150 : Double = 12.0, 
    val borderRadius200 : Double = 16.0, 
    val borderRadius250 : Double = 20.0, 
    val borderRadius300 : Double = 24.0, 
    val borderRadius999 : Double = 999.0, 
)

data class SizeValuesContainer (
    val size3xLarge : Double = 72.0, 
    val size2xLarge : Double = 64.0, 
    val xLarge : Double = 56.0, 
    val large : Double = 48.0, 
    val medium : Double = 40.0, 
    val small : Double = 32.0, 
    val xSmall : Double = 24.0, 
    val size2xSmall : Double = 20.0, 
    val size3xSmall : Double = 16.0, 
)

data class PaddingValuesContainer (
    val none : Double = 0.0, 
    val padding2xSmall : Double = 2.0, 
    val xSmall : Double = 4.0, 
    val small : Double = 8.0, 
    val medium : Double = 12.0, 
    val large : Double = 16.0, 
    val padding2xLarge : Double = 24.0, 
    val padding3xLarge : Double = 32.0, 
    val padding4xLarge : Double = 40.0, 
    val padding5xLarge : Double = 44.0, 
    val padding6xLarge : Double = 64.0, 
)

data class GapValuesContainer (
    val none : Double = 0.0, 
    val gap2xSmall : Double = 2.0, 
    val xSmall : Double = 4.0, 
    val small : Double = 8.0, 
    val medium : Double = 12.0, 
    val large : Double = 16.0, 
    val xLarge : Double = 24.0, 
    val gap2xLarge : Double = 32.0, 
    val gap3xLarge : Double = 44.0, 
)

data class SpaceValuesContainer (
    val padding : PaddingValuesContainer = PaddingValuesContainer(), 
    val gap : GapValuesContainer = GapValuesContainer(), 
)

data class OpacityValuesContainer (
    val disabled : Double = 0.5, 
    val opacity0 : Double = 0.0, 
    val opacity50 : Double = 0.5, 
    val opacity100 : Double = 1.0, 
)

data class CodeValuesContainer (
    val typographyCodeSmall : Typography = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 400.0, fontSize = 12.0, fontFamily = "Noto Sans Mono"), 
    val typographyCodeMedium : Typography = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 400.0, fontSize = 14.0, fontFamily = "Noto Sans Mono"), 
    val typographyCodeLarge : Typography = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 400.0, fontSize = 16.0, fontFamily = "Noto Sans Mono"), 
)

data class UtilityValuesContainer (
    val typographyUtilitySmall : Typography = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 500.0, fontSize = 12.0, fontFamily = "Noto Sans"), 
    val typographyUtilityMedium : Typography = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 500.0, fontSize = 14.0, fontFamily = "Noto Sans"), 
    val typographyUtilityLarge : Typography = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 500.0, fontSize = 16.0, fontFamily = "Noto Sans"), 
)

data class BodyValuesContainer (
    val typographyBodySmall : Typography = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 400.0, fontSize = 12.0, fontFamily = "Noto Sans"), 
    val typographyBodyMedium : Typography = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 400.0, fontSize = 14.0, fontFamily = "Noto Sans"), 
    val typographyBodyLarge : Typography = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 400.0, fontSize = 16.0, fontFamily = "Noto Sans"), 
)

data class HeadingValuesContainer (
    val typographyHeadingSmall : Typography = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 700.0, fontSize = 12.0, fontFamily = "Noto Sans"), 
    val typographyHeadingMedium : Typography = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 700.0, fontSize = 14.0, fontFamily = "Noto Sans"), 
    val typographyHeadingLarge : Typography = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 700.0, fontSize = 16.0, fontFamily = "Noto Sans"), 
    val typographyHeadingXLarge : Typography = Typography(lineHeight = 24.0, letterSpacing = -0.014, fontWeight = 700.0, fontSize = 18.0, fontFamily = "Noto Sans"), 
    val typographyHeading2xLarge : Typography = Typography(lineHeight = 26.0, letterSpacing = -0.017, fontWeight = 700.0, fontSize = 20.0, fontFamily = "Noto Sans"), 
    val typographyHeading3xLarge : Typography = Typography(lineHeight = 32.0, letterSpacing = -0.019, fontWeight = 700.0, fontSize = 24.0, fontFamily = "Noto Sans"), 
    val typographyHeading4xLarge : Typography = Typography(lineHeight = 38.0, letterSpacing = -0.021, fontWeight = 700.0, fontSize = 28.0, fontFamily = "Noto Sans"), 
    val typographyHeading5xLarge : Typography = Typography(lineHeight = 42.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 32.0, fontFamily = "Noto Sans"), 
    val typographyHeading6xLarge : Typography = Typography(lineHeight = 48.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 36.0, fontFamily = "Noto Sans"), 
    val typographyHeading7xLarge : Typography = Typography(lineHeight = 56.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 42.0, fontFamily = "Noto Sans"), 
    val typographyHeading8xLarge : Typography = Typography(lineHeight = 58.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 48.0, fontFamily = "Noto Sans"), 
    val typographyHeading9xLarge : Typography = Typography(lineHeight = 66.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 54.0, fontFamily = "Noto Sans"), 
)

data class DisplayValuesContainer (
    val typographyDisplaySmall : Typography = Typography(lineHeight = 66.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 54.0, fontFamily = "Noto Sans"), 
    val typographyDisplayMedium : Typography = Typography(lineHeight = 72.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 60.0, fontFamily = "Noto Sans"), 
    val typographyDisplayLarge : Typography = Typography(lineHeight = 82.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 68.0, fontFamily = "Noto Sans"), 
    val typographyDisplayXLarge : Typography = Typography(lineHeight = 92.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 76.0, fontFamily = "Noto Sans"), 
    val typographyDisplay2xLarge : Typography = Typography(lineHeight = 102.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 84.0, fontFamily = "Noto Sans"), 
    val typographyDisplay3xLarge : Typography = Typography(lineHeight = 112.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 92.0, fontFamily = "Noto Sans"), 
)

data class TypographyValuesContainer (
    val code : CodeValuesContainer = CodeValuesContainer(), 
    val utility : UtilityValuesContainer = UtilityValuesContainer(), 
    val body : BodyValuesContainer = BodyValuesContainer(), 
    val heading : HeadingValuesContainer = HeadingValuesContainer(), 
    val display : DisplayValuesContainer = DisplayValuesContainer(), 
)

data class DimensionValuesContainer (
    val dimension0 : Double = 0.0, 
    val dimension25 : Double = 2.0, 
    val dimension50 : Double = 4.0, 
    val dimension100 : Double = 8.0, 
    val dimension150 : Double = 12.0, 
    val dimension200 : Double = 16.0, 
    val dimension250 : Double = 20.0, 
    val dimension300 : Double = 24.0, 
    val dimension400 : Double = 32.0, 
    val dimension500 : Double = 40.0, 
    val dimension550 : Double = 44.0, 
    val dimension600 : Double = 48.0, 
    val dimension700 : Double = 56.0, 
    val dimension800 : Double = 64.0, 
    val dimension900 : Double = 72.0, 
    val dimension1000 : Double = 80.0, 
    val dimension1200 : Double = 96.0, 
    val dimension1500 : Double = 120.0, 
    val dimension1600 : Double = 128.0, 
)

data class BottomValuesContainer (
    val elevationBottom100 : BoxShadow = BoxShadow(y = 1.0, x = 0.0, type = "dropShadow", spread = 0.0, color = "#1b242c1f", blur = 2.0), 
    val elevationBottom200 : List<BoxShadow> = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c14", blur = 8.0)), 
    val elevationBottom300 : List<BoxShadow> = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 8.0, x = 0.0, type = "dropShadow", spread = -2.0, color = "#1b242c1f", blur = 16.0)), 
    val elevationBottom400 : List<BoxShadow> = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 16.0, x = 0.0, type = "dropShadow", spread = -6.0, color = "#1b242c29", blur = 24.0)), 
)

data class TopValuesContainer (
    val elevationTop100 : BoxShadow = BoxShadow(y = -1.0, x = 0.0, type = "dropShadow", spread = 0.0, color = "#1b242c1f", blur = 2.0), 
    val elevationTop200 : List<BoxShadow> = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c14", blur = 8.0)), 
    val elevationTop300 : List<BoxShadow> = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -8.0, x = 0.0, type = "dropShadow", spread = -2.0, color = "#1b242c1f", blur = 16.0)), 
    val elevationTop400 : List<BoxShadow> = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -16.0, x = 0.0, type = "dropShadow", spread = -6.0, color = "#1b242c29", blur = 24.0)), 
)

data class ElevationValuesContainer (
    val bottom : BottomValuesContainer = BottomValuesContainer(), 
    val top : TopValuesContainer = TopValuesContainer(), 
)

data class FontFamilyValuesContainer (
    val sans : String = "Noto Sans", 
    val serif : String = "Noto Serif", 
    val mono : String = "Noto Sans Mono", 
)

data class FontSizeValuesContainer (
    val fontSize100 : Double = 8.0, 
    val fontSize125 : Double = 10.0, 
    val fontSize150 : Double = 12.0, 
    val fontSize175 : Double = 14.0, 
    val fontSize200 : Double = 16.0, 
    val fontSize225 : Double = 18.0, 
    val fontSize250 : Double = 20.0, 
    val fontSize300 : Double = 24.0, 
    val fontSize350 : Double = 28.0, 
    val fontSize400 : Double = 32.0, 
    val fontSize450 : Double = 36.0, 
    val fontSize525 : Double = 42.0, 
    val fontSize600 : Double = 48.0, 
    val fontSize675 : Double = 54.0, 
    val fontSize750 : Double = 60.0, 
    val fontSize850 : Double = 68.0, 
    val fontSize950 : Double = 76.0, 
    val fontSize1050 : Double = 84.0, 
    val fontSize1150 : Double = 92.0, 
)

data class FontWeightValuesContainer (
    val fontWeight300 : Double = 300.0, 
    val fontWeight400 : Double = 400.0, 
    val fontWeight500 : Double = 500.0, 
    val fontWeight600 : Double = 600.0, 
    val fontWeight700 : Double = 700.0, 
)

data class LetterSpacingValuesContainer (
    val letterSpacing0 : Double = 0.0, 
    val letterSpacing100 : Double = -0.006, 
    val letterSpacing200 : Double = -0.011, 
    val letterSpacing300 : Double = -0.014, 
    val letterSpacing400 : Double = -0.017, 
    val letterSpacing500 : Double = -0.019, 
    val letterSpacing600 : Double = -0.021, 
    val letterSpacing700 : Double = -0.022, 
)

data class LineHeightValuesContainer (
    val value150 : Double = 12.0, 
    val value200 : Double = 16.0, 
    val value250 : Double = 20.0, 
    val value275 : Double = 22.0, 
    val value300 : Double = 24.0, 
    val value325 : Double = 26.0, 
    val value400 : Double = 32.0, 
    val value475 : Double = 38.0, 
    val value525 : Double = 42.0, 
    val value600 : Double = 48.0, 
    val value700 : Double = 56.0, 
    val value725 : Double = 58.0, 
    val value825 : Double = 66.0, 
    val value900 : Double = 72.0, 
    val value1025 : Double = 82.0, 
    val value1150 : Double = 92.0, 
    val value1275 : Double = 102.0, 
    val value1400 : Double = 112.0, 
)

data class ContentValuesContainer1 (
    val primary : Color = Color(parseColor("#272e35")), 
    val secondary : Color = Color(parseColor("#555f6d")), 
    val tertiary : Color = Color(parseColor("#7e8c9a")), 
    val disabled : Color = Color(parseColor("#9ea8b3")), 
    val primaryInverse : Color = Color(parseColor("#ffffff")), 
    val secondaryInverse : Color = Color(parseColor("#ffffffa3")), 
    val tertiaryInverse : Color = Color(parseColor("#ffffff66")), 
    val disabledInverse : Color = Color(parseColor("#ffffff3d")), 
    val infoPrimary : Color = Color(parseColor("#113997")), 
    val infoSecondary : Color = Color(parseColor("#3061d5")), 
    val successPrimary : Color = Color(parseColor("#b3b7b0")), 
    val successSecondary : Color = Color(parseColor("#2e3e58")), 
    val warningPrimary : Color = Color(parseColor("#3f2828")), 
    val warningSecondary : Color = Color(parseColor("#f59638")), 
    val dangerPrimary : Color = Color(parseColor("#30723a")), 
    val dangerSecondary : Color = Color(parseColor("#9e6610")), 
    val brandPrimary : Color = Color(parseColor("#113997")), 
    val brandSecondary : Color = Color(parseColor("#3061d5")), 
)

data class BorderValuesContainer2 (
    val default : Color = Color(parseColor("#eaedf0")), 
    val defaultA : Color = Color(parseColor("#10284717")), 
    val inverse : Color = Color(parseColor("#ffffff")), 
    val neutralStrong : Color = Color(parseColor("#555f6d")), 
    val neutralSubtle : Color = Color(parseColor("#cfd6dd")), 
    val infoStrong : Color = Color(parseColor("#3061d5")), 
    val infoSubtle : Color = Color(parseColor("#e30404")), 
    val successStrong : Color = Color(parseColor("#2e3e58")), 
    val successSubtle : Color = Color(parseColor("#0005ff")), 
    val warningStrong : Color = Color(parseColor("#f59638")), 
    val warningSubtle : Color = Color(parseColor("#ffd4a8")), 
    val dangerStrong : Color = Color(parseColor("#9e6610")), 
    val dangerSubtle : Color = Color(parseColor("#76d91c")), 
)

data class BackgroundValuesContainer2 (
    val default : Color = Color(parseColor("#ffffff")), 
    val inverse : Color = Color(parseColor("#272e35")), 
    val neutralStrong : Color = Color(parseColor("#555f6d")), 
    val neutralMuted : Color = Color(parseColor("#dee3e7")), 
    val neutralOnSubtle : Color = Color(parseColor("#eaedf0")), 
    val neutralSubtle : Color = Color(parseColor("#f5f7f9")), 
    val neutralSurface : Color = Color(parseColor("#fcfcfd")), 
    val infoStrong : Color = Color(parseColor("#3061d5")), 
    val infoMuted : Color = Color(parseColor("#d6e3ff")), 
    val infoOnSubtle : Color = Color(parseColor("#e5eeff")), 
    val infoSubtle : Color = Color(parseColor("#f5f8ff")), 
    val infoSurface : Color = Color(parseColor("#fafbff")), 
    val successStrong : Color = Color(parseColor("#2e3e58")), 
    val successMuted : Color = Color(parseColor("#cff2cf")), 
    val successOnSubtle : Color = Color(parseColor("#dff6df")), 
    val successSubtle : Color = Color(parseColor("#f4fbf4")), 
    val successSurface : Color = Color(parseColor("#fbfefb")), 
    val warningStrong : Color = Color(parseColor("#f59638")), 
    val warningMuted : Color = Color(parseColor("#fcdec0")), 
    val warningOnSubtle : Color = Color(parseColor("#ffe8d1")), 
    val warningSubtle : Color = Color(parseColor("#fff5eb")), 
    val warningSurface : Color = Color(parseColor("#fffcfa")), 
    val dangerStrong : Color = Color(parseColor("#9e6610")), 
    val dangerMuted : Color = Color(parseColor("#d15a5a")), 
    val dangerOnSubtle : Color = Color(parseColor("#fee7e7")), 
    val dangerSubtle : Color = Color(parseColor("#fef5f5")), 
    val dangerSurface : Color = Color(parseColor("#fffafa")), 
    val brandStrong : Color = Color(parseColor("#3061d5")), 
    val brandMuted : Color = Color(parseColor("#d6e3ff")), 
    val brandOnSubtle : Color = Color(parseColor("#e5eeff")), 
    val brandSurface : Color = Color(parseColor("#fafbff")), 
    val brandSubtle : Color = Color(parseColor("#f5f8ff")), 
)

data class PrimaryValuesContainer1 (
    val actionPrimaryNormal : Color = Color(parseColor("#3061d5")), 
    val actionPrimaryHover : Color = Color(parseColor("#658b6e")), 
    val actionPrimaryActive : Color = Color(parseColor("#113997")), 
    val actionPrimarySelected : Color = Color(parseColor("#658b6e")), 
    val actionPrimarySubtleNormal : Color = Color(parseColor("#ebf0ff")), 
    val actionPrimarySubtleHover : Color = Color(parseColor("#e5eeff")), 
    val actionPrimarySubtleActive : Color = Color(parseColor("#e30404")), 
    val actionPrimarySubtleSelected : Color = Color(parseColor("#e5eeff")), 
)

data class NeutralValuesContainer3 (
    val actionNeutralNormal : Color = Color(parseColor("#4a545e")), 
    val actionNeutralHover : Color = Color(parseColor("#3a424a")), 
    val actionNeutralActive : Color = Color(parseColor("#272e35")), 
    val actionNeutralSelected : Color = Color(parseColor("#3a424a")), 
    val actionNeutralSubtleNormal : Color = Color(parseColor("#f0f3f5")), 
    val actionNeutralSubtleHover : Color = Color(parseColor("#eaedf0")), 
    val actionNeutralSubtleActive : Color = Color(parseColor("#cfd6dd")), 
    val actionNeutralSubtleSelected : Color = Color(parseColor("#eaedf0")), 
)

data class SuccessValuesContainer2 (
    val actionSuccessNormal : Color = Color(parseColor("#2e3e58")), 
    val actionSuccessHover : Color = Color(parseColor("#246626")), 
    val actionSuccessActive : Color = Color(parseColor("#b3b7b0")), 
    val actionSuccessSelected : Color = Color(parseColor("#246626")), 
    val actionSuccessSubtleNormal : Color = Color(parseColor("#e6f9e6")), 
    val actionSuccessSubtleHover : Color = Color(parseColor("#dff6df")), 
    val actionSuccessSubtleActive : Color = Color(parseColor("#0005ff")), 
    val actionSuccessSubtleSelected : Color = Color(parseColor("#dff6df")), 
)

data class DangerValuesContainer3 (
    val actionDangerNormal : Color = Color(parseColor("#9e6610")), 
    val actionDangerHover : Color = Color(parseColor("#63c7c3")), 
    val actionDangerActive : Color = Color(parseColor("#30723a")), 
    val actionDangerSelected : Color = Color(parseColor("#63c7c3")), 
    val actionDangerSubtleNormal : Color = Color(parseColor("#ffebeb")), 
    val actionDangerSubtleHover : Color = Color(parseColor("#fee7e7")), 
    val actionDangerSubtleActive : Color = Color(parseColor("#76d91c")), 
    val actionDangerSubtleSelected : Color = Color(parseColor("#fee7e7")), 
)

data class GhostValuesContainer2 (
    val actionGhostNormal : Color = Color(parseColor("#ffffff00")), 
    val actionGhostHover : Color = Color(parseColor("#022e500f")), 
    val actionGhostActive : Color = Color(parseColor("#10284717")), 
    val actionGhostSelected : Color = Color(parseColor("#022e500f")), 
    val actionGhostInverseHover : Color = Color(parseColor("#ffffff1a")), 
    val actionGhostInverseActive : Color = Color(parseColor("#ffffff1f")), 
    val actionGhostInverseSelected : Color = Color(parseColor("#ffffff1a")), 
    val actionGhostDangerHover : Color = Color(parseColor("#ffebeb")), 
    val actionGhostDangerActive : Color = Color(parseColor("#fee7e7")), 
    val actionGhostDangerSelected : Color = Color(parseColor("#ffebeb")), 
)

data class OutlineValuesContainer1 (
    val actionOutlineNormal : Color = Color(parseColor("#cfd6dd")), 
    val actionOutlineHover : Color = Color(parseColor("#9ea8b3")), 
    val actionOutlineActive : Color = Color(parseColor("#7e8c9a")), 
    val actionOutlineSelected : Color = Color(parseColor("#9ea8b3")), 
)

data class InverseValuesContainer2 (
    val actionInverseNormal : Color = Color(parseColor("#ffffff")), 
    val actionInverseHover : Color = Color(parseColor("#ffffffd1")), 
    val actionInverseActive : Color = Color(parseColor("#ffffffb8")), 
    val actionInverseSelected : Color = Color(parseColor("#ffffffd1")), 
)

data class ReverseInverseValuesContainer1 (
    val actionReverseInverseNormal : Color = Color(parseColor("#0a121ae0")), 
    val actionReverseInverseHover : Color = Color(parseColor("#1d2835cc")), 
    val actionReverseInverseActive : Color = Color(parseColor("#182639bd")), 
    val actionReverseInverseSelected : Color = Color(parseColor("#1d2835cc")), 
)

data class ActionValuesContainer1 (
    val primary : PrimaryValuesContainer1 = PrimaryValuesContainer1(), 
    val neutral : NeutralValuesContainer3 = NeutralValuesContainer3(), 
    val success : SuccessValuesContainer2 = SuccessValuesContainer2(), 
    val danger : DangerValuesContainer3 = DangerValuesContainer3(), 
    val ghost : GhostValuesContainer2 = GhostValuesContainer2(), 
    val outline : OutlineValuesContainer1 = OutlineValuesContainer1(), 
    val inverse : InverseValuesContainer2 = InverseValuesContainer2(), 
    val reverseInverse : ReverseInverseValuesContainer1 = ReverseInverseValuesContainer1(), 
)

data class DefaultValuesContainer1 (
    val interactionDefaultNormal : Color = Color(parseColor("#3061d5")), 
    val interactionDefaultHover : Color = Color(parseColor("#658b6e")), 
    val interactionDefaultActive : Color = Color(parseColor("#113997")), 
    val interactionDefaultSelected : Color = Color(parseColor("#658b6e")), 
    val interactionDefaultSubtleNormal : Color = Color(parseColor("#ebf0ff")), 
    val interactionDefaultSubtleHover : Color = Color(parseColor("#e5eeff")), 
    val interactionDefaultSubtleActive : Color = Color(parseColor("#e30404")), 
    val interactionDefaultSubtleSelected : Color = Color(parseColor("#e5eeff")), 
)

data class NeutralValuesContainer4 (
    val interactionNeutralNormal : Color = Color(parseColor("#4a545e")), 
    val interactionNeutralHover : Color = Color(parseColor("#3a424a")), 
    val interactionNeutralActive : Color = Color(parseColor("#272e35")), 
    val interactionNeutralSelected : Color = Color(parseColor("#3a424a")), 
    val interactionNeutralSubtleNormal : Color = Color(parseColor("#f0f3f5")), 
    val interactionNeutralSubtleHover : Color = Color(parseColor("#eaedf0")), 
    val interactionNeutralSubtleActive : Color = Color(parseColor("#cfd6dd")), 
    val interactionNeutralSubtleSelected : Color = Color(parseColor("#eaedf0")), 
)

data class DangerValuesContainer4 (
    val interactionDangerNormal : Color = Color(parseColor("#9e6610")), 
    val interactionDangerHover : Color = Color(parseColor("#63c7c3")), 
    val interactionDangerActive : Color = Color(parseColor("#30723a")), 
    val interactionDangerSelected : Color = Color(parseColor("#63c7c3")), 
    val interactionDangerSubtleNormal : Color = Color(parseColor("#ffebeb")), 
    val interactionDangerSubtleHover : Color = Color(parseColor("#fee7e7")), 
    val interactionDangerSubtleActive : Color = Color(parseColor("#76d91c")), 
    val interactionDangerSubtleSelected : Color = Color(parseColor("#fee7e7")), 
)

data class GhostValuesContainer3 (
    val interactionGhostNormal : Color = Color(parseColor("#ffffff00")), 
    val interactionGhostHover : Color = Color(parseColor("#022e500f")), 
    val interactionGhostActive : Color = Color(parseColor("#10284717")), 
    val interactionGhostSelected : Color = Color(parseColor("#022e500f")), 
    val interactionGhostInverseHover : Color = Color(parseColor("#ffffff1a")), 
    val interactionGhostInverseNormal : Color = Color(parseColor("#ffffff1f")), 
    val interactionGhostInverseSelected : Color = Color(parseColor("#ffffff1a")), 
    val interactionGhostDangerHover : Color = Color(parseColor("#ffebeb")), 
    val interactionGhostDangerNormal : Color = Color(parseColor("#fee7e7")), 
    val interactionGhostDangerSelected : Color = Color(parseColor("#ffebeb")), 
)

data class DisabledValuesContainer1 (
    val interactionDisabledNormal : Color = Color(parseColor("#9ea8b3")), 
    val interactionDisabledHover : Color = Color(parseColor("#7e8c9a")), 
    val interactionDisabledActive : Color = Color(parseColor("#555f6d")), 
    val interactionDisabledSubtleNormal : Color = Color(parseColor("#eaedf0")), 
    val interactionDisabledSubtleHover : Color = Color(parseColor("#dee3e7")), 
    val interactionDisabledSubtleActive : Color = Color(parseColor("#cfd6dd")), 
)

data class BorderValuesContainer3 (
    val interactionBorderNormal : Color = Color(parseColor("#8eb0fb")), 
    val interactionBorderHover : Color = Color(parseColor("#6691f4")), 
    val interactionBorderActive : Color = Color(parseColor("#ff9375")), 
    val interactionBorderSelected : Color = Color(parseColor("#3061d5")), 
    val interactionBorderNeutralNormal : Color = Color(parseColor("#cfd6dd")), 
    val interactionBorderNeutralHover : Color = Color(parseColor("#9ea8b3")), 
    val interactionBorderNeutralActive : Color = Color(parseColor("#7e8c9a")), 
    val interactionBorderNeutralSelected : Color = Color(parseColor("#9ea8b3")), 
    val interactionBorderDanger : Color = Color(parseColor("#285aa5")), 
)

data class BackgroundValuesContainer3 (
    val interactionBackgroundModal : Color = Color(parseColor("#ffffff")), 
    val interactionBackgroundModeless : Color = Color(parseColor("#ffffff")), 
    val interactionBackgroundModelessInverse : Color = Color(parseColor("#272e35")), 
    val interactionBackgroundSidepanel : Color = Color(parseColor("#ffffff")), 
    val interactionBackgroundFormField : Color = Color(parseColor("#ffffff")), 
    val interactionBackgroundDimmer : Color = Color(parseColor("#182639bd")), 
)

data class InverseValuesContainer3 (
    val interactionInverseNormal : Color = Color(parseColor("#ffffff")), 
    val interactionInverseHover : Color = Color(parseColor("#ffffffd1")), 
    val interactionInverseActive : Color = Color(parseColor("#ffffffb8")), 
    val interactionInverseSelected : Color = Color(parseColor("#ffffffd1")), 
)

data class FocusValuesContainer1 (
    val interactionFocusDefault : Color = Color(parseColor("#6691f4")), 
)

data class InteractionValuesContainer1 (
    val default : DefaultValuesContainer1 = DefaultValuesContainer1(), 
    val neutral : NeutralValuesContainer4 = NeutralValuesContainer4(), 
    val danger : DangerValuesContainer4 = DangerValuesContainer4(), 
    val ghost : GhostValuesContainer3 = GhostValuesContainer3(), 
    val disabled : DisabledValuesContainer1 = DisabledValuesContainer1(), 
    val border : BorderValuesContainer3 = BorderValuesContainer3(), 
    val background : BackgroundValuesContainer3 = BackgroundValuesContainer3(), 
    val inverse : InverseValuesContainer3 = InverseValuesContainer3(), 
    val focus : FocusValuesContainer1 = FocusValuesContainer1(), 
)

data class GrayValuesContainer1 (
    val nonSemanticGrayContentPrimary : Color = Color(parseColor("#272e35")), 
    val nonSemanticGrayContentSecondary : Color = Color(parseColor("#555f6d")), 
    val nonSemanticGrayBorderDefault : Color = Color(parseColor("#eaedf0")), 
    val nonSemanticGrayBorderStrong : Color = Color(parseColor("#555f6d")), 
    val nonSemanticGrayBorderSubtle : Color = Color(parseColor("#cfd6dd")), 
    val nonSemanticGrayBackgroundStrong : Color = Color(parseColor("#555f6d")), 
    val nonSemanticGrayBackgroundMuted : Color = Color(parseColor("#dee3e7")), 
    val nonSemanticGrayBackgroundOnSubtle : Color = Color(parseColor("#eaedf0")), 
    val nonSemanticGrayBackgroundSubtle : Color = Color(parseColor("#f5f7f9")), 
    val nonSemanticGrayBackgroundSurface : Color = Color(parseColor("#fcfcfd")), 
)

data class WhiteValuesContainer1 (
    val nonSemanticWhiteContentPrimary : Color = Color(parseColor("#ffffff")), 
    val nonSemanticWhiteContentSecondary : Color = Color(parseColor("#ffffffa3")), 
    val nonSemanticWhiteBorderDefault : Color = Color(parseColor("#ffffff66")), 
    val nonSemanticWhiteBorderStrong : Color = Color(parseColor("#ffffff")), 
    val nonSemanticWhiteBorderSubtle : Color = Color(parseColor("#ffffffad")), 
    val nonSemanticWhiteBackgroundStrong : Color = Color(parseColor("#ffffff")), 
    val nonSemanticWhiteBackgroundMuted : Color = Color(parseColor("#ffffffa3")), 
    val nonSemanticWhiteBackgroundOnSubtle : Color = Color(parseColor("#ffffff66")), 
    val nonSemanticWhiteBackgroundSubtle : Color = Color(parseColor("#ffffff1f")), 
    val nonSemanticWhiteBackgroundSurface : Color = Color(parseColor("#ffffff1a")), 
)

data class RedValuesContainer2 (
    val nonSemanticRedContentPrimary : Color = Color(parseColor("#30723a")), 
    val nonSemanticRedContentSecondary : Color = Color(parseColor("#9e6610")), 
    val nonSemanticRedBorderDefault : Color = Color(parseColor("#fee7e7")), 
    val nonSemanticRedBorderStrong : Color = Color(parseColor("#9e6610")), 
    val nonSemanticRedBorderSubtle : Color = Color(parseColor("#76d91c")), 
    val nonSemanticRedBackgroundStrong : Color = Color(parseColor("#9e6610")), 
    val nonSemanticRedBackgroundMuted : Color = Color(parseColor("#d15a5a")), 
    val nonSemanticRedBackgroundOnSubtle : Color = Color(parseColor("#fee7e7")), 
    val nonSemanticRedBackgroundSubtle : Color = Color(parseColor("#fef5f5")), 
    val nonSemanticRedBackgroundSurface : Color = Color(parseColor("#fffafa")), 
)

data class MagentaValuesContainer2 (
    val nonSemanticMagentaContentPrimary : Color = Color(parseColor("#671e4d")), 
    val nonSemanticMagentaContentSecondary : Color = Color(parseColor("#91ae7a")), 
    val nonSemanticMagentaBorderDefault : Color = Color(parseColor("#fde2f4")), 
    val nonSemanticMagentaBorderStrong : Color = Color(parseColor("#91ae7a")), 
    val nonSemanticMagentaBorderSubtle : Color = Color(parseColor("#f7cae8")), 
    val nonSemanticMagentaBackgroundStrong : Color = Color(parseColor("#91ae7a")), 
    val nonSemanticMagentaBackgroundMuted : Color = Color(parseColor("#fbd5ee")), 
    val nonSemanticMagentaBackgroundOnSubtle : Color = Color(parseColor("#fde2f4")), 
    val nonSemanticMagentaBackgroundSubtle : Color = Color(parseColor("#fef6fb")), 
    val nonSemanticMagentaBackgroundSurface : Color = Color(parseColor("#fffafd")), 
)

data class PurpleValuesContainer2 (
    val nonSemanticPurpleContentPrimary : Color = Color(parseColor("#5b1e67")), 
    val nonSemanticPurpleContentSecondary : Color = Color(parseColor("#9939ac")), 
    val nonSemanticPurpleBorderDefault : Color = Color(parseColor("#f8e2fd")), 
    val nonSemanticPurpleBorderStrong : Color = Color(parseColor("#9939ac")), 
    val nonSemanticPurpleBorderSubtle : Color = Color(parseColor("#c04c0d")), 
    val nonSemanticPurpleBackgroundStrong : Color = Color(parseColor("#9939ac")), 
    val nonSemanticPurpleBackgroundMuted : Color = Color(parseColor("#f5d5fb")), 
    val nonSemanticPurpleBackgroundOnSubtle : Color = Color(parseColor("#f8e2fd")), 
    val nonSemanticPurpleBackgroundSubtle : Color = Color(parseColor("#fdf5ff")), 
    val nonSemanticPurpleBackgroundSurface : Color = Color(parseColor("#fefaff")), 
)

data class VioletValuesContainer2 (
    val nonSemanticVioletContentPrimary : Color = Color(parseColor("#39288a")), 
    val nonSemanticVioletContentSecondary : Color = Color(parseColor("#634eca")), 
    val nonSemanticVioletBorderDefault : Color = Color(parseColor("#eeebff")), 
    val nonSemanticVioletBorderStrong : Color = Color(parseColor("#634eca")), 
    val nonSemanticVioletBorderSubtle : Color = Color(parseColor("#54917b")), 
    val nonSemanticVioletBackgroundStrong : Color = Color(parseColor("#634eca")), 
    val nonSemanticVioletBackgroundMuted : Color = Color(parseColor("#e3e0ff")), 
    val nonSemanticVioletBackgroundOnSubtle : Color = Color(parseColor("#eeebff")), 
    val nonSemanticVioletBackgroundSubtle : Color = Color(parseColor("#f7f5ff")), 
    val nonSemanticVioletBackgroundSurface : Color = Color(parseColor("#fbfaff")), 
)

data class BlueValuesContainer2 (
    val nonSemanticBlueContentPrimary : Color = Color(parseColor("#113997")), 
    val nonSemanticBlueContentSecondary : Color = Color(parseColor("#3061d5")), 
    val nonSemanticBlueBorderDefault : Color = Color(parseColor("#e5eeff")), 
    val nonSemanticBlueBorderStrong : Color = Color(parseColor("#3061d5")), 
    val nonSemanticBlueBorderSubtle : Color = Color(parseColor("#e30404")), 
    val nonSemanticBlueBackgroundStrong : Color = Color(parseColor("#3061d5")), 
    val nonSemanticBlueBackgroundMuted : Color = Color(parseColor("#d6e3ff")), 
    val nonSemanticBlueBackgroundOnSubtle : Color = Color(parseColor("#e5eeff")), 
    val nonSemanticBlueBackgroundSubtle : Color = Color(parseColor("#f5f8ff")), 
    val nonSemanticBlueBackgroundSurface : Color = Color(parseColor("#fafbff")), 
)

data class CyanValuesContainer2 (
    val nonSemanticCyanContentPrimary : Color = Color(parseColor("#0c636e")), 
    val nonSemanticCyanContentSecondary : Color = Color(parseColor("#0870ba")), 
    val nonSemanticCyanBorderDefault : Color = Color(parseColor("#e0f1ff")), 
    val nonSemanticCyanBorderStrong : Color = Color(parseColor("#0870ba")), 
    val nonSemanticCyanBorderSubtle : Color = Color(parseColor("#c2e2ff")), 
    val nonSemanticCyanBackgroundStrong : Color = Color(parseColor("#0870ba")), 
    val nonSemanticCyanBackgroundMuted : Color = Color(parseColor("#cce7ff")), 
    val nonSemanticCyanBackgroundOnSubtle : Color = Color(parseColor("#e0f1ff")), 
    val nonSemanticCyanBackgroundSubtle : Color = Color(parseColor("#f0f9ff")), 
    val nonSemanticCyanBackgroundSurface : Color = Color(parseColor("#fafdff")), 
)

data class TealValuesContainer2 (
    val nonSemanticTealContentPrimary : Color = Color(parseColor("#7c4fc4")), 
    val nonSemanticTealContentSecondary : Color = Color(parseColor("#077597")), 
    val nonSemanticTealBorderDefault : Color = Color(parseColor("#e0f3fa")), 
    val nonSemanticTealBorderStrong : Color = Color(parseColor("#077597")), 
    val nonSemanticTealBorderSubtle : Color = Color(parseColor("#b8e8f5")), 
    val nonSemanticTealBackgroundStrong : Color = Color(parseColor("#077597")), 
    val nonSemanticTealBackgroundMuted : Color = Color(parseColor("#c5ecf7")), 
    val nonSemanticTealBackgroundOnSubtle : Color = Color(parseColor("#e0f3fa")), 
    val nonSemanticTealBackgroundSubtle : Color = Color(parseColor("#f0fbff")), 
    val nonSemanticTealBackgroundSurface : Color = Color(parseColor("#fafeff")), 
)

data class AquamarineValuesContainer2 (
    val nonSemanticAquamarineContentPrimary : Color = Color(parseColor("#0d4a42")), 
    val nonSemanticAquamarineContentSecondary : Color = Color(parseColor("#097b68")), 
    val nonSemanticAquamarineBorderDefault : Color = Color(parseColor("#daf6f3")), 
    val nonSemanticAquamarineBorderStrong : Color = Color(parseColor("#097b68")), 
    val nonSemanticAquamarineBorderSubtle : Color = Color(parseColor("#bee9e4")), 
    val nonSemanticAquamarineBackgroundStrong : Color = Color(parseColor("#097b68")), 
    val nonSemanticAquamarineBackgroundMuted : Color = Color(parseColor("#c5f2ec")), 
    val nonSemanticAquamarineBackgroundOnSubtle : Color = Color(parseColor("#daf6f3")), 
    val nonSemanticAquamarineBackgroundSubtle : Color = Color(parseColor("#f0faf9")), 
    val nonSemanticAquamarineBackgroundSurface : Color = Color(parseColor("#fbfefe")), 
)

data class GreenValuesContainer2 (
    val nonSemanticGreenContentPrimary : Color = Color(parseColor("#b3b7b0")), 
    val nonSemanticGreenContentSecondary : Color = Color(parseColor("#2e3e58")), 
    val nonSemanticGreenBorderDefault : Color = Color(parseColor("#dff6df")), 
    val nonSemanticGreenBorderStrong : Color = Color(parseColor("#2e3e58")), 
    val nonSemanticGreenBorderSubtle : Color = Color(parseColor("#0005ff")), 
    val nonSemanticGreenBackgroundStrong : Color = Color(parseColor("#2e3e58")), 
    val nonSemanticGreenBackgroundMuted : Color = Color(parseColor("#cff2cf")), 
    val nonSemanticGreenBackgroundOnSubtle : Color = Color(parseColor("#dff6df")), 
    val nonSemanticGreenBackgroundSubtle : Color = Color(parseColor("#f4fbf4")), 
    val nonSemanticGreenBackgroundSurface : Color = Color(parseColor("#fbfefb")), 
)

data class OrangeValuesContainer2 (
    val nonSemanticOrangeContentPrimary : Color = Color(parseColor("#3f2828")), 
    val nonSemanticOrangeContentSecondary : Color = Color(parseColor("#f59638")), 
    val nonSemanticOrangeBorderDefault : Color = Color(parseColor("#ffe8d1")), 
    val nonSemanticOrangeBorderStrong : Color = Color(parseColor("#f59638")), 
    val nonSemanticOrangeBorderSubtle : Color = Color(parseColor("#ffd4a8")), 
    val nonSemanticOrangeBackgroundStrong : Color = Color(parseColor("#f59638")), 
    val nonSemanticOrangeBackgroundMuted : Color = Color(parseColor("#fcdec0")), 
    val nonSemanticOrangeBackgroundOnSubtle : Color = Color(parseColor("#ffe8d1")), 
    val nonSemanticOrangeBackgroundSubtle : Color = Color(parseColor("#fff5eb")), 
    val nonSemanticOrangeBackgroundSurface : Color = Color(parseColor("#fffcfa")), 
)

data class NonSemanticValuesContainer1 (
    val gray : GrayValuesContainer1 = GrayValuesContainer1(), 
    val white : WhiteValuesContainer1 = WhiteValuesContainer1(), 
    val red : RedValuesContainer2 = RedValuesContainer2(), 
    val magenta : MagentaValuesContainer2 = MagentaValuesContainer2(), 
    val purple : PurpleValuesContainer2 = PurpleValuesContainer2(), 
    val violet : VioletValuesContainer2 = VioletValuesContainer2(), 
    val blue : BlueValuesContainer2 = BlueValuesContainer2(), 
    val cyan : CyanValuesContainer2 = CyanValuesContainer2(), 
    val teal : TealValuesContainer2 = TealValuesContainer2(), 
    val aquamarine : AquamarineValuesContainer2 = AquamarineValuesContainer2(), 
    val green : GreenValuesContainer2 = GreenValuesContainer2(), 
    val orange : OrangeValuesContainer2 = OrangeValuesContainer2(), 
)

data class BrandValuesContainer1 (
    val semanticBrandNegative4 : Color = Color(parseColor("#041f5d")), 
    val semanticBrandNegative3 : Color = Color(parseColor("#113997")), 
    val semanticBrandNegative2 : Color = Color(parseColor("#658b6e")), 
    val semanticBrandNegative1 : Color = Color(parseColor("#ff9375")), 
    val semanticBrand0 : Color = Color(parseColor("#3061d5")), 
    val semanticBrand1 : Color = Color(parseColor("#6691f4")), 
    val semanticBrand2 : Color = Color(parseColor("#8eb0fb")), 
    val semanticBrand3 : Color = Color(parseColor("#e30404")), 
    val semanticBrand4 : Color = Color(parseColor("#d6e3ff")), 
    val semanticBrand5 : Color = Color(parseColor("#e5eeff")), 
    val semanticBrand6 : Color = Color(parseColor("#ebf0ff")), 
    val semanticBrand7 : Color = Color(parseColor("#f5f8ff")), 
    val semanticBrand8 : Color = Color(parseColor("#fafbff")), 
)

data class NeutralValuesContainer5 (
    val semanticNeutralNegative4 : Color = Color(parseColor("#1b242c")), 
    val semanticNeutralNegative3 : Color = Color(parseColor("#272e35")), 
    val semanticNeutralNegative2 : Color = Color(parseColor("#3a424a")), 
    val semanticNeutralNegative1 : Color = Color(parseColor("#4a545e")), 
    val semanticNeutral0 : Color = Color(parseColor("#555f6d")), 
    val semanticNeutral1 : Color = Color(parseColor("#7e8c9a")), 
    val semanticNeutral2 : Color = Color(parseColor("#9ea8b3")), 
    val semanticNeutral3 : Color = Color(parseColor("#cfd6dd")), 
    val semanticNeutral4 : Color = Color(parseColor("#dee3e7")), 
    val semanticNeutral5 : Color = Color(parseColor("#eaedf0")), 
    val semanticNeutral6 : Color = Color(parseColor("#f0f3f5")), 
    val semanticNeutral7 : Color = Color(parseColor("#f5f7f9")), 
    val semanticNeutral8 : Color = Color(parseColor("#fcfcfd")), 
)

data class NeutralAlphaValuesContainer1 (
    val semanticNeutralANegative4 : Color = Color(parseColor("#09131aed")), 
    val semanticNeutralANegative3 : Color = Color(parseColor("#0a121ae0")), 
    val semanticNeutralANegative2 : Color = Color(parseColor("#1a232ddb")), 
    val semanticNeutralANegative1 : Color = Color(parseColor("#1d2835cc")), 
    val semanticNeutralA0 : Color = Color(parseColor("#182639bd")), 
    val semanticNeutralA1 : Color = Color(parseColor("#1830498f")), 
    val semanticNeutralA2 : Color = Color(parseColor("#0d253f66")), 
    val semanticNeutralA3 : Color = Color(parseColor("#10315633")), 
    val semanticNeutralA4 : Color = Color(parseColor("#04294321")), 
    val semanticNeutralA5 : Color = Color(parseColor("#10284717")), 
    val semanticNeutralA6 : Color = Color(parseColor("#022e500f")), 
    val semanticNeutralA7 : Color = Color(parseColor("#00295c0a")), 
    val semanticNeutralA8 : Color = Color(parseColor("#1f529e05")), 
)

data class InfoValuesContainer1 (
    val semanticInfoNegative4 : Color = Color(parseColor("#041f5d")), 
    val semanticInfoNegative3 : Color = Color(parseColor("#113997")), 
    val semanticInfoNegative2 : Color = Color(parseColor("#658b6e")), 
    val semanticInfoNegative1 : Color = Color(parseColor("#ff9375")), 
    val semanticInfo0 : Color = Color(parseColor("#3061d5")), 
    val semanticInfo1 : Color = Color(parseColor("#6691f4")), 
    val semanticInfo2 : Color = Color(parseColor("#8eb0fb")), 
    val semanticInfo3 : Color = Color(parseColor("#e30404")), 
    val semanticInfo4 : Color = Color(parseColor("#d6e3ff")), 
    val semanticInfo5 : Color = Color(parseColor("#e5eeff")), 
    val semanticInfo6 : Color = Color(parseColor("#ebf0ff")), 
    val semanticInfo7 : Color = Color(parseColor("#f5f8ff")), 
    val semanticInfo8 : Color = Color(parseColor("#fafbff")), 
)

data class SuccessValuesContainer3 (
    val semanticSuccessNegative4 : Color = Color(parseColor("#0a2e0b")), 
    val semanticSuccessNegative3 : Color = Color(parseColor("#b3b7b0")), 
    val semanticSuccessNegative2 : Color = Color(parseColor("#246626")), 
    val semanticSuccessNegative1 : Color = Color(parseColor("#2f6f2f")), 
    val semanticSuccess0 : Color = Color(parseColor("#2e3e58")), 
    val semanticSuccess1 : Color = Color(parseColor("#55a555")), 
    val semanticSuccess2 : Color = Color(parseColor("#fdff84")), 
    val semanticSuccess3 : Color = Color(parseColor("#0005ff")), 
    val semanticSuccess4 : Color = Color(parseColor("#cff2cf")), 
    val semanticSuccess5 : Color = Color(parseColor("#dff6df")), 
    val semanticSuccess6 : Color = Color(parseColor("#e6f9e6")), 
    val semanticSuccess7 : Color = Color(parseColor("#f4fbf4")), 
    val semanticSuccess8 : Color = Color(parseColor("#fbfefb")), 
)

data class WarningValuesContainer1 (
    val semanticWarningNegative4 : Color = Color(parseColor("#492909")), 
    val semanticWarningNegative3 : Color = Color(parseColor("#3f2828")), 
    val semanticWarningNegative2 : Color = Color(parseColor("#a05c1c")), 
    val semanticWarningNegative1 : Color = Color(parseColor("#b4610e")), 
    val semanticWarning0 : Color = Color(parseColor("#f59638")), 
    val semanticWarning1 : Color = Color(parseColor("#f6a351")), 
    val semanticWarning2 : Color = Color(parseColor("#feb871")), 
    val semanticWarning3 : Color = Color(parseColor("#ffd4a8")), 
    val semanticWarning4 : Color = Color(parseColor("#fcdec0")), 
    val semanticWarning5 : Color = Color(parseColor("#ffe8d1")), 
    val semanticWarning6 : Color = Color(parseColor("#fff0e0")), 
    val semanticWarning7 : Color = Color(parseColor("#fff5eb")), 
    val semanticWarning8 : Color = Color(parseColor("#fffcfa")), 
)

data class DangerValuesContainer5 (
    val semanticDangerNegative4 : Color = Color(parseColor("#4a0d0d")), 
    val semanticDangerNegative3 : Color = Color(parseColor("#30723a")), 
    val semanticDangerNegative2 : Color = Color(parseColor("#63c7c3")), 
    val semanticDangerNegative1 : Color = Color(parseColor("#a13636")), 
    val semanticDanger0 : Color = Color(parseColor("#9e6610")), 
    val semanticDanger1 : Color = Color(parseColor("#285aa5")), 
    val semanticDanger2 : Color = Color(parseColor("#494b75")), 
    val semanticDanger3 : Color = Color(parseColor("#76d91c")), 
    val semanticDanger4 : Color = Color(parseColor("#d15a5a")), 
    val semanticDanger5 : Color = Color(parseColor("#fee7e7")), 
    val semanticDanger6 : Color = Color(parseColor("#ffebeb")), 
    val semanticDanger7 : Color = Color(parseColor("#fef5f5")), 
    val semanticDanger8 : Color = Color(parseColor("#fffafa")), 
)

data class SemanticValuesContainer1 (
    val brand : BrandValuesContainer1 = BrandValuesContainer1(), 
    val neutral : NeutralValuesContainer5 = NeutralValuesContainer5(), 
    val neutralAlpha : NeutralAlphaValuesContainer1 = NeutralAlphaValuesContainer1(), 
    val info : InfoValuesContainer1 = InfoValuesContainer1(), 
    val success : SuccessValuesContainer3 = SuccessValuesContainer3(), 
    val warning : WarningValuesContainer1 = WarningValuesContainer1(), 
    val danger : DangerValuesContainer5 = DangerValuesContainer5(), 
)

data class CoolGrayValuesContainer1 (
    val negative4 : Color = Color(parseColor("#1b242c")), 
    val negative3 : Color = Color(parseColor("#272e35")), 
    val negative2 : Color = Color(parseColor("#3a424a")), 
    val negative1 : Color = Color(parseColor("#4a545e")), 
    val coolGray0 : Color = Color(parseColor("#555f6d")), 
    val coolGray1 : Color = Color(parseColor("#7e8c9a")), 
    val coolGray2 : Color = Color(parseColor("#9ea8b3")), 
    val coolGray3 : Color = Color(parseColor("#cfd6dd")), 
    val coolGray4 : Color = Color(parseColor("#dee3e7")), 
    val coolGray5 : Color = Color(parseColor("#eaedf0")), 
    val coolGray6 : Color = Color(parseColor("#f0f3f5")), 
    val coolGray7 : Color = Color(parseColor("#f5f7f9")), 
    val coolGray8 : Color = Color(parseColor("#fcfcfd")), 
)

data class CoolGrayAlphaValuesContainer1 (
    val coolGrayANegative4 : Color = Color(parseColor("#09131aed")), 
    val coolGrayANegative3 : Color = Color(parseColor("#0a121ae0")), 
    val coolGrayANegative2 : Color = Color(parseColor("#1a232ddb")), 
    val coolGrayANegative1 : Color = Color(parseColor("#1d2835cc")), 
    val coolGrayA0 : Color = Color(parseColor("#182639bd")), 
    val coolGrayA1 : Color = Color(parseColor("#1830498f")), 
    val coolGrayA2 : Color = Color(parseColor("#0d253f66")), 
    val coolGrayA3 : Color = Color(parseColor("#10315633")), 
    val coolGrayA4 : Color = Color(parseColor("#04294321")), 
    val coolGrayA5 : Color = Color(parseColor("#10284717")), 
    val coolGrayA6 : Color = Color(parseColor("#022e500f")), 
    val coolGrayA7 : Color = Color(parseColor("#00295c0a")), 
    val coolGrayA8 : Color = Color(parseColor("#1f529e05")), 
)

data class NeutralGrayValuesContainer1 (
    val negative4 : Color = Color(parseColor("#212121")), 
    val negative3 : Color = Color(parseColor("#2e2e2e")), 
    val negative2 : Color = Color(parseColor("#404040")), 
    val negative1 : Color = Color(parseColor("#525252")), 
    val neutralGray0 : Color = Color(parseColor("#5e5e5e")), 
    val neutralGray1 : Color = Color(parseColor("#8a8a8a")), 
    val neutralGray2 : Color = Color(parseColor("#a6a6a6")), 
    val neutralGray3 : Color = Color(parseColor("#d6d6d6")), 
    val neutralGray4 : Color = Color(parseColor("#e3e3e3")), 
    val neutralGray5 : Color = Color(parseColor("#ebebeb")), 
    val neutralGray6 : Color = Color(parseColor("#f2f2f2")), 
    val neutralGray7 : Color = Color(parseColor("#f7f7f7")), 
    val neutralGray8 : Color = Color(parseColor("#fcfcfc")), 
)

data class NeutralGrayAlphaValuesContainer1 (
    val neutralGrayANegative4 : Color = Color(parseColor("#121212ed")), 
    val neutralGrayANegative3 : Color = Color(parseColor("#0f0f0fe0")), 
    val neutralGrayANegative2 : Color = Color(parseColor("#212121db")), 
    val neutralGrayANegative1 : Color = Color(parseColor("#262626cc")), 
    val neutralGrayA0 : Color = Color(parseColor("#262627bd")), 
    val neutralGrayA1 : Color = Color(parseColor("#2b2b2b8f")), 
    val neutralGrayA2 : Color = Color(parseColor("#21212166")), 
    val neutralGrayA3 : Color = Color(parseColor("#2e2e2e33")), 
    val neutralGrayA4 : Color = Color(parseColor("#1f1f1f21")), 
    val neutralGrayA5 : Color = Color(parseColor("#1c1c1c17")), 
    val neutralGrayA6 : Color = Color(parseColor("#2121210f")), 
    val neutralGrayA7 : Color = Color(parseColor("#2e2e2e0a")), 
    val neutralGrayA8 : Color = Color(parseColor("#52525205")), 
)

data class WarmGrayValuesContainer1 (
    val negative4 : Color = Color(parseColor("#222220")), 
    val negative3 : Color = Color(parseColor("#30302c")), 
    val negative2 : Color = Color(parseColor("#40403a")), 
    val negative1 : Color = Color(parseColor("#52524c")), 
    val warmGray0 : Color = Color(parseColor("#5f5f58")), 
    val warmGray1 : Color = Color(parseColor("#8b8b84")), 
    val warmGray2 : Color = Color(parseColor("#a8a89f")), 
    val warmGray3 : Color = Color(parseColor("#e3e305")), 
    val warmGray4 : Color = Color(parseColor("#e5e5e1")), 
    val warmGray5 : Color = Color(parseColor("#eaeae6")), 
    val warmGray6 : Color = Color(parseColor("#f3f3f1")), 
    val warmGray7 : Color = Color(parseColor("#f8f8f7")), 
    val warmGray8 : Color = Color(parseColor("#fdfdfc")), 
)

data class WarmGrayAlphaValuesContainer1 (
    val warmGrayANegative4 : Color = Color(parseColor("#131311ed")), 
    val warmGrayANegative3 : Color = Color(parseColor("#12120de0")), 
    val warmGrayANegative2 : Color = Color(parseColor("#22221bdb")), 
    val warmGrayANegative1 : Color = Color(parseColor("#272720cc")), 
    val warmGrayA0 : Color = Color(parseColor("#26261cbd")), 
    val warmGrayA1 : Color = Color(parseColor("#2f2f238f")), 
    val warmGrayA2 : Color = Color(parseColor("#28281166")), 
    val warmGrayA3 : Color = Color(parseColor("#3e3e1d33")), 
    val warmGrayA4 : Color = Color(parseColor("#33331421")), 
    val warmGrayA5 : Color = Color(parseColor("#22220217")), 
    val warmGrayA6 : Color = Color(parseColor("#2f2f0e0f")), 
    val warmGrayA7 : Color = Color(parseColor("#2f2f2d0a")), 
    val warmGrayA8 : Color = Color(parseColor("#52525205")), 
)

data class WhiteAlphaValuesContainer1 (
    val whiteANegative12 : Color = Color(parseColor("#ffffff05")), 
    val whiteANegative11 : Color = Color(parseColor("#ffffff08")), 
    val whiteANegative10 : Color = Color(parseColor("#ffffff0d")), 
    val whiteANegative9 : Color = Color(parseColor("#ffffff14")), 
    val whiteANegative8 : Color = Color(parseColor("#ffffff1a")), 
    val whiteANegative7 : Color = Color(parseColor("#ffffff1f")), 
    val whiteANegative6 : Color = Color(parseColor("#ffffff3d")), 
    val whiteANegative5 : Color = Color(parseColor("#ffffff66")), 
    val whiteANegative4 : Color = Color(parseColor("#ffffffa3")), 
    val whiteANegative3 : Color = Color(parseColor("#ffffffad")), 
    val whiteANegative2 : Color = Color(parseColor("#ffffffb8")), 
    val whiteANegative1 : Color = Color(parseColor("#ffffffd1")), 
    val whiteA0 : Color = Color(parseColor("#ffffff")), 
)

data class RedValuesContainer3 (
    val negative4 : Color = Color(parseColor("#4a0d0d")), 
    val negative3 : Color = Color(parseColor("#30723a")), 
    val negative2 : Color = Color(parseColor("#63c7c3")), 
    val negative1 : Color = Color(parseColor("#a13636")), 
    val red0 : Color = Color(parseColor("#9e6610")), 
    val red1 : Color = Color(parseColor("#285aa5")), 
    val red2 : Color = Color(parseColor("#494b75")), 
    val red3 : Color = Color(parseColor("#76d91c")), 
    val red4 : Color = Color(parseColor("#d15a5a")), 
    val red5 : Color = Color(parseColor("#fee7e7")), 
    val red6 : Color = Color(parseColor("#ffebeb")), 
    val red7 : Color = Color(parseColor("#fef5f5")), 
    val red8 : Color = Color(parseColor("#fffafa")), 
)

data class MagentaValuesContainer3 (
    val negative4 : Color = Color(parseColor("#410b2f")), 
    val negative3 : Color = Color(parseColor("#671e4d")), 
    val negative2 : Color = Color(parseColor("#f70aa8")), 
    val negative1 : Color = Color(parseColor("#953274")), 
    val magenta0 : Color = Color(parseColor("#91ae7a")), 
    val magenta1 : Color = Color(parseColor("#5d9ede")), 
    val magenta2 : Color = Color(parseColor("#ec89cb")), 
    val magenta3 : Color = Color(parseColor("#f7cae8")), 
    val magenta4 : Color = Color(parseColor("#fbd5ee")), 
    val magenta5 : Color = Color(parseColor("#fde2f4")), 
    val magenta6 : Color = Color(parseColor("#fdedf8")), 
    val magenta7 : Color = Color(parseColor("#fef6fb")), 
    val magenta8 : Color = Color(parseColor("#fffafd")), 
)

data class PurpleValuesContainer3 (
    val negative4 : Color = Color(parseColor("#410b2f")), 
    val negative3 : Color = Color(parseColor("#5b1e67")), 
    val negative2 : Color = Color(parseColor("#792989")), 
    val negative1 : Color = Color(parseColor("#853295")), 
    val purple0 : Color = Color(parseColor("#9939ac")), 
    val purple1 : Color = Color(parseColor("#4e82ee")), 
    val purple2 : Color = Color(parseColor("#d98eec")), 
    val purple3 : Color = Color(parseColor("#c04c0d")), 
    val purple4 : Color = Color(parseColor("#f5d5fb")), 
    val purple5 : Color = Color(parseColor("#f8e2fd")), 
    val purple6 : Color = Color(parseColor("#faedfd")), 
    val purple7 : Color = Color(parseColor("#fdf5ff")), 
    val purple8 : Color = Color(parseColor("#fefaff")), 
)

data class VioletValuesContainer3 (
    val negative4 : Color = Color(parseColor("#201263")), 
    val negative3 : Color = Color(parseColor("#39288a")), 
    val negative2 : Color = Color(parseColor("#161617")), 
    val negative1 : Color = Color(parseColor("#0e0406")), 
    val violet0 : Color = Color(parseColor("#634eca")), 
    val violet1 : Color = Color(parseColor("#927ef1")), 
    val violet2 : Color = Color(parseColor("#aba2fb")), 
    val violet3 : Color = Color(parseColor("#54917b")), 
    val violet4 : Color = Color(parseColor("#e3e0ff")), 
    val violet5 : Color = Color(parseColor("#eeebff")), 
    val violet6 : Color = Color(parseColor("#f3f0ff")), 
    val violet7 : Color = Color(parseColor("#f7f5ff")), 
    val violet8 : Color = Color(parseColor("#fbfaff")), 
)

data class BlueValuesContainer3 (
    val negative4 : Color = Color(parseColor("#041f5d")), 
    val negative3 : Color = Color(parseColor("#113997")), 
    val negative2 : Color = Color(parseColor("#658b6e")), 
    val negative1 : Color = Color(parseColor("#ff9375")), 
    val blue0 : Color = Color(parseColor("#3061d5")), 
    val blue1 : Color = Color(parseColor("#6691f4")), 
    val blue2 : Color = Color(parseColor("#8eb0fb")), 
    val blue3 : Color = Color(parseColor("#e30404")), 
    val blue4 : Color = Color(parseColor("#d6e3ff")), 
    val blue5 : Color = Color(parseColor("#e5eeff")), 
    val blue6 : Color = Color(parseColor("#ebf0ff")), 
    val blue7 : Color = Color(parseColor("#f5f8ff")), 
    val blue8 : Color = Color(parseColor("#fafbff")), 
)

data class CyanValuesContainer3 (
    val negative4 : Color = Color(parseColor("#002742")), 
    val negative3 : Color = Color(parseColor("#0c636e")), 
    val negative2 : Color = Color(parseColor("#165c8d")), 
    val negative1 : Color = Color(parseColor("#60a0cf")), 
    val cyan0 : Color = Color(parseColor("#0870ba")), 
    val cyan1 : Color = Color(parseColor("#5699dc")), 
    val cyan2 : Color = Color(parseColor("#79bcf6")), 
    val cyan3 : Color = Color(parseColor("#c2e2ff")), 
    val cyan4 : Color = Color(parseColor("#cce7ff")), 
    val cyan5 : Color = Color(parseColor("#e0f1ff")), 
    val cyan6 : Color = Color(parseColor("#ebf5ff")), 
    val cyan7 : Color = Color(parseColor("#f0f9ff")), 
    val cyan8 : Color = Color(parseColor("#fafdff")), 
)

data class TealValuesContainer3 (
    val negative4 : Color = Color(parseColor("#012a37")), 
    val negative3 : Color = Color(parseColor("#7c4fc4")), 
    val negative2 : Color = Color(parseColor("#d1d2d2")), 
    val negative1 : Color = Color(parseColor("#196c85")), 
    val teal0 : Color = Color(parseColor("#077597")), 
    val teal1 : Color = Color(parseColor("#4f9eba")), 
    val teal2 : Color = Color(parseColor("#7ac0dc")), 
    val teal3 : Color = Color(parseColor("#b8e8f5")), 
    val teal4 : Color = Color(parseColor("#c5ecf7")), 
    val teal5 : Color = Color(parseColor("#e0f3fa")), 
    val teal6 : Color = Color(parseColor("#e8f7fc")), 
    val teal7 : Color = Color(parseColor("#f0fbff")), 
    val teal8 : Color = Color(parseColor("#fafeff")), 
)

data class AquamarineValuesContainer3 (
    val negative4 : Color = Color(parseColor("#012d26")), 
    val negative3 : Color = Color(parseColor("#0d4a42")), 
    val negative2 : Color = Color(parseColor("#15665b")), 
    val negative1 : Color = Color(parseColor("#1a7061")), 
    val aquamarine0 : Color = Color(parseColor("#097b68")), 
    val aquamarine1 : Color = Color(parseColor("#3da496")), 
    val aquamarine2 : Color = Color(parseColor("#6ec9bf")), 
    val aquamarine4 : Color = Color(parseColor("#c5f2ec")), 
    val aquamarine3 : Color = Color(parseColor("#bee9e4")), 
    val aquamarine5 : Color = Color(parseColor("#daf6f3")), 
    val aquamarine6 : Color = Color(parseColor("#e2f8f5")), 
    val aquamarine7 : Color = Color(parseColor("#f0faf9")), 
    val aquamarine8 : Color = Color(parseColor("#fbfefe")), 
)

data class GreenValuesContainer3 (
    val negative4 : Color = Color(parseColor("#0a2e0b")), 
    val negative3 : Color = Color(parseColor("#b3b7b0")), 
    val negative2 : Color = Color(parseColor("#246626")), 
    val negative1 : Color = Color(parseColor("#2f6f2f")), 
    val green0 : Color = Color(parseColor("#2e3e58")), 
    val green1 : Color = Color(parseColor("#55a555")), 
    val green2 : Color = Color(parseColor("#fdff84")), 
    val green3 : Color = Color(parseColor("#0005ff")), 
    val green4 : Color = Color(parseColor("#cff2cf")), 
    val green5 : Color = Color(parseColor("#dff6df")), 
    val green6 : Color = Color(parseColor("#e6f9e6")), 
    val green7 : Color = Color(parseColor("#f4fbf4")), 
    val green8 : Color = Color(parseColor("#fbfefb")), 
)

data class OrangeValuesContainer3 (
    val negative4 : Color = Color(parseColor("#492909")), 
    val negative3 : Color = Color(parseColor("#3f2828")), 
    val negative2 : Color = Color(parseColor("#a05c1c")), 
    val negative1 : Color = Color(parseColor("#b4610e")), 
    val orange0 : Color = Color(parseColor("#f59638")), 
    val orange1 : Color = Color(parseColor("#f6a351")), 
    val orange2 : Color = Color(parseColor("#feb871")), 
    val orange3 : Color = Color(parseColor("#ffd4a8")), 
    val orange4 : Color = Color(parseColor("#fcdec0")), 
    val orange5 : Color = Color(parseColor("#ffe8d1")), 
    val orange6 : Color = Color(parseColor("#fff0e0")), 
    val orange7 : Color = Color(parseColor("#fff5eb")), 
    val orange8 : Color = Color(parseColor("#fffcfa")), 
)

data class TransparentValuesContainer1 (
    val transparent : Color = Color(parseColor("#ffffff00")), 
)

data class ColorValuesContainer1 (
    val content : ContentValuesContainer1 = ContentValuesContainer1(), 
    val border : BorderValuesContainer2 = BorderValuesContainer2(), 
    val background : BackgroundValuesContainer2 = BackgroundValuesContainer2(), 
    val action : ActionValuesContainer1 = ActionValuesContainer1(), 
    val interaction : InteractionValuesContainer1 = InteractionValuesContainer1(), 
    val nonSemantic : NonSemanticValuesContainer1 = NonSemanticValuesContainer1(), 
    val semantic : SemanticValuesContainer1 = SemanticValuesContainer1(), 
    val coolGray : CoolGrayValuesContainer1 = CoolGrayValuesContainer1(), 
    val coolGrayAlpha : CoolGrayAlphaValuesContainer1 = CoolGrayAlphaValuesContainer1(), 
    val neutralGray : NeutralGrayValuesContainer1 = NeutralGrayValuesContainer1(), 
    val neutralGrayAlpha : NeutralGrayAlphaValuesContainer1 = NeutralGrayAlphaValuesContainer1(), 
    val warmGray : WarmGrayValuesContainer1 = WarmGrayValuesContainer1(), 
    val warmGrayAlpha : WarmGrayAlphaValuesContainer1 = WarmGrayAlphaValuesContainer1(), 
    val whiteAlpha : WhiteAlphaValuesContainer1 = WhiteAlphaValuesContainer1(), 
    val red : RedValuesContainer3 = RedValuesContainer3(), 
    val magenta : MagentaValuesContainer3 = MagentaValuesContainer3(), 
    val purple : PurpleValuesContainer3 = PurpleValuesContainer3(), 
    val violet : VioletValuesContainer3 = VioletValuesContainer3(), 
    val blue : BlueValuesContainer3 = BlueValuesContainer3(), 
    val cyan : CyanValuesContainer3 = CyanValuesContainer3(), 
    val teal : TealValuesContainer3 = TealValuesContainer3(), 
    val aquamarine : AquamarineValuesContainer3 = AquamarineValuesContainer3(), 
    val green : GreenValuesContainer3 = GreenValuesContainer3(), 
    val orange : OrangeValuesContainer3 = OrangeValuesContainer3(), 
    val transparent : TransparentValuesContainer1 = TransparentValuesContainer1(), 
)

data class BorderWidthValuesContainer1 (
    val focus : Double = 1.0, 
    val none : Double = 0.0, 
    val small : Double = 1.0, 
    val medium : Double = 2.0, 
    val large : Double = 4.0, 
    val xLarge : Double = 8.0, 
    val borderWidth0 : Double = 0.0, 
    val borderWidth100 : Double = 1.0, 
    val borderWidth200 : Double = 2.0, 
    val borderWidth400 : Double = 4.0, 
    val borderWidth800 : Double = 8.0, 
)

data class BorderRadiusValuesContainer1 (
    val none : Double = 0.0, 
    val small : Double = 2.0, 
    val medium : Double = 4.0, 
    val large : Double = 8.0, 
    val xLarge : Double = 12.0, 
    val borderRadius2xLarge : Double = 16.0, 
    val borderRadius3xLarge : Double = 20.0, 
    val borderRadius4xLarge : Double = 24.0, 
    val full : Double = 999.0, 
    val borderRadius0 : Double = 0.0, 
    val borderRadius25 : Double = 2.0, 
    val borderRadius50 : Double = 4.0, 
    val borderRadius100 : Double = 8.0, 
    val borderRadius150 : Double = 12.0, 
    val borderRadius200 : Double = 16.0, 
    val borderRadius250 : Double = 20.0, 
    val borderRadius300 : Double = 24.0, 
    val borderRadius999 : Double = 999.0, 
)

data class SizeValuesContainer1 (
    val size3xLarge : Double = 72.0, 
    val size2xLarge : Double = 64.0, 
    val xLarge : Double = 56.0, 
    val large : Double = 48.0, 
    val medium : Double = 40.0, 
    val small : Double = 32.0, 
    val xSmall : Double = 24.0, 
    val size2xSmall : Double = 20.0, 
    val size3xSmall : Double = 16.0, 
)

data class PaddingValuesContainer1 (
    val none : Double = 0.0, 
    val padding2xSmall : Double = 2.0, 
    val xSmall : Double = 4.0, 
    val small : Double = 8.0, 
    val medium : Double = 12.0, 
    val large : Double = 16.0, 
    val padding2xLarge : Double = 24.0, 
    val padding3xLarge : Double = 32.0, 
    val padding4xLarge : Double = 40.0, 
    val padding5xLarge : Double = 44.0, 
    val padding6xLarge : Double = 64.0, 
)

data class GapValuesContainer1 (
    val none : Double = 0.0, 
    val gap2xSmall : Double = 2.0, 
    val xSmall : Double = 4.0, 
    val small : Double = 8.0, 
    val medium : Double = 12.0, 
    val large : Double = 16.0, 
    val xLarge : Double = 24.0, 
    val gap2xLarge : Double = 32.0, 
    val gap3xLarge : Double = 44.0, 
)

data class SpaceValuesContainer1 (
    val padding : PaddingValuesContainer1 = PaddingValuesContainer1(), 
    val gap : GapValuesContainer1 = GapValuesContainer1(), 
)

data class OpacityValuesContainer1 (
    val disabled : Double = 0.5, 
    val opacity0 : Double = 0.0, 
    val opacity50 : Double = 0.5, 
    val opacity100 : Double = 1.0, 
)

data class CodeValuesContainer1 (
    val typographyCodeSmall : Typography = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 400.0, fontSize = 12.0, fontFamily = "Noto Sans Mono"), 
    val typographyCodeMedium : Typography = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 400.0, fontSize = 14.0, fontFamily = "Noto Sans Mono"), 
    val typographyCodeLarge : Typography = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 400.0, fontSize = 16.0, fontFamily = "Noto Sans Mono"), 
)

data class UtilityValuesContainer1 (
    val typographyUtilitySmall : Typography = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 500.0, fontSize = 12.0, fontFamily = "Noto Sans"), 
    val typographyUtilityMedium : Typography = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 500.0, fontSize = 14.0, fontFamily = "Noto Sans"), 
    val typographyUtilityLarge : Typography = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 500.0, fontSize = 16.0, fontFamily = "Noto Sans"), 
)

data class BodyValuesContainer1 (
    val typographyBodySmall : Typography = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 400.0, fontSize = 12.0, fontFamily = "Noto Sans"), 
    val typographyBodyMedium : Typography = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 400.0, fontSize = 14.0, fontFamily = "Noto Sans"), 
    val typographyBodyLarge : Typography = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 400.0, fontSize = 16.0, fontFamily = "Noto Sans"), 
)

data class HeadingValuesContainer1 (
    val typographyHeadingSmall : Typography = Typography(lineHeight = 16.0, letterSpacing = 0.0, fontWeight = 700.0, fontSize = 12.0, fontFamily = "Noto Sans"), 
    val typographyHeadingMedium : Typography = Typography(lineHeight = 20.0, letterSpacing = -0.006, fontWeight = 700.0, fontSize = 14.0, fontFamily = "Noto Sans"), 
    val typographyHeadingLarge : Typography = Typography(lineHeight = 22.0, letterSpacing = -0.011, fontWeight = 700.0, fontSize = 16.0, fontFamily = "Noto Sans"), 
    val typographyHeadingXLarge : Typography = Typography(lineHeight = 24.0, letterSpacing = -0.014, fontWeight = 700.0, fontSize = 18.0, fontFamily = "Noto Sans"), 
    val typographyHeading2xLarge : Typography = Typography(lineHeight = 26.0, letterSpacing = -0.017, fontWeight = 700.0, fontSize = 20.0, fontFamily = "Noto Sans"), 
    val typographyHeading3xLarge : Typography = Typography(lineHeight = 32.0, letterSpacing = -0.019, fontWeight = 700.0, fontSize = 24.0, fontFamily = "Noto Sans"), 
    val typographyHeading4xLarge : Typography = Typography(lineHeight = 38.0, letterSpacing = -0.021, fontWeight = 700.0, fontSize = 28.0, fontFamily = "Noto Sans"), 
    val typographyHeading5xLarge : Typography = Typography(lineHeight = 42.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 32.0, fontFamily = "Noto Sans"), 
    val typographyHeading6xLarge : Typography = Typography(lineHeight = 48.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 36.0, fontFamily = "Noto Sans"), 
    val typographyHeading7xLarge : Typography = Typography(lineHeight = 56.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 42.0, fontFamily = "Noto Sans"), 
    val typographyHeading8xLarge : Typography = Typography(lineHeight = 58.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 48.0, fontFamily = "Noto Sans"), 
    val typographyHeading9xLarge : Typography = Typography(lineHeight = 66.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 54.0, fontFamily = "Noto Sans"), 
)

data class DisplayValuesContainer1 (
    val typographyDisplaySmall : Typography = Typography(lineHeight = 66.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 54.0, fontFamily = "Noto Sans"), 
    val typographyDisplayMedium : Typography = Typography(lineHeight = 72.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 60.0, fontFamily = "Noto Sans"), 
    val typographyDisplayLarge : Typography = Typography(lineHeight = 82.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 68.0, fontFamily = "Noto Sans"), 
    val typographyDisplayXLarge : Typography = Typography(lineHeight = 92.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 76.0, fontFamily = "Noto Sans"), 
    val typographyDisplay2xLarge : Typography = Typography(lineHeight = 102.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 84.0, fontFamily = "Noto Sans"), 
    val typographyDisplay3xLarge : Typography = Typography(lineHeight = 112.0, letterSpacing = -0.022, fontWeight = 700.0, fontSize = 92.0, fontFamily = "Noto Sans"), 
)

data class TypographyValuesContainer1 (
    val code : CodeValuesContainer1 = CodeValuesContainer1(), 
    val utility : UtilityValuesContainer1 = UtilityValuesContainer1(), 
    val body : BodyValuesContainer1 = BodyValuesContainer1(), 
    val heading : HeadingValuesContainer1 = HeadingValuesContainer1(), 
    val display : DisplayValuesContainer1 = DisplayValuesContainer1(), 
)

data class DimensionValuesContainer1 (
    val dimension0 : Double = 0.0, 
    val dimension25 : Double = 2.0, 
    val dimension50 : Double = 4.0, 
    val dimension100 : Double = 8.0, 
    val dimension150 : Double = 12.0, 
    val dimension200 : Double = 16.0, 
    val dimension250 : Double = 20.0, 
    val dimension300 : Double = 24.0, 
    val dimension400 : Double = 32.0, 
    val dimension500 : Double = 40.0, 
    val dimension550 : Double = 44.0, 
    val dimension600 : Double = 48.0, 
    val dimension700 : Double = 56.0, 
    val dimension800 : Double = 64.0, 
    val dimension900 : Double = 72.0, 
    val dimension1000 : Double = 80.0, 
    val dimension1200 : Double = 96.0, 
    val dimension1500 : Double = 120.0, 
    val dimension1600 : Double = 128.0, 
)

data class BottomValuesContainer1 (
    val elevationBottom100 : BoxShadow = BoxShadow(y = 1.0, x = 0.0, type = "dropShadow", spread = 0.0, color = "#1b242c1f", blur = 2.0), 
    val elevationBottom200 : List<BoxShadow> = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c14", blur = 8.0)), 
    val elevationBottom300 : List<BoxShadow> = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 8.0, x = 0.0, type = "dropShadow", spread = -2.0, color = "#1b242c1f", blur = 16.0)), 
    val elevationBottom400 : List<BoxShadow> = listOf(BoxShadow(y = 2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = 16.0, x = 0.0, type = "dropShadow", spread = -6.0, color = "#1b242c29", blur = 24.0)), 
)

data class TopValuesContainer1 (
    val elevationTop100 : BoxShadow = BoxShadow(y = -1.0, x = 0.0, type = "dropShadow", spread = 0.0, color = "#1b242c1f", blur = 2.0), 
    val elevationTop200 : List<BoxShadow> = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c14", blur = 8.0)), 
    val elevationTop300 : List<BoxShadow> = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -8.0, x = 0.0, type = "dropShadow", spread = -2.0, color = "#1b242c1f", blur = 16.0)), 
    val elevationTop400 : List<BoxShadow> = listOf(BoxShadow(y = -2.0, x = 0.0, type = "dropShadow", spread = -1.0, color = "#1b242c0a", blur = 2.0), BoxShadow(y = -16.0, x = 0.0, type = "dropShadow", spread = -6.0, color = "#1b242c29", blur = 24.0)), 
)

data class ElevationValuesContainer1 (
    val bottom : BottomValuesContainer1 = BottomValuesContainer1(), 
    val top : TopValuesContainer1 = TopValuesContainer1(), 
)

data class FontFamilyValuesContainer1 (
    val sans : String = "Noto Sans", 
    val serif : String = "Noto Serif", 
    val mono : String = "Noto Sans Mono", 
)

data class FontSizeValuesContainer1 (
    val fontSize100 : Double = 8.0, 
    val fontSize125 : Double = 10.0, 
    val fontSize150 : Double = 12.0, 
    val fontSize175 : Double = 14.0, 
    val fontSize200 : Double = 16.0, 
    val fontSize225 : Double = 18.0, 
    val fontSize250 : Double = 20.0, 
    val fontSize300 : Double = 24.0, 
    val fontSize350 : Double = 28.0, 
    val fontSize400 : Double = 32.0, 
    val fontSize450 : Double = 36.0, 
    val fontSize525 : Double = 42.0, 
    val fontSize600 : Double = 48.0, 
    val fontSize675 : Double = 54.0, 
    val fontSize750 : Double = 60.0, 
    val fontSize850 : Double = 68.0, 
    val fontSize950 : Double = 76.0, 
    val fontSize1050 : Double = 84.0, 
    val fontSize1150 : Double = 92.0, 
)

data class FontWeightValuesContainer1 (
    val fontWeight300 : Double = 300.0, 
    val fontWeight400 : Double = 400.0, 
    val fontWeight500 : Double = 500.0, 
    val fontWeight600 : Double = 600.0, 
    val fontWeight700 : Double = 700.0, 
)

data class LetterSpacingValuesContainer1 (
    val letterSpacing0 : Double = 0.0, 
    val letterSpacing100 : Double = -0.006, 
    val letterSpacing200 : Double = -0.011, 
    val letterSpacing300 : Double = -0.014, 
    val letterSpacing400 : Double = -0.017, 
    val letterSpacing500 : Double = -0.019, 
    val letterSpacing600 : Double = -0.021, 
    val letterSpacing700 : Double = -0.022, 
)

data class LineHeightValuesContainer1 (
    val value150 : Double = 12.0, 
    val value200 : Double = 16.0, 
    val value250 : Double = 20.0, 
    val value275 : Double = 22.0, 
    val value300 : Double = 24.0, 
    val value325 : Double = 26.0, 
    val value400 : Double = 32.0, 
    val value475 : Double = 38.0, 
    val value525 : Double = 42.0, 
    val value600 : Double = 48.0, 
    val value700 : Double = 56.0, 
    val value725 : Double = 58.0, 
    val value825 : Double = 66.0, 
    val value900 : Double = 72.0, 
    val value1025 : Double = 82.0, 
    val value1150 : Double = 92.0, 
    val value1275 : Double = 102.0, 
    val value1400 : Double = 112.0, 
)

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