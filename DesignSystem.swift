import SwiftUI

struct DesignSystem {
    let color = ColorValuesContainer()
    let borderWidth = BorderWidthValuesContainer()
    let borderRadius = BorderRadiusValuesContainer()
    let size = SizeValuesContainer()
    let space = SpaceValuesContainer()
    let opacity = OpacityValuesContainer()
    let typography = TypographyValuesContainer()
    let dimension = DimensionValuesContainer()
    let elevation = ElevationValuesContainer()
    let fontFamily = FontFamilyValuesContainer()
    let fontSize = FontSizeValuesContainer()
    let fontWeight = FontWeightValuesContainer()
    let letterSpacing = LetterSpacingValuesContainer()
    let lineHeight = LineHeightValuesContainer()
}

struct ContentValuesContainer {
    let primary = SwiftUI.Color(hex: "272e35")
    let secondary = SwiftUI.Color(hex: "555f6d")
    let tertiary = SwiftUI.Color(hex: "7e8c9a")
    let disabled = SwiftUI.Color(hex: "9ea8b3")
    let primaryInverse = SwiftUI.Color(hex: "ffffff")
    let secondaryInverse = SwiftUI.Color(hex: "ffffffa3")
    let tertiaryInverse = SwiftUI.Color(hex: "ffffff66")
    let disabledInverse = SwiftUI.Color(hex: "ffffff3d")
    let infoPrimary = SwiftUI.Color(hex: "113997")
    let infoSecondary = SwiftUI.Color(hex: "3061d5")
    let successPrimary = SwiftUI.Color(hex: "b3b7b0")
    let successSecondary = SwiftUI.Color(hex: "20b068")
    let warningPrimary = SwiftUI.Color(hex: "3f2828")
    let warningSecondary = SwiftUI.Color(hex: "f59638")
    let dangerPrimary = SwiftUI.Color(hex: "30723a")
    let dangerSecondary = SwiftUI.Color(hex: "9e6610")
    let brandPrimary = SwiftUI.Color(hex: "113997")
    let brandSecondary = SwiftUI.Color(hex: "3061d5")
}

struct BorderValuesContainer {
    let `default` = SwiftUI.Color(hex: "eaedf0")
    let defaultA = SwiftUI.Color(hex: "10284717")
    let inverse = SwiftUI.Color(hex: "ffffff")
    let neutralStrong = SwiftUI.Color(hex: "555f6d")
    let neutralSubtle = SwiftUI.Color(hex: "cfd6dd")
    let infoStrong = SwiftUI.Color(hex: "3061d5")
    let infoSubtle = SwiftUI.Color(hex: "e30404")
    let successStrong = SwiftUI.Color(hex: "20b068")
    let successSubtle = SwiftUI.Color(hex: "0005ff")
    let warningStrong = SwiftUI.Color(hex: "f59638")
    let warningSubtle = SwiftUI.Color(hex: "ffd4a8")
    let dangerStrong = SwiftUI.Color(hex: "9e6610")
    let dangerSubtle = SwiftUI.Color(hex: "76d91c")
}

struct BackgroundValuesContainer {
    let `default` = SwiftUI.Color(hex: "ffffff")
    let inverse = SwiftUI.Color(hex: "272e35")
    let neutralStrong = SwiftUI.Color(hex: "555f6d")
    let neutralMuted = SwiftUI.Color(hex: "dee3e7")
    let neutralOnSubtle = SwiftUI.Color(hex: "eaedf0")
    let neutralSubtle = SwiftUI.Color(hex: "f5f7f9")
    let neutralSurface = SwiftUI.Color(hex: "fcfcfd")
    let infoStrong = SwiftUI.Color(hex: "3061d5")
    let infoMuted = SwiftUI.Color(hex: "d6e3ff")
    let infoOnSubtle = SwiftUI.Color(hex: "e5eeff")
    let infoSubtle = SwiftUI.Color(hex: "f5f8ff")
    let infoSurface = SwiftUI.Color(hex: "fafbff")
    let successStrong = SwiftUI.Color(hex: "20b068")
    let successMuted = SwiftUI.Color(hex: "cff2cf")
    let successOnSubtle = SwiftUI.Color(hex: "dff6df")
    let successSubtle = SwiftUI.Color(hex: "f4fbf4")
    let successSurface = SwiftUI.Color(hex: "fbfefb")
    let warningStrong = SwiftUI.Color(hex: "f59638")
    let warningMuted = SwiftUI.Color(hex: "fcdec0")
    let warningOnSubtle = SwiftUI.Color(hex: "ffe8d1")
    let warningSubtle = SwiftUI.Color(hex: "fff5eb")
    let warningSurface = SwiftUI.Color(hex: "fffcfa")
    let dangerStrong = SwiftUI.Color(hex: "9e6610")
    let dangerMuted = SwiftUI.Color(hex: "d15a5a")
    let dangerOnSubtle = SwiftUI.Color(hex: "fee7e7")
    let dangerSubtle = SwiftUI.Color(hex: "fef5f5")
    let dangerSurface = SwiftUI.Color(hex: "fffafa")
    let brandStrong = SwiftUI.Color(hex: "3061d5")
    let brandMuted = SwiftUI.Color(hex: "d6e3ff")
    let brandOnSubtle = SwiftUI.Color(hex: "e5eeff")
    let brandSurface = SwiftUI.Color(hex: "fafbff")
    let brandSubtle = SwiftUI.Color(hex: "f5f8ff")
}

struct PrimaryValuesContainer {
    let actionPrimaryNormal = SwiftUI.Color(hex: "3061d5")
    let actionPrimaryHover = SwiftUI.Color(hex: "658b6e")
    let actionPrimaryActive = SwiftUI.Color(hex: "113997")
    let actionPrimarySelected = SwiftUI.Color(hex: "658b6e")
    let actionPrimarySubtleNormal = SwiftUI.Color(hex: "ebf0ff")
    let actionPrimarySubtleHover = SwiftUI.Color(hex: "e5eeff")
    let actionPrimarySubtleActive = SwiftUI.Color(hex: "e30404")
    let actionPrimarySubtleSelected = SwiftUI.Color(hex: "e5eeff")
}

struct NeutralValuesContainer {
    let actionNeutralNormal = SwiftUI.Color(hex: "4a545e")
    let actionNeutralHover = SwiftUI.Color(hex: "3a424a")
    let actionNeutralActive = SwiftUI.Color(hex: "272e35")
    let actionNeutralSelected = SwiftUI.Color(hex: "3a424a")
    let actionNeutralSubtleNormal = SwiftUI.Color(hex: "f0f3f5")
    let actionNeutralSubtleHover = SwiftUI.Color(hex: "eaedf0")
    let actionNeutralSubtleActive = SwiftUI.Color(hex: "cfd6dd")
    let actionNeutralSubtleSelected = SwiftUI.Color(hex: "eaedf0")
}

struct SuccessValuesContainer {
    let actionSuccessNormal = SwiftUI.Color(hex: "20b068")
    let actionSuccessHover = SwiftUI.Color(hex: "246626")
    let actionSuccessActive = SwiftUI.Color(hex: "b3b7b0")
    let actionSuccessSelected = SwiftUI.Color(hex: "246626")
    let actionSuccessSubtleNormal = SwiftUI.Color(hex: "e6f9e6")
    let actionSuccessSubtleHover = SwiftUI.Color(hex: "dff6df")
    let actionSuccessSubtleActive = SwiftUI.Color(hex: "0005ff")
    let actionSuccessSubtleSelected = SwiftUI.Color(hex: "dff6df")
}

struct DangerValuesContainer {
    let actionDangerNormal = SwiftUI.Color(hex: "9e6610")
    let actionDangerHover = SwiftUI.Color(hex: "63c7c3")
    let actionDangerActive = SwiftUI.Color(hex: "30723a")
    let actionDangerSelected = SwiftUI.Color(hex: "63c7c3")
    let actionDangerSubtleNormal = SwiftUI.Color(hex: "ffebeb")
    let actionDangerSubtleHover = SwiftUI.Color(hex: "fee7e7")
    let actionDangerSubtleActive = SwiftUI.Color(hex: "76d91c")
    let actionDangerSubtleSelected = SwiftUI.Color(hex: "fee7e7")
}

