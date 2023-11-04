import SwiftUI

public class DesignSystem {
    public var isDark = false
    private let colorDark: DSColor
    private let colorLight: DSColor
    public let borderWidth: DSBorderWidth
    public let borderRadius: DSBorderRadius
    public let size: DSSize
    public let space: DSSpace
    public let opacity: DSOpacity
    public let typography: DSTypography
    
    
    public var color: DSColor {
        isDark ? colorDark : colorLight
    }

    public init(
        colorDark: DSColor,
        colorLight: DSColor,
        borderWidth: DSBorderWidth,
        borderRadius: DSBorderRadius,
        size: DSSize,
        space: DSSpace,
        opacity: DSOpacity,
        typography: DSTypography
    ) {
        self.colorDark = colorDark
        self.colorLight = colorLight
        self.borderWidth = borderWidth
        self.borderRadius = borderRadius
        self.size = size
        self.space = space
        self.opacity = opacity
        self.typography = typography
    }
}

public struct DSContent {
    public let warningSecondary: SwiftUI.Color
    public let warningPrimary: SwiftUI.Color
    public let tertiaryInverse: SwiftUI.Color
    public let tertiary: SwiftUI.Color
    public let successSecondary: SwiftUI.Color
    public let successPrimary: SwiftUI.Color
    public let secondaryInverse: SwiftUI.Color
    public let secondary: SwiftUI.Color
    public let primaryInverse: SwiftUI.Color
    public let primary: SwiftUI.Color
    public let infoSecondary: SwiftUI.Color
    public let infoPrimary: SwiftUI.Color
    public let disabledInverse: SwiftUI.Color
    public let disabled: SwiftUI.Color
    public let dangerSecondary: SwiftUI.Color
    public let dangerPrimary: SwiftUI.Color
    public let brandSecondary: SwiftUI.Color
    public let brandPrimary: SwiftUI.Color
    
    

    public init(
        warningSecondary: SwiftUI.Color,
        warningPrimary: SwiftUI.Color,
        tertiaryInverse: SwiftUI.Color,
        tertiary: SwiftUI.Color,
        successSecondary: SwiftUI.Color,
        successPrimary: SwiftUI.Color,
        secondaryInverse: SwiftUI.Color,
        secondary: SwiftUI.Color,
        primaryInverse: SwiftUI.Color,
        primary: SwiftUI.Color,
        infoSecondary: SwiftUI.Color,
        infoPrimary: SwiftUI.Color,
        disabledInverse: SwiftUI.Color,
        disabled: SwiftUI.Color,
        dangerSecondary: SwiftUI.Color,
        dangerPrimary: SwiftUI.Color,
        brandSecondary: SwiftUI.Color,
        brandPrimary: SwiftUI.Color
    ) {
        self.warningSecondary = warningSecondary
        self.warningPrimary = warningPrimary
        self.tertiaryInverse = tertiaryInverse
        self.tertiary = tertiary
        self.successSecondary = successSecondary
        self.successPrimary = successPrimary
        self.secondaryInverse = secondaryInverse
        self.secondary = secondary
        self.primaryInverse = primaryInverse
        self.primary = primary
        self.infoSecondary = infoSecondary
        self.infoPrimary = infoPrimary
        self.disabledInverse = disabledInverse
        self.disabled = disabled
        self.dangerSecondary = dangerSecondary
        self.dangerPrimary = dangerPrimary
        self.brandSecondary = brandSecondary
        self.brandPrimary = brandPrimary
    }
}

public struct DSBorder {
    public let warningSubtle: SwiftUI.Color
    public let warningStrong: SwiftUI.Color
    public let successSubtle: SwiftUI.Color
    public let successStrong: SwiftUI.Color
    public let neutralSubtle: SwiftUI.Color
    public let neutralStrong: SwiftUI.Color
    public let inverse: SwiftUI.Color
    public let infoSubtle: SwiftUI.Color
    public let infoStrong: SwiftUI.Color
    public let defaultA: SwiftUI.Color
    public let `default`: SwiftUI.Color
    public let dangerSubtle: SwiftUI.Color
    public let dangerStrong: SwiftUI.Color
    
    

    public init(
        warningSubtle: SwiftUI.Color,
        warningStrong: SwiftUI.Color,
        successSubtle: SwiftUI.Color,
        successStrong: SwiftUI.Color,
        neutralSubtle: SwiftUI.Color,
        neutralStrong: SwiftUI.Color,
        inverse: SwiftUI.Color,
        infoSubtle: SwiftUI.Color,
        infoStrong: SwiftUI.Color,
        defaultA: SwiftUI.Color,
        default: SwiftUI.Color,
        dangerSubtle: SwiftUI.Color,
        dangerStrong: SwiftUI.Color
    ) {
        self.warningSubtle = warningSubtle
        self.warningStrong = warningStrong
        self.successSubtle = successSubtle
        self.successStrong = successStrong
        self.neutralSubtle = neutralSubtle
        self.neutralStrong = neutralStrong
        self.inverse = inverse
        self.infoSubtle = infoSubtle
        self.infoStrong = infoStrong
        self.defaultA = defaultA
        self.default = `default`
        self.dangerSubtle = dangerSubtle
        self.dangerStrong = dangerStrong
    }
}

public struct DSBackground {
    public let warningSurface: SwiftUI.Color
    public let warningSubtle: SwiftUI.Color
    public let warningStrong: SwiftUI.Color
    public let warningOnSubtle: SwiftUI.Color
    public let warningMuted: SwiftUI.Color
    public let successSurface: SwiftUI.Color
    public let successSubtle: SwiftUI.Color
    public let successStrong: SwiftUI.Color
    public let successOnSubtle: SwiftUI.Color
    public let successMuted: SwiftUI.Color
    public let neutralSurface: SwiftUI.Color
    public let neutralSubtle: SwiftUI.Color
    public let neutralStrong: SwiftUI.Color
    public let neutralOnSubtle: SwiftUI.Color
    public let neutralMuted: SwiftUI.Color
    public let inverse: SwiftUI.Color
    public let infoSurface: SwiftUI.Color
    public let infoSubtle: SwiftUI.Color
    public let infoStrong: SwiftUI.Color
    public let infoOnSubtle: SwiftUI.Color
    public let infoMuted: SwiftUI.Color
    public let `default`: SwiftUI.Color
    public let dangerSurface: SwiftUI.Color
    public let dangerSubtle: SwiftUI.Color
    public let dangerStrong: SwiftUI.Color
    public let dangerOnSubtle: SwiftUI.Color
    public let dangerMuted: SwiftUI.Color
    public let brandSurface: SwiftUI.Color
    public let brandSubtle: SwiftUI.Color
    public let brandStrong: SwiftUI.Color
    public let brandOnSubtle: SwiftUI.Color
    public let brandMuted: SwiftUI.Color
    
    

    public init(
        warningSurface: SwiftUI.Color,
        warningSubtle: SwiftUI.Color,
        warningStrong: SwiftUI.Color,
        warningOnSubtle: SwiftUI.Color,
        warningMuted: SwiftUI.Color,
        successSurface: SwiftUI.Color,
        successSubtle: SwiftUI.Color,
        successStrong: SwiftUI.Color,
        successOnSubtle: SwiftUI.Color,
        successMuted: SwiftUI.Color,
        neutralSurface: SwiftUI.Color,
        neutralSubtle: SwiftUI.Color,
        neutralStrong: SwiftUI.Color,
        neutralOnSubtle: SwiftUI.Color,
        neutralMuted: SwiftUI.Color,
        inverse: SwiftUI.Color,
        infoSurface: SwiftUI.Color,
        infoSubtle: SwiftUI.Color,
        infoStrong: SwiftUI.Color,
        infoOnSubtle: SwiftUI.Color,
        infoMuted: SwiftUI.Color,
        default: SwiftUI.Color,
        dangerSurface: SwiftUI.Color,
        dangerSubtle: SwiftUI.Color,
        dangerStrong: SwiftUI.Color,
        dangerOnSubtle: SwiftUI.Color,
        dangerMuted: SwiftUI.Color,
        brandSurface: SwiftUI.Color,
        brandSubtle: SwiftUI.Color,
        brandStrong: SwiftUI.Color,
        brandOnSubtle: SwiftUI.Color,
        brandMuted: SwiftUI.Color
    ) {
        self.warningSurface = warningSurface
        self.warningSubtle = warningSubtle
        self.warningStrong = warningStrong
        self.warningOnSubtle = warningOnSubtle
        self.warningMuted = warningMuted
        self.successSurface = successSurface
        self.successSubtle = successSubtle
        self.successStrong = successStrong
        self.successOnSubtle = successOnSubtle
        self.successMuted = successMuted
        self.neutralSurface = neutralSurface
        self.neutralSubtle = neutralSubtle
        self.neutralStrong = neutralStrong
        self.neutralOnSubtle = neutralOnSubtle
        self.neutralMuted = neutralMuted
        self.inverse = inverse
        self.infoSurface = infoSurface
        self.infoSubtle = infoSubtle
        self.infoStrong = infoStrong
        self.infoOnSubtle = infoOnSubtle
        self.infoMuted = infoMuted
        self.default = `default`
        self.dangerSurface = dangerSurface
        self.dangerSubtle = dangerSubtle
        self.dangerStrong = dangerStrong
        self.dangerOnSubtle = dangerOnSubtle
        self.dangerMuted = dangerMuted
        self.brandSurface = brandSurface
        self.brandSubtle = brandSubtle
        self.brandStrong = brandStrong
        self.brandOnSubtle = brandOnSubtle
        self.brandMuted = brandMuted
    }
}

public struct DSPrimary {
    public let actionPrimarySubtleSelected: SwiftUI.Color
    public let actionPrimarySubtleNormal: SwiftUI.Color
    public let actionPrimarySubtleHover: SwiftUI.Color
    public let actionPrimarySubtleActive: SwiftUI.Color
    public let actionPrimarySelected: SwiftUI.Color
    public let actionPrimaryNormal: SwiftUI.Color
    public let actionPrimaryHover: SwiftUI.Color
    public let actionPrimaryActive: SwiftUI.Color
    
    

    public init(
        actionPrimarySubtleSelected: SwiftUI.Color,
        actionPrimarySubtleNormal: SwiftUI.Color,
        actionPrimarySubtleHover: SwiftUI.Color,
        actionPrimarySubtleActive: SwiftUI.Color,
        actionPrimarySelected: SwiftUI.Color,
        actionPrimaryNormal: SwiftUI.Color,
        actionPrimaryHover: SwiftUI.Color,
        actionPrimaryActive: SwiftUI.Color
    ) {
        self.actionPrimarySubtleSelected = actionPrimarySubtleSelected
        self.actionPrimarySubtleNormal = actionPrimarySubtleNormal
        self.actionPrimarySubtleHover = actionPrimarySubtleHover
        self.actionPrimarySubtleActive = actionPrimarySubtleActive
        self.actionPrimarySelected = actionPrimarySelected
        self.actionPrimaryNormal = actionPrimaryNormal
        self.actionPrimaryHover = actionPrimaryHover
        self.actionPrimaryActive = actionPrimaryActive
    }
}

public struct DSNeutral {
    public let actionNeutralSubtleSelected: SwiftUI.Color
    public let actionNeutralSubtleNormal: SwiftUI.Color
    public let actionNeutralSubtleHover: SwiftUI.Color
    public let actionNeutralSubtleActive: SwiftUI.Color
    public let actionNeutralSelected: SwiftUI.Color
    public let actionNeutralNormal: SwiftUI.Color
    public let actionNeutralHover: SwiftUI.Color
    public let actionNeutralActive: SwiftUI.Color
    
    

