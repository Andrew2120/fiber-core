// To parse the JSON, install Klaxon and do:
//
//   val tokens = Tokens.fromJson(jsonString)

package quicktype

import com.beust.klaxon.*

private fun <T> Klaxon.convert(k: kotlin.reflect.KClass<*>, fromJson: (JsonValue) -> T, toJson: (T) -> String, isUnion: Boolean = false) =
    this.converter(object: Converter {
        @Suppress("UNCHECKED_CAST")
        override fun toJson(value: Any)        = toJson(value as T)
        override fun fromJson(jv: JsonValue)   = fromJson(jv) as Any
        override fun canConvert(cls: Class<*>) = cls == k.java || (isUnion && cls.superclass == k.java)
    })

private val klaxon = Klaxon()
    .convert(BorderRadius2XlType::class,  { BorderRadius2XlType.fromValue(it.string!!) },  { "\"${it.value}\"" })
    .convert(TypographyBodyLgType::class, { TypographyBodyLgType.fromValue(it.string!!) }, { "\"${it.value}\"" })
    .convert(FontFamilyEnum::class,       { FontFamilyEnum.fromValue(it.string!!) },       { "\"${it.value}\"" })
    .convert(FontWeightEnum::class,       { FontWeightEnum.fromValue(it.string!!) },       { "\"${it.value}\"" })
    .convert(The0_Type::class,            { The0_Type.fromValue(it.string!!) },            { "\"${it.value}\"" })
    .convert(ValueType::class,            { ValueType.fromValue(it.string!!) },            { "\"${it.value}\"" })

data class Tokens (
    val global: Global,
    val alias: Alias,

    @Json(name = "component/light")
    val componentLight: Component,

    @Json(name = "component/dark")
    val componentDark: Component,

    val tokenSetOrder: TokenSetOrder
) {
    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<Tokens>(json)
    }
}

data class Alias (
    val color: AliasColor,
    val borderRadius: AliasBorderRadius,
    val borderWidth: AliasBorderWidth,
    val size: Map<String, BorderRadius2_Xl>,
    val space: Space,
    val opacity: AliasOpacity,
    val typography: Typography
)

data class AliasBorderRadius (
    @Json(name = "border-radius-none")
    val borderRadiusNone: BorderRadius2_Xl,

    @Json(name = "border-radius-sm")
    val borderRadiusSm: BorderRadius2_Xl,

    @Json(name = "border-radius-md")
    val borderRadiusMd: BorderRadius2_Xl,

    @Json(name = "border-radius-lg")
    val borderRadiusLg: BorderRadius2_Xl,

    @Json(name = "border-radius-xl")
    val borderRadiusXl: BorderRadius2_Xl,

    @Json(name = "border-radius-2xl")
    val borderRadius2Xl: BorderRadius2_Xl,

    @Json(name = "border-radius-3xl")
    val borderRadius3Xl: BorderRadius2_Xl,

    @Json(name = "border-radius-4xl")
    val borderRadius4Xl: BorderRadius2_Xl,

    @Json(name = "border-radius-full")
    val borderRadiusFull: BorderRadius2_Xl
)

data class BorderRadius2_Xl (
    val value: String,
    val type: BorderRadius2XlType,
    val failedToResolve: Boolean
)

enum class BorderRadius2XlType(val value: String) {
    BorderRadius("borderRadius"),
    BorderWidth("borderWidth"),
    Color("color"),
    Opacity("opacity"),
    Sizing("sizing"),
    Spacing("spacing");

    companion object {
        public fun fromValue(value: String): BorderRadius2XlType = when (value) {
            "borderRadius" -> BorderRadius
            "borderWidth"  -> BorderWidth
            "color"        -> Color
            "opacity"      -> Opacity
            "sizing"       -> Sizing
            "spacing"      -> Spacing
            else           -> throw IllegalArgumentException()
        }
    }
}

data class AliasBorderWidth (
    @Json(name = "border-width-none")
    val borderWidthNone: BorderRadius2_Xl,

    @Json(name = "border-width-sm")
    val borderWidthSm: BorderRadius2_Xl,

    @Json(name = "border-width-md")
    val borderWidthMd: BorderRadius2_Xl,

    @Json(name = "border-width-lg")
    val borderWidthLg: BorderRadius2_Xl,

    @Json(name = "border-width-xl")
    val borderWidthXl: BorderRadius2_Xl
)

data class AliasColor (
    val semantic: Semantic
)

data class Semantic (
    val brand: Map<String, BorderRadius2_Xl>,
    val neutral: Map<String, BorderRadius2_Xl>,
    val neutralAlpha: Map<String, BorderRadius2_Xl>,
    val info: Map<String, BorderRadius2_Xl>,
    val success: Map<String, BorderRadius2_Xl>,
    val warning: Map<String, BorderRadius2_Xl>,
    val danger: Map<String, BorderRadius2_Xl>
)

data class AliasOpacity (
    @Json(name = "opacity-disabled")
    val opacityDisabled: BorderRadius2_Xl
)

data class Space (
    val padding: Map<String, BorderRadius2_Xl>,
    val gap: Map<String, BorderRadius2_Xl>
)

data class Typography (
    val code: Code,
    val utility: Utility,
    val body: Body,
    val heading: Map<String, TypographyBodyLg>,
    val display: Display
)