struct GhostValuesContainer {
    let actionGhostNormal = SwiftUI.Color(hex: "ffffff00")
    let actionGhostHover = SwiftUI.Color(hex: "022e500f")
    let actionGhostActive = SwiftUI.Color(hex: "10284717")
    let actionGhostSelected = SwiftUI.Color(hex: "022e500f")
    let actionGhostInverseHover = SwiftUI.Color(hex: "ffffff1a")
    let actionGhostInverseActive = SwiftUI.Color(hex: "ffffff1f")
    let actionGhostInverseSelected = SwiftUI.Color(hex: "ffffff1a")
    let actionGhostDangerHover = SwiftUI.Color(hex: "ffebeb")
    let actionGhostDangerActive = SwiftUI.Color(hex: "fee7e7")
    let actionGhostDangerSelected = SwiftUI.Color(hex: "ffebeb")
}

struct OutlineValuesContainer {
    let actionOutlineNormal = SwiftUI.Color(hex: "cfd6dd")
    let actionOutlineHover = SwiftUI.Color(hex: "9ea8b3")
    let actionOutlineActive = SwiftUI.Color(hex: "7e8c9a")
    let actionOutlineSelected = SwiftUI.Color(hex: "9ea8b3")
}

struct InverseValuesContainer {
    let actionInverseNormal = SwiftUI.Color(hex: "ffffff")
    let actionInverseHover = SwiftUI.Color(hex: "ffffffd1")
    let actionInverseActive = SwiftUI.Color(hex: "ffffffb8")
    let actionInverseSelected = SwiftUI.Color(hex: "ffffffd1")
}

struct ReverseInverseValuesContainer {
    let actionReverseInverseNormal = SwiftUI.Color(hex: "0a121ae0")
    let actionReverseInverseHover = SwiftUI.Color(hex: "1d2835cc")
    let actionReverseInverseActive = SwiftUI.Color(hex: "182639bd")
    let actionReverseInverseSelected = SwiftUI.Color(hex: "1d2835cc")
}

struct ActionValuesContainer {
    let primary = PrimaryValuesContainer()
    let neutral = NeutralValuesContainer()
    let success = SuccessValuesContainer()
    let danger = DangerValuesContainer()
    let ghost = GhostValuesContainer()
    let outline = OutlineValuesContainer()
    let inverse = InverseValuesContainer()
    let reverseInverse = ReverseInverseValuesContainer()
}

struct DefaultValuesContainer {
    let interactionDefaultNormal = SwiftUI.Color(hex: "3061d5")
    let interactionDefaultHover = SwiftUI.Color(hex: "658b6e")
    let interactionDefaultActive = SwiftUI.Color(hex: "113997")
    let interactionDefaultSelected = SwiftUI.Color(hex: "658b6e")
    let interactionDefaultSubtleNormal = SwiftUI.Color(hex: "ebf0ff")
    let interactionDefaultSubtleHover = SwiftUI.Color(hex: "e5eeff")
    let interactionDefaultSubtleActive = SwiftUI.Color(hex: "e30404")
    let interactionDefaultSubtleSelected = SwiftUI.Color(hex: "e5eeff")
}

struct NeutralValuesContainer1 {
    let interactionNeutralNormal = SwiftUI.Color(hex: "4a545e")
    let interactionNeutralHover = SwiftUI.Color(hex: "3a424a")
    let interactionNeutralActive = SwiftUI.Color(hex: "272e35")
    let interactionNeutralSelected = SwiftUI.Color(hex: "3a424a")
    let interactionNeutralSubtleNormal = SwiftUI.Color(hex: "f0f3f5")
    let interactionNeutralSubtleHover = SwiftUI.Color(hex: "eaedf0")
    let interactionNeutralSubtleActive = SwiftUI.Color(hex: "cfd6dd")
    let interactionNeutralSubtleSelected = SwiftUI.Color(hex: "eaedf0")
}

struct DangerValuesContainer1 {
    let interactionDangerNormal = SwiftUI.Color(hex: "9e6610")
    let interactionDangerHover = SwiftUI.Color(hex: "63c7c3")
    let interactionDangerActive = SwiftUI.Color(hex: "30723a")
    let interactionDangerSelected = SwiftUI.Color(hex: "63c7c3")
    let interactionDangerSubtleNormal = SwiftUI.Color(hex: "ffebeb")
    let interactionDangerSubtleHover = SwiftUI.Color(hex: "fee7e7")
    let interactionDangerSubtleActive = SwiftUI.Color(hex: "76d91c")
    let interactionDangerSubtleSelected = SwiftUI.Color(hex: "fee7e7")
}

struct GhostValuesContainer1 {
    let interactionGhostNormal = SwiftUI.Color(hex: "ffffff00")
    let interactionGhostHover = SwiftUI.Color(hex: "022e500f")
    let interactionGhostActive = SwiftUI.Color(hex: "10284717")
    let interactionGhostSelected = SwiftUI.Color(hex: "022e500f")
    let interactionGhostInverseHover = SwiftUI.Color(hex: "ffffff1a")
    let interactionGhostInverseNormal = SwiftUI.Color(hex: "ffffff1f")
    let interactionGhostInverseSelected = SwiftUI.Color(hex: "ffffff1a")
    let interactionGhostDangerHover = SwiftUI.Color(hex: "ffebeb")
    let interactionGhostDangerNormal = SwiftUI.Color(hex: "fee7e7")
    let interactionGhostDangerSelected = SwiftUI.Color(hex: "ffebeb")
}

struct DisabledValuesContainer {
    let interactionDisabledNormal = SwiftUI.Color(hex: "9ea8b3")
    let interactionDisabledHover = SwiftUI.Color(hex: "7e8c9a")
    let interactionDisabledActive = SwiftUI.Color(hex: "555f6d")
    let interactionDisabledSubtleNormal = SwiftUI.Color(hex: "eaedf0")
    let interactionDisabledSubtleHover = SwiftUI.Color(hex: "dee3e7")
    let interactionDisabledSubtleActive = SwiftUI.Color(hex: "cfd6dd")
}

struct BorderValuesContainer1 {
    let interactionBorderNormal = SwiftUI.Color(hex: "8eb0fb")
    let interactionBorderHover = SwiftUI.Color(hex: "6691f4")
    let interactionBorderActive = SwiftUI.Color(hex: "ff9375")
    let interactionBorderSelected = SwiftUI.Color(hex: "3061d5")
    let interactionBorderNeutralNormal = SwiftUI.Color(hex: "cfd6dd")
    let interactionBorderNeutralHover = SwiftUI.Color(hex: "9ea8b3")
    let interactionBorderNeutralActive = SwiftUI.Color(hex: "7e8c9a")
    let interactionBorderNeutralSelected = SwiftUI.Color(hex: "9ea8b3")
    let interactionBorderDanger = SwiftUI.Color(hex: "285aa5")
}

struct BackgroundValuesContainer1 {
    let interactionBackgroundModal = SwiftUI.Color(hex: "ffffff")
    let interactionBackgroundModeless = SwiftUI.Color(hex: "ffffff")
    let interactionBackgroundModelessInverse = SwiftUI.Color(hex: "272e35")
    let interactionBackgroundSidepanel = SwiftUI.Color(hex: "ffffff")
    let interactionBackgroundFormField = SwiftUI.Color(hex: "ffffff")
    let interactionBackgroundDimmer = SwiftUI.Color(hex: "182639bd")
}

struct InverseValuesContainer1 {
    let interactionInverseNormal = SwiftUI.Color(hex: "ffffff")
    let interactionInverseHover = SwiftUI.Color(hex: "ffffffd1")
    let interactionInverseActive = SwiftUI.Color(hex: "ffffffb8")
    let interactionInverseSelected = SwiftUI.Color(hex: "ffffffd1")
}

struct FocusValuesContainer {
    let interactionFocusDefault = SwiftUI.Color(hex: "6691f4")
}

struct InteractionValuesContainer {
    let `default` = DefaultValuesContainer()
    let neutral = NeutralValuesContainer1()
    let danger = DangerValuesContainer1()
    let ghost = GhostValuesContainer1()
    let disabled = DisabledValuesContainer()
    let border = BorderValuesContainer1()
    let background = BackgroundValuesContainer1()
    let inverse = InverseValuesContainer1()
    let focus = FocusValuesContainer()
}

struct GrayValuesContainer {
    let nonSemanticGrayContentPrimary = SwiftUI.Color(hex: "272e35")
    let nonSemanticGrayContentSecondary = SwiftUI.Color(hex: "555f6d")
    let nonSemanticGrayBorderDefault = SwiftUI.Color(hex: "eaedf0")
    let nonSemanticGrayBorderStrong = SwiftUI.Color(hex: "555f6d")
    let nonSemanticGrayBorderSubtle = SwiftUI.Color(hex: "cfd6dd")
    let nonSemanticGrayBackgroundStrong = SwiftUI.Color(hex: "555f6d")
    let nonSemanticGrayBackgroundMuted = SwiftUI.Color(hex: "dee3e7")
    let nonSemanticGrayBackgroundOnSubtle = SwiftUI.Color(hex: "eaedf0")
    let nonSemanticGrayBackgroundSubtle = SwiftUI.Color(hex: "f5f7f9")
    let nonSemanticGrayBackgroundSurface = SwiftUI.Color(hex: "fcfcfd")
}