    public init(
        actionNeutralSubtleSelected: SwiftUI.Color,
        actionNeutralSubtleNormal: SwiftUI.Color,
        actionNeutralSubtleHover: SwiftUI.Color,
        actionNeutralSubtleActive: SwiftUI.Color,
        actionNeutralSelected: SwiftUI.Color,
        actionNeutralNormal: SwiftUI.Color,
        actionNeutralHover: SwiftUI.Color,
        actionNeutralActive: SwiftUI.Color
    ) {
        self.actionNeutralSubtleSelected = actionNeutralSubtleSelected
        self.actionNeutralSubtleNormal = actionNeutralSubtleNormal
        self.actionNeutralSubtleHover = actionNeutralSubtleHover
        self.actionNeutralSubtleActive = actionNeutralSubtleActive
        self.actionNeutralSelected = actionNeutralSelected
        self.actionNeutralNormal = actionNeutralNormal
        self.actionNeutralHover = actionNeutralHover
        self.actionNeutralActive = actionNeutralActive
    }
}

public struct DSSuccess {
    public let actionSuccessSubtleSelected: SwiftUI.Color
    public let actionSuccessSubtleNormal: SwiftUI.Color
    public let actionSuccessSubtleHover: SwiftUI.Color
    public let actionSuccessSubtleActive: SwiftUI.Color
    public let actionSuccessSelected: SwiftUI.Color
    public let actionSuccessNormal: SwiftUI.Color
    public let actionSuccessHover: SwiftUI.Color
    public let actionSuccessActive: SwiftUI.Color
    
    

    public init(
        actionSuccessSubtleSelected: SwiftUI.Color,
        actionSuccessSubtleNormal: SwiftUI.Color,
        actionSuccessSubtleHover: SwiftUI.Color,
        actionSuccessSubtleActive: SwiftUI.Color,
        actionSuccessSelected: SwiftUI.Color,
        actionSuccessNormal: SwiftUI.Color,
        actionSuccessHover: SwiftUI.Color,
        actionSuccessActive: SwiftUI.Color
    ) {
        self.actionSuccessSubtleSelected = actionSuccessSubtleSelected
        self.actionSuccessSubtleNormal = actionSuccessSubtleNormal
        self.actionSuccessSubtleHover = actionSuccessSubtleHover
        self.actionSuccessSubtleActive = actionSuccessSubtleActive
        self.actionSuccessSelected = actionSuccessSelected
        self.actionSuccessNormal = actionSuccessNormal
        self.actionSuccessHover = actionSuccessHover
        self.actionSuccessActive = actionSuccessActive
    }
}

public struct DSDanger {
    public let actionDangerSubtleSelected: SwiftUI.Color
    public let actionDangerSubtleNormal: SwiftUI.Color
    public let actionDangerSubtleHover: SwiftUI.Color
    public let actionDangerSubtleActive: SwiftUI.Color
    public let actionDangerSelected: SwiftUI.Color
    public let actionDangerNormal: SwiftUI.Color
    public let actionDangerHover: SwiftUI.Color
    public let actionDangerActive: SwiftUI.Color
    
    

    public init(
        actionDangerSubtleSelected: SwiftUI.Color,
        actionDangerSubtleNormal: SwiftUI.Color,
        actionDangerSubtleHover: SwiftUI.Color,
        actionDangerSubtleActive: SwiftUI.Color,
        actionDangerSelected: SwiftUI.Color,
        actionDangerNormal: SwiftUI.Color,
        actionDangerHover: SwiftUI.Color,
        actionDangerActive: SwiftUI.Color
    ) {
        self.actionDangerSubtleSelected = actionDangerSubtleSelected
        self.actionDangerSubtleNormal = actionDangerSubtleNormal
        self.actionDangerSubtleHover = actionDangerSubtleHover
        self.actionDangerSubtleActive = actionDangerSubtleActive
        self.actionDangerSelected = actionDangerSelected
        self.actionDangerNormal = actionDangerNormal
        self.actionDangerHover = actionDangerHover
        self.actionDangerActive = actionDangerActive
    }
}

public struct DSGhost {
    public let actionGhostSelected: SwiftUI.Color
    public let actionGhostNormal: SwiftUI.Color
    public let actionGhostInverseSelected: SwiftUI.Color
    public let actionGhostInverseHover: SwiftUI.Color
    public let actionGhostInverseActive: SwiftUI.Color
    public let actionGhostHover: SwiftUI.Color
    public let actionGhostDangerSelected: SwiftUI.Color
    public let actionGhostDangerHover: SwiftUI.Color
    public let actionGhostDangerActive: SwiftUI.Color
    public let actionGhostActive: SwiftUI.Color
    
    

    public init(
        actionGhostSelected: SwiftUI.Color,
        actionGhostNormal: SwiftUI.Color,
        actionGhostInverseSelected: SwiftUI.Color,
        actionGhostInverseHover: SwiftUI.Color,
        actionGhostInverseActive: SwiftUI.Color,
        actionGhostHover: SwiftUI.Color,
        actionGhostDangerSelected: SwiftUI.Color,
        actionGhostDangerHover: SwiftUI.Color,
        actionGhostDangerActive: SwiftUI.Color,
        actionGhostActive: SwiftUI.Color
    ) {
        self.actionGhostSelected = actionGhostSelected
        self.actionGhostNormal = actionGhostNormal
        self.actionGhostInverseSelected = actionGhostInverseSelected
        self.actionGhostInverseHover = actionGhostInverseHover
        self.actionGhostInverseActive = actionGhostInverseActive
        self.actionGhostHover = actionGhostHover
        self.actionGhostDangerSelected = actionGhostDangerSelected
        self.actionGhostDangerHover = actionGhostDangerHover
        self.actionGhostDangerActive = actionGhostDangerActive
        self.actionGhostActive = actionGhostActive
    }
}

public struct DSOutline {
    public let actionOutlineSelected: SwiftUI.Color
    public let actionOutlineNormal: SwiftUI.Color
    public let actionOutlineHover: SwiftUI.Color
    public let actionOutlineActive: SwiftUI.Color
    
    

    public init(
        actionOutlineSelected: SwiftUI.Color,
        actionOutlineNormal: SwiftUI.Color,
        actionOutlineHover: SwiftUI.Color,
        actionOutlineActive: SwiftUI.Color
    ) {
        self.actionOutlineSelected = actionOutlineSelected
        self.actionOutlineNormal = actionOutlineNormal
        self.actionOutlineHover = actionOutlineHover
        self.actionOutlineActive = actionOutlineActive
    }
}

public struct DSInverse {
    public let actionInverseSelected: SwiftUI.Color
    public let actionInverseNormal: SwiftUI.Color
    public let actionInverseHover: SwiftUI.Color
    public let actionInverseActive: SwiftUI.Color
    
    

    public init(
        actionInverseSelected: SwiftUI.Color,
        actionInverseNormal: SwiftUI.Color,
        actionInverseHover: SwiftUI.Color,
        actionInverseActive: SwiftUI.Color
    ) {
        self.actionInverseSelected = actionInverseSelected
        self.actionInverseNormal = actionInverseNormal
        self.actionInverseHover = actionInverseHover
        self.actionInverseActive = actionInverseActive
    }
}

public struct DSReverseInverse {
    public let actionReverseInverseSelected: SwiftUI.Color
    public let actionReverseInverseNormal: SwiftUI.Color
    public let actionReverseInverseHover: SwiftUI.Color
    public let actionReverseInverseActive: SwiftUI.Color
    
    

    public init(
        actionReverseInverseSelected: SwiftUI.Color,
        actionReverseInverseNormal: SwiftUI.Color,
        actionReverseInverseHover: SwiftUI.Color,
        actionReverseInverseActive: SwiftUI.Color
    ) {
        self.actionReverseInverseSelected = actionReverseInverseSelected
        self.actionReverseInverseNormal = actionReverseInverseNormal
        self.actionReverseInverseHover = actionReverseInverseHover
        self.actionReverseInverseActive = actionReverseInverseActive
    }
}

public struct DSAction {
    public let success: DSSuccess
    public let reverseInverse: DSReverseInverse
    public let primary: DSPrimary
    public let outline: DSOutline
    public let neutral: DSNeutral
    public let inverse: DSInverse
    public let ghost: DSGhost
    public let danger: DSDanger
    
    

    public init(
        success: DSSuccess,
        reverseInverse: DSReverseInverse,
        primary: DSPrimary,
        outline: DSOutline,
        neutral: DSNeutral,
        inverse: DSInverse,
        ghost: DSGhost,
        danger: DSDanger
    ) {
        self.success = success
        self.reverseInverse = reverseInverse
        self.primary = primary
        self.outline = outline
        self.neutral = neutral
        self.inverse = inverse
        self.ghost = ghost
        self.danger = danger
    }
}

public struct DSDefault {
    public let interactionDefaultSubtleSelected: SwiftUI.Color
    public let interactionDefaultSubtleNormal: SwiftUI.Color
    public let interactionDefaultSubtleHover: SwiftUI.Color
    public let interactionDefaultSubtleActive: SwiftUI.Color
    public let interactionDefaultSelected: SwiftUI.Color
    public let interactionDefaultNormal: SwiftUI.Color
    public let interactionDefaultHover: SwiftUI.Color
    public let interactionDefaultActive: SwiftUI.Color
    
    

    public init(
        interactionDefaultSubtleSelected: SwiftUI.Color,
        interactionDefaultSubtleNormal: SwiftUI.Color,
        interactionDefaultSubtleHover: SwiftUI.Color,
        interactionDefaultSubtleActive: SwiftUI.Color,
        interactionDefaultSelected: SwiftUI.Color,
        interactionDefaultNormal: SwiftUI.Color,
        interactionDefaultHover: SwiftUI.Color,
        interactionDefaultActive: SwiftUI.Color
    ) {
        self.interactionDefaultSubtleSelected = interactionDefaultSubtleSelected
        self.interactionDefaultSubtleNormal = interactionDefaultSubtleNormal
        self.interactionDefaultSubtleHover = interactionDefaultSubtleHover
        self.interactionDefaultSubtleActive = interactionDefaultSubtleActive
        self.interactionDefaultSelected = interactionDefaultSelected
        self.interactionDefaultNormal = interactionDefaultNormal
        self.interactionDefaultHover = interactionDefaultHover
        self.interactionDefaultActive = interactionDefaultActive
    }
}

public struct DSNeutral1 {
    public let interactionNeutralSubtleSelected: SwiftUI.Color
    public let interactionNeutralSubtleNormal: SwiftUI.Color
    public let interactionNeutralSubtleHover: SwiftUI.Color
    public let interactionNeutralSubtleActive: SwiftUI.Color
    public let interactionNeutralSelected: SwiftUI.Color
    public let interactionNeutralNormal: SwiftUI.Color
    public let interactionNeutralHover: SwiftUI.Color
    public let interactionNeutralActive: SwiftUI.Color
    
    