data class Body (
    @Json(name = "typography-body-sm")
    val typographyBodySm: TypographyBodyLg,

    @Json(name = "typography-body-md")
    val typographyBodyMd: TypographyBodyLg,

    @Json(name = "typography-body-lg")
    val typographyBodyLg: TypographyBodyLg
)

data class TypographyBodyLg (
    val value: TypographyBodyLgValue,
    val type: TypographyBodyLgType,
    val failedToResolve: Boolean
)

enum class TypographyBodyLgType(val value: String) {
    Typography("typography");

    companion object {
        public fun fromValue(value: String): TypographyBodyLgType = when (value) {
            "typography" -> Typography
            else         -> throw IllegalArgumentException()
        }
    }
}

data class TypographyBodyLgValue (
    val fontFamily: FontFamilyEnum,
    val fontWeight: FontWeightEnum,
    val lineHeight: String,
    val fontSize: String,
    val letterSpacing: String
)

enum class FontFamilyEnum(val value: String) {
    FontFamilyFontFamilyMono("{fontFamily.font-family-mono}"),
    FontFamilyFontFamilySans("{fontFamily.font-family-sans}");

    companion object {
        public fun fromValue(value: String): FontFamilyEnum = when (value) {
            "{fontFamily.font-family-mono}" -> FontFamilyFontFamilyMono
            "{fontFamily.font-family-sans}" -> FontFamilyFontFamilySans
            else                            -> throw IllegalArgumentException()
        }
    }
}

enum class FontWeightEnum(val value: String) {
    FontWeightFontWeight400("{fontWeight.font-weight-400}"),
    FontWeightFontWeight500("{fontWeight.font-weight-500}"),
    FontWeightFontWeight700("{fontWeight.font-weight-700}");

    companion object {
        public fun fromValue(value: String): FontWeightEnum = when (value) {
            "{fontWeight.font-weight-400}" -> FontWeightFontWeight400
            "{fontWeight.font-weight-500}" -> FontWeightFontWeight500
            "{fontWeight.font-weight-700}" -> FontWeightFontWeight700
            else                           -> throw IllegalArgumentException()
        }
    }
}

data class Code (
    @Json(name = "typography-code-sm")
    val typographyCodeSm: TypographyBodyLg,

    @Json(name = "typography-code-md")
    val typographyCodeMd: TypographyBodyLg,

    @Json(name = "typography-code-lg")
    val typographyCodeLg: TypographyBodyLg
)

data class Display (
    @Json(name = "typography-display-sm")
    val typographyDisplaySm: TypographyBodyLg,

    @Json(name = "typography-display-md")
    val typographyDisplayMd: TypographyBodyLg,

    @Json(name = "typography-display-lg")
    val typographyDisplayLg: TypographyBodyLg,

    @Json(name = "typography-display-xl")
    val typographyDisplayXl: TypographyBodyLg,

    @Json(name = "typography-display-2xl")
    val typographyDisplay2Xl: TypographyBodyLg,

    @Json(name = "typography-display-3xl")
    val typographyDisplay3Xl: TypographyBodyLg
)

data class Utility (
    @Json(name = "typography-utility-sm")
    val typographyUtilitySm: TypographyBodyLg,

    @Json(name = "typography-utility-md")
    val typographyUtilityMd: TypographyBodyLg,

    @Json(name = "typography-utility-lg")
    val typographyUtilityLg: TypographyBodyLg
)

data class Component (
    val color: ComponentDarkColor,
    val borderWidth: ComponentDarkBorderWidth
)

data class ComponentDarkBorderWidth (
    @Json(name = "border-width-focus")
    val borderWidthFocus: BorderRadius2_Xl
)

data class ComponentDarkColor (
    val content: Map<String, BorderRadius2_Xl>,
    val border: Map<String, BorderRadius2_Xl>,
    val background: Map<String, BorderRadius2_Xl>,
    val action: Action,
    val interaction: Interaction,
    val nonSemantic: NonSemantic
)

data class Action (
    val primary: Primary,
    val neutral: ActionNeutral,
    val success: Success,
    val danger: ActionDanger,
    val ghost: ActionGhost,
    val outline: Outline,
    val inverse: ActionInverse,
    val reverseInverse: ReverseInverse
)

data class ActionDanger (
    @Json(name = "action-danger-normal")
    val actionDangerNormal: BorderRadius2_Xl,

    @Json(name = "action-danger-hover")
    val actionDangerHover: BorderRadius2_Xl,

    @Json(name = "action-danger-active")
    val actionDangerActive: BorderRadius2_Xl,

    @Json(name = "action-danger-selected")
    val actionDangerSelected: BorderRadius2_Xl,

    @Json(name = "action-danger-subtle-normal")
    val actionDangerSubtleNormal: BorderRadius2_Xl,

    @Json(name = "action-danger-subtle-hover")
    val actionDangerSubtleHover: BorderRadius2_Xl,

    @Json(name = "action-danger-subtle-active")
    val actionDangerSubtleActive: BorderRadius2_Xl,

    @Json(name = "action-danger-subtle-selected")
    val actionDangerSubtleSelected: BorderRadius2_Xl
)

