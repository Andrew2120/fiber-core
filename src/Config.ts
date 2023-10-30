export const jsonKeyMap = {
  '--': '-negative-',
  '+': '',
  xs: 'xSmall',
  sm: 'small',
  md: 'medium',
  lg: 'large',
  xl: 'xLarge',
};

const convertStringWithUnitPostFixToNumber = (value: string, unitPostFix: string, scalar: number): number => {
  return parseFloat(value.replace(unitPostFix, '')) * scalar;
};

export const mapOfUnits = {
  px: { type: 'number', converter: (value: string) => convertStringWithUnitPostFixToNumber(value, 'px', 1) },
  em: { type: 'number', converter: (value: string) => convertStringWithUnitPostFixToNumber(value, 'em', 1) },
};