    public init(
        interactionNeutralSubtleSelected: SwiftUI.Color,
        interactionNeutralSubtleNormal: SwiftUI.Color,
        interactionNeutralSubtleHover: SwiftUI.Color,
        interactionNeutralSubtleActive: SwiftUI.Color,
        interactionNeutralSelected: SwiftUI.Color,
        interactionNeutralNormal: SwiftUI.Color,
        interactionNeutralHover: SwiftUI.Color,
        interactionNeutralActive: SwiftUI.Color
    ) {
        self.interactionNeutralSubtleSelected = interactionNeutralSubtleSelected
        self.interactionNeutralSubtleNormal = interactionNeutralSubtleNormal
        self.interactionNeutralSubtleHover = interactionNeutralSubtleHover
        self.interactionNeutralSubtleActive = interactionNeutralSubtleActive
        self.interactionNeutralSelected = interactionNeutralSelected
        self.interactionNeutralNormal = interactionNeutralNormal
        self.interactionNeutralHover = interactionNeutralHover
        self.interactionNeutralActive = interactionNeutralActive
    }
}

public struct DSDanger1 {
    public let interactionDangerSubtleSelected: SwiftUI.Color
    public let interactionDangerSubtleNormal: SwiftUI.Color
    public let interactionDangerSubtleHover: SwiftUI.Color
    public let interactionDangerSubtleActive: SwiftUI.Color
    public let interactionDangerSelected: SwiftUI.Color
    public let interactionDangerNormal: SwiftUI.Color
    public let interactionDangerHover: SwiftUI.Color
    public let interactionDangerActive: SwiftUI.Color
    
    

    public init(
        interactionDangerSubtleSelected: SwiftUI.Color,
        interactionDangerSubtleNormal: SwiftUI.Color,
        interactionDangerSubtleHover: SwiftUI.Color,
        interactionDangerSubtleActive: SwiftUI.Color,
        interactionDangerSelected: SwiftUI.Color,
        interactionDangerNormal: SwiftUI.Color,
        interactionDangerHover: SwiftUI.Color,
        interactionDangerActive: SwiftUI.Color
    ) {
        self.interactionDangerSubtleSelected = interactionDangerSubtleSelected
        self.interactionDangerSubtleNormal = interactionDangerSubtleNormal
        self.interactionDangerSubtleHover = interactionDangerSubtleHover
        self.interactionDangerSubtleActive = interactionDangerSubtleActive
        self.interactionDangerSelected = interactionDangerSelected
        self.interactionDangerNormal = interactionDangerNormal
        self.interactionDangerHover = interactionDangerHover
        self.interactionDangerActive = interactionDangerActive
    }
}

public struct DSGhost1 {
    public let interactionGhostSelected: SwiftUI.Color
    public let interactionGhostNormal: SwiftUI.Color
    public let interactionGhostInverseSelected: SwiftUI.Color
    public let interactionGhostInverseNormal: SwiftUI.Color
    public let interactionGhostInverseHover: SwiftUI.Color
    public let interactionGhostHover: SwiftUI.Color
    public let interactionGhostDangerSelected: SwiftUI.Color
    public let interactionGhostDangerNormal: SwiftUI.Color
    public let interactionGhostDangerHover: SwiftUI.Color
    public let interactionGhostActive: SwiftUI.Color
    
    

    public init(
        interactionGhostSelected: SwiftUI.Color,
        interactionGhostNormal: SwiftUI.Color,
        interactionGhostInverseSelected: SwiftUI.Color,
        interactionGhostInverseNormal: SwiftUI.Color,
        interactionGhostInverseHover: SwiftUI.Color,
        interactionGhostHover: SwiftUI.Color,
        interactionGhostDangerSelected: SwiftUI.Color,
        interactionGhostDangerNormal: SwiftUI.Color,
        interactionGhostDangerHover: SwiftUI.Color,
        interactionGhostActive: SwiftUI.Color
    ) {
        self.interactionGhostSelected = interactionGhostSelected
        self.interactionGhostNormal = interactionGhostNormal
        self.interactionGhostInverseSelected = interactionGhostInverseSelected
        self.interactionGhostInverseNormal = interactionGhostInverseNormal
        self.interactionGhostInverseHover = interactionGhostInverseHover
        self.interactionGhostHover = interactionGhostHover
        self.interactionGhostDangerSelected = interactionGhostDangerSelected
        self.interactionGhostDangerNormal = interactionGhostDangerNormal
        self.interactionGhostDangerHover = interactionGhostDangerHover
        self.interactionGhostActive = interactionGhostActive
    }
}

public struct DSDisabled {
    public let interactionDisabledSubtleNormal: SwiftUI.Color
    public let interactionDisabledSubtleHover: SwiftUI.Color
    public let interactionDisabledSubtleActive: SwiftUI.Color
    public let interactionDisabledNormal: SwiftUI.Color
    public let interactionDisabledHover: SwiftUI.Color
    public let interactionDisabledActive: SwiftUI.Color
    
    

    public init(
        interactionDisabledSubtleNormal: SwiftUI.Color,
        interactionDisabledSubtleHover: SwiftUI.Color,
        interactionDisabledSubtleActive: SwiftUI.Color,
        interactionDisabledNormal: SwiftUI.Color,
        interactionDisabledHover: SwiftUI.Color,
        interactionDisabledActive: SwiftUI.Color
    ) {
        self.interactionDisabledSubtleNormal = interactionDisabledSubtleNormal
        self.interactionDisabledSubtleHover = interactionDisabledSubtleHover
        self.interactionDisabledSubtleActive = interactionDisabledSubtleActive
        self.interactionDisabledNormal = interactionDisabledNormal
        self.interactionDisabledHover = interactionDisabledHover
        self.interactionDisabledActive = interactionDisabledActive
    }
}

public struct DSBorder1 {
    public let interactionBorderSelected: SwiftUI.Color
    public let interactionBorderNormal: SwiftUI.Color
    public let interactionBorderNeutralSelected: SwiftUI.Color
    public let interactionBorderNeutralNormal: SwiftUI.Color
    public let interactionBorderNeutralHover: SwiftUI.Color
    public let interactionBorderNeutralActive: SwiftUI.Color
    public let interactionBorderHover: SwiftUI.Color
    public let interactionBorderDanger: SwiftUI.Color
    public let interactionBorderActive: SwiftUI.Color
    
    

    public init(
        interactionBorderSelected: SwiftUI.Color,
        interactionBorderNormal: SwiftUI.Color,
        interactionBorderNeutralSelected: SwiftUI.Color,
        interactionBorderNeutralNormal: SwiftUI.Color,
        interactionBorderNeutralHover: SwiftUI.Color,
        interactionBorderNeutralActive: SwiftUI.Color,
        interactionBorderHover: SwiftUI.Color,
        interactionBorderDanger: SwiftUI.Color,
        interactionBorderActive: SwiftUI.Color
    ) {
        self.interactionBorderSelected = interactionBorderSelected
        self.interactionBorderNormal = interactionBorderNormal
        self.interactionBorderNeutralSelected = interactionBorderNeutralSelected
        self.interactionBorderNeutralNormal = interactionBorderNeutralNormal
        self.interactionBorderNeutralHover = interactionBorderNeutralHover
        self.interactionBorderNeutralActive = interactionBorderNeutralActive
        self.interactionBorderHover = interactionBorderHover
        self.interactionBorderDanger = interactionBorderDanger
        self.interactionBorderActive = interactionBorderActive
    }
}

public struct DSBackground1 {
    public let interactionBackgroundSidepanel: SwiftUI.Color
    public let interactionBackgroundModelessInverse: SwiftUI.Color
    public let interactionBackgroundModeless: SwiftUI.Color
    public let interactionBackgroundModal: SwiftUI.Color
    public let interactionBackgroundFormField: SwiftUI.Color
    public let interactionBackgroundDimmer: SwiftUI.Color
    
    

    public init(
        interactionBackgroundSidepanel: SwiftUI.Color,
        interactionBackgroundModelessInverse: SwiftUI.Color,
        interactionBackgroundModeless: SwiftUI.Color,
        interactionBackgroundModal: SwiftUI.Color,
        interactionBackgroundFormField: SwiftUI.Color,
        interactionBackgroundDimmer: SwiftUI.Color
    ) {
        self.interactionBackgroundSidepanel = interactionBackgroundSidepanel
        self.interactionBackgroundModelessInverse = interactionBackgroundModelessInverse
        self.interactionBackgroundModeless = interactionBackgroundModeless
        self.interactionBackgroundModal = interactionBackgroundModal
        self.interactionBackgroundFormField = interactionBackgroundFormField
        self.interactionBackgroundDimmer = interactionBackgroundDimmer
    }
}

public struct DSInverse1 {
    public let interactionInverseSelected: SwiftUI.Color
    public let interactionInverseNormal: SwiftUI.Color
    public let interactionInverseHover: SwiftUI.Color
    public let interactionInverseActive: SwiftUI.Color
    
    

    public init(
        interactionInverseSelected: SwiftUI.Color,
        interactionInverseNormal: SwiftUI.Color,
        interactionInverseHover: SwiftUI.Color,
        interactionInverseActive: SwiftUI.Color
    ) {
        self.interactionInverseSelected = interactionInverseSelected
        self.interactionInverseNormal = interactionInverseNormal
        self.interactionInverseHover = interactionInverseHover
        self.interactionInverseActive = interactionInverseActive
    }
}

public struct DSFocus {
    public let interactionFocusDefault: SwiftUI.Color
    
    

    public init(
        interactionFocusDefault: SwiftUI.Color
    ) {
        self.interactionFocusDefault = interactionFocusDefault
    }
}

public struct DSInteraction {
    public let neutral: DSNeutral1
    public let inverse: DSInverse1
    public let ghost: DSGhost1
    public let focus: DSFocus
    public let disabled: DSDisabled
    public let `default`: DSDefault
    public let danger: DSDanger1
    public let border: DSBorder1
    public let background: DSBackground1
    
    

    public init(
        neutral: DSNeutral1,
        inverse: DSInverse1,
        ghost: DSGhost1,
        focus: DSFocus,
        disabled: DSDisabled,
        default: DSDefault,
        danger: DSDanger1,
        border: DSBorder1,
        background: DSBackground1
    ) {
        self.neutral = neutral
        self.inverse = inverse
        self.ghost = ghost
        self.focus = focus
        self.disabled = disabled
        self.default = `default`
        self.danger = danger
        self.border = border
        self.background = background
    }
}

public struct DSGray {
    public let nonSemanticGrayContentSecondary: SwiftUI.Color
    public let nonSemanticGrayContentPrimary: SwiftUI.Color
    public let nonSemanticGrayBorderSubtle: SwiftUI.Color
    public let nonSemanticGrayBorderStrong: SwiftUI.Color
    public let nonSemanticGrayBorderDefault: SwiftUI.Color
    public let nonSemanticGrayBackgroundSurface: SwiftUI.Color
    public let nonSemanticGrayBackgroundSubtle: SwiftUI.Color
    public let nonSemanticGrayBackgroundStrong: SwiftUI.Color
    public let nonSemanticGrayBackgroundOnSubtle: SwiftUI.Color
    public let nonSemanticGrayBackgroundMuted: SwiftUI.Color
    
    