struct WhiteValuesContainer {
    let nonSemanticWhiteContentPrimary = SwiftUI.Color(hex: "ffffff")
    let nonSemanticWhiteContentSecondary = SwiftUI.Color(hex: "ffffffa3")
    let nonSemanticWhiteBorderDefault = SwiftUI.Color(hex: "ffffff66")
    let nonSemanticWhiteBorderStrong = SwiftUI.Color(hex: "ffffff")
    let nonSemanticWhiteBorderSubtle = SwiftUI.Color(hex: "ffffffad")
    let nonSemanticWhiteBackgroundStrong = SwiftUI.Color(hex: "ffffff")
    let nonSemanticWhiteBackgroundMuted = SwiftUI.Color(hex: "ffffffa3")
    let nonSemanticWhiteBackgroundOnSubtle = SwiftUI.Color(hex: "ffffff66")
    let nonSemanticWhiteBackgroundSubtle = SwiftUI.Color(hex: "ffffff1f")
    let nonSemanticWhiteBackgroundSurface = SwiftUI.Color(hex: "ffffff1a")
}

struct RedValuesContainer {
    let nonSemanticRedContentPrimary = SwiftUI.Color(hex: "30723a")
    let nonSemanticRedContentSecondary = SwiftUI.Color(hex: "9e6610")
    let nonSemanticRedBorderDefault = SwiftUI.Color(hex: "fee7e7")
    let nonSemanticRedBorderStrong = SwiftUI.Color(hex: "9e6610")
    let nonSemanticRedBorderSubtle = SwiftUI.Color(hex: "76d91c")
    let nonSemanticRedBackgroundStrong = SwiftUI.Color(hex: "9e6610")
    let nonSemanticRedBackgroundMuted = SwiftUI.Color(hex: "d15a5a")
    let nonSemanticRedBackgroundOnSubtle = SwiftUI.Color(hex: "fee7e7")
    let nonSemanticRedBackgroundSubtle = SwiftUI.Color(hex: "fef5f5")
    let nonSemanticRedBackgroundSurface = SwiftUI.Color(hex: "fffafa")
}

struct MagentaValuesContainer {
    let nonSemanticMagentaContentPrimary = SwiftUI.Color(hex: "671e4d")
    let nonSemanticMagentaContentSecondary = SwiftUI.Color(hex: "91ae7a")
    let nonSemanticMagentaBorderDefault = SwiftUI.Color(hex: "fde2f4")
    let nonSemanticMagentaBorderStrong = SwiftUI.Color(hex: "91ae7a")
    let nonSemanticMagentaBorderSubtle = SwiftUI.Color(hex: "f7cae8")
    let nonSemanticMagentaBackgroundStrong = SwiftUI.Color(hex: "91ae7a")
    let nonSemanticMagentaBackgroundMuted = SwiftUI.Color(hex: "fbd5ee")
    let nonSemanticMagentaBackgroundOnSubtle = SwiftUI.Color(hex: "fde2f4")
    let nonSemanticMagentaBackgroundSubtle = SwiftUI.Color(hex: "fef6fb")
    let nonSemanticMagentaBackgroundSurface = SwiftUI.Color(hex: "fffafd")
}

struct PurpleValuesContainer {
    let nonSemanticPurpleContentPrimary = SwiftUI.Color(hex: "5b1e67")
    let nonSemanticPurpleContentSecondary = SwiftUI.Color(hex: "9939ac")
    let nonSemanticPurpleBorderDefault = SwiftUI.Color(hex: "f8e2fd")
    let nonSemanticPurpleBorderStrong = SwiftUI.Color(hex: "9939ac")
    let nonSemanticPurpleBorderSubtle = SwiftUI.Color(hex: "c04c0d")
    let nonSemanticPurpleBackgroundStrong = SwiftUI.Color(hex: "9939ac")
    let nonSemanticPurpleBackgroundMuted = SwiftUI.Color(hex: "f5d5fb")
    let nonSemanticPurpleBackgroundOnSubtle = SwiftUI.Color(hex: "f8e2fd")
    let nonSemanticPurpleBackgroundSubtle = SwiftUI.Color(hex: "fdf5ff")
    let nonSemanticPurpleBackgroundSurface = SwiftUI.Color(hex: "fefaff")
}

struct VioletValuesContainer {
    let nonSemanticVioletContentPrimary = SwiftUI.Color(hex: "39288a")
    let nonSemanticVioletContentSecondary = SwiftUI.Color(hex: "634eca")
    let nonSemanticVioletBorderDefault = SwiftUI.Color(hex: "eeebff")
    let nonSemanticVioletBorderStrong = SwiftUI.Color(hex: "634eca")
    let nonSemanticVioletBorderSubtle = SwiftUI.Color(hex: "54917b")
    let nonSemanticVioletBackgroundStrong = SwiftUI.Color(hex: "634eca")
    let nonSemanticVioletBackgroundMuted = SwiftUI.Color(hex: "e3e0ff")
    let nonSemanticVioletBackgroundOnSubtle = SwiftUI.Color(hex: "eeebff")
    let nonSemanticVioletBackgroundSubtle = SwiftUI.Color(hex: "f7f5ff")
    let nonSemanticVioletBackgroundSurface = SwiftUI.Color(hex: "fbfaff")
}

struct BlueValuesContainer {
    let nonSemanticBlueContentPrimary = SwiftUI.Color(hex: "113997")
    let nonSemanticBlueContentSecondary = SwiftUI.Color(hex: "3061d5")
    let nonSemanticBlueBorderDefault = SwiftUI.Color(hex: "e5eeff")
    let nonSemanticBlueBorderStrong = SwiftUI.Color(hex: "3061d5")
    let nonSemanticBlueBorderSubtle = SwiftUI.Color(hex: "e30404")
    let nonSemanticBlueBackgroundStrong = SwiftUI.Color(hex: "3061d5")
    let nonSemanticBlueBackgroundMuted = SwiftUI.Color(hex: "d6e3ff")
    let nonSemanticBlueBackgroundOnSubtle = SwiftUI.Color(hex: "e5eeff")
    let nonSemanticBlueBackgroundSubtle = SwiftUI.Color(hex: "f5f8ff")
    let nonSemanticBlueBackgroundSurface = SwiftUI.Color(hex: "fafbff")
}

struct CyanValuesContainer {
    let nonSemanticCyanContentPrimary = SwiftUI.Color(hex: "0c636e")
    let nonSemanticCyanContentSecondary = SwiftUI.Color(hex: "0870ba")
    let nonSemanticCyanBorderDefault = SwiftUI.Color(hex: "e0f1ff")
    let nonSemanticCyanBorderStrong = SwiftUI.Color(hex: "0870ba")
    let nonSemanticCyanBorderSubtle = SwiftUI.Color(hex: "c2e2ff")
    let nonSemanticCyanBackgroundStrong = SwiftUI.Color(hex: "0870ba")
    let nonSemanticCyanBackgroundMuted = SwiftUI.Color(hex: "cce7ff")
    let nonSemanticCyanBackgroundOnSubtle = SwiftUI.Color(hex: "e0f1ff")
    let nonSemanticCyanBackgroundSubtle = SwiftUI.Color(hex: "f0f9ff")
    let nonSemanticCyanBackgroundSurface = SwiftUI.Color(hex: "fafdff")
}

struct TealValuesContainer {
    let nonSemanticTealContentPrimary = SwiftUI.Color(hex: "7c4fc4")
    let nonSemanticTealContentSecondary = SwiftUI.Color(hex: "077597")
    let nonSemanticTealBorderDefault = SwiftUI.Color(hex: "e0f3fa")
    let nonSemanticTealBorderStrong = SwiftUI.Color(hex: "077597")
    let nonSemanticTealBorderSubtle = SwiftUI.Color(hex: "b8e8f5")
    let nonSemanticTealBackgroundStrong = SwiftUI.Color(hex: "077597")
    let nonSemanticTealBackgroundMuted = SwiftUI.Color(hex: "c5ecf7")
    let nonSemanticTealBackgroundOnSubtle = SwiftUI.Color(hex: "e0f3fa")
    let nonSemanticTealBackgroundSubtle = SwiftUI.Color(hex: "f0fbff")
    let nonSemanticTealBackgroundSurface = SwiftUI.Color(hex: "fafeff")
}