data class ActionGhost (
    @Json(name = "action-ghost-normal")
    val actionGhostNormal: BorderRadius2_Xl,

    @Json(name = "action-ghost-hover")
    val actionGhostHover: BorderRadius2_Xl,

    @Json(name = "action-ghost-active")
    val actionGhostActive: BorderRadius2_Xl,

    @Json(name = "action-ghost-selected")
    val actionGhostSelected: BorderRadius2_Xl,

    @Json(name = "action-ghost-inverse-hover")
    val actionGhostInverseHover: BorderRadius2_Xl,

    @Json(name = "action-ghost-inverse-active")
    val actionGhostInverseActive: BorderRadius2_Xl,

    @Json(name = "action-ghost-inverse-selected")
    val actionGhostInverseSelected: BorderRadius2_Xl,

    @Json(name = "action-ghost-danger-hover")
    val actionGhostDangerHover: BorderRadius2_Xl,

    @Json(name = "action-ghost-danger-active")
    val actionGhostDangerActive: BorderRadius2_Xl,

    @Json(name = "action-ghost-danger-selected")
    val actionGhostDangerSelected: BorderRadius2_Xl
)

data class ActionInverse (
    @Json(name = "action-inverse-normal")
    val actionInverseNormal: BorderRadius2_Xl,

    @Json(name = "action-inverse-hover")
    val actionInverseHover: BorderRadius2_Xl,

    @Json(name = "action-inverse-active")
    val actionInverseActive: BorderRadius2_Xl,

    @Json(name = "action-inverse-selected")
    val actionInverseSelected: BorderRadius2_Xl
)

data class ActionNeutral (
    @Json(name = "action-neutral-normal")
    val actionNeutralNormal: BorderRadius2_Xl,

    @Json(name = "action-neutral-hover")
    val actionNeutralHover: BorderRadius2_Xl,

    @Json(name = "action-neutral-active")
    val actionNeutralActive: BorderRadius2_Xl,

    @Json(name = "action-neutral-selected")
    val actionNeutralSelected: BorderRadius2_Xl,

    @Json(name = "action-neutral-subtle-normal")
    val actionNeutralSubtleNormal: BorderRadius2_Xl,

    @Json(name = "action-neutral-subtle-hover")
    val actionNeutralSubtleHover: BorderRadius2_Xl,

    @Json(name = "action-neutral-subtle-active")
    val actionNeutralSubtleActive: BorderRadius2_Xl,

    @Json(name = "action-neutral-subtle-selected")
    val actionNeutralSubtleSelected: BorderRadius2_Xl
)

data class Outline (
    @Json(name = "action-outline-normal")
    val actionOutlineNormal: BorderRadius2_Xl,

    @Json(name = "action-outline-hover")
    val actionOutlineHover: BorderRadius2_Xl,

    @Json(name = "action-outline-active")
    val actionOutlineActive: BorderRadius2_Xl,

    @Json(name = "action-outline-selected")
    val actionOutlineSelected: BorderRadius2_Xl
)

data class Primary (
    @Json(name = "action-primary-normal")
    val actionPrimaryNormal: BorderRadius2_Xl,

    @Json(name = "action-primary-hover")
    val actionPrimaryHover: BorderRadius2_Xl,

    @Json(name = "action-primary-active")
    val actionPrimaryActive: BorderRadius2_Xl,

    @Json(name = "action-primary-selected")
    val actionPrimarySelected: BorderRadius2_Xl,

    @Json(name = "action-primary-subtle-normal")
    val actionPrimarySubtleNormal: BorderRadius2_Xl,

    @Json(name = "action-primary-subtle-hover")
    val actionPrimarySubtleHover: BorderRadius2_Xl,

    @Json(name = "action-primary-subtle-active")
    val actionPrimarySubtleActive: BorderRadius2_Xl,

    @Json(name = "action-primary-subtle-selected")
    val actionPrimarySubtleSelected: BorderRadius2_Xl
)

data class ReverseInverse (
    @Json(name = "action-reverseInverse-normal")
    val actionReverseInverseNormal: BorderRadius2_Xl,

    @Json(name = "action-reverseInverse-hover")
    val actionReverseInverseHover: BorderRadius2_Xl,

    @Json(name = "action-reverseInverse-active")
    val actionReverseInverseActive: BorderRadius2_Xl,

    @Json(name = "action-reverseInverse-selected")
    val actionReverseInverseSelected: BorderRadius2_Xl
)

data class Success (
    @Json(name = "action-success-normal")
    val actionSuccessNormal: BorderRadius2_Xl,

    @Json(name = "action-success-hover")
    val actionSuccessHover: BorderRadius2_Xl,

    @Json(name = "action-success-active")
    val actionSuccessActive: BorderRadius2_Xl,

    @Json(name = "action-success-selected")
    val actionSuccessSelected: BorderRadius2_Xl,

    @Json(name = "action-success-subtle-normal")
    val actionSuccessSubtleNormal: BorderRadius2_Xl,

    @Json(name = "action-success-subtle-hover")
    val actionSuccessSubtleHover: BorderRadius2_Xl,

    @Json(name = "action-success-subtle-active")
    val actionSuccessSubtleActive: BorderRadius2_Xl,

    @Json(name = "action-success-subtle-selected")
    val actionSuccessSubtleSelected: BorderRadius2_Xl
)