    public init(
        nonSemanticGrayContentSecondary: SwiftUI.Color,
        nonSemanticGrayContentPrimary: SwiftUI.Color,
        nonSemanticGrayBorderSubtle: SwiftUI.Color,
        nonSemanticGrayBorderStrong: SwiftUI.Color,
        nonSemanticGrayBorderDefault: SwiftUI.Color,
        nonSemanticGrayBackgroundSurface: SwiftUI.Color,
        nonSemanticGrayBackgroundSubtle: SwiftUI.Color,
        nonSemanticGrayBackgroundStrong: SwiftUI.Color,
        nonSemanticGrayBackgroundOnSubtle: SwiftUI.Color,
        nonSemanticGrayBackgroundMuted: SwiftUI.Color
    ) {
        self.nonSemanticGrayContentSecondary = nonSemanticGrayContentSecondary
        self.nonSemanticGrayContentPrimary = nonSemanticGrayContentPrimary
        self.nonSemanticGrayBorderSubtle = nonSemanticGrayBorderSubtle
        self.nonSemanticGrayBorderStrong = nonSemanticGrayBorderStrong
        self.nonSemanticGrayBorderDefault = nonSemanticGrayBorderDefault
        self.nonSemanticGrayBackgroundSurface = nonSemanticGrayBackgroundSurface
        self.nonSemanticGrayBackgroundSubtle = nonSemanticGrayBackgroundSubtle
        self.nonSemanticGrayBackgroundStrong = nonSemanticGrayBackgroundStrong
        self.nonSemanticGrayBackgroundOnSubtle = nonSemanticGrayBackgroundOnSubtle
        self.nonSemanticGrayBackgroundMuted = nonSemanticGrayBackgroundMuted
    }
}

public struct DSWhite {
    public let nonSemanticWhiteContentSecondary: SwiftUI.Color
    public let nonSemanticWhiteContentPrimary: SwiftUI.Color
    public let nonSemanticWhiteBorderSubtle: SwiftUI.Color
    public let nonSemanticWhiteBorderStrong: SwiftUI.Color
    public let nonSemanticWhiteBorderDefault: SwiftUI.Color
    public let nonSemanticWhiteBackgroundSurface: SwiftUI.Color
    public let nonSemanticWhiteBackgroundSubtle: SwiftUI.Color
    public let nonSemanticWhiteBackgroundStrong: SwiftUI.Color
    public let nonSemanticWhiteBackgroundOnSubtle: SwiftUI.Color
    public let nonSemanticWhiteBackgroundMuted: SwiftUI.Color
    
    

    public init(
        nonSemanticWhiteContentSecondary: SwiftUI.Color,
        nonSemanticWhiteContentPrimary: SwiftUI.Color,
        nonSemanticWhiteBorderSubtle: SwiftUI.Color,
        nonSemanticWhiteBorderStrong: SwiftUI.Color,
        nonSemanticWhiteBorderDefault: SwiftUI.Color,
        nonSemanticWhiteBackgroundSurface: SwiftUI.Color,
        nonSemanticWhiteBackgroundSubtle: SwiftUI.Color,
        nonSemanticWhiteBackgroundStrong: SwiftUI.Color,
        nonSemanticWhiteBackgroundOnSubtle: SwiftUI.Color,
        nonSemanticWhiteBackgroundMuted: SwiftUI.Color
    ) {
        self.nonSemanticWhiteContentSecondary = nonSemanticWhiteContentSecondary
        self.nonSemanticWhiteContentPrimary = nonSemanticWhiteContentPrimary
        self.nonSemanticWhiteBorderSubtle = nonSemanticWhiteBorderSubtle
        self.nonSemanticWhiteBorderStrong = nonSemanticWhiteBorderStrong
        self.nonSemanticWhiteBorderDefault = nonSemanticWhiteBorderDefault
        self.nonSemanticWhiteBackgroundSurface = nonSemanticWhiteBackgroundSurface
        self.nonSemanticWhiteBackgroundSubtle = nonSemanticWhiteBackgroundSubtle
        self.nonSemanticWhiteBackgroundStrong = nonSemanticWhiteBackgroundStrong
        self.nonSemanticWhiteBackgroundOnSubtle = nonSemanticWhiteBackgroundOnSubtle
        self.nonSemanticWhiteBackgroundMuted = nonSemanticWhiteBackgroundMuted
    }
}

public struct DSRed {
    public let nonSemanticRedContentSecondary: SwiftUI.Color
    public let nonSemanticRedContentPrimary: SwiftUI.Color
    public let nonSemanticRedBorderSubtle: SwiftUI.Color
    public let nonSemanticRedBorderStrong: SwiftUI.Color
    public let nonSemanticRedBorderDefault: SwiftUI.Color
    public let nonSemanticRedBackgroundSurface: SwiftUI.Color
    public let nonSemanticRedBackgroundSubtle: SwiftUI.Color
    public let nonSemanticRedBackgroundStrong: SwiftUI.Color
    public let nonSemanticRedBackgroundOnSubtle: SwiftUI.Color
    public let nonSemanticRedBackgroundMuted: SwiftUI.Color
    
    

    public init(
        nonSemanticRedContentSecondary: SwiftUI.Color,
        nonSemanticRedContentPrimary: SwiftUI.Color,
        nonSemanticRedBorderSubtle: SwiftUI.Color,
        nonSemanticRedBorderStrong: SwiftUI.Color,
        nonSemanticRedBorderDefault: SwiftUI.Color,
        nonSemanticRedBackgroundSurface: SwiftUI.Color,
        nonSemanticRedBackgroundSubtle: SwiftUI.Color,
        nonSemanticRedBackgroundStrong: SwiftUI.Color,
        nonSemanticRedBackgroundOnSubtle: SwiftUI.Color,
        nonSemanticRedBackgroundMuted: SwiftUI.Color
    ) {
        self.nonSemanticRedContentSecondary = nonSemanticRedContentSecondary
        self.nonSemanticRedContentPrimary = nonSemanticRedContentPrimary
        self.nonSemanticRedBorderSubtle = nonSemanticRedBorderSubtle
        self.nonSemanticRedBorderStrong = nonSemanticRedBorderStrong
        self.nonSemanticRedBorderDefault = nonSemanticRedBorderDefault
        self.nonSemanticRedBackgroundSurface = nonSemanticRedBackgroundSurface
        self.nonSemanticRedBackgroundSubtle = nonSemanticRedBackgroundSubtle
        self.nonSemanticRedBackgroundStrong = nonSemanticRedBackgroundStrong
        self.nonSemanticRedBackgroundOnSubtle = nonSemanticRedBackgroundOnSubtle
        self.nonSemanticRedBackgroundMuted = nonSemanticRedBackgroundMuted
    }
}

public struct DSMagenta {
    public let nonSemanticMagentaContentSecondary: SwiftUI.Color
    public let nonSemanticMagentaContentPrimary: SwiftUI.Color
    public let nonSemanticMagentaBorderSubtle: SwiftUI.Color
    public let nonSemanticMagentaBorderStrong: SwiftUI.Color
    public let nonSemanticMagentaBorderDefault: SwiftUI.Color
    public let nonSemanticMagentaBackgroundSurface: SwiftUI.Color
    public let nonSemanticMagentaBackgroundSubtle: SwiftUI.Color
    public let nonSemanticMagentaBackgroundStrong: SwiftUI.Color
    public let nonSemanticMagentaBackgroundOnSubtle: SwiftUI.Color
    public let nonSemanticMagentaBackgroundMuted: SwiftUI.Color
    
    

    public init(
        nonSemanticMagentaContentSecondary: SwiftUI.Color,
        nonSemanticMagentaContentPrimary: SwiftUI.Color,
        nonSemanticMagentaBorderSubtle: SwiftUI.Color,
        nonSemanticMagentaBorderStrong: SwiftUI.Color,
        nonSemanticMagentaBorderDefault: SwiftUI.Color,
        nonSemanticMagentaBackgroundSurface: SwiftUI.Color,
        nonSemanticMagentaBackgroundSubtle: SwiftUI.Color,
        nonSemanticMagentaBackgroundStrong: SwiftUI.Color,
        nonSemanticMagentaBackgroundOnSubtle: SwiftUI.Color,
        nonSemanticMagentaBackgroundMuted: SwiftUI.Color
    ) {
        self.nonSemanticMagentaContentSecondary = nonSemanticMagentaContentSecondary
        self.nonSemanticMagentaContentPrimary = nonSemanticMagentaContentPrimary
        self.nonSemanticMagentaBorderSubtle = nonSemanticMagentaBorderSubtle
        self.nonSemanticMagentaBorderStrong = nonSemanticMagentaBorderStrong
        self.nonSemanticMagentaBorderDefault = nonSemanticMagentaBorderDefault
        self.nonSemanticMagentaBackgroundSurface = nonSemanticMagentaBackgroundSurface
        self.nonSemanticMagentaBackgroundSubtle = nonSemanticMagentaBackgroundSubtle
        self.nonSemanticMagentaBackgroundStrong = nonSemanticMagentaBackgroundStrong
        self.nonSemanticMagentaBackgroundOnSubtle = nonSemanticMagentaBackgroundOnSubtle
        self.nonSemanticMagentaBackgroundMuted = nonSemanticMagentaBackgroundMuted
    }
}

public struct DSPurple {
    public let nonSemanticPurpleContentSecondary: SwiftUI.Color
    public let nonSemanticPurpleContentPrimary: SwiftUI.Color
    public let nonSemanticPurpleBorderSubtle: SwiftUI.Color
    public let nonSemanticPurpleBorderStrong: SwiftUI.Color
    public let nonSemanticPurpleBorderDefault: SwiftUI.Color
    public let nonSemanticPurpleBackgroundSurface: SwiftUI.Color
    public let nonSemanticPurpleBackgroundSubtle: SwiftUI.Color
    public let nonSemanticPurpleBackgroundStrong: SwiftUI.Color
    public let nonSemanticPurpleBackgroundOnSubtle: SwiftUI.Color
    public let nonSemanticPurpleBackgroundMuted: SwiftUI.Color
    
    

    public init(
        nonSemanticPurpleContentSecondary: SwiftUI.Color,
        nonSemanticPurpleContentPrimary: SwiftUI.Color,
        nonSemanticPurpleBorderSubtle: SwiftUI.Color,
        nonSemanticPurpleBorderStrong: SwiftUI.Color,
        nonSemanticPurpleBorderDefault: SwiftUI.Color,
        nonSemanticPurpleBackgroundSurface: SwiftUI.Color,
        nonSemanticPurpleBackgroundSubtle: SwiftUI.Color,
        nonSemanticPurpleBackgroundStrong: SwiftUI.Color,
        nonSemanticPurpleBackgroundOnSubtle: SwiftUI.Color,
        nonSemanticPurpleBackgroundMuted: SwiftUI.Color
    ) {
        self.nonSemanticPurpleContentSecondary = nonSemanticPurpleContentSecondary
        self.nonSemanticPurpleContentPrimary = nonSemanticPurpleContentPrimary
        self.nonSemanticPurpleBorderSubtle = nonSemanticPurpleBorderSubtle
        self.nonSemanticPurpleBorderStrong = nonSemanticPurpleBorderStrong
        self.nonSemanticPurpleBorderDefault = nonSemanticPurpleBorderDefault
        self.nonSemanticPurpleBackgroundSurface = nonSemanticPurpleBackgroundSurface
        self.nonSemanticPurpleBackgroundSubtle = nonSemanticPurpleBackgroundSubtle
        self.nonSemanticPurpleBackgroundStrong = nonSemanticPurpleBackgroundStrong
        self.nonSemanticPurpleBackgroundOnSubtle = nonSemanticPurpleBackgroundOnSubtle
        self.nonSemanticPurpleBackgroundMuted = nonSemanticPurpleBackgroundMuted
    }
}