struct AquamarineValuesContainer {
    let nonSemanticAquamarineContentPrimary = SwiftUI.Color(hex: "0d4a42")
    let nonSemanticAquamarineContentSecondary = SwiftUI.Color(hex: "097b68")
    let nonSemanticAquamarineBorderDefault = SwiftUI.Color(hex: "daf6f3")
    let nonSemanticAquamarineBorderStrong = SwiftUI.Color(hex: "097b68")
    let nonSemanticAquamarineBorderSubtle = SwiftUI.Color(hex: "bee9e4")
    let nonSemanticAquamarineBackgroundStrong = SwiftUI.Color(hex: "097b68")
    let nonSemanticAquamarineBackgroundMuted = SwiftUI.Color(hex: "c5f2ec")
    let nonSemanticAquamarineBackgroundOnSubtle = SwiftUI.Color(hex: "daf6f3")
    let nonSemanticAquamarineBackgroundSubtle = SwiftUI.Color(hex: "f0faf9")
    let nonSemanticAquamarineBackgroundSurface = SwiftUI.Color(hex: "fbfefe")
}

struct GreenValuesContainer {
    let nonSemanticGreenContentPrimary = SwiftUI.Color(hex: "b3b7b0")
    let nonSemanticGreenContentSecondary = SwiftUI.Color(hex: "20b068")
    let nonSemanticGreenBorderDefault = SwiftUI.Color(hex: "dff6df")
    let nonSemanticGreenBorderStrong = SwiftUI.Color(hex: "20b068")
    let nonSemanticGreenBorderSubtle = SwiftUI.Color(hex: "0005ff")
    let nonSemanticGreenBackgroundStrong = SwiftUI.Color(hex: "20b068")
    let nonSemanticGreenBackgroundMuted = SwiftUI.Color(hex: "cff2cf")
    let nonSemanticGreenBackgroundOnSubtle = SwiftUI.Color(hex: "dff6df")
    let nonSemanticGreenBackgroundSubtle = SwiftUI.Color(hex: "f4fbf4")
    let nonSemanticGreenBackgroundSurface = SwiftUI.Color(hex: "fbfefb")
}

struct OrangeValuesContainer {
    let nonSemanticOrangeContentPrimary = SwiftUI.Color(hex: "3f2828")
    let nonSemanticOrangeContentSecondary = SwiftUI.Color(hex: "f59638")
    let nonSemanticOrangeBorderDefault = SwiftUI.Color(hex: "ffe8d1")
    let nonSemanticOrangeBorderStrong = SwiftUI.Color(hex: "f59638")
    let nonSemanticOrangeBorderSubtle = SwiftUI.Color(hex: "ffd4a8")
    let nonSemanticOrangeBackgroundStrong = SwiftUI.Color(hex: "f59638")
    let nonSemanticOrangeBackgroundMuted = SwiftUI.Color(hex: "fcdec0")
    let nonSemanticOrangeBackgroundOnSubtle = SwiftUI.Color(hex: "ffe8d1")
    let nonSemanticOrangeBackgroundSubtle = SwiftUI.Color(hex: "fff5eb")
    let nonSemanticOrangeBackgroundSurface = SwiftUI.Color(hex: "fffcfa")
}

struct NonSemanticValuesContainer {
    let gray = GrayValuesContainer()
    let white = WhiteValuesContainer()
    let red = RedValuesContainer()
    let magenta = MagentaValuesContainer()
    let purple = PurpleValuesContainer()
    let violet = VioletValuesContainer()
    let blue = BlueValuesContainer()
    let cyan = CyanValuesContainer()
    let teal = TealValuesContainer()
    let aquamarine = AquamarineValuesContainer()
    let green = GreenValuesContainer()
    let orange = OrangeValuesContainer()
}

struct BrandValuesContainer {
    let semanticBrandNegative4 = SwiftUI.Color(hex: "041f5d")
    let semanticBrandNegative3 = SwiftUI.Color(hex: "113997")
    let semanticBrandNegative2 = SwiftUI.Color(hex: "658b6e")
    let semanticBrandNegative1 = SwiftUI.Color(hex: "ff9375")
    let semanticBrand0 = SwiftUI.Color(hex: "3061d5")
    let semanticBrand1 = SwiftUI.Color(hex: "6691f4")
    let semanticBrand2 = SwiftUI.Color(hex: "8eb0fb")
    let semanticBrand3 = SwiftUI.Color(hex: "e30404")
    let semanticBrand4 = SwiftUI.Color(hex: "d6e3ff")
    let semanticBrand5 = SwiftUI.Color(hex: "e5eeff")
    let semanticBrand6 = SwiftUI.Color(hex: "ebf0ff")
    let semanticBrand7 = SwiftUI.Color(hex: "f5f8ff")
    let semanticBrand8 = SwiftUI.Color(hex: "fafbff")
}

struct NeutralValuesContainer2 {
    let semanticNeutralNegative4 = SwiftUI.Color(hex: "1b242c")
    let semanticNeutralNegative3 = SwiftUI.Color(hex: "272e35")
    let semanticNeutralNegative2 = SwiftUI.Color(hex: "3a424a")
    let semanticNeutralNegative1 = SwiftUI.Color(hex: "4a545e")
    let semanticNeutral0 = SwiftUI.Color(hex: "555f6d")
    let semanticNeutral1 = SwiftUI.Color(hex: "7e8c9a")
    let semanticNeutral2 = SwiftUI.Color(hex: "9ea8b3")
    let semanticNeutral3 = SwiftUI.Color(hex: "cfd6dd")
    let semanticNeutral4 = SwiftUI.Color(hex: "dee3e7")
    let semanticNeutral5 = SwiftUI.Color(hex: "eaedf0")
    let semanticNeutral6 = SwiftUI.Color(hex: "f0f3f5")
    let semanticNeutral7 = SwiftUI.Color(hex: "f5f7f9")
    let semanticNeutral8 = SwiftUI.Color(hex: "fcfcfd")
}

struct NeutralAlphaValuesContainer {
    let semanticNeutralANegative4 = SwiftUI.Color(hex: "09131aed")
    let semanticNeutralANegative3 = SwiftUI.Color(hex: "0a121ae0")
    let semanticNeutralANegative2 = SwiftUI.Color(hex: "1a232ddb")
    let semanticNeutralANegative1 = SwiftUI.Color(hex: "1d2835cc")
    let semanticNeutralA0 = SwiftUI.Color(hex: "182639bd")
    let semanticNeutralA1 = SwiftUI.Color(hex: "1830498f")
    let semanticNeutralA2 = SwiftUI.Color(hex: "0d253f66")
    let semanticNeutralA3 = SwiftUI.Color(hex: "10315633")
    let semanticNeutralA4 = SwiftUI.Color(hex: "04294321")
    let semanticNeutralA5 = SwiftUI.Color(hex: "10284717")
    let semanticNeutralA6 = SwiftUI.Color(hex: "022e500f")
    let semanticNeutralA7 = SwiftUI.Color(hex: "00295c0a")
    let semanticNeutralA8 = SwiftUI.Color(hex: "1f529e05")
}

struct InfoValuesContainer {
    let semanticInfoNegative4 = SwiftUI.Color(hex: "041f5d")
    let semanticInfoNegative3 = SwiftUI.Color(hex: "113997")
    let semanticInfoNegative2 = SwiftUI.Color(hex: "658b6e")
    let semanticInfoNegative1 = SwiftUI.Color(hex: "ff9375")
    let semanticInfo0 = SwiftUI.Color(hex: "3061d5")
    let semanticInfo1 = SwiftUI.Color(hex: "6691f4")
    let semanticInfo2 = SwiftUI.Color(hex: "8eb0fb")
    let semanticInfo3 = SwiftUI.Color(hex: "e30404")
    let semanticInfo4 = SwiftUI.Color(hex: "d6e3ff")
    let semanticInfo5 = SwiftUI.Color(hex: "e5eeff")
    let semanticInfo6 = SwiftUI.Color(hex: "ebf0ff")
    let semanticInfo7 = SwiftUI.Color(hex: "f5f8ff")
    let semanticInfo8 = SwiftUI.Color(hex: "fafbff")
}