data class Interaction (
    val default: Default,
    val neutral: InteractionNeutral,
    val danger: InteractionDanger,
    val ghost: InteractionGhost,
    val disabled: Disabled,
    val border: Border,
    val background: Background,
    val inverse: InteractionInverse,
    val focus: Focus
)

data class Background (
    @Json(name = "interaction-background-modal")
    val interactionBackgroundModal: BorderRadius2_Xl,

    @Json(name = "interaction-background-modeless")
    val interactionBackgroundModeless: BorderRadius2_Xl,

    @Json(name = "interaction-background-modeless-inverse")
    val interactionBackgroundModelessInverse: BorderRadius2_Xl,

    @Json(name = "interaction-background-sidepanel")
    val interactionBackgroundSidepanel: BorderRadius2_Xl,

    @Json(name = "interaction-background-formField")
    val interactionBackgroundFormField: BorderRadius2_Xl,

    @Json(name = "interaction-background-dimmer")
    val interactionBackgroundDimmer: BorderRadius2_Xl
)

data class Border (
    @Json(name = "interaction-border-normal")
    val interactionBorderNormal: BorderRadius2_Xl,

    @Json(name = "interaction-border-hover")
    val interactionBorderHover: BorderRadius2_Xl,

    @Json(name = "interaction-border-active")
    val interactionBorderActive: BorderRadius2_Xl,

    @Json(name = "interaction-border-selected")
    val interactionBorderSelected: BorderRadius2_Xl,

    @Json(name = "interaction-border-neutral-normal")
    val interactionBorderNeutralNormal: BorderRadius2_Xl,

    @Json(name = "interaction-border-neutral-hover")
    val interactionBorderNeutralHover: BorderRadius2_Xl,

    @Json(name = "interaction-border-neutral-active")
    val interactionBorderNeutralActive: BorderRadius2_Xl,

    @Json(name = "interaction-border-neutral-selected")
    val interactionBorderNeutralSelected: BorderRadius2_Xl,

    @Json(name = "interaction-border-danger")
    val interactionBorderDanger: BorderRadius2_Xl
)

data class InteractionDanger (
    @Json(name = "interaction-danger-normal")
    val interactionDangerNormal: BorderRadius2_Xl,

    @Json(name = "interaction-danger-hover")
    val interactionDangerHover: BorderRadius2_Xl,

    @Json(name = "interaction-danger-active")
    val interactionDangerActive: BorderRadius2_Xl,

    @Json(name = "interaction-danger-selected")
    val interactionDangerSelected: BorderRadius2_Xl,

    @Json(name = "interaction-danger-subtle-normal")
    val interactionDangerSubtleNormal: BorderRadius2_Xl,

    @Json(name = "interaction-danger-subtle-hover")
    val interactionDangerSubtleHover: BorderRadius2_Xl,

    @Json(name = "interaction-danger-subtle-active")
    val interactionDangerSubtleActive: BorderRadius2_Xl,

    @Json(name = "interaction-danger-subtle-selected")
    val interactionDangerSubtleSelected: BorderRadius2_Xl
)

data class Default (
    @Json(name = "interaction-default-normal")
    val interactionDefaultNormal: BorderRadius2_Xl,

    @Json(name = "interaction-default-hover")
    val interactionDefaultHover: BorderRadius2_Xl,

    @Json(name = "interaction-default-active")
    val interactionDefaultActive: BorderRadius2_Xl,

    @Json(name = "interaction-default-selected")
    val interactionDefaultSelected: BorderRadius2_Xl,

    @Json(name = "interaction-default-subtle-normal")
    val interactionDefaultSubtleNormal: BorderRadius2_Xl,

    @Json(name = "interaction-default-subtle-hover")
    val interactionDefaultSubtleHover: BorderRadius2_Xl,

    @Json(name = "interaction-default-subtle-active")
    val interactionDefaultSubtleActive: BorderRadius2_Xl,

    @Json(name = "interaction-default-subtle-selected")
    val interactionDefaultSubtleSelected: BorderRadius2_Xl
)

data class Disabled (
    @Json(name = "interaction-disabled-normal")
    val interactionDisabledNormal: BorderRadius2_Xl,

    @Json(name = "interaction-disabled-hover")
    val interactionDisabledHover: BorderRadius2_Xl,

    @Json(name = "interaction-disabled-active")
    val interactionDisabledActive: BorderRadius2_Xl,

    @Json(name = "interaction-disabled-subtle-normal")
    val interactionDisabledSubtleNormal: BorderRadius2_Xl,

    @Json(name = "interaction-disabled-subtle-hover")
    val interactionDisabledSubtleHover: BorderRadius2_Xl,

    @Json(name = "interaction-disabled-subtle-active")
    val interactionDisabledSubtleActive: BorderRadius2_Xl
)

data class Focus (
    @Json(name = "interaction-focus-default")
    val interactionFocusDefault: BorderRadius2_Xl
)