public struct DSViolet {
    public let nonSemanticVioletContentSecondary: SwiftUI.Color
    public let nonSemanticVioletContentPrimary: SwiftUI.Color
    public let nonSemanticVioletBorderSubtle: SwiftUI.Color
    public let nonSemanticVioletBorderStrong: SwiftUI.Color
    public let nonSemanticVioletBorderDefault: SwiftUI.Color
    public let nonSemanticVioletBackgroundSurface: SwiftUI.Color
    public let nonSemanticVioletBackgroundSubtle: SwiftUI.Color
    public let nonSemanticVioletBackgroundStrong: SwiftUI.Color
    public let nonSemanticVioletBackgroundOnSubtle: SwiftUI.Color
    public let nonSemanticVioletBackgroundMuted: SwiftUI.Color
    
    

    public init(
        nonSemanticVioletContentSecondary: SwiftUI.Color,
        nonSemanticVioletContentPrimary: SwiftUI.Color,
        nonSemanticVioletBorderSubtle: SwiftUI.Color,
        nonSemanticVioletBorderStrong: SwiftUI.Color,
        nonSemanticVioletBorderDefault: SwiftUI.Color,
        nonSemanticVioletBackgroundSurface: SwiftUI.Color,
        nonSemanticVioletBackgroundSubtle: SwiftUI.Color,
        nonSemanticVioletBackgroundStrong: SwiftUI.Color,
        nonSemanticVioletBackgroundOnSubtle: SwiftUI.Color,
        nonSemanticVioletBackgroundMuted: SwiftUI.Color
    ) {
        self.nonSemanticVioletContentSecondary = nonSemanticVioletContentSecondary
        self.nonSemanticVioletContentPrimary = nonSemanticVioletContentPrimary
        self.nonSemanticVioletBorderSubtle = nonSemanticVioletBorderSubtle
        self.nonSemanticVioletBorderStrong = nonSemanticVioletBorderStrong
        self.nonSemanticVioletBorderDefault = nonSemanticVioletBorderDefault
        self.nonSemanticVioletBackgroundSurface = nonSemanticVioletBackgroundSurface
        self.nonSemanticVioletBackgroundSubtle = nonSemanticVioletBackgroundSubtle
        self.nonSemanticVioletBackgroundStrong = nonSemanticVioletBackgroundStrong
        self.nonSemanticVioletBackgroundOnSubtle = nonSemanticVioletBackgroundOnSubtle
        self.nonSemanticVioletBackgroundMuted = nonSemanticVioletBackgroundMuted
    }
}

public struct DSBlue {
    public let nonSemanticBlueContentSecondary: SwiftUI.Color
    public let nonSemanticBlueContentPrimary: SwiftUI.Color
    public let nonSemanticBlueBorderSubtle: SwiftUI.Color
    public let nonSemanticBlueBorderStrong: SwiftUI.Color
    public let nonSemanticBlueBorderDefault: SwiftUI.Color
    public let nonSemanticBlueBackgroundSurface: SwiftUI.Color
    public let nonSemanticBlueBackgroundSubtle: SwiftUI.Color
    public let nonSemanticBlueBackgroundStrong: SwiftUI.Color
    public let nonSemanticBlueBackgroundOnSubtle: SwiftUI.Color
    public let nonSemanticBlueBackgroundMuted: SwiftUI.Color
    
    

    public init(
        nonSemanticBlueContentSecondary: SwiftUI.Color,
        nonSemanticBlueContentPrimary: SwiftUI.Color,
        nonSemanticBlueBorderSubtle: SwiftUI.Color,
        nonSemanticBlueBorderStrong: SwiftUI.Color,
        nonSemanticBlueBorderDefault: SwiftUI.Color,
        nonSemanticBlueBackgroundSurface: SwiftUI.Color,
        nonSemanticBlueBackgroundSubtle: SwiftUI.Color,
        nonSemanticBlueBackgroundStrong: SwiftUI.Color,
        nonSemanticBlueBackgroundOnSubtle: SwiftUI.Color,
        nonSemanticBlueBackgroundMuted: SwiftUI.Color
    ) {
        self.nonSemanticBlueContentSecondary = nonSemanticBlueContentSecondary
        self.nonSemanticBlueContentPrimary = nonSemanticBlueContentPrimary
        self.nonSemanticBlueBorderSubtle = nonSemanticBlueBorderSubtle
        self.nonSemanticBlueBorderStrong = nonSemanticBlueBorderStrong
        self.nonSemanticBlueBorderDefault = nonSemanticBlueBorderDefault
        self.nonSemanticBlueBackgroundSurface = nonSemanticBlueBackgroundSurface
        self.nonSemanticBlueBackgroundSubtle = nonSemanticBlueBackgroundSubtle
        self.nonSemanticBlueBackgroundStrong = nonSemanticBlueBackgroundStrong
        self.nonSemanticBlueBackgroundOnSubtle = nonSemanticBlueBackgroundOnSubtle
        self.nonSemanticBlueBackgroundMuted = nonSemanticBlueBackgroundMuted
    }
}

public struct DSCyan {
    public let nonSemanticCyanContentSecondary: SwiftUI.Color
    public let nonSemanticCyanContentPrimary: SwiftUI.Color
    public let nonSemanticCyanBorderSubtle: SwiftUI.Color
    public let nonSemanticCyanBorderStrong: SwiftUI.Color
    public let nonSemanticCyanBorderDefault: SwiftUI.Color
    public let nonSemanticCyanBackgroundSurface: SwiftUI.Color
    public let nonSemanticCyanBackgroundSubtle: SwiftUI.Color
    public let nonSemanticCyanBackgroundStrong: SwiftUI.Color
    public let nonSemanticCyanBackgroundOnSubtle: SwiftUI.Color
    public let nonSemanticCyanBackgroundMuted: SwiftUI.Color
    
    

    public init(
        nonSemanticCyanContentSecondary: SwiftUI.Color,
        nonSemanticCyanContentPrimary: SwiftUI.Color,
        nonSemanticCyanBorderSubtle: SwiftUI.Color,
        nonSemanticCyanBorderStrong: SwiftUI.Color,
        nonSemanticCyanBorderDefault: SwiftUI.Color,
        nonSemanticCyanBackgroundSurface: SwiftUI.Color,
        nonSemanticCyanBackgroundSubtle: SwiftUI.Color,
        nonSemanticCyanBackgroundStrong: SwiftUI.Color,
        nonSemanticCyanBackgroundOnSubtle: SwiftUI.Color,
        nonSemanticCyanBackgroundMuted: SwiftUI.Color
    ) {
        self.nonSemanticCyanContentSecondary = nonSemanticCyanContentSecondary
        self.nonSemanticCyanContentPrimary = nonSemanticCyanContentPrimary
        self.nonSemanticCyanBorderSubtle = nonSemanticCyanBorderSubtle
        self.nonSemanticCyanBorderStrong = nonSemanticCyanBorderStrong
        self.nonSemanticCyanBorderDefault = nonSemanticCyanBorderDefault
        self.nonSemanticCyanBackgroundSurface = nonSemanticCyanBackgroundSurface
        self.nonSemanticCyanBackgroundSubtle = nonSemanticCyanBackgroundSubtle
        self.nonSemanticCyanBackgroundStrong = nonSemanticCyanBackgroundStrong
        self.nonSemanticCyanBackgroundOnSubtle = nonSemanticCyanBackgroundOnSubtle
        self.nonSemanticCyanBackgroundMuted = nonSemanticCyanBackgroundMuted
    }
}

public struct DSTeal {
    public let nonSemanticTealContentSecondary: SwiftUI.Color
    public let nonSemanticTealContentPrimary: SwiftUI.Color
    public let nonSemanticTealBorderSubtle: SwiftUI.Color
    public let nonSemanticTealBorderStrong: SwiftUI.Color
    public let nonSemanticTealBorderDefault: SwiftUI.Color
    public let nonSemanticTealBackgroundSurface: SwiftUI.Color
    public let nonSemanticTealBackgroundSubtle: SwiftUI.Color
    public let nonSemanticTealBackgroundStrong: SwiftUI.Color
    public let nonSemanticTealBackgroundOnSubtle: SwiftUI.Color
    public let nonSemanticTealBackgroundMuted: SwiftUI.Color
    
    

    public init(
        nonSemanticTealContentSecondary: SwiftUI.Color,
        nonSemanticTealContentPrimary: SwiftUI.Color,
        nonSemanticTealBorderSubtle: SwiftUI.Color,
        nonSemanticTealBorderStrong: SwiftUI.Color,
        nonSemanticTealBorderDefault: SwiftUI.Color,
        nonSemanticTealBackgroundSurface: SwiftUI.Color,
        nonSemanticTealBackgroundSubtle: SwiftUI.Color,
        nonSemanticTealBackgroundStrong: SwiftUI.Color,
        nonSemanticTealBackgroundOnSubtle: SwiftUI.Color,
        nonSemanticTealBackgroundMuted: SwiftUI.Color
    ) {
        self.nonSemanticTealContentSecondary = nonSemanticTealContentSecondary
        self.nonSemanticTealContentPrimary = nonSemanticTealContentPrimary
        self.nonSemanticTealBorderSubtle = nonSemanticTealBorderSubtle
        self.nonSemanticTealBorderStrong = nonSemanticTealBorderStrong
        self.nonSemanticTealBorderDefault = nonSemanticTealBorderDefault
        self.nonSemanticTealBackgroundSurface = nonSemanticTealBackgroundSurface
        self.nonSemanticTealBackgroundSubtle = nonSemanticTealBackgroundSubtle
        self.nonSemanticTealBackgroundStrong = nonSemanticTealBackgroundStrong
        self.nonSemanticTealBackgroundOnSubtle = nonSemanticTealBackgroundOnSubtle
        self.nonSemanticTealBackgroundMuted = nonSemanticTealBackgroundMuted
    }
}

public struct DSAquamarine {
    public let nonSemanticAquamarineContentSecondary: SwiftUI.Color
    public let nonSemanticAquamarineContentPrimary: SwiftUI.Color
    public let nonSemanticAquamarineBorderSubtle: SwiftUI.Color
    public let nonSemanticAquamarineBorderStrong: SwiftUI.Color
    public let nonSemanticAquamarineBorderDefault: SwiftUI.Color
    public let nonSemanticAquamarineBackgroundSurface: SwiftUI.Color
    public let nonSemanticAquamarineBackgroundSubtle: SwiftUI.Color
    public let nonSemanticAquamarineBackgroundStrong: SwiftUI.Color
    public let nonSemanticAquamarineBackgroundOnSubtle: SwiftUI.Color
    public let nonSemanticAquamarineBackgroundMuted: SwiftUI.Color
    
    

    public init(
        nonSemanticAquamarineContentSecondary: SwiftUI.Color,
        nonSemanticAquamarineContentPrimary: SwiftUI.Color,
        nonSemanticAquamarineBorderSubtle: SwiftUI.Color,
        nonSemanticAquamarineBorderStrong: SwiftUI.Color,
        nonSemanticAquamarineBorderDefault: SwiftUI.Color,
        nonSemanticAquamarineBackgroundSurface: SwiftUI.Color,
        nonSemanticAquamarineBackgroundSubtle: SwiftUI.Color,
        nonSemanticAquamarineBackgroundStrong: SwiftUI.Color,
        nonSemanticAquamarineBackgroundOnSubtle: SwiftUI.Color,
        nonSemanticAquamarineBackgroundMuted: SwiftUI.Color
    ) {
        self.nonSemanticAquamarineContentSecondary = nonSemanticAquamarineContentSecondary
        self.nonSemanticAquamarineContentPrimary = nonSemanticAquamarineContentPrimary
        self.nonSemanticAquamarineBorderSubtle = nonSemanticAquamarineBorderSubtle
        self.nonSemanticAquamarineBorderStrong = nonSemanticAquamarineBorderStrong
        self.nonSemanticAquamarineBorderDefault = nonSemanticAquamarineBorderDefault
        self.nonSemanticAquamarineBackgroundSurface = nonSemanticAquamarineBackgroundSurface
        self.nonSemanticAquamarineBackgroundSubtle = nonSemanticAquamarineBackgroundSubtle
        self.nonSemanticAquamarineBackgroundStrong = nonSemanticAquamarineBackgroundStrong
        self.nonSemanticAquamarineBackgroundOnSubtle = nonSemanticAquamarineBackgroundOnSubtle
        self.nonSemanticAquamarineBackgroundMuted = nonSemanticAquamarineBackgroundMuted
    }
}