struct SuccessValuesContainer1 {
    let semanticSuccessNegative4 = SwiftUI.Color(hex: "0a2e0b")
    let semanticSuccessNegative3 = SwiftUI.Color(hex: "b3b7b0")
    let semanticSuccessNegative2 = SwiftUI.Color(hex: "246626")
    let semanticSuccessNegative1 = SwiftUI.Color(hex: "2f6f2f")
    let semanticSuccess0 = SwiftUI.Color(hex: "20b068")
    let semanticSuccess1 = SwiftUI.Color(hex: "55a555")
    let semanticSuccess2 = SwiftUI.Color(hex: "fdff84")
    let semanticSuccess3 = SwiftUI.Color(hex: "0005ff")
    let semanticSuccess4 = SwiftUI.Color(hex: "cff2cf")
    let semanticSuccess5 = SwiftUI.Color(hex: "dff6df")
    let semanticSuccess6 = SwiftUI.Color(hex: "e6f9e6")
    let semanticSuccess7 = SwiftUI.Color(hex: "f4fbf4")
    let semanticSuccess8 = SwiftUI.Color(hex: "fbfefb")
}

struct WarningValuesContainer {
    let semanticWarningNegative4 = SwiftUI.Color(hex: "492909")
    let semanticWarningNegative3 = SwiftUI.Color(hex: "3f2828")
    let semanticWarningNegative2 = SwiftUI.Color(hex: "a05c1c")
    let semanticWarningNegative1 = SwiftUI.Color(hex: "b4610e")
    let semanticWarning0 = SwiftUI.Color(hex: "f59638")
    let semanticWarning1 = SwiftUI.Color(hex: "f6a351")
    let semanticWarning2 = SwiftUI.Color(hex: "feb871")
    let semanticWarning3 = SwiftUI.Color(hex: "ffd4a8")
    let semanticWarning4 = SwiftUI.Color(hex: "fcdec0")
    let semanticWarning5 = SwiftUI.Color(hex: "ffe8d1")
    let semanticWarning6 = SwiftUI.Color(hex: "fff0e0")
    let semanticWarning7 = SwiftUI.Color(hex: "fff5eb")
    let semanticWarning8 = SwiftUI.Color(hex: "fffcfa")
}

struct DangerValuesContainer2 {
    let semanticDangerNegative4 = SwiftUI.Color(hex: "4a0d0d")
    let semanticDangerNegative3 = SwiftUI.Color(hex: "30723a")
    let semanticDangerNegative2 = SwiftUI.Color(hex: "63c7c3")
    let semanticDangerNegative1 = SwiftUI.Color(hex: "a13636")
    let semanticDanger0 = SwiftUI.Color(hex: "9e6610")
    let semanticDanger1 = SwiftUI.Color(hex: "285aa5")
    let semanticDanger2 = SwiftUI.Color(hex: "494b75")
    let semanticDanger3 = SwiftUI.Color(hex: "76d91c")
    let semanticDanger4 = SwiftUI.Color(hex: "d15a5a")
    let semanticDanger5 = SwiftUI.Color(hex: "fee7e7")
    let semanticDanger6 = SwiftUI.Color(hex: "ffebeb")
    let semanticDanger7 = SwiftUI.Color(hex: "fef5f5")
    let semanticDanger8 = SwiftUI.Color(hex: "fffafa")
}

struct SemanticValuesContainer {
    let brand = BrandValuesContainer()
    let neutral = NeutralValuesContainer2()
    let neutralAlpha = NeutralAlphaValuesContainer()
    let info = InfoValuesContainer()
    let success = SuccessValuesContainer1()
    let warning = WarningValuesContainer()
    let danger = DangerValuesContainer2()
}

struct CoolGrayValuesContainer {
    let negative4 = SwiftUI.Color(hex: "1b242c")
    let negative3 = SwiftUI.Color(hex: "272e35")
    let negative2 = SwiftUI.Color(hex: "3a424a")
    let negative1 = SwiftUI.Color(hex: "4a545e")
    let coolGray0 = SwiftUI.Color(hex: "555f6d")
    let coolGray1 = SwiftUI.Color(hex: "7e8c9a")
    let coolGray2 = SwiftUI.Color(hex: "9ea8b3")
    let coolGray3 = SwiftUI.Color(hex: "cfd6dd")
    let coolGray4 = SwiftUI.Color(hex: "dee3e7")
    let coolGray5 = SwiftUI.Color(hex: "eaedf0")
    let coolGray6 = SwiftUI.Color(hex: "f0f3f5")
    let coolGray7 = SwiftUI.Color(hex: "f5f7f9")
    let coolGray8 = SwiftUI.Color(hex: "fcfcfd")
}

struct CoolGrayAlphaValuesContainer {
    let coolGrayANegative4 = SwiftUI.Color(hex: "09131aed")
    let coolGrayANegative3 = SwiftUI.Color(hex: "0a121ae0")
    let coolGrayANegative2 = SwiftUI.Color(hex: "1a232ddb")
    let coolGrayANegative1 = SwiftUI.Color(hex: "1d2835cc")
    let coolGrayA0 = SwiftUI.Color(hex: "182639bd")
    let coolGrayA1 = SwiftUI.Color(hex: "1830498f")
    let coolGrayA2 = SwiftUI.Color(hex: "0d253f66")
    let coolGrayA3 = SwiftUI.Color(hex: "10315633")
    let coolGrayA4 = SwiftUI.Color(hex: "04294321")
    let coolGrayA5 = SwiftUI.Color(hex: "10284717")
    let coolGrayA6 = SwiftUI.Color(hex: "022e500f")
    let coolGrayA7 = SwiftUI.Color(hex: "00295c0a")
    let coolGrayA8 = SwiftUI.Color(hex: "1f529e05")
}

struct NeutralGrayValuesContainer {
    let negative4 = SwiftUI.Color(hex: "212121")
    let negative3 = SwiftUI.Color(hex: "2e2e2e")
    let negative2 = SwiftUI.Color(hex: "404040")
    let negative1 = SwiftUI.Color(hex: "525252")
    let neutralGray0 = SwiftUI.Color(hex: "5e5e5e")
    let neutralGray1 = SwiftUI.Color(hex: "8a8a8a")
    let neutralGray2 = SwiftUI.Color(hex: "a6a6a6")
    let neutralGray3 = SwiftUI.Color(hex: "d6d6d6")
    let neutralGray4 = SwiftUI.Color(hex: "e3e3e3")
    let neutralGray5 = SwiftUI.Color(hex: "ebebeb")
    let neutralGray6 = SwiftUI.Color(hex: "f2f2f2")
    let neutralGray7 = SwiftUI.Color(hex: "f7f7f7")
    let neutralGray8 = SwiftUI.Color(hex: "fcfcfc")
}

struct NeutralGrayAlphaValuesContainer {
    let neutralGrayANegative4 = SwiftUI.Color(hex: "121212ed")
    let neutralGrayANegative3 = SwiftUI.Color(hex: "0f0f0fe0")
    let neutralGrayANegative2 = SwiftUI.Color(hex: "212121db")
    let neutralGrayANegative1 = SwiftUI.Color(hex: "262626cc")
    let neutralGrayA0 = SwiftUI.Color(hex: "262627bd")
    let neutralGrayA1 = SwiftUI.Color(hex: "2b2b2b8f")
    let neutralGrayA2 = SwiftUI.Color(hex: "21212166")
    let neutralGrayA3 = SwiftUI.Color(hex: "2e2e2e33")
    let neutralGrayA4 = SwiftUI.Color(hex: "1f1f1f21")
    let neutralGrayA5 = SwiftUI.Color(hex: "1c1c1c17")
    let neutralGrayA6 = SwiftUI.Color(hex: "2121210f")
    let neutralGrayA7 = SwiftUI.Color(hex: "2e2e2e0a")
    let neutralGrayA8 = SwiftUI.Color(hex: "52525205")
}

struct WarmGrayValuesContainer {
    let negative4 = SwiftUI.Color(hex: "222220")
    let negative3 = SwiftUI.Color(hex: "30302c")
    let negative2 = SwiftUI.Color(hex: "40403a")
    let negative1 = SwiftUI.Color(hex: "52524c")
    let warmGray0 = SwiftUI.Color(hex: "5f5f58")
    let warmGray1 = SwiftUI.Color(hex: "8b8b84")
    let warmGray2 = SwiftUI.Color(hex: "a8a89f")
    let warmGray3 = SwiftUI.Color(hex: "e3e305")
    let warmGray4 = SwiftUI.Color(hex: "e5e5e1")
    let warmGray5 = SwiftUI.Color(hex: "eaeae6")
    let warmGray6 = SwiftUI.Color(hex: "f3f3f1")
    let warmGray7 = SwiftUI.Color(hex: "f8f8f7")
    let warmGray8 = SwiftUI.Color(hex: "fdfdfc")
}