data class InteractionGhost (
    @Json(name = "interaction-ghost-normal")
    val interactionGhostNormal: BorderRadius2_Xl,

    @Json(name = "interaction-ghost-hover")
    val interactionGhostHover: BorderRadius2_Xl,

    @Json(name = "interaction-ghost-active")
    val interactionGhostActive: BorderRadius2_Xl,

    @Json(name = "interaction-ghost-selected")
    val interactionGhostSelected: BorderRadius2_Xl,

    @Json(name = "interaction-ghost-inverse-hover")
    val interactionGhostInverseHover: BorderRadius2_Xl,

    @Json(name = "interaction-ghost-inverse-normal")
    val interactionGhostInverseNormal: BorderRadius2_Xl,

    @Json(name = "interaction-ghost-inverse-selected")
    val interactionGhostInverseSelected: BorderRadius2_Xl,

    @Json(name = "interaction-ghost-danger-hover")
    val interactionGhostDangerHover: BorderRadius2_Xl,

    @Json(name = "interaction-ghost-danger-normal")
    val interactionGhostDangerNormal: BorderRadius2_Xl,

    @Json(name = "interaction-ghost-danger-selected")
    val interactionGhostDangerSelected: BorderRadius2_Xl
)

data class InteractionInverse (
    @Json(name = "interaction-inverse-normal")
    val interactionInverseNormal: BorderRadius2_Xl,

    @Json(name = "interaction-inverse-hover")
    val interactionInverseHover: BorderRadius2_Xl,

    @Json(name = "interaction-inverse-active")
    val interactionInverseActive: BorderRadius2_Xl,

    @Json(name = "interaction-inverse-selected")
    val interactionInverseSelected: BorderRadius2_Xl
)

data class InteractionNeutral (
    @Json(name = "interaction-neutral-normal")
    val interactionNeutralNormal: BorderRadius2_Xl,

    @Json(name = "interaction-neutral-hover")
    val interactionNeutralHover: BorderRadius2_Xl,

    @Json(name = "interaction-neutral-active")
    val interactionNeutralActive: BorderRadius2_Xl,

    @Json(name = "interaction-neutral-selected")
    val interactionNeutralSelected: BorderRadius2_Xl,

    @Json(name = "interaction-neutral-subtle-normal")
    val interactionNeutralSubtleNormal: BorderRadius2_Xl,

    @Json(name = "interaction-neutral-subtle-hover")
    val interactionNeutralSubtleHover: BorderRadius2_Xl,

    @Json(name = "interaction-neutral-subtle-active")
    val interactionNeutralSubtleActive: BorderRadius2_Xl,

    @Json(name = "interaction-neutral-subtle-selected")
    val interactionNeutralSubtleSelected: BorderRadius2_Xl
)

data class NonSemantic (
    val gray: Gray,
    val white: White,
    val red: Red,
    val magenta: Magenta,
    val purple: Purple,
    val violet: Violet,
    val blue: Blue,
    val cyan: Cyan,
    val teal: Teal,
    val aquamarine: Aquamarine,
    val green: Green,
    val orange: Orange
)

data class Aquamarine (
    @Json(name = "nonSemantic-aquamarine-content-primary")
    val nonSemanticAquamarineContentPrimary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-aquamarine-content-secondary")
    val nonSemanticAquamarineContentSecondary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-aquamarine-border-default")
    val nonSemanticAquamarineBorderDefault: BorderRadius2_Xl,

    @Json(name = "nonSemantic-aquamarine-border-strong")
    val nonSemanticAquamarineBorderStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-aquamarine-border-subtle")
    val nonSemanticAquamarineBorderSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-aquamarine-background-strong")
    val nonSemanticAquamarineBackgroundStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-aquamarine-background-muted")
    val nonSemanticAquamarineBackgroundMuted: BorderRadius2_Xl,

    @Json(name = "nonSemantic-aquamarine-background-onSubtle")
    val nonSemanticAquamarineBackgroundOnSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-aquamarine-background-subtle")
    val nonSemanticAquamarineBackgroundSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-aquamarine-background-surface")
    val nonSemanticAquamarineBackgroundSurface: BorderRadius2_Xl
)

data class Blue (
    @Json(name = "nonSemantic-blue-content-primary")
    val nonSemanticBlueContentPrimary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-blue-content-secondary")
    val nonSemanticBlueContentSecondary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-blue-border-default")
    val nonSemanticBlueBorderDefault: BorderRadius2_Xl,

    @Json(name = "nonSemantic-blue-border-strong")
    val nonSemanticBlueBorderStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-blue-border-subtle")
    val nonSemanticBlueBorderSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-blue-background-strong")
    val nonSemanticBlueBackgroundStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-blue-background-muted")
    val nonSemanticBlueBackgroundMuted: BorderRadius2_Xl,

    @Json(name = "nonSemantic-blue-background-onSubtle")
    val nonSemanticBlueBackgroundOnSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-blue-background-subtle")
    val nonSemanticBlueBackgroundSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-blue-background-surface")
    val nonSemanticBlueBackgroundSurface: BorderRadius2_Xl
)

data class Cyan (
    @Json(name = "nonSemantic-cyan-content-primary")
    val nonSemanticCyanContentPrimary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-cyan-content-secondary")
    val nonSemanticCyanContentSecondary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-cyan-border-default")
    val nonSemanticCyanBorderDefault: BorderRadius2_Xl,

    @Json(name = "nonSemantic-cyan-border-strong")
    val nonSemanticCyanBorderStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-cyan-border-subtle")
    val nonSemanticCyanBorderSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-cyan-background-strong")
    val nonSemanticCyanBackgroundStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-cyan-background-muted")
    val nonSemanticCyanBackgroundMuted: BorderRadius2_Xl,

    @Json(name = "nonSemantic-cyan-background-onSubtle")
    val nonSemanticCyanBackgroundOnSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-cyan-background-subtle")
    val nonSemanticCyanBackgroundSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-cyan-background-surface")
    val nonSemanticCyanBackgroundSurface: BorderRadius2_Xl
)