public struct DSGreen {
    public let nonSemanticGreenContentSecondary: SwiftUI.Color
    public let nonSemanticGreenContentPrimary: SwiftUI.Color
    public let nonSemanticGreenBorderSubtle: SwiftUI.Color
    public let nonSemanticGreenBorderStrong: SwiftUI.Color
    public let nonSemanticGreenBorderDefault: SwiftUI.Color
    public let nonSemanticGreenBackgroundSurface: SwiftUI.Color
    public let nonSemanticGreenBackgroundSubtle: SwiftUI.Color
    public let nonSemanticGreenBackgroundStrong: SwiftUI.Color
    public let nonSemanticGreenBackgroundOnSubtle: SwiftUI.Color
    public let nonSemanticGreenBackgroundMuted: SwiftUI.Color
    
    

    public init(
        nonSemanticGreenContentSecondary: SwiftUI.Color,
        nonSemanticGreenContentPrimary: SwiftUI.Color,
        nonSemanticGreenBorderSubtle: SwiftUI.Color,
        nonSemanticGreenBorderStrong: SwiftUI.Color,
        nonSemanticGreenBorderDefault: SwiftUI.Color,
        nonSemanticGreenBackgroundSurface: SwiftUI.Color,
        nonSemanticGreenBackgroundSubtle: SwiftUI.Color,
        nonSemanticGreenBackgroundStrong: SwiftUI.Color,
        nonSemanticGreenBackgroundOnSubtle: SwiftUI.Color,
        nonSemanticGreenBackgroundMuted: SwiftUI.Color
    ) {
        self.nonSemanticGreenContentSecondary = nonSemanticGreenContentSecondary
        self.nonSemanticGreenContentPrimary = nonSemanticGreenContentPrimary
        self.nonSemanticGreenBorderSubtle = nonSemanticGreenBorderSubtle
        self.nonSemanticGreenBorderStrong = nonSemanticGreenBorderStrong
        self.nonSemanticGreenBorderDefault = nonSemanticGreenBorderDefault
        self.nonSemanticGreenBackgroundSurface = nonSemanticGreenBackgroundSurface
        self.nonSemanticGreenBackgroundSubtle = nonSemanticGreenBackgroundSubtle
        self.nonSemanticGreenBackgroundStrong = nonSemanticGreenBackgroundStrong
        self.nonSemanticGreenBackgroundOnSubtle = nonSemanticGreenBackgroundOnSubtle
        self.nonSemanticGreenBackgroundMuted = nonSemanticGreenBackgroundMuted
    }
}

public struct DSOrange {
    public let nonSemanticOrangeContentSecondary: SwiftUI.Color
    public let nonSemanticOrangeContentPrimary: SwiftUI.Color
    public let nonSemanticOrangeBorderSubtle: SwiftUI.Color
    public let nonSemanticOrangeBorderStrong: SwiftUI.Color
    public let nonSemanticOrangeBorderDefault: SwiftUI.Color
    public let nonSemanticOrangeBackgroundSurface: SwiftUI.Color
    public let nonSemanticOrangeBackgroundSubtle: SwiftUI.Color
    public let nonSemanticOrangeBackgroundStrong: SwiftUI.Color
    public let nonSemanticOrangeBackgroundOnSubtle: SwiftUI.Color
    public let nonSemanticOrangeBackgroundMuted: SwiftUI.Color
    
    

    public init(
        nonSemanticOrangeContentSecondary: SwiftUI.Color,
        nonSemanticOrangeContentPrimary: SwiftUI.Color,
        nonSemanticOrangeBorderSubtle: SwiftUI.Color,
        nonSemanticOrangeBorderStrong: SwiftUI.Color,
        nonSemanticOrangeBorderDefault: SwiftUI.Color,
        nonSemanticOrangeBackgroundSurface: SwiftUI.Color,
        nonSemanticOrangeBackgroundSubtle: SwiftUI.Color,
        nonSemanticOrangeBackgroundStrong: SwiftUI.Color,
        nonSemanticOrangeBackgroundOnSubtle: SwiftUI.Color,
        nonSemanticOrangeBackgroundMuted: SwiftUI.Color
    ) {
        self.nonSemanticOrangeContentSecondary = nonSemanticOrangeContentSecondary
        self.nonSemanticOrangeContentPrimary = nonSemanticOrangeContentPrimary
        self.nonSemanticOrangeBorderSubtle = nonSemanticOrangeBorderSubtle
        self.nonSemanticOrangeBorderStrong = nonSemanticOrangeBorderStrong
        self.nonSemanticOrangeBorderDefault = nonSemanticOrangeBorderDefault
        self.nonSemanticOrangeBackgroundSurface = nonSemanticOrangeBackgroundSurface
        self.nonSemanticOrangeBackgroundSubtle = nonSemanticOrangeBackgroundSubtle
        self.nonSemanticOrangeBackgroundStrong = nonSemanticOrangeBackgroundStrong
        self.nonSemanticOrangeBackgroundOnSubtle = nonSemanticOrangeBackgroundOnSubtle
        self.nonSemanticOrangeBackgroundMuted = nonSemanticOrangeBackgroundMuted
    }
}

public struct DSNonSemantic {
    public let white: DSWhite
    public let violet: DSViolet
    public let teal: DSTeal
    public let red: DSRed
    public let purple: DSPurple
    public let orange: DSOrange
    public let magenta: DSMagenta
    public let green: DSGreen
    public let gray: DSGray
    public let cyan: DSCyan
    public let blue: DSBlue
    public let aquamarine: DSAquamarine
    
    

    public init(
        white: DSWhite,
        violet: DSViolet,
        teal: DSTeal,
        red: DSRed,
        purple: DSPurple,
        orange: DSOrange,
        magenta: DSMagenta,
        green: DSGreen,
        gray: DSGray,
        cyan: DSCyan,
        blue: DSBlue,
        aquamarine: DSAquamarine
    ) {
        self.white = white
        self.violet = violet
        self.teal = teal
        self.red = red
        self.purple = purple
        self.orange = orange
        self.magenta = magenta
        self.green = green
        self.gray = gray
        self.cyan = cyan
        self.blue = blue
        self.aquamarine = aquamarine
    }
}

public struct DSBrand {
    public let semanticBrandNegative4: SwiftUI.Color
    public let semanticBrandNegative3: SwiftUI.Color
    public let semanticBrandNegative2: SwiftUI.Color
    public let semanticBrandNegative1: SwiftUI.Color
    public let semanticBrand8: SwiftUI.Color
    public let semanticBrand7: SwiftUI.Color
    public let semanticBrand6: SwiftUI.Color
    public let semanticBrand5: SwiftUI.Color
    public let semanticBrand4: SwiftUI.Color
    public let semanticBrand3: SwiftUI.Color
    public let semanticBrand2: SwiftUI.Color
    public let semanticBrand1: SwiftUI.Color
    public let semanticBrand0: SwiftUI.Color
    
    

    public init(
        semanticBrandNegative4: SwiftUI.Color,
        semanticBrandNegative3: SwiftUI.Color,
        semanticBrandNegative2: SwiftUI.Color,
        semanticBrandNegative1: SwiftUI.Color,
        semanticBrand8: SwiftUI.Color,
        semanticBrand7: SwiftUI.Color,
        semanticBrand6: SwiftUI.Color,
        semanticBrand5: SwiftUI.Color,
        semanticBrand4: SwiftUI.Color,
        semanticBrand3: SwiftUI.Color,
        semanticBrand2: SwiftUI.Color,
        semanticBrand1: SwiftUI.Color,
        semanticBrand0: SwiftUI.Color
    ) {
        self.semanticBrandNegative4 = semanticBrandNegative4
        self.semanticBrandNegative3 = semanticBrandNegative3
        self.semanticBrandNegative2 = semanticBrandNegative2
        self.semanticBrandNegative1 = semanticBrandNegative1
        self.semanticBrand8 = semanticBrand8
        self.semanticBrand7 = semanticBrand7
        self.semanticBrand6 = semanticBrand6
        self.semanticBrand5 = semanticBrand5
        self.semanticBrand4 = semanticBrand4
        self.semanticBrand3 = semanticBrand3
        self.semanticBrand2 = semanticBrand2
        self.semanticBrand1 = semanticBrand1
        self.semanticBrand0 = semanticBrand0
    }
}

public struct DSNeutral2 {
    public let semanticNeutralNegative4: SwiftUI.Color
    public let semanticNeutralNegative3: SwiftUI.Color
    public let semanticNeutralNegative2: SwiftUI.Color
    public let semanticNeutralNegative1: SwiftUI.Color
    public let semanticNeutral8: SwiftUI.Color
    public let semanticNeutral7: SwiftUI.Color
    public let semanticNeutral6: SwiftUI.Color
    public let semanticNeutral5: SwiftUI.Color
    public let semanticNeutral4: SwiftUI.Color
    public let semanticNeutral3: SwiftUI.Color
    public let semanticNeutral2: SwiftUI.Color
    public let semanticNeutral1: SwiftUI.Color
    public let semanticNeutral0: SwiftUI.Color
    
    

    public init(
        semanticNeutralNegative4: SwiftUI.Color,
        semanticNeutralNegative3: SwiftUI.Color,
        semanticNeutralNegative2: SwiftUI.Color,
        semanticNeutralNegative1: SwiftUI.Color,
        semanticNeutral8: SwiftUI.Color,
        semanticNeutral7: SwiftUI.Color,
        semanticNeutral6: SwiftUI.Color,
        semanticNeutral5: SwiftUI.Color,
        semanticNeutral4: SwiftUI.Color,
        semanticNeutral3: SwiftUI.Color,
        semanticNeutral2: SwiftUI.Color,
        semanticNeutral1: SwiftUI.Color,
        semanticNeutral0: SwiftUI.Color
    ) {
        self.semanticNeutralNegative4 = semanticNeutralNegative4
        self.semanticNeutralNegative3 = semanticNeutralNegative3
        self.semanticNeutralNegative2 = semanticNeutralNegative2
        self.semanticNeutralNegative1 = semanticNeutralNegative1
        self.semanticNeutral8 = semanticNeutral8
        self.semanticNeutral7 = semanticNeutral7
        self.semanticNeutral6 = semanticNeutral6
        self.semanticNeutral5 = semanticNeutral5
        self.semanticNeutral4 = semanticNeutral4
        self.semanticNeutral3 = semanticNeutral3
        self.semanticNeutral2 = semanticNeutral2
        self.semanticNeutral1 = semanticNeutral1
        self.semanticNeutral0 = semanticNeutral0
    }
}