struct WarmGrayAlphaValuesContainer {
    let warmGrayANegative4 = SwiftUI.Color(hex: "131311ed")
    let warmGrayANegative3 = SwiftUI.Color(hex: "12120de0")
    let warmGrayANegative2 = SwiftUI.Color(hex: "22221bdb")
    let warmGrayANegative1 = SwiftUI.Color(hex: "272720cc")
    let warmGrayA0 = SwiftUI.Color(hex: "26261cbd")
    let warmGrayA1 = SwiftUI.Color(hex: "2f2f238f")
    let warmGrayA2 = SwiftUI.Color(hex: "28281166")
    let warmGrayA3 = SwiftUI.Color(hex: "3e3e1d33")
    let warmGrayA4 = SwiftUI.Color(hex: "33331421")
    let warmGrayA5 = SwiftUI.Color(hex: "22220217")
    let warmGrayA6 = SwiftUI.Color(hex: "2f2f0e0f")
    let warmGrayA7 = SwiftUI.Color(hex: "2f2f2d0a")
    let warmGrayA8 = SwiftUI.Color(hex: "52525205")
}

struct WhiteAlphaValuesContainer {
    let whiteANegative12 = SwiftUI.Color(hex: "ffffff05")
    let whiteANegative11 = SwiftUI.Color(hex: "ffffff08")
    let whiteANegative10 = SwiftUI.Color(hex: "ffffff0d")
    let whiteANegative9 = SwiftUI.Color(hex: "ffffff14")
    let whiteANegative8 = SwiftUI.Color(hex: "ffffff1a")
    let whiteANegative7 = SwiftUI.Color(hex: "ffffff1f")
    let whiteANegative6 = SwiftUI.Color(hex: "ffffff3d")
    let whiteANegative5 = SwiftUI.Color(hex: "ffffff66")
    let whiteANegative4 = SwiftUI.Color(hex: "ffffffa3")
    let whiteANegative3 = SwiftUI.Color(hex: "ffffffad")
    let whiteANegative2 = SwiftUI.Color(hex: "ffffffb8")
    let whiteANegative1 = SwiftUI.Color(hex: "ffffffd1")
    let whiteA0 = SwiftUI.Color(hex: "ffffff")
}

struct RedValuesContainer1 {
    let negative4 = SwiftUI.Color(hex: "4a0d0d")
    let negative3 = SwiftUI.Color(hex: "30723a")
    let negative2 = SwiftUI.Color(hex: "63c7c3")
    let negative1 = SwiftUI.Color(hex: "a13636")
    let red0 = SwiftUI.Color(hex: "9e6610")
    let red1 = SwiftUI.Color(hex: "285aa5")
    let red2 = SwiftUI.Color(hex: "494b75")
    let red3 = SwiftUI.Color(hex: "76d91c")
    let red4 = SwiftUI.Color(hex: "d15a5a")
    let red5 = SwiftUI.Color(hex: "fee7e7")
    let red6 = SwiftUI.Color(hex: "ffebeb")
    let red7 = SwiftUI.Color(hex: "fef5f5")
    let red8 = SwiftUI.Color(hex: "fffafa")
}

struct MagentaValuesContainer1 {
    let negative4 = SwiftUI.Color(hex: "410b2f")
    let negative3 = SwiftUI.Color(hex: "671e4d")
    let negative2 = SwiftUI.Color(hex: "f70aa8")
    let negative1 = SwiftUI.Color(hex: "953274")
    let magenta0 = SwiftUI.Color(hex: "91ae7a")
    let magenta1 = SwiftUI.Color(hex: "5d9ede")
    let magenta2 = SwiftUI.Color(hex: "ec89cb")
    let magenta3 = SwiftUI.Color(hex: "f7cae8")
    let magenta4 = SwiftUI.Color(hex: "fbd5ee")
    let magenta5 = SwiftUI.Color(hex: "fde2f4")
    let magenta6 = SwiftUI.Color(hex: "fdedf8")
    let magenta7 = SwiftUI.Color(hex: "fef6fb")
    let magenta8 = SwiftUI.Color(hex: "fffafd")
}

struct PurpleValuesContainer1 {
    let negative4 = SwiftUI.Color(hex: "410b2f")
    let negative3 = SwiftUI.Color(hex: "5b1e67")
    let negative2 = SwiftUI.Color(hex: "792989")
    let negative1 = SwiftUI.Color(hex: "853295")
    let purple0 = SwiftUI.Color(hex: "9939ac")
    let purple1 = SwiftUI.Color(hex: "4e82ee")
    let purple2 = SwiftUI.Color(hex: "d98eec")
    let purple3 = SwiftUI.Color(hex: "c04c0d")
    let purple4 = SwiftUI.Color(hex: "f5d5fb")
    let purple5 = SwiftUI.Color(hex: "f8e2fd")
    let purple6 = SwiftUI.Color(hex: "faedfd")
    let purple7 = SwiftUI.Color(hex: "fdf5ff")
    let purple8 = SwiftUI.Color(hex: "fefaff")
}

struct VioletValuesContainer1 {
    let negative4 = SwiftUI.Color(hex: "201263")
    let negative3 = SwiftUI.Color(hex: "39288a")
    let negative2 = SwiftUI.Color(hex: "161617")
    let negative1 = SwiftUI.Color(hex: "0e0406")
    let violet0 = SwiftUI.Color(hex: "634eca")
    let violet1 = SwiftUI.Color(hex: "927ef1")
    let violet2 = SwiftUI.Color(hex: "aba2fb")
    let violet3 = SwiftUI.Color(hex: "54917b")
    let violet4 = SwiftUI.Color(hex: "e3e0ff")
    let violet5 = SwiftUI.Color(hex: "eeebff")
    let violet6 = SwiftUI.Color(hex: "f3f0ff")
    let violet7 = SwiftUI.Color(hex: "f7f5ff")
    let violet8 = SwiftUI.Color(hex: "fbfaff")
}

struct BlueValuesContainer1 {
    let negative4 = SwiftUI.Color(hex: "041f5d")
    let negative3 = SwiftUI.Color(hex: "113997")
    let negative2 = SwiftUI.Color(hex: "658b6e")
    let negative1 = SwiftUI.Color(hex: "ff9375")
    let blue0 = SwiftUI.Color(hex: "3061d5")
    let blue1 = SwiftUI.Color(hex: "6691f4")
    let blue2 = SwiftUI.Color(hex: "8eb0fb")
    let blue3 = SwiftUI.Color(hex: "e30404")
    let blue4 = SwiftUI.Color(hex: "d6e3ff")
    let blue5 = SwiftUI.Color(hex: "e5eeff")
    let blue6 = SwiftUI.Color(hex: "ebf0ff")
    let blue7 = SwiftUI.Color(hex: "f5f8ff")
    let blue8 = SwiftUI.Color(hex: "fafbff")
}

struct CyanValuesContainer1 {
    let negative4 = SwiftUI.Color(hex: "002742")
    let negative3 = SwiftUI.Color(hex: "0c636e")
    let negative2 = SwiftUI.Color(hex: "165c8d")
    let negative1 = SwiftUI.Color(hex: "60a0cf")
    let cyan0 = SwiftUI.Color(hex: "0870ba")
    let cyan1 = SwiftUI.Color(hex: "5699dc")
    let cyan2 = SwiftUI.Color(hex: "79bcf6")
    let cyan3 = SwiftUI.Color(hex: "c2e2ff")
    let cyan4 = SwiftUI.Color(hex: "cce7ff")
    let cyan5 = SwiftUI.Color(hex: "e0f1ff")
    let cyan6 = SwiftUI.Color(hex: "ebf5ff")
    let cyan7 = SwiftUI.Color(hex: "f0f9ff")
    let cyan8 = SwiftUI.Color(hex: "fafdff")
}

struct TealValuesContainer1 {
    let negative4 = SwiftUI.Color(hex: "012a37")
    let negative3 = SwiftUI.Color(hex: "7c4fc4")
    let negative2 = SwiftUI.Color(hex: "d1d2d2")
    let negative1 = SwiftUI.Color(hex: "196c85")
    let teal0 = SwiftUI.Color(hex: "077597")
    let teal1 = SwiftUI.Color(hex: "4f9eba")
    let teal2 = SwiftUI.Color(hex: "7ac0dc")
    let teal3 = SwiftUI.Color(hex: "b8e8f5")
    let teal4 = SwiftUI.Color(hex: "c5ecf7")
    let teal5 = SwiftUI.Color(hex: "e0f3fa")
    let teal6 = SwiftUI.Color(hex: "e8f7fc")
    let teal7 = SwiftUI.Color(hex: "f0fbff")
    let teal8 = SwiftUI.Color(hex: "fafeff")
}