data class Gray (
    @Json(name = "nonSemantic-gray-content-primary")
    val nonSemanticGrayContentPrimary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-gray-content-secondary")
    val nonSemanticGrayContentSecondary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-gray-border-default")
    val nonSemanticGrayBorderDefault: BorderRadius2_Xl,

    @Json(name = "nonSemantic-gray-border-strong")
    val nonSemanticGrayBorderStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-gray-border-subtle")
    val nonSemanticGrayBorderSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-gray-background-strong")
    val nonSemanticGrayBackgroundStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-gray-background-muted")
    val nonSemanticGrayBackgroundMuted: BorderRadius2_Xl,

    @Json(name = "nonSemantic-gray-background-onSubtle")
    val nonSemanticGrayBackgroundOnSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-gray-background-subtle")
    val nonSemanticGrayBackgroundSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-gray-background-surface")
    val nonSemanticGrayBackgroundSurface: BorderRadius2_Xl
)

data class Green (
    @Json(name = "nonSemantic-green-content-primary")
    val nonSemanticGreenContentPrimary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-green-content-secondary")
    val nonSemanticGreenContentSecondary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-green-border-default")
    val nonSemanticGreenBorderDefault: BorderRadius2_Xl,

    @Json(name = "nonSemantic-green-border-strong")
    val nonSemanticGreenBorderStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-green-border-subtle")
    val nonSemanticGreenBorderSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-green-background-strong")
    val nonSemanticGreenBackgroundStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-green-background-muted")
    val nonSemanticGreenBackgroundMuted: BorderRadius2_Xl,

    @Json(name = "nonSemantic-green-background-onSubtle")
    val nonSemanticGreenBackgroundOnSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-green-background-subtle")
    val nonSemanticGreenBackgroundSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-green-background-surface")
    val nonSemanticGreenBackgroundSurface: BorderRadius2_Xl
)

data class Magenta (
    @Json(name = "nonSemantic-magenta-content-primary")
    val nonSemanticMagentaContentPrimary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-magenta-content-secondary")
    val nonSemanticMagentaContentSecondary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-magenta-border-default")
    val nonSemanticMagentaBorderDefault: BorderRadius2_Xl,

    @Json(name = "nonSemantic-magenta-border-strong")
    val nonSemanticMagentaBorderStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-magenta-border-subtle")
    val nonSemanticMagentaBorderSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-magenta-background-strong")
    val nonSemanticMagentaBackgroundStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-magenta-background-muted")
    val nonSemanticMagentaBackgroundMuted: BorderRadius2_Xl,

    @Json(name = "nonSemantic-magenta-background-onSubtle")
    val nonSemanticMagentaBackgroundOnSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-magenta-background-subtle")
    val nonSemanticMagentaBackgroundSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-magenta-background-surface")
    val nonSemanticMagentaBackgroundSurface: BorderRadius2_Xl
)

data class Orange (
    @Json(name = "nonSemantic-orange-content-primary")
    val nonSemanticOrangeContentPrimary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-orange-content-secondary")
    val nonSemanticOrangeContentSecondary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-orange-border-default")
    val nonSemanticOrangeBorderDefault: BorderRadius2_Xl,

    @Json(name = "nonSemantic-orange-border-strong")
    val nonSemanticOrangeBorderStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-orange-border-subtle")
    val nonSemanticOrangeBorderSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-orange-background-strong")
    val nonSemanticOrangeBackgroundStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-orange-background-muted")
    val nonSemanticOrangeBackgroundMuted: BorderRadius2_Xl,

    @Json(name = "nonSemantic-orange-background-onSubtle")
    val nonSemanticOrangeBackgroundOnSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-orange-background-subtle")
    val nonSemanticOrangeBackgroundSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-orange-background-surface")
    val nonSemanticOrangeBackgroundSurface: BorderRadius2_Xl
)

data class Purple (
    @Json(name = "nonSemantic-purple-content-primary")
    val nonSemanticPurpleContentPrimary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-purple-content-secondary")
    val nonSemanticPurpleContentSecondary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-purple-border-default")
    val nonSemanticPurpleBorderDefault: BorderRadius2_Xl,

    @Json(name = "nonSemantic-purple-border-strong")
    val nonSemanticPurpleBorderStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-purple-border-subtle")
    val nonSemanticPurpleBorderSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-purple-background-strong")
    val nonSemanticPurpleBackgroundStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-purple-background-muted")
    val nonSemanticPurpleBackgroundMuted: BorderRadius2_Xl,

    @Json(name = "nonSemantic-purple-background-onSubtle")
    val nonSemanticPurpleBackgroundOnSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-purple-background-subtle")
    val nonSemanticPurpleBackgroundSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-purple-background-surface")
    val nonSemanticPurpleBackgroundSurface: BorderRadius2_Xl
)