public struct DSNeutralAlpha {
    public let semanticNeutralANegative4: SwiftUI.Color
    public let semanticNeutralANegative3: SwiftUI.Color
    public let semanticNeutralANegative2: SwiftUI.Color
    public let semanticNeutralANegative1: SwiftUI.Color
    public let semanticNeutralA8: SwiftUI.Color
    public let semanticNeutralA7: SwiftUI.Color
    public let semanticNeutralA6: SwiftUI.Color
    public let semanticNeutralA5: SwiftUI.Color
    public let semanticNeutralA4: SwiftUI.Color
    public let semanticNeutralA3: SwiftUI.Color
    public let semanticNeutralA2: SwiftUI.Color
    public let semanticNeutralA1: SwiftUI.Color
    public let semanticNeutralA0: SwiftUI.Color
    
    

    public init(
        semanticNeutralANegative4: SwiftUI.Color,
        semanticNeutralANegative3: SwiftUI.Color,
        semanticNeutralANegative2: SwiftUI.Color,
        semanticNeutralANegative1: SwiftUI.Color,
        semanticNeutralA8: SwiftUI.Color,
        semanticNeutralA7: SwiftUI.Color,
        semanticNeutralA6: SwiftUI.Color,
        semanticNeutralA5: SwiftUI.Color,
        semanticNeutralA4: SwiftUI.Color,
        semanticNeutralA3: SwiftUI.Color,
        semanticNeutralA2: SwiftUI.Color,
        semanticNeutralA1: SwiftUI.Color,
        semanticNeutralA0: SwiftUI.Color
    ) {
        self.semanticNeutralANegative4 = semanticNeutralANegative4
        self.semanticNeutralANegative3 = semanticNeutralANegative3
        self.semanticNeutralANegative2 = semanticNeutralANegative2
        self.semanticNeutralANegative1 = semanticNeutralANegative1
        self.semanticNeutralA8 = semanticNeutralA8
        self.semanticNeutralA7 = semanticNeutralA7
        self.semanticNeutralA6 = semanticNeutralA6
        self.semanticNeutralA5 = semanticNeutralA5
        self.semanticNeutralA4 = semanticNeutralA4
        self.semanticNeutralA3 = semanticNeutralA3
        self.semanticNeutralA2 = semanticNeutralA2
        self.semanticNeutralA1 = semanticNeutralA1
        self.semanticNeutralA0 = semanticNeutralA0
    }
}

public struct DSInfo {
    public let semanticInfoNegative4: SwiftUI.Color
    public let semanticInfoNegative3: SwiftUI.Color
    public let semanticInfoNegative2: SwiftUI.Color
    public let semanticInfoNegative1: SwiftUI.Color
    public let semanticInfo8: SwiftUI.Color
    public let semanticInfo7: SwiftUI.Color
    public let semanticInfo6: SwiftUI.Color
    public let semanticInfo5: SwiftUI.Color
    public let semanticInfo4: SwiftUI.Color
    public let semanticInfo3: SwiftUI.Color
    public let semanticInfo2: SwiftUI.Color
    public let semanticInfo1: SwiftUI.Color
    public let semanticInfo0: SwiftUI.Color
    
    

    public init(
        semanticInfoNegative4: SwiftUI.Color,
        semanticInfoNegative3: SwiftUI.Color,
        semanticInfoNegative2: SwiftUI.Color,
        semanticInfoNegative1: SwiftUI.Color,
        semanticInfo8: SwiftUI.Color,
        semanticInfo7: SwiftUI.Color,
        semanticInfo6: SwiftUI.Color,
        semanticInfo5: SwiftUI.Color,
        semanticInfo4: SwiftUI.Color,
        semanticInfo3: SwiftUI.Color,
        semanticInfo2: SwiftUI.Color,
        semanticInfo1: SwiftUI.Color,
        semanticInfo0: SwiftUI.Color
    ) {
        self.semanticInfoNegative4 = semanticInfoNegative4
        self.semanticInfoNegative3 = semanticInfoNegative3
        self.semanticInfoNegative2 = semanticInfoNegative2
        self.semanticInfoNegative1 = semanticInfoNegative1
        self.semanticInfo8 = semanticInfo8
        self.semanticInfo7 = semanticInfo7
        self.semanticInfo6 = semanticInfo6
        self.semanticInfo5 = semanticInfo5
        self.semanticInfo4 = semanticInfo4
        self.semanticInfo3 = semanticInfo3
        self.semanticInfo2 = semanticInfo2
        self.semanticInfo1 = semanticInfo1
        self.semanticInfo0 = semanticInfo0
    }
}

public struct DSSuccess1 {
    public let semanticSuccessNegative4: SwiftUI.Color
    public let semanticSuccessNegative3: SwiftUI.Color
    public let semanticSuccessNegative2: SwiftUI.Color
    public let semanticSuccessNegative1: SwiftUI.Color
    public let semanticSuccess8: SwiftUI.Color
    public let semanticSuccess7: SwiftUI.Color
    public let semanticSuccess6: SwiftUI.Color
    public let semanticSuccess5: SwiftUI.Color
    public let semanticSuccess4: SwiftUI.Color
    public let semanticSuccess3: SwiftUI.Color
    public let semanticSuccess2: SwiftUI.Color
    public let semanticSuccess1: SwiftUI.Color
    public let semanticSuccess0: SwiftUI.Color
    
    

    public init(
        semanticSuccessNegative4: SwiftUI.Color,
        semanticSuccessNegative3: SwiftUI.Color,
        semanticSuccessNegative2: SwiftUI.Color,
        semanticSuccessNegative1: SwiftUI.Color,
        semanticSuccess8: SwiftUI.Color,
        semanticSuccess7: SwiftUI.Color,
        semanticSuccess6: SwiftUI.Color,
        semanticSuccess5: SwiftUI.Color,
        semanticSuccess4: SwiftUI.Color,
        semanticSuccess3: SwiftUI.Color,
        semanticSuccess2: SwiftUI.Color,
        semanticSuccess1: SwiftUI.Color,
        semanticSuccess0: SwiftUI.Color
    ) {
        self.semanticSuccessNegative4 = semanticSuccessNegative4
        self.semanticSuccessNegative3 = semanticSuccessNegative3
        self.semanticSuccessNegative2 = semanticSuccessNegative2
        self.semanticSuccessNegative1 = semanticSuccessNegative1
        self.semanticSuccess8 = semanticSuccess8
        self.semanticSuccess7 = semanticSuccess7
        self.semanticSuccess6 = semanticSuccess6
        self.semanticSuccess5 = semanticSuccess5
        self.semanticSuccess4 = semanticSuccess4
        self.semanticSuccess3 = semanticSuccess3
        self.semanticSuccess2 = semanticSuccess2
        self.semanticSuccess1 = semanticSuccess1
        self.semanticSuccess0 = semanticSuccess0
    }
}

public struct DSWarning {
    public let semanticWarningNegative4: SwiftUI.Color
    public let semanticWarningNegative3: SwiftUI.Color
    public let semanticWarningNegative2: SwiftUI.Color
    public let semanticWarningNegative1: SwiftUI.Color
    public let semanticWarning8: SwiftUI.Color
    public let semanticWarning7: SwiftUI.Color
    public let semanticWarning6: SwiftUI.Color
    public let semanticWarning5: SwiftUI.Color
    public let semanticWarning4: SwiftUI.Color
    public let semanticWarning3: SwiftUI.Color
    public let semanticWarning2: SwiftUI.Color
    public let semanticWarning1: SwiftUI.Color
    public let semanticWarning0: SwiftUI.Color
    
    

    public init(
        semanticWarningNegative4: SwiftUI.Color,
        semanticWarningNegative3: SwiftUI.Color,
        semanticWarningNegative2: SwiftUI.Color,
        semanticWarningNegative1: SwiftUI.Color,
        semanticWarning8: SwiftUI.Color,
        semanticWarning7: SwiftUI.Color,
        semanticWarning6: SwiftUI.Color,
        semanticWarning5: SwiftUI.Color,
        semanticWarning4: SwiftUI.Color,
        semanticWarning3: SwiftUI.Color,
        semanticWarning2: SwiftUI.Color,
        semanticWarning1: SwiftUI.Color,
        semanticWarning0: SwiftUI.Color
    ) {
        self.semanticWarningNegative4 = semanticWarningNegative4
        self.semanticWarningNegative3 = semanticWarningNegative3
        self.semanticWarningNegative2 = semanticWarningNegative2
        self.semanticWarningNegative1 = semanticWarningNegative1
        self.semanticWarning8 = semanticWarning8
        self.semanticWarning7 = semanticWarning7
        self.semanticWarning6 = semanticWarning6
        self.semanticWarning5 = semanticWarning5
        self.semanticWarning4 = semanticWarning4
        self.semanticWarning3 = semanticWarning3
        self.semanticWarning2 = semanticWarning2
        self.semanticWarning1 = semanticWarning1
        self.semanticWarning0 = semanticWarning0
    }
}

public struct DSDanger2 {
    public let semanticDangerNegative4: SwiftUI.Color
    public let semanticDangerNegative3: SwiftUI.Color
    public let semanticDangerNegative2: SwiftUI.Color
    public let semanticDangerNegative1: SwiftUI.Color
    public let semanticDanger8: SwiftUI.Color
    public let semanticDanger7: SwiftUI.Color
    public let semanticDanger6: SwiftUI.Color
    public let semanticDanger5: SwiftUI.Color
    public let semanticDanger4: SwiftUI.Color
    public let semanticDanger3: SwiftUI.Color
    public let semanticDanger2: SwiftUI.Color
    public let semanticDanger1: SwiftUI.Color
    public let semanticDanger0: SwiftUI.Color
    
    

    public init(
        semanticDangerNegative4: SwiftUI.Color,
        semanticDangerNegative3: SwiftUI.Color,
        semanticDangerNegative2: SwiftUI.Color,
        semanticDangerNegative1: SwiftUI.Color,
        semanticDanger8: SwiftUI.Color,
        semanticDanger7: SwiftUI.Color,
        semanticDanger6: SwiftUI.Color,
        semanticDanger5: SwiftUI.Color,
        semanticDanger4: SwiftUI.Color,
        semanticDanger3: SwiftUI.Color,
        semanticDanger2: SwiftUI.Color,
        semanticDanger1: SwiftUI.Color,
        semanticDanger0: SwiftUI.Color
    ) {
        self.semanticDangerNegative4 = semanticDangerNegative4
        self.semanticDangerNegative3 = semanticDangerNegative3
        self.semanticDangerNegative2 = semanticDangerNegative2
        self.semanticDangerNegative1 = semanticDangerNegative1
        self.semanticDanger8 = semanticDanger8
        self.semanticDanger7 = semanticDanger7
        self.semanticDanger6 = semanticDanger6
        self.semanticDanger5 = semanticDanger5
        self.semanticDanger4 = semanticDanger4
        self.semanticDanger3 = semanticDanger3
        self.semanticDanger2 = semanticDanger2
        self.semanticDanger1 = semanticDanger1
        self.semanticDanger0 = semanticDanger0
    }
}

public struct DSSemantic {
    public let warning: DSWarning
    public let success: DSSuccess1
    public let neutralAlpha: DSNeutralAlpha
    public let neutral: DSNeutral2
    public let info: DSInfo
    public let danger: DSDanger2
    public let brand: DSBrand
    
    