struct AquamarineValuesContainer1 {
    let negative4 = SwiftUI.Color(hex: "012d26")
    let negative3 = SwiftUI.Color(hex: "0d4a42")
    let negative2 = SwiftUI.Color(hex: "15665b")
    let negative1 = SwiftUI.Color(hex: "1a7061")
    let aquamarine0 = SwiftUI.Color(hex: "097b68")
    let aquamarine1 = SwiftUI.Color(hex: "3da496")
    let aquamarine2 = SwiftUI.Color(hex: "6ec9bf")
    let aquamarine4 = SwiftUI.Color(hex: "c5f2ec")
    let aquamarine3 = SwiftUI.Color(hex: "bee9e4")
    let aquamarine5 = SwiftUI.Color(hex: "daf6f3")
    let aquamarine6 = SwiftUI.Color(hex: "e2f8f5")
    let aquamarine7 = SwiftUI.Color(hex: "f0faf9")
    let aquamarine8 = SwiftUI.Color(hex: "fbfefe")
}

struct GreenValuesContainer1 {
    let negative4 = SwiftUI.Color(hex: "0a2e0b")
    let negative3 = SwiftUI.Color(hex: "b3b7b0")
    let negative2 = SwiftUI.Color(hex: "246626")
    let negative1 = SwiftUI.Color(hex: "2f6f2f")
    let green0 = SwiftUI.Color(hex: "20b068")
    let green1 = SwiftUI.Color(hex: "55a555")
    let green2 = SwiftUI.Color(hex: "fdff84")
    let green3 = SwiftUI.Color(hex: "0005ff")
    let green4 = SwiftUI.Color(hex: "cff2cf")
    let green5 = SwiftUI.Color(hex: "dff6df")
    let green6 = SwiftUI.Color(hex: "e6f9e6")
    let green7 = SwiftUI.Color(hex: "f4fbf4")
    let green8 = SwiftUI.Color(hex: "fbfefb")
}

struct OrangeValuesContainer1 {
    let negative4 = SwiftUI.Color(hex: "492909")
    let negative3 = SwiftUI.Color(hex: "3f2828")
    let negative2 = SwiftUI.Color(hex: "a05c1c")
    let negative1 = SwiftUI.Color(hex: "b4610e")
    let orange0 = SwiftUI.Color(hex: "f59638")
    let orange1 = SwiftUI.Color(hex: "f6a351")
    let orange2 = SwiftUI.Color(hex: "feb871")
    let orange3 = SwiftUI.Color(hex: "ffd4a8")
    let orange4 = SwiftUI.Color(hex: "fcdec0")
    let orange5 = SwiftUI.Color(hex: "ffe8d1")
    let orange6 = SwiftUI.Color(hex: "fff0e0")
    let orange7 = SwiftUI.Color(hex: "fff5eb")
    let orange8 = SwiftUI.Color(hex: "fffcfa")
}

struct TransparentValuesContainer {
    let transparent = SwiftUI.Color(hex: "ffffff00")
}

struct ColorValuesContainer {
    let content = ContentValuesContainer()
    let border = BorderValuesContainer()
    let background = BackgroundValuesContainer()
    let action = ActionValuesContainer()
    let interaction = InteractionValuesContainer()
    let nonSemantic = NonSemanticValuesContainer()
    let semantic = SemanticValuesContainer()
    let coolGray = CoolGrayValuesContainer()
    let coolGrayAlpha = CoolGrayAlphaValuesContainer()
    let neutralGray = NeutralGrayValuesContainer()
    let neutralGrayAlpha = NeutralGrayAlphaValuesContainer()
    let warmGray = WarmGrayValuesContainer()
    let warmGrayAlpha = WarmGrayAlphaValuesContainer()
    let whiteAlpha = WhiteAlphaValuesContainer()
    let red = RedValuesContainer1()
    let magenta = MagentaValuesContainer1()
    let purple = PurpleValuesContainer1()
    let violet = VioletValuesContainer1()
    let blue = BlueValuesContainer1()
    let cyan = CyanValuesContainer1()
    let teal = TealValuesContainer1()
    let aquamarine = AquamarineValuesContainer1()
    let green = GreenValuesContainer1()
    let orange = OrangeValuesContainer1()
    let transparent = TransparentValuesContainer()
}

struct BorderWidthValuesContainer {
    let focus = 2.0
    let none = 0.0
    let small = 1.0
    let medium = 2.0
    let large = 4.0
    let xLarge = 8.0
    let borderWidth0 = 0.0
    let borderWidth100 = 1.0
    let borderWidth200 = 2.0
    let borderWidth400 = 4.0
    let borderWidth800 = 8.0
}

struct BorderRadiusValuesContainer {
    let none = 0.0
    let small = 2.0
    let medium = 4.0
    let large = 8.0
    let xLarge = 12.0
    let borderRadius2xLarge = 16.0
    let borderRadius3xLarge = 20.0
    let borderRadius4xLarge = 24.0
    let full = 999.0
    let borderRadius0 = 0.0
    let borderRadius25 = 2.0
    let borderRadius50 = 4.0
    let borderRadius100 = 8.0
    let borderRadius150 = 12.0
    let borderRadius200 = 16.0
    let borderRadius250 = 20.0
    let borderRadius300 = 24.0
    let borderRadius999 = 999.0
}

struct SizeValuesContainer {
    let size3xLarge = 72.0
    let size2xLarge = 64.0
    let xLarge = 56.0
    let large = 48.0
    let medium = 40.0
    let small = 32.0
    let xSmall = 24.0
    let size2xSmall = 20.0
    let size3xSmall = 16.0
}

struct PaddingValuesContainer {
    let none = 0.0
    let padding2xSmall = 2.0
    let xSmall = 4.0
    let small = 8.0
    let medium = 12.0
    let large = 16.0
    let padding2xLarge = 24.0
    let padding3xLarge = 32.0
    let padding4xLarge = 40.0
    let padding5xLarge = 44.0
    let padding6xLarge = 64.0
}

struct GapValuesContainer {
    let none = 0.0
    let gap2xSmall = 2.0
    let xSmall = 4.0
    let small = 8.0
    let medium = 12.0
    let large = 16.0
    let xLarge = 24.0
    let gap2xLarge = 32.0
    let gap3xLarge = 44.0
}

struct SpaceValuesContainer {
    let padding = PaddingValuesContainer()
    let gap = GapValuesContainer()
}

struct OpacityValuesContainer {
    let disabled = 0.5
    let opacity0 = 0.0
    let opacity50 = 0.5
    let opacity100 = 1.0
}

struct CodeValuesContainer {
    let typographyCodeSmall = Typography(lineHeight: 16.0, letterSpacing: 0.0, fontWeight: 400.0, fontSize: 12.0, fontFamily: "Noto Sans Mono")
    let typographyCodeMedium = Typography(lineHeight: 20.0, letterSpacing: -0.006, fontWeight: 400.0, fontSize: 14.0, fontFamily: "Noto Sans Mono")
    let typographyCodeLarge = Typography(lineHeight: 22.0, letterSpacing: -0.011, fontWeight: 400.0, fontSize: 16.0, fontFamily: "Noto Sans Mono")
}

struct UtilityValuesContainer {
    let typographyUtilitySmall = Typography(lineHeight: 16.0, letterSpacing: 0.0, fontWeight: 500.0, fontSize: 12.0, fontFamily: "Noto Sans")
    let typographyUtilityMedium = Typography(lineHeight: 20.0, letterSpacing: -0.006, fontWeight: 500.0, fontSize: 14.0, fontFamily: "Noto Sans")
    let typographyUtilityLarge = Typography(lineHeight: 22.0, letterSpacing: -0.011, fontWeight: 500.0, fontSize: 16.0, fontFamily: "Noto Sans")
}

struct BodyValuesContainer {
    let typographyBodySmall = Typography(lineHeight: 16.0, letterSpacing: 0.0, fontWeight: 400.0, fontSize: 12.0, fontFamily: "Noto Sans")
    let typographyBodyMedium = Typography(lineHeight: 20.0, letterSpacing: -0.006, fontWeight: 400.0, fontSize: 14.0, fontFamily: "Noto Sans")
    let typographyBodyLarge = Typography(lineHeight: 22.0, letterSpacing: -0.011, fontWeight: 400.0, fontSize: 16.0, fontFamily: "Noto Sans")
}