data class Red (
    @Json(name = "nonSemantic-red-content-primary")
    val nonSemanticRedContentPrimary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-red-content-secondary")
    val nonSemanticRedContentSecondary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-red-border-default")
    val nonSemanticRedBorderDefault: BorderRadius2_Xl,

    @Json(name = "nonSemantic-red-border-strong")
    val nonSemanticRedBorderStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-red-border-subtle")
    val nonSemanticRedBorderSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-red-background-strong")
    val nonSemanticRedBackgroundStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-red-background-muted")
    val nonSemanticRedBackgroundMuted: BorderRadius2_Xl,

    @Json(name = "nonSemantic-red-background-onSubtle")
    val nonSemanticRedBackgroundOnSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-red-background-subtle")
    val nonSemanticRedBackgroundSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-red-background-surface")
    val nonSemanticRedBackgroundSurface: BorderRadius2_Xl
)

data class Teal (
    @Json(name = "nonSemantic-teal-content-primary")
    val nonSemanticTealContentPrimary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-teal-content-secondary")
    val nonSemanticTealContentSecondary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-teal-border-default")
    val nonSemanticTealBorderDefault: BorderRadius2_Xl,

    @Json(name = "nonSemantic-teal-border-strong")
    val nonSemanticTealBorderStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-teal-border-subtle")
    val nonSemanticTealBorderSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-teal-background-strong")
    val nonSemanticTealBackgroundStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-teal-background-muted")
    val nonSemanticTealBackgroundMuted: BorderRadius2_Xl,

    @Json(name = "nonSemantic-teal-background-onSubtle")
    val nonSemanticTealBackgroundOnSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-teal-background-subtle")
    val nonSemanticTealBackgroundSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-teal-background-surface")
    val nonSemanticTealBackgroundSurface: BorderRadius2_Xl
)

data class Violet (
    @Json(name = "nonSemantic-violet-content-primary")
    val nonSemanticVioletContentPrimary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-violet-content-secondary")
    val nonSemanticVioletContentSecondary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-violet-border-default")
    val nonSemanticVioletBorderDefault: BorderRadius2_Xl,

    @Json(name = "nonSemantic-violet-border-strong")
    val nonSemanticVioletBorderStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-violet-border-subtle")
    val nonSemanticVioletBorderSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-violet-background-strong")
    val nonSemanticVioletBackgroundStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-violet-background-muted")
    val nonSemanticVioletBackgroundMuted: BorderRadius2_Xl,

    @Json(name = "nonSemantic-violet-background-onSubtle")
    val nonSemanticVioletBackgroundOnSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-violet-background-subtle")
    val nonSemanticVioletBackgroundSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-violet-background-surface")
    val nonSemanticVioletBackgroundSurface: BorderRadius2_Xl
)

data class White (
    @Json(name = "nonSemantic-white-content-primary")
    val nonSemanticWhiteContentPrimary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-white-content-secondary")
    val nonSemanticWhiteContentSecondary: BorderRadius2_Xl,

    @Json(name = "nonSemantic-white-border-default")
    val nonSemanticWhiteBorderDefault: BorderRadius2_Xl,

    @Json(name = "nonSemantic-white-border-strong")
    val nonSemanticWhiteBorderStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-white-border-subtle")
    val nonSemanticWhiteBorderSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-white-background-strong")
    val nonSemanticWhiteBackgroundStrong: BorderRadius2_Xl,

    @Json(name = "nonSemantic-white-background-muted")
    val nonSemanticWhiteBackgroundMuted: BorderRadius2_Xl,

    @Json(name = "nonSemantic-white-background-onSubtle")
    val nonSemanticWhiteBackgroundOnSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-white-background-subtle")
    val nonSemanticWhiteBackgroundSubtle: BorderRadius2_Xl,

    @Json(name = "nonSemantic-white-background-surface")
    val nonSemanticWhiteBackgroundSurface: BorderRadius2_Xl
)

data class Global (
    val color: GlobalColor,
    val borderRadius: GlobalBorderRadius,
    val borderWidth: GlobalBorderWidth,
    val dimension: Map<String, The0>,
    val opacity: GlobalOpacity,
    val elevation: Elevation,
    val fontFamily: FontFamilyClass,
    val fontSize: Map<String, The0>,
    val fontWeight: FontWeightClass,
    val letterSpacing: LetterSpacing,
    val lineHeight: Map<String, The0>
)

data class GlobalBorderRadius (
    @Json(name = "border-radius-0")
    val borderRadius0: The0,

    @Json(name = "border-radius-25")
    val borderRadius25: The0,

    @Json(name = "border-radius-50")
    val borderRadius50: BorderRadius50,

    @Json(name = "border-radius-100")
    val borderRadius100: The0,

    @Json(name = "border-radius-150")
    val borderRadius150: The0,

    @Json(name = "border-radius-200")
    val borderRadius200: The0,

    @Json(name = "border-radius-250")
    val borderRadius250: The0,

    @Json(name = "border-radius-300")
    val borderRadius300: The0,

    @Json(name = "border-radius-999")
    val borderRadius999: BorderRadius50
)

data class The0 (
    val value: String,
    val type: The0_Type
)