    public init(
        warning: DSWarning,
        success: DSSuccess1,
        neutralAlpha: DSNeutralAlpha,
        neutral: DSNeutral2,
        info: DSInfo,
        danger: DSDanger2,
        brand: DSBrand
    ) {
        self.warning = warning
        self.success = success
        self.neutralAlpha = neutralAlpha
        self.neutral = neutral
        self.info = info
        self.danger = danger
        self.brand = brand
    }
}

public struct DSColor {
    public let semantic: DSSemantic
    public let nonSemantic: DSNonSemantic
    public let interaction: DSInteraction
    public let content: DSContent
    public let border: DSBorder
    public let background: DSBackground
    public let action: DSAction
    
    

    public init(
        semantic: DSSemantic,
        nonSemantic: DSNonSemantic,
        interaction: DSInteraction,
        content: DSContent,
        border: DSBorder,
        background: DSBackground,
        action: DSAction
    ) {
        self.semantic = semantic
        self.nonSemantic = nonSemantic
        self.interaction = interaction
        self.content = content
        self.border = border
        self.background = background
        self.action = action
    }
}

public struct DSBorderWidth {
    public let xLarge: CGFloat
    public let small: CGFloat
    public let none: CGFloat
    public let medium: CGFloat
    public let large: CGFloat
    public let focus: CGFloat
    
    

    public init(
        xLarge: CGFloat,
        small: CGFloat,
        none: CGFloat,
        medium: CGFloat,
        large: CGFloat,
        focus: CGFloat
    ) {
        self.xLarge = xLarge
        self.small = small
        self.none = none
        self.medium = medium
        self.large = large
        self.focus = focus
    }
}

public struct DSBorderRadius {
    public let xLarge: CGFloat
    public let small: CGFloat
    public let none: CGFloat
    public let medium: CGFloat
    public let large: CGFloat
    public let full: CGFloat
    public let borderRadius4xLarge: CGFloat
    public let borderRadius3xLarge: CGFloat
    public let borderRadius2xLarge: CGFloat
    
    

    public init(
        xLarge: CGFloat,
        small: CGFloat,
        none: CGFloat,
        medium: CGFloat,
        large: CGFloat,
        full: CGFloat,
        borderRadius4xLarge: CGFloat,
        borderRadius3xLarge: CGFloat,
        borderRadius2xLarge: CGFloat
    ) {
        self.xLarge = xLarge
        self.small = small
        self.none = none
        self.medium = medium
        self.large = large
        self.full = full
        self.borderRadius4xLarge = borderRadius4xLarge
        self.borderRadius3xLarge = borderRadius3xLarge
        self.borderRadius2xLarge = borderRadius2xLarge
    }
}

public struct DSSize {
    public let xSmall: CGFloat
    public let xLarge: CGFloat
    public let small: CGFloat
    public let size3xSmall: CGFloat
    public let size3xLarge: CGFloat
    public let size2xSmall: CGFloat
    public let size2xLarge: CGFloat
    public let medium: CGFloat
    public let large: CGFloat
    
    

    public init(
        xSmall: CGFloat,
        xLarge: CGFloat,
        small: CGFloat,
        size3xSmall: CGFloat,
        size3xLarge: CGFloat,
        size2xSmall: CGFloat,
        size2xLarge: CGFloat,
        medium: CGFloat,
        large: CGFloat
    ) {
        self.xSmall = xSmall
        self.xLarge = xLarge
        self.small = small
        self.size3xSmall = size3xSmall
        self.size3xLarge = size3xLarge
        self.size2xSmall = size2xSmall
        self.size2xLarge = size2xLarge
        self.medium = medium
        self.large = large
    }
}

public struct DSPadding {
    public let xSmall: CGFloat
    public let small: CGFloat
    public let padding6xLarge: CGFloat
    public let padding5xLarge: CGFloat
    public let padding4xLarge: CGFloat
    public let padding3xLarge: CGFloat
    public let padding2xSmall: CGFloat
    public let padding2xLarge: CGFloat
    public let none: CGFloat
    public let medium: CGFloat
    public let large: CGFloat
    
    

    public init(
        xSmall: CGFloat,
        small: CGFloat,
        padding6xLarge: CGFloat,
        padding5xLarge: CGFloat,
        padding4xLarge: CGFloat,
        padding3xLarge: CGFloat,
        padding2xSmall: CGFloat,
        padding2xLarge: CGFloat,
        none: CGFloat,
        medium: CGFloat,
        large: CGFloat
    ) {
        self.xSmall = xSmall
        self.small = small
        self.padding6xLarge = padding6xLarge
        self.padding5xLarge = padding5xLarge
        self.padding4xLarge = padding4xLarge
        self.padding3xLarge = padding3xLarge
        self.padding2xSmall = padding2xSmall
        self.padding2xLarge = padding2xLarge
        self.none = none
        self.medium = medium
        self.large = large
    }
}

public struct DSGap {
    public let xSmall: CGFloat
    public let xLarge: CGFloat
    public let small: CGFloat
    public let none: CGFloat
    public let medium: CGFloat
    public let large: CGFloat
    public let gap3xLarge: CGFloat
    public let gap2xSmall: CGFloat
    public let gap2xLarge: CGFloat
    
    

    public init(
        xSmall: CGFloat,
        xLarge: CGFloat,
        small: CGFloat,
        none: CGFloat,
        medium: CGFloat,
        large: CGFloat,
        gap3xLarge: CGFloat,
        gap2xSmall: CGFloat,
        gap2xLarge: CGFloat
    ) {
        self.xSmall = xSmall
        self.xLarge = xLarge
        self.small = small
        self.none = none
        self.medium = medium
        self.large = large
        self.gap3xLarge = gap3xLarge
        self.gap2xSmall = gap2xSmall
        self.gap2xLarge = gap2xLarge
    }
}

public struct DSSpace {
    public let padding: DSPadding
    public let gap: DSGap
    
    

    public init(
        padding: DSPadding,
        gap: DSGap
    ) {
        self.padding = padding
        self.gap = gap
    }
}

public struct DSOpacity {
    public let disabled: CGFloat
    
    

    public init(
        disabled: CGFloat
    ) {
        self.disabled = disabled
    }
}

public struct Typography {
    public let lineHeight: CGFloat
    public let letterSpacing: CGFloat
    public let fontWeight: CGFloat
    public let fontSize: CGFloat
    public let fontFamily: String
    
    

    public init(
        lineHeight: CGFloat,
        letterSpacing: CGFloat,
        fontWeight: CGFloat,
        fontSize: CGFloat,
        fontFamily: String
    ) {
        self.lineHeight = lineHeight
        self.letterSpacing = letterSpacing
        self.fontWeight = fontWeight
        self.fontSize = fontSize
        self.fontFamily = fontFamily
    }
}

public struct DSCode {
    public let typographyCodeSmall: Typography
    public let typographyCodeMedium: Typography
    public let typographyCodeLarge: Typography
    
    

    public init(
        typographyCodeSmall: Typography,
        typographyCodeMedium: Typography,
        typographyCodeLarge: Typography
    ) {
        self.typographyCodeSmall = typographyCodeSmall
        self.typographyCodeMedium = typographyCodeMedium
        self.typographyCodeLarge = typographyCodeLarge
    }
}

public struct DSUtility {
    public let typographyUtilitySmall: Typography
    public let typographyUtilityMedium: Typography
    public let typographyUtilityLarge: Typography
    
    

    public init(
        typographyUtilitySmall: Typography,
        typographyUtilityMedium: Typography,
        typographyUtilityLarge: Typography
    ) {
        self.typographyUtilitySmall = typographyUtilitySmall
        self.typographyUtilityMedium = typographyUtilityMedium
        self.typographyUtilityLarge = typographyUtilityLarge
    }
}

public struct DSBody {
    public let typographyBodySmall: Typography
    public let typographyBodyMedium: Typography
    public let typographyBodyLarge: Typography
    
    

    public init(
        typographyBodySmall: Typography,
        typographyBodyMedium: Typography,
        typographyBodyLarge: Typography
    ) {
        self.typographyBodySmall = typographyBodySmall
        self.typographyBodyMedium = typographyBodyMedium
        self.typographyBodyLarge = typographyBodyLarge
    }
}

public struct DSHeading {
    public let typographyHeadingXLarge: Typography
    public let typographyHeadingSmall: Typography
    public let typographyHeadingMedium: Typography
    public let typographyHeadingLarge: Typography
    public let typographyHeading9xLarge: Typography
    public let typographyHeading8xLarge: Typography
    public let typographyHeading7xLarge: Typography
    public let typographyHeading6xLarge: Typography
    public let typographyHeading5xLarge: Typography
    public let typographyHeading4xLarge: Typography
    public let typographyHeading3xLarge: Typography
    public let typographyHeading2xLarge: Typography
    
    

    public init(
        typographyHeadingXLarge: Typography,
        typographyHeadingSmall: Typography,
        typographyHeadingMedium: Typography,
        typographyHeadingLarge: Typography,
        typographyHeading9xLarge: Typography,
        typographyHeading8xLarge: Typography,
        typographyHeading7xLarge: Typography,
        typographyHeading6xLarge: Typography,
        typographyHeading5xLarge: Typography,
        typographyHeading4xLarge: Typography,
        typographyHeading3xLarge: Typography,
        typographyHeading2xLarge: Typography
    ) {
        self.typographyHeadingXLarge = typographyHeadingXLarge
        self.typographyHeadingSmall = typographyHeadingSmall
        self.typographyHeadingMedium = typographyHeadingMedium
        self.typographyHeadingLarge = typographyHeadingLarge
        self.typographyHeading9xLarge = typographyHeading9xLarge
        self.typographyHeading8xLarge = typographyHeading8xLarge
        self.typographyHeading7xLarge = typographyHeading7xLarge
        self.typographyHeading6xLarge = typographyHeading6xLarge
        self.typographyHeading5xLarge = typographyHeading5xLarge
        self.typographyHeading4xLarge = typographyHeading4xLarge
        self.typographyHeading3xLarge = typographyHeading3xLarge
        self.typographyHeading2xLarge = typographyHeading2xLarge
    }
}

public struct DSDisplay {
    public let typographyDisplayXLarge: Typography
    public let typographyDisplaySmall: Typography
    public let typographyDisplayMedium: Typography
    public let typographyDisplayLarge: Typography
    public let typographyDisplay3xLarge: Typography
    public let typographyDisplay2xLarge: Typography
    
    

    public init(
        typographyDisplayXLarge: Typography,
        typographyDisplaySmall: Typography,
        typographyDisplayMedium: Typography,
        typographyDisplayLarge: Typography,
        typographyDisplay3xLarge: Typography,
        typographyDisplay2xLarge: Typography
    ) {
        self.typographyDisplayXLarge = typographyDisplayXLarge
        self.typographyDisplaySmall = typographyDisplaySmall
        self.typographyDisplayMedium = typographyDisplayMedium
        self.typographyDisplayLarge = typographyDisplayLarge
        self.typographyDisplay3xLarge = typographyDisplay3xLarge
        self.typographyDisplay2xLarge = typographyDisplay2xLarge
    }
}

public struct DSTypography {
    public let utility: DSUtility
    public let heading: DSHeading
    public let display: DSDisplay
    public let code: DSCode
    public let body: DSBody
    
    

    public init(
        utility: DSUtility,
        heading: DSHeading,
        display: DSDisplay,
        code: DSCode,
        body: DSBody
    ) {
        self.utility = utility
        self.heading = heading
        self.display = display
        self.code = code
        self.body = body
    }
}