struct HeadingValuesContainer {
    let typographyHeadingSmall = Typography(lineHeight: 16.0, letterSpacing: 0.0, fontWeight: 700.0, fontSize: 12.0, fontFamily: "Noto Sans")
    let typographyHeadingMedium = Typography(lineHeight: 20.0, letterSpacing: -0.006, fontWeight: 700.0, fontSize: 14.0, fontFamily: "Noto Sans")
    let typographyHeadingLarge = Typography(lineHeight: 22.0, letterSpacing: -0.011, fontWeight: 700.0, fontSize: 16.0, fontFamily: "Noto Sans")
    let typographyHeadingXLarge = Typography(lineHeight: 24.0, letterSpacing: -0.014, fontWeight: 700.0, fontSize: 18.0, fontFamily: "Noto Sans")
    let typographyHeading2xLarge = Typography(lineHeight: 26.0, letterSpacing: -0.017, fontWeight: 700.0, fontSize: 20.0, fontFamily: "Noto Sans")
    let typographyHeading3xLarge = Typography(lineHeight: 32.0, letterSpacing: -0.019, fontWeight: 700.0, fontSize: 24.0, fontFamily: "Noto Sans")
    let typographyHeading4xLarge = Typography(lineHeight: 38.0, letterSpacing: -0.021, fontWeight: 700.0, fontSize: 28.0, fontFamily: "Noto Sans")
    let typographyHeading5xLarge = Typography(lineHeight: 42.0, letterSpacing: -0.022, fontWeight: 700.0, fontSize: 32.0, fontFamily: "Noto Sans")
    let typographyHeading6xLarge = Typography(lineHeight: 48.0, letterSpacing: -0.022, fontWeight: 700.0, fontSize: 36.0, fontFamily: "Noto Sans")
    let typographyHeading7xLarge = Typography(lineHeight: 56.0, letterSpacing: -0.022, fontWeight: 700.0, fontSize: 42.0, fontFamily: "Noto Sans")
    let typographyHeading8xLarge = Typography(lineHeight: 58.0, letterSpacing: -0.022, fontWeight: 700.0, fontSize: 48.0, fontFamily: "Noto Sans")
    let typographyHeading9xLarge = Typography(lineHeight: 66.0, letterSpacing: -0.022, fontWeight: 700.0, fontSize: 54.0, fontFamily: "Noto Sans")
}

struct DisplayValuesContainer {
    let typographyDisplaySmall = Typography(lineHeight: 66.0, letterSpacing: -0.022, fontWeight: 700.0, fontSize: 54.0, fontFamily: "Noto Sans")
    let typographyDisplayMedium = Typography(lineHeight: 72.0, letterSpacing: -0.022, fontWeight: 700.0, fontSize: 60.0, fontFamily: "Noto Sans")
    let typographyDisplayLarge = Typography(lineHeight: 82.0, letterSpacing: -0.022, fontWeight: 700.0, fontSize: 68.0, fontFamily: "Noto Sans")
    let typographyDisplayXLarge = Typography(lineHeight: 92.0, letterSpacing: -0.022, fontWeight: 700.0, fontSize: 76.0, fontFamily: "Noto Sans")
    let typographyDisplay2xLarge = Typography(lineHeight: 102.0, letterSpacing: -0.022, fontWeight: 700.0, fontSize: 84.0, fontFamily: "Noto Sans")
    let typographyDisplay3xLarge = Typography(lineHeight: 112.0, letterSpacing: -0.022, fontWeight: 700.0, fontSize: 92.0, fontFamily: "Noto Sans")
}

struct TypographyValuesContainer {
    let code = CodeValuesContainer()
    let utility = UtilityValuesContainer()
    let body = BodyValuesContainer()
    let heading = HeadingValuesContainer()
    let display = DisplayValuesContainer()
}

struct DimensionValuesContainer {
    let dimension0 = 0.0
    let dimension25 = 2.0
    let dimension50 = 4.0
    let dimension100 = 8.0
    let dimension150 = 12.0
    let dimension200 = 16.0
    let dimension250 = 20.0
    let dimension300 = 24.0
    let dimension400 = 32.0
    let dimension500 = 40.0
    let dimension550 = 44.0
    let dimension600 = 48.0
    let dimension700 = 56.0
    let dimension800 = 64.0
    let dimension900 = 72.0
    let dimension1000 = 80.0
    let dimension1200 = 96.0
    let dimension1500 = 120.0
    let dimension1600 = 128.0
}

struct BottomValuesContainer {
    let elevationBottom100 = BoxShadow(y: 1.0, x: 0.0, type: "dropShadow", spread: 0.0, color: "#1b242c1f", blur: 2.0)
    let elevationBottom200 = [BoxShadow(y: 2.0, x: 0.0, type: "dropShadow", spread: -1.0, color: "#1b242c0a", blur: 2.0), BoxShadow(y: 2.0, x: 0.0, type: "dropShadow", spread: -1.0, color: "#1b242c14", blur: 8.0)]
    let elevationBottom300 = [BoxShadow(y: 2.0, x: 0.0, type: "dropShadow", spread: -1.0, color: "#1b242c0a", blur: 2.0), BoxShadow(y: 8.0, x: 0.0, type: "dropShadow", spread: -2.0, color: "#1b242c1f", blur: 16.0)]
    let elevationBottom400 = [BoxShadow(y: 2.0, x: 0.0, type: "dropShadow", spread: -1.0, color: "#1b242c0a", blur: 2.0), BoxShadow(y: 16.0, x: 0.0, type: "dropShadow", spread: -6.0, color: "#1b242c29", blur: 24.0)]
}

struct TopValuesContainer {
    let elevationTop100 = BoxShadow(y: -1.0, x: 0.0, type: "dropShadow", spread: 0.0, color: "#1b242c1f", blur: 2.0)
    let elevationTop200 = [BoxShadow(y: -2.0, x: 0.0, type: "dropShadow", spread: -1.0, color: "#1b242c0a", blur: 2.0), BoxShadow(y: -2.0, x: 0.0, type: "dropShadow", spread: -1.0, color: "#1b242c14", blur: 8.0)]
    let elevationTop300 = [BoxShadow(y: -2.0, x: 0.0, type: "dropShadow", spread: -1.0, color: "#1b242c0a", blur: 2.0), BoxShadow(y: -8.0, x: 0.0, type: "dropShadow", spread: -2.0, color: "#1b242c1f", blur: 16.0)]
    let elevationTop400 = [BoxShadow(y: -2.0, x: 0.0, type: "dropShadow", spread: -1.0, color: "#1b242c0a", blur: 2.0), BoxShadow(y: -16.0, x: 0.0, type: "dropShadow", spread: -6.0, color: "#1b242c29", blur: 24.0)]
}

struct ElevationValuesContainer {
    let bottom = BottomValuesContainer()
    let top = TopValuesContainer()
}

struct FontFamilyValuesContainer {
    let sans = "Noto Sans"
    let serif = "Noto Serif"
    let mono = "Noto Sans Mono"
}

struct FontSizeValuesContainer {
    let fontSize100 = 8.0
    let fontSize125 = 10.0
    let fontSize150 = 12.0
    let fontSize175 = 14.0
    let fontSize200 = 16.0
    let fontSize225 = 18.0
    let fontSize250 = 20.0
    let fontSize300 = 24.0
    let fontSize350 = 28.0
    let fontSize400 = 32.0
    let fontSize450 = 36.0
    let fontSize525 = 42.0
    let fontSize600 = 48.0
    let fontSize675 = 54.0
    let fontSize750 = 60.0
    let fontSize850 = 68.0
    let fontSize950 = 76.0
    let fontSize1050 = 84.0
    let fontSize1150 = 92.0
}

struct FontWeightValuesContainer {
    let fontWeight300 = 300.0
    let fontWeight400 = 400.0
    let fontWeight500 = 500.0
    let fontWeight600 = 600.0
    let fontWeight700 = 700.0
}

struct LetterSpacingValuesContainer {
    let letterSpacing0 = 0.0
    let letterSpacing100 = -0.006
    let letterSpacing200 = -0.011
    let letterSpacing300 = -0.014
    let letterSpacing400 = -0.017
    let letterSpacing500 = -0.019
    let letterSpacing600 = -0.021
    let letterSpacing700 = -0.022
}

struct LineHeightValuesContainer {
    let value150 = 12.0
    let value200 = 16.0
    let value250 = 20.0
    let value275 = 22.0
    let value300 = 24.0
    let value325 = 26.0
    let value400 = 32.0
    let value475 = 38.0
    let value525 = 42.0
    let value600 = 48.0
    let value700 = 56.0
    let value725 = 58.0
    let value825 = 66.0
    let value900 = 72.0
    let value1025 = 82.0
    let value1150 = 92.0
    let value1275 = 102.0
    let value1400 = 112.0
}

struct Typography {
    let lineHeight: CGFloat
    let letterSpacing: CGFloat
    let fontWeight: CGFloat
    let fontSize: CGFloat
    let fontFamily: String
}

struct BoxShadow {
    let y: CGFloat
    let x: CGFloat
    let type: String
    let spread: CGFloat
    let color: String
    let blur: CGFloat
}