enum class The0_Type(val value: String) {
    BorderRadius("borderRadius"),
    BorderWidth("borderWidth"),
    Color("color"),
    Dimension("dimension"),
    FontFamilies("fontFamilies"),
    FontSizes("fontSizes"),
    LetterSpacing("letterSpacing"),
    LineHeights("lineHeights"),
    Other("other");

    companion object {
        public fun fromValue(value: String): The0_Type = when (value) {
            "borderRadius"  -> BorderRadius
            "borderWidth"   -> BorderWidth
            "color"         -> Color
            "dimension"     -> Dimension
            "fontFamilies"  -> FontFamilies
            "fontSizes"     -> FontSizes
            "letterSpacing" -> LetterSpacing
            "lineHeights"   -> LineHeights
            "other"         -> Other
            else            -> throw IllegalArgumentException()
        }
    }
}

data class BorderRadius50 (
    val value: Double,
    val type: String
)

data class GlobalBorderWidth (
    @Json(name = "border-width-0")
    val borderWidth0: The0,

    @Json(name = "border-width-100")
    val borderWidth100: The0,

    @Json(name = "border-width-200")
    val borderWidth200: The0,

    @Json(name = "border-width-400")
    val borderWidth400: The0,

    @Json(name = "border-width-800")
    val borderWidth800: The0
)

data class GlobalColor (
    val coolGray: Map<String, The0>,
    val coolGrayAlpha: Map<String, The0>,
    val neutralGray: Map<String, The0>,
    val neutralGrayAlpha: Map<String, The0>,
    val warmGray: Map<String, The0>,
    val warmGrayAlpha: Map<String, The0>,
    val whiteAlpha: Map<String, The0>,
    val red: Map<String, The0>,
    val magenta: Map<String, The0>,
    val purple: Map<String, The0>,
    val violet: Map<String, The0>,
    val blue: Map<String, The0>,
    val cyan: Map<String, The0>,
    val teal: Map<String, The0>,
    val aquamarine: Map<String, The0>,
    val green: Map<String, The0>,
    val orange: Map<String, The0>,
    val transparent: Transparent
)

data class Transparent (
    val transparent: The0
)

data class Elevation (
    val bottom: Bottom,
    val top: Top
)

data class Bottom (
    @Json(name = "elevation-bottom-100")
    val elevationBottom100: Elevation100,

    @Json(name = "elevation-bottom-200")
    val elevationBottom200: ElevationBottom200_Class,

    @Json(name = "elevation-bottom-300")
    val elevationBottom300: ElevationBottom200_Class,

    @Json(name = "elevation-bottom-400")
    val elevationBottom400: ElevationBottom200_Class
)

data class Elevation100 (
    val value: ValueElement,
    val type: String,
    val failedToResolve: Boolean
)

data class ValueElement (
    val x: Long,
    val y: Long,
    val blur: Long,
    val spread: Long,
    val color: String,
    val type: ValueType
)

enum class ValueType(val value: String) {
    DropShadow("dropShadow");

    companion object {
        public fun fromValue(value: String): ValueType = when (value) {
            "dropShadow" -> DropShadow
            else         -> throw IllegalArgumentException()
        }
    }
}

data class ElevationBottom200_Class (
    val value: List<ValueElement>,
    val type: String,
    val failedToResolve: Boolean
)

data class Top (
    @Json(name = "elevation-top-100")
    val elevationTop100: Elevation100,

    @Json(name = "elevation-top-200")
    val elevationTop200: ElevationBottom200_Class,

    @Json(name = "elevation-top-300")
    val elevationTop300: ElevationBottom200_Class,

    @Json(name = "elevation-top-400")
    val elevationTop400: ElevationBottom200_Class
)

data class FontFamilyClass (
    @Json(name = "font-family-sans")
    val fontFamilySans: The0,

    @Json(name = "font-family-serif")
    val fontFamilySerif: The0,

    @Json(name = "font-family-mono")
    val fontFamilyMono: The0
)

data class FontWeightClass (
    @Json(name = "font-weight-300")
    val fontWeight300: BorderRadius50,

    @Json(name = "font-weight-400")
    val fontWeight400: BorderRadius50,

    @Json(name = "font-weight-500")
    val fontWeight500: BorderRadius50,

    @Json(name = "font-weight-600")
    val fontWeight600: BorderRadius50,

    @Json(name = "font-weight-700")
    val fontWeight700: BorderRadius50
)

data class LetterSpacing (
    @Json(name = "letterSpacing-0")
    val letterSpacing0: BorderRadius50,

    @Json(name = "letterSpacing-100")
    val letterSpacing100: The0,

    @Json(name = "letterSpacing-200")
    val letterSpacing200: The0,

    @Json(name = "letterSpacing-300")
    val letterSpacing300: The0,

    @Json(name = "letterSpacing-400")
    val letterSpacing400: The0,

    @Json(name = "letterSpacing-500")
    val letterSpacing500: The0,

    @Json(name = "letterSpacing-600")
    val letterSpacing600: The0,

    @Json(name = "letterSpacing-700")
    val letterSpacing700: The0
)

data class GlobalOpacity (
    @Json(name = "opacity-0")
    val opacity0: BorderRadius50,

    @Json(name = "opacity-50")
    val opacity50: BorderRadius50,

    @Json(name = "opacity-100")
    val opacity100: BorderRadius50
)

data class TokenSetOrder (
    @Json(name = "0")
    val the0: The0
